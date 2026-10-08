package t7;

import android.os.Looper;
import java.util.List;
import java.util.Objects;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public interface a0 {

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f188070b = new a().e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f188071c = o0.u0(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f188072a;

        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int[] f188073b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final n.b f188074a = new n.b();

            public a a(int i15) {
                this.f188074a.a(i15);
                return this;
            }

            public a b(b bVar) {
                this.f188074a.b(bVar.f188072a);
                return this;
            }

            public a c(int... iArr) {
                this.f188074a.c(iArr);
                return this;
            }

            public a d(int i15, boolean z15) {
                this.f188074a.d(i15, z15);
                return this;
            }

            public b e() {
                return new b(this.f188074a.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f188072a.equals(((b) obj).f188072a);
            }
            return false;
        }

        public int hashCode() {
            return this.f188072a.hashCode();
        }

        private b(n nVar) {
            this.f188072a = nVar;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f188075a;

        public c(n nVar) {
            this.f188075a = nVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f188075a.equals(((c) obj).f188075a);
            }
            return false;
        }

        public int hashCode() {
            return this.f188075a.hashCode();
        }
    }

    public interface d {
        default void A(v vVar) {
        }

        default void C(int i15) {
        }

        @Deprecated
        default void E(boolean z15) {
        }

        default void F(e0 e0Var, int i15) {
        }

        default void J(k kVar) {
        }

        default void K(a0 a0Var, c cVar) {
        }

        default void L(s sVar, int i15) {
        }

        default void M(int i15) {
        }

        default void Q(e eVar, e eVar2, int i15) {
        }

        default void R(b bVar) {
        }

        default void S(int i15, boolean z15) {
        }

        default void T(y yVar) {
        }

        default void V() {
        }

        default void Y(int i15, int i16) {
        }

        @Deprecated
        default void Z(int i15) {
        }

        default void a(m0 m0Var) {
        }

        default void c(int i15) {
        }

        default void c0(boolean z15) {
        }

        default void d(boolean z15) {
        }

        default void f0(y yVar) {
        }

        @Deprecated
        default void h0(boolean z15, int i15) {
        }

        default void i0(u uVar) {
        }

        default void j0(boolean z15, int i15) {
        }

        default void k0(i0 i0Var) {
        }

        default void l(v7.c cVar) {
        }

        @Deprecated
        default void p(List<v7.a> list) {
        }

        default void p0(boolean z15) {
        }

        default void u(z zVar) {
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final String f188076k = o0.u0(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f188077l = o0.u0(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final String f188078m = o0.u0(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final String f188079n = o0.u0(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f188080o = o0.u0(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f188081p = o0.u0(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f188082q = o0.u0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f188083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public final int f188084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f188085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final s f188086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f188087e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f188088f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f188089g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f188090h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f188091i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f188092j;

        public e(Object obj, int i15, s sVar, Object obj2, int i16, long j15, long j16, int i17, int i18) {
            zj.p.d(i15 >= 0);
            zj.p.d(i16 >= 0);
            this.f188083a = obj;
            this.f188084b = i15;
            this.f188085c = i15;
            this.f188086d = sVar;
            this.f188087e = obj2;
            this.f188088f = i16;
            this.f188089g = j15;
            this.f188090h = j16;
            this.f188091i = i17;
            this.f188092j = i18;
        }

        public boolean a(e eVar) {
            return this.f188085c == eVar.f188085c && this.f188088f == eVar.f188088f && this.f188089g == eVar.f188089g && this.f188090h == eVar.f188090h && this.f188091i == eVar.f188091i && this.f188092j == eVar.f188092j && Objects.equals(this.f188086d, eVar.f188086d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (a(eVar) && Objects.equals(this.f188083a, eVar.f188083a) && Objects.equals(this.f188087e, eVar.f188087e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f188083a, Integer.valueOf(this.f188085c), this.f188086d, this.f188087e, Integer.valueOf(this.f188088f), Long.valueOf(this.f188089g), Long.valueOf(this.f188090h), Integer.valueOf(this.f188091i), Integer.valueOf(this.f188092j));
        }

        public String toString() {
            String str = "mediaItem=" + this.f188085c + ", period=" + this.f188088f + ", pos=" + this.f188089g;
            if (this.f188091i == -1) {
                return str;
            }
            return str + ", contentPos=" + this.f188090h + ", adGroup=" + this.f188091i + ", ad=" + this.f188092j;
        }
    }

    boolean A();

    int B();

    boolean C();

    int D();

    int E();

    boolean F();

    long G();

    boolean H();

    void a();

    boolean c();

    z d();

    long e();

    void f(List<s> list, boolean z15);

    void g();

    long getDuration();

    void h();

    void i(d dVar);

    y j();

    void k(boolean z15);

    void l(d dVar);

    i0 m();

    boolean n();

    int o();

    boolean p();

    int q();

    e0 r();

    Looper s();

    void seekTo(long j15);

    void t(s sVar);

    boolean u();

    int v();

    boolean w();

    int x();

    long y();

    long z();
}
