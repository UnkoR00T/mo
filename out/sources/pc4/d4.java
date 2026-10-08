package pc4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lpc4/d4;", "", "<init>", "()V", "Lrp0/a;", "getJWSSigningParamsUC", "Lgo0/j;", "beFetchNativeCentralTokenUC", "Lgo0/k;", "beFetchNativeOwTokenUC", "Lgo0/c0;", "beRefreshNativeOwTokenUC", "Lgo0/y;", "beGetOwnerAddressUC", "Lnv3/a;", "a", "(Lrp0/a;Lgo0/j;Lgo0/k;Lgo0/c0;Lgo0/y;)Lnv3/a;", "Lg34/c;", "identityManager", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/g;", "getMainCertificateTypeUC", "Lk24/b;", "getCertKeyPairUC", "Lq34/z0;", "getPeselFromPersonalIdCertificateUC", "Lnv3/b;", "b", "(Lg34/c;Lc54/b;Lk24/g;Lk24/b;Lq34/z0;)Lnv3/b;", "Lh64/e;", "getFeatureFlagListUC", "Lnv3/c;", "c", "(Lh64/e;)Lnv3/c;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d4 {
    public final nv3.a a(rp0.a getJWSSigningParamsUC, go0.j beFetchNativeCentralTokenUC, go0.k beFetchNativeOwTokenUC, go0.c0 beRefreshNativeOwTokenUC, go0.y beGetOwnerAddressUC) {
        return new yc4.a(getJWSSigningParamsUC, beFetchNativeCentralTokenUC, beFetchNativeOwTokenUC, beRefreshNativeOwTokenUC, beGetOwnerAddressUC);
    }

    public final nv3.b b(g34.c identityManager, c54.b isFeatureEnabledUseCase, k24.g getMainCertificateTypeUC, k24.b getCertKeyPairUC, q34.z0 getPeselFromPersonalIdCertificateUC) {
        return new yc4.b(identityManager, isFeatureEnabledUseCase, getMainCertificateTypeUC, getCertKeyPairUC, getPeselFromPersonalIdCertificateUC);
    }

    public final nv3.c c(h64.e getFeatureFlagListUC) {
        return new yc4.c(getFeatureFlagListUC);
    }
}
