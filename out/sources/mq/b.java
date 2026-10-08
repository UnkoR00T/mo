package mq;

/* JADX INFO: loaded from: classes4.dex */
public final class b<T> implements e<T>, aq.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f127605c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile e<T> f127606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f127607b = f127605c;

    private b(e<T> eVar) {
        this.f127606a = eVar;
    }

    private synchronized Object a() {
        Object obj;
        obj = this.f127607b;
        if (obj == f127605c) {
            obj = this.f127606a.get();
            this.f127607b = d(this.f127607b, obj);
            this.f127606a = null;
        }
        return obj;
    }

    public static <T> aq.a<T> b(e<T> eVar) {
        return eVar instanceof aq.a ? (aq.a) eVar : new b((e) d.b(eVar));
    }

    public static <T> e<T> c(e<T> eVar) {
        d.b(eVar);
        return eVar instanceof b ? eVar : new b(eVar);
    }

    private static Object d(Object obj, Object obj2) {
        if (obj == f127605c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // nq.a
    public T get() {
        T t15 = (T) this.f127607b;
        return t15 == f127605c ? (T) a() : t15;
    }
}
