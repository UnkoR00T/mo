package e;

import PRN.ZoomValue;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\"\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001b\u0010(\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R!\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00105R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0006078F¢\u0006\u0006\u001a\u0004\b8\u00109R(\u0010>\u001a\u0004\u0018\u0001002\b\u0010\u0007\u001a\u0004\u0018\u0001008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b\u001b\u0010=¨\u0006?"}, d2 = {"Le/y2;", "Le/z1;", "La/x;", "zoomCompat", "<init>", "(La/x;)V", "Lo/l2;", "value", "Loq/i0;", "m", "(Lo/l2;)V", "reset", "()V", "", "zoomRatio", "Lcom/google/common/util/concurrent/q;", "Ljava/lang/Void;", "l", "(F)Lcom/google/common/util/concurrent/q;", "zoomState", "", "cancelPreviousTask", "shouldUpdateParameters", "e", "(Lo/l2;ZZ)Lcom/google/common/util/concurrent/q;", "a", "La/x;", "b", "F", "getMinZoomRatio", "()F", "minZoomRatio", "c", "getMaxZoomRatio", "maxZoomRatio", "LPRN/w0;", "d", "Loq/k;", "h", "()LPRN/w0;", "defaultZoomState", "Landroidx/lifecycle/b0;", "k", "()Landroidx/lifecycle/b0;", "_zoomState", "f", "Z", "isInitialized", "Le/f2;", "g", "Le/f2;", "_requestControl", "Lju/x;", "Lju/x;", "updateSignal", "Landroidx/lifecycle/y;", "j", "()Landroidx/lifecycle/y;", "zoomStateLiveData", "i", "()Le/f2;", "(Le/f2;)V", "requestControl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y2 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a.x zoomCompat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float minZoomRatio;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float maxZoomRatio;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k defaultZoomState = oq.l.a(new er.a() { // from class: e.w2
        @Override // er.a
        public final Object a() {
            return y2.g(this.f46423a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k _zoomState = oq.l.a(new er.a() { // from class: e.x2
        @Override // er.a
        public final Object a() {
            return y2.d(this.f46457a);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isInitialized;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private f2 _requestControl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ju.x<oq.i0> updateSignal;

    public y2(a.x xVar) {
        this.zoomCompat = xVar;
        this.minZoomRatio = xVar.getMinZoomRatio();
        this.maxZoomRatio = xVar.getMaxZoomRatio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.p016lifecycle.b0 d(y2 y2Var) {
        return new androidx.p016lifecycle.b0(y2Var.h());
    }

    public static /* synthetic */ com.google.common.util.concurrent.q f(y2 y2Var, o.l2 l2Var, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = true;
        }
        if ((i15 & 4) != 0) {
            z16 = true;
        }
        return y2Var.e(l2Var, z15, z16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ZoomValue g(y2 y2Var) {
        return new ZoomValue(1.0f, y2Var.minZoomRatio, y2Var.maxZoomRatio);
    }

    private final androidx.p016lifecycle.b0<o.l2> k() {
        return (androidx.p016lifecycle.b0) this._zoomState.getValue();
    }

    private final void m(o.l2 value) {
        if (y.w.d()) {
            k().o(value);
        } else {
            k().m(value);
        }
    }

    @Override // e.z1
    public void b(f2 f2Var) {
        this._requestControl = f2Var;
        o.l2 l2VarF = k().f();
        if (l2VarF == null) {
            l2VarF = h();
        }
        e(l2VarF, false, this.isInitialized || l2VarF.getZoomRatio() != 1.0f);
        this.isInitialized = true;
    }

    public final com.google.common.util.concurrent.q<Void> e(o.l2 zoomState, boolean cancelPreviousTask, boolean shouldUpdateParameters) {
        ju.x<oq.i0> xVarC = ju.z.c(null, 1, null);
        ju.x<oq.i0> xVar = this.updateSignal;
        if (xVar != null) {
            if (cancelPreviousTask) {
                xVar.p(new o.j.a("Cancelled due to another zoom value being set."));
            } else {
                PRN.a0.s(xVarC, xVar);
            }
        }
        this.updateSignal = xVarC;
        m(zoomState);
        f2 f2Var = get_requestControl();
        if (f2Var != null) {
            PRN.a0.s(shouldUpdateParameters ? this.zoomCompat.d(zoomState.getZoomRatio(), f2Var) : this.zoomCompat.c(f2Var), xVarC);
        } else {
            xVarC.p(new o.j.a("Camera is not active."));
        }
        return a0.f.i(PRN.a0.j(xVarC, null, 1, null));
    }

    public final ZoomValue h() {
        return (ZoomValue) this.defaultZoomState.getValue();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public f2 get_requestControl() {
        return this._requestControl;
    }

    public final androidx.p016lifecycle.y<o.l2> j() {
        return k();
    }

    public final com.google.common.util.concurrent.q<Void> l(float zoomRatio) {
        float f15 = this.maxZoomRatio;
        if (zoomRatio <= f15) {
            float f16 = this.minZoomRatio;
            if (zoomRatio >= f16) {
                return f(this, new ZoomValue(zoomRatio, f16, f15), false, false, 6, null);
            }
        }
        return a0.f.f(new IllegalArgumentException("Requested zoomRatio " + zoomRatio + " is not within valid range [" + this.minZoomRatio + ", " + this.maxZoomRatio + ']'));
    }

    @Override // e.z1
    public void reset() {
        f(this, h(), false, false, 6, null);
    }
}
