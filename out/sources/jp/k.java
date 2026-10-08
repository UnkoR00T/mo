package jp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.EncryptedContentInfo;
import org.bouncycastle.asn1.cms.EnvelopedData;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.KeyTransRecipientInfo;
import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.asn1.cms.RecipientIdentifier;
import org.bouncycastle.asn1.cms.RecipientInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSEnvelopedData;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.KeyTransRecipientId;
import org.bouncycastle.cms.RecipientId;
import org.bouncycastle.cms.RecipientInformation;
import org.bouncycastle.cms.jcajce.JceKeyTransEnvelopedRecipient;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends n {
    public k() {
    }

    private void H(StringBuilder sb5, KeyTransRecipientId keyTransRecipientId, X509Certificate x509Certificate, X509CertificateHolder x509CertificateHolder) {
        BigInteger serialNumber = keyTransRecipientId.getSerialNumber();
        if (serialNumber != null) {
            BigInteger serialNumber2 = x509Certificate.getSerialNumber();
            String string = serialNumber2 != null ? serialNumber2.toString(16) : "unknown";
            sb5.append("serial-#: rid ");
            sb5.append(serialNumber.toString(16));
            sb5.append(" vs. cert ");
            sb5.append(string);
            sb5.append(" issuer: rid '");
            sb5.append(keyTransRecipientId.getIssuer());
            sb5.append("' vs. cert '");
            sb5.append(x509CertificateHolder == null ? "null" : x509CertificateHolder.getIssuer());
            sb5.append("' ");
        }
    }

    private KeyTransRecipientInfo I(X509Certificate x509Certificate, byte[] bArr) throws IOException, InvalidKeyException {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(x509Certificate.getTBSCertificate());
        TBSCertificate tBSCertificate = TBSCertificate.getInstance(aSN1InputStream.readObject());
        aSN1InputStream.close();
        AlgorithmIdentifier algorithm = tBSCertificate.getSubjectPublicKeyInfo().getAlgorithm();
        IssuerAndSerialNumber issuerAndSerialNumber = new IssuerAndSerialNumber(tBSCertificate.getIssuer(), tBSCertificate.getSerialNumber().getValue());
        try {
            Cipher cipher = Cipher.getInstance(algorithm.getAlgorithm().getId(), p.a());
            cipher.init(1, x509Certificate.getPublicKey());
            return new KeyTransRecipientInfo(new RecipientIdentifier(issuerAndSerialNumber), algorithm, new DEROctetString(cipher.doFinal(bArr)));
        } catch (NoSuchAlgorithmException e15) {
            throw new RuntimeException("Could not find a suitable javax.crypto provider", e15);
        } catch (NoSuchPaddingException e16) {
            throw new RuntimeException("Could not find a suitable javax.crypto provider", e16);
        }
    }

    private byte[][] J(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        i iVar = (i) s();
        byte[][] bArr2 = new byte[iVar.c()][];
        Iterator<j> itD = iVar.d();
        int i15 = 0;
        while (itD.hasNext()) {
            j next = itD.next();
            X509Certificate x509CertificateB = next.b();
            int iG = next.a().g();
            byte[] bArr3 = new byte[24];
            System.arraycopy(bArr, 0, bArr3, 0, 20);
            bArr3[20] = (byte) (iG >>> 24);
            bArr3[21] = (byte) (iG >>> 16);
            bArr3[22] = (byte) (iG >>> 8);
            bArr3[23] = (byte) iG;
            ASN1Primitive aSN1PrimitiveK = K(bArr3, x509CertificateB);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            aSN1PrimitiveK.encodeTo(byteArrayOutputStream, ASN1Encoding.DER);
            bArr2[i15] = byteArrayOutputStream.toByteArray();
            i15++;
        }
        return bArr2;
    }

    private ASN1Primitive K(byte[] bArr, X509Certificate x509Certificate) throws BadPaddingException, IllegalBlockSizeException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String id5 = PKCSObjectIdentifiers.RC2_CBC.getId();
        try {
            Provider providerA = p.a();
            AlgorithmParameterGenerator algorithmParameterGenerator = AlgorithmParameterGenerator.getInstance(id5, providerA);
            KeyGenerator keyGenerator = KeyGenerator.getInstance(id5, providerA);
            Cipher cipher = Cipher.getInstance(id5, providerA);
            AlgorithmParameters algorithmParametersGenerateParameters = algorithmParameterGenerator.generateParameters();
            ASN1InputStream aSN1InputStream = new ASN1InputStream(algorithmParametersGenerateParameters.getEncoded("ASN.1"));
            ASN1Primitive object = aSN1InputStream.readObject();
            aSN1InputStream.close();
            keyGenerator.init(128);
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            cipher.init(1, secretKeyGenerateKey, algorithmParametersGenerateParameters);
            return new ContentInfo(PKCSObjectIdentifiers.envelopedData, new EnvelopedData((OriginatorInfo) null, new DERSet(new RecipientInfo(I(x509Certificate, secretKeyGenerateKey.getEncoded()))), new EncryptedContentInfo(PKCSObjectIdentifiers.data, new AlgorithmIdentifier(new ASN1ObjectIdentifier(id5), object), new DEROctetString(cipher.doFinal(bArr))), (ASN1Set) null)).toASN1Primitive();
        } catch (NoSuchAlgorithmException e15) {
            throw new IOException("Could not find a suitable javax.crypto provider for algorithm " + id5 + "; possible reason: using an unsigned .jar file", e15);
        } catch (NoSuchPaddingException e16) {
            throw new RuntimeException("Could not find a suitable javax.crypto provider", e16);
        }
    }

    private void L(f fVar, bp.i iVar, byte[][] bArr) {
        e eVar = new e();
        eVar.e(iVar);
        eVar.f(r());
        bp.a aVar = new bp.a();
        for (byte[] bArr2 : bArr) {
            aVar.A3(new bp.p(bArr2));
        }
        eVar.D1().Y4(bp.i.f20883t7, aVar);
        aVar.A2(true);
        fVar.u(eVar);
        bp.i iVar2 = bp.i.f20745g2;
        fVar.E(iVar2);
        fVar.F(iVar2);
        eVar.D1().A2(true);
        z(true);
    }

    @Override // jp.n
    public void x(gp.c cVar) throws IOException {
        byte[] bArrDigest;
        try {
            f fVarK = cVar.K();
            if (fVarK == null) {
                fVarK = new f();
            }
            fVarK.v("Adobe.PubSec");
            fVarK.w(r());
            int iB = b();
            fVarK.J(iB);
            fVarK.s();
            int length = 20;
            byte[] bArr = new byte[20];
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(192, new SecureRandom());
                System.arraycopy(keyGenerator.generateKey().getEncoded(), 0, bArr, 0, 20);
                byte[][] bArrJ = J(bArr);
                int length2 = 20;
                for (byte[] bArr2 : bArrJ) {
                    length2 += bArr2.length;
                }
                byte[] bArr3 = new byte[length2];
                System.arraycopy(bArr, 0, bArr3, 0, 20);
                for (byte[] bArr4 : bArrJ) {
                    System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
                    length += bArr4.length;
                }
                if (iB == 4) {
                    fVarK.G("adbe.pkcs7.s5");
                    bArrDigest = d.b().digest(bArr3);
                    L(fVarK, bp.i.f20853r, bArrJ);
                } else if (iB != 5) {
                    fVarK.G("adbe.pkcs7.s4");
                    bArrDigest = d.b().digest(bArr3);
                    fVarK.B(bArrJ);
                } else {
                    fVarK.G("adbe.pkcs7.s5");
                    bArrDigest = d.c().digest(bArr3);
                    L(fVarK, bp.i.f20864s, bArrJ);
                }
                C(new byte[r() / 8]);
                System.arraycopy(bArrDigest, 0, q(), 0, r() / 8);
                cVar.d1(fVarK);
                cVar.H().r4(fVarK.D1());
            } catch (NoSuchAlgorithmException e15) {
                throw new RuntimeException(e15);
            }
        } catch (GeneralSecurityException e16) {
            throw new IOException(e16);
        }
    }

    @Override // jp.n
    public void y(f fVar, bp.a aVar, b bVar) throws IOException {
        byte[] bArrDigest;
        h hVar;
        e eVar;
        if (!(bVar instanceof h)) {
            throw new IOException("Provided decryption material is not compatible with the document - did you pass a null keyStore?");
        }
        e eVarC = fVar.c();
        if (eVarC != null && eVarC.c() != 0) {
            D(eVarC.c());
            B(eVarC.d());
        } else if (fVar.e() != 0) {
            D(fVar.e());
            B(fVar.r());
        }
        h hVar2 = (h) bVar;
        try {
            X509Certificate x509CertificateA = hVar2.a();
            byte[] content = null;
            X509CertificateHolder x509CertificateHolder = x509CertificateA != null ? new X509CertificateHolder(x509CertificateA.getEncoded()) : null;
            bp.d dVarD1 = fVar.D1();
            bp.i iVar = bp.i.f20883t7;
            bp.a aVarJ4 = dVarD1.j4(iVar);
            if (aVarJ4 == null && eVarC != null) {
                aVarJ4 = eVarC.D1().j4(iVar);
            }
            if (aVarJ4 == null) {
                throw new IOException("/Recipients entry is missing in encryption dictionary");
            }
            int size = aVarJ4.size();
            byte[][] bArr = new byte[size][];
            StringBuilder sb5 = new StringBuilder();
            int i15 = 0;
            boolean z15 = false;
            int length = 0;
            while (i15 < aVarJ4.size()) {
                byte[] bArrI3 = ((bp.p) aVarJ4.k4(i15)).i3();
                Iterator<RecipientInformation> it = new CMSEnvelopedData(bArrI3).getRecipientInfos().getRecipients().iterator();
                int i16 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        hVar = hVar2;
                        break;
                    }
                    RecipientInformation next = it.next();
                    hVar = hVar2;
                    RecipientId rid = next.getRID();
                    if (!z15 && rid.match(x509CertificateHolder)) {
                        z15 = true;
                        content = next.getContent(new JceKeyTransEnvelopedRecipient((PrivateKey) hVar.b()));
                        break;
                    }
                    int i17 = i16 + 1;
                    if (x509CertificateA != null) {
                        eVar = eVarC;
                        sb5.append('\n');
                        sb5.append(i17);
                        sb5.append(": ");
                        if (rid instanceof KeyTransRecipientId) {
                            H(sb5, (KeyTransRecipientId) rid, x509CertificateA, x509CertificateHolder);
                        }
                    } else {
                        eVar = eVarC;
                    }
                    eVarC = eVar;
                    hVar2 = hVar;
                    i16 = i17;
                }
                e eVar2 = eVarC;
                bArr[i15] = bArrI3;
                length += bArrI3.length;
                i15++;
                eVarC = eVar2;
                hVar2 = hVar;
            }
            e eVar3 = eVarC;
            if (!z15 || content == null) {
                throw new IOException("The certificate matches none of " + aVarJ4.size() + " recipient entries" + sb5.toString());
            }
            if (content.length != 24) {
                throw new IOException("The enveloped data does not contain 24 bytes");
            }
            byte[] bArr2 = new byte[4];
            int length2 = 20;
            System.arraycopy(content, 20, bArr2, 0, 4);
            a aVar2 = new a(bArr2);
            aVar2.s();
            A(aVar2);
            byte[] bArrCopyOf = new byte[length + 20];
            int i18 = 0;
            System.arraycopy(content, 0, bArrCopyOf, 0, 20);
            int i19 = 0;
            while (i19 < size) {
                byte[] bArr3 = bArr[i19];
                System.arraycopy(bArr3, i18, bArrCopyOf, length2, bArr3.length);
                length2 += bArr3.length;
                i19++;
                i18 = 0;
            }
            if (fVar.q() == 4 || fVar.q() == 5) {
                if (!v()) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, length + 24);
                    System.arraycopy(new byte[]{-1, -1, -1, -1}, 0, bArrCopyOf, bArrCopyOf.length - 4, 4);
                }
                bArrDigest = fVar.q() == 4 ? d.b().digest(bArrCopyOf) : d.c().digest(bArrCopyOf);
                if (eVar3 != null) {
                    bp.i iVarB = eVar3.b();
                    z(bp.i.f20853r.equals(iVarB) || bp.i.f20864s.equals(iVarB));
                }
            } else {
                bArrDigest = d.b().digest(bArrCopyOf);
            }
            C(new byte[r() / 8]);
            System.arraycopy(bArrDigest, 0, q(), 0, r() / 8);
        } catch (KeyStoreException e15) {
            throw new IOException(e15);
        } catch (CertificateEncodingException e16) {
            throw new IOException(e16);
        } catch (CMSException e17) {
            throw new IOException(e17);
        }
    }

    public k(i iVar) {
        E(iVar);
        D(iVar.a());
    }
}
