package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.BCStyle;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.jcajce.PKIXCertRevocationChecker;
import org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes5.dex */
class RFC3280CertPathUtilities {
    public static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    private static final Class revChkClass = ClassUtil.loadClass(RFC3280CertPathUtilities.class, "java.security.cert.PKIXRevocationChecker");
    public static final String CERTIFICATE_POLICIES = Extension.certificatePolicies.getId();
    public static final String POLICY_MAPPINGS = Extension.policyMappings.getId();
    public static final String INHIBIT_ANY_POLICY = Extension.inhibitAnyPolicy.getId();
    public static final String ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
    public static final String FRESHEST_CRL = Extension.freshestCRL.getId();
    public static final String DELTA_CRL_INDICATOR = Extension.deltaCRLIndicator.getId();
    public static final String POLICY_CONSTRAINTS = Extension.policyConstraints.getId();
    public static final String BASIC_CONSTRAINTS = Extension.basicConstraints.getId();
    public static final String CRL_DISTRIBUTION_POINTS = Extension.cRLDistributionPoints.getId();
    public static final String SUBJECT_ALTERNATIVE_NAME = Extension.subjectAlternativeName.getId();
    public static final String NAME_CONSTRAINTS = Extension.nameConstraints.getId();
    public static final String AUTHORITY_KEY_IDENTIFIER = Extension.authorityKeyIdentifier.getId();
    public static final String KEY_USAGE = Extension.keyUsage.getId();
    public static final String CRL_NUMBER = Extension.cRLNumber.getId();
    protected static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    RFC3280CertPathUtilities() {
    }

