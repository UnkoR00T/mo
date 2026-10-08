package m14;

import android.content.Context;
import my.JWSHeaderData;
import my.JWSPayloadData;
import org.conscrypt.CertPinManager;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008a\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JO\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020'2\u0006\u0010/\u001a\u00020\u001eH\u0007¢\u0006\u0004\b0\u00101J\u0017\u00105\u001a\u0002042\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b5\u00106J'\u0010=\u001a\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002042\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b=\u0010>J/\u0010@\u001a\u00020?2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b@\u0010AJ'\u0010C\u001a\u00020B2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u000204H\u0007¢\u0006\u0004\bC\u0010DJ\u001f\u0010F\u001a\u00020E2\u0006\u0010(\u001a\u00020'2\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020H2\u0006\u0010(\u001a\u00020'2\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\bI\u0010JJ'\u0010M\u001a\u00020L2\u0006\u0010(\u001a\u00020'2\u0006\u00108\u001a\u0002072\u0006\u0010K\u001a\u00020HH\u0007¢\u0006\u0004\bM\u0010NJ'\u0010P\u001a\u00020O2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u00108\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\bP\u0010QJ/\u0010T\u001a\u00020S2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u00108\u001a\u0002072\u0006\u0010R\u001a\u00020$2\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\bT\u0010UJ/\u0010W\u001a\u00020V2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u00108\u001a\u0002072\u0006\u0010R\u001a\u00020$2\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020Y2\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\\2\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b]\u0010^J\u001f\u0010b\u001a\u00020a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020_H\u0007¢\u0006\u0004\bb\u0010cJ\u0017\u0010e\u001a\u00020d2\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\u000bH\u0007¢\u0006\u0004\bg\u0010hJ\u0017\u0010l\u001a\u00020k2\u0006\u0010j\u001a\u00020iH\u0007¢\u0006\u0004\bl\u0010mJ\u0017\u0010q\u001a\u00020p2\u0006\u0010o\u001a\u00020nH\u0007¢\u0006\u0004\bq\u0010rJ\u001f\u0010s\u001a\u00020_2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010R\u001a\u00020$H\u0007¢\u0006\u0004\bs\u0010tJ\u0017\u0010w\u001a\u00020v2\u0006\u0010u\u001a\u00020?H\u0007¢\u0006\u0004\bw\u0010xJN\u0010\u0084\u0001\u001a\u00030\u0083\u00012\u0006\u0010y\u001a\u00020O2\u0006\u0010z\u001a\u00020Y2\b\b\u0001\u0010|\u001a\u00020{2\b\b\u0001\u0010~\u001a\u00020}2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u007f2\n\b\u0001\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J,\u0010\u0087\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0086\u0001\u001a\u00020L2\u0006\u0010j\u001a\u00020i2\u0006\u0010R\u001a\u00020$H\u0007¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\"\u0010\u0089\u0001\u001a\u00020{2\u0006\u0010y\u001a\u00020O2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001b\u0010\u008b\u0001\u001a\u00020}2\u0007\u0010\u0086\u0001\u001a\u00020LH\u0007¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J/\u0010\u008e\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u0086\u0001\u001a\u00020L2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010z\u001a\u00020YH\u0007¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001a\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0090\u0001H\u0007¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001a\u0010\u0095\u0001\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010\u0090\u0001H\u0007¢\u0006\u0006\b\u0095\u0001\u0010\u0093\u0001J=\u0010\u0099\u0001\u001a\u00030\u0098\u00012\u000f\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0090\u00012\u000f\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010\u0090\u00012\u0006\u0010R\u001a\u00020$H\u0007¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J'\u0010 \u0001\u001a\u00030\u009f\u00012\b\u0010\u009c\u0001\u001a\u00030\u009b\u00012\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001H\u0007¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0013\u0010¢\u0001\u001a\u00030\u009b\u0001H\u0007¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0013\u0010¤\u0001\u001a\u00030\u009d\u0001H\u0007¢\u0006\u0006\b¤\u0001\u0010¥\u0001¨\u0006¦\u0001"}, d2 = {"Lm14/s6;", "", "<init>", "()V", "Ly00/h0;", "G", "()Ly00/h0;", "Ly00/i;", "certUpdater", "Lz00/g;", "ocspCrlCertRevocationChecker", "Liy/t;", "keyStoreProvider", "Lorg/conscrypt/CertPinManager;", "certPinManager", "Ly00/x;", "nonCTTrustManagerProvider", "Lz00/e;", "ctVerificationChecker", "securityProviderFactory", "Lpx/d;", "remoteLogger", "Ly00/m0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ly00/i;Lz00/g;Liy/t;Lorg/conscrypt/CertPinManager;Ly00/x;Lz00/e;Ly00/h0;Lpx/d;)Ly00/m0;", "Landroid/content/Context;", "context", "Liy/z;", "I", "(Landroid/content/Context;Lpx/d;)Liy/z;", "Liy/e;", "g", "()Liy/e;", "Liy/c;", "f", "()Liy/c;", "Liy/a;", "e", "()Liy/a;", "Liy/w;", "secureRandomFactory", "Liy/g0;", "K", "(Liy/w;)Liy/g0;", "Liy/m;", "i", "()Liy/m;", "bytesManager", "E", "(Liy/e;)Liy/w;", "Ljx/g;", "systemInfo", "Le10/m;", "t", "(Ljx/g;)Le10/m;", "Ly00/c0;", "securityExceptionParser", "keyStoreKeySpecMapper", "Lxw/d;", "dispatcherProvider", "Lpy/k;", "v", "(Ly00/c0;Le10/m;Lxw/d;)Lpy/k;", "Lpy/i;", "s", "(Ly00/c0;Le10/m;Lpx/d;Lxw/d;)Lpy/i;", "Lpy/l;", "w", "(Liy/t;Ly00/c0;Le10/m;)Lpy/l;", "Liy/i;", "C", "(Liy/w;Ly00/c0;)Liy/i;", "Liy/p;", "k", "(Liy/w;Ly00/c0;)Liy/p;", "ivGenerator", "Liy/g;", "a", "(Liy/w;Ly00/c0;Liy/p;)Liy/g;", "Lpy/b;", "d", "(Ly00/h0;Ly00/c0;Lxw/d;)Lpy/b;", "base64Coder", "Lpy/m;", ip.a.f96138c, "(Ly00/h0;Ly00/c0;Liy/a;Lxw/d;)Lpy/m;", "Lpy/e;", "j", "(Ly00/h0;Ly00/c0;Liy/a;Lxw/d;)Lpy/e;", "Lpy/a;", "c", "(Ly00/c0;)Lpy/a;", "Liy/d0;", "J", "(Ly00/h0;)Liy/d0;", "Liy/i0;", "x509CertificateDecoder", "Liy/v;", "z", "(Liy/t;Liy/i0;)Liy/v;", "Liy/j0;", "M", "(Ly00/c0;)Liy/j0;", "u", "()Liy/t;", "Lay/j;", "jsonSerializer", "Loy/a;", "r", "(Lay/j;)Loy/a;", "Lc54/b;", "isFeatureEnabledUseCase", "Ly00/b0;", "F", "(Lc54/b;)Ly00/b0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ly00/h0;Liy/a;)Liy/i0;", "keyStoreAesKeyGenerator", "La10/a;", "h", "(Lpy/i;)La10/a;", "aesKeyGenerator", "aesKeyDecoder", "Lg10/c;", "passwordKeyGenerator", "Lf10/e;", "masterKeyWrapper", "Lwy/a;", "masterKeyProvider", "Lg10/a;", "passwordDataDeviceKeyCipher", "Lf10/c;", "x", "(Lpy/b;Lpy/a;Lg10/c;Lf10/e;Lwy/a;Lg10/a;)Lf10/c;", "cipherAes", "A", "(Liy/g;Lay/j;Liy/a;)Lg10/a;", "B", "(Lpy/b;Liy/w;)Lg10/c;", "y", "(Liy/g;)Lf10/e;", "Lf10/b;", "b", "(Liy/g;Lwy/a;Lpy/a;)Lf10/b;", "Lly/b;", "Lmy/a;", "p", "()Lly/b;", "Lmy/c;", "q", "headerFactory", "payloadFactory", "Lly/a;", "o", "(Lly/b;Lly/b;Liy/a;)Lly/a;", "Ljy/c;", "jwePublicKeyEncrypter", "Ljy/b;", "jweJwkEncrypter", "Ljy/a;", "m", "(Ljy/c;Ljy/b;)Ljy/a;", "l", "()Ljy/c;", "n", "()Ljy/b;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s6 f122776a = new s6();

    private s6() {
    }

    public final g10.a A(iy.g cipherAes, ay.j jsonSerializer, iy.a base64Coder) {
        return new g10.b(cipherAes, jsonSerializer, base64Coder);
    }

    public final g10.c B(py.b aesKeyGenerator, iy.w secureRandomFactory) {
        return new g10.d(aesKeyGenerator, secureRandomFactory);
    }

    public final iy.i C(iy.w secureRandomFactory, y00.c0 securityExceptionParser) {
        return new y00.l(secureRandomFactory, securityExceptionParser);
    }

    public final py.m D(y00.h0 securityProviderFactory, y00.c0 securityExceptionParser, iy.a base64Coder, xw.d dispatcherProvider) {
        return new e10.i(securityProviderFactory, securityExceptionParser, base64Coder, dispatcherProvider);
    }

    public final iy.w E(iy.e bytesManager) {
        return new y00.z(bytesManager);
    }

    public final y00.b0 F(c54.b isFeatureEnabledUseCase) {
        return new y00.b0(isFeatureEnabledUseCase.a(b54.c.SECURE_WINDOW).booleanValue());
    }

    public final y00.h0 G() {
        return new y00.k0();
    }

    public final y00.m0 H(y00.i certUpdater, z00.g ocspCrlCertRevocationChecker, iy.t keyStoreProvider, CertPinManager certPinManager, y00.x nonCTTrustManagerProvider, z00.e ctVerificationChecker, y00.h0 securityProviderFactory, px.d remoteLogger) {
        return new y00.e0(certUpdater, ocspCrlCertRevocationChecker, keyStoreProvider, certPinManager, nonCTTrustManagerProvider, ctVerificationChecker, securityProviderFactory, remoteLogger);
    }

    public final iy.z I(Context context, px.d remoteLogger) {
        return new y00.n0(context, remoteLogger);
    }

    public final iy.d0 J(y00.h0 securityProviderFactory) {
        return new y00.c(securityProviderFactory);
    }

    public final iy.g0 K(iy.w secureRandomFactory) {
        return new y00.p0(secureRandomFactory);
    }

    public final iy.i0 L(y00.h0 securityProviderFactory, iy.a base64Coder) {
        return new y00.d(securityProviderFactory, base64Coder);
    }

    public final iy.j0 M(y00.c0 securityExceptionParser) {
        return new y00.e(securityExceptionParser);
    }

    public final iy.g a(iy.w secureRandomFactory, y00.c0 securityExceptionParser, iy.p ivGenerator) {
        return new y00.k(secureRandomFactory, securityExceptionParser, ivGenerator);
    }

    public final f10.b b(iy.g cipherAes, wy.a masterKeyProvider, py.a aesKeyDecoder) {
        return new f10.a(cipherAes, masterKeyProvider, aesKeyDecoder);
    }

    public final py.a c(y00.c0 securityExceptionParser) {
        return new e10.j(securityExceptionParser);
    }

    public final py.b d(y00.h0 securityProviderFactory, y00.c0 securityExceptionParser, xw.d dispatcherProvider) {
        return new e10.g(securityProviderFactory, securityExceptionParser, dispatcherProvider);
    }

    public final iy.a e() {
        return new y00.a();
    }

    public final iy.c f() {
        return new y00.f();
    }

    public final iy.e g() {
        return new y00.h();
    }

    public final a10.a h(py.i keyStoreAesKeyGenerator) {
        return new a10.b(keyStoreAesKeyGenerator);
    }

    public final iy.m i() {
        return new y00.p();
    }

    public final py.e j(y00.h0 securityProviderFactory, y00.c0 securityExceptionParser, iy.a base64Coder, xw.d dispatcherProvider) {
        return new e10.h(securityProviderFactory, securityExceptionParser, base64Coder, dispatcherProvider);
    }

    public final iy.p k(iy.w secureRandomFactory, y00.c0 securityExceptionParser) {
        return new y00.r(secureRandomFactory, securityExceptionParser);
    }

    public final jy.c l() {
        return new b10.a();
    }

    public final jy.a m(jy.c jwePublicKeyEncrypter, jy.b jweJwkEncrypter) {
        return new b10.b(jwePublicKeyEncrypter, jweJwkEncrypter);
    }

    public final jy.b n() {
        return new b10.c();
    }

    public final ly.a o(ly.b<JWSHeaderData> headerFactory, ly.b<JWSPayloadData> payloadFactory, iy.a base64Coder) {
        return new c10.a(headerFactory, payloadFactory, base64Coder);
    }

    public final ly.b<JWSHeaderData> p() {
        return new c10.d();
    }

    public final ly.b<JWSPayloadData> q() {
        return new c10.e();
    }

    public final oy.a r(ay.j jsonSerializer) {
        return new d10.b(jsonSerializer);
    }

    public final py.i s(y00.c0 securityExceptionParser, e10.m keyStoreKeySpecMapper, px.d remoteLogger, xw.d dispatcherProvider) {
        return new e10.a(securityExceptionParser, keyStoreKeySpecMapper, remoteLogger, dispatcherProvider);
    }

    public final e10.m t(jx.g systemInfo) {
        return new e10.m(systemInfo);
    }

    public final iy.t u() {
        return new y00.s();
    }

    public final py.k v(y00.c0 securityExceptionParser, e10.m keyStoreKeySpecMapper, xw.d dispatcherProvider) {
        return new e10.b(securityExceptionParser, keyStoreKeySpecMapper, dispatcherProvider);
    }

    public final py.l w(iy.t keyStoreProvider, y00.c0 securityExceptionParser, e10.m keyStoreKeySpecMapper) {
        return new e10.f(keyStoreProvider, securityExceptionParser, keyStoreKeySpecMapper);
    }

    public final f10.c x(py.b aesKeyGenerator, py.a aesKeyDecoder, g10.c passwordKeyGenerator, f10.e masterKeyWrapper, wy.a masterKeyProvider, g10.a passwordDataDeviceKeyCipher) {
        return new f10.d(aesKeyGenerator, aesKeyDecoder, passwordKeyGenerator, masterKeyWrapper, passwordDataDeviceKeyCipher, masterKeyProvider);
    }

    public final f10.e y(iy.g cipherAes) {
        return new f10.f(cipherAes);
    }

    public final iy.v z(iy.t keyStoreProvider, iy.i0 x509CertificateDecoder) {
        return new y00.b(keyStoreProvider, x509CertificateDecoder);
    }
}
