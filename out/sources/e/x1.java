package e;

import android.os.Build;
import h.Result3A;
import java.util.LinkedHashMap;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001.B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0014*\b\u0012\u0004\u0012\u00020\r0\u00142\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\r*\b\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u0011J/\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020#2\b\b\u0002\u0010)\u001a\u00020#¢\u0006\u0004\b*\u0010+J1\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010(\u001a\u00020#2\b\b\u0002\u0010)\u001a\u00020#H\u0000¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R*\u0010?\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0018\u00109\u0012\u0004\b>\u0010\u0011\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010C\u001a\u0010\u0012\f\u0012\n @*\u0004\u0018\u00010\n0\n0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00107R\u0014\u0010H\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010GR\"\u0010J\u001a\u0010\u0012\f\u0012\n @*\u0004\u0018\u00010\n0\n0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010BR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010KR\u001e\u0010N\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR(\u0010Q\u001a\u0004\u0018\u0001022\b\u0010\u001f\u001a\u0004\u0018\u0001028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010O\"\u0004\b0\u0010PR\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020\n0R8F¢\u0006\u0006\u001a\u0004\bD\u0010SR\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020\n0R8F¢\u0006\u0006\u001a\u0004\bF\u0010S¨\u0006V"}, d2 = {"Le/x1;", "Le/z1;", "Le/b0;", "cameraProperties", "Le/r1;", "state3AControl", "Le/u2;", "threads", "<init>", "(Le/b0;Le/r1;Le/u2;)V", "", "level", "Lju/w0;", "Loq/i0;", "t", "(I)Lju/w0;", "p", "()V", "q", "r", "Lju/x;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "e", "(Lju/x;Ljava/lang/Exception;)Lju/x;", "Le/x1$a;", "mode", "s", "(I)V", "Landroidx/lifecycle/b0;", "value", "j", "(Landroidx/lifecycle/b0;I)V", "torchState", "", "i", "(I)Z", "reset", "torch", "cancelPreviousTask", "ignoreFlashUnitAvailability", "k", "(ZZZ)Lju/w0;", "m", "(IZZ)Lju/w0;", "a", "Le/r1;", "b", "Le/u2;", "Le/f2;", "c", "Le/f2;", "_requestControl", "d", "Z", "hasFlashUnit", "Le/x1$a;", "getTorchMode-MnUA4hI$camera_camera2", "()Le/x1$a;", "setTorchMode-UuNXre8$camera_camera2", "(Le/x1$a;)V", "getTorchMode-MnUA4hI$camera_camera2$annotations", "torchMode", "kotlin.jvm.PlatformType", "f", "Landroidx/lifecycle/b0;", "_torchState", "g", "isTorchStrengthSupported", "h", "I", "defaultTorchStrength", "maxTorchStrength", "_torchStrength", "Lju/x;", "_updateTorchStateSignal", "l", "_updateTorchStrengthSignal", "()Le/f2;", "(Le/f2;)V", "requestControl", "Landroidx/lifecycle/y;", "()Landroidx/lifecycle/y;", "torchStateLiveData", "torchStrengthLiveData", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x1 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r1 state3AControl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private f2 _requestControl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean hasFlashUnit;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private a torchMode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final androidx.p016lifecycle.b0<Integer> _torchState = new androidx.p016lifecycle.b0<>(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isTorchStrengthSupported;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int defaultTorchStrength;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int maxTorchStrength;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final androidx.p016lifecycle.b0<Integer> _torchStrength;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private ju.x<oq.i0> _updateTorchStateSignal;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private ju.x<oq.i0> _updateTorchStrengthSignal;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Le/x1$a;", "", "", "value", "e", "(I)I", "", "i", "(I)Ljava/lang/String;", "h", "other", "", "f", "(ILjava/lang/Object;)Z", "a", "I", "getValue", "()I", "b", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f46453c = e(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f46454d = e(1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f46455e = e(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: e.x1$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Le/x1$a$a;", "", "<init>", "()V", "Le/x1$a;", "OFF", "I", "a", "()I", "ON", "b", "USED_AS_FLASH", "c", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final int a() {
                return a.f46453c;
            }

            public final int b() {
                return a.f46454d;
            }

            public final int c() {
                return a.f46455e;
            }

            private Companion() {
            }
        }

        private /* synthetic */ a(int i15) {
            this.value = i15;
        }

        public static final /* synthetic */ a d(int i15) {
            return new a(i15);
        }

        private static int e(int i15) {
            return i15;
        }

        public static boolean f(int i15, Object obj) {
            return (obj instanceof a) && i15 == ((a) obj).getValue();
        }

        public static final boolean g(int i15, int i16) {
            return i15 == i16;
        }

        public static int h(int i15) {
            return Integer.hashCode(i15);
        }

        public static String i(int i15) {
            return "TorchMode(value=" + i15 + ')';
        }

        public boolean equals(Object obj) {
            return f(this.value, obj);
        }

        public int hashCode() {
            return h(this.value);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public String toString() {
            return i(this.value);
        }
    }

    public x1(b0 b0Var, r1 r1Var, u2 u2Var) {
        this.state3AControl = r1Var;
        this.threads = u2Var;
        this.hasFlashUnit = c.l.b(b0Var, false, 1, null);
        h.x.Companion companion = h.x.INSTANCE;
        this.isTorchStrengthSupported = companion.i(b0Var.getMetadata());
        int iC = companion.c(b0Var.getMetadata());
        this.defaultTorchStrength = iC;
        this.maxTorchStrength = companion.d(b0Var.getMetadata());
        this._torchStrength = new androidx.p016lifecycle.b0<>(Integer.valueOf(iC));
    }

    private final ju.x<oq.i0> e(ju.x<oq.i0> xVar, Exception exc) {
        xVar.p(exc);
        return xVar;
    }

    private final boolean i(int torchState) {
        return !a.g(torchState, a.INSTANCE.a());
    }

    private final void j(androidx.p016lifecycle.b0<Integer> b0Var, int i15) {
        if (y.w.d()) {
            b0Var.o(Integer.valueOf(i15));
        } else {
            b0Var.m(Integer.valueOf(i15));
        }
    }

    public static /* synthetic */ ju.w0 l(x1 x1Var, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z16 = true;
        }
        if ((i15 & 4) != 0) {
            z17 = false;
        }
        return x1Var.k(z15, z16, z17);
    }

    public static /* synthetic */ ju.w0 n(x1 x1Var, int i15, boolean z15, boolean z16, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            z15 = true;
        }
        if ((i16 & 4) != 0) {
            z16 = false;
        }
        return x1Var.m(i15, z15, z16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(Result3A result3A) {
        return oq.i0.f148189a;
    }

    private final void p() {
        q();
        r();
    }

    private final void q() {
        ju.x<oq.i0> xVar = this._updateTorchStateSignal;
        if (xVar != null) {
            e(xVar, new o.j.a("There is a new enableTorch being set"));
        }
        this._updateTorchStateSignal = null;
    }

    private final void r() {
        ju.x<oq.i0> xVar = this._updateTorchStrengthSignal;
        if (xVar != null) {
            e(xVar, new o.j.a("There is a new torch strength being set"));
        }
        this._updateTorchStrengthSignal = null;
    }

    private final void s(int mode) {
        this.torchMode = a.d(mode);
        j(this._torchState, a.g(mode, a.INSTANCE.b()) ? 1 : 0);
    }

    private final ju.w0<oq.i0> t(int level) {
        ju.w0 w0VarH;
        ju.x<oq.i0> xVarC = ju.z.c(null, 1, null);
        if (Build.VERSION.SDK_INT < 35 || !this.isTorchStrengthSupported) {
            e(xVarC, new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
            return xVarC;
        }
        if (this._updateTorchStrengthSignal != null) {
            r();
        }
        this._updateTorchStrengthSignal = xVarC;
        xVarC.C0(new er.l() { // from class: e.w1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.u(this.f46422a, (Throwable) obj);
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a.g.a(linkedHashMap, level);
        f2 f2Var = get_requestControl();
        if (f2Var == null || (w0VarH = f2.h(f2Var, linkedHashMap, null, null, 6, null)) == null) {
            e(xVarC, new o.j.a("Camera is not active."));
            return xVarC;
        }
        PRN.a0.s(w0VarH, xVarC);
        oq.i0 i0Var = oq.i0.f148189a;
        return xVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(x1 x1Var, Throwable th4) {
        x1Var._updateTorchStrengthSignal = null;
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    @Override // e.z1
    public void b(f2 f2Var) {
        boolean z15;
        this._requestControl = f2Var;
        if (this.torchMode != null) {
            Integer numF = g().f();
            if (numF != null) {
                z15 = numF.intValue() == 1;
            }
            l(this, z15, false, false, 4, null);
        }
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public f2 get_requestControl() {
        return this._requestControl;
    }

    public final androidx.p016lifecycle.y<Integer> g() {
        return this._torchState;
    }

    public final androidx.p016lifecycle.y<Integer> h() {
        return this._torchStrength;
    }

    public final ju.w0<oq.i0> k(boolean torch, boolean cancelPreviousTask, boolean ignoreFlashUnitAvailability) {
        return m(torch ? a.INSTANCE.b() : a.INSTANCE.a(), cancelPreviousTask, ignoreFlashUnitAvailability);
    }

    public final ju.w0<oq.i0> m(int mode, boolean cancelPreviousTask, boolean ignoreFlashUnitAvailability) {
        int iC;
        ju.w0<Result3A> w0VarK;
        c cVar = c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = c.TRUNCATED_TAG;
            a.i(mode);
        }
        ju.x<oq.i0> xVarC = ju.z.c(null, 1, null);
        if (!ignoreFlashUnitAvailability && !this.hasFlashUnit) {
            return e(xVarC, new IllegalStateException("No flash unit"));
        }
        f2 f2Var = get_requestControl();
        if (f2Var == null) {
            e(xVarC, new o.j.a("Camera is not active."));
            return xVarC;
        }
        s(mode);
        if (cancelPreviousTask) {
            q();
        } else {
            ju.x<oq.i0> xVar = this._updateTorchStateSignal;
            if (xVar != null) {
                PRN.a0.s(xVarC, xVar);
            }
        }
        this._updateTorchStateSignal = xVarC;
        this.state3AControl.s(i(mode) ? 1 : null);
        h.a.Companion companion = h.a.INSTANCE;
        h.a aVarA = companion.a(this.state3AControl.p());
        if (aVarA != null) {
            iC = aVarA.getValue();
        } else {
            if (o.e1.k("CXCP")) {
                io.sentry.android.core.c2.g(c.TRUNCATED_TAG, "TorchControl#setTorchAsync: Failed to convert ae mode of value " + this.state3AControl.p() + " with AeMode.fromIntOrNull, fallback to AeMode.ON");
            }
            iC = companion.c();
        }
        if (i(mode)) {
            if (a.g(mode, a.INSTANCE.b())) {
                Integer numF = h().f();
                if (numF != null) {
                    t(numF.intValue());
                }
            } else {
                t(this.defaultTorchStrength);
            }
            w0VarK = f2Var.i();
        } else {
            w0VarK = f2Var.k(iC);
        }
        PRN.a0.t(w0VarK, xVarC, new er.l() { // from class: e.v1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.o((Result3A) obj);
            }
        });
        return xVarC;
    }

    @Override // e.z1
    public void reset() {
        p();
        if (this.torchMode != null) {
            s(a.INSTANCE.a());
            l(this, false, false, false, 6, null);
            this.torchMode = null;
        }
    }
}
