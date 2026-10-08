package e;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import android.util.Size;
import h.Result3A;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0001!B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001bH\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00108\u001a\n 5*\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010:\u001a\n 5*\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u001c\u0010<\u001a\n 5*\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010E\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010B\u0018\u00010A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010H\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010F\u0018\u00010A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010DR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR \u0010M\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010JR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010T\u001a\u0004\u0018\u00010\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010U\"\u0004\b(\u0010V¨\u0006X"}, d2 = {"Le/g1;", "Le/z1;", "Le/p2$a;", "Le/b0;", "cameraProperties", "Lc/r;", "meteringRegionCorrection", "Le/r1;", "state3AControl", "Le/u2;", "threads", "La/x;", "zoomCompat", "<init>", "(Le/b0;Lc/r;Le/r1;Le/u2;La/x;)V", "Le/f2;", "requestControl", "Lju/x;", "", "signalToCancel", "Lju/w0;", "Lh/m1;", "d", "(Le/f2;Lju/x;)Lju/w0;", "T", "", "message", "Loq/i0;", "f", "(Lju/x;Ljava/lang/String;)V", "", "Lo/j2;", "runningUseCases", "a", "(Ljava/util/Set;)V", "reset", "()V", "c", "()Lju/w0;", "Le/b0;", "b", "Lc/r;", "Le/r1;", "Le/u2;", "e", "La/x;", "Le/f2;", "_requestControl", "Landroid/util/Rational;", "g", "Landroid/util/Rational;", "previewAspectRatio", "", "kotlin.jvm.PlatformType", "h", "Ljava/lang/Integer;", "maxAfRegionCount", "i", "maxAeRegionCount", "j", "maxAwbRegionCount", "", "k", "Z", "supportsAutoFocusTrigger", "", "Lh/a;", "l", "Ljava/util/List;", "availableAeModes", "Lh/b;", "m", "availableAfModes", "n", "Lju/x;", "updateSignal", "o", "cancelSignal", "Lju/d2;", "p", "Lju/d2;", "focusTimeoutJob", "q", "autoCancelJob", "value", "()Le/f2;", "(Le/f2;)V", "r", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g1 implements z1, p2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 cameraProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c.r meteringRegionCorrection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r1 state3AControl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a.x zoomCompat;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private f2 _requestControl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Rational previewAspectRatio;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Integer maxAfRegionCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Integer maxAeRegionCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Integer maxAwbRegionCount;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsAutoFocusTrigger;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<h.a> availableAeModes;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List<h.b> availableAfModes;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private ju.x<Object> updateSignal;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private ju.x<Result3A> cancelSignal;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private ju.d2 focusTimeoutJob;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private ju.d2 autoCancelJob;

    public g1(b0 b0Var, c.r rVar, r1 r1Var, u2 u2Var, a.x xVar) {
        ArrayList arrayList;
        this.cameraProperties = b0Var;
        this.meteringRegionCorrection = rVar;
        this.state3AControl = r1Var;
        this.threads = u2Var;
        this.zoomCompat = xVar;
        this.maxAfRegionCount = (Integer) b0Var.getMetadata().d0(CameraCharacteristics.CONTROL_MAX_REGIONS_AF, 0);
        this.maxAeRegionCount = (Integer) b0Var.getMetadata().d0(CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0);
        this.maxAwbRegionCount = (Integer) b0Var.getMetadata().d0(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB, 0);
        this.supportsAutoFocusTrigger = h.x.INSTANCE.e(b0Var.getMetadata());
        int[] iArr = (int[]) b0Var.getMetadata().J(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        ArrayList arrayList2 = null;
        if (iArr != null) {
            arrayList = new ArrayList(iArr.length);
            for (int i15 : iArr) {
                arrayList.add(h.a.INSTANCE.a(i15));
            }
        } else {
            arrayList = null;
        }
        this.availableAeModes = arrayList;
        int[] iArr2 = (int[]) this.cameraProperties.getMetadata().J(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr2 != null) {
            arrayList2 = new ArrayList(iArr2.length);
            for (int i16 : iArr2) {
                arrayList2.add(h.b.INSTANCE.a(i16));
            }
        }
        this.availableAfModes = arrayList2;
    }

    private final ju.w0<Result3A> d(f2 requestControl, ju.x<Object> signalToCancel) {
        if (signalToCancel != null) {
            f(signalToCancel, "Cancelled by cancelFocusAndMetering()");
        }
        this.state3AControl.t(null);
        return requestControl.e();
    }

    private final <T> void f(ju.x<T> xVar, String str) {
        xVar.p(new o.j.a(str));
    }

    @Override // e.p2.a
    public void a(Set<? extends o.j2> runningUseCases) {
        Size sizeH;
        this.previewAspectRatio = null;
        for (o.j2 j2Var : runningUseCases) {
            if ((j2Var instanceof o.m1) && (sizeH = ((o.m1) j2Var).h()) != null) {
                this.previewAspectRatio = new Rational(sizeH.getWidth(), sizeH.getHeight());
            }
        }
    }

    @Override // e.z1
    public void b(f2 f2Var) {
        this._requestControl = f2Var;
    }

    public final ju.w0<Result3A> c() {
        ju.x<Result3A> xVarC = ju.z.c(null, 1, null);
        f2 f2Var = get_requestControl();
        if (f2Var == null) {
            xVarC.p(new o.j.a("Camera is not active."));
            return xVarC;
        }
        ju.d2 d2Var = this.focusTimeoutJob;
        if (d2Var != null) {
            ju.d2.a.a(d2Var, null, 1, null);
        }
        ju.d2 d2Var2 = this.autoCancelJob;
        if (d2Var2 != null) {
            ju.d2.a.a(d2Var2, null, 1, null);
        }
        ju.x<Result3A> xVar = this.cancelSignal;
        if (xVar != null) {
            f(xVar, "Cancelled by another cancelFocusAndMetering()");
        }
        this.cancelSignal = xVarC;
        PRN.a0.s(d(f2Var, this.updateSignal), xVarC);
        return xVarC;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public f2 get_requestControl() {
        return this._requestControl;
    }

    @Override // e.z1
    public void reset() {
        this.previewAspectRatio = null;
        c();
    }
}
