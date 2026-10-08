package c8;

import ak.h2;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b8.e2;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements a0 {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final AtomicInteger f24383f0 = new AtomicInteger();
    private t7.z A;
    private boolean B;
    private long C;
    private long D;
    private long E;
    private long F;
    private int G;
    private boolean H;
    private boolean I;
    private long J;
    private float K;
    private ByteBuffer L;
    private int M;
    private ByteBuffer N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private int T;
    private boolean U;
    private t7.c V;
    private AudioDeviceInfo W;
    private int X;
    private boolean Y;
    private long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24384a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f24385a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u7.m f24386b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f24387b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24388c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private long f24389c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s0 f24390d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f24391d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g1 f24392e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private Handler f24393e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u7.q f24394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f1 f24395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ak.n0<u7.l> f24396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayDeque<i> f24397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f24398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f24399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f24400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final j<a0.c> f24401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j<a0.f> f24402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a8.x.a f24403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private e2 f24404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a0.d f24405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private g f24406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private g f24407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private u7.k f24408t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private k f24409u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private k.f f24410v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private c8.j f24411w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private t7.b f24412x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private i f24413y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private i f24414z;

    public interface b {
        c8.i a(t7.p pVar, t7.b bVar);
    }

    private final class c implements c8.j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k.g f24415a;

        @Override // c8.j.a
        public void a(long j15) {
            if (equals(w0.this.f24400l) && w0.this.f24405q != null) {
                w0.this.f24405q.a(j15);
            }
        }

        @Override // c8.j.a
        public void b() {
            w0.f24383f0.getAndDecrement();
            if (w0.this.f24405q != null) {
                a0.d dVar = w0.this.f24405q;
                k.g gVar = this.f24415a;
                dVar.f(new a0.a(gVar.f24279a, gVar.f24280b, gVar.f24281c, gVar.f24282d, gVar.f24283e, gVar.f24284f));
            }
        }

        @Override // c8.j.a
        public void c() {
            if (equals(w0.this.f24400l) && w0.this.f24405q != null && w0.this.R) {
                w0.this.f24405q.l();
            }
        }

        @Override // c8.j.a
        public void d() {
            if (equals(w0.this.f24400l) && w0.this.P) {
                w0.this.Q = true;
            }
        }

        @Override // c8.j.a
        public void e() {
            if (equals(w0.this.f24400l) && w0.this.f24405q != null) {
                w0.this.f24405q.i(w0.this.f24407s.f24432e.f24284f, w7.o0.g1(w0.this.f24407s.f24431d != -1 ? w7.o0.T0(w0.this.f24407s.f24432e.f24284f / w0.this.f24407s.f24431d, ((c8.j) zj.p.q(w0.this.f24411w)).p()) : -9223372036854775807L), SystemClock.elapsedRealtime() - w0.this.Z);
            }
        }

        private c(k.g gVar) {
            this.f24415a = gVar;
        }
    }

    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f24417a = new x0.a().h();

        int a(int i15, int i16, int i17, int i18, int i19, int i25, double d15);
    }

    @Deprecated
    public interface e {
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f24418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c8.b f24419b = c8.b.f24130g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u7.m f24420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f24421d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f24422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f24423f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f24424g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private k f24425h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private b f24426i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private a8.x.a f24427j;

        public f(Context context) {
            this.f24418a = context;
        }

        public w0 g() {
            zj.p.w(!this.f24423f);
            this.f24423f = true;
            if (this.f24420c == null) {
                this.f24420c = new h(new u7.l[0]);
            }
            if (this.f24425h == null) {
                if (this.f24426i == null) {
                    this.f24426i = new t0(this.f24418a);
                }
                if (this.f24424g == null) {
                    this.f24424g = d.f24417a;
                }
                this.f24425h = new q0.b(this.f24418a).i(this.f24418a != null ? null : this.f24419b).j(this.f24426i).k(this.f24424g).l(null).h();
            } else {
                zj.p.w(this.f24426i == null);
                zj.p.w(this.f24424g == null);
                zj.p.w(true);
            }
            return new w0(this);
        }

        public f h(boolean z15) {
            this.f24422e = z15;
            return this;
        }

        public f i(boolean z15) {
            this.f24421d = z15;
            return this;
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t7.p f24428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t7.p f24429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f24430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f24431d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final k.g f24432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final u7.k f24433f;

        /* JADX INFO: Access modifiers changed from: private */
        public a0.a l() {
            k.g gVar = this.f24432e;
            return new a0.a(gVar.f24279a, gVar.f24280b, gVar.f24281c, gVar.f24282d, gVar.f24283e, gVar.f24284f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public g m(k.g gVar) {
            return new g(this.f24428a, this.f24429b, this.f24430c, this.f24431d, gVar, this.f24433f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long n(long j15) {
            return w7.o0.T0(j15, this.f24432e.f24280b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long o(long j15) {
            return w7.o0.T0(j15, this.f24428a.I);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean p() {
            return Objects.equals(this.f24428a.f188381p, "audio/raw");
        }

        private g(t7.p pVar, t7.p pVar2, int i15, int i16, k.g gVar, u7.k kVar) {
            this.f24428a = pVar;
            this.f24429b = pVar2;
            this.f24430c = i15;
            this.f24431d = i16;
            this.f24432e = gVar;
            this.f24433f = kVar;
        }
    }

    public static class h implements u7.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u7.l[] f24434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d1 f24435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final u7.p f24436c;

        public h(u7.l... lVarArr) {
            this(lVarArr, new d1(), new u7.p());
        }

        @Override // u7.m
        public long a(long j15) {
            return this.f24436c.h() ? this.f24436c.j(j15) : j15;
        }

        @Override // u7.m
        public t7.z b(t7.z zVar) {
            this.f24436c.m(zVar.f188663a);
            this.f24436c.l(zVar.f188664b);
            return zVar;
        }

        @Override // u7.m
        public u7.l[] c() {
            return this.f24434a;
        }

        @Override // u7.m
        public long d() {
            return this.f24435b.x();
        }

        @Override // u7.m
        public boolean e(boolean z15) {
            this.f24435b.G(z15);
            return z15;
        }

        public h(u7.l[] lVarArr, d1 d1Var, u7.p pVar) {
            u7.l[] lVarArr2 = new u7.l[lVarArr.length + 2];
            this.f24434a = lVarArr2;
            System.arraycopy(lVarArr, 0, lVarArr2, 0, lVarArr.length);
            this.f24435b = d1Var;
            this.f24436c = pVar;
            lVarArr2[lVarArr.length] = d1Var;
            lVarArr2[lVarArr.length + 1] = pVar;
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t7.z f24437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f24438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f24439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f24440d;

        private i(t7.z zVar, long j15, long j16) {
            this.f24437a = zVar;
            this.f24438b = j15;
            this.f24439c = j16;
        }
    }

    private static final class j<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T f24441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f24442b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f24443c = -9223372036854775807L;

        public void a() {
            this.f24441a = null;
            this.f24442b = -9223372036854775807L;
            this.f24443c = -9223372036854775807L;
        }

        public boolean b() {
            if (this.f24441a == null) {
                return false;
            }
            return w0.i0() || SystemClock.elapsedRealtime() < this.f24443c;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void c(T t15) throws T {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f24441a == null) {
                this.f24441a = t15;
            }
            if (this.f24442b == -9223372036854775807L && !w0.i0()) {
                this.f24442b = 200 + jElapsedRealtime;
            }
            long j15 = this.f24442b;
            if (j15 == -9223372036854775807L || jElapsedRealtime < j15) {
                this.f24443c = jElapsedRealtime + 50;
                return;
            }
            T t16 = this.f24441a;
            if (t16 != t15) {
                t16.addSuppressed(t15);
            }
            T t17 = this.f24441a;
            a();
            throw t17;
        }
    }

    private boolean A0(int i15) {
        return this.f24388c && w7.o0.x0(i15);
    }

    private boolean B0() {
        g gVar = this.f24407s;
        return gVar != null && gVar.f24432e.f24288j;
    }

    public static /* synthetic */ void G(w0 w0Var) {
        a0.d dVar = w0Var.f24405q;
        if (dVar != null) {
            dVar.j();
        }
    }

    private void S(long j15) {
        t7.z zVarB;
        if (B0()) {
            zVarB = t7.z.f188660d;
        } else {
            zVarB = z0() ? this.f24386b.b(this.A) : t7.z.f188660d;
            this.A = zVarB;
        }
        t7.z zVar = zVarB;
        this.B = z0() ? this.f24386b.e(this.B) : false;
        this.f24397i.add(new i(zVar, Math.max(0L, j15), this.f24407s.n(f0())));
        y0();
        a0.d dVar = this.f24405q;
        if (dVar != null) {
            dVar.d(this.B);
        }
    }

    private long T(long j15) {
        while (!this.f24397i.isEmpty() && j15 >= this.f24397i.getFirst().f24439c) {
            this.f24414z = this.f24397i.remove();
        }
        i iVar = this.f24414z;
        long j16 = j15 - iVar.f24439c;
        long jB0 = w7.o0.b0(j16, iVar.f24437a.f188663a);
        if (!this.f24397i.isEmpty()) {
            i iVar2 = this.f24414z;
            return iVar2.f24438b + jB0 + iVar2.f24440d;
        }
        long jA = this.f24386b.a(j16);
        i iVar3 = this.f24414z;
        long j17 = iVar3.f24438b + jA;
        iVar3.f24440d = jA - jB0;
        return j17;
    }

    private long U(long j15) {
        long jD = this.f24386b.d();
        long jN = j15 + this.f24407s.n(jD);
        long j16 = this.f24389c0;
        if (jD > j16) {
            long jN2 = this.f24407s.n(jD - j16);
            this.f24389c0 = jD;
            g0(jN2);
        }
        return jN;
    }

    private c8.j V(k.g gVar) throws a0.c {
        try {
            return this.f24409u.g(gVar);
        } catch (k.e e15) {
            a0.c cVar = new a0.c(0, gVar.f24280b, gVar.f24281c, gVar.f24279a, gVar.f24284f, this.f24407s.f24428a, gVar.f24283e, e15);
            a0.d dVar = this.f24405q;
            if (dVar == null) {
                throw cVar;
            }
            dVar.e(cVar);
            throw cVar;
        }
    }

    private c8.j W() throws a0.c {
        try {
            return V(this.f24407s.f24432e);
        } catch (a0.c e15) {
            int i15 = this.f24407s.f24432e.f24284f;
            while (i15 > 1000000) {
                i15 /= 2;
                int i16 = this.f24407s.f24431d != -1 ? this.f24407s.f24431d : 1;
                int i17 = i15 % i16;
                if (i17 != 0) {
                    i15 += i16 - i17;
                }
                k.g gVarL = this.f24407s.f24432e.a().o(i15).l();
                try {
                    c8.j jVarV = V(gVarL);
                    this.f24407s = this.f24407s.m(gVarL);
                    return jVarV;
                } catch (a0.c e16) {
                    e15.addSuppressed(e16);
                }
            }
            m0();
            throw e15;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    private void X(long j15) throws T, a0.f {
        a0.d dVar;
        if (this.N == null || this.f24402n.b()) {
            return;
        }
        int iRemaining = this.N.remaining();
        boolean z15 = true;
        try {
            boolean zS = this.f24411w.s(this.N, this.M, j15);
            this.Z = SystemClock.elapsedRealtime();
            this.f24402n.a();
            if (this.f24411w.v()) {
                if (this.F > 0) {
                    this.f24387b0 = false;
                }
                if (this.R && (dVar = this.f24405q) != null && !zS && !this.f24387b0) {
                    dVar.h();
                }
            }
            if (this.f24407s.p()) {
                this.E += (long) (iRemaining - this.N.remaining());
            }
            if (zS) {
                if (!this.f24407s.p()) {
                    zj.p.w(this.N == this.L);
                    this.F += ((long) this.G) * ((long) this.M);
                }
                this.N = null;
            }
        } catch (c8.j.b e15) {
            if (!e15.f24247b) {
                z15 = false;
            } else if (f0() <= 0) {
                if (this.f24411w.v()) {
                    m0();
                } else {
                    z15 = false;
                }
            }
            a0.f fVar = new a0.f(e15.f24246a, this.f24407s.f24428a, z15);
            a0.d dVar2 = this.f24405q;
            if (dVar2 != null) {
                dVar2.e(fVar);
            }
            if (e15.f24247b) {
                throw fVar;
            }
            this.f24402n.c(fVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private boolean Y() throws T, a0.f {
        ByteBuffer byteBuffer;
        if (!this.f24408t.g()) {
            X(Long.MIN_VALUE);
            return this.N == null;
        }
        this.f24408t.i();
        q0(Long.MIN_VALUE);
        return this.f24408t.f() && ((byteBuffer = this.N) == null || !byteBuffer.hasRemaining());
    }

    private static int Z(Context context) {
        return t0(context.getDeviceId());
    }

    private k.c a0(t7.p pVar) {
        return b0(pVar, -1);
    }

    private k.c b0(t7.p pVar, int i15) {
        return new k.c.a(pVar).l(this.f24412x).n(this.f24388c).p(this.f24398j).o(this.f24399k != 0).s(this.W).m(this.T).q(this.Y).r(i15).t(this.X).k();
    }

    static int c0(int i15, ByteBuffer byteBuffer) {
        if (i15 == 20) {
            return x7.i.h(byteBuffer);
        }
        if (i15 != 30) {
            switch (i15) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iM = o8.i0.m(w7.o0.O(byteBuffer, byteBuffer.position()));
                    if (iM != -1) {
                        return iM;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i15) {
                        case 14:
                            int iB = o8.b.b(byteBuffer);
                            if (iB == -1) {
                                return 0;
                            }
                            return o8.b.i(byteBuffer, iB) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return o8.c.f(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i15);
                    }
                    break;
            }
            return o8.b.e(byteBuffer);
        }
        return o8.o.g(byteBuffer);
    }

    private static int d0(int i15) {
        int iB = o8.s.b(i15);
        zj.p.w(iB != -2147483647);
        return iB;
    }

    private long e0() {
        return this.f24407s.p() ? this.C / ((long) this.f24407s.f24430c) : this.D;
    }

    private long f0() {
        return this.f24407s.p() ? w7.o0.k(this.E, this.f24407s.f24431d) : this.F;
    }

    private void g0(long j15) {
        this.f24391d0 += j15;
        if (this.f24393e0 == null) {
            this.f24393e0 = new Handler(Looper.myLooper());
        }
        this.f24393e0.removeCallbacksAndMessages(null);
        this.f24393e0.postDelayed(new Runnable() { // from class: c8.u0
            @Override // java.lang.Runnable
            public final void run() {
                this.f24377a.o0();
            }
        }, 100L);
    }

    private boolean h0(long j15) {
        return j15 > w7.o0.E(this.f24411w.m(), ((c8.j) zj.p.q(this.f24411w)).p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean i0() {
        return f24383f0.get() > 0;
    }

    private boolean j0() {
        if (this.f24401m.b()) {
            return false;
        }
        this.f24411w = W();
        c cVar = new c(this.f24407s.f24432e);
        this.f24400l = cVar;
        this.f24411w.t(cVar);
        a8.x.a aVar = this.f24403o;
        if (aVar != null) {
            aVar.F(this.f24411w.v());
        }
        if (this.f24411w.v() && this.f24407s.f24432e.f24289k) {
            this.f24411w.k(this.f24407s.f24428a.K, this.f24407s.f24428a.L);
        }
        e2 e2Var = this.f24404p;
        if (e2Var != null) {
            this.f24411w.j(e2Var);
        }
        x0();
        int i15 = this.V.f188119a;
        if (i15 != 0) {
            this.f24411w.q(i15);
            this.f24411w.u(this.V.f188120b);
        }
        AudioDeviceInfo audioDeviceInfo = this.W;
        if (audioDeviceInfo != null) {
            this.f24411w.setPreferredDevice(audioDeviceInfo);
        }
        this.I = true;
        int iX = this.f24411w.x();
        boolean z15 = iX != this.T;
        this.T = iX;
        a0.d dVar = this.f24405q;
        if (dVar != null) {
            dVar.g(this.f24407s.l());
            if (z15) {
                this.U = true;
                g gVar = this.f24407s;
                this.f24407s = gVar.m(gVar.f24432e.a().n(this.T).l());
                g gVar2 = this.f24406r;
                if (gVar2 != null) {
                    this.f24406r = gVar2.m(gVar2.f24432e.a().n(this.T).l());
                }
                this.f24405q.c(this.T);
            }
        }
        return true;
    }

    private boolean k0() {
        return this.f24411w != null;
    }

    private void l0() {
        if (this.f24410v != null || this.f24384a == null) {
            return;
        }
        k.f fVar = new k.f() { // from class: c8.v0
            @Override // c8.k.f
            public final void a() {
                w0.G(this.f24380a);
            }
        };
        this.f24410v = fVar;
        this.f24409u.d(fVar);
    }

    private void m0() {
        if (this.f24407s.f24432e.f24283e) {
            this.f24385a0 = true;
        }
    }

    private ByteBuffer n0(ByteBuffer byteBuffer) {
        if (this.f24407s.p()) {
            int iE = (int) w7.o0.E(w7.o0.J0(20L), this.f24407s.f24432e.f24280b);
            long jF0 = f0();
            if (jF0 < iE) {
                return c1.a(byteBuffer, this.f24407s.f24432e.f24279a, this.f24407s.f24431d, (int) jF0, iE);
            }
        }
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        if (this.f24391d0 >= 300000) {
            this.f24405q.b();
            this.f24391d0 = 0L;
        }
    }

    private void p0() {
        if (this.P) {
            return;
        }
        this.P = true;
        if (this.f24411w.v()) {
            this.Q = false;
        }
        this.f24411w.stop();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private void q0(long j15) throws T, a0.f {
        X(j15);
        if (this.N != null) {
            return;
        }
        if (!this.f24408t.g()) {
            ByteBuffer byteBuffer = this.L;
            if (byteBuffer != null) {
                w0(byteBuffer);
                X(j15);
                return;
            }
            return;
        }
        while (!this.f24408t.f()) {
            do {
                ByteBuffer byteBufferE = this.f24408t.e();
                if (byteBufferE.hasRemaining()) {
                    w0(byteBufferE);
                    X(j15);
                } else {
                    ByteBuffer byteBuffer2 = this.L;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f24408t.j(this.L);
                    }
                }
            } while (this.N == null);
            return;
        }
    }

    private void r0() {
        if (this.f24407s != null) {
            g gVar = this.f24406r;
            if (gVar != null) {
                this.f24407s = gVar;
                this.f24406r = null;
            }
            try {
                this.f24407s = new g(this.f24407s.f24428a, this.f24407s.f24429b, this.f24407s.f24430c, this.f24407s.f24431d, this.f24409u.f(a0(this.f24407s.f24429b)), this.f24407s.f24433f);
            } catch (k.b e15) {
                throw new IllegalStateException(new a0.b(e15, this.f24407s.f24428a));
            }
        }
        flush();
    }

    private void s0() {
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.f24387b0 = false;
        this.G = 0;
        this.f24414z = new i(this.A, 0L, 0L);
        this.J = 0L;
        this.f24413y = null;
        this.f24397i.clear();
        this.L = null;
        this.M = 0;
        this.N = null;
        this.P = false;
        this.O = false;
        this.Q = false;
        this.f24392e.q();
        y0();
    }

    private static int t0(int i15) {
        if (i15 == 0 || i15 == -1) {
            return -1;
        }
        return i15;
    }

    private void u0() {
        if (k0()) {
            this.f24411w.i(this.A);
            this.A = this.f24411w.d();
        }
    }

    private void v0(t7.z zVar) {
        i iVar = new i(zVar, -9223372036854775807L, -9223372036854775807L);
        if (k0()) {
            this.f24413y = iVar;
        } else {
            this.f24414z = iVar;
        }
    }

    private void w0(ByteBuffer byteBuffer) {
        zj.p.w(this.N == null);
        if (byteBuffer.hasRemaining()) {
            this.N = n0(byteBuffer);
        }
    }

    private void x0() {
        if (k0()) {
            this.f24411w.l(this.K);
        }
    }

    private void y0() {
        u7.k kVar = this.f24407s.f24433f;
        this.f24408t = kVar;
        kVar.b();
    }

    private boolean z0() {
        return (this.Y || !this.f24407s.p() || A0(this.f24407s.f24428a.J)) ? false : true;
    }

    @Override // c8.a0
    public long A(boolean z15) {
        if (!k0() || this.I) {
            return Long.MIN_VALUE;
        }
        return U(T(Math.min(this.f24411w.m(), this.f24407s.n(f0()))));
    }

    @Override // c8.a0
    public void C() {
        this.H = true;
    }

    @Override // c8.a0
    public void D() {
        zj.p.w(this.S);
        if (this.Y) {
            return;
        }
        this.Y = true;
        r0();
    }

    @Override // c8.a0
    public c8.b E() {
        k kVar = this.f24409u;
        if (kVar instanceof q0) {
            return ((q0) kVar).i();
        }
        return null;
    }

    @Override // c8.a0
    public void F(boolean z15) {
        this.B = z15;
        v0(B0() ? t7.z.f188660d : this.A);
    }

    @Override // c8.a0
    public boolean a(t7.p pVar) {
        return m(pVar) != 0;
    }

    @Override // c8.a0
    public void b() {
        this.f24409u.b();
    }

    @Override // c8.a0
    public void c(w7.h hVar) {
        this.f24409u.c(hVar);
    }

    @Override // c8.a0
    public t7.z d() {
        return this.A;
    }

    @Override // c8.a0
    public boolean e() {
        if (k0()) {
            return this.O && !f();
        }
        return true;
    }

    @Override // c8.a0
    public boolean f() {
        if (k0()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.f24411w.v() && this.Q) && h0(f0());
        }
        return false;
    }

    @Override // c8.a0
    public void flush() {
        if (k0()) {
            s0();
            this.f24400l = null;
            g gVar = this.f24406r;
            if (gVar != null) {
                this.f24407s = gVar;
                this.f24406r = null;
            }
            f24383f0.incrementAndGet();
            this.f24411w.b();
            this.f24411w = null;
        }
        this.f24402n.a();
        this.f24401m.a();
        this.f24389c0 = 0L;
        this.f24391d0 = 0L;
        Handler handler = this.f24393e0;
        if (handler != null) {
            ((Handler) zj.p.q(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // c8.a0
    public void g() {
        this.R = false;
        if (k0()) {
            this.f24411w.g();
        }
    }

    @Override // c8.a0
    public void h() {
        this.R = true;
        if (k0()) {
            this.f24411w.h();
        }
    }

    @Override // c8.a0
    public void i(t7.z zVar) {
        if (B0()) {
            this.A = zVar;
            u0();
        } else {
            t7.z zVar2 = new t7.z(w7.o0.n(zVar.f188663a, 0.1f, 8.0f), w7.o0.n(zVar.f188664b, 0.1f, 8.0f));
            this.A = zVar2;
            v0(zVar2);
        }
    }

    @Override // c8.a0
    public void j(e2 e2Var) {
        this.f24404p = e2Var;
    }

    @Override // c8.a0
    public void k(int i15, int i16) {
        g gVar;
        c8.j jVar = this.f24411w;
        if (jVar == null || !jVar.v() || (gVar = this.f24407s) == null || !gVar.f24432e.f24289k) {
            return;
        }
        this.f24411w.k(i15, i16);
    }

    @Override // c8.a0
    public void l(float f15) {
        if (this.K != f15) {
            this.K = f15;
            x0();
        }
    }

    @Override // c8.a0
    public int m(t7.p pVar) {
        boolean z15;
        if (w7.o0.y0(pVar.J)) {
            boolean zA0 = A0(pVar.J);
            if (!zA0 || pVar.J == 4) {
                z15 = false;
            } else {
                pVar = pVar.b().t0(4).Q();
                z15 = true;
            }
            if (!zA0 && pVar.J != 2) {
                pVar = pVar.b().t0(2).Q();
                z15 = true;
            }
        } else {
            z15 = false;
        }
        int i15 = this.f24409u.e(a0(pVar)).f24274d;
        if (i15 == 1) {
            return 1;
        }
        if (i15 != 2) {
            return 0;
        }
        return z15 ? 1 : 2;
    }

    @Override // c8.a0
    public void n(int i15) {
        if (this.U) {
            if (this.T != i15) {
                return;
            } else {
                this.U = false;
            }
        }
        if (this.T != i15) {
            this.T = i15;
            this.S = i15 != 0;
            r0();
        }
    }

    @Override // c8.a0
    public long o() {
        if (k0()) {
            return this.f24407s.p() ? this.f24407s.n(this.f24411w.w()) : w7.o0.W0(this.f24411w.w(), 1000000L, d0(this.f24407s.f24432e.f24279a), RoundingMode.DOWN);
        }
        return -9223372036854775807L;
    }

    @Override // c8.a0
    public void p(int i15) {
        zj.p.w(Build.VERSION.SDK_INT >= 29);
        this.f24399k = i15;
    }

    @Override // c8.a0
    public void q() {
        if (this.Y) {
            this.Y = false;
            r0();
        }
    }

    @Override // c8.a0
    public void r(t7.p pVar, int i15, int[] iArr) throws a0.b {
        u7.k kVar;
        t7.p pVar2;
        int i16;
        int iG0;
        l0();
        if ("audio/raw".equals(pVar.f188381p)) {
            zj.p.d(w7.o0.y0(pVar.J));
            int iG1 = w7.o0.g0(pVar.J, pVar.H);
            ak.n0.a aVar = new ak.n0.a();
            aVar.j(this.f24396h);
            if (A0(pVar.J)) {
                aVar.a(this.f24395g);
            } else {
                aVar.a(this.f24394f);
                aVar.i(this.f24386b.c());
            }
            kVar = new u7.k(aVar.k());
            if (kVar.equals(this.f24408t)) {
                kVar = this.f24408t;
            }
            this.f24392e.r(pVar.K, pVar.L);
            this.f24390d.p(iArr);
            try {
                u7.l.a aVarA = kVar.a(new u7.l.a(pVar));
                t7.p pVarQ = pVar.b().t0(aVarA.f195966c).B0(aVarA.f195964a).U(aVarA.f195965b).Q();
                iG0 = w7.o0.g0(aVarA.f195966c, aVarA.f195965b);
                i16 = iG1;
                pVar2 = pVarQ;
            } catch (u7.l.c e15) {
                throw new a0.b(e15, pVar);
            }
        } else {
            kVar = new u7.k(ak.n0.C());
            pVar2 = pVar;
            i16 = -1;
            iG0 = -1;
        }
        u7.k kVar2 = kVar;
        if (i15 == 0) {
            i15 = -1;
        }
        k.c cVarB0 = b0(pVar2, i15);
        try {
            k.g gVarF = this.f24409u.f(cVarB0);
            if (gVarF.f24279a == 0) {
                throw new a0.b("Invalid output encoding (isOffload=" + gVarF.f24283e + ")", cVarB0.f24250a);
            }
            if (gVarF.f24281c == 0) {
                throw new a0.b("Invalid output channel config (isOffload=" + gVarF.f24283e + ")", cVarB0.f24250a);
            }
            this.f24385a0 = false;
            g gVar = new g(pVar, pVar2, i16, iG0, gVarF, kVar2);
            if (k0()) {
                this.f24406r = gVar;
            } else {
                this.f24407s = gVar;
            }
        } catch (k.b e16) {
            throw new a0.b(e16, pVar);
        }
    }

    @Override // c8.a0
    public void reset() {
        flush();
        h2<u7.l> it = this.f24396h.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        this.f24394f.reset();
        this.f24395g.reset();
        u7.k kVar = this.f24408t;
        if (kVar != null) {
            kVar.k();
        }
        this.R = false;
        this.f24385a0 = false;
    }

    @Override // c8.a0
    public void s(int i15) {
        int iT0 = t0(i15);
        if (this.X == iT0) {
            return;
        }
        this.X = iT0;
        r0();
    }

    @Override // c8.a0
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.W = audioDeviceInfo;
        c8.j jVar = this.f24411w;
        if (jVar != null) {
            jVar.setPreferredDevice(audioDeviceInfo);
        }
    }

    @Override // c8.a0
    public c8.i t(t7.p pVar) {
        if (this.f24385a0) {
            return c8.i.f24237d;
        }
        k.d dVarE = this.f24409u.e(a0(pVar));
        return new c8.i.b().e(dVarE.f24271a).f(dVarE.f24272b).g(dVarE.f24273c).d();
    }

    @Override // c8.a0
    public void u(a0.d dVar) {
        this.f24405q = dVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    @Override // c8.a0
    public boolean v(ByteBuffer byteBuffer, long j15, int i15) throws T, a0.f, a0.c {
        ByteBuffer byteBuffer2 = this.L;
        zj.p.d(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f24406r != null) {
            if (!Y()) {
                return false;
            }
            c8.j jVar = this.f24411w;
            if (jVar == null || jVar.n(this.f24407s.f24432e, a0(this.f24406r.f24429b), this.f24406r.f24432e)) {
                this.f24407s = this.f24406r;
                this.f24406r = null;
                c8.j jVar2 = this.f24411w;
                if (jVar2 != null && jVar2.v() && this.f24407s.f24432e.f24289k) {
                    this.f24411w.r();
                    this.f24411w.k(this.f24407s.f24428a.K, this.f24407s.f24428a.L);
                    this.f24387b0 = true;
                }
            } else {
                p0();
                if (f()) {
                    return false;
                }
                flush();
            }
            S(j15);
        }
        if (!k0()) {
            try {
                if (!j0()) {
                    return false;
                }
            } catch (a0.c e15) {
                if (e15.f24105b) {
                    throw e15;
                }
                this.f24401m.c(e15);
                return false;
            }
        }
        this.f24401m.a();
        if (this.I) {
            this.J = Math.max(0L, j15);
            this.H = false;
            this.I = false;
            if (B0()) {
                u0();
            }
            S(j15);
            if (this.R) {
                h();
            }
        }
        if (this.L == null) {
            zj.p.d(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.f24407s.p() && this.G == 0) {
                int iC0 = c0(this.f24407s.f24432e.f24279a, byteBuffer);
                this.G = iC0;
                if (iC0 == 0) {
                    return true;
                }
            }
            if (this.f24413y != null) {
                if (!Y()) {
                    return false;
                }
                S(j15);
                this.f24413y = null;
            }
            long jO = this.J + this.f24407s.o(e0() - this.f24392e.p());
            if (!this.H && Math.abs(jO - j15) > 200000) {
                a0.d dVar = this.f24405q;
                if (dVar != null) {
                    dVar.e(new a0.e(j15, jO));
                }
                this.H = true;
            }
            if (this.H) {
                if (!Y()) {
                    return false;
                }
                long j16 = j15 - jO;
                this.J += j16;
                this.H = false;
                S(j15);
                a0.d dVar2 = this.f24405q;
                if (dVar2 != null && j16 != 0) {
                    dVar2.k();
                }
            }
            if (this.f24407s.p()) {
                this.C += (long) byteBuffer.remaining();
            } else {
                this.D += ((long) this.G) * ((long) i15);
            }
            this.L = byteBuffer;
            this.M = i15;
        }
        q0(j15);
        if (!this.L.hasRemaining()) {
            this.L = null;
            this.M = 0;
            return true;
        }
        if (!this.f24411w.o()) {
            return false;
        }
        w7.t.h("DefaultAudioSink", "Resetting stalled audio output");
        flush();
        return true;
    }

    @Override // c8.a0
    public void w(k kVar) {
        if (kVar.equals(this.f24409u)) {
            return;
        }
        this.f24409u.b();
        this.f24409u = kVar;
        k.f fVar = this.f24410v;
        if (fVar != null) {
            kVar.d(fVar);
        }
        r0();
    }

    @Override // c8.a0
    public void x(t7.b bVar) {
        if (this.f24412x.equals(bVar)) {
            return;
        }
        this.f24412x = bVar;
        if (this.Y) {
            return;
        }
        r0();
    }

    @Override // c8.a0
    public void y() {
        if (!this.O && k0() && Y()) {
            p0();
            this.O = true;
        }
    }

    @Override // c8.a0
    public void z(t7.c cVar) {
        if (this.V.equals(cVar)) {
            return;
        }
        int i15 = cVar.f188119a;
        float f15 = cVar.f188120b;
        c8.j jVar = this.f24411w;
        if (jVar != null) {
            if (this.V.f188119a != i15) {
                jVar.q(i15);
            }
            if (i15 != 0) {
                this.f24411w.u(f15);
            }
        }
        this.V = cVar;
    }

    private w0(f fVar) {
        this.f24384a = fVar.f24418a == null ? null : fVar.f24418a.getApplicationContext();
        this.f24412x = t7.b.f188093i;
        this.f24386b = fVar.f24420c;
        this.f24388c = fVar.f24421d;
        this.f24398j = fVar.f24422e;
        this.f24399k = 0;
        this.f24409u = fVar.f24425h;
        s0 s0Var = new s0();
        this.f24390d = s0Var;
        g1 g1Var = new g1();
        this.f24392e = g1Var;
        this.f24394f = new u7.q();
        this.f24395g = new f1();
        this.f24396h = ak.n0.F(g1Var, s0Var);
        this.K = 1.0f;
        this.T = 0;
        this.V = new t7.c(0, 0.0f);
        t7.z zVar = t7.z.f188660d;
        this.f24414z = new i(zVar, 0L, 0L);
        this.A = zVar;
        this.B = false;
        this.f24397i = new ArrayDeque<>();
        this.f24401m = new j<>();
        this.f24402n = new j<>();
        this.f24403o = fVar.f24427j;
        this.X = (Build.VERSION.SDK_INT < 34 || fVar.f24418a == null) ? -1 : Z(fVar.f24418a);
    }
}
