package fh;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
abstract class m extends o implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Map f63378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient int f63379d;

    protected m(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f63378c = map;
    }

    static /* bridge */ /* synthetic */ void n(m mVar, Object obj) {
        Object objRemove;
        Map map = mVar.f63378c;
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
            mVar.f63379d -= size;
        }
    }

    @Override // fh.e1
    public final boolean c(Object obj, Object obj2) {
        Collection collection = (Collection) this.f63378c.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f63379d++;
            return true;
        }
        Collection collectionF = f();
        if (!collectionF.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f63379d++;
        this.f63378c.put(obj, collectionF);
        return true;
    }

    @Override // fh.o
    final Map d() {
        return new e(this, this.f63378c);
    }

    @Override // fh.o
    final Set e() {
        return new g(this, this.f63378c);
    }

    abstract Collection f();

    abstract Collection g(Object obj, Collection collection);

    public final Collection i(Object obj) {
        Collection collectionF = (Collection) this.f63378c.get(obj);
        if (collectionF == null) {
            collectionF = f();
        }
        return g(obj, collectionF);
    }

    final List j(Object obj, List list, j jVar) {
        return list instanceof RandomAccess ? new h(this, obj, list, jVar) : new l(this, obj, list, jVar);
    }

    public final void o() {
        Iterator it = this.f63378c.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f63378c.clear();
        this.f63379d = 0;
    }
}
