package i70;

import mu.b0;
import mu.r0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Li70/o;", "Li70/n;", "<init>", "()V", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "Lmu/b0;", "Li70/p;", "a", "Lmu/b0;", "_snackBarVisibilityState", "Lmu/g;", "b", "Lmu/g;", "j", "()Lmu/g;", "snackBarVisibilityState", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0<p> _snackBarVisibilityState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mu.g<p> snackBarVisibilityState;

    public o() {
        b0<p> b0VarA = r0.a(p.a.f89857a);
        this._snackBarVisibilityState = b0VarA;
        this.snackBarVisibilityState = b0VarA;
    }

    @Override // i70.n
    public void B0() {
        this._snackBarVisibilityState.setValue(p.a.f89857a);
    }

    @Override // i70.n
    public mu.g<p> j() {
        return this.snackBarVisibilityState;
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this._snackBarVisibilityState.setValue(new p.Visible(snackBarData));
    }
}
