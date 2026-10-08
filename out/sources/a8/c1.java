package a8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class c1 extends t7.d implements x {
    private final w7.t0 A;
    private v2 A0;
    private final w7.y0 B;
    private int B0;
    private final long C;
    private long C0;
    private final n3 D;
    private final w7.e<Integer> E;
    private final w7.f0 F;
    private final g G;
    private final c H;
    private final c I;
    private int J;
    private boolean K;
    private int L;
    private int M;
    private boolean N;
    private boolean O;
    private e3 P;
    private f3 Q;
    private h8.b1 R;
    private x.c S;
    private boolean T;
    private t7.a0.b U;
    private t7.u V;
    private t7.u W;
    private t7.p X;
    private t7.p Y;
    private Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Surface f4263a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j8.y f4264b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private SurfaceHolder f4265b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final t7.a0.b f4266c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private n8.d f4267c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w7.k f4268d = new w7.k();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f4269d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f4270e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private TextureView f4271e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t7.a0 f4272f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f4273f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z2[] f4274g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f4275g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z2[] f4276h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private w7.d0 f4277h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j8.x f4278i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private a8.e f4279i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w7.p f4280j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private a8.e f4281j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w1.f f4282k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private t7.b f4283k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w1 f4284l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f4285l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w7.s<t7.a0.d> f4286m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f4287m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CopyOnWriteArraySet<x.a> f4288n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private v7.c f4289n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final t7.e0.b f4290o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f4291o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<f> f4292p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f4293p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f4294q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f4295q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final h8.c0.a f4296r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private t7.b0 f4297r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final b8.a f4298s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f4299s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Looper f4300t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f4301t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final k8.d f4302u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private t7.k f4303u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final w7.h f4304v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private t7.m0 f4305v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final d f4306w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private long f4307w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final e f4308x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private long f4309x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final u7.c f4310y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private long f4311y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final l3 f4312z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private t7.u f4313z0;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {
        public static /* synthetic */ void a(Context context, boolean z15, c1 c1Var, b8.e2 e2Var) {
            b8.b2 b2VarB0 = b8.b2.B0(context);
            if (b2VarB0 == null) {
                w7.t.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return;
            }
            if (z15) {
                c1Var.V0(b2VarB0);
            }
            e2Var.b(b2VarB0.I0());
        }

        public static void b(final Context context, final c1 c1Var, final boolean z15, final b8.e2 e2Var) {
            c1Var.e1().e(c1Var.j1(), null).j(new Runnable() { // from class: a8.d1
                @Override // java.lang.Runnable
                public final void run() {
                    c1.b.a(context, z15, c1Var, e2Var);
                }
            });
        }
    }

    private final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f4314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<a8.d, List<String>> f4315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a8.c f4316c;

        private a8.c b(a8.c cVar, List<String> list) {
            a8.c.b bVarC = cVar.c();
            HashSet hashSet = new HashSet(list);
            for (String str : cVar.e()) {
                if (!hashSet.contains(str)) {
                    bVarC.b(str);
                }
            }
            return bVarC.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(a8.c cVar) {
            for (Map.Entry entry : new HashMap(this.f4315b).entrySet()) {
                a8.d dVar = (a8.d) entry.getKey();
                List<String> list = (List) entry.getValue();
                a8.c cVarB = b(cVar, list);
                if (!cVarB.equals(b(this.f4316c, list))) {
                    dVar.a(cVarB);
                }
            }
            this.f4316c = cVar;
        }

        private c(int i15) {
            this.f4314a = i15;
            this.f4315b = new HashMap();
            this.f4316c = a8.c.f4259b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d implements m8.k0, c8.z, i8.h, g8.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, n8.d.a, u7.c.InterfaceC5102c, l3.b, x.a, w7.f0.b {
        private d() {
        }

        @Override // g8.b
        public void A(final t7.v vVar) {
            c1 c1Var = c1.this;
            c1Var.f4313z0 = c1Var.f4313z0.b().P(vVar).L();
            t7.u uVarX0 = c1.this.X0();
            if (!uVarX0.equals(c1.this.V)) {
                c1.this.V = uVarX0;
                c1.this.f4286m.h(14, new w7.s.a() { // from class: a8.n1
                    @Override // w7.s.a
                    public final void b(Object obj) {
                        ((t7.a0.d) obj).i0(c1.this.V);
                    }
                });
            }
            c1.this.f4286m.h(28, new w7.s.a() { // from class: a8.o1
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).A(vVar);
                }
            });
            c1.this.f4286m.e();
        }

        @Override // m8.k0
        public void B(long j15, int i15) {
            c1.this.f4298s.B(j15, i15);
        }

        @Override // w7.f0.b
        public void C(w7.g0 g0Var) {
            c1.this.G1(w.d(g0Var, 1003));
        }

        @Override // c8.z
        public void D(a8.c cVar) {
            c1.this.H.c(cVar);
        }

        @Override // n8.d.a
        public void E(Surface surface) {
            c1.this.F1(null);
        }

        @Override // a8.l3.b
        public void G(final int i15, final boolean z15) {
            c1.this.f4286m.k(30, new w7.s.a() { // from class: a8.h1
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).S(i15, z15);
                }
            });
        }

        @Override // a8.x.a
        public void H(boolean z15) {
            c1.this.L1();
        }

        @Override // m8.k0
        public void I(a8.c cVar) {
            c1.this.I.c(cVar);
        }

        @Override // m8.k0
        public void a(final t7.m0 m0Var) {
            c1.this.f4305v0 = m0Var;
            c1.this.f4286m.k(25, new w7.s.a() { // from class: a8.e1
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).a(m0Var);
                }
            });
        }

        @Override // a8.l3.b
        public void b(int i15) {
            final t7.k kVarZ0 = c1.Z0(c1.this.f4312z);
            if (kVarZ0.equals(c1.this.f4303u0)) {
                return;
            }
            c1.this.f4303u0 = kVarZ0;
            c1.this.f4286m.k(29, new w7.s.a() { // from class: a8.g1
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).J(kVarZ0);
                }
            });
        }

        @Override // c8.z
        public void c(final int i15) {
            c1.this.E.h(new zj.g() { // from class: a8.j1
                @Override // zj.g
                public final Object apply(Object obj) {
                    return Integer.valueOf(i15);
                }
            }, new zj.g() { // from class: a8.k1
                @Override // zj.g
                public final Object apply(Object obj) {
                    return Integer.valueOf(i15);
                }
            });
        }

        @Override // c8.z
        public void d(final boolean z15) {
            if (c1.this.f4287m0 == z15) {
                return;
            }
            c1.this.f4287m0 = z15;
            c1.this.f4286m.k(23, new w7.s.a() { // from class: a8.l1
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).d(z15);
                }
            });
        }

        @Override // c8.z
        public void e(Exception exc) {
            c1.this.f4298s.e(exc);
        }

        @Override // c8.z
        public void f(c8.a0.a aVar) {
            c1.this.f4298s.f(aVar);
        }

        @Override // c8.z
        public void g(c8.a0.a aVar) {
            c1.this.f4298s.g(aVar);
        }

        @Override // m8.k0
        public void h(t7.p pVar, a8.f fVar) {
            c1.this.X = pVar;
            c1.this.f4298s.h(pVar, fVar);
        }

        @Override // m8.k0
        public void i(String str) {
            c1.this.f4298s.i(str);
        }

        @Override // m8.k0
        public void j(String str, long j15, long j16) {
            c1.this.f4298s.j(str, j15, j16);
        }

        @Override // c8.z
        public void k(t7.p pVar, a8.f fVar) {
            c1.this.Y = pVar;
            c1.this.f4298s.k(pVar, fVar);
        }

        @Override // i8.h
        public void l(final v7.c cVar) {
            c1.this.f4289n0 = cVar;
            c1.this.f4286m.k(27, new w7.s.a() { // from class: a8.m1
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).l(cVar);
                }
            });
        }

        @Override // c8.z
        public void m(String str) {
            c1.this.f4298s.m(str);
        }

        @Override // c8.z
        public void n(String str, long j15, long j16) {
            c1.this.f4298s.n(str, j15, j16);
        }

        @Override // c8.z
        public void o(a8.e eVar) {
            c1.this.f4281j0 = eVar;
            c1.this.f4298s.o(eVar);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i15, int i16) {
            c1.this.E1(surfaceTexture);
            c1.this.t1(i15, i16);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            c1.this.F1(null);
            c1.this.t1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i15, int i16) {
            c1.this.t1(i15, i16);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // i8.h
        public void p(final List<v7.a> list) {
            c1.this.f4286m.k(27, new w7.s.a() { // from class: a8.f1
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).p(list);
                }
            });
        }

        @Override // c8.z
        public void q(long j15) {
            c1.this.f4298s.q(j15);
        }

        @Override // m8.k0
        public void r(Exception exc) {
            c1.this.f4298s.r(exc);
        }

        @Override // m8.k0
        public void s(a8.e eVar) {
            c1.this.f4279i0 = eVar;
            c1.this.f4298s.s(eVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i15, int i16, int i17) {
            c1.this.t1(i16, i17);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (c1.this.f4269d0) {
                c1.this.F1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (c1.this.f4269d0) {
                c1.this.F1(null);
            }
            c1.this.t1(0, 0);
        }

        @Override // c8.z
        public void t(a8.e eVar) {
            c1.this.f4298s.t(eVar);
            c1.this.Y = null;
            c1.this.f4281j0 = null;
        }

        @Override // u7.c.InterfaceC5102c
        public void u() {
            c1.this.I1(false, 3);
        }

        @Override // m8.k0
        public void v(a8.e eVar) {
            c1.this.f4298s.v(eVar);
            c1.this.X = null;
            c1.this.f4279i0 = null;
        }

        @Override // m8.k0
        public void w(int i15, long j15) {
            c1.this.f4298s.w(i15, j15);
        }

        @Override // m8.k0
        public void x(Object obj, long j15) {
            c1.this.f4298s.x(obj, j15);
            if (c1.this.Z == obj) {
                c1.this.f4286m.k(26, new w7.s.a() { // from class: a8.i1
                    @Override // w7.s.a
                    public final void b(Object obj2) {
                        ((t7.a0.d) obj2).V();
                    }
                });
            }
        }

        @Override // c8.z
        public void y(Exception exc) {
            c1.this.f4298s.y(exc);
        }

        @Override // c8.z
        public void z(int i15, long j15, long j16) {
            c1.this.f4298s.z(i15, j15, j16);
        }
    }

    private static final class e implements m8.t, n8.a, x2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private m8.t f4319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n8.a f4320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m8.t f4321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n8.a f4322d;

        private e() {
        }

        @Override // a8.x2.b
        public void A(int i15, Object obj) {
            if (i15 == 7) {
                this.f4319a = (m8.t) obj;
                return;
            }
            if (i15 == 8) {
                this.f4320b = (n8.a) obj;
                return;
            }
            if (i15 != 10000) {
                return;
            }
            n8.d dVar = (n8.d) obj;
            if (dVar == null) {
                this.f4321c = null;
                this.f4322d = null;
            } else {
                this.f4321c = dVar.getVideoFrameMetadataListener();
                this.f4322d = dVar.getCameraMotionListener();
            }
        }

        @Override // n8.a
        public void a(long j15, float[] fArr) {
            n8.a aVar = this.f4322d;
            if (aVar != null) {
                aVar.a(j15, fArr);
            }
            n8.a aVar2 = this.f4320b;
            if (aVar2 != null) {
                aVar2.a(j15, fArr);
            }
        }

        @Override // m8.t
        public void d(long j15, long j16, t7.p pVar, MediaFormat mediaFormat) {
            long j17;
            long j18;
            t7.p pVar2;
            MediaFormat mediaFormat2;
            m8.t tVar = this.f4321c;
            if (tVar != null) {
                tVar.d(j15, j16, pVar, mediaFormat);
                mediaFormat2 = mediaFormat;
                pVar2 = pVar;
                j18 = j16;
                j17 = j15;
            } else {
                j17 = j15;
                j18 = j16;
                pVar2 = pVar;
                mediaFormat2 = mediaFormat;
            }
            m8.t tVar2 = this.f4319a;
            if (tVar2 != null) {
                tVar2.d(j17, j18, pVar2, mediaFormat2);
            }
        }

        @Override // n8.a
        public void i() {
            n8.a aVar = this.f4322d;
            if (aVar != null) {
                aVar.i();
            }
            n8.a aVar2 = this.f4320b;
            if (aVar2 != null) {
                aVar2.i();
            }
        }
    }

    private static final class f implements h2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f4323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h8.c0 f4324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t7.e0 f4325c;

        public f(Object obj, h8.z zVar) {
            this.f4323a = obj;
            this.f4324b = zVar;
            this.f4325c = zVar.U();
        }

        @Override // a8.h2
        public Object a() {
            return this.f4323a;
        }

        @Override // a8.h2
        public t7.e0 b() {
            return this.f4325c;
        }

        public void c(t7.e0 e0Var) {
            this.f4325c = e0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f4326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IntConsumer f4327b;

        /* JADX INFO: Access modifiers changed from: private */
        public void c(int i15) {
            if (c1.this.f4301t0) {
                return;
            }
            c1.this.z1(1, 19, Integer.valueOf(i15));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            Context context = this.f4326a.get();
            if (context == null) {
                return;
            }
            context.unregisterDeviceIdChangeListener(this.f4327b);
        }

        private g(Context context) {
            this.f4326a = new WeakReference<>(context);
            IntConsumer intConsumer = new IntConsumer() { // from class: a8.p1
                @Override // java.util.function.IntConsumer
                public final void accept(int i15) {
                    this.f4589a.c(i15);
                }
            };
            this.f4327b = intConsumer;
            w7.p pVarE = c1.this.f4304v.e(c1.this.f4300t, null);
            Objects.requireNonNull(pVarE);
            context.registerDeviceIdChangeListener(new q1(pVarE), intConsumer);
        }
    }

    static {
        t7.t.a("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public c1(x.b bVar, t7.a0 a0Var) {
        w7.h hVar;
        try {
            w7.t.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.0] [" + w7.o0.f210728e + "]");
            this.f4270e = bVar.f4745a.getApplicationContext();
            this.f4298s = bVar.f4753i.apply(bVar.f4746b);
            this.f4295q0 = bVar.f4756l;
            this.f4297r0 = bVar.f4757m;
            this.f4283k0 = bVar.f4758n;
            this.f4273f0 = bVar.f4765u;
            this.f4275g0 = bVar.f4766v;
            this.f4287m0 = bVar.f4763s;
            this.C = bVar.E;
            d dVar = new d();
            this.f4306w = dVar;
            this.f4308x = new e();
            Handler handler = new Handler(bVar.f4755k);
            d3 d3Var = bVar.f4748d.get();
            z2[] z2VarArrA = d3Var.a(handler, dVar, dVar, dVar, dVar);
            this.f4274g = z2VarArrA;
            zj.p.w(z2VarArrA.length > 0);
            this.f4276h = new z2[z2VarArrA.length];
            int i15 = 0;
            while (true) {
                z2[] z2VarArr = this.f4276h;
                if (i15 >= z2VarArr.length) {
                    break;
                }
                z2 z2Var = this.f4274g[i15];
                d dVar2 = this.f4306w;
                z2VarArr[i15] = d3Var.b(z2Var, handler, dVar2, dVar2, dVar2, dVar2);
                i15++;
            }
            j8.x xVar = bVar.f4750f.get();
            this.f4278i = xVar;
            this.f4296r = bVar.f4749e.get();
            k8.d dVar3 = bVar.f4752h.get();
            this.f4302u = dVar3;
            this.f4294q = bVar.f4767w;
            this.Q = bVar.f4768x;
            this.f4307w0 = bVar.f4770z;
            this.f4309x0 = bVar.A;
            this.f4311y0 = bVar.B;
            this.P = bVar.f4769y;
            this.T = bVar.J;
            Looper looper = bVar.f4755k;
            this.f4300t = looper;
            w7.h hVar2 = bVar.f4746b;
            this.f4304v = hVar2;
            t7.a0 a0Var2 = a0Var == null ? this : a0Var;
            this.f4272f = a0Var2;
            this.f4286m = new w7.s<>(looper, hVar2, new w7.s.b() { // from class: a8.l0
                @Override // w7.s.b
                public final void a(Object obj, t7.n nVar) {
                    ((t7.a0.d) obj).K(this.f4545a.f4272f, new t7.a0.c(nVar));
                }
            });
            this.f4288n = new CopyOnWriteArraySet<>();
            this.f4292p = new ArrayList();
            this.R = new h8.b1.a(0);
            this.S = x.c.f4771b;
            z2[] z2VarArr2 = this.f4274g;
            j8.y yVar = new j8.y(new b3[z2VarArr2.length], new j8.r[z2VarArr2.length], t7.i0.f188292b, null);
            this.f4264b = yVar;
            this.f4290o = new t7.e0.b();
            t7.a0.b bVarE = new t7.a0.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).d(29, xVar.g()).d(23, bVar.f4764t).d(25, bVar.f4764t).d(33, bVar.f4764t).d(26, bVar.f4764t).d(34, bVar.f4764t).e();
            this.f4266c = bVarE;
            this.U = new t7.a0.b.a().b(bVarE).a(4).a(10).e();
            this.f4280j = hVar2.e(looper, null);
            w1.f fVar = new w1.f() { // from class: a8.m0
                @Override // a8.w1.f
                public final void a(w1.e eVar) {
                    c1 c1Var = this.f4563a;
                    c1Var.f4280j.j(new Runnable() { // from class: a8.s0
                        @Override // java.lang.Runnable
                        public final void run() {
                            c1Var.o1(eVar);
                        }
                    });
                }
            };
            this.f4282k = fVar;
            this.A0 = v2.k(yVar);
            this.f4298s.e0(a0Var2, looper);
            b8.e2 e2Var = new b8.e2(bVar.O);
            w1 w1Var = new w1(this.f4270e, this.f4274g, this.f4276h, xVar, yVar, bVar.f4751g.get(), dVar3, this.J, this.K, this.f4298s, this.Q, bVar.C, bVar.D, this.T, bVar.P, looper, hVar2, fVar, e2Var, bVar.L, this.S, this.f4308x, bVar.R);
            this.f4284l = w1Var;
            Looper looperP = w1Var.P();
            this.f4285l0 = 1.0f;
            this.J = 0;
            t7.u uVar = t7.u.J;
            this.V = uVar;
            this.W = uVar;
            this.f4313z0 = uVar;
            this.B0 = -1;
            this.f4289n0 = v7.c.f204205d;
            this.f4291o0 = true;
            i(this.f4298s);
            dVar3.e(new Handler(looper), this.f4298s);
            W0(this.f4306w);
            long j15 = bVar.f4747c;
            if (j15 > 0) {
                w1Var.H(j15);
            }
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 31) {
                b.b(this.f4270e, this, bVar.K, e2Var);
            }
            w7.e<Integer> eVar = new w7.e<>(0, looperP, looper, hVar2, new w7.e.a() { // from class: a8.n0
                @Override // w7.e.a
                public final void a(Object obj, Object obj2) {
                    this.f4572a.v1(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            this.E = eVar;
            eVar.e(new Runnable() { // from class: a8.o0
                @Override // java.lang.Runnable
                public final void run() {
                    c1 c1Var = this.f4579a;
                    c1Var.E.g(Integer.valueOf(w7.o0.I(c1Var.f4270e)));
                }
            });
            u7.c cVar = new u7.c(bVar.f4745a, looperP, bVar.f4755k, this.f4306w, hVar2);
            w7.h hVar3 = hVar2;
            this.f4310y = cVar;
            cVar.d(bVar.f4762r);
            if (bVar.N) {
                n3 n3Var = bVar.Q;
                this.D = n3Var;
                n3Var.a(new n3.a() { // from class: a8.q0
                    @Override // a8.n3.a
                    public final void a(boolean z15) {
                        this.f4593a.w1(z15);
                    }
                }, this.f4270e, looper, looperP, hVar3);
                hVar3 = hVar3;
            } else {
                this.D = null;
            }
            if (bVar.f4764t) {
                w7.h hVar4 = hVar3;
                hVar = hVar4;
                this.f4312z = new l3(bVar.f4745a, this.f4306w, this.f4283k0.c(), looperP, looper, hVar4);
            } else {
                hVar = hVar3;
                this.f4312z = null;
            }
            int i17 = bVar.f4761q ? bVar.f4760p : (bVar.F == Integer.MAX_VALUE || bVar.G == Integer.MAX_VALUE || bVar.H == Integer.MAX_VALUE || bVar.I == Integer.MAX_VALUE) ? 0 : 1;
            w7.t0 t0Var = new w7.t0(bVar.f4745a, r16, hVar);
            this.A = t0Var;
            t0Var.f(i17 != 0);
            w7.y0 y0Var = new w7.y0(bVar.f4745a, looperP, hVar);
            this.B = y0Var;
            int i18 = 2;
            y0Var.f(i17 == 2);
            this.f4303u0 = t7.k.f188306e;
            this.f4305v0 = t7.m0.f188329e;
            this.f4277h0 = w7.d0.f210624c;
            this.G = i16 >= 34 ? new g(bVar.f4745a) : null;
            this.H = new c(1);
            this.I = new c(i18);
            this.F = new w7.f0(this, this.f4306w, hVar, bVar.F, bVar.G, bVar.H, bVar.I);
            w1Var.w1(this.P);
            w1Var.i1(this.f4283k0, bVar.f4759o);
            z1(1, 3, this.f4283k0);
            z1(2, 4, Integer.valueOf(this.f4273f0));
            z1(2, 5, Integer.valueOf(this.f4275g0));
            z1(1, 9, Boolean.valueOf(this.f4287m0));
            z1(6, 8, this.f4308x);
            A1(16, Integer.valueOf(this.f4295q0));
            c8.k kVar = bVar.f4754j;
            if (kVar != null) {
                z1(1, 20, kVar);
            }
        } finally {
            this.f4268d.f();
        }
    }

    private void A1(int i15, Object obj) {
        z1(-1, i15, obj);
    }

    private List<u2.c> B1(List<h8.c0> list, int i15) {
        this.f4292p.clear();
        ArrayList arrayList = new ArrayList();
        for (int i16 = 0; i16 < list.size(); i16++) {
            u2.c cVar = new u2.c(list.get(i16), this.f4294q);
            arrayList.add(cVar);
            this.f4292p.add(i16, new f(cVar.f4640b, cVar.f4639a));
        }
        this.R = this.R.f(arrayList.size(), i15);
        return arrayList;
    }

    private void D1(List<h8.c0> list, int i15, long j15, boolean z15) {
        long j16;
        int iA;
        int i16;
        int iI1 = i1(this.A0);
        long jG = G();
        this.L++;
        List<u2.c> listB1 = B1(list, i15);
        t7.e0 e0VarA1 = a1();
        if (!e0VarA1.q() && i15 >= e0VarA1.p()) {
            throw new t7.q(e0VarA1, i15, j15);
        }
        if (z15) {
            j16 = -9223372036854775807L;
            iA = e0VarA1.a(this.K);
        } else if (i15 == -1) {
            iA = iI1;
            j16 = jG;
        } else {
            j16 = j15;
            iA = i15;
        }
        v2 v2VarR1 = r1(this.A0, e0VarA1, s1(e0VarA1, iA, j16));
        if (v2VarR1.f4653e == 1) {
            i16 = 1;
        } else {
            i16 = 4;
            if (!e0VarA1.q()) {
                if (iA == -1) {
                    i16 = v2VarR1.f4653e;
                } else if (iA < e0VarA1.p()) {
                    i16 = 2;
                }
            }
        }
        v2 v2VarQ1 = q1(v2VarR1, i16);
        this.f4284l.n1(listB1, iA, w7.o0.J0(j16), this.R);
        J1(v2VarQ1, 0, (this.A0.f4650b.f81468a.equals(v2VarQ1.f4650b.f81468a) || this.A0.f4649a.q()) ? false : true, 4, h1(v2VarQ1), -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        F1(surface);
        this.f4263a0 = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F1(Object obj) {
        Object obj2 = this.Z;
        boolean z15 = (obj2 == null || obj2 == obj) ? false : true;
        boolean zD1 = this.f4284l.D1(obj, z15 ? this.C : -9223372036854775807L);
        if (z15) {
            Object obj3 = this.Z;
            Surface surface = this.f4263a0;
            if (obj3 == surface) {
                surface.release();
                this.f4263a0 = null;
            }
        }
        this.Z = obj;
        if (zD1) {
            return;
        }
        G1(w.d(new x1(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G1(w wVar) {
        v2 v2Var = this.A0;
        v2 v2VarC = v2Var.c(v2Var.f4650b);
        v2VarC.f4665q = v2VarC.f4667s;
        v2VarC.f4666r = 0L;
        v2 v2VarQ1 = q1(v2VarC, 1);
        if (wVar != null) {
            v2VarQ1 = v2VarQ1.f(wVar);
        }
        this.L++;
        this.f4284l.N1();
        J1(v2VarQ1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void H1() {
        t7.a0.b bVar = this.U;
        t7.a0.b bVarN = w7.o0.N(this.f4272f, this.f4266c);
        this.U = bVarN;
        if (bVarN.equals(bVar)) {
            return;
        }
        this.f4286m.h(13, new w7.s.a() { // from class: a8.t0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((t7.a0.d) obj).R(this.f4613a.U);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I1(boolean z15, int i15) {
        int iY0 = Y0(z15);
        v2 v2VarA = this.A0;
        if (v2VarA.f4660l == z15 && v2VarA.f4662n == iY0 && v2VarA.f4661m == i15) {
            return;
        }
        this.L++;
        if (v2VarA.f4664p) {
            v2VarA = v2VarA.a();
        }
        v2 v2VarE = v2VarA.e(z15, i15, iY0);
        this.f4284l.q1(z15, i15, iY0);
        J1(v2VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void J1(final v2 v2Var, final int i15, boolean z15, final int i16, long j15, int i17, boolean z16) {
        v2 v2Var2 = this.A0;
        this.A0 = v2Var;
        boolean zEquals = v2Var2.f4649a.equals(v2Var.f4649a);
        Pair<Boolean, Integer> pairD1 = d1(v2Var, v2Var2, z15, i16, !zEquals, z16);
        boolean zBooleanValue = ((Boolean) pairD1.first).booleanValue();
        final int iIntValue = ((Integer) pairD1.second).intValue();
        final t7.s sVar = null;
        if (zBooleanValue) {
            if (!v2Var.f4649a.q()) {
                sVar = v2Var.f4649a.n(v2Var.f4649a.h(v2Var.f4650b.f81468a, this.f4290o).f188138c, this.f188121a).f188155c;
            }
            this.f4313z0 = t7.u.J;
        }
        if (zBooleanValue || !v2Var2.f4658j.equals(v2Var.f4658j)) {
            this.f4313z0 = this.f4313z0.b().O(v2Var.f4658j).L();
        }
        t7.u uVarX0 = X0();
        boolean zEquals2 = uVarX0.equals(this.V);
        this.V = uVarX0;
        boolean z17 = v2Var2.f4660l != v2Var.f4660l;
        boolean z18 = v2Var2.f4653e != v2Var.f4653e;
        if (z18 || z17) {
            L1();
        }
        boolean z19 = v2Var2.f4655g;
        boolean z25 = v2Var.f4655g;
        boolean z26 = z19 != z25;
        if (z26) {
            K1(z25);
        }
        if (!zEquals) {
            this.f4286m.h(0, new w7.s.a() { // from class: a8.p0
                @Override // w7.s.a
                public final void b(Object obj) {
                    t7.a0.d dVar = (t7.a0.d) obj;
                    dVar.F(v2Var.f4649a, i15);
                }
            });
        }
        if (z15) {
            final t7.a0.e eVarM1 = m1(i16, v2Var2, i17);
            final t7.a0.e eVarL1 = l1(j15);
            this.f4286m.h(11, new w7.s.a() { // from class: a8.y0
                @Override // w7.s.a
                public final void b(Object obj) {
                    c1.S(i16, eVarM1, eVarL1, (t7.a0.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f4286m.h(1, new w7.s.a() { // from class: a8.z0
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).L(sVar, iIntValue);
                }
            });
        }
        if (v2Var2.f4654f != v2Var.f4654f) {
            this.f4286m.h(10, new w7.s.a() { // from class: a8.a1
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).T(v2Var.f4654f);
                }
            });
            if (v2Var.f4654f != null) {
                this.f4286m.h(10, new w7.s.a() { // from class: a8.b1
                    @Override // w7.s.a
                    public final void b(Object obj) {
                        ((t7.a0.d) obj).f0(v2Var.f4654f);
                    }
                });
            }
        }
        j8.y yVar = v2Var2.f4657i;
        j8.y yVar2 = v2Var.f4657i;
        if (yVar != yVar2) {
            this.f4278i.h(yVar2.f100155e);
            this.f4286m.h(2, new w7.s.a() { // from class: a8.f0
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).k0(v2Var.f4657i.f100154d);
                }
            });
        }
        if (!zEquals2) {
            final t7.u uVar = this.V;
            this.f4286m.h(14, new w7.s.a() { // from class: a8.g0
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).i0(uVar);
                }
            });
        }
        if (z26) {
            this.f4286m.h(3, new w7.s.a() { // from class: a8.h0
                @Override // w7.s.a
                public final void b(Object obj) {
                    c1.f0(v2Var, (t7.a0.d) obj);
                }
            });
        }
        if (z18 || z17) {
            this.f4286m.h(-1, new w7.s.a() { // from class: a8.i0
                @Override // w7.s.a
                public final void b(Object obj) {
                    v2 v2Var3 = v2Var;
                    ((t7.a0.d) obj).h0(v2Var3.f4660l, v2Var3.f4653e);
                }
            });
        }
        if (z18) {
            this.f4286m.h(4, new w7.s.a() { // from class: a8.j0
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).M(v2Var.f4653e);
                }
            });
        }
        if (z17 || v2Var2.f4661m != v2Var.f4661m) {
            this.f4286m.h(5, new w7.s.a() { // from class: a8.u0
                @Override // w7.s.a
                public final void b(Object obj) {
                    v2 v2Var3 = v2Var;
                    ((t7.a0.d) obj).j0(v2Var3.f4660l, v2Var3.f4661m);
                }
            });
        }
        if (v2Var2.f4662n != v2Var.f4662n) {
            this.f4286m.h(6, new w7.s.a() { // from class: a8.v0
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).C(v2Var.f4662n);
                }
            });
        }
        if (v2Var2.n() != v2Var.n()) {
            this.f4286m.h(7, new w7.s.a() { // from class: a8.w0
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).p0(v2Var.n());
                }
            });
        }
        if (!v2Var2.f4663o.equals(v2Var.f4663o)) {
            this.f4286m.h(12, new w7.s.a() { // from class: a8.x0
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).u(v2Var.f4663o);
                }
            });
        }
        H1();
        this.f4286m.e();
        if (v2Var2.f4664p != v2Var.f4664p) {
            Iterator<x.a> it = this.f4288n.iterator();
            while (it.hasNext()) {
                it.next().H(v2Var.f4664p);
            }
        }
    }

    private void K1(boolean z15) {
        t7.b0 b0Var = this.f4297r0;
        if (b0Var != null) {
            if (z15 && !this.f4299s0) {
                b0Var.a(this.f4295q0);
                this.f4299s0 = true;
            } else {
                if (z15 || !this.f4299s0) {
                    return;
                }
                b0Var.b(this.f4295q0);
                this.f4299s0 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L1() {
        int iB = B();
        boolean z15 = false;
        if (iB != 1) {
            if (iB == 2 || iB == 3) {
                boolean zP1 = p1();
                w7.t0 t0Var = this.A;
                if (u() && !zP1) {
                    z15 = true;
                }
                t0Var.g(z15);
                this.B.g(u());
                return;
            }
            if (iB != 4) {
                throw new IllegalStateException();
            }
        }
        this.A.g(false);
        this.B.g(false);
    }

    private void M1() {
        this.f4268d.b();
        if (Thread.currentThread() != s().getThread()) {
            String strF = w7.o0.F("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), s().getThread().getName());
            if (this.f4291o0) {
                throw new IllegalStateException(strF);
            }
            w7.t.i("ExoPlayerImpl", strF, this.f4293p0 ? null : new IllegalStateException());
            this.f4293p0 = true;
        }
    }

    public static /* synthetic */ void S(int i15, t7.a0.e eVar, t7.a0.e eVar2, t7.a0.d dVar) {
        dVar.Z(i15);
        dVar.Q(eVar, eVar2, i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public t7.u X0() {
        t7.e0 e0VarR = r();
        if (e0VarR.q()) {
            return this.f4313z0;
        }
        return this.f4313z0.b().N(e0VarR.n(D(), this.f188121a).f188155c.f188436e).L();
    }

    private int Y0(boolean z15) {
        if (this.O) {
            return 4;
        }
        n3 n3Var = this.D;
        if (n3Var == null || n3Var.b()) {
            return (this.A0.f4662n != 1 || z15) ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static t7.k Z0(l3 l3Var) {
        return new t7.k.b(0).g(l3Var != null ? l3Var.j() : 0).f(l3Var != null ? l3Var.i() : 0).e();
    }

    private t7.e0 a1() {
        return new y2(this.f4292p, this.R);
    }

    private List<h8.c0> b1(List<t7.s> list) {
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < list.size(); i15++) {
            arrayList.add(this.f4296r.d(list.get(i15)));
        }
        return arrayList;
    }

    private x2 c1(x2.b bVar) {
        int iI1 = i1(this.A0);
        w1 w1Var = this.f4284l;
        t7.e0 e0Var = this.A0.f4649a;
        if (iI1 == -1) {
            iI1 = 0;
        }
        return new x2(w1Var, bVar, e0Var, iI1, this.f4304v, w1Var.P());
    }

    private Pair<Boolean, Integer> d1(v2 v2Var, v2 v2Var2, boolean z15, int i15, boolean z16, boolean z17) {
        t7.e0 e0Var = v2Var2.f4649a;
        t7.e0 e0Var2 = v2Var.f4649a;
        if (e0Var2.q() && e0Var.q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i16 = 3;
        if (e0Var2.q() != e0Var.q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (e0Var.n(e0Var.h(v2Var2.f4650b.f81468a, this.f4290o).f188138c, this.f188121a).f188153a.equals(e0Var2.n(e0Var2.h(v2Var.f4650b.f81468a, this.f4290o).f188138c, this.f188121a).f188153a)) {
            if (z15 && i15 == 0 && v2Var2.f4650b.f81471d < v2Var.f4650b.f81471d) {
                return new Pair<>(Boolean.TRUE, 0);
            }
            return (z15 && i15 == 1 && z17) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z15 && i15 == 0) {
            i16 = 1;
        } else if (z15 && i15 == 1) {
            i16 = 2;
        } else if (!z16) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i16));
    }

    public static /* synthetic */ void f0(v2 v2Var, t7.a0.d dVar) {
        dVar.E(v2Var.f4655g);
        dVar.c0(v2Var.f4655g);
    }

    private long g1(v2 v2Var) {
        if (!v2Var.f4650b.b()) {
            return w7.o0.g1(h1(v2Var));
        }
        v2Var.f4649a.h(v2Var.f4650b.f81468a, this.f4290o);
        return v2Var.f4651c == -9223372036854775807L ? v2Var.f4649a.n(i1(v2Var), this.f188121a).b() : this.f4290o.n() + w7.o0.g1(v2Var.f4651c);
    }

    private long h1(v2 v2Var) {
        if (v2Var.f4649a.q()) {
            return w7.o0.J0(this.C0);
        }
        long jM = v2Var.f4664p ? v2Var.m() : v2Var.f4667s;
        return v2Var.f4650b.b() ? jM : x1(v2Var.f4649a, v2Var.f4650b, jM);
    }

    private int i1(v2 v2Var) {
        return v2Var.f4649a.q() ? this.B0 : v2Var.f4649a.h(v2Var.f4650b.f81468a, this.f4290o).f188138c;
    }

    private t7.a0.e l1(long j15) {
        Object obj;
        t7.s sVar;
        Object obj2;
        int iD = D();
        int iV = v();
        if (this.A0.f4649a.q()) {
            obj = null;
            sVar = null;
            obj2 = null;
        } else {
            v2 v2Var = this.A0;
            Object obj3 = v2Var.f4650b.f81468a;
            v2Var.f4649a.h(obj3, this.f4290o);
            iV = this.A0.f4649a.b(obj3);
            obj2 = obj3;
            obj = this.A0.f4649a.n(iD, this.f188121a).f188153a;
            sVar = this.f188121a.f188155c;
        }
        int i15 = iV;
        long jG1 = w7.o0.g1(j15);
        long jG2 = this.A0.f4650b.b() ? w7.o0.g1(n1(this.A0)) : jG1;
        h8.c0.b bVar = this.A0.f4650b;
        return new t7.a0.e(obj, iD, sVar, obj2, i15, jG1, jG2, bVar.f81469b, bVar.f81470c);
    }

    private t7.a0.e m1(int i15, v2 v2Var, int i16) {
        int i17;
        int i18;
        Object obj;
        t7.s sVar;
        Object obj2;
        long jN1;
        long jN2;
        t7.e0.b bVar = new t7.e0.b();
        if (v2Var.f4649a.q()) {
            i17 = i16;
            i18 = i17;
            obj = null;
            sVar = null;
            obj2 = null;
        } else {
            Object obj3 = v2Var.f4650b.f81468a;
            v2Var.f4649a.h(obj3, bVar);
            int i19 = bVar.f188138c;
            int iB = v2Var.f4649a.b(obj3);
            Object obj4 = v2Var.f4649a.n(i19, this.f188121a).f188153a;
            sVar = this.f188121a.f188155c;
            obj2 = obj3;
            i18 = iB;
            obj = obj4;
            i17 = i19;
        }
        if (i15 == 0) {
            if (v2Var.f4650b.b()) {
                h8.c0.b bVar2 = v2Var.f4650b;
                jN1 = bVar.b(bVar2.f81469b, bVar2.f81470c);
                jN2 = n1(v2Var);
            } else {
                jN1 = v2Var.f4650b.f81472e != -1 ? n1(this.A0) : bVar.f188140e + bVar.f188139d;
                jN2 = jN1;
            }
        } else if (v2Var.f4650b.b()) {
            jN1 = v2Var.f4667s;
            jN2 = n1(v2Var);
        } else {
            jN1 = bVar.f188140e + v2Var.f4667s;
            jN2 = jN1;
        }
        long jG1 = w7.o0.g1(jN1);
        long jG2 = w7.o0.g1(jN2);
        h8.c0.b bVar3 = v2Var.f4650b;
        return new t7.a0.e(obj, i17, sVar, obj2, i18, jG1, jG2, bVar3.f81469b, bVar3.f81470c);
    }

    private static long n1(v2 v2Var) {
        t7.e0.c cVar = new t7.e0.c();
        t7.e0.b bVar = new t7.e0.b();
        v2Var.f4649a.h(v2Var.f4650b.f81468a, bVar);
        return v2Var.f4651c == -9223372036854775807L ? v2Var.f4649a.n(bVar.f188138c, cVar).c() : bVar.o() + v2Var.f4651c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1(w1.e eVar) {
        int i15;
        long j15;
        boolean z15;
        long jX1;
        int i16 = this.L - eVar.f4726c;
        this.L = i16;
        boolean z16 = true;
        if (eVar.f4727d) {
            this.M = eVar.f4728e;
            this.N = true;
        }
        if (i16 == 0) {
            t7.e0 e0Var = eVar.f4725b.f4649a;
            int iD = -1;
            if (!this.A0.f4649a.q() && e0Var.q()) {
                this.B0 = -1;
                this.C0 = 0L;
            }
            if (!e0Var.q()) {
                List<t7.e0> listF = ((y2) e0Var).F();
                zj.p.w(listF.size() == this.f4292p.size());
                for (int i17 = 0; i17 < listF.size(); i17++) {
                    this.f4292p.get(i17).c(listF.get(i17));
                }
            }
            long j16 = -9223372036854775807L;
            if (this.N) {
                boolean z17 = eVar.f4725b.f4649a.q() && this.A0.f4649a.q();
                boolean zEquals = eVar.f4725b.f4650b.equals(this.A0.f4650b);
                boolean z18 = eVar.f4725b.f4652d == this.A0.f4667s;
                if (z17 || (zEquals && z18)) {
                    z16 = false;
                }
                if (z16) {
                    iD = D();
                    if (e0Var.q() || eVar.f4725b.f4650b.b()) {
                        jX1 = eVar.f4725b.f4652d;
                    } else {
                        v2 v2Var = eVar.f4725b;
                        jX1 = x1(e0Var, v2Var.f4650b, v2Var.f4652d);
                    }
                    j16 = jX1;
                }
                z15 = z16;
                long j17 = j16;
                i15 = iD;
                j15 = j17;
            } else {
                i15 = -1;
                j15 = -9223372036854775807L;
                z15 = false;
            }
            this.N = false;
            J1(eVar.f4725b, 1, z15, this.M, j15, i15, false);
        }
    }

    private static v2 q1(v2 v2Var, int i15) {
        v2 v2VarH = v2Var.h(i15);
        return (i15 == 1 || i15 == 4) ? v2VarH.b(false) : v2VarH;
    }

    private v2 r1(v2 v2Var, t7.e0 e0Var, Pair<Object, Long> pair) {
        zj.p.d(e0Var.q() || pair != null);
        t7.e0 e0Var2 = v2Var.f4649a;
        long jG1 = g1(v2Var);
        v2 v2VarJ = v2Var.j(e0Var);
        if (e0Var.q()) {
            h8.c0.b bVarL = v2.l();
            long jJ0 = w7.o0.J0(this.C0);
            v2 v2VarC = v2VarJ.d(bVarL, jJ0, jJ0, jJ0, 0L, h8.j1.f81614d, this.f4264b, ak.n0.C()).c(bVarL);
            v2VarC.f4665q = v2VarC.f4667s;
            return v2VarC;
        }
        Object obj = v2VarJ.f4650b.f81468a;
        boolean zEquals = obj.equals(((Pair) w7.o0.h(pair)).first);
        h8.c0.b bVar = !zEquals ? new h8.c0.b(pair.first) : v2VarJ.f4650b;
        long jLongValue = ((Long) pair.second).longValue();
        long jJ1 = w7.o0.J0(jG1);
        if (!e0Var2.q()) {
            jJ1 -= e0Var2.h(obj, this.f4290o).o();
            if (zEquals && jJ1 - jLongValue == 1 && jJ1 == e0Var2.h(obj, this.f4290o).f188139d) {
                jJ1--;
            }
        }
        if (!zEquals || jLongValue < jJ1) {
            h8.c0.b bVar2 = bVar;
            zj.p.w(!bVar2.b());
            v2 v2VarC2 = v2VarJ.d(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? h8.j1.f81614d : v2VarJ.f4656h, !zEquals ? this.f4264b : v2VarJ.f4657i, !zEquals ? ak.n0.C() : v2VarJ.f4658j).c(bVar2);
            v2VarC2.f4665q = jLongValue;
            return v2VarC2;
        }
        if (jLongValue != jJ1) {
            h8.c0.b bVar3 = bVar;
            zj.p.w(!bVar3.b());
            long jMax = Math.max(0L, v2VarJ.f4666r - (jLongValue - jJ1));
            long j15 = v2VarJ.f4665q;
            if (v2VarJ.f4659k.equals(v2VarJ.f4650b)) {
                j15 = jLongValue + jMax;
            }
            v2 v2VarD = v2VarJ.d(bVar3, jLongValue, jLongValue, jLongValue, jMax, v2VarJ.f4656h, v2VarJ.f4657i, v2VarJ.f4658j);
            v2VarD.f4665q = j15;
            return v2VarD;
        }
        int iB = e0Var.b(v2VarJ.f4659k.f81468a);
        if (iB != -1 && e0Var.f(iB, this.f4290o).f188138c == e0Var.h(bVar.f81468a, this.f4290o).f188138c) {
            return v2VarJ;
        }
        e0Var.h(bVar.f81468a, this.f4290o);
        long jB = bVar.b() ? this.f4290o.b(bVar.f81469b, bVar.f81470c) : this.f4290o.f188139d;
        h8.c0.b bVar4 = bVar;
        v2 v2VarC3 = v2VarJ.d(bVar4, v2VarJ.f4667s, v2VarJ.f4667s, v2VarJ.f4652d, jB - v2VarJ.f4667s, v2VarJ.f4656h, v2VarJ.f4657i, v2VarJ.f4658j).c(bVar4);
        v2VarC3.f4665q = jB;
        return v2VarC3;
    }

    private Pair<Object, Long> s1(t7.e0 e0Var, int i15, long j15) {
        if (e0Var.q()) {
            this.B0 = i15;
            if (j15 == -9223372036854775807L) {
                j15 = 0;
            }
            this.C0 = j15;
            return null;
        }
        if (i15 == -1 || i15 >= e0Var.p()) {
            i15 = e0Var.a(this.K);
            j15 = e0Var.n(i15, this.f188121a).b();
        }
        return e0Var.j(this.f188121a, this.f4290o, i15, w7.o0.J0(j15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t1(final int i15, final int i16) {
        if (i15 == this.f4277h0.b() && i16 == this.f4277h0.a()) {
            return;
        }
        this.f4277h0 = new w7.d0(i15, i16);
        this.f4286m.k(24, new w7.s.a() { // from class: a8.r0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((t7.a0.d) obj).Y(i15, i16);
            }
        });
        z1(2, 14, new w7.d0(i15, i16));
    }

    private void u1() {
        v2 v2Var = this.A0;
        I1(v2Var.f4660l, v2Var.f4661m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v1(int i15, final int i16) {
        M1();
        z1(1, 10, Integer.valueOf(i16));
        z1(2, 10, Integer.valueOf(i16));
        this.f4286m.k(21, new w7.s.a() { // from class: a8.e0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((t7.a0.d) obj).c(i16);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w1(boolean z15) {
        if (this.f4301t0) {
            return;
        }
        if (!z15) {
            u1();
        } else if (this.A0.f4662n == 3) {
            u1();
        }
    }

    private long x1(t7.e0 e0Var, h8.c0.b bVar, long j15) {
        e0Var.h(bVar.f81468a, this.f4290o);
        return j15 + this.f4290o.o();
    }

    private void y1() {
        if (this.f4267c0 != null) {
            c1(this.f4308x).m(10000).l(null).k();
            this.f4267c0.c(this.f4306w);
            this.f4267c0 = null;
        }
        TextureView textureView = this.f4271e0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f4306w) {
                w7.t.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f4271e0.setSurfaceTextureListener(null);
            }
            this.f4271e0 = null;
        }
        SurfaceHolder surfaceHolder = this.f4265b0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f4306w);
            this.f4265b0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z1(int i15, int i16, Object obj) {
        for (z2 z2Var : this.f4274g) {
            if (i15 == -1 || z2Var.g() == i15) {
                c1(z2Var).m(i16).l(obj).k();
            }
        }
        for (z2 z2Var2 : this.f4276h) {
            if (z2Var2 != null && (i15 == -1 || z2Var2.g() == i15)) {
                c1(z2Var2).m(i16).l(obj).k();
            }
        }
    }

    @Override // t7.a0
    public int B() {
        M1();
        return this.A0.f4653e;
    }

    public void C1(List<h8.c0> list, boolean z15) {
        M1();
        D1(list, -1, -9223372036854775807L, z15);
    }

    @Override // t7.a0
    public int D() {
        M1();
        int iI1 = i1(this.A0);
        if (iI1 == -1) {
            return 0;
        }
        return iI1;
    }

    @Override // t7.a0
    public int E() {
        M1();
        return this.J;
    }

    @Override // t7.a0
    public boolean F() {
        M1();
        return this.K;
    }

    @Override // t7.a0
    public long G() {
        M1();
        return w7.o0.g1(h1(this.A0));
    }

    @Override // t7.d
    protected void M(int i15, long j15, int i16, boolean z15) {
        M1();
        if (i15 == -1) {
            return;
        }
        zj.p.d(i15 >= 0);
        t7.e0 e0Var = this.A0.f4649a;
        if (e0Var.q() || i15 < e0Var.p()) {
            this.f4298s.P();
            this.L++;
            if (c()) {
                w7.t.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                w1.e eVar = new w1.e(this.A0);
                eVar.b(1);
                this.f4282k.a(eVar);
                return;
            }
            v2 v2VarQ1 = this.A0;
            int i17 = v2VarQ1.f4653e;
            if (i17 == 3 || (i17 == 4 && !e0Var.q())) {
                v2VarQ1 = q1(this.A0, 2);
            }
            int iD = D();
            v2 v2VarR1 = r1(v2VarQ1, e0Var, s1(e0Var, i15, j15));
            this.f4284l.Z0(e0Var, i15, w7.o0.J0(j15));
            J1(v2VarR1, 0, true, 1, h1(v2VarR1), iD, z15);
        }
    }

    public void V0(b8.b bVar) {
        this.f4298s.o0((b8.b) zj.p.q(bVar));
    }

    public void W0(x.a aVar) {
        this.f4288n.add(aVar);
    }

    @Override // t7.a0
    public void a() {
        M1();
        v2 v2Var = this.A0;
        if (v2Var.f4653e != 1) {
            return;
        }
        v2 v2VarF = v2Var.f(null);
        v2 v2VarQ1 = q1(v2VarF, v2VarF.f4649a.q() ? 4 : 2);
        this.L++;
        this.f4284l.H0();
        J1(v2VarQ1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // a8.x
    public void b() {
        w7.t.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.0] [" + w7.o0.f210728e + "] [" + t7.t.b() + "]");
        M1();
        this.f4310y.d(false);
        l3 l3Var = this.f4312z;
        if (l3Var != null) {
            l3Var.l();
        }
        this.A.g(false);
        this.B.g(false);
        n3 n3Var = this.D;
        if (n3Var != null) {
            n3Var.c();
        }
        g gVar = this.G;
        if (gVar != null && Build.VERSION.SDK_INT >= 34) {
            gVar.d();
        }
        this.F.j();
        if (!this.f4284l.J0()) {
            this.f4286m.k(10, new w7.s.a() { // from class: a8.k0
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((t7.a0.d) obj).f0(w.d(new x1(1), 1003));
                }
            });
        }
        this.f4286m.i();
        this.f4280j.f(null);
        this.f4302u.a(this.f4298s);
        v2 v2Var = this.A0;
        if (v2Var.f4664p) {
            this.A0 = v2Var.a();
        }
        v2 v2VarQ1 = q1(this.A0, 1);
        this.A0 = v2VarQ1;
        v2 v2VarC = v2VarQ1.c(v2VarQ1.f4650b);
        this.A0 = v2VarC;
        v2VarC.f4665q = v2VarC.f4667s;
        this.A0.f4666r = 0L;
        this.f4298s.b();
        y1();
        Surface surface = this.f4263a0;
        if (surface != null) {
            surface.release();
            this.f4263a0 = null;
        }
        if (this.f4299s0) {
            ((t7.b0) zj.p.q(this.f4297r0)).b(this.f4295q0);
            this.f4299s0 = false;
        }
        this.f4289n0 = v7.c.f204205d;
        this.f4301t0 = true;
    }

    @Override // t7.a0
    public boolean c() {
        M1();
        return this.A0.f4650b.b();
    }

    @Override // t7.a0
    public t7.z d() {
        M1();
        return this.A0.f4663o;
    }

    @Override // t7.a0
    public long e() {
        M1();
        return w7.o0.g1(this.A0.f4666r);
    }

    public w7.h e1() {
        return this.f4304v;
    }

    @Override // t7.a0
    public void f(List<t7.s> list, boolean z15) {
        M1();
        C1(b1(list), z15);
    }

    public long f1() {
        M1();
        if (this.A0.f4649a.q()) {
            return this.C0;
        }
        v2 v2Var = this.A0;
        if (v2Var.f4659k.f81471d != v2Var.f4650b.f81471d) {
            return v2Var.f4649a.n(D(), this.f188121a).d();
        }
        long j15 = v2Var.f4665q;
        if (this.A0.f4659k.b()) {
            v2 v2Var2 = this.A0;
            t7.e0.b bVarH = v2Var2.f4649a.h(v2Var2.f4659k.f81468a, this.f4290o);
            long jF = bVarH.f(this.A0.f4659k.f81469b);
            j15 = jF == Long.MIN_VALUE ? bVarH.f188139d : jF;
        }
        v2 v2Var3 = this.A0;
        return w7.o0.g1(x1(v2Var3.f4649a, v2Var3.f4659k, j15));
    }

    @Override // t7.a0
    public long getDuration() {
        M1();
        if (!c()) {
            return I();
        }
        v2 v2Var = this.A0;
        h8.c0.b bVar = v2Var.f4650b;
        v2Var.f4649a.h(bVar.f81468a, this.f4290o);
        return w7.o0.g1(this.f4290o.b(bVar.f81469b, bVar.f81470c));
    }

    @Override // t7.a0
    public void i(t7.a0.d dVar) {
        this.f4286m.c((t7.a0.d) zj.p.q(dVar));
    }

    public Looper j1() {
        return this.f4284l.P();
    }

    @Override // t7.a0
    public void k(boolean z15) {
        M1();
        I1(z15, 1);
    }

    @Override // t7.a0
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public w j() {
        M1();
        return this.A0.f4654f;
    }

    @Override // t7.a0
    public void l(t7.a0.d dVar) {
        M1();
        this.f4286m.j((t7.a0.d) zj.p.q(dVar));
    }

    @Override // t7.a0
    public t7.i0 m() {
        M1();
        return this.A0.f4657i.f100154d;
    }

    @Override // t7.a0
    public int o() {
        M1();
        if (c()) {
            return this.A0.f4650b.f81469b;
        }
        return -1;
    }

    public boolean p1() {
        M1();
        return this.A0.f4664p;
    }

    @Override // t7.a0
    public int q() {
        M1();
        return this.A0.f4662n;
    }

    @Override // t7.a0
    public t7.e0 r() {
        M1();
        return this.A0.f4649a;
    }

    @Override // t7.a0
    public Looper s() {
        return this.f4300t;
    }

    @Override // t7.a0
    public boolean u() {
        M1();
        return this.A0.f4660l;
    }

    @Override // t7.a0
    public int v() {
        M1();
        if (!this.A0.f4649a.q()) {
            v2 v2Var = this.A0;
            return v2Var.f4649a.b(v2Var.f4650b.f81468a);
        }
        int i15 = this.B0;
        if (i15 == -1) {
            return 0;
        }
        return i15;
    }

    @Override // t7.a0
    public int x() {
        M1();
        if (c()) {
            return this.A0.f4650b.f81470c;
        }
        return -1;
    }

    @Override // t7.a0
    public long y() {
        M1();
        return g1(this.A0);
    }

    @Override // t7.a0
    public long z() {
        M1();
        if (!c()) {
            return f1();
        }
        v2 v2Var = this.A0;
        return v2Var.f4659k.equals(v2Var.f4650b) ? w7.o0.g1(this.A0.f4665q) : getDuration();
    }
}
