package yy3;

import bz3.c0;
import f00.SharedDestinationSpec;
import f00.r;
import hz.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lyy3/c;", "", "<init>", "()V", "Lmx/c;", "labelProvider", "Lyw/b;", "accessibilityTalkBackManager", "Lhz/i;", "validatorTextFactory", "Lxy3/b;", "c", "(Lmx/c;Lyw/b;Lhz/i;)Lxy3/b;", "Laz3/d;", "d", "()Laz3/d;", "Laz3/a;", "a", "(Lyw/b;)Laz3/a;", "Lzy3/a;", "setPasswordApplicationLockInteractor", "Lac4/a;", "callActionWithLoaderUseCase", "validatePasswordUC", "Lzy3/c;", "setPasswordUserInteractor", "Lzy3/b;", "setPasswordBiometricInteractor", "Lxy3/a;", "b", "(Lzy3/a;Lac4/a;Lxy3/b;Lzy3/c;Lzy3/b;)Lxy3/a;", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {
    public c() {
        r.K().add(new SharedDestinationSpec(vy3.a.class, c0.class, b.f230844a.b()));
    }

    public final az3.a a(yw.b accessibilityTalkBackManager) {
        return new az3.a(accessibilityTalkBackManager);
    }

    public final xy3.a b(zy3.a setPasswordApplicationLockInteractor, ac4.a callActionWithLoaderUseCase, xy3.b validatePasswordUC, zy3.c setPasswordUserInteractor, zy3.b setPasswordBiometricInteractor) {
        return new az3.b(setPasswordApplicationLockInteractor, callActionWithLoaderUseCase, validatePasswordUC, setPasswordUserInteractor, setPasswordBiometricInteractor);
    }

    public final xy3.b c(mx.c labelProvider, yw.b accessibilityTalkBackManager, i validatorTextFactory) {
        return new az3.c(labelProvider, accessibilityTalkBackManager, validatorTextFactory);
    }

    public final az3.d d() {
        return new az3.d();
    }
}
