package pc4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lpc4/d8;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lb74/c;", "activateAppUseCase", "Lb74/a;", "activateAppLegacyUseCase", "Lv64/l;", "deactivateAppUseCase", "Lv64/b;", "changeUserPasswordUseCase", "Lzy3/c;", "c", "(Lc54/b;Lb74/c;Lb74/a;Lv64/l;Lv64/b;)Lzy3/c;", "Lab4/d;", "resetLockUseCase", "Lzy3/a;", "a", "(Lab4/d;)Lzy3/a;", "Lg04/e;", "checkBiometricActivatedUseCase", "Lzy3/b;", "b", "(Lg04/e;)Lzy3/b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d8 f154493a = new d8();

    private d8() {
    }

    public final zy3.a a(ab4.d resetLockUseCase) {
        return new zc4.a(resetLockUseCase);
    }

    public final zy3.b b(g04.e checkBiometricActivatedUseCase) {
        return new zc4.b(checkBiometricActivatedUseCase);
    }

    public final zy3.c c(c54.b isFeatureEnabledUseCase, b74.c activateAppUseCase, b74.a activateAppLegacyUseCase, v64.l deactivateAppUseCase, v64.b changeUserPasswordUseCase) {
        return new zc4.c(isFeatureEnabledUseCase, activateAppUseCase, activateAppLegacyUseCase, deactivateAppUseCase, changeUserPasswordUseCase);
    }
}
