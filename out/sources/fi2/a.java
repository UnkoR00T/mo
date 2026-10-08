package fi2;

import gi2.c;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.cms.CMSEnvelopedData;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b(\u0010&J\u000f\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00109R\u001c\u0010>\u001a\n <*\u0004\u0018\u00010;0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010@¨\u0006B"}, d2 = {"Lfi2/a;", "", "<init>", "()V", "", "data", "Ljava/security/cert/X509Certificate;", "signerCertificate", "Ljava/security/PrivateKey;", "signerPrivateKey", "", "certificatesToAttach", "Ljava/util/Date;", "currentServerDate", "h", "([BLjava/security/cert/X509Certificate;Ljava/security/PrivateKey;Ljava/util/Set;Ljava/util/Date;)[B", "plaintext", "recipientCert", "c", "([BLjava/security/cert/X509Certificate;)[B", "Lorg/bouncycastle/cms/CMSEnvelopedData;", "envelopedData", "recipientPrivateKey", "a", "(Lorg/bouncycastle/cms/CMSEnvelopedData;Ljava/security/cert/X509Certificate;Ljava/security/PrivateKey;)[B", "", "passPhrase", "saltApp", "saltRND", "saltDevice", "Ljavax/crypto/spec/SecretKeySpec;", "e", "([C[B[B[B)Ljavax/crypto/spec/SecretKeySpec;", "g", "([B[B[B)[B", "Ljavax/crypto/SecretKey;", "secretKey", "d", "([BLjavax/crypto/SecretKey;)[B", "input", "b", "Ljava/security/KeyPair;", "f", "()Ljava/security/KeyPair;", "Lorg/bouncycastle/jce/provider/BouncyCastleProvider;", "Lorg/bouncycastle/jce/provider/BouncyCastleProvider;", "provider", "Lhi2/a;", "Lhi2/a;", "cmsTools", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", "cmsAlgorithm", "Lgi2/c;", "Lgi2/c;", "aesMode", "Lji2/a;", "Lji2/a;", "aesKeyFactory", "Lgi2/a;", "kotlin.jvm.PlatformType", "Lgi2/a;", "aesCipher", "Lji2/c;", "Lji2/c;", "rsaKeyGenerator", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f64129a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final BouncyCastleProvider provider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final hi2.a cmsTools;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final ASN1ObjectIdentifier cmsAlgorithm;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final c aesMode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final ji2.a aesKeyFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final gi2.a aesCipher;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final ji2.c rsaKeyGenerator;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f64137i;

    static {
        BouncyCastleProvider bouncyCastleProvider = new BouncyCastleProvider();
        provider = bouncyCastleProvider;
        cmsTools = hi2.a.c().m();
        cmsAlgorithm = CMSAlgorithm.AES256_CBC;
        c cVar = c.f73255d;
        aesMode = cVar;
        aesKeyFactory = ji2.a.b().m(bouncyCastleProvider).j("PBKDF2WithHmacSHA256").k(PKIFailureInfo.notAuthorized).l(256).e();
        aesCipher = gi2.a.c().i(bouncyCastleProvider).h(cVar).d();
        rsaKeyGenerator = new ji2.c(bouncyCastleProvider);
        f64137i = 8;
    }

    private a() {
    }

    public static final byte[] a(CMSEnvelopedData envelopedData, X509Certificate recipientCert, PrivateKey recipientPrivateKey) {
        return cmsTools.a(envelopedData, recipientCert, recipientPrivateKey);
    }

    public static final byte[] b(byte[] input, SecretKey secretKey) {
        return aesCipher.a(input, secretKey, 17);
    }

    public static final byte[] c(byte[] plaintext, X509Certificate recipientCert) {
        return cmsTools.b(plaintext, recipientCert, cmsAlgorithm).getEncoded();
    }

    public static final byte[] d(byte[] plaintext, SecretKey secretKey) {
        return aesCipher.b(plaintext, secretKey, 17);
    }

    public static final SecretKeySpec e(char[] passPhrase, byte[] saltApp, byte[] saltRND, byte[] saltDevice) {
        return new SecretKeySpec(aesKeyFactory.a(passPhrase, g(saltApp, saltRND, saltDevice)).getEncoded(), "AES");
    }

    public static final KeyPair f() {
        return rsaKeyGenerator.a(2048);
    }

    public static final byte[] g(byte[] saltApp, byte[] saltRND, byte[] saltDevice) {
        return li2.a.c(li2.a.c(saltApp, saltRND), saltDevice);
    }

    public static final byte[] h(byte[] data, X509Certificate signerCertificate, PrivateKey signerPrivateKey, Set<? extends X509Certificate> certificatesToAttach, Date currentServerDate) {
        return cmsTools.i(data, signerCertificate, signerPrivateKey, certificatesToAttach, PKCSObjectIdentifiers.sha256WithRSAEncryption, currentServerDate).getEncoded();
    }
}
