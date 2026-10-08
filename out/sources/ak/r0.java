package ak;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r0<E> extends s0<E> implements h1<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient n0<E> f6955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient u0<h1.a<E>> f6956c;

    class a extends h2<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        E f6958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f6959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r0 f6960d;

        a(r0 r0Var, Iterator it) {
            this.f6959c = it;
            this.f6960d = r0Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6957a > 0 || this.f6959c.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f6957a <= 0) {
                h1.a aVar = (h1.a) this.f6959c.next();
                this.f6958b = (E) aVar.b();
                this.f6957a = aVar.getCount();
            }
            this.f6957a--;
            E e15 = this.f6958b;
            Objects.requireNonNull(e15);
            return e15;
        }
    }

    public static class b<E> extends l0.b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        m1<E> f6961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f6962b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f6963c = false;

        b(int i15) {
            this.f6961a = m1.b(i15);
        }

        static <T> m1<T> h(Iterable<T> iterable) {
            if (iterable instanceof v1) {
                return ((v1) iterable).f6992d;
            }
            if (iterable instanceof e) {
                return ((e) iterable).f6873a;
            }
            return null;
        }

        @Override // ak.l0.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b<E> a(E e15) {
            return f(e15, 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b<E> e(Iterable<? extends E> iterable) {
            Objects.requireNonNull(this.f6961a);
            if (!(iterable instanceof h1)) {
                super.b(iterable);
                return this;
            }
            h1 h1VarA = i1.a(iterable);
            m1 m1VarH = h(h1VarA);
            if (m1VarH != null) {
                m1<E> m1Var = this.f6961a;
                m1Var.c(Math.max(m1Var.v(), m1VarH.v()));
                for (int iD = m1VarH.d(); iD >= 0; iD = m1VarH.q(iD)) {
                    f(m1VarH.h(iD), m1VarH.j(iD));
                }
            } else {
                Set<h1.a<E>> setEntrySet = h1VarA.entrySet();
                m1<E> m1Var2 = this.f6961a;
                m1Var2.c(Math.max(m1Var2.v(), setEntrySet.size()));
                for (h1.a<E> aVar : h1VarA.entrySet()) {
                    f(aVar.b(), aVar.getCount());
                }
            }
            return this;
        }

        public b<E> f(E e15, int i15) {
            Objects.requireNonNull(this.f6961a);
            if (i15 == 0) {
                return this;
            }
            if (this.f6962b) {
                this.f6961a = new m1<>(this.f6961a);
                this.f6963c = false;
            }
            this.f6962b = false;
            zj.p.q(e15);
            m1<E> m1Var = this.f6961a;
            m1Var.r(e15, i15 + m1Var.e(e15));
            return this;
        }

        public r0<E> g() {
            Objects.requireNonNull(this.f6961a);
            if (this.f6961a.v() == 0) {
                return r0.v();
            }
            if (this.f6963c) {
                this.f6961a = new m1<>(this.f6961a);
                this.f6963c = false;
            }
            this.f6962b = true;
            return new v1(this.f6961a);
        }
    }

    private final class c extends w0<h1.a<E>> {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ak.w0
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public h1.a<E> get(int i15) {
            return r0.this.u(i15);
        }

        @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof h1.a) {
                h1.a aVar = (h1.a) obj;
                if (aVar.getCount() > 0 && r0.this.l3(aVar.b()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // ak.u0, java.util.Collection, java.util.Set
        public int hashCode() {
            return r0.this.hashCode();
        }

        @Override // ak.l0
        boolean j() {
            return r0.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return r0.this.y2().size();
        }

        /* synthetic */ c(r0 r0Var, a aVar) {
            this();
        }
    }

    r0() {
    }

    public static <E> r0<E> n(Iterable<? extends E> iterable) {
        if (iterable instanceof r0) {
            r0<E> r0Var = (r0) iterable;
            if (!r0Var.j()) {
                return r0Var;
            }
        }
        b bVar = new b(i1.c(iterable));
        bVar.e(iterable);
        return bVar.g();
    }

    private u0<h1.a<E>> o() {
        return isEmpty() ? u0.C() : new c(this, null);
    }

    public static <E> r0<E> v() {
        return v1.f6991g;
    }

    @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return l3(obj) > 0;
    }

    @Override // ak.l0
    public n0<E> e() {
        n0<E> n0Var = this.f6955b;
        if (n0Var != null) {
            return n0Var;
        }
        n0<E> n0VarE = super.e();
        this.f6955b = n0VarE;
        return n0VarE;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return i1.b(this, obj);
    }

    @Override // ak.l0
    int f(Object[] objArr, int i15) {
        h2<h1.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            h1.a<E> next = it.next();
            Arrays.fill(objArr, i15, next.getCount() + i15, next.b());
            i15 += next.getCount();
        }
        return i15;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return b2.d(entrySet());
    }

    @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: k */
    public h2<E> iterator() {
        return new a(this, entrySet().iterator());
    }

    /* JADX INFO: renamed from: s */
    public abstract u0<E> y2();

    @Override // ak.h1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public u0<h1.a<E>> entrySet() {
        u0<h1.a<E>> u0Var = this.f6956c;
        if (u0Var != null) {
            return u0Var;
        }
        u0<h1.a<E>> u0VarO = o();
        this.f6956c = u0VarO;
        return u0VarO;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return entrySet().toString();
    }

    abstract h1.a<E> u(int i15);
}
