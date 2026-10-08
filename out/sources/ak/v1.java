package ak;

/* JADX INFO: loaded from: classes4.dex */
class v1<E> extends r0<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final v1<Object> f6991g = new v1<>(m1.a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient m1<E> f6992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f6993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient u0<E> f6994f;

    private final class b extends w0<E> {
        private b() {
        }

        @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return v1.this.contains(obj);
        }

        @Override // ak.w0
        E get(int i15) {
            return v1.this.f6992d.h(i15);
        }

        @Override // ak.l0
        boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v1.this.f6992d.v();
        }
    }

    v1(m1<E> m1Var) {
        this.f6992d = m1Var;
        long j15 = 0;
        for (int i15 = 0; i15 < m1Var.v(); i15++) {
            j15 += (long) m1Var.j(i15);
        }
        this.f6993e = ek.g.m(j15);
    }

    @Override // ak.l0
    boolean j() {
        return false;
    }

    @Override // ak.h1
    public int l3(Object obj) {
        return this.f6992d.e(obj);
    }

    @Override // ak.h1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public u0<E> y2() {
        u0<E> u0Var = this.f6994f;
        if (u0Var != null) {
            return u0Var;
        }
        b bVar = new b();
        this.f6994f = bVar;
        return bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, ak.h1
    public int size() {
        return this.f6993e;
    }

    @Override // ak.r0
    h1.a<E> u(int i15) {
        return this.f6992d.f(i15);
    }
}
