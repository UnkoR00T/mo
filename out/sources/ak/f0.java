package ak;

import java.io.Serializable;
import java.lang.Comparable;

/* JADX INFO: loaded from: classes4.dex */
abstract class f0<C extends Comparable> implements Comparable<f0<C>>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C f6880a;

    private static final class a extends f0<Comparable<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f6881b = new a();

        private a() {
            super("");
        }

        @Override // ak.f0
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // ak.f0, java.lang.Comparable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compareTo(f0<Comparable<?>> f0Var) {
            return f0Var == this ? 0 : 1;
        }

        @Override // ak.f0
        void n(StringBuilder sb5) {
            throw new AssertionError();
        }

        @Override // ak.f0
        void o(StringBuilder sb5) {
            sb5.append("+∞)");
        }

        @Override // ak.f0
        boolean p(Comparable<?> comparable) {
            return false;
        }

        public String toString() {
            return "+∞";
        }
    }

    private static final class b<C extends Comparable> extends f0<C> {
        b(C c15) {
            super((Comparable) zj.p.q(c15));
        }

        @Override // ak.f0, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((f0) obj);
        }

        @Override // ak.f0
        public int hashCode() {
            return ~this.f6880a.hashCode();
        }

        @Override // ak.f0
        void n(StringBuilder sb5) {
            sb5.append('(');
            sb5.append(this.f6880a);
        }

        @Override // ak.f0
        void o(StringBuilder sb5) {
            sb5.append(this.f6880a);
            sb5.append(']');
        }

        @Override // ak.f0
        boolean p(C c15) {
            return q1.f(this.f6880a, c15) < 0;
        }

        public String toString() {
            return "/" + this.f6880a + "\\";
        }
    }

    private static final class c extends f0<Comparable<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c f6882b = new c();

        private c() {
            super("");
        }

        @Override // ak.f0
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // ak.f0, java.lang.Comparable
        /* JADX INFO: renamed from: k */
        public int compareTo(f0<Comparable<?>> f0Var) {
            return f0Var == this ? 0 : -1;
        }

        @Override // ak.f0
        void n(StringBuilder sb5) {
            sb5.append("(-∞");
        }

        @Override // ak.f0
        void o(StringBuilder sb5) {
            throw new AssertionError();
        }

        @Override // ak.f0
        boolean p(Comparable<?> comparable) {
            return true;
        }

        public String toString() {
            return "-∞";
        }
    }

    private static final class d<C extends Comparable> extends f0<C> {
        d(C c15) {
            super((Comparable) zj.p.q(c15));
        }

        @Override // ak.f0, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((f0) obj);
        }

        @Override // ak.f0
        public int hashCode() {
            return this.f6880a.hashCode();
        }

        @Override // ak.f0
        void n(StringBuilder sb5) {
            sb5.append('[');
            sb5.append(this.f6880a);
        }

        @Override // ak.f0
        void o(StringBuilder sb5) {
            sb5.append(this.f6880a);
            sb5.append(')');
        }

        @Override // ak.f0
        boolean p(C c15) {
            return q1.f(this.f6880a, c15) <= 0;
        }

        public String toString() {
            return "\\" + this.f6880a + "/";
        }
    }

    f0(C c15) {
        this.f6880a = c15;
    }

    static <C extends Comparable> f0<C> b() {
        return a.f6881b;
    }

    static <C extends Comparable> f0<C> e(C c15) {
        return new b(c15);
    }

    static <C extends Comparable> f0<C> g() {
        return c.f6882b;
    }

    static <C extends Comparable> f0<C> j(C c15) {
        return new d(c15);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f0) {
            try {
                if (compareTo((f0) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k */
    public int compareTo(f0<C> f0Var) {
        if (f0Var == g()) {
            return 1;
        }
        if (f0Var == b()) {
            return -1;
        }
        int iF = q1.f(this.f6880a, f0Var.f6880a);
        return iF != 0 ? iF : Boolean.compare(this instanceof b, f0Var instanceof b);
    }

    abstract void n(StringBuilder sb5);

    abstract void o(StringBuilder sb5);

    abstract boolean p(C c15);
}
