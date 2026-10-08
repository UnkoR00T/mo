package ak;

import java.io.Serializable;
import java.lang.Comparable;

/* JADX INFO: loaded from: classes4.dex */
public final class q1<C extends Comparable> extends r1 implements zj.q<C>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q1<Comparable> f6951c = new q1<>(f0.g(), f0.b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final f0<C> f6952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final f0<C> f6953b;

    private static class a extends n1<q1<?>> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final n1<?> f6954a = new a();

        private a() {
        }

        @Override // ak.n1, java.util.Comparator
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compare(q1<?> q1Var, q1<?> q1Var2) {
            return d0.k().f(q1Var.f6952a, q1Var2.f6952a).f(q1Var.f6953b, q1Var2.f6953b).j();
        }
    }

    private q1(f0<C> f0Var, f0<C> f0Var2) {
        this.f6952a = (f0) zj.p.q(f0Var);
        this.f6953b = (f0) zj.p.q(f0Var2);
        if (f0Var.compareTo(f0Var2) > 0 || f0Var == f0.b() || f0Var2 == f0.g()) {
            throw new IllegalArgumentException("Invalid range: " + o(f0Var, f0Var2));
        }
    }

    public static <C extends Comparable<?>> q1<C> a() {
        return (q1<C>) f6951c;
    }

    public static <C extends Comparable<?>> q1<C> c(C c15) {
        return h(f0.j(c15), f0.b());
    }

    public static <C extends Comparable<?>> q1<C> d(C c15, C c16) {
        return h(f0.j(c15), f0.e(c16));
    }

    public static <C extends Comparable<?>> q1<C> e(C c15, C c16) {
        return h(f0.j(c15), f0.j(c16));
    }

    static int f(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    static <C extends Comparable<?>> q1<C> h(f0<C> f0Var, f0<C> f0Var2) {
        return new q1<>(f0Var, f0Var2);
    }

    static <C extends Comparable<?>> n1<q1<C>> m() {
        return (n1<q1<C>>) a.f6954a;
    }

    private static String o(f0<?> f0Var, f0<?> f0Var2) {
        StringBuilder sb5 = new StringBuilder(16);
        f0Var.n(sb5);
        sb5.append("..");
        f0Var2.o(sb5);
        return sb5.toString();
    }

    @Override // zj.q
    @Deprecated
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean apply(C c15) {
        return g(c15);
    }

    public boolean equals(Object obj) {
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            if (this.f6952a.equals(q1Var.f6952a) && this.f6953b.equals(q1Var.f6953b)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(C c15) {
        zj.p.q(c15);
        return this.f6952a.p(c15) && !this.f6953b.p(c15);
    }

    public int hashCode() {
        return (this.f6952a.hashCode() * 31) + this.f6953b.hashCode();
    }

    public q1<C> i(q1<C> q1Var) {
        int iK = this.f6952a.compareTo(q1Var.f6952a);
        int iK2 = this.f6953b.compareTo(q1Var.f6953b);
        if (iK >= 0 && iK2 <= 0) {
            return this;
        }
        if (iK <= 0 && iK2 >= 0) {
            return q1Var;
        }
        f0<C> f0Var = iK >= 0 ? this.f6952a : q1Var.f6952a;
        f0<C> f0Var2 = iK2 <= 0 ? this.f6953b : q1Var.f6953b;
        zj.p.m(f0Var.compareTo(f0Var2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, q1Var);
        return h(f0Var, f0Var2);
    }

    public boolean j(q1<C> q1Var) {
        return this.f6952a.compareTo(q1Var.f6953b) <= 0 && q1Var.f6952a.compareTo(this.f6953b) <= 0;
    }

    public boolean k() {
        return this.f6952a.equals(this.f6953b);
    }

    public q1<C> n(q1<C> q1Var) {
        int iK = this.f6952a.compareTo(q1Var.f6952a);
        int iK2 = this.f6953b.compareTo(q1Var.f6953b);
        if (iK <= 0 && iK2 >= 0) {
            return this;
        }
        if (iK < 0 || iK2 > 0) {
            return h(iK <= 0 ? this.f6952a : q1Var.f6952a, iK2 >= 0 ? this.f6953b : q1Var.f6953b);
        }
        return q1Var;
    }

    public String toString() {
        return o(this.f6952a, this.f6953b);
    }
}
