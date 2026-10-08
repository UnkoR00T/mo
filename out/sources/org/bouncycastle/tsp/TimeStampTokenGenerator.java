package org.bouncycastle.tsp;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SimpleTimeZone;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.LocaleUtil;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.ess.ESSCertID;
import org.bouncycastle.asn1.ess.ESSCertIDv2;
import org.bouncycastle.asn1.ess.SigningCertificate;
import org.bouncycastle.asn1.ess.SigningCertificateV2;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.tsp.Accuracy;
import org.bouncycastle.asn1.tsp.MessageImprint;
import org.bouncycastle.asn1.tsp.TSTInfo;
import org.bouncycastle.asn1.tsp.TimeStampReq;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuerSerial;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.cms.CMSSignedDataGenerator;
import org.bouncycastle.cms.SignerInfoGenerator;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Store;

/* JADX INFO: loaded from: classes5.dex */
public class TimeStampTokenGenerator {
    public static final int R_HUNDREDTHS_OF_SECONDS = 2;
    public static final int R_MICROSECONDS = 2;
    public static final int R_MILLISECONDS = 3;
    public static final int R_SECONDS = 0;
    public static final int R_TENTHS_OF_SECONDS = 1;
    private int accuracyMicros;
    private int accuracyMillis;
    private int accuracySeconds;
    private List attrCerts;
    private List certs;
    private List crls;
    private Locale locale;
    boolean ordering;
    private Map otherRevoc;
    private int resolution;
    private SignerInfoGenerator signerInfoGen;
    GeneralName tsa;
    private ASN1ObjectIdentifier tsaPolicyOID;

