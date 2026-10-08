package cf;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> implements nq.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f25573c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile nq.a<T> f25574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f25575b = f25573c;

    private a(nq.a<T> aVar) {
        this.f25574a = aVar;
    }

    public static <P extends nq.a<T>, T> nq.a<T> a(P p15) {
        d.b(p15);
        return p15 instanceof a ? p15 : new a(p15);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f25573c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // nq.a
    public T get() {
        T t15;
        T t16 = (T) this.f25575b;
        Object obj = f25573c;
        if (t16 != obj) {
            return t16;
        }
        synchronized (this) {
            try {
                t15 = (T) this.f25575b;
                if (t15 == obj) {
                    t15 = this.f25574a.get();
                    this.f25575b = b(this.f25575b, t15);
                    this.f25574a = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return t15;
    }
}
