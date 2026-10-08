package mq;

/* JADX INFO: loaded from: classes4.dex */
public final class g<T> implements e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f127610c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile e<T> f127611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f127612b = f127610c;

    private g(e<T> eVar) {
        this.f127611a = eVar;
    }

    public static <T> e<T> a(e<T> eVar) {
        return ((eVar instanceof g) || (eVar instanceof b)) ? eVar : new g((e) d.b(eVar));
    }

    @Override // nq.a
    public T get() {
        T t15 = (T) this.f127612b;
        if (t15 != f127610c) {
            return t15;
        }
        e<T> eVar = this.f127611a;
        if (eVar == null) {
            return (T) this.f127612b;
        }
        T t16 = eVar.get();
        this.f127612b = t16;
        this.f127611a = null;
        return t16;
    }
}
