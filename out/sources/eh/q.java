package eh;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
abstract class q extends s implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Map f50946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient int f50947d;

    protected q(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f50946c = map;
    }

    static /* synthetic */ int i(q qVar) {
        int i15 = qVar.f50947d;
        qVar.f50947d = i15 + 1;
        return i15;
    }

    static /* synthetic */ int j(q qVar) {
        int i15 = qVar.f50947d;
        qVar.f50947d = i15 - 1;
        return i15;
    }

    static /* synthetic */ int k(q qVar, int i15) {
        int i16 = qVar.f50947d + i15;
        qVar.f50947d = i16;
        return i16;
    }

    static /* synthetic */ int m(q qVar, int i15) {
        int i16 = qVar.f50947d - i15;
        qVar.f50947d = i16;
        return i16;
    }

    static /* synthetic */ void r(q qVar, Object obj) {
        Object objRemove;
        Map map = qVar.f50946c;
        map.getClass();
        try {
            objRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            qVar.f50947d -= size;
        }
    }

    @Override // eh.c1
    public final boolean d(Object obj, Object obj2) {
        Collection collection = (Collection) this.f50946c.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f50947d++;
            return true;
        }
        Collection collectionG = g();
        if (!collectionG.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f50947d++;
        this.f50946c.put(obj, collectionG);
        return true;
    }

    @Override // eh.s
    final Map e() {
        return new i(this, this.f50946c);
    }

    @Override // eh.s
    final Set f() {
        return new k(this, this.f50946c);
    }

    abstract Collection g();

    abstract Collection h(Object obj, Collection collection);

    public final Collection n(Object obj) {
        Collection collectionG = (Collection) this.f50946c.get(obj);
        if (collectionG == null) {
            collectionG = g();
        }
        return h(obj, collectionG);
    }

    final List o(Object obj, List list, n nVar) {
        return list instanceof RandomAccess ? new l(this, obj, list, nVar) : new p(this, obj, list, nVar);
    }

    public final void s() {
        Iterator it = this.f50946c.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f50946c.clear();
        this.f50947d = 0;
    }
}
