package PRN;

import android.annotation.SuppressLint;
import e.i1;
import e.x1;
import e.y2;
import o.l2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0016¨\u0006\u0018"}, d2 = {"LPRN/b;", "", "Le/y2;", "zoomControl", "Le/a1;", "evCompControl", "Le/x1;", "torchControl", "Le/i1;", "lowLightBoostControl", "<init>", "(Le/y2;Le/a1;Le/x1;Le/i1;)V", "a", "Le/y2;", "b", "Le/a1;", "c", "Le/x1;", "d", "Le/i1;", "Landroidx/lifecycle/y;", "Lo/l2;", "()Landroidx/lifecycle/y;", "zoomStateLiveData", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"UnsafeOptInUsageError"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y2 zoomControl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e.a1 evCompControl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x1 torchControl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i1 lowLightBoostControl;

    public b(y2 y2Var, e.a1 a1Var, x1 x1Var, i1 i1Var) {
        this.zoomControl = y2Var;
        this.evCompControl = a1Var;
        this.torchControl = x1Var;
        this.lowLightBoostControl = i1Var;
    }

    public final androidx.p016lifecycle.y<l2> a() {
        return this.zoomControl.j();
    }
}
