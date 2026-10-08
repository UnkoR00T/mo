package e;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p071kotlin.Metadata;
import v.j3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014*\b\u0012\u0004\u0012\u00020\u00110\u00142\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0013J\u001b\u0010\"\u001a\u00020\u00112\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0 ¢\u0006\u0004\b\"\u0010#J%\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110'2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$¢\u0006\u0004\b(\u0010)R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\"\u0010>\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010\u001b0\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR0\u0010M\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bF\u0010G\u0012\u0004\bL\u0010\u0013\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010R\u001a\u0004\u0018\u0001022\b\u0010N\u001a\u0004\u0018\u0001028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\b,\u0010Q¨\u0006S"}, d2 = {"Le/i1;", "Le/z1;", "Lh/x;", "cameraMetadata", "Le/r1;", "state3AControl", "Le/u2;", "threads", "Le/u0;", "comboRequestListener", "<init>", "(Lh/x;Le/r1;Le/u2;Le/u0;)V", "", "Lo/j2;", "Lv/j3;", "p", "(Ljava/util/Collection;)Lv/j3;", "Loq/i0;", "u", "()V", "Lju/x;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "m", "(Lju/x;Ljava/lang/Exception;)Lju/x;", "Landroidx/lifecycle/b0;", "", "state", "r", "(Landroidx/lifecycle/b0;I)V", "reset", "", "useCases", "q", "(Ljava/util/List;)V", "", "lowLightBoost", "cancelPreviousTask", "Lju/w0;", "s", "(ZZ)Lju/w0;", "a", "Lh/x;", "b", "Le/r1;", "c", "Le/u2;", "d", "Le/u0;", "Le/f2;", "e", "Le/f2;", "_requestControl", "f", "Z", "isLowLightBoostSupported", "g", "isLowLightBoostOn", "kotlin.jvm.PlatformType", "h", "Landroidx/lifecycle/b0;", "_lowLightBoostState", "Ljava/util/concurrent/atomic/AtomicInteger;", "i", "Ljava/util/concurrent/atomic/AtomicInteger;", "lowLightBoostStateAtomic", "j", "Lju/x;", "_updateSignal", "k", "Lju/w0;", "n", "()Lju/w0;", "setCheckFrameRateJob$camera_camera2", "(Lju/w0;)V", "getCheckFrameRateJob$camera_camera2$annotations", "checkFrameRateJob", "value", "o", "()Le/f2;", "(Le/f2;)V", "requestControl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i1 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.x cameraMetadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r1 state3AControl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u0 comboRequestListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private f2 _requestControl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isLowLightBoostSupported;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isLowLightBoostOn;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final androidx.p016lifecycle.b0<Integer> _lowLightBoostState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger lowLightBoostStateAtomic;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private ju.x<oq.i0> _updateSignal;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private ju.w0<Boolean> checkFrameRateJob;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"e/i1$a", "Lh/g1$a;", "Lh/i1;", "requestMetadata", "Lh/r0;", "frameNumber", "Lh/p0;", "totalCaptureResult", "Loq/i0;", "a0", "(Lh/i1;JLh/p0;)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements h.g1.a {
        a() {
        }

        @Override // h.g1.a
        public void a0(h.i1 requestMetadata, long frameNumber, h.p0 totalCaptureResult) {
            Integer num;
            if (Build.VERSION.SDK_INT < 35 || i1.this._requestControl == null || !i1.this.isLowLightBoostOn || (num = (Integer) totalCaptureResult.e().I(CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE)) == null) {
                return;
            }
            i1 i1Var = i1.this;
            i1Var.r(i1Var._lowLightBoostState, num.intValue() != 1 ? 0 : 1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46028e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<o.j2> f46030g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends o.j2> list, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f46030g = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f46028e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return vq.b.a(((Number) i1.this.p(this.f46030g).e().getUpper()).intValue() > 30);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return i1.this.new b(this.f46030g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i1 f46032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ju.x f46033g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f46034h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f46035j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tq.e eVar, i1 i1Var, ju.x xVar, boolean z15, boolean z16) {
            super(2, eVar);
            this.f46032f = i1Var;
            this.f46033g = xVar;
            this.f46034h = z15;
            this.f46035j = z16;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0037  */
        /* JADX WARN: Code duplicated, block: B:18:0x0050  */
        /* JADX WARN: Code duplicated, block: B:20:0x005b  */
        /* JADX WARN: Code duplicated, block: B:23:0x006c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0070  */
        /* JADX WARN: Code duplicated, block: B:28:0x007d  */
        /* JADX WARN: Code duplicated, block: B:29:0x0083  */
        /* JADX WARN: Code duplicated, block: B:31:0x008b  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            boolean zBooleanValue;
            ju.x xVar;
            Integer numE;
            ju.x xVar2;
            Object objE = uq.b.e();
            int i15 = this.f46031e;
            if (i15 == 0) {
                oq.u.b(obj);
                ju.w0<Boolean> w0VarN = this.f46032f.n();
                if (w0VarN != null) {
                    this.f46031e = 1;
                    obj = w0VarN.I(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    i1 i1Var = this.f46032f;
                    i1Var.r(i1Var._lowLightBoostState, -1);
                    this.f46032f.m(this.f46033g, new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30."));
                } else {
                    this.f46032f.isLowLightBoostOn = this.f46034h;
                    if (!this.f46034h) {
                        i1 i1Var2 = this.f46032f;
                        i1Var2.r(i1Var2._lowLightBoostState, -1);
                    }
                    if (this.f46032f.get_requestControl() == null) {
                        this.f46032f.m(this.f46033g, new o.j.a("Camera is not active."));
                        oq.i0 i0Var = oq.i0.f148189a;
                    } else {
                        if (this.f46034h) {
                            i1 i1Var3 = this.f46032f;
                            i1Var3.r(i1Var3._lowLightBoostState, 0);
                        }
                        if (this.f46035j) {
                            this.f46032f.u();
                        } else {
                            xVar = this.f46032f._updateSignal;
                            if (xVar != null) {
                                PRN.a0.s(this.f46033g, xVar);
                            }
                        }
                        this.f46032f._updateSignal = this.f46033g;
                        r1 r1Var = this.f46032f.state3AControl;
                        if (this.f46034h) {
                            numE = vq.b.e(6);
                        } else {
                            numE = null;
                        }
                        PRN.a0.s(r1Var.s(numE), this.f46033g);
                        xVar2 = this.f46033g;
                        if (xVar2.C0(new d(xVar2, this.f46032f)) == null) {
                            this.f46032f.m(this.f46033g, new o.j.a("Camera is not active."));
                            oq.i0 i0Var2 = oq.i0.f148189a;
                        }
                    }
                }
                return oq.i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                i1 i1Var4 = this.f46032f;
                i1Var4.r(i1Var4._lowLightBoostState, -1);
                this.f46032f.m(this.f46033g, new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30."));
            } else {
                this.f46032f.isLowLightBoostOn = this.f46034h;
                if (!this.f46034h) {
                    i1 i1Var5 = this.f46032f;
                    i1Var5.r(i1Var5._lowLightBoostState, -1);
                }
                if (this.f46032f.get_requestControl() == null) {
                    this.f46032f.m(this.f46033g, new o.j.a("Camera is not active."));
                    oq.i0 i0Var3 = oq.i0.f148189a;
                } else {
                    if (this.f46034h) {
                        i1 i1Var6 = this.f46032f;
                        i1Var6.r(i1Var6._lowLightBoostState, 0);
                    }
                    if (this.f46035j) {
                        this.f46032f.u();
                    } else {
                        xVar = this.f46032f._updateSignal;
                        if (xVar != null) {
                            PRN.a0.s(this.f46033g, xVar);
                        }
                    }
                    this.f46032f._updateSignal = this.f46033g;
                    r1 r1Var2 = this.f46032f.state3AControl;
                    if (this.f46034h) {
                        numE = vq.b.e(6);
                    } else {
                        numE = null;
                    }
                    PRN.a0.s(r1Var2.s(numE), this.f46033g);
                    xVar2 = this.f46033g;
                    if (xVar2.C0(new d(xVar2, this.f46032f)) == null) {
                        this.f46032f.m(this.f46033g, new o.j.a("Camera is not active."));
                        oq.i0 i0Var4 = oq.i0.f148189a;
                    }
                }
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(eVar, this.f46032f, this.f46033g, this.f46034h, this.f46035j);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements er.l<Throwable, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.x<oq.i0> f46036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f46037b;

        d(ju.x<oq.i0> xVar, i1 i1Var) {
            this.f46036a = xVar;
            this.f46037b = i1Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(Throwable th4) {
            c(th4);
            return oq.i0.f148189a;
        }

        public final void c(Throwable th4) {
            if (fr.t.c(this.f46036a, this.f46037b._updateSignal)) {
                this.f46037b._updateSignal = null;
            }
        }
    }

    public i1(h.x xVar, r1 r1Var, u2 u2Var, u0 u0Var) {
        this.cameraMetadata = xVar;
        this.state3AControl = r1Var;
        this.threads = u2Var;
        this.comboRequestListener = u0Var;
        boolean z15 = false;
        if (xVar != null && h.x.INSTANCE.f(xVar)) {
            z15 = true;
        }
        this.isLowLightBoostSupported = z15;
        this._lowLightBoostState = new androidx.p016lifecycle.b0<>(-1);
        this.lowLightBoostStateAtomic = new AtomicInteger(-1);
        if (z15) {
            u0Var.o(new a(), u2Var.getSequentialExecutor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ju.x<oq.i0> m(ju.x<oq.i0> xVar, Exception exc) {
        xVar.p(exc);
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j3 p(Collection<? extends o.j2> collection) {
        j3.h hVar = new j3.h();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            hVar.b(((o.j2) it.next()).z());
        }
        return hVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(androidx.p016lifecycle.b0<Integer> b0Var, int i15) {
        if (this.lowLightBoostStateAtomic.getAndSet(i15) != i15) {
            if (y.w.d()) {
                b0Var.o(Integer.valueOf(i15));
            } else {
                b0Var.m(Integer.valueOf(i15));
            }
        }
    }

    public static /* synthetic */ ju.w0 t(i1 i1Var, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z16 = true;
        }
        return i1Var.s(z15, z16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        ju.x<oq.i0> xVar = this._updateSignal;
        if (xVar != null) {
            m(xVar, new o.j.a("There is a new enableLowLightBoost being set"));
        }
        this._updateSignal = null;
    }

    @Override // e.z1
    public void b(f2 f2Var) {
        this._requestControl = f2Var;
        if (this.isLowLightBoostOn) {
            if (f2Var != null) {
                s(true, false);
            } else {
                r(this._lowLightBoostState, 0);
            }
        }
    }

    public final ju.w0<Boolean> n() {
        return this.checkFrameRateJob;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public f2 get_requestControl() {
        return this._requestControl;
    }

    public final void q(List<? extends o.j2> useCases) {
        if (this.isLowLightBoostSupported) {
            if (useCases.isEmpty()) {
                this.checkFrameRateJob = ju.z.a(Boolean.FALSE);
            } else {
                this.checkFrameRateJob = ju.k.b(this.threads.getSequentialScope(), null, null, new b(useCases, null), 3, null);
            }
        }
    }

    @Override // e.z1
    public void reset() {
        u();
        t(this, false, false, 2, null);
    }

    public final ju.w0<oq.i0> s(boolean lowLightBoost, boolean cancelPreviousTask) {
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
        }
        ju.x<oq.i0> xVarC = ju.z.c(null, 1, null);
        if (!this.isLowLightBoostSupported) {
            return m(xVarC, new IllegalStateException("Low Light Boost is not supported!"));
        }
        ju.k.d(this.threads.getSequentialScope(), null, null, new c(null, this, xVarC, lowLightBoost, cancelPreviousTask), 3, null);
        return xVarC;
    }
}
