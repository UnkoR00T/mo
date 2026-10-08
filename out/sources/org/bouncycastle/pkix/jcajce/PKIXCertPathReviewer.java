package org.bouncycastle.pkix.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
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
import org.bouncycastle.asn1.x509.qualified.ETSIQCObjectIdentifiers;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.asn1.x509.qualified.RFC3739QCObjectIdentifiers;
import org.bouncycastle.cert.jcajce.JcaX509ExtensionUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pkix.PKIXNameConstraintValidator;
import org.bouncycastle.pkix.PKIXNameConstraintValidatorException;
import org.bouncycastle.pkix.util.ErrorBundle;
import org.bouncycastle.pkix.util.LocaleString;
import org.bouncycastle.pkix.util.filter.TrustedInput;
import org.bouncycastle.pkix.util.filter.UntrustedInput;
import org.bouncycastle.pkix.util.filter.UntrustedUrlInput;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    private static final int NAME_CHECK_MAX = 1024;
    private static final String RESOURCE_NAME = "org.bouncycastle.pkix.CertPathReviewerMessages";
    protected CertPath certPath;
    protected List certs;
    protected Date currentDate;
    protected List[] errors;
    private boolean initialized;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f149409n;
    protected List[] notifications;
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;
    private static final String QC_STATEMENT = Extension.qCStatements.getId();
    private static final String CRL_DIST_POINTS = Extension.cRLDistributionPoints.getId();
    private static final String AUTH_INFO_ACCESS = Extension.authorityInfoAccess.getId();

    public PKIXCertPathReviewer() {
    }

    private String IPtoString(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuilder sb5 = new StringBuilder();
            for (int i15 = 0; i15 != bArr.length; i15++) {
                sb5.append(Integer.toHexString(bArr[i15] & 255));
                sb5.append(' ');
            }
            return sb5.toString();
        }
    }

    private void checkCriticalExtensions() {
        List<PKIXCertPathChecker> certPathCheckers = this.pkixParams.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> it = certPathCheckers.iterator();
        while (it.hasNext()) {
            try {
                try {
                    it.next().init(false);
                } catch (CertPathValidatorException e15) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.certPathCheckerError", new Object[]{e15.getMessage(), e15, e15.getClass().getName()}), e15);
                }
            } catch (CertPathReviewerException e16) {
                addError(e16.getErrorMessage(), e16.getIndex());
                return;
            }
        }
        for (int size = this.certs.size() - 1; size >= 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.KEY_USAGE);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_MAPPINGS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.BASIC_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.NAME_CONSTRAINTS);
                if (size == 0) {
                    criticalExtensionOIDs.remove(Extension.extendedKeyUsage.getId());
                }
                String str = QC_STATEMENT;
                if (criticalExtensionOIDs.contains(str) && processQcStatements(x509Certificate, size)) {
                    criticalExtensionOIDs.remove(str);
                }
                Iterator<PKIXCertPathChecker> it4 = certPathCheckers.iterator();
                while (it4.hasNext()) {
                    try {
                        it4.next().check(x509Certificate, criticalExtensionOIDs);
                    } catch (CertPathValidatorException e17) {
                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.criticalExtensionError", new Object[]{e17.getMessage(), e17, e17.getClass().getName()}), e17.getCause(), this.certPath, size);
                    }
                }
                if (!criticalExtensionOIDs.isEmpty()) {
                    Iterator<String> it5 = criticalExtensionOIDs.iterator();
                    while (it5.hasNext()) {
                        addError(createErrorBundle("CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it5.next())}), size);
                    }
                }
            }
        }
    }

    private void checkNameConstraints() {
        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
        try {
            for (int size = this.certs.size() - 1; size > 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
                if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                    X500Principal subjectPrincipal = CertPathValidatorUtilities.getSubjectPrincipal(x509Certificate);
                    try {
                        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        try {
                            pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                            try {
                                pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                                try {
                                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    if (aSN1Sequence2 != null) {
                                        if (aSN1Sequence2.size() > 1024) {
                                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.subjAltNameExtError"), this.certPath, size);
                                        }
                                        for (int i15 = 0; i15 < aSN1Sequence2.size(); i15++) {
                                            GeneralName generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i15));
                                            try {
                                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                                pKIXNameConstraintValidator.checkExcluded(generalName);
                                            } catch (PKIXNameConstraintValidatorException e15) {
                                                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(generalName)}), e15, this.certPath, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e16) {
                                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.subjAltNameExtError"), e16, this.certPath, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e17) {
                                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e17, this.certPath, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e18) {
                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e18, this.certPath, size);
                        }
                    } catch (IOException e19) {
                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e19, this.certPath, size);
                    }
                }
                try {
                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.NAME_CONSTRAINTS);
                    if (aSN1Sequence3 != null) {
                        NameConstraints nameConstraints = NameConstraints.getInstance(aSN1Sequence3);
                        GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                        }
                        GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            for (int i16 = 0; i16 != excludedSubtrees.length; i16++) {
                                pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i16]);
                            }
                        }
                    }
                } catch (AnnotatedException e25) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.ncExtError"), e25, this.certPath, size);
                }
            }
        } catch (CertPathReviewerException e26) {
            addError(e26.getErrorMessage(), e26.getIndex());
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        ASN1Integer pathLenConstraintInteger;
        int iMin = this.f149409n;
        int i15 = 0;
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                if (iMin <= 0) {
                    addError(createErrorBundle("CertPathReviewer.pathLengthExtended"));
                }
                iMin--;
                i15++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(createErrorBundle("CertPathReviewer.processLengthConstError"), size);
                basicConstraints = null;
            }
            if (basicConstraints != null && basicConstraints.isCA() && (pathLenConstraintInteger = basicConstraints.getPathLenConstraintInteger()) != null) {
                iMin = Math.min(iMin, pathLenConstraintInteger.intPositiveValueExact());
            }
        }
        addNotification(createErrorBundle("CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i15)}));
    }

    private void checkPolicy() {
        PKIXPolicyNode pKIXPolicyNode;
        String str;
        ASN1Sequence aSN1Sequence;
        int iIntValueExact;
        int iIntValueExact2;
        String id5;
        String str2 = "CertPathReviewer.policyExtError";
        Set<String> initialPolicies = this.pkixParams.getInitialPolicies();
        int i15 = this.f149409n + 1;
        ArrayList[] arrayListArr = new ArrayList[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            arrayListArr[i16] = new ArrayList();
        }
        HashSet hashSet = new HashSet();
        hashSet.add(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY);
        PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), 0, hashSet, null, new HashSet(), org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY, false);
        arrayListArr[0].add(pKIXPolicyNode2);
        int i17 = this.pkixParams.isExplicitPolicyRequired() ? 0 : this.f149409n + 1;
        int i18 = this.pkixParams.isAnyPolicyInhibited() ? 0 : this.f149409n + 1;
        int i19 = this.pkixParams.isPolicyMappingInhibited() ? 0 : this.f149409n + 1;
        try {
            int size = this.certs.size() - 1;
            X509Certificate x509Certificate = null;
            HashSet hashSet2 = null;
            while (size >= 0) {
                int i25 = this.f149409n - size;
                X509Certificate x509Certificate2 = (X509Certificate) this.certs.get(size);
                try {
                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                    if (aSN1Sequence2 == null || pKIXPolicyNode2 == null) {
                        str = str2;
                        aSN1Sequence = aSN1Sequence2;
                    } else {
                        Enumeration objects = aSN1Sequence2.getObjects();
                        HashSet hashSet3 = new HashSet();
                        while (objects.hasMoreElements()) {
                            PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                            String str3 = str2;
                            ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                            ASN1Sequence aSN1Sequence3 = aSN1Sequence2;
                            hashSet3.add(policyIdentifier.getId());
                            if (!org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(policyIdentifier.getId())) {
                                try {
                                    Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                                    if (!CertPathValidatorUtilities.processCertD1i(i25, arrayListArr, policyIdentifier, qualifierSet)) {
                                        CertPathValidatorUtilities.processCertD1ii(i25, arrayListArr, policyIdentifier, qualifierSet);
                                    }
                                } catch (CertPathValidatorException e15) {
                                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyQualifierError"), e15, this.certPath, size);
                                }
                            }
                            str2 = str3;
                            aSN1Sequence2 = aSN1Sequence3;
                        }
                        str = str2;
                        aSN1Sequence = aSN1Sequence2;
                        if (hashSet2 == null || hashSet2.contains(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY)) {
                            hashSet2 = hashSet3;
                        } else {
                            HashSet hashSet4 = new HashSet();
                            for (Object obj : hashSet2) {
                                if (hashSet3.contains(obj)) {
                                    hashSet4.add(obj);
                                }
                            }
                            hashSet2 = hashSet4;
                        }
                        if (i18 > 0 || (i25 < this.f149409n && CertPathValidatorUtilities.isSelfIssued(x509Certificate2))) {
                            Enumeration objects2 = aSN1Sequence.getObjects();
                            while (objects2.hasMoreElements()) {
                                PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                                if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(policyInformation2.getPolicyIdentifier().getId())) {
                                    try {
                                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(policyInformation2.getPolicyQualifiers());
                                        ArrayList arrayList = arrayListArr[i25 - 1];
                                        int i26 = 0;
                                        while (i26 < arrayList.size()) {
                                            PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) arrayList.get(i26);
                                            for (Object obj2 : pKIXPolicyNode3.getExpectedPolicies()) {
                                                ArrayList arrayList2 = arrayList;
                                                int i27 = i26;
                                                if (obj2 instanceof String) {
                                                    id5 = (String) obj2;
                                                } else {
                                                    if (obj2 instanceof ASN1ObjectIdentifier) {
                                                        id5 = ((ASN1ObjectIdentifier) obj2).getId();
                                                    }
                                                    arrayList = arrayList2;
                                                    i26 = i27;
                                                }
                                                Iterator children = pKIXPolicyNode3.getChildren();
                                                boolean z15 = false;
                                                while (children.hasNext()) {
                                                    Iterator it = children;
                                                    if (id5.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                                        z15 = true;
                                                    }
                                                    children = it;
                                                }
                                                if (!z15) {
                                                    HashSet hashSet5 = new HashSet();
                                                    hashSet5.add(id5);
                                                    PKIXPolicyNode pKIXPolicyNode4 = new PKIXPolicyNode(new ArrayList(), i25, hashSet5, pKIXPolicyNode3, qualifierSet2, id5, false);
                                                    PKIXPolicyNode pKIXPolicyNode5 = pKIXPolicyNode3;
                                                    pKIXPolicyNode5.addChild(pKIXPolicyNode4);
                                                    pKIXPolicyNode3 = pKIXPolicyNode5;
                                                    arrayListArr[i25].add(pKIXPolicyNode4);
                                                }
                                                arrayList = arrayList2;
                                                i26 = i27;
                                            }
                                            i26++;
                                        }
                                        break;
                                    } catch (CertPathValidatorException e16) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyQualifierError"), e16, this.certPath, size);
                                    }
                                }
                            }
                        }
                        int i28 = i25 - 1;
                        while (i28 >= 0) {
                            ArrayList arrayList3 = arrayListArr[i28];
                            int i29 = i28;
                            for (int i35 = 0; i35 < arrayList3.size(); i35++) {
                                PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) arrayList3.get(i35);
                                if (!pKIXPolicyNode6.hasChildren()) {
                                    PKIXPolicyNode pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode2, arrayListArr, pKIXPolicyNode6);
                                    pKIXPolicyNode2 = pKIXPolicyNodeRemovePolicyNode;
                                    if (pKIXPolicyNodeRemovePolicyNode == null) {
                                        break;
                                    }
                                }
                            }
                            i28 = i29 - 1;
                        }
                        Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs != null) {
                            boolean zContains = criticalExtensionOIDs.contains(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                            ArrayList arrayList4 = arrayListArr[i25];
                            for (int i36 = 0; i36 < arrayList4.size(); i36++) {
                                ((PKIXPolicyNode) arrayList4.get(i36)).setCritical(zContains);
                            }
                        }
                        pKIXPolicyNode2 = pKIXPolicyNode2;
                    }
                    if (aSN1Sequence == null) {
                        pKIXPolicyNode2 = null;
                    }
                    if (i17 <= 0 && pKIXPolicyNode2 == null) {
                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.noValidPolicyTree"));
                    }
                    if (i25 != this.f149409n) {
                        try {
                            ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_MAPPINGS);
                            if (extensionValue != null) {
                                ASN1Sequence aSN1Sequence4 = (ASN1Sequence) extensionValue;
                                int i37 = 0;
                                while (i37 < aSN1Sequence4.size()) {
                                    ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence4.getObjectAt(i37);
                                    ASN1Sequence aSN1Sequence6 = aSN1Sequence4;
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence5.getObjectAt(0);
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) aSN1Sequence5.getObjectAt(1);
                                    if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(aSN1ObjectIdentifier.getId())) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(aSN1ObjectIdentifier2.getId())) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    i37++;
                                    aSN1Sequence4 = aSN1Sequence6;
                                }
                            }
                            if (extensionValue != 0) {
                                ASN1Sequence aSN1Sequence7 = (ASN1Sequence) extensionValue;
                                HashMap map = new HashMap();
                                HashSet<String> hashSet6 = new HashSet();
                                PKIXPolicyNode pKIXPolicyNode7 = pKIXPolicyNode2;
                                int i38 = 0;
                                while (i38 < aSN1Sequence7.size()) {
                                    ASN1Sequence aSN1Sequence8 = (ASN1Sequence) aSN1Sequence7.getObjectAt(i38);
                                    ASN1Sequence aSN1Sequence9 = aSN1Sequence7;
                                    String id6 = ((ASN1ObjectIdentifier) aSN1Sequence8.getObjectAt(0)).getId();
                                    int i39 = i38;
                                    String id7 = ((ASN1ObjectIdentifier) aSN1Sequence8.getObjectAt(1)).getId();
                                    if (map.containsKey(id6)) {
                                        ((Set) map.get(id6)).add(id7);
                                    } else {
                                        HashSet hashSet7 = new HashSet();
                                        hashSet7.add(id7);
                                        map.put(id6, hashSet7);
                                        hashSet6.add(id6);
                                    }
                                    i38 = i39 + 1;
                                    aSN1Sequence7 = aSN1Sequence9;
                                }
                                pKIXPolicyNode2 = pKIXPolicyNode7;
                                for (String str4 : hashSet6) {
                                    if (i19 > 0) {
                                        try {
                                            CertPathValidatorUtilities.prepareNextCertB1(i25, arrayListArr, str4, map, x509Certificate2);
                                        } catch (CertPathValidatorException e17) {
                                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyQualifierError"), e17, this.certPath, size);
                                        } catch (AnnotatedException e18) {
                                            throw new CertPathReviewerException(createErrorBundle(str), e18, this.certPath, size);
                                        }
                                    } else if (i19 <= 0) {
                                        pKIXPolicyNode2 = CertPathValidatorUtilities.prepareNextCertB2(i25, arrayListArr, str4, pKIXPolicyNode2);
                                    }
                                }
                            }
                            if (CertPathValidatorUtilities.isSelfIssued(x509Certificate2)) {
                                i17 = i17;
                            } else {
                                if (i17 != 0) {
                                    i17--;
                                }
                                if (i19 != 0) {
                                    i17 = i17;
                                    i19--;
                                }
                                if (i18 != 0) {
                                    i18--;
                                }
                            }
                            try {
                                ASN1Sequence aSN1Sequence10 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                                if (aSN1Sequence10 != null) {
                                    Enumeration objects3 = aSN1Sequence10.getObjects();
                                    while (objects3.hasMoreElements()) {
                                        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects3.nextElement();
                                        int tagNo = aSN1TaggedObject.getTagNo();
                                        if (tagNo == 0) {
                                            int iIntValueExact3 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                                            if (iIntValueExact3 < i17) {
                                                i17 = iIntValueExact3;
                                            }
                                        } else if (tagNo == 1 && (iIntValueExact2 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact()) < i19) {
                                            i19 = iIntValueExact2;
                                        }
                                    }
                                }
                                try {
                                    ASN1Integer aSN1Integer = (ASN1Integer) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                                    if (aSN1Integer != null && (iIntValueExact = aSN1Integer.intValueExact()) < i18) {
                                        i18 = iIntValueExact;
                                    }
                                } catch (AnnotatedException unused) {
                                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyInhibitExtError"), this.certPath, size);
                                }
                            } catch (AnnotatedException unused2) {
                                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyConstExtError"), this.certPath, size);
                            }
                        } catch (AnnotatedException e19) {
                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyMapExtError"), e19, this.certPath, size);
                        }
                    }
                    size--;
                    x509Certificate = x509Certificate2;
                    str2 = str;
                } catch (AnnotatedException e25) {
                    throw new CertPathReviewerException(createErrorBundle(str2), e25, this.certPath, size);
                }
            }
            int i45 = i17;
            int i46 = (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i45 <= 0) ? i45 : i45 - 1;
            try {
                ASN1Sequence aSN1Sequence11 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                if (aSN1Sequence11 != null) {
                    Enumeration objects4 = aSN1Sequence11.getObjects();
                    int i47 = i46;
                    while (objects4.hasMoreElements()) {
                        ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) objects4.nextElement();
                        if (aSN1TaggedObject2.getTagNo() == 0 && ASN1Integer.getInstance(aSN1TaggedObject2, false).intValueExact() == 0) {
                            i47 = 0;
                        }
                    }
                    i46 = i47;
                }
                if (pKIXPolicyNode2 != null) {
                    if (!CertPathValidatorUtilities.isAnyPolicy(initialPolicies)) {
                        HashSet<PKIXPolicyNode> hashSet8 = new HashSet();
                        for (int i48 = 0; i48 < i15; i48++) {
                            ArrayList arrayList5 = arrayListArr[i48];
                            for (int i49 = 0; i49 < arrayList5.size(); i49++) {
                                PKIXPolicyNode pKIXPolicyNode8 = (PKIXPolicyNode) arrayList5.get(i49);
                                if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode8.getValidPolicy())) {
                                    Iterator children2 = pKIXPolicyNode8.getChildren();
                                    while (children2.hasNext()) {
                                        PKIXPolicyNode pKIXPolicyNode9 = (PKIXPolicyNode) children2.next();
                                        if (!org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode9.getValidPolicy())) {
                                            hashSet8.add(pKIXPolicyNode9);
                                        }
                                    }
                                }
                            }
                        }
                        for (PKIXPolicyNode pKIXPolicyNode10 : hashSet8) {
                            if (!initialPolicies.contains(pKIXPolicyNode10.getValidPolicy())) {
                                pKIXPolicyNode2 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode2, arrayListArr, pKIXPolicyNode10);
                            }
                        }
                        if (pKIXPolicyNode2 != null) {
                            for (int i55 = this.f149409n - 1; i55 >= 0; i55--) {
                                ArrayList arrayList6 = arrayListArr[i55];
                                for (int i56 = 0; i56 < arrayList6.size(); i56++) {
                                    PKIXPolicyNode pKIXPolicyNode11 = (PKIXPolicyNode) arrayList6.get(i56);
                                    if (!pKIXPolicyNode11.hasChildren()) {
                                        pKIXPolicyNode2 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode2, arrayListArr, pKIXPolicyNode11);
                                    }
                                }
                            }
                        }
                    } else if (this.pkixParams.isExplicitPolicyRequired()) {
                        if (hashSet2.isEmpty()) {
                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.explicitPolicy"), this.certPath, size);
                        }
                        HashSet hashSet9 = new HashSet();
                        for (int i57 = 0; i57 < i15; i57++) {
                            ArrayList arrayList7 = arrayListArr[i57];
                            for (int i58 = 0; i58 < arrayList7.size(); i58++) {
                                PKIXPolicyNode pKIXPolicyNode12 = (PKIXPolicyNode) arrayList7.get(i58);
                                if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode12.getValidPolicy())) {
                                    Iterator children3 = pKIXPolicyNode12.getChildren();
                                    while (children3.hasNext()) {
                                        hashSet9.add(children3.next());
                                    }
                                }
                            }
                        }
                        Iterator it4 = hashSet9.iterator();
                        while (it4.hasNext()) {
                            hashSet2.contains(((PKIXPolicyNode) it4.next()).getValidPolicy());
                        }
                        for (int i59 = this.f149409n - 1; i59 >= 0; i59--) {
                            ArrayList arrayList8 = arrayListArr[i59];
                            for (int i65 = 0; i65 < arrayList8.size(); i65++) {
                                PKIXPolicyNode pKIXPolicyNode13 = (PKIXPolicyNode) arrayList8.get(i65);
                                if (!pKIXPolicyNode13.hasChildren()) {
                                    pKIXPolicyNode2 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode2, arrayListArr, pKIXPolicyNode13);
                                }
                            }
                        }
                    }
                    pKIXPolicyNode = pKIXPolicyNode2;
                } else {
                    if (this.pkixParams.isExplicitPolicyRequired()) {
                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.explicitPolicy"), this.certPath, size);
                    }
                    pKIXPolicyNode = null;
                }
                if (i46 <= 0 && pKIXPolicyNode == null) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.invalidPolicy"));
                }
            } catch (AnnotatedException unused3) {
                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyConstExtError"), this.certPath, size);
            }
        } catch (CertPathReviewerException e26) {
            addError(e26.getErrorMessage(), e26.getIndex());
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0297 A[LOOP:1: B:99:0x0291->B:101:0x0297, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x02b8 A[LOOP:2: B:103:0x02b2->B:105:0x02b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0308  */
    /* JADX WARN: Code duplicated, block: B:123:0x0325 A[Catch: AnnotatedException -> 0x0336, TryCatch #12 {AnnotatedException -> 0x0336, blocks: (B:121:0x0319, B:123:0x0325, B:125:0x032b), top: B:163:0x0319 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0333  */
    /* JADX WARN: Code duplicated, block: B:131:0x0345  */
    /* JADX WARN: Code duplicated, block: B:146:0x0257 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ec A[Catch: IllegalArgumentException -> 0x00fb, TRY_ENTER, TryCatch #5 {IllegalArgumentException -> 0x00fb, blocks: (B:35:0x00ec, B:36:0x00f1), top: B:151:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f1 A[Catch: IllegalArgumentException -> 0x00fb, TRY_LEAVE, TryCatch #5 {IllegalArgumentException -> 0x00fb, blocks: (B:35:0x00ec, B:36:0x00f1), top: B:151:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0134  */
    /* JADX WARN: Code duplicated, block: B:52:0x0139  */
    /* JADX WARN: Code duplicated, block: B:56:0x0152  */
    /* JADX WARN: Code duplicated, block: B:59:0x0161  */
    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x025f A[Catch: AnnotatedException -> 0x0264, TRY_LEAVE, TryCatch #3 {AnnotatedException -> 0x0264, blocks: (B:86:0x0257, B:88:0x025f), top: B:146:0x0257 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x026d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0276 A[Catch: AnnotatedException -> 0x027b, TRY_LEAVE, TryCatch #9 {AnnotatedException -> 0x027b, blocks: (B:92:0x026e, B:94:0x0276), top: B:159:0x026e }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0284  */
    private void checkSignatures() {
        TrustAnchor trustAnchor;
        ErrorBundle errorMessage;
        TrustAnchor trustAnchor2;
        X500Principal x500Principal;
        X509Certificate trustedCert;
        PublicKey cAPublicKey;
        X509Certificate x509Certificate;
        X500Principal subjectX500Principal;
        PublicKey nextWorkingKey;
        int size;
        int i15;
        X509Certificate x509Certificate2;
        ErrorBundle errorBundleCreateErrorBundle;
        ErrorBundle errorBundleCreateErrorBundle2;
        CRLDistPoint cRLDistPoint;
        AuthorityInformationAccess authorityInformationAccess;
        Iterator it;
        Iterator it4;
        ASN1Primitive extensionValue;
        ASN1Primitive extensionValue2;
        String str;
        boolean[] keyUsage;
        BasicConstraints basicConstraints;
        byte[] extensionValue3;
        AuthorityKeyIdentifier authorityKeyIdentifier;
        GeneralNames authorityCertIssuer;
        GeneralName generalName;
        BigInteger authorityCertSerialNumber;
        X509Certificate trustedCert2;
        boolean[] keyUsage2;
        ErrorBundle errorBundleCreateErrorBundle3;
        addNotification(createErrorBundle("CertPathReviewer.certPathValidDate", new Object[]{new TrustedInput(this.validDate), new TrustedInput(this.currentDate)}));
        try {
            List list = this.certs;
            X509Certificate x509Certificate3 = (X509Certificate) list.get(list.size() - 1);
            Collection trustAnchors = getTrustAnchors(x509Certificate3, this.pkixParams.getTrustAnchors());
            if (trustAnchors.size() <= 1) {
                if (trustAnchors.isEmpty()) {
                    errorBundleCreateErrorBundle3 = createErrorBundle("CertPathReviewer.noTrustAnchorFound", new Object[]{new UntrustedInput(x509Certificate3.getIssuerX500Principal()), Integers.valueOf(this.pkixParams.getTrustAnchors().size())});
                } else {
                    trustAnchor = (TrustAnchor) trustAnchors.iterator().next();
                    try {
                        try {
                            try {
                                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate3, trustAnchor.getTrustedCert() != null ? trustAnchor.getTrustedCert().getPublicKey() : trustAnchor.getCAPublicKey(), this.pkixParams.getSigProvider());
                            } catch (SignatureException unused) {
                                addError(createErrorBundle("CertPathReviewer.trustButInvalidCert"));
                            } catch (Exception unused2) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            errorMessage = createErrorBundle("CertPathReviewer.unknown", new Object[]{new UntrustedInput(th.getMessage()), new UntrustedInput(th)});
                            addError(errorMessage);
                        }
                    } catch (CertPathReviewerException e15) {
                        e = e15;
                        errorMessage = e.getErrorMessage();
                        addError(errorMessage);
                    }
                }
                trustAnchor2 = trustAnchor;
                if (trustAnchor2 != null) {
                    trustedCert2 = trustAnchor2.getTrustedCert();
                    try {
                        if (trustedCert2 != null) {
                            x500Principal = CertPathValidatorUtilities.getSubjectPrincipal(trustedCert2);
                        } else {
                            x500Principal = new X500Principal(trustAnchor2.getCAName());
                        }
                    } catch (IllegalArgumentException unused3) {
                        addError(createErrorBundle("CertPathReviewer.trustDNInvalid", new Object[]{new UntrustedInput(trustAnchor2.getCAName())}));
                        x500Principal = null;
                    }
                    if (trustedCert2 != null && (keyUsage2 = trustedCert2.getKeyUsage()) != null && (keyUsage2.length <= 5 || !keyUsage2[5])) {
                        addNotification(createErrorBundle("CertPathReviewer.trustKeyUsage"));
                    }
                } else {
                    x500Principal = null;
                }
                if (trustAnchor2 != null) {
                    trustedCert = trustAnchor2.getTrustedCert();
                    if (trustedCert != null) {
                        cAPublicKey = trustedCert.getPublicKey();
                    } else {
                        cAPublicKey = trustAnchor2.getCAPublicKey();
                    }
                    try {
                        AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                        algorithmIdentifier.getAlgorithm();
                        algorithmIdentifier.getParameters();
                    } catch (CertPathValidatorException unused4) {
                        addError(createErrorBundle("CertPathReviewer.trustPubKeyError"));
                    }
                } else {
                    trustedCert = null;
                    cAPublicKey = null;
                }
                x509Certificate = trustedCert;
                subjectX500Principal = x500Principal;
                nextWorkingKey = cAPublicKey;
                size = this.certs.size() - 1;
                while (size >= 0) {
                    i15 = this.f149409n - size;
                    x509Certificate2 = (X509Certificate) this.certs.get(size);
                    if (nextWorkingKey != null) {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, nextWorkingKey, this.pkixParams.getSigProvider());
                        } catch (GeneralSecurityException e16) {
                            errorBundleCreateErrorBundle = createErrorBundle("CertPathReviewer.signatureNotVerified", new Object[]{e16.getMessage(), e16, e16.getClass().getName()});
                            addError(errorBundleCreateErrorBundle, size);
                        }
                    } else {
                        if (CertPathValidatorUtilities.isSelfIssued(x509Certificate2)) {
                            try {
                                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, x509Certificate2.getPublicKey(), this.pkixParams.getSigProvider());
                                addError(createErrorBundle("CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
                            } catch (GeneralSecurityException e17) {
                                errorBundleCreateErrorBundle = createErrorBundle("CertPathReviewer.signatureNotVerified", new Object[]{e17.getMessage(), e17, e17.getClass().getName()});
                                addError(errorBundleCreateErrorBundle, size);
                            }
                        } else {
                            errorBundleCreateErrorBundle = createErrorBundle("CertPathReviewer.NoIssuerPublicKey");
                            extensionValue3 = x509Certificate2.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                            if (extensionValue3 != null && (authorityCertIssuer = (authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue3).getOctets())).getAuthorityCertIssuer()) != null) {
                                generalName = authorityCertIssuer.getNames()[0];
                                authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                                if (authorityCertSerialNumber != null) {
                                    errorBundleCreateErrorBundle.setExtraArguments(new Object[]{new LocaleString(RESOURCE_NAME, "missingIssuer"), " \"", generalName, "\" ", new LocaleString(RESOURCE_NAME, "missingSerial"), " ", authorityCertSerialNumber});
                                }
                            }
                        }
                        addError(errorBundleCreateErrorBundle, size);
                    }
                    try {
                        x509Certificate2.checkValidity(this.validDate);
                    } catch (CertificateExpiredException unused5) {
                        errorBundleCreateErrorBundle2 = createErrorBundle("CertPathReviewer.certificateExpired", new Object[]{new TrustedInput(x509Certificate2.getNotAfter())});
                        addError(errorBundleCreateErrorBundle2, size);
                    } catch (CertificateNotYetValidException unused6) {
                        errorBundleCreateErrorBundle2 = createErrorBundle("CertPathReviewer.certificateNotYetValid", new Object[]{new TrustedInput(x509Certificate2.getNotBefore())});
                        addError(errorBundleCreateErrorBundle2, size);
                    }
                    if (this.pkixParams.isRevocationEnabled()) {
                        try {
                            extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CRL_DIST_POINTS);
                            if (extensionValue2 != null) {
                                cRLDistPoint = CRLDistPoint.getInstance(extensionValue2);
                            } else {
                                cRLDistPoint = null;
                            }
                        } catch (AnnotatedException unused7) {
                            addError(createErrorBundle("CertPathReviewer.crlDistPtExtError"), size);
                        }
                        try {
                            extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, AUTH_INFO_ACCESS);
                            if (extensionValue != null) {
                                authorityInformationAccess = AuthorityInformationAccess.getInstance(extensionValue);
                            } else {
                                authorityInformationAccess = null;
                            }
                        } catch (AnnotatedException unused8) {
                            addError(createErrorBundle("CertPathReviewer.crlAuthInfoAccError"), size);
                        }
                        Vector cRLDistUrls = getCRLDistUrls(cRLDistPoint);
                        Vector oCSPUrls = getOCSPUrls(authorityInformationAccess);
                        it = cRLDistUrls.iterator();
                        while (it.hasNext()) {
                            addNotification(createErrorBundle("CertPathReviewer.crlDistPoint", new Object[]{new UntrustedUrlInput(it.next())}), size);
                        }
                        it4 = oCSPUrls.iterator();
                        while (it4.hasNext()) {
                            addNotification(createErrorBundle("CertPathReviewer.ocspLocation", new Object[]{new UntrustedUrlInput(it4.next())}), size);
                        }
                        try {
                            checkRevocation(this.pkixParams, x509Certificate2, this.validDate, x509Certificate, nextWorkingKey, cRLDistUrls, oCSPUrls, size);
                        } catch (CertPathReviewerException e18) {
                            addError(e18.getErrorMessage(), size);
                        }
                    }
                    if (subjectX500Principal != null && !x509Certificate2.getIssuerX500Principal().equals(subjectX500Principal)) {
                        addError(createErrorBundle("CertPathReviewer.certWrongIssuer", new Object[]{subjectX500Principal.getName(), x509Certificate2.getIssuerX500Principal().getName()}), size);
                    }
                    if (i15 != this.f149409n) {
                        str = "CertPathReviewer.noCACert";
                        if (x509Certificate2 != null && x509Certificate2.getVersion() == 1) {
                            addError(createErrorBundle("CertPathReviewer.noCACert"), size);
                        }
                        try {
                            basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                            if (basicConstraints != null) {
                                if (!basicConstraints.isCA()) {
                                }
                                keyUsage = x509Certificate2.getKeyUsage();
                                if (keyUsage != null && (keyUsage.length <= 5 || !keyUsage[5])) {
                                    addError(createErrorBundle("CertPathReviewer.noCertSign"), size);
                                }
                            } else {
                                str = "CertPathReviewer.noBasicConstraints";
                            }
                            addError(createErrorBundle(str), size);
                        } catch (AnnotatedException unused9) {
                            addError(createErrorBundle("CertPathReviewer.errorProcesingBC"), size);
                        }
                        keyUsage = x509Certificate2.getKeyUsage();
                        if (keyUsage != null) {
                            addError(createErrorBundle("CertPathReviewer.noCertSign"), size);
                        }
                    }
                    subjectX500Principal = x509Certificate2.getSubjectX500Principal();
                    try {
                        nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                        AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                        algorithmIdentifier2.getAlgorithm();
                        algorithmIdentifier2.getParameters();
                    } catch (CertPathValidatorException unused10) {
                        addError(createErrorBundle("CertPathReviewer.pubKeyError"), size);
                    }
                    size--;
                    x509Certificate = x509Certificate2;
                }
                this.trustAnchor = trustAnchor2;
                this.subjectPublicKey = nextWorkingKey;
            }
            errorBundleCreateErrorBundle3 = createErrorBundle("CertPathReviewer.conflictingTrustAnchors", new Object[]{Integers.valueOf(trustAnchors.size()), new UntrustedInput(x509Certificate3.getIssuerX500Principal())});
            addError(errorBundleCreateErrorBundle3);
            trustAnchor = null;
        } catch (CertPathReviewerException e19) {
            e = e19;
            trustAnchor = null;
        } catch (Throwable th5) {
            th = th5;
            trustAnchor = null;
        }
        trustAnchor2 = trustAnchor;
        if (trustAnchor2 != null) {
            trustedCert2 = trustAnchor2.getTrustedCert();
            if (trustedCert2 != null) {
                x500Principal = CertPathValidatorUtilities.getSubjectPrincipal(trustedCert2);
            } else {
                x500Principal = new X500Principal(trustAnchor2.getCAName());
            }
            if (trustedCert2 != null) {
                addNotification(createErrorBundle("CertPathReviewer.trustKeyUsage"));
            }
        } else {
            x500Principal = null;
        }
        if (trustAnchor2 != null) {
            trustedCert = trustAnchor2.getTrustedCert();
            if (trustedCert != null) {
                cAPublicKey = trustedCert.getPublicKey();
            } else {
                cAPublicKey = trustAnchor2.getCAPublicKey();
            }
            AlgorithmIdentifier algorithmIdentifier3 = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
            algorithmIdentifier3.getAlgorithm();
            algorithmIdentifier3.getParameters();
        } else {
            trustedCert = null;
            cAPublicKey = null;
        }
        x509Certificate = trustedCert;
        subjectX500Principal = x500Principal;
        nextWorkingKey = cAPublicKey;
        size = this.certs.size() - 1;
        while (size >= 0) {
            i15 = this.f149409n - size;
            x509Certificate2 = (X509Certificate) this.certs.get(size);
            if (nextWorkingKey != null) {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, nextWorkingKey, this.pkixParams.getSigProvider());
            } else {
                if (CertPathValidatorUtilities.isSelfIssued(x509Certificate2)) {
                    CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, x509Certificate2.getPublicKey(), this.pkixParams.getSigProvider());
                    addError(createErrorBundle("CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
                } else {
                    errorBundleCreateErrorBundle = createErrorBundle("CertPathReviewer.NoIssuerPublicKey");
                    extensionValue3 = x509Certificate2.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                    if (extensionValue3 != null) {
                        generalName = authorityCertIssuer.getNames()[0];
                        authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                        if (authorityCertSerialNumber != null) {
                            errorBundleCreateErrorBundle.setExtraArguments(new Object[]{new LocaleString(RESOURCE_NAME, "missingIssuer"), " \"", generalName, "\" ", new LocaleString(RESOURCE_NAME, "missingSerial"), " ", authorityCertSerialNumber});
                        }
                    }
                }
                addError(errorBundleCreateErrorBundle, size);
            }
            x509Certificate2.checkValidity(this.validDate);
            if (this.pkixParams.isRevocationEnabled()) {
                extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CRL_DIST_POINTS);
                if (extensionValue2 != null) {
                    cRLDistPoint = CRLDistPoint.getInstance(extensionValue2);
                } else {
                    cRLDistPoint = null;
                }
                extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, AUTH_INFO_ACCESS);
                if (extensionValue != null) {
                    authorityInformationAccess = AuthorityInformationAccess.getInstance(extensionValue);
                } else {
                    authorityInformationAccess = null;
                }
                Vector cRLDistUrls2 = getCRLDistUrls(cRLDistPoint);
                Vector oCSPUrls2 = getOCSPUrls(authorityInformationAccess);
                it = cRLDistUrls2.iterator();
                while (it.hasNext()) {
                    addNotification(createErrorBundle("CertPathReviewer.crlDistPoint", new Object[]{new UntrustedUrlInput(it.next())}), size);
                }
                it4 = oCSPUrls2.iterator();
                while (it4.hasNext()) {
                    addNotification(createErrorBundle("CertPathReviewer.ocspLocation", new Object[]{new UntrustedUrlInput(it4.next())}), size);
                }
                checkRevocation(this.pkixParams, x509Certificate2, this.validDate, x509Certificate, nextWorkingKey, cRLDistUrls2, oCSPUrls2, size);
            }
            if (subjectX500Principal != null) {
                addError(createErrorBundle("CertPathReviewer.certWrongIssuer", new Object[]{subjectX500Principal.getName(), x509Certificate2.getIssuerX500Principal().getName()}), size);
            }
            if (i15 != this.f149409n) {
                str = "CertPathReviewer.noCACert";
                if (x509Certificate2 != null) {
                    addError(createErrorBundle("CertPathReviewer.noCACert"), size);
                }
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                if (basicConstraints != null) {
                    if (!basicConstraints.isCA()) {
                    }
                    keyUsage = x509Certificate2.getKeyUsage();
                    if (keyUsage != null) {
                        addError(createErrorBundle("CertPathReviewer.noCertSign"), size);
                    }
                } else {
                    str = "CertPathReviewer.noBasicConstraints";
                }
                addError(createErrorBundle(str), size);
                keyUsage = x509Certificate2.getKeyUsage();
                if (keyUsage != null) {
                    addError(createErrorBundle("CertPathReviewer.noCertSign"), size);
                }
            }
            subjectX500Principal = x509Certificate2.getSubjectX500Principal();
            nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
            AlgorithmIdentifier algorithmIdentifier4 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
            algorithmIdentifier4.getAlgorithm();
            algorithmIdentifier4.getParameters();
            size--;
            x509Certificate = x509Certificate2;
        }
        this.trustAnchor = trustAnchor2;
        this.subjectPublicKey = nextWorkingKey;
    }

    private static ErrorBundle createErrorBundle(String str) {
        ErrorBundle errorBundle = new ErrorBundle(RESOURCE_NAME, str);
        errorBundle.setClassLoader(PKIXCertPathReviewer.class.getClassLoader());
        return errorBundle;
    }

    private X509CRL getCRL(String str) throws CertPathReviewerException {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals("http") && !url.getProtocol().equals("https")) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e15) {
            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.loadCrlDistPointError", new Object[]{new UntrustedInput(str), e15.getMessage(), e15, e15.getClass().getName()}));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i15) {
        ErrorBundle errorBundleCreateErrorBundle;
        String str;
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z15 = false;
            for (int i16 = 0; i16 < aSN1Sequence.size(); i16++) {
                QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(i16));
                if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcCompliance.equals((ASN1Primitive) qCStatement.getStatementId())) {
                    str = "CertPathReviewer.QcEuCompliance";
                } else {
                    if (!RFC3739QCObjectIdentifiers.id_qcs_pkixQCSyntax_v1.equals((ASN1Primitive) qCStatement.getStatementId())) {
                        if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcSSCD.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            str = "CertPathReviewer.QcSSCD";
                        } else if (ETSIQCObjectIdentifiers.id_etsi_qcs_LimiteValue.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            double dDoubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                            errorBundleCreateErrorBundle = monetaryValue.getCurrency().isAlphabetic() ? createErrorBundle("CertPathReviewer.QcLimitValueAlpha", new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(dDoubleValue)), monetaryValue}) : createErrorBundle("CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(dDoubleValue)), monetaryValue});
                            addNotification(errorBundleCreateErrorBundle, i15);
                        } else {
                            addNotification(createErrorBundle("CertPathReviewer.QcUnknownStatement", new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i15);
                            z15 = true;
                        }
                    }
                }
                errorBundleCreateErrorBundle = createErrorBundle(str);
                addNotification(errorBundleCreateErrorBundle, i15);
            }
            return !z15;
        } catch (AnnotatedException unused) {
            addError(createErrorBundle("CertPathReviewer.QcStatementExtError"), i15);
            return false;
        }
    }

    protected void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    protected void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0205  */
    protected void checkCRLs(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, int i15) throws CertPathReviewerException {
        Iterator it;
        X509CRL x509crl;
        X509CRL x509crl2;
        boolean z15;
        String str;
        String str2;
        boolean z16;
        ErrorBundle errorBundleCreateErrorBundle;
        String str3;
        boolean[] keyUsage;
        ErrorBundle errorBundleCreateErrorBundle2;
        String str4 = "CertPathReviewer.crlIssuerException";
        String str5 = "CertPathReviewer.distrPtExtError";
        X509CRLStoreSelector x509CRLStoreSelector = new X509CRLStoreSelector();
        try {
            x509CRLStoreSelector.addIssuerName(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            x509CRLStoreSelector.setCertificateChecking(x509Certificate);
            try {
                Set setFindCRLs = PKIXCRLUtil.findCRLs(x509CRLStoreSelector, pKIXParameters);
                it = setFindCRLs.iterator();
                if (setFindCRLs.isEmpty()) {
                    Iterator it4 = PKIXCRLUtil.findCRLs(new X509CRLStoreSelector(), pKIXParameters).iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it4.hasNext()) {
                        arrayList.add(((X509CRL) it4.next()).getIssuerX500Principal());
                    }
                    addNotification(createErrorBundle("CertPathReviewer.noCrlInCertstore", new Object[]{new UntrustedInput(x509CRLStoreSelector.getIssuerNames()), new UntrustedInput(arrayList), Integers.valueOf(arrayList.size())}), i15);
                }
                while (true) {
                    if (!it.hasNext()) {
                        x509crl2 = x509crl;
                        z15 = false;
                        break;
                    }
                    x509crl = (X509CRL) it.next();
                    Date thisUpdate = x509crl.getThisUpdate();
                    Date nextUpdate = x509crl.getNextUpdate();
                    Object[] objArr = {new TrustedInput(thisUpdate), new TrustedInput(nextUpdate)};
                    if (nextUpdate == null || date.before(nextUpdate)) {
                        addNotification(createErrorBundle("CertPathReviewer.localValidCRL", objArr), i15);
                        x509crl2 = x509crl;
                        z15 = true;
                        break;
                    }
                    addNotification(createErrorBundle("CertPathReviewer.localInvalidCRL", objArr), i15);
                }
            } catch (AnnotatedException e15) {
                addError(createErrorBundle("CertPathReviewer.crlExtractionError", new Object[]{e15.getCause().getMessage(), e15.getCause(), e15.getCause().getClass().getName()}), i15);
                it = new ArrayList().iterator();
            }
            x509crl = null;
            if (!z15) {
                X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                Iterator it5 = vector.iterator();
                boolean z17 = z15;
                while (true) {
                    if (!it5.hasNext()) {
                        str = str4;
                        str2 = str5;
                        z16 = z17;
                        break;
                    }
                    try {
                        String str6 = (String) it5.next();
                        X509CRL crl = getCRL(str6);
                        if (crl != null) {
                            X500Principal issuerX500Principal2 = crl.getIssuerX500Principal();
                            if (issuerX500Principal.equals(issuerX500Principal2)) {
                                str = str4;
                                str2 = str5;
                                Date thisUpdate2 = crl.getThisUpdate();
                                Date nextUpdate2 = crl.getNextUpdate();
                                Object[] objArr2 = {new TrustedInput(thisUpdate2), new TrustedInput(nextUpdate2), new UntrustedUrlInput(str6)};
                                if (nextUpdate2 != null && !date.before(nextUpdate2)) {
                                    errorBundleCreateErrorBundle2 = createErrorBundle("CertPathReviewer.onlineInvalidCRL", objArr2);
                                    addNotification(errorBundleCreateErrorBundle2, i15);
                                }
                                try {
                                    addNotification(createErrorBundle("CertPathReviewer.onlineValidCRL", objArr2), i15);
                                    x509crl2 = crl;
                                    z16 = true;
                                    break;
                                } catch (CertPathReviewerException e16) {
                                    e = e16;
                                    z17 = true;
                                    addNotification(e.getErrorMessage(), i15);
                                    str4 = str;
                                    str5 = str2;
                                }
                            } else {
                                str = str4;
                                try {
                                    str2 = str5;
                                    try {
                                        errorBundleCreateErrorBundle2 = createErrorBundle("CertPathReviewer.onlineCRLWrongCA", new Object[]{new UntrustedInput(issuerX500Principal2.getName()), new UntrustedInput(issuerX500Principal.getName()), new UntrustedUrlInput(str6)});
                                        addNotification(errorBundleCreateErrorBundle2, i15);
                                    } catch (CertPathReviewerException e17) {
                                        e = e17;
                                        addNotification(e.getErrorMessage(), i15);
                                    }
                                } catch (CertPathReviewerException e18) {
                                    e = e18;
                                    str2 = str5;
                                    addNotification(e.getErrorMessage(), i15);
                                    str4 = str;
                                    str5 = str2;
                                }
                            }
                        } else {
                            str = str4;
                            str2 = str5;
                        }
                    } catch (CertPathReviewerException e19) {
                        e = e19;
                        str = str4;
                    }
                    str4 = str;
                    str5 = str2;
                }
            } else {
                str = "CertPathReviewer.crlIssuerException";
                str2 = "CertPathReviewer.distrPtExtError";
                z16 = z15;
            }
            if (x509crl2 != null) {
                if (x509Certificate2 != null && (keyUsage = x509Certificate2.getKeyUsage()) != null && (keyUsage.length <= 6 || !keyUsage[6])) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.noCrlSigningPermited"));
                }
                if (publicKey == null) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlNoIssuerPublicKey"));
                }
                try {
                    x509crl2.verify(publicKey, BouncyCastleProvider.PROVIDER_NAME);
                    X509CRLEntry revokedCertificate = x509crl2.getRevokedCertificate(x509Certificate.getSerialNumber());
                    if (revokedCertificate != null) {
                        if (revokedCertificate.hasExtensions()) {
                            try {
                                ASN1Enumerated aSN1Enumerated = ASN1Enumerated.getInstance(CertPathValidatorUtilities.getExtensionValue(revokedCertificate, Extension.reasonCode.getId()));
                                if (aSN1Enumerated != null) {
                                    str3 = CertPathValidatorUtilities.crlReasons[aSN1Enumerated.intValueExact()];
                                } else {
                                    str3 = null;
                                }
                            } catch (AnnotatedException e25) {
                                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlReasonExtError"), e25);
                            }
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str3 = CertPathValidatorUtilities.crlReasons[7];
                        }
                        LocaleString localeString = new LocaleString(RESOURCE_NAME, str3);
                        if (!date.before(revokedCertificate.getRevocationDate())) {
                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.certRevoked", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}));
                        }
                        errorBundleCreateErrorBundle = createErrorBundle("CertPathReviewer.revokedAfterValidation", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString});
                    } else {
                        errorBundleCreateErrorBundle = createErrorBundle("CertPathReviewer.notRevoked");
                    }
                    addNotification(errorBundleCreateErrorBundle, i15);
                    Date nextUpdate3 = x509crl2.getNextUpdate();
                    if (nextUpdate3 != null && !date.before(nextUpdate3)) {
                        addNotification(createErrorBundle("CertPathReviewer.crlUpdateAvailable", new Object[]{new TrustedInput(nextUpdate3)}), i15);
                    }
                    try {
                        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl2, CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                        try {
                            ASN1Primitive extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl2, CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                            if (extensionValue2 != null) {
                                X509CRLStoreSelector x509CRLStoreSelector2 = new X509CRLStoreSelector();
                                try {
                                    x509CRLStoreSelector2.addIssuerName(CertPathValidatorUtilities.getIssuerPrincipal(x509crl2).getEncoded());
                                    x509CRLStoreSelector2.setMinCRLNumber(((ASN1Integer) extensionValue2).getPositiveValue());
                                    try {
                                        x509CRLStoreSelector2.setMaxCRLNumber(((ASN1Integer) CertPathValidatorUtilities.getExtensionValue(x509crl2, CertPathValidatorUtilities.CRL_NUMBER)).getPositiveValue().subtract(BigInteger.valueOf(1L)));
                                        try {
                                            Iterator it6 = PKIXCRLUtil.findCRLs(x509CRLStoreSelector2, pKIXParameters).iterator();
                                            do {
                                                if (!it6.hasNext()) {
                                                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.noBaseCRL"));
                                                }
                                                try {
                                                } catch (AnnotatedException e26) {
                                                    throw new CertPathReviewerException(createErrorBundle(str2), e26);
                                                }
                                            } while (!Objects.areEqual(extensionValue, CertPathValidatorUtilities.getExtensionValue((X509CRL) it6.next(), CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT)));
                                        } catch (AnnotatedException e27) {
                                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlExtractionError"), e27);
                                        }
                                    } catch (AnnotatedException e28) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlNbrExtError"), e28);
                                    }
                                } catch (IOException e29) {
                                    throw new CertPathReviewerException(createErrorBundle(str), e29);
                                }
                            }
                            if (extensionValue != null) {
                                IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(extensionValue);
                                try {
                                    BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                                    if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlOnlyUserCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlOnlyCaCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlOnlyAttrCert"));
                                    }
                                } catch (AnnotatedException e35) {
                                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlBCExtError"), e35);
                                }
                            }
                        } catch (AnnotatedException unused) {
                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.deltaCrlExtError"));
                        }
                    } catch (AnnotatedException unused2) {
                        throw new CertPathReviewerException(createErrorBundle(str2));
                    }
                } catch (Exception e36) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlVerifyFailed"), e36);
                }
            }
            if (!z16) {
                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.noValidCrlFound"));
            }
        } catch (IOException e37) {
            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlIssuerException"), e37);
        }
    }

    protected void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i15) throws CertPathReviewerException {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i15);
    }

    protected void doChecks() {
        if (!this.initialized) {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        }
        if (this.notifications != null) {
            return;
        }
        int i15 = this.f149409n;
        this.notifications = new List[i15 + 1];
        this.errors = new List[i15 + 1];
        int i16 = 0;
        while (true) {
            List[] listArr = this.notifications;
            if (i16 >= listArr.length) {
                checkSignatures();
                checkNameConstraints();
                checkPathLength();
                checkPolicy();
                checkCriticalExtensions();
                return;
            }
            listArr[i16] = new ArrayList();
            this.errors[i16] = new ArrayList();
            i16++;
        }
    }

    protected Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i15 = 0; i15 < names.length; i15++) {
                        if (names[i15].getTagNo() == 6) {
                            vector.add(((ASN1IA5String) names[i15].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.f149409n;
    }

    public List getErrors(int i15) {
        doChecks();
        return this.errors[i15 + 1];
    }

    public List getNotifications(int i15) {
        doChecks();
        return this.notifications[i15 + 1];
    }

    protected Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i15 = 0; i15 < accessDescriptions.length; i15++) {
                if (accessDescriptions[i15].getAccessMethod().equals((ASN1Primitive) AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i15].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((ASN1IA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() {
        doChecks();
        return this.trustAnchor;
    }

    protected Collection getTrustAnchors(X509Certificate x509Certificate, Set set) throws CertPathReviewerException {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(JcaX509ExtensionUtils.parseExtensionValue(extensionValue));
                if (authorityKeyIdentifier.getAuthorityCertSerialNumber() != null) {
                    x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                } else {
                    ASN1OctetString keyIdentifierObject = authorityKeyIdentifier.getKeyIdentifierObject();
                    if (keyIdentifierObject != null) {
                        x509CertSelector.setSubjectKeyIdentifier(keyIdentifierObject.getEncoded(ASN1Encoding.DER));
                    }
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public void init(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        if (this.initialized) {
            throw new IllegalStateException("object is already initialized!");
        }
        this.initialized = true;
        if (certPath == null) {
            throw new NullPointerException("certPath was null");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        if (certificates.size() != 1) {
            HashSet hashSet = new HashSet();
            Iterator<TrustAnchor> it = pKIXParameters.getTrustAnchors().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getTrustedCert());
            }
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 != certificates.size(); i15++) {
                if (!hashSet.contains(certificates.get(i15))) {
                    arrayList.add(certificates.get(i15));
                }
            }
            try {
                this.certPath = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCertPath(arrayList);
                this.certs = arrayList;
            } catch (GeneralSecurityException unused) {
                throw new IllegalStateException("unable to rebuild certpath");
            }
        } else {
            this.certPath = certPath;
            this.certs = certPath.getCertificates();
        }
        this.f149409n = this.certs.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.emptyCertPath"));
        }
        this.pkixParams = (PKIXParameters) pKIXParameters.clone();
        Date date = new Date();
        this.currentDate = date;
        this.validDate = CertPathValidatorUtilities.getValidityDate(this.pkixParams, date);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    public boolean isValidCertPath() {
        doChecks();
        int i15 = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i15 >= listArr.length) {
                return true;
            }
            if (!listArr[i15].isEmpty()) {
                return false;
            }
            i15++;
        }
    }

    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        init(certPath, pKIXParameters);
    }

    private static ErrorBundle createErrorBundle(String str, Object[] objArr) {
        ErrorBundle errorBundle = new ErrorBundle(RESOURCE_NAME, str, objArr);
        errorBundle.setClassLoader(PKIXCertPathReviewer.class.getClassLoader());
        return errorBundle;
    }

    protected void addError(ErrorBundle errorBundle, int i15) {
        if (i15 < -1 || i15 >= this.f149409n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i15 + 1].add(errorBundle);
    }

    protected void addNotification(ErrorBundle errorBundle, int i15) {
        if (i15 < -1 || i15 >= this.f149409n) {
            throw new IndexOutOfBoundsException();
        }
        this.notifications[i15 + 1].add(errorBundle);
    }

    public List[] getErrors() {
        doChecks();
        return this.errors;
    }

    public List[] getNotifications() {
        doChecks();
        return this.notifications;
    }
}
