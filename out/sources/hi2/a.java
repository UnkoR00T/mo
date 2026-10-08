package hi2;

import ii2.c;
import ii2.e;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.CMSAttributes;
import org.bouncycastle.asn1.cms.Time;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.cms.CMSEnvelopedData;
import org.bouncycastle.cms.CMSEnvelopedDataGenerator;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator;
import org.bouncycastle.cms.CMSSignedData;
import org.bouncycastle.cms.CMSSignedDataGenerator;
import org.bouncycastle.cms.DefaultCMSSignatureAlgorithmNameGenerator;
import org.bouncycastle.cms.DefaultSignedAttributeTableGenerator;
import org.bouncycastle.cms.RecipientInformation;
import org.bouncycastle.cms.SignerInfoGenerator;
import org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder;
import org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder;
import org.bouncycastle.cms.jcajce.JceKeyTransEnvelopedRecipient;
import org.bouncycastle.cms.jcajce.JceKeyTransRecipientId;
import org.bouncycastle.cms.jcajce.JceKeyTransRecipientInfoGenerator;
import org.bouncycastle.operator.AlgorithmNameFinder;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.DefaultAlgorithmNameFinder;
import org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.operator.SignatureAlgorithmIdentifierFinder;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f84993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f84994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f84995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f84996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f84997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f84998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AlgorithmNameFinder f84999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CMSSignatureAlgorithmNameGenerator f85000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SignatureAlgorithmIdentifierFinder f85001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final JcaX509CertificateConverter f85002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final DigestCalculatorProvider f85003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SecureRandom f85004l;

    /* JADX INFO: renamed from: hi2.a$a, reason: collision with other inner class name */
    public static final class C1982a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Provider f85005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Provider f85006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Provider f85007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Provider f85008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Provider f85009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Provider f85010f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private AlgorithmNameFinder f85011g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CMSSignatureAlgorithmNameGenerator f85012h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private SignatureAlgorithmIdentifierFinder f85013i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private JcaX509CertificateConverter f85014j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private DigestCalculatorProvider f85015k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private SecureRandom f85016l;

        /* JADX INFO: Access modifiers changed from: private */
        public AlgorithmNameFinder n() {
            AlgorithmNameFinder algorithmNameFinder = this.f85011g;
            return algorithmNameFinder != null ? algorithmNameFinder : new DefaultAlgorithmNameFinder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JcaX509CertificateConverter o() {
            JcaX509CertificateConverter jcaX509CertificateConverter = this.f85014j;
            return jcaX509CertificateConverter != null ? jcaX509CertificateConverter : new JcaX509CertificateConverter();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Provider p() {
            return this.f85008d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Provider q() {
            return this.f85007c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DigestCalculatorProvider r() {
            try {
                DigestCalculatorProvider digestCalculatorProvider = this.f85015k;
                return digestCalculatorProvider != null ? digestCalculatorProvider : new JcaDigestCalculatorProviderBuilder().build();
            } catch (OperatorCreationException e15) {
                throw ii2.b.a(e15);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Provider s() {
            return this.f85006b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Provider t() {
            return this.f85005a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SecureRandom u() {
            SecureRandom secureRandom = this.f85016l;
            return secureRandom != null ? secureRandom : li2.b.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SignatureAlgorithmIdentifierFinder v() {
            SignatureAlgorithmIdentifierFinder signatureAlgorithmIdentifierFinder = this.f85013i;
            return signatureAlgorithmIdentifierFinder != null ? signatureAlgorithmIdentifierFinder : new DefaultSignatureAlgorithmIdentifierFinder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CMSSignatureAlgorithmNameGenerator w() {
            CMSSignatureAlgorithmNameGenerator cMSSignatureAlgorithmNameGenerator = this.f85012h;
            return cMSSignatureAlgorithmNameGenerator != null ? cMSSignatureAlgorithmNameGenerator : new DefaultCMSSignatureAlgorithmNameGenerator();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Provider x() {
            return this.f85009e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Provider y() {
            return this.f85010f;
        }

        public a m() {
            return new a(this);
        }

        private C1982a() {
        }
    }

    public static C1982a c() {
        return new C1982a();
    }

    private OutputEncryptor d(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        JceCMSContentEncryptorBuilder jceCMSContentEncryptorBuilder = new JceCMSContentEncryptorBuilder(aSN1ObjectIdentifier);
        jceCMSContentEncryptorBuilder.setSecureRandom(this.f85004l);
        Provider provider = this.f84995c;
        if (provider != null) {
            jceCMSContentEncryptorBuilder.setProvider(provider);
        }
        return jceCMSContentEncryptorBuilder.build();
    }

    private ContentSigner e(PrivateKey privateKey, String str) {
        JcaContentSignerBuilder jcaContentSignerBuilder = new JcaContentSignerBuilder(str);
        jcaContentSignerBuilder.setSecureRandom(this.f85004l);
        Provider provider = this.f84997e;
        if (provider != null) {
            jcaContentSignerBuilder.setProvider(provider);
        }
        return jcaContentSignerBuilder.build(privateKey);
    }

    private JceKeyTransEnvelopedRecipient f(PrivateKey privateKey) {
        JceKeyTransEnvelopedRecipient jceKeyTransEnvelopedRecipient = new JceKeyTransEnvelopedRecipient(privateKey);
        Provider provider = this.f84994b;
        if (provider != null) {
            jceKeyTransEnvelopedRecipient.setProvider(provider);
        }
        Provider provider2 = this.f84996d;
        if (provider2 != null) {
            jceKeyTransEnvelopedRecipient.setContentProvider(provider2);
        }
        jceKeyTransEnvelopedRecipient.setKeySizeValidation(true);
        return jceKeyTransEnvelopedRecipient;
    }

    private JceKeyTransRecipientInfoGenerator g(X509Certificate x509Certificate) {
        JceKeyTransRecipientInfoGenerator jceKeyTransRecipientInfoGenerator = new JceKeyTransRecipientInfoGenerator(x509Certificate);
        Provider provider = this.f84993a;
        if (provider != null) {
            jceKeyTransRecipientInfoGenerator.setProvider(provider);
        }
        return jceKeyTransRecipientInfoGenerator;
    }

    private SignerInfoGenerator h(X509Certificate x509Certificate, PrivateKey privateKey, String str, Date date) {
        JcaSignerInfoGeneratorBuilder jcaSignerInfoGeneratorBuilder = new JcaSignerInfoGeneratorBuilder(this.f85003k);
        if (date != null) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(new Attribute(CMSAttributes.signingTime, new DERSet(new Time(date))));
            jcaSignerInfoGeneratorBuilder.setSignedAttributeGenerator(new DefaultSignedAttributeTableGenerator(new AttributeTable(aSN1EncodableVector)));
        }
        return jcaSignerInfoGeneratorBuilder.build(e(privateKey, str), x509Certificate);
    }

    public byte[] a(CMSEnvelopedData cMSEnvelopedData, X509Certificate x509Certificate, PrivateKey privateKey) {
        Objects.requireNonNull(cMSEnvelopedData, "Enveloped data must not be null.");
        Objects.requireNonNull(x509Certificate, "Recipient certificate must not be null.");
        Objects.requireNonNull(privateKey, "Recipient private key must not be null.");
        RecipientInformation recipientInformation = cMSEnvelopedData.getRecipientInfos().get(new JceKeyTransRecipientId(x509Certificate));
        if (recipientInformation == null) {
            throw new c(String.format("Data is not encrypted for recipient %s.", x509Certificate.getSubjectDN()));
        }
        try {
            return recipientInformation.getContent(f(privateKey));
        } catch (CMSException e15) {
            throw new c(String.format("Failed to decrypt data for recipient %s.", x509Certificate.getSubjectDN()), e15);
        }
    }

    public CMSEnvelopedData b(byte[] bArr, X509Certificate x509Certificate, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Objects.requireNonNull(bArr, "Plaintext must not be null.");
        Objects.requireNonNull(x509Certificate, "Recipient certificate must not be null.");
        Objects.requireNonNull(aSN1ObjectIdentifier, "Content encryption algorithm must not be null.");
        try {
            CMSEnvelopedDataGenerator cMSEnvelopedDataGenerator = new CMSEnvelopedDataGenerator();
            cMSEnvelopedDataGenerator.addRecipientInfoGenerator(g(x509Certificate));
            return cMSEnvelopedDataGenerator.generate(new CMSProcessableByteArray(bArr), d(aSN1ObjectIdentifier));
        } catch (CertificateEncodingException e15) {
            throw new e(e15);
        } catch (CMSException e16) {
            throw new c(String.format("Failed to encrypt data for recipient %s.", x509Certificate.getSubjectDN()), e16);
        }
    }

    public CMSSignedData i(byte[] bArr, X509Certificate x509Certificate, PrivateKey privateKey, Set<X509Certificate> set, ASN1ObjectIdentifier aSN1ObjectIdentifier, Date date) {
        Objects.requireNonNull(bArr, "Data to sign must not be null.");
        Objects.requireNonNull(x509Certificate, "Signing certificate must not be null.");
        Objects.requireNonNull(privateKey, "Signing private key must not be null.");
        Objects.requireNonNull(set, "Certificates to attach must not be null.");
        Objects.requireNonNull(aSN1ObjectIdentifier, "Algorithm must not be null.");
        Objects.requireNonNull(date, "Current server date must not be null.");
        try {
            x509Certificate.checkValidity(date);
            try {
                CMSSignedDataGenerator cMSSignedDataGenerator = new CMSSignedDataGenerator();
                cMSSignedDataGenerator.addSignerInfoGenerator(h(x509Certificate, privateKey, this.f84999g.getAlgorithmName(aSN1ObjectIdentifier), date));
                Iterator<X509Certificate> it = set.iterator();
                while (it.hasNext()) {
                    cMSSignedDataGenerator.addCertificate(new JcaX509CertificateHolder(it.next()));
                }
                return cMSSignedDataGenerator.generate(new CMSProcessableByteArray(bArr), true);
            } catch (CertificateEncodingException e15) {
                throw new e(e15);
            } catch (CMSException e16) {
                throw new c(String.format("Failed to perform signing with private key of %s.", x509Certificate.getSubjectDN()), e16);
            } catch (OperatorCreationException e17) {
                throw ii2.b.a(e17);
            }
        } catch (CertificateExpiredException | CertificateNotYetValidException e18) {
            throw new c(String.format("Certificate %s is outside of validity period (%s to %s).", x509Certificate.getSubjectDN(), x509Certificate.getNotBefore(), x509Certificate.getNotAfter()), e18);
        }
    }

    private a(C1982a c1982a) {
        this.f84993a = c1982a.t();
        this.f84994b = c1982a.s();
        this.f84995c = c1982a.q();
        this.f84996d = c1982a.p();
        this.f84997e = c1982a.x();
        this.f84998f = c1982a.y();
        this.f84999g = c1982a.n();
        this.f85000h = c1982a.w();
        this.f85001i = c1982a.v();
        this.f85002j = c1982a.o();
        this.f85003k = c1982a.r();
        this.f85004l = c1982a.u();
    }
}
