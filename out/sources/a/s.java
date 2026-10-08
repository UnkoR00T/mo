package a;

import PRN.a0;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Range;
import android.util.Rational;
import e.b0;
import e.f2;
import e.u0;
import e.u2;
import h.g1;
import h.i1;
import h.p0;
import ju.w0;
import ju.z;
import oq.i0;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR\u001a\u0010$\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#R\u001a\u0010)\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b!\u0010(R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"La/s;", "La/p;", "Le/b0;", "cameraProperties", "Le/u2;", "threads", "Le/u0;", "comboRequestListener", "<init>", "(Le/b0;Le/u2;Le/u0;)V", "", "throwable", "Loq/i0;", "c", "(Ljava/lang/Throwable;)V", "", "evCompIndex", "Le/f2;", "requestControl", "", "cancelPreviousTask", "Lju/w0;", "d", "(ILe/f2;Z)Lju/w0;", "a", "Le/b0;", "b", "Le/u2;", "Le/u0;", "Landroid/util/Range;", "Landroid/util/Range;", "()Landroid/util/Range;", "range", "e", "Z", "()Z", "supported", "Landroid/util/Rational;", "f", "Landroid/util/Rational;", "()Landroid/util/Rational;", "step", "Lju/x;", "g", "Lju/x;", "updateSignal", "Lh/g1$a;", "h", "Lh/g1$a;", "updateListener", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 cameraProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u0 comboRequestListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Range<Integer> range;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean supported;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Rational step;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ju.x<Integer> updateSignal;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private g1.a updateListener;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"a/s$a", "Lh/g1$a;", "Lh/i1;", "requestMetadata", "Lh/r0;", "frameNumber", "Lh/p0;", "result", "Loq/i0;", "K", "(Lh/i1;JLh/p0;)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements g1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ju.x<Integer> f1040b;

        a(int i15, ju.x<Integer> xVar) {
            this.f1039a = i15;
            this.f1040b = xVar;
        }

        @Override // h.g1.a
        public void K(i1 requestMetadata, long frameNumber, p0 result) {
            Integer num = (Integer) result.getMetadata().I(CaptureResult.CONTROL_AE_STATE);
            Integer num2 = (Integer) result.getMetadata().I(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
            if (num == null || num2 == null) {
                if (num2 != null) {
                    if (num2.intValue() == this.f1039a) {
                        this.f1040b.d0(Integer.valueOf(this.f1039a));
                        return;
                    }
                    return;
                }
                return;
            }
            int iIntValue = num.intValue();
            if (iIntValue == 2 || iIntValue == 3 || iIntValue == 4) {
                if (num2.intValue() == this.f1039a) {
                    this.f1040b.d0(Integer.valueOf(this.f1039a));
                }
            }
        }
    }

    public s(b0 b0Var, u2 u2Var, u0 u0Var) {
        Integer num;
        this.cameraProperties = b0Var;
        this.threads = u2Var;
        this.comboRequestListener = u0Var;
        this.range = (Range) b0Var.getMetadata().d0(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE, q.a());
        Integer num2 = (Integer) a().getUpper();
        this.supported = (num2 == null || num2.intValue() != 0) && ((num = (Integer) a().getLower()) == null || num.intValue() != 0);
        this.step = !getSupported() ? Rational.ZERO : (Rational) b0Var.getMetadata().J(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(s sVar, a aVar, Throwable th4) {
        sVar.comboRequestListener.G(aVar);
        return i0.f148189a;
    }

    @Override // a.p
    public Range<Integer> a() {
        return this.range;
    }

    @Override // a.p
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getSupported() {
        return this.supported;
    }

    @Override // a.p
    public void c(Throwable throwable) {
        ju.x<Integer> xVar = this.updateSignal;
        if (xVar != null) {
            xVar.p(throwable);
        }
    }

    @Override // a.p
    public w0<Integer> d(int evCompIndex, f2 requestControl, boolean cancelPreviousTask) {
        ju.x<Integer> xVarC = z.c(null, 1, null);
        ju.x<Integer> xVar = this.updateSignal;
        if (xVar != null) {
            if (cancelPreviousTask) {
                xVar.p(new o.j.a("Cancelled by another setExposureCompensationIndex()"));
            } else {
                a0.s(xVarC, xVar);
            }
        }
        this.updateSignal = xVarC;
        g1.a aVar = this.updateListener;
        if (aVar != null) {
            this.comboRequestListener.G(aVar);
            this.updateListener = null;
        }
        f2.h(requestControl, v0.f(oq.y.a(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(evCompIndex))), null, null, 6, null);
        final a aVar2 = new a(evCompIndex, xVarC);
        this.comboRequestListener.o(aVar2, this.threads.getSequentialExecutor());
        xVarC.C0(new er.l() { // from class: a.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.g(this.f1029a, aVar2, (Throwable) obj);
            }
        });
        this.updateListener = aVar2;
        return xVarC;
    }

    @Override // a.p
    /* JADX INFO: renamed from: e, reason: from getter */
    public Rational getStep() {
        return this.step;
    }
}