    public TimeStampTokenGenerator(SignerInfoGenerator signerInfoGenerator, DigestCalculator digestCalculator, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(signerInfoGenerator, digestCalculator, aSN1ObjectIdentifier, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b A[PHI: r4
      0x006b: PHI (r4v1 int) = (r4v0 int), (r4v4 int) binds: [B:23:0x0079, B:20:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    private ASN1GeneralizedTime createGeneralizedTime(Date date) throws TSPException {
        int i15;
        SimpleDateFormat simpleDateFormat = this.locale == null ? new SimpleDateFormat("yyyyMMddHHmmss.SSS", LocaleUtil.EN_Locale) : new SimpleDateFormat("yyyyMMddHHmmss.SSS", this.locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        StringBuilder sb5 = new StringBuilder(simpleDateFormat.format(date));
        int iIndexOf = sb5.indexOf(".");
        if (iIndexOf < 0) {
            sb5.append("Z");
            return new ASN1GeneralizedTime(sb5.toString());
        }
        int i16 = this.resolution;
        if (i16 == 1) {
            i15 = iIndexOf + 2;
            if (sb5.length() > i15) {
                sb5.delete(i15, sb5.length());
            }
        } else if (i16 == 2) {
            i15 = iIndexOf + 3;
            if (sb5.length() > i15) {
                sb5.delete(i15, sb5.length());
            }
        } else if (i16 != 3) {
            throw new TSPException("unknown time-stamp resolution: " + this.resolution);
        }
        while (sb5.charAt(sb5.length() - 1) == '0') {
            sb5.deleteCharAt(sb5.length() - 1);
        }
        if (sb5.length() - 1 == iIndexOf) {
            sb5.deleteCharAt(sb5.length() - 1);
        }
        sb5.append("Z");
        return new ASN1GeneralizedTime(sb5.toString());
    }

    public void addAttributeCertificates(Store store) {
        this.attrCerts.addAll(store.getMatches(null));
    }

    public void addCRLs(Store store) {
        this.crls.addAll(store.getMatches(null));
    }

    public void addCertificates(Store store) {
        this.certs.addAll(store.getMatches(null));
    }

    public void addOtherRevocationInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, Store store) {
        this.otherRevoc.put(aSN1ObjectIdentifier, store.getMatches(null));
    }

    public TimeStampToken generate(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date) {
        return generate(timeStampRequest, bigInteger, date, null);
    }

    public void setAccuracyMicros(int i15) {
        this.accuracyMicros = i15;
    }

    public void setAccuracyMillis(int i15) {
        this.accuracyMillis = i15;
    }

    public void setAccuracySeconds(int i15) {
        this.accuracySeconds = i15;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setOrdering(boolean z15) {
        this.ordering = z15;
    }

    public void setResolution(int i15) {
        this.resolution = i15;
    }

    public void setTSA(GeneralName generalName) {
        this.tsa = generalName;
    }

    public TimeStampTokenGenerator(final SignerInfoGenerator signerInfoGenerator, DigestCalculator digestCalculator, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z15) throws TSPException {
        this.resolution = 0;
        this.locale = null;
        this.accuracySeconds = -1;
        this.accuracyMillis = -1;
        this.accuracyMicros = -1;
        this.ordering = false;
        this.tsa = null;
        this.certs = new ArrayList();
        this.crls = new ArrayList();
        this.attrCerts = new ArrayList();
        this.otherRevoc = new HashMap();
        this.signerInfoGen = signerInfoGenerator;
        this.tsaPolicyOID = aSN1ObjectIdentifier;
        if (!signerInfoGenerator.hasAssociatedCertificate()) {
            throw new IllegalArgumentException("SignerInfoGenerator must have an associated certificate");
        }
        X509CertificateHolder associatedCertificate = signerInfoGenerator.getAssociatedCertificate();
        TSPUtil.validateCertificate(associatedCertificate);
        ASN1ObjectIdentifier algorithm = digestCalculator.getAlgorithmIdentifier().getAlgorithm();
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(associatedCertificate.getEncoded());
            outputStream.close();
            DEROctetString dEROctetString = new DEROctetString(digestCalculator.getDigest());
            IssuerSerial issuerSerial = z15 ? new IssuerSerial(new GeneralNames(new GeneralName(associatedCertificate.getIssuer())), associatedCertificate.toASN1Structure().getSerialNumber()) : null;
            if (OIWObjectIdentifiers.idSHA1.equals((ASN1Primitive) algorithm)) {
                final ESSCertID eSSCertID = new ESSCertID(dEROctetString, issuerSerial);
                this.signerInfoGen = new SignerInfoGenerator(signerInfoGenerator, new CMSAttributeTableGenerator() { // from class: org.bouncycastle.tsp.TimeStampTokenGenerator.1
                    @Override // org.bouncycastle.cms.CMSAttributeTableGenerator
                    public AttributeTable getAttributes(Map map) {
                        AttributeTable attributes = signerInfoGenerator.getSignedAttributeTableGenerator().getAttributes(map);
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.id_aa_signingCertificate;
                        return attributes.get(aSN1ObjectIdentifier2) == null ? attributes.add(aSN1ObjectIdentifier2, new SigningCertificate(eSSCertID)) : attributes;
                    }
                }, signerInfoGenerator.getUnsignedAttributeTableGenerator());
            } else {
                final ESSCertIDv2 eSSCertIDv2 = new ESSCertIDv2(new AlgorithmIdentifier(algorithm), dEROctetString, issuerSerial);
                this.signerInfoGen = new SignerInfoGenerator(signerInfoGenerator, new CMSAttributeTableGenerator() { // from class: org.bouncycastle.tsp.TimeStampTokenGenerator.2
                    @Override // org.bouncycastle.cms.CMSAttributeTableGenerator
                    public AttributeTable getAttributes(Map map) {
                        AttributeTable attributes = signerInfoGenerator.getSignedAttributeTableGenerator().getAttributes(map);
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.id_aa_signingCertificateV2;
                        return attributes.get(aSN1ObjectIdentifier2) == null ? attributes.add(aSN1ObjectIdentifier2, new SigningCertificateV2(eSSCertIDv2)) : attributes;
                    }
                }, signerInfoGenerator.getUnsignedAttributeTableGenerator());
            }
        } catch (IOException e15) {
            throw new TSPException("Exception processing certificate.", e15);
        }
    }

    public TimeStampToken generate(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date, Extensions extensions) throws TSPException {
        TimeStampReq aSN1Structure = timeStampRequest.toASN1Structure();
        MessageImprint messageImprint = aSN1Structure.getMessageImprint();
        int i15 = this.accuracySeconds;
        Accuracy accuracy = (i15 > 0 || this.accuracyMillis > 0 || this.accuracyMicros > 0) ? new Accuracy(i15 > 0 ? new ASN1Integer(this.accuracySeconds) : null, this.accuracyMillis > 0 ? new ASN1Integer(this.accuracyMillis) : null, this.accuracyMicros > 0 ? new ASN1Integer(this.accuracyMicros) : null) : null;
        boolean z15 = this.ordering;
        ASN1Boolean aSN1Boolean = z15 ? ASN1Boolean.getInstance(z15) : null;
        ASN1Integer nonce = aSN1Structure.getNonce();
        ASN1ObjectIdentifier reqPolicy = aSN1Structure.getReqPolicy();
        if (reqPolicy == null) {
            reqPolicy = this.tsaPolicyOID;
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = reqPolicy;
        Extensions extensions2 = timeStampRequest.getExtensions();
        if (extensions != null) {
            ExtensionsGenerator extensionsGenerator = new ExtensionsGenerator();
            if (extensions2 != null) {
                Enumeration enumerationOids = extensions2.oids();
                while (enumerationOids.hasMoreElements()) {
                    extensionsGenerator.addExtension(extensions2.getExtension(ASN1ObjectIdentifier.getInstance(enumerationOids.nextElement())));
                }
            }
            Enumeration enumerationOids2 = extensions.oids();
            while (enumerationOids2.hasMoreElements()) {
                extensionsGenerator.addExtension(extensions.getExtension(ASN1ObjectIdentifier.getInstance(enumerationOids2.nextElement())));
            }
            extensions2 = extensionsGenerator.generate();
        }
        Extensions extensions3 = extensions2;
        TSTInfo tSTInfo = new TSTInfo(aSN1ObjectIdentifier, messageImprint, new ASN1Integer(bigInteger), this.resolution == 0 ? this.locale == null ? new ASN1GeneralizedTime(date) : new ASN1GeneralizedTime(date, this.locale) : createGeneralizedTime(date), accuracy, aSN1Boolean, nonce, this.tsa, extensions3);
        try {
            CMSSignedDataGenerator cMSSignedDataGenerator = new CMSSignedDataGenerator();
            if (timeStampRequest.getCertReq()) {
                cMSSignedDataGenerator.addCertificates(new CollectionStore(this.certs));
                cMSSignedDataGenerator.addAttributeCertificates(new CollectionStore(this.attrCerts));
            }
            cMSSignedDataGenerator.addCRLs(new CollectionStore(this.crls));
            if (!this.otherRevoc.isEmpty()) {
                for (ASN1ObjectIdentifier aSN1ObjectIdentifier2 : this.otherRevoc.keySet()) {
                    cMSSignedDataGenerator.addOtherRevocationInfo(aSN1ObjectIdentifier2, new CollectionStore((Collection) this.otherRevoc.get(aSN1ObjectIdentifier2)));
                }
            }
            cMSSignedDataGenerator.addSignerInfoGenerator(this.signerInfoGen);
            return new TimeStampToken(cMSSignedDataGenerator.generate(new CMSProcessableByteArray(PKCSObjectIdentifiers.id_ct_TSTInfo, tSTInfo.getEncoded(ASN1Encoding.DER)), true));
        } catch (IOException e15) {
            throw new TSPException("Exception encoding info", e15);
        } catch (CMSException e16) {
            throw new TSPException("Error generating time-stamp token", e16);
        }
    }
}
