package v;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface h3 extends p1 {
    p1 a();

    @Override // v.p1
    default Set<p1.a<?>> b() {
        return a().b();
    }

    @Override // v.p1
    default p1.c c(p1.a<?> aVar) {
        return a().c(aVar);
    }

    @Override // v.p1
    default <ValueT> ValueT d(p1.a<ValueT> aVar) {
        return (ValueT) a().d(aVar);
    }

    @Override // v.p1
    default Set<p1.c> e(p1.a<?> aVar) {
        return a().e(aVar);
    }

    @Override // v.p1
    default <ValueT> ValueT f(p1.a<ValueT> aVar, ValueT valuet) {
        return (ValueT) a().f(aVar, valuet);
    }

    @Override // v.p1
    default void g(String str, p1.b bVar) {
        a().g(str, bVar);
    }

    @Override // v.p1
    default boolean h(p1.a<?> aVar) {
        return a().h(aVar);
    }

    @Override // v.p1
    default <ValueT> ValueT i(p1.a<ValueT> aVar, p1.c cVar) {
        return (ValueT) a().i(aVar, cVar);
    }
}