    private static void checkCRL(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, DistributionPoint distributionPoint, PKIXExtendedParameters pKIXExtendedParameters, Date date, Date date2, X509Certificate x509Certificate, X509Certificate x509Certificate2, PublicKey publicKey, CertStatus certStatus, ReasonsMask reasonsMask, List list, JcaJceHelper jcaJceHelper) throws AnnotatedException {
        if (date2.getTime() > date.getTime()) {
            throw new AnnotatedException("Validation time is in future.");
        }
        Iterator it = CertPathValidatorUtilities.getCompleteCRLs(pKIXCertRevocationCheckerParameters, distributionPoint, x509Certificate, pKIXExtendedParameters, date2).iterator();
        boolean z15 = false;
        AnnotatedException e15 = null;
        while (it.hasNext() && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
            try {
                X509CRL x509crl = (X509CRL) it.next();
                ReasonsMask reasonsMaskProcessCRLD = processCRLD(x509crl, distributionPoint);
                if (reasonsMaskProcessCRLD.hasNewReasons(reasonsMask)) {
                    try {
                        X509CRL x509crlProcessCRLH = pKIXExtendedParameters.isUseDeltasEnabled() ? processCRLH(CertPathValidatorUtilities.getDeltaCRLs(date2, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores(), jcaJceHelper), processCRLG(x509crl, processCRLF(x509crl, x509Certificate, x509Certificate2, publicKey, pKIXExtendedParameters, list, jcaJceHelper))) : null;
                        if (pKIXExtendedParameters.getValidityModel() != 1 && x509Certificate.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                            throw new AnnotatedException("No valid CRL for current time found.");
                        }
                        processCRLB1(distributionPoint, x509Certificate, x509crl);
                        processCRLB2(distributionPoint, x509Certificate, x509crl);
                        processCRLC(x509crlProcessCRLH, x509crl, pKIXExtendedParameters);
                        processCRLI(date2, x509crlProcessCRLH, x509Certificate, certStatus, pKIXExtendedParameters);
                        processCRLJ(date2, x509crl, x509Certificate, certStatus);
                        if (certStatus.getCertStatus() == 8) {
                            certStatus.setCertStatus(11);
                        }
                        reasonsMask.addReasons(reasonsMaskProcessCRLD);
                        CertPathValidatorUtilities.checkCRLCriticalExtensions(x509crl, "CRL contains unsupported critical extensions.");
                        if (x509crlProcessCRLH != null) {
                            CertPathValidatorUtilities.checkCRLCriticalExtensions(x509crlProcessCRLH, "Delta CRL contains unsupported critical extensions.");
                        }
                        z15 = true;
                    } catch (AnnotatedException e16) {
                        e15 = e16;
                    }
                } else {
                    continue;
                }
            } catch (AnnotatedException e17) {
                e15 = e17;
            }
        }
        if (!z15) {
            throw e15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    protected static void checkCRLs(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, PKIXExtendedParameters pKIXExtendedParameters, Date date, Date date2, X509Certificate x509Certificate, X509Certificate x509Certificate2, PublicKey publicKey, List list, JcaJceHelper jcaJceHelper) throws AnnotatedException {
        AnnotatedException e15;
        boolean z15;
        int i15;
        int i16;
        DistributionPoint[] distributionPointArr;
        int i17;
        try {
            X509Certificate x509Certificate3 = x509Certificate;
            CRLDistPoint cRLDistPoint = CRLDistPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate3, CRL_DISTRIBUTION_POINTS));
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder(pKIXExtendedParameters);
            try {
                Date date3 = date2;
                JcaJceHelper jcaJceHelper2 = jcaJceHelper;
                Iterator<PKIXCRLStore> it = CertPathValidatorUtilities.getAdditionalStoresFromCRLDistributionPoint(cRLDistPoint, pKIXExtendedParameters.getNamedCRLStoreMap(), date3, jcaJceHelper2).iterator();
                while (it.hasNext()) {
                    builder.addCRLStore(it.next());
                }
                CertStatus certStatus = new CertStatus();
                ReasonsMask reasonsMask = new ReasonsMask();
                PKIXExtendedParameters pKIXExtendedParametersBuild = builder.build();
                int i18 = 11;
                Object obj = null;
                if (cRLDistPoint != null) {
                    try {
                        DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
                        if (distributionPoints != null) {
                            e15 = null;
                            int i19 = 0;
                            z15 = false;
                            while (i19 < distributionPoints.length && certStatus.getCertStatus() == i18 && !reasonsMask.isAllReasons()) {
                                try {
                                    i16 = i18;
                                    distributionPointArr = distributionPoints;
                                    i17 = i19;
                                    try {
                                        checkCRL(pKIXCertRevocationCheckerParameters, distributionPoints[i19], pKIXExtendedParametersBuild, date, date3, x509Certificate3, x509Certificate2, publicKey, certStatus, reasonsMask, list, jcaJceHelper2);
                                        z15 = true;
                                    } catch (AnnotatedException e16) {
                                        e15 = e16;
                                    }
                                } catch (AnnotatedException e17) {
                                    e15 = e17;
                                    i16 = i18;
                                    distributionPointArr = distributionPoints;
                                    i17 = i19;
                                }
                                i19 = i17 + 1;
                                date3 = date2;
                                x509Certificate3 = x509Certificate;
                                jcaJceHelper2 = jcaJceHelper;
                                i18 = i16;
                                distributionPoints = distributionPointArr;
                                obj = null;
                            }
                            i15 = i18;
                        } else {
                            i15 = 11;
                            z15 = false;
                            e15 = null;
                        }
                    } catch (Exception e18) {
                        throw new AnnotatedException("Distribution points could not be read.", e18);
                    }
                } else {
                    i15 = 11;
                    z15 = false;
                    e15 = null;
                }
                if (certStatus.getCertStatus() == i15 && !reasonsMask.isAllReasons()) {
                    try {
                        try {
                            checkCRL(pKIXCertRevocationCheckerParameters, new DistributionPoint(new DistributionPointName(0, new GeneralNames(new GeneralName(4, PrincipalUtils.getIssuerPrincipal(x509Certificate)))), null, null), (PKIXExtendedParameters) pKIXExtendedParameters.clone(), date, date2, x509Certificate, x509Certificate2, publicKey, certStatus, reasonsMask, list, jcaJceHelper);
                            z15 = true;
                        } catch (RuntimeException e19) {
                            throw new AnnotatedException("Issuer from certificate for CRL could not be reencoded.", e19);
                        }
                    } catch (AnnotatedException e25) {
                        e15 = e25;
                    }
                }
                if (!z15) {
                    if (e15 == null) {
                        throw new AnnotatedException("No valid CRL found.", e15);
                    }
                    throw e15;
                }
                if (certStatus.getCertStatus() == i15) {
                    if (!reasonsMask.isAllReasons() && certStatus.getCertStatus() == i15) {
                        certStatus.setCertStatus(12);
                    }
                    if (certStatus.getCertStatus() == 12) {
                        throw new AnnotatedException("Certificate status could not be determined.");
                    }
                    return;
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                throw new AnnotatedException(("Certificate revocation after " + simpleDateFormat.format(certStatus.getRevocationDate())) + ", reason: " + crlReasons[certStatus.getCertStatus()]);
            } catch (AnnotatedException e26) {
                throw new AnnotatedException("No additional CRL locations could be decoded from CRL distribution point extension.", e26);
            }
        } catch (Exception e27) {
            throw new AnnotatedException("CRL distribution point extension could not be read.", e27);
        }
    }

    protected static PKIXPolicyNode prepareCertB(CertPath certPath, int i15, List[] listArr, PKIXPolicyNode pKIXPolicyNode, int i16) throws CertPathValidatorException {
        Set qualifierSet;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i15);
        int size = certificates.size() - i15;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, POLICY_MAPPINGS));
            if (aSN1Sequence != null) {
                HashMap map = new HashMap();
                for (int i17 = 0; i17 < aSN1Sequence.size(); i17++) {
                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(i17);
                    String id5 = ((ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(0)).getId();
                    String id6 = ((ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(1)).getId();
                    HashSet hashSet = (HashSet) map.get(id5);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(id5, hashSet);
                    }
                    hashSet.add(id6);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    HashSet hashSet2 = (HashSet) entry.getValue();
                    if (i16 <= 0) {
                        List list = listArr[size];
                        int size2 = list.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(size2);
                            if (pKIXPolicyNode2.getValidPolicy().equals(str)) {
                                ((PKIXPolicyNode) pKIXPolicyNode2.getParent()).removeChild(pKIXPolicyNode2);
                                list.remove(size2);
                            }
                        }
                        pKIXPolicyNode = CertPathValidatorUtilities.removeChildlessPolicyNodes(pKIXPolicyNode, listArr, size);
                    } else {
                        PKIXPolicyNode pKIXPolicyNodeFindValidPolicy = CertPathValidatorUtilities.findValidPolicy(listArr[size].iterator(), str);
                        if (pKIXPolicyNodeFindValidPolicy != null) {
                            pKIXPolicyNodeFindValidPolicy.setExpectedPolicies(hashSet2);
                        } else {
                            PKIXPolicyNode pKIXPolicyNodeFindValidPolicy2 = CertPathValidatorUtilities.findValidPolicy(listArr[size].iterator(), ANY_POLICY);
                            if (pKIXPolicyNodeFindValidPolicy2 == null) {
                                continue;
                            } else {
                                try {
                                    Enumeration objects = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CERTIFICATE_POLICIES)).getObjects();
                                    while (true) {
                                        if (!objects.hasMoreElements()) {
                                            qualifierSet = null;
                                            break;
                                        }
                                        try {
                                            PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                                            if (ANY_POLICY.equals(policyInformation.getPolicyIdentifier().getId())) {
                                                try {
                                                    qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                                                    break;
                                                } catch (CertPathValidatorException e15) {
                                                    throw new ExtCertPathValidatorException("Policy qualifier info set could not be decoded.", e15, certPath, i15);
                                                }
                                            }
                                        } catch (Exception e16) {
                                            throw new CertPathValidatorException("Policy information could not be decoded.", e16, certPath, i15);
                                        }
                                    }
                                    Set set = qualifierSet;
                                    boolean zHasCriticalExtension = CertPathValidatorUtilities.hasCriticalExtension(x509Certificate, CERTIFICATE_POLICIES);
                                    PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNodeFindValidPolicy2.getParent();
                                    if (ANY_POLICY.equals(pKIXPolicyNode3.getValidPolicy())) {
                                        PKIXPolicyNode pKIXPolicyNode4 = new PKIXPolicyNode(new ArrayList(), size, hashSet2, pKIXPolicyNode3, set, str, zHasCriticalExtension);
                                        pKIXPolicyNode3.addChild(pKIXPolicyNode4);
                                        listArr[size].add(pKIXPolicyNode4);
                                    }
                                } catch (AnnotatedException e17) {
                                    throw new ExtCertPathValidatorException("Certificate policies extension could not be decoded.", e17, certPath, i15);
                                }
                            }
                        }
                    }
                }
            }
            return pKIXPolicyNode;
        } catch (AnnotatedException e18) {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", e18, certPath, i15);
        }
    }

    protected static void prepareNextCertA(CertPath certPath, int i15) throws CertPathValidatorException {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i15), POLICY_MAPPINGS));
            if (aSN1Sequence != null) {
                for (int i16 = 0; i16 < aSN1Sequence.size(); i16++) {
                    try {
                        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i16));
                        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(0));
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(1));
                        if (ANY_POLICY.equals(aSN1ObjectIdentifier.getId())) {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certPath, i15);
                        }
                        if (ANY_POLICY.equals(aSN1ObjectIdentifier2.getId())) {
                            throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy", null, certPath, i15);
                        }
                    } catch (Exception e15) {
                        throw new ExtCertPathValidatorException("Policy mappings extension contents could not be decoded.", e15, certPath, i15);
                    }
                }
            }
        } catch (AnnotatedException e16) {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", e16, certPath, i15);
        }
    }

    protected static void prepareNextCertG(CertPath certPath, int i15, PKIXNameConstraintValidator pKIXNameConstraintValidator) throws ExtCertPathValidatorException {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i15), NAME_CONSTRAINTS));
            NameConstraints nameConstraints = aSN1Sequence != null ? NameConstraints.getInstance(aSN1Sequence) : null;
            if (nameConstraints != null) {
                GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                if (permittedSubtrees != null) {
                    try {
                        pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                    } catch (Exception e15) {
                        throw new ExtCertPathValidatorException("Permitted subtrees cannot be build from name constraints extension.", e15, certPath, i15);
                    }
                }
                GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                if (excludedSubtrees != null) {
                    for (int i16 = 0; i16 != excludedSubtrees.length; i16++) {
                        try {
                            pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i16]);
                        } catch (Exception e16) {
                            throw new ExtCertPathValidatorException("Excluded subtrees cannot be build from name constraints extension.", e16, certPath, i15);
                        }
                    }
                }
            }
        } catch (Exception e17) {
            throw new ExtCertPathValidatorException("Name constraints extension could not be decoded.", e17, certPath, i15);
        }
    }

    protected static int prepareNextCertH1(CertPath certPath, int i15, int i16) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i15)) || i16 == 0) ? i16 : i16 - 1;
    }

    protected static int prepareNextCertH2(CertPath certPath, int i15, int i16) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i15)) || i16 == 0) ? i16 : i16 - 1;
    }

    protected static int prepareNextCertH3(CertPath certPath, int i15, int i16) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i15)) || i16 == 0) ? i16 : i16 - 1;
    }

    protected static int prepareNextCertI1(CertPath certPath, int i15, int i16) throws ExtCertPathValidatorException {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i15), POLICY_CONSTRAINTS));
            if (aSN1Sequence != null) {
                Enumeration objects = aSN1Sequence.getObjects();
                while (objects.hasMoreElements()) {
                    try {
                        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
                        if (aSN1TaggedObject.getTagNo() == 0) {
                            int iIntValueExact = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                            if (iIntValueExact < i16) {
                                return iIntValueExact;
                            }
                        }
                    } catch (IllegalArgumentException e15) {
                        throw new ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", e15, certPath, i15);
                    }
                }
            }
            return i16;
        } catch (Exception e16) {
            throw new ExtCertPathValidatorException("Policy constraints extension cannot be decoded.", e16, certPath, i15);
        }
    }

    protected static int prepareNextCertI2(CertPath certPath, int i15, int i16) throws ExtCertPathValidatorException {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i15), POLICY_CONSTRAINTS));
            if (aSN1Sequence != null) {
                Enumeration objects = aSN1Sequence.getObjects();
                while (objects.hasMoreElements()) {
                    try {
                        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
                        if (aSN1TaggedObject.getTagNo() == 1) {
                            int iIntValueExact = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                            if (iIntValueExact < i16) {
                                return iIntValueExact;
                            }
                        }
                    } catch (IllegalArgumentException e15) {
                        throw new ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", e15, certPath, i15);
                    }
                }
            }
            return i16;
        } catch (Exception e16) {
            throw new ExtCertPathValidatorException("Policy constraints extension cannot be decoded.", e16, certPath, i15);
        }
    }

    protected static int prepareNextCertJ(CertPath certPath, int i15, int i16) throws ExtCertPathValidatorException {
        int iIntValueExact;
        try {
            ASN1Integer aSN1Integer = ASN1Integer.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i15), INHIBIT_ANY_POLICY));
            return (aSN1Integer == null || (iIntValueExact = aSN1Integer.intValueExact()) >= i16) ? i16 : iIntValueExact;
        } catch (Exception e15) {
            throw new ExtCertPathValidatorException("Inhibit any-policy extension cannot be decoded.", e15, certPath, i15);
        }
    }

    protected static void prepareNextCertK(CertPath certPath, int i15) throws CertPathValidatorException {
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i15), BASIC_CONSTRAINTS));
            if (basicConstraints == null) {
                throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints", null, certPath, i15);
            }
            if (!basicConstraints.isCA()) {
                throw new CertPathValidatorException("Not a CA certificate", null, certPath, i15);
            }
        } catch (Exception e15) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e15, certPath, i15);
        }
    }

    protected static int prepareNextCertL(CertPath certPath, int i15, int i16) throws ExtCertPathValidatorException {
        if (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i15))) {
            return i16;
        }
        if (i16 > 0) {
            return i16 - 1;
        }
        throw new ExtCertPathValidatorException("Max path length not greater than zero", null, certPath, i15);
    }

    protected static int prepareNextCertM(CertPath certPath, int i15, int i16) throws ExtCertPathValidatorException {
        ASN1Integer pathLenConstraintInteger;
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i15), BASIC_CONSTRAINTS));
            return (basicConstraints == null || !basicConstraints.isCA() || (pathLenConstraintInteger = basicConstraints.getPathLenConstraintInteger()) == null) ? i16 : Math.min(i16, pathLenConstraintInteger.intPositiveValueExact());
        } catch (Exception e15) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e15, certPath, i15);
        }
    }

    protected static void prepareNextCertN(CertPath certPath, int i15) throws ExtCertPathValidatorException {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i15)).getKeyUsage();
        if (keyUsage != null) {
            if (keyUsage.length <= 5 || !keyUsage[5]) {
                throw new ExtCertPathValidatorException("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certPath, i15);
            }
        }
    }

    protected static void prepareNextCertO(CertPath certPath, int i15, Set set, List list) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i15);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e15) {
                throw new CertPathValidatorException(e15.getMessage(), e15.getCause(), certPath, i15);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i15);
    }

    protected static void processCRLB1(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) throws AnnotatedException {
        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
        boolean z15 = true;
        boolean z16 = extensionValue != null && IssuingDistributionPoint.getInstance(extensionValue).isIndirectCRL();
        try {
            byte[] encoded = PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded();
            if (distributionPoint.getCRLIssuer() != null) {
                GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                boolean z17 = false;
                for (int i15 = 0; i15 < names.length; i15++) {
                    if (names[i15].getTagNo() == 4) {
                        try {
                            if (Arrays.areEqual(names[i15].getName().toASN1Primitive().getEncoded(), encoded)) {
                                z17 = true;
                            }
                        } catch (IOException e15) {
                            throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e15);
                        }
                    }
                }
                if (z17 && !z16) {
                    throw new AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect.");
                }
                if (!z17) {
                    throw new AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point.");
                }
                z15 = z17;
            } else if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getEncodedIssuerPrincipal(obj))) {
                z15 = false;
            }
            if (!z15) {
                throw new AnnotatedException("Cannot find matching CRL issuer for certificate.");
            }
        } catch (IOException e16) {
            throw new AnnotatedException("Exception encoding CRL issuer: " + e16.getMessage(), e16);
        }
    }

    protected static void processCRLB2(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) throws AnnotatedException {
        GeneralName[] names;
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (issuingDistributionPoint != null) {
                if (issuingDistributionPoint.getDistributionPoint() == null) {
                    break;
                }
                DistributionPointName distributionPoint2 = IssuingDistributionPoint.getInstance(issuingDistributionPoint).getDistributionPoint();
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                if (distributionPoint2.getType() == 0) {
                    for (GeneralName generalName : GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                        arrayList.add(generalName);
                    }
                }
                if (distributionPoint2.getType() == 1) {
                    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                    try {
                        Enumeration objects = ASN1Sequence.getInstance(PrincipalUtils.getIssuerPrincipal(x509crl)).getObjects();
                        while (objects.hasMoreElements()) {
                            aSN1EncodableVector.add((ASN1Encodable) objects.nextElement());
                        }
                        aSN1EncodableVector.add(distributionPoint2.getName());
                        arrayList.add(new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector))));
                    } catch (Exception e15) {
                        throw new AnnotatedException("Could not read CRL issuer.", e15);
                    }
                }
                if (distributionPoint.getDistributionPoint() != null) {
                    DistributionPointName distributionPoint3 = distributionPoint.getDistributionPoint();
                    GeneralName[] names2 = distributionPoint3.getType() == 0 ? GeneralNames.getInstance(distributionPoint3.getName()).getNames() : null;
                    if (distributionPoint3.getType() == 1) {
                        if (distributionPoint.getCRLIssuer() != null) {
                            names = distributionPoint.getCRLIssuer().getNames();
                        } else {
                            names = new GeneralName[1];
                            try {
                                names[0] = new GeneralName(PrincipalUtils.getEncodedIssuerPrincipal(obj));
                            } catch (Exception e16) {
                                throw new AnnotatedException("Could not read certificate issuer.", e16);
                            }
                        }
                        names2 = names;
                        for (int i16 = 0; i16 < names2.length; i16++) {
                            Enumeration objects2 = ASN1Sequence.getInstance(names2[i16].getName().toASN1Primitive()).getObjects();
                            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                            while (objects2.hasMoreElements()) {
                                aSN1EncodableVector2.add((ASN1Encodable) objects2.nextElement());
                            }
                            aSN1EncodableVector2.add(distributionPoint3.getName());
                            names2[i16] = new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector2)));
                        }
                    }
                    if (names2 != null) {
                        while (true) {
                            if (i15 < names2.length) {
                                if (arrayList.contains(names2[i15])) {
                                    break;
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                    throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                }
                if (distributionPoint.getCRLIssuer() == null) {
                    throw new AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                }
                GeneralName[] names3 = distributionPoint.getCRLIssuer().getNames();
                while (true) {
                    if (i15 >= names3.length) {
                        throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                    }
                    if (arrayList.contains(names3[i15])) {
                        break;
                    } else {
                        i15++;
                    }
                }
                try {
                    BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Extension) obj, BASIC_CONSTRAINTS));
                    if (obj instanceof X509Certificate) {
                        if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                            throw new AnnotatedException("CA Cert CRL only contains user certificates.");
                        }
                        if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                            throw new AnnotatedException("End CRL only contains CA certificates.");
                        }
                    }
                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                        throw new AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
                    }
                } catch (Exception e17) {
                    throw new AnnotatedException("Basic constraints extension could not be decoded.", e17);
                }
            }
        } catch (Exception e18) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e18);
        }
    }

    protected static void processCRLC(X509CRL x509crl, X509CRL x509crl2, PKIXExtendedParameters pKIXExtendedParameters) throws AnnotatedException {
        if (x509crl == null) {
            return;
        }
        if (x509crl.hasUnsupportedCriticalExtension()) {
            throw new AnnotatedException("delta CRL has unsupported critical extensions");
        }
        try {
            String str = ISSUING_DISTRIBUTION_POINT;
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl2, str));
            if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getIssuerPrincipal(x509crl2))) {
                    throw new AnnotatedException("Complete CRL issuer does not match delta CRL issuer.");
                }
                try {
                    IssuingDistributionPoint issuingDistributionPoint2 = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, str));
                    if (issuingDistributionPoint != null ? !issuingDistributionPoint.equals(issuingDistributionPoint2) : issuingDistributionPoint2 != null) {
                        throw new AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                    }
                    try {
                        String str2 = AUTHORITY_KEY_IDENTIFIER;
                        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl2, str2);
                        try {
                            ASN1Primitive extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl, str2);
                            if (extensionValue == null) {
                                throw new AnnotatedException("CRL authority key identifier is null.");
                            }
                            if (extensionValue2 == null) {
                                throw new AnnotatedException("Delta CRL authority key identifier is null.");
                            }
                            if (!extensionValue.equals(extensionValue2)) {
                                throw new AnnotatedException("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                            }
                        } catch (AnnotatedException e15) {
                            throw new AnnotatedException("Authority key identifier extension could not be extracted from delta CRL.", e15);
                        }
                    } catch (AnnotatedException e16) {
                        throw new AnnotatedException("Authority key identifier extension could not be extracted from complete CRL.", e16);
                    }
                } catch (Exception e17) {
                    throw new AnnotatedException("Issuing distribution point extension from delta CRL could not be decoded.", e17);
                }
            }
        } catch (Exception e18) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e18);
        }
    }

    protected static ReasonsMask processCRLD(X509CRL x509crl, DistributionPoint distributionPoint) throws AnnotatedException {
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (issuingDistributionPoint != null && issuingDistributionPoint.getOnlySomeReasons() != null && distributionPoint.getReasons() != null) {
                return new ReasonsMask(distributionPoint.getReasons()).intersect(new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
            }
            if ((issuingDistributionPoint == null || issuingDistributionPoint.getOnlySomeReasons() == null) && distributionPoint.getReasons() == null) {
                return ReasonsMask.allReasons;
            }
            return (distributionPoint.getReasons() == null ? ReasonsMask.allReasons : new ReasonsMask(distributionPoint.getReasons())).intersect(issuingDistributionPoint == null ? ReasonsMask.allReasons : new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
        } catch (Exception e15) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ef  */
    protected static Set processCRLF(X509CRL x509crl, Object obj, X509Certificate x509Certificate, PublicKey publicKey, PKIXExtendedParameters pKIXExtendedParameters, List list, JcaJceHelper jcaJceHelper) throws AnnotatedException {
        int i15;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            PKIXCertStoreSelector<? extends Certificate> pKIXCertStoreSelectorBuild = new PKIXCertStoreSelector.Builder(x509CertSelector).build();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                CertPathValidatorUtilities.findCertificates(linkedHashSet, pKIXCertStoreSelectorBuild, pKIXExtendedParameters.getCertificateStores());
                CertPathValidatorUtilities.findCertificates(linkedHashSet, pKIXCertStoreSelectorBuild, pKIXExtendedParameters.getCertStores());
                linkedHashSet.add(x509Certificate);
                Iterator it = linkedHashSet.iterator();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            CertPathBuilderSpi pKIXCertPathBuilderSpi_8 = revChkClass != null ? new PKIXCertPathBuilderSpi_8(true) : new PKIXCertPathBuilderSpi(true);
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            PKIXExtendedParameters.Builder targetConstraints = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTargetConstraints(new PKIXCertStoreSelector.Builder(x509CertSelector2).build());
                            if (list.contains(x509Certificate2)) {
                                targetConstraints.setRevocationEnabled(false);
                            } else {
                                targetConstraints.setRevocationEnabled(true);
                            }
                            List<? extends Certificate> certificates = pKIXCertPathBuilderSpi_8.engineBuild(new PKIXExtendedBuilderParameters.Builder(targetConstraints.build()).build()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(CertPathValidatorUtilities.getNextWorkingKey(certificates, 0, jcaJceHelper));
                        } catch (CertPathBuilderException e15) {
                            throw new AnnotatedException("CertPath for CRL signer failed to validate.", e15);
                        } catch (CertPathValidatorException e16) {
                            throw new AnnotatedException("Public key of issuer certificate of CRL could not be retrieved.", e16);
                        } catch (Exception e17) {
                            throw new AnnotatedException(e17.getMessage());
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                AnnotatedException annotatedException = null;
                for (i15 = 0; i15 < arrayList.size(); i15++) {
                    boolean[] keyUsage = ((X509Certificate) arrayList.get(i15)).getKeyUsage();
                    if (keyUsage == null) {
                        if (Properties.isOverrideSet("org.bouncycastle.x509.allow_ca_without_crl_sign", true)) {
                            hashSet.add(arrayList2.get(i15));
                        } else {
                            annotatedException = new AnnotatedException("No key usage extension on CRL issuer certificate.");
                        }
                    } else if (keyUsage.length <= 6 || !keyUsage[6]) {
                        annotatedException = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
                    } else {
                        hashSet.add(arrayList2.get(i15));
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    throw new AnnotatedException("Cannot find a valid issuer certificate.");
                }
                if (!hashSet.isEmpty() || annotatedException == null) {
                    return hashSet;
                }
                throw annotatedException;
            } catch (AnnotatedException e18) {
                throw new AnnotatedException("Issuer certificate for CRL cannot be searched.", e18);
            }
        } catch (IOException e19) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", e19);
        }
    }

    protected static PublicKey processCRLG(X509CRL x509crl, Set set) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e15 = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e16) {
                e15 = e16;
            }
        }
        throw new AnnotatedException("Cannot verify CRL.", e15);
    }

    protected static X509CRL processCRLH(Set set, PublicKey publicKey) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e15 = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e16) {
                e15 = e16;
            }
        }
        if (e15 == null) {
            return null;
        }
        throw new AnnotatedException("Cannot verify delta CRL.", e15);
    }

    protected static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certStatus, PKIXExtendedParameters pKIXExtendedParameters) throws AnnotatedException {
        if (!pKIXExtendedParameters.isUseDeltasEnabled() || x509crl == null) {
            return;
        }
        CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
    }

    protected static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        if (certStatus.getCertStatus() == 11) {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
        }
    }

    protected static void processCertA(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, Date date, PKIXCertRevocationChecker pKIXCertRevocationChecker, int i15, PublicKey publicKey, boolean z15, X500Name x500Name, X509Certificate x509Certificate) throws ExtCertPathValidatorException {
        X509Certificate x509Certificate2 = (X509Certificate) certPath.getCertificates().get(i15);
        if (!z15) {
            try {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, publicKey, pKIXExtendedParameters.getSigProvider());
            } catch (GeneralSecurityException e15) {
                throw new ExtCertPathValidatorException("Could not validate certificate signature.", e15, certPath, i15);
            }
        }
        try {
            Date validCertDateFromValidityModel = CertPathValidatorUtilities.getValidCertDateFromValidityModel(date, pKIXExtendedParameters.getValidityModel(), certPath, i15);
            try {
                x509Certificate2.checkValidity(validCertDateFromValidityModel);
                if (pKIXCertRevocationChecker != null) {
                    pKIXCertRevocationChecker.initialize(new PKIXCertRevocationCheckerParameters(pKIXExtendedParameters, validCertDateFromValidityModel, certPath, i15, x509Certificate, publicKey));
                    pKIXCertRevocationChecker.check(x509Certificate2);
                }
                X500Name issuerPrincipal = PrincipalUtils.getIssuerPrincipal(x509Certificate2);
                if (issuerPrincipal.equals(x500Name)) {
                    return;
                }
                throw new ExtCertPathValidatorException("IssuerName(" + issuerPrincipal + ") does not match SubjectName(" + x500Name + ") of signing certificate.", null, certPath, i15);
            } catch (CertificateExpiredException e16) {
                throw new ExtCertPathValidatorException("Could not validate certificate: " + e16.getMessage(), e16, certPath, i15);
            } catch (CertificateNotYetValidException e17) {
                throw new ExtCertPathValidatorException("Could not validate certificate: " + e17.getMessage(), e17, certPath, i15);
            }
        } catch (AnnotatedException e18) {
            throw new ExtCertPathValidatorException("Could not validate time of certificate.", e18, certPath, i15);
        }
    }

    protected static void processCertBC(CertPath certPath, int i15, PKIXNameConstraintValidator pKIXNameConstraintValidator, boolean z15) throws CertPathValidatorException {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i15);
        int size = certificates.size();
        int i16 = size - i15;
        if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate) || (i16 >= size && !z15)) {
            try {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(PrincipalUtils.getSubjectPrincipal(x509Certificate));
                try {
                    pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                    pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                    try {
                        GeneralNames generalNames = GeneralNames.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME));
                        RDN[] rDNs = X500Name.getInstance(aSN1Sequence).getRDNs(BCStyle.EmailAddress);
                        for (int i17 = 0; i17 != rDNs.length; i17++) {
                            GeneralName generalName = new GeneralName(1, ((ASN1String) rDNs[i17].getFirst().getValue()).getString());
                            try {
                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                pKIXNameConstraintValidator.checkExcluded(generalName);
                            } catch (PKIXNameConstraintValidatorException e15) {
                                throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e15, certPath, i15);
                            }
                        }
                        if (generalNames != null) {
                            try {
                                GeneralName[] names = generalNames.getNames();
                                for (int i18 = 0; i18 < names.length; i18++) {
                                    try {
                                        pKIXNameConstraintValidator.checkPermitted(names[i18]);
                                        pKIXNameConstraintValidator.checkExcluded(names[i18]);
                                    } catch (PKIXNameConstraintValidatorException e16) {
                                        throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e16, certPath, i15);
                                    }
                                }
                            } catch (Exception e17) {
                                throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e17, certPath, i15);
                            }
                        }
                    } catch (Exception e18) {
                        throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e18, certPath, i15);
                    }
                } catch (PKIXNameConstraintValidatorException e19) {
                    throw new CertPathValidatorException("Subtree check for certificate subject failed.", e19, certPath, i15);
                }
            } catch (Exception e25) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e25, certPath, i15);
            }
        }
    }

    protected static PKIXPolicyNode processCertD(CertPath certPath, int i15, Set set, PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i16, boolean z15) throws ExtCertPathValidatorException {
        String id5;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i15);
        int size = certificates.size();
        int i17 = size - i15;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CERTIFICATE_POLICIES));
            if (aSN1Sequence == null || pKIXPolicyNode == null) {
                return null;
            }
            Enumeration objects = aSN1Sequence.getObjects();
            HashSet hashSet = new HashSet();
            while (objects.hasMoreElements()) {
                PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                hashSet.add(policyIdentifier.getId());
                if (!ANY_POLICY.equals(policyIdentifier.getId())) {
                    try {
                        Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                        if (!CertPathValidatorUtilities.processCertD1i(i17, listArr, policyIdentifier, qualifierSet)) {
                            CertPathValidatorUtilities.processCertD1ii(i17, listArr, policyIdentifier, qualifierSet);
                        }
                    } catch (CertPathValidatorException e15) {
                        throw new ExtCertPathValidatorException("Policy qualifier info set could not be build.", e15, certPath, i15);
                    }
                }
            }
            if (set.isEmpty() || set.contains(ANY_POLICY)) {
                set.clear();
                set.addAll(hashSet);
            } else {
                HashSet hashSet2 = new HashSet();
                for (Object obj : set) {
                    if (hashSet.contains(obj)) {
                        hashSet2.add(obj);
                    }
                }
                set.clear();
                set.addAll(hashSet2);
            }
            if (i16 > 0 || ((i17 < size || z15) && CertPathValidatorUtilities.isSelfIssued(x509Certificate))) {
                Enumeration objects2 = aSN1Sequence.getObjects();
                while (objects2.hasMoreElements()) {
                    PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                    if (ANY_POLICY.equals(policyInformation2.getPolicyIdentifier().getId())) {
                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(policyInformation2.getPolicyQualifiers());
                        List list = listArr[i17 - 1];
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i18);
                            for (Object obj2 : pKIXPolicyNode2.getExpectedPolicies()) {
                                if (obj2 instanceof String) {
                                    id5 = (String) obj2;
                                } else if (obj2 instanceof ASN1ObjectIdentifier) {
                                    id5 = ((ASN1ObjectIdentifier) obj2).getId();
                                }
                                String str = id5;
                                if (CertPathValidatorUtilities.findValidPolicy(pKIXPolicyNode2.getChildren(), str) == null) {
                                    HashSet hashSet3 = new HashSet();
                                    hashSet3.add(str);
                                    PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), i17, hashSet3, pKIXPolicyNode2, qualifierSet2, str, false);
                                    pKIXPolicyNode2.addChild(pKIXPolicyNode3);
                                    listArr[i17].add(pKIXPolicyNode3);
                                }
                            }
                        }
                        break;
                    }
                }
            }
            PKIXPolicyNode pKIXPolicyNodeRemoveChildlessPolicyNodes = CertPathValidatorUtilities.removeChildlessPolicyNodes(pKIXPolicyNode, listArr, i17);
            if (CertPathValidatorUtilities.hasCriticalExtension(x509Certificate, CERTIFICATE_POLICIES)) {
                List list2 = listArr[i17];
                for (int i19 = 0; i19 < list2.size(); i19++) {
                    ((PKIXPolicyNode) list2.get(i19)).setCritical(true);
                }
            }
            return pKIXPolicyNodeRemoveChildlessPolicyNodes;
        } catch (AnnotatedException e16) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e16, certPath, i15);
        }
    }

    protected static PKIXPolicyNode processCertE(CertPath certPath, int i15, PKIXPolicyNode pKIXPolicyNode) throws ExtCertPathValidatorException {
        try {
            if (ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i15), CERTIFICATE_POLICIES)) == null) {
                return null;
            }
            return pKIXPolicyNode;
        } catch (AnnotatedException e15) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e15, certPath, i15);
        }
    }

    protected static void processCertF(CertPath certPath, int i15, PKIXPolicyNode pKIXPolicyNode, int i16) throws ExtCertPathValidatorException {
        if (i16 <= 0 && pKIXPolicyNode == null) {
            throw new ExtCertPathValidatorException("No valid policy tree found when one expected.", null, certPath, i15);
        }
    }

    protected static int wrapupCertA(int i15, X509Certificate x509Certificate) {
        return (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i15 == 0) ? i15 : i15 - 1;
    }

    protected static int wrapupCertB(CertPath certPath, int i15, int i16) throws ExtCertPathValidatorException {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i15), POLICY_CONSTRAINTS));
            if (aSN1Sequence != null) {
                Enumeration objects = aSN1Sequence.getObjects();
                while (objects.hasMoreElements()) {
                    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
                    if (aSN1TaggedObject.getTagNo() == 0) {
                        try {
                            if (ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact() == 0) {
                                return 0;
                            }
                        } catch (Exception e15) {
                            throw new ExtCertPathValidatorException("Policy constraints requireExplicitPolicy field could not be decoded.", e15, certPath, i15);
                        }
                    }
                }
            }
            return i16;
        } catch (AnnotatedException e16) {
            throw new ExtCertPathValidatorException("Policy constraints could not be decoded.", e16, certPath, i15);
        }
    }

    protected static void wrapupCertF(CertPath certPath, int i15, List list, Set set) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i15);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e15) {
                throw new ExtCertPathValidatorException(e15.getMessage(), e15, certPath, i15);
            } catch (Exception e16) {
                throw new CertPathValidatorException("Additional certificate path checker failed.", e16, certPath, i15);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i15);
    }

    protected static PKIXPolicyNode wrapupCertG(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, Set set, int i15, List[] listArr, PKIXPolicyNode pKIXPolicyNode, Set set2) throws ExtCertPathValidatorException {
        int size = certPath.getCertificates().size();
        if (pKIXPolicyNode == null) {
            if (pKIXExtendedParameters.isExplicitPolicyRequired()) {
                throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i15);
            }
            return null;
        }
        if (CertPathValidatorUtilities.isAnyPolicy(set)) {
            if (!pKIXExtendedParameters.isExplicitPolicyRequired()) {
                return pKIXPolicyNode;
            }
            if (set2.isEmpty()) {
                throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i15);
            }
            HashSet hashSet = new HashSet();
            for (List list : listArr) {
                for (int i16 = 0; i16 < list.size(); i16++) {
                    PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i16);
                    if (ANY_POLICY.equals(pKIXPolicyNode2.getValidPolicy())) {
                        Iterator children = pKIXPolicyNode2.getChildren();
                        while (children.hasNext()) {
                            hashSet.add(children.next());
                        }
                    }
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                set2.contains(((PKIXPolicyNode) it.next()).getValidPolicy());
            }
            return CertPathValidatorUtilities.removeChildlessPolicyNodes(pKIXPolicyNode, listArr, size);
        }
        HashSet<PKIXPolicyNode> hashSet2 = new HashSet();
        for (List list2 : listArr) {
            for (int i17 = 0; i17 < list2.size(); i17++) {
                PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) list2.get(i17);
                if (ANY_POLICY.equals(pKIXPolicyNode3.getValidPolicy())) {
                    Iterator children2 = pKIXPolicyNode3.getChildren();
                    while (children2.hasNext()) {
                        PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) children2.next();
                        if (!ANY_POLICY.equals(pKIXPolicyNode4.getValidPolicy())) {
                            hashSet2.add(pKIXPolicyNode4);
                        }
                    }
                }
            }
        }
        for (PKIXPolicyNode pKIXPolicyNode5 : hashSet2) {
            if (!set.contains(pKIXPolicyNode5.getValidPolicy())) {
                pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode5);
            }
        }
        return CertPathValidatorUtilities.removeChildlessPolicyNodes(pKIXPolicyNode, listArr, size);
    }
}
