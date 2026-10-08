package pc4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpc4/y7;", "", "<init>", "()V", "Lh64/m;", "getTrustedDomainCertificateUseCase", "Lh64/l;", "trustedCertificatesUseCase", "Lpl/gov/coi/common/network/r;", "httpClientConfig", "Ly04/a;", "buildConfigRepository", "Lpl/gov/coi/common/network/b;", "a", "(Lh64/m;Lh64/l;Lpl/gov/coi/common/network/r;Ly04/a;)Lpl/gov/coi/common/network/b;", "Lui2/a;", "cryptoManager", "Ly00/c0;", "securityExceptionParser", "La14/k;", "b", "(Lui2/a;Ly00/c0;)La14/k;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y7 f156859a = new y7();

    private y7() {
    }

    public final pl.gov.coi.common.network.b a(h64.m getTrustedDomainCertificateUseCase, h64.l trustedCertificatesUseCase, pl.gov.coi.common.network.r httpClientConfig, y04.a buildConfigRepository) {
        return new ld4.e(getTrustedDomainCertificateUseCase, trustedCertificatesUseCase, httpClientConfig, buildConfigRepository);
    }

    public final a14.k b(ui2.a cryptoManager, y00.c0 securityExceptionParser) {
        return new o14.j(cryptoManager, securityExceptionParser);
    }
}
