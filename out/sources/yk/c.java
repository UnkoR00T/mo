package yk;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f227456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<d0<? super T>> f227457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<q> f227458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f227459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f227460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g<T> f227461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<Class<?>> f227462g;

    public static /* synthetic */ Object a(Object obj, d dVar) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, d dVar) {
        return obj;
    }

    public static <T> b<T> c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> b<T> e(d0<T> d0Var) {
        return new b<>(d0Var, new d0[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(d0<T> d0Var, d0<? super T>... d0VarArr) {
        return new b<>(d0Var, d0VarArr);
    }

    public static <T> c<T> l(final T t15, Class<T> cls) {
        return m(cls).e(new g() { // from class: yk.a
            @Override // yk.g
            public final Object a(d dVar) {
                return c.b(t15, dVar);
            }
        }).d();
    }

    public static <T> b<T> m(Class<T> cls) {
        return c(cls).f();
    }

    @SafeVarargs
    public static <T> c<T> q(final T t15, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).e(new g() { // from class: yk.b
            @Override // yk.g
            public final Object a(d dVar) {
                return c.a(t15, dVar);
            }
        }).d();
    }

    public Set<q> g() {
        return this.f227458c;
    }

    public g<T> h() {
        return this.f227461f;
    }

    public String i() {
        return this.f227456a;
    }

    public Set<d0<? super T>> j() {
        return this.f227457b;
    }

    public Set<Class<?>> k() {
        return this.f227462g;
    }

    public boolean n() {
        return this.f227459d == 1;
    }

    public boolean o() {
        return this.f227459d == 2;
    }

    public boolean p() {
        return this.f227460e == 0;
    }

    public c<T> r(g<T> gVar) {
        return new c<>(this.f227456a, this.f227457b, this.f227458c, this.f227459d, this.f227460e, gVar, this.f227462g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f227457b.toArray()) + ">{" + this.f227459d + ", type=" + this.f227460e + ", deps=" + Arrays.toString(this.f227458c.toArray()) + "}";
    }

    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f227463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<d0<? super T>> f227464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<q> f227465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f227466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f227467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private g<T> f227468f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set<Class<?>> f227469g;

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> f() {
            this.f227467e = 1;
            return this;
        }

        private b<T> h(int i15) {
            c0.d(this.f227466d == 0, "Instantiation type has already been set.");
            this.f227466d = i15;
            return this;
        }

        private void i(d0<?> d0Var) {
            c0.a(!this.f227464b.contains(d0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(q qVar) {
            c0.c(qVar, "Null dependency");
            i(qVar.b());
            this.f227465c.add(qVar);
            return this;
        }

        public b<T> c() {
            return h(1);
        }

        public c<T> d() {
            c0.d(this.f227468f != null, "Missing required property: factory.");
            return new c<>(this.f227463a, new HashSet(this.f227464b), new HashSet(this.f227465c), this.f227466d, this.f227467e, this.f227468f, this.f227469g);
        }

        public b<T> e(g<T> gVar) {
            this.f227468f = (g) c0.c(gVar, "Null factory");
            return this;
        }

        public b<T> g(String str) {
            this.f227463a = str;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f227463a = null;
            HashSet hashSet = new HashSet();
            this.f227464b = hashSet;
            this.f227465c = new HashSet();
            this.f227466d = 0;
            this.f227467e = 0;
            this.f227469g = new HashSet();
            c0.c(cls, "Null interface");
            hashSet.add(d0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                c0.c(cls2, "Null interface");
                this.f227464b.add(d0.b(cls2));
            }
        }

        @SafeVarargs
        private b(d0<T> d0Var, d0<? super T>... d0VarArr) {
            this.f227463a = null;
            HashSet hashSet = new HashSet();
            this.f227464b = hashSet;
            this.f227465c = new HashSet();
            this.f227466d = 0;
            this.f227467e = 0;
            this.f227469g = new HashSet();
            c0.c(d0Var, "Null interface");
            hashSet.add(d0Var);
            for (d0<? super T> d0Var2 : d0VarArr) {
                c0.c(d0Var2, "Null interface");
            }
            Collections.addAll(this.f227464b, d0VarArr);
        }
    }

    private c(String str, Set<d0<? super T>> set, Set<q> set2, int i15, int i16, g<T> gVar, Set<Class<?>> set3) {
        this.f227456a = str;
        this.f227457b = Collections.unmodifiableSet(set);
        this.f227458c = Collections.unmodifiableSet(set2);
        this.f227459d = i15;
        this.f227460e = i16;
        this.f227461f = gVar;
        this.f227462g = Collections.unmodifiableSet(set3);
    }
}
