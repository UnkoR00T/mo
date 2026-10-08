package mq;

/* JADX INFO: loaded from: classes4.dex */
public final class a<T> implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e<T> f127604a;

    public static <T> void a(e<T> eVar, e<T> eVar2) {
        b((a) eVar, eVar2);
    }

    private static <T> void b(a<T> aVar, e<T> eVar) {
        d.b(eVar);
        if (((a) aVar).f127604a != null) {
            throw new IllegalStateException();
        }
        ((a) aVar).f127604a = eVar;
    }

    @Override // nq.a
    public T get() {
        e<T> eVar = this.f127604a;
        if (eVar != null) {
            return eVar.get();
        }
        throw new IllegalStateException();
    }
}
