package zg0;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.time.Instant;
import java.util.AbstractMap;
import java.util.Date;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.CMSAttributes;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.Time;
import org.bouncycastle.asn1.ess.ESSCertIDv2;
import org.bouncycastle.asn1.ess.SigningCertificateV2;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.cms.CMSSignedData;
import org.bouncycastle.cms.CMSSignedDataGenerator;
import org.bouncycastle.cms.DefaultSignedAttributeTableGenerator;
import org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;

/* JADX INFO: loaded from: classes6.dex */
class m {

    class a implements ContentSigner {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f235135a;

        a(byte[] bArr) {
            this.f235135a = bArr;
        }

        @Override // org.bouncycastle.operator.ContentSigner
        public AlgorithmIdentifier getAlgorithmIdentifier() {
            return new AlgorithmIdentifier(X9ObjectIdentifiers.ecdsa_with_SHA384);
        }

        @Override // org.bouncycastle.operator.ContentSigner
        public OutputStream getOutputStream() {
            return new ByteArrayOutputStream();
        }

        @Override // org.bouncycastle.operator.ContentSigner
        public byte[] getSignature() {
            return this.f235135a;
        }
    }

    m() {
    }

    public static /* synthetic */ AttributeTable a(AttributeTable attributeTable, Map map) {
        return attributeTable;
    }

    private AttributeTable b(byte[] bArr, X509Certificate x509Certificate, Instant instant) throws NoSuchAlgorithmException {
        byte[] bArrE = e(bArr);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha384;
        return new DefaultSignedAttributeTableGenerator(new AttributeTable(new Attribute(CMSAttributes.signingTime, new DERSet(new Time(Date.from(instant)))))).getAttributes(k.a(new Map.Entry[]{new AbstractMap.SimpleEntry(CMSAttributeTableGenerator.CONTENT_TYPE, CMSObjectIdentifiers.data), new AbstractMap.SimpleEntry(CMSAttributeTableGenerator.DIGEST_ALGORITHM_IDENTIFIER, new AlgorithmIdentifier(aSN1ObjectIdentifier)), new AbstractMap.SimpleEntry(CMSAttributeTableGenerator.SIGNATURE_ALGORITHM_IDENTIFIER, new AlgorithmIdentifier(X9ObjectIdentifiers.ecdsa_with_SHA384)), new AbstractMap.SimpleEntry(CMSAttributeTableGenerator.DIGEST, bArrE)})).add(PKCSObjectIdentifiers.id_aa_signingCertificateV2, new SigningCertificateV2(new ESSCertIDv2[]{new ESSCertIDv2(new AlgorithmIdentifier(aSN1ObjectIdentifier), MessageDigest.getInstance("SHA-384").digest(x509Certificate.getEncoded()))}));
    }

    private byte[] e(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-384");
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    CMSSignedData c(byte[] bArr, X509Certificate x509Certificate, byte[] bArr2, Instant instant) throws NoSuchAlgorithmException {
        final AttributeTable attributeTableB = b(bArr, x509Certificate, instant);
        CMSSignedDataGenerator cMSSignedDataGenerator = new CMSSignedDataGenerator();
        cMSSignedDataGenerator.addSignerInfoGenerator(new JcaSignerInfoGeneratorBuilder(new JcaDigestCalculatorProviderBuilder().setProvider(new BouncyCastleProvider()).build()).setSignedAttributeGenerator(new CMSAttributeTableGenerator() { // from class: zg0.l
            @Override // org.bouncycastle.cms.CMSAttributeTableGenerator
            public final AttributeTable getAttributes(Map map) {
                return m.a(attributeTableB, map);
            }
        }).build(new a(bArr2), x509Certificate));
        cMSSignedDataGenerator.addCertificate(new JcaX509CertificateHolder(x509Certificate));
        return cMSSignedDataGenerator.generate(new CMSProcessableByteArray(bArr), false);
    }

    byte[] d(byte[] bArr, X509Certificate x509Certificate, Instant instant) {
        return e(new DERSet(b(bArr, x509Certificate, instant).toASN1EncodableVector()).getEncoded(ASN1Encoding.DER));
    }
}
