package i;

import android.hardware.camera2.CameraManager;
import android.os.Build;
import ju.CoroutineName;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00107\u001a\b\u0012\u0004\u0012\u00020\u0011028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Li/l1;", "Lm/h;", "Lnq/a;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Lk/z;", "threads", "Lh/v;", "cameraId", "Lju/d2;", "cameraPipeJob", "<init>", "(Lnq/a;Lk/z;Ljava/lang/String;Lju/d2;Lfr/k;)V", "Lmu/g;", "Lm/h$a;", "y", "()Lmu/g;", "Loq/i0;", "close", "()V", "a", "Lk/z;", "b", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "c", "Landroid/hardware/camera2/CameraManager;", "manager", "Lju/p0;", "d", "Lju/p0;", "scope", "Liu/a;", "e", "Liu/a;", "closed", "Lmu/b0;", "f", "Lmu/b0;", "_cameraAvailability", "Lmu/p0;", "g", "Lmu/p0;", "I1", "()Lmu/p0;", "cameraAvailability", "Lmu/a0;", "h", "Lmu/a0;", "_cameraPriorities", "Lmu/f0;", "j", "Lmu/f0;", "m1", "()Lmu/f0;", "cameraPriorities", "k", "Lmu/g;", "cameraStatus", "l", "Lju/d2;", "cameraStatusJob", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l1 implements m.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String cameraId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CameraManager manager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ju.p0 scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iu.a closed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<m.h.a> _cameraAvailability;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<m.h.a> cameraAvailability;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mu.a0<oq.i0> _cameraPriorities;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mu.f0<oq.i0> cameraPriorities;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mu.g<m.h.a> cameraStatus;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ju.d2 cameraStatusJob;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/w;", "Lm/h$a;", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<lu.w<? super m.h.a>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f87246f;

        /* JADX INFO: renamed from: i.l1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"i/l1$a$a", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "Loq/i0;", "onCameraAccessPrioritiesChanged", "()V", "", "cameraId", "onCameraAvailable", "(Ljava/lang/String;)V", "onCameraUnavailable", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C2048a extends CameraManager.AvailabilityCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ lu.w<m.h.a> f87248a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l1 f87249b;

            /* JADX WARN: Multi-variable type inference failed */
            C2048a(lu.w<? super m.h.a> wVar, l1 l1Var) {
                this.f87248a = wVar;
                this.f87249b = l1Var;
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraAccessPrioritiesChanged() {
                k.k kVar = k.k.f107055a;
                kVar.a();
                Object objB = lu.n.b(this.f87248a, m.h.a.b.f121828a);
                if (objB instanceof lu.k.c) {
                    lu.k.e(objB);
                    if (kVar.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to emit CameraPrioritiesChanged");
                    }
                }
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraAvailable(String cameraId) {
                if (fr.t.c(cameraId, this.f87249b.cameraId)) {
                    k.k kVar = k.k.f107055a;
                    kVar.a();
                    Object objB = lu.n.b(this.f87248a, new m.h.a.CameraAvailable(h.v.b(cameraId), null));
                    if (objB instanceof lu.k.c) {
                        lu.k.e(objB);
                        if (kVar.d()) {
                            io.sentry.android.core.c2.g("CXCP", "Failed to emit CameraAvailable(" + cameraId + ')');
                        }
                    }
                }
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraUnavailable(String cameraId) {
                if (fr.t.c(cameraId, this.f87249b.cameraId)) {
                    k.k kVar = k.k.f107055a;
                    kVar.a();
                    Object objB = lu.n.b(this.f87248a, new m.h.a.CameraUnavailable(h.v.b(cameraId), null));
                    if (objB instanceof lu.k.c) {
                        lu.k.e(objB);
                        if (kVar.d()) {
                            io.sentry.android.core.c2.g("CXCP", "Failed to emit CameraUnavailable(" + cameraId + ')');
                        }
                    }
                }
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(l1 l1Var, C2048a c2048a) {
            l1Var.manager.unregisterAvailabilityCallback(c2048a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f87245e;
            if (i15 == 0) {
                oq.u.b(obj);
                lu.w wVar = (lu.w) this.f87246f;
                final C2048a c2048a = new C2048a(wVar, l1.this);
                if (Build.VERSION.SDK_INT >= 28) {
                    w.i(l1.this.manager, l1.this.threads.getLightweightExecutor(), c2048a);
                } else {
                    l1.this.manager.registerAvailabilityCallback(c2048a, l1.this.threads.i());
                }
                final l1 l1Var = l1.this;
                er.a aVar = new er.a() { // from class: i.k1
                    @Override // er.a
                    public final Object a() {
                        return l1.a.O(l1Var, c2048a);
                    }
                };
                this.f87245e = 1;
                if (lu.u.b(wVar, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(lu.w<? super m.h.a> wVar, tq.e<? super oq.i0> eVar) {
            return ((a) v(wVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = l1.this.new a(eVar);
            aVar.f87246f = obj;
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87250e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l1 f87252a;

            a(l1 l1Var) {
                this.f87252a = l1Var;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(m.h.a aVar, tq.e<? super oq.i0> eVar) {
                if (aVar instanceof m.h.a.CameraAvailable) {
                    Object objF = this.f87252a._cameraAvailability.F(aVar, eVar);
                    return objF == uq.b.e() ? objF : oq.i0.f148189a;
                }
                if (aVar instanceof m.h.a.CameraUnavailable) {
                    Object objF2 = this.f87252a._cameraAvailability.F(aVar, eVar);
                    return objF2 == uq.b.e() ? objF2 : oq.i0.f148189a;
                }
                if (!(aVar instanceof m.h.a.b)) {
                    return oq.i0.f148189a;
                }
                mu.a0 a0Var = this.f87252a._cameraPriorities;
                oq.i0 i0Var = oq.i0.f148189a;
                Object objF3 = a0Var.F(i0Var, eVar);
                return objF3 == uq.b.e() ? objF3 : i0Var;
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f87250e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVar = l1.this.cameraStatus;
                a aVar = new a(l1.this);
                this.f87250e = 1;
                if (gVar.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return l1.this.new b(eVar);
        }
    }

    public /* synthetic */ l1(nq.a aVar, k.z zVar, String str, ju.d2 d2Var, fr.k kVar) {
        this(aVar, zVar, str, d2Var);
    }

    private final mu.g<m.h.a> y() {
        return mu.i.e(new a(null));
    }

    @Override // m.h
    public mu.p0<m.h.a> I1() {
        return this.cameraAvailability;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed.a(false, true)) {
            ju.d2.a.a(this.cameraStatusJob, null, 1, null);
            ju.q0.d(this.scope, null, 1, null);
        }
    }

    @Override // m.h
    public mu.f0<oq.i0> m1() {
        return this.cameraPriorities;
    }

    private l1(nq.a<CameraManager> aVar, k.z zVar, String str, ju.d2 d2Var) {
        this.threads = zVar;
        this.cameraId = str;
        this.manager = aVar.get();
        ju.p0 p0VarA = ju.q0.a(ju.z2.a(d2Var).n0(zVar.getLightweightDispatcher().n0(new CoroutineName("CXCP-CameraStatusMonitor"))));
        this.scope = p0VarA;
        this.closed = iu.b.a(false);
        mu.b0<m.h.a> b0VarA = mu.r0.a(m.h.a.d.f121830a);
        this._cameraAvailability = b0VarA;
        this.cameraAvailability = mu.i.b(b0VarA);
        mu.a0<oq.i0> a0VarB = mu.h0.b(0, 0, null, 7, null);
        this._cameraPriorities = a0VarB;
        this.cameraPriorities = mu.i.a(a0VarB);
        this.cameraStatus = y();
        this.cameraStatusJob = ju.k.d(p0VarA, null, null, new b(null), 3, null);
    }
}
