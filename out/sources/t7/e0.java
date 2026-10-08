package t7;

import android.net.Uri;
import android.util.Pair;
import java.util.Objects;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f188127a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f188128b = o0.u0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f188129c = o0.u0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f188130d = o0.u0(2);

    class a extends e0 {
        a() {
        }

        @Override // t7.e0
        public int b(Object obj) {
            return -1;
        }

        @Override // t7.e0
        public b g(int i15, b bVar, boolean z15) {
            throw new IndexOutOfBoundsException();
        }

        @Override // t7.e0
        public int i() {
            return 0;
        }

        @Override // t7.e0
        public Object m(int i15) {
            throw new IndexOutOfBoundsException();
        }

        @Override // t7.e0
        public c o(int i15, c cVar, long j15) {
            throw new IndexOutOfBoundsException();
        }

        @Override // t7.e0
        public int p() {
            return 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f188131h = o0.u0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f188132i = o0.u0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f188133j = o0.u0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f188134k = o0.u0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f188135l = o0.u0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f188136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f188137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f188138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f188139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f188140e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f188141f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public t7.a f188142g = t7.a.f188028g;

        public int a(int i15) {
            return this.f188142g.a(i15).f188053b;
        }

        public long b(int i15, int i16) {
            t7.a.C4892a c4892aA = this.f188142g.a(i15);
            if (c4892aA.f188053b != -1) {
                return c4892aA.f188058g[i16];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f188142g.f188035b;
        }

        public int d(long j15) {
            return this.f188142g.b(j15, this.f188139d);
        }

        public int e(long j15) {
            return this.f188142g.c(j15, this.f188139d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (Objects.equals(this.f188136a, bVar.f188136a) && Objects.equals(this.f188137b, bVar.f188137b) && this.f188138c == bVar.f188138c && this.f188139d == bVar.f188139d && this.f188140e == bVar.f188140e && this.f188141f == bVar.f188141f && Objects.equals(this.f188142g, bVar.f188142g)) {
                    return true;
                }
            }
            return false;
        }

        public long f(int i15) {
            return this.f188142g.a(i15).f188052a;
        }

        public long g() {
            return this.f188142g.f188036c;
        }

        public int h(int i15, int i16) {
            t7.a.C4892a c4892aA = this.f188142g.a(i15);
            if (c4892aA.f188053b != -1) {
                return c4892aA.f188057f[i16];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f188136a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f188137b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f188138c) * 31;
            long j15 = this.f188139d;
            int i15 = (iHashCode2 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
            long j16 = this.f188140e;
            return ((((i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f188141f ? 1 : 0)) * 31) + this.f188142g.hashCode();
        }

        public long i(int i15) {
            return this.f188142g.a(i15).f188061j;
        }

        public long j() {
            return o0.g1(this.f188139d);
        }

        public long k() {
            return this.f188139d;
        }

        public int l(int i15) {
            return this.f188142g.a(i15).d();
        }

        public int m(int i15, int i16) {
            return this.f188142g.a(i15).e(i16);
        }

        public long n() {
            return o0.g1(this.f188140e);
        }

        public long o() {
            return this.f188140e;
        }

        public int p() {
            return this.f188142g.f188038e;
        }

        public boolean q(int i15) {
            return !this.f188142g.a(i15).f();
        }

        public boolean r(int i15) {
            return i15 == c() - 1 && this.f188142g.d(i15);
        }

        public boolean s(int i15) {
            return this.f188142g.a(i15).f188062k;
        }

        public b t(Object obj, Object obj2, int i15, long j15, long j16) {
            return u(obj, obj2, i15, j15, j16, t7.a.f188028g, false);
        }

        public b u(Object obj, Object obj2, int i15, long j15, long j16, t7.a aVar, boolean z15) {
            this.f188136a = obj;
            this.f188137b = obj2;
            this.f188138c = i15;
            this.f188139d = j15;
            this.f188140e = j16;
            this.f188142g = aVar;
            this.f188141f = z15;
            return this;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f188154b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f188156d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f188157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f188158f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f188159g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f188160h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f188161i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public s.g f188162j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f188163k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f188164l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f188165m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f188166n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f188167o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f188168p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Object f188143q = new Object();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final Object f188144r = new Object();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final s f188145s = new s.c().c("androidx.media3.common.Timeline").f(Uri.EMPTY).a();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f188146t = o0.u0(1);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final String f188147u = o0.u0(2);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final String f188148v = o0.u0(3);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final String f188149w = o0.u0(4);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f188150x = o0.u0(5);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final String f188151y = o0.u0(6);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final String f188152z = o0.u0(7);
        private static final String A = o0.u0(8);
        private static final String B = o0.u0(9);
        private static final String C = o0.u0(10);
        private static final String D = o0.u0(11);
        private static final String E = o0.u0(12);
        private static final String F = o0.u0(13);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f188153a = f188143q;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s f188155c = f188145s;

        public long a() {
            return o0.c0(this.f188159g);
        }

        public long b() {
            return o0.g1(this.f188164l);
        }

        public long c() {
            return this.f188164l;
        }

        public long d() {
            return o0.g1(this.f188165m);
        }

        public long e() {
            return this.f188168p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class.equals(obj.getClass())) {
                c cVar = (c) obj;
                if (Objects.equals(this.f188153a, cVar.f188153a) && Objects.equals(this.f188155c, cVar.f188155c) && Objects.equals(this.f188156d, cVar.f188156d) && Objects.equals(this.f188162j, cVar.f188162j) && this.f188157e == cVar.f188157e && this.f188158f == cVar.f188158f && this.f188159g == cVar.f188159g && this.f188160h == cVar.f188160h && this.f188161i == cVar.f188161i && this.f188163k == cVar.f188163k && this.f188164l == cVar.f188164l && this.f188165m == cVar.f188165m && this.f188166n == cVar.f188166n && this.f188167o == cVar.f188167o && this.f188168p == cVar.f188168p) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f188162j != null;
        }

        public c g(Object obj, s sVar, Object obj2, long j15, long j16, long j17, boolean z15, boolean z16, s.g gVar, long j18, long j19, int i15, int i16, long j25) {
            s.h hVar;
            this.f188153a = obj;
            this.f188155c = sVar != null ? sVar : f188145s;
            this.f188154b = (sVar == null || (hVar = sVar.f188433b) == null) ? null : hVar.f188535h;
            this.f188156d = obj2;
            this.f188157e = j15;
            this.f188158f = j16;
            this.f188159g = j17;
            this.f188160h = z15;
            this.f188161i = z16;
            this.f188162j = gVar;
            this.f188164l = j18;
            this.f188165m = j19;
            this.f188166n = i15;
            this.f188167o = i16;
            this.f188168p = j25;
            this.f188163k = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f188153a.hashCode()) * 31) + this.f188155c.hashCode()) * 31;
            Object obj = this.f188156d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            s.g gVar = this.f188162j;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j15 = this.f188157e;
            int i15 = (iHashCode3 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
            long j16 = this.f188158f;
            int i16 = (i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31;
            long j17 = this.f188159g;
            int i17 = (((((((i16 + ((int) (j17 ^ (j17 >>> 32)))) * 31) + (this.f188160h ? 1 : 0)) * 31) + (this.f188161i ? 1 : 0)) * 31) + (this.f188163k ? 1 : 0)) * 31;
            long j18 = this.f188164l;
            int i18 = (i17 + ((int) (j18 ^ (j18 >>> 32)))) * 31;
            long j19 = this.f188165m;
            int i19 = (((((i18 + ((int) (j19 ^ (j19 >>> 32)))) * 31) + this.f188166n) * 31) + this.f188167o) * 31;
            long j25 = this.f188168p;
            return i19 + ((int) (j25 ^ (j25 >>> 32)));
        }
    }

    protected e0() {
    }

    public int a(boolean z15) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z15) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i15, b bVar, c cVar, int i16, boolean z15) {
        int i17 = f(i15, bVar).f188138c;
        if (n(i17, cVar).f188167o != i15) {
            return i15 + 1;
        }
        int iE = e(i17, i16, z15);
        if (iE == -1) {
            return -1;
        }
        return n(iE, cVar).f188166n;
    }

    public int e(int i15, int i16, boolean z15) {
        if (i16 == 0) {
            if (i15 == c(z15)) {
                return -1;
            }
            return i15 + 1;
        }
        if (i16 == 1) {
            return i15;
        }
        if (i16 == 2) {
            return i15 == c(z15) ? a(z15) : i15 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (e0Var.p() != p() || e0Var.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i15 = 0; i15 < p(); i15++) {
            if (!n(i15, cVar).equals(e0Var.n(i15, cVar2))) {
                return false;
            }
        }
        for (int i16 = 0; i16 < i(); i16++) {
            if (!g(i16, bVar, true).equals(e0Var.g(i16, bVar2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != e0Var.a(true) || (iC = c(true)) != e0Var.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != e0Var.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public final b f(int i15, b bVar) {
        return g(i15, bVar, false);
    }

    public abstract b g(int i15, b bVar, boolean z15);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iP = 217 + p();
        for (int i15 = 0; i15 < p(); i15++) {
            iP = (iP * 31) + n(i15, cVar).hashCode();
        }
        int i16 = (iP * 31) + i();
        for (int i17 = 0; i17 < i(); i17++) {
            i16 = (i16 * 31) + g(i17, bVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            i16 = (i16 * 31) + iA;
            iA = e(iA, 0, true);
        }
        return i16;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i15, long j15) {
        return (Pair) zj.p.q(k(cVar, bVar, i15, j15, 0L));
    }

    public final Pair<Object, Long> k(c cVar, b bVar, int i15, long j15, long j16) {
        zj.p.o(i15, p());
        o(i15, cVar, j16);
        if (j15 == -9223372036854775807L) {
            j15 = cVar.c();
            if (j15 == -9223372036854775807L) {
                return null;
            }
        }
        int i16 = cVar.f188166n;
        f(i16, bVar);
        while (i16 < cVar.f188167o && bVar.f188140e != j15) {
            int i17 = i16 + 1;
            if (f(i17, bVar).f188140e > j15) {
                break;
            }
            i16 = i17;
        }
        g(i16, bVar, true);
        long jMin = j15 - bVar.f188140e;
        long j17 = bVar.f188139d;
        if (j17 != -9223372036854775807L) {
            jMin = Math.min(jMin, j17 - 1);
        }
        return Pair.create(zj.p.q(bVar.f188137b), Long.valueOf(Math.max(0L, jMin)));
    }

    public int l(int i15, int i16, boolean z15) {
        if (i16 == 0) {
            if (i15 == a(z15)) {
                return -1;
            }
            return i15 - 1;
        }
        if (i16 == 1) {
            return i15;
        }
        if (i16 == 2) {
            return i15 == a(z15) ? c(z15) : i15 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i15);

    public final c n(int i15, c cVar) {
        return o(i15, cVar, 0L);
    }

    public abstract c o(int i15, c cVar, long j15);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i15, b bVar, c cVar, int i16, boolean z15) {
        return d(i15, bVar, cVar, i16, z15) == -1;
    }
}
