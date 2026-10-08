package yz3;

import p071kotlin.Metadata;
import uh0.p;
import y00.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0007¢\u0006\u0004\b+\u0010,J/\u00104\u001a\u0002032\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b4\u00105JW\u0010>\u001a\u0002012\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010=\u001a\u00020<H\u0007¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u000203H\u0007¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020D2\u0006\u0010@\u001a\u000203H\u0007¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00020/2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020-2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bI\u0010JJ'\u0010N\u001a\u00020M2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010L\u001a\u00020K2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020P2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u001bH\u0007¢\u0006\u0004\bQ\u0010RJ\u001f\u0010W\u001a\u00020\u00042\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020UH\u0007¢\u0006\u0004\bW\u0010X¨\u0006Y"}, d2 = {"Lyz3/a;", "", "<init>", "()V", "Lwz3/e;", "getChallengeUC", "Luh0/l;", "getJwtTokenUseCase", "Lwy/b;", "networkSessionManager", "Lzz3/b;", "notificationsInteractor", "Lb04/a;", "autoCertificateRenewalCache", "Lez/a;", "currentTimeProvider", "Ldx/a;", "deactivateDomainErrorFactory", "Lzz3/a;", "authenticationContainersInteractor", "Lwz3/h;", "k", "(Lwz3/e;Luh0/l;Lwy/b;Lzz3/b;Lb04/a;Lez/a;Ldx/a;Lzz3/a;)Lwz3/h;", "Liy/j;", "cmsManager", "Liy/a;", "base64Coder", "Lwz3/d;", "d", "(Liy/j;Liy/a;Lzz3/a;)Lwz3/d;", "Lpy/a;", "aesKeyDecoder", "Ly00/h0;", "securityProviderFactory", "Liy/i;", "cipherRsa", "Liy/g;", "cipherAes", "Liy/c;", "bytesConverter", "Lwz3/c;", "c", "(Lpy/a;Ly00/h0;Liy/i;Liy/g;Liy/a;Liy/c;Lzz3/a;)Lwz3/c;", "a", "()Lb04/a;", "Lc04/g;", "idCardCertShouldRenewInternalUC", "Lc04/c;", "certShouldAutoRenewUC", "Lwz3/b;", "certGenerateAndSaveNewUC", "La04/a;", "g", "(Lc04/g;Lc04/c;Lwz3/b;Lzz3/a;)La04/a;", "Luh0/h;", "generateIdCardCertificateUseCase", "decryptNewCertificateUseCase", "getBase64SignedValueUseCase", "Lax0/a;", "afterUserActivationProcessUseCase", "Luh0/i;", "generateRefugeeCertificateUseCase", "f", "(Luh0/h;Lwz3/c;Lwz3/e;Lwz3/d;Lax0/a;Lzz3/b;Lwy/b;Lb04/a;Luh0/i;)Lwz3/b;", "certRenewManager", "Lwz3/a;", "j", "(La04/a;)Lwz3/a;", "Lwz3/f;", "i", "(La04/a;)Lwz3/f;", "h", "(Lb04/a;Lzz3/a;)Lc04/c;", "b", "(Lb04/a;Lzz3/a;)Lc04/g;", "Luh0/p;", "revokeUserCertificateUseCase", "Lwz3/i;", "l", "(Lwz3/e;Luh0/p;Lzz3/a;)Lwz3/i;", "Lwz3/j;", "m", "(Liy/a;Lwz3/d;)Lwz3/j;", "Luh0/e;", "bEGetChallengeUseCase", "Lzz3/c;", "serverTimeSourceInteractor", "e", "(Luh0/e;Lzz3/c;)Lwz3/e;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f230971a = new a();

    private a() {
    }

    public final b04.a a() {
        return new xz3.a();
    }

    public final c04.g b(b04.a autoCertificateRenewalCache, zz3.a authenticationContainersInteractor) {
        return new c04.g(autoCertificateRenewalCache, authenticationContainersInteractor);
    }

    public final wz3.c c(py.a aesKeyDecoder, h0 securityProviderFactory, iy.i cipherRsa, iy.g cipherAes, iy.a base64Coder, iy.c bytesConverter, zz3.a authenticationContainersInteractor) {
        return new c04.d(aesKeyDecoder, base64Coder, securityProviderFactory, cipherRsa, cipherAes, authenticationContainersInteractor, bytesConverter);
    }

    public final wz3.d d(iy.j cmsManager, iy.a base64Coder, zz3.a authenticationContainersInteractor) {
        return new c04.e(cmsManager, base64Coder, authenticationContainersInteractor);
    }

    public final wz3.e e(uh0.e bEGetChallengeUseCase, zz3.c serverTimeSourceInteractor) {
        return new c04.f(bEGetChallengeUseCase, serverTimeSourceInteractor);
    }

    public final wz3.b f(uh0.h generateIdCardCertificateUseCase, wz3.c decryptNewCertificateUseCase, wz3.e getChallengeUC, wz3.d getBase64SignedValueUseCase, ax0.a afterUserActivationProcessUseCase, zz3.b notificationsInteractor, wy.b networkSessionManager, b04.a autoCertificateRenewalCache, uh0.i generateRefugeeCertificateUseCase) {
        return new c04.b(generateIdCardCertificateUseCase, generateRefugeeCertificateUseCase, decryptNewCertificateUseCase, getChallengeUC, afterUserActivationProcessUseCase, getBase64SignedValueUseCase, notificationsInteractor, autoCertificateRenewalCache, networkSessionManager);
    }

    public final a04.a g(c04.g idCardCertShouldRenewInternalUC, c04.c certShouldAutoRenewUC, wz3.b certGenerateAndSaveNewUC, zz3.a authenticationContainersInteractor) {
        return new a04.a(idCardCertShouldRenewInternalUC, certShouldAutoRenewUC, certGenerateAndSaveNewUC, authenticationContainersInteractor);
    }

    public final c04.c h(b04.a autoCertificateRenewalCache, zz3.a authenticationContainersInteractor) {
        return new c04.c(autoCertificateRenewalCache, authenticationContainersInteractor);
    }

    public final wz3.f i(a04.a certRenewManager) {
        return new c04.h(certRenewManager);
    }

    public final wz3.a j(a04.a certRenewManager) {
        return new c04.a(certRenewManager);
    }

    public final wz3.h k(wz3.e getChallengeUC, uh0.l getJwtTokenUseCase, wy.b networkSessionManager, zz3.b notificationsInteractor, b04.a autoCertificateRenewalCache, ez.a currentTimeProvider, dx.a deactivateDomainErrorFactory, zz3.a authenticationContainersInteractor) {
        return new c04.i(getChallengeUC, getJwtTokenUseCase, notificationsInteractor, networkSessionManager, autoCertificateRenewalCache, currentTimeProvider, deactivateDomainErrorFactory, authenticationContainersInteractor);
    }

    public final wz3.i l(wz3.e getChallengeUC, p revokeUserCertificateUseCase, zz3.a authenticationContainersInteractor) {
        return new c04.j(getChallengeUC, revokeUserCertificateUseCase, authenticationContainersInteractor);
    }

    public final wz3.j m(iy.a base64Coder, wz3.d getBase64SignedValueUseCase) {
        return new c04.k(base64Coder, getBase64SignedValueUseCase);
    }
}
