package eh;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class f extends q implements u0 {
    protected f(Map map) {
        super(map);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.util.List] */
    @Override // eh.u0
    public final List a(Object obj) {
        return super.n(obj);
    }

    @Override // eh.q
    final Collection h(Object obj, Collection collection) {
        return o(obj, (List) collection, null);
    }
}
