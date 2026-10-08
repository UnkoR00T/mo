package i;

import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Li/u0;", "Li/j2;", "Lnq/a;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Lk/z;", "threads", "Lju/d2;", "cameraPipeJob", "<init>", "(Lnq/a;Lk/z;Lju/d2;)V", "Lh/v;", "cameraId", "Li/j2$a;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lnq/a;", "b", "Lk/z;", "c", "Lju/d2;", "Lmu/g;", "d", "Lmu/g;", "availableCameraFlow", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nq.a<CameraManager> cameraManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ju.d2 cameraPipeJob;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mu.g<h.v> availableCameraFlow = mu.i.e(new a(null));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/w;", "Lh/v;", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<lu.w<? super h.v>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87436e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f87437f;

        /* JADX INFO: renamed from: i.u0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"i/u0$a$a", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "", "cameraIdString", "Loq/i0;", "onCameraAvailable", "(Ljava/lang/String;)V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C2050a extends CameraManager.AvailabilityCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ lu.w<h.v> f87439a;

            /* JADX WARN: Multi-variable type inference failed */
            C2050a(lu.w<? super h.v> wVar) {
                this.f87439a = wVar;
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraAvailable(String cameraIdString) {
                lu.n.b(this.f87439a, h.v.a(h.v.b(cameraIdString)));
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(CameraManager cameraManager, C2050a c2050a) {
            cameraManager.unregisterAvailabilityCallback(c2050a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f87436e;
            if (i15 == 0) {
                oq.u.b(obj);
                lu.w wVar = (lu.w) this.f87437f;
                final C2050a c2050a = new C2050a(wVar);
                final CameraManager cameraManager = (CameraManager) u0.this.cameraManager.get();
                if (Build.VERSION.SDK_INT >= 28) {
                    w.i(cameraManager, u0.this.threads.h(), c2050a);
                } else {
                    cameraManager.registerAvailabilityCallback(c2050a, u0.this.threads.i());
                }
                er.a aVar = new er.a() { // from class: i.t0
                    @Override // er.a
                    public final Object a() {
                        return u0.a.O(cameraManager, c2050a);
                    }
                };
                this.f87436e = 1;
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
        public final Object B(lu.w<? super h.v> wVar, tq.e<? super oq.i0> eVar) {
            return ((a) v(wVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = u0.this.new a(eVar);
            aVar.f87437f = obj;
            return aVar;
        }
    }

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"i/u0$b", "Li/j2$a;", "", "timeoutMillis", "", "g1", "(JLtq/e;)Ljava/lang/Object;", "Loq/i0;", "close", "()V", "Lju/p0;", "a", "Lju/p0;", "scope", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lju/x;", "b", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements j2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ju.p0 scope;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final CopyOnWriteArrayList<ju.x<oq.i0>> listeners;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f87442e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u0 f87443f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f87444g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ b f87445h;

            /* JADX INFO: renamed from: i.u0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class C2051a<T> implements mu.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f87446a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ b f87447b;

                C2051a(String str, b bVar) {
                    this.f87446a = str;
                    this.f87447b = bVar;
                }

                @Override // mu.h
                public /* bridge */ /* synthetic */ Object F(Object obj, tq.e eVar) {
                    return a(((h.v) obj).getValue(), eVar);
                }

                public final Object a(String str, tq.e<? super oq.i0> eVar) {
                    if (h.v.d(str, this.f87446a)) {
                        if (k.k.f107055a.a()) {
                            h.v.f(str);
                        }
                        Iterator it = this.f87447b.listeners.iterator();
                        while (it.hasNext()) {
                            ((ju.x) it.next()).d0(oq.i0.f148189a);
                        }
                    }
                    return oq.i0.f148189a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u0 u0Var, String str, b bVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f87443f = u0Var;
                this.f87444g = str;
                this.f87445h = bVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f87442e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    mu.g gVar = this.f87443f.availableCameraFlow;
                    C2051a c2051a = new C2051a(this.f87444g, this.f87445h);
                    this.f87442e = 1;
                    if (gVar.a(c2051a, this) == objE) {
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
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f87443f, this.f87444g, this.f87445h, eVar);
            }
        }

        /* JADX INFO: renamed from: i.u0$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C2052b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f87448d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f87449e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f87451g;

            C2052b(tq.e<? super C2052b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f87449e = obj;
                this.f87451g |= PKIFailureInfo.systemUnavail;
                return b.this.g1(0L, this);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f87452e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ ju.x<oq.i0> f87453f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(ju.x<oq.i0> xVar, tq.e<? super c> eVar) {
                super(2, eVar);
                this.f87453f = xVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f87452e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ju.x<oq.i0> xVar = this.f87453f;
                    this.f87452e = 1;
                    if (xVar.I(this) == objE) {
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
                return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new c(this.f87453f, eVar);
            }
        }

        b(u0 u0Var, String str) {
            ju.p0 p0VarA = ju.q0.a(u0Var.threads.getBackgroundDispatcher().n0(ju.z2.a(u0Var.cameraPipeJob)));
            this.scope = p0VarA;
            this.listeners = new CopyOnWriteArrayList<>();
            ju.k.d(p0VarA, null, null, new a(u0Var, str, this, null), 3, null);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            ju.q0.d(this.scope, null, 1, null);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // i.j2.a
        public Object g1(long j15, tq.e<? super Boolean> eVar) throws Throwable {
            C2052b c2052b;
            ju.x<oq.i0> xVar;
            if (eVar instanceof C2052b) {
                c2052b = (C2052b) eVar;
                int i15 = c2052b.f87451g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c2052b.f87451g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c2052b = new C2052b(eVar);
                }
            } else {
                c2052b = new C2052b(eVar);
            }
            Object objE = c2052b.f87449e;
            Object objE2 = uq.b.e();
            int i16 = c2052b.f87451g;
            if (i16 == 0) {
                oq.u.b(objE);
                ju.x<oq.i0> xVarC = ju.z.c(null, 1, null);
                this.listeners.add(xVarC);
                c cVar = new c(xVarC, null);
                c2052b.f87448d = xVarC;
                c2052b.f87451g = 1;
                objE = ju.g3.e(j15, cVar, c2052b);
                if (objE == objE2) {
                    return objE2;
                }
                xVar = xVarC;
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xVar = (ju.x) c2052b.f87448d;
                oq.u.b(objE);
            }
            boolean z15 = objE != null;
            this.listeners.remove(xVar);
            return vq.b.a(z15);
        }
    }

    public u0(nq.a<CameraManager> aVar, k.z zVar, ju.d2 d2Var) {
        this.cameraManager = aVar;
        this.threads = zVar;
        this.cameraPipeJob = d2Var;
    }

    @Override // i.j2
    public Object a(String str, tq.e<? super j2.a> eVar) {
        return new b(this, str);
    }
}
