package ch;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
abstract class i0 extends k0 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient Map f25944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient int f25945d;

    protected i0(Map map) {
        t.c(map.isEmpty());
        this.f25944c = map;
    }

    static /* bridge */ /* synthetic */ void k(i0 i0Var, Object obj) {
        Object objRemove;
        try {
            objRemove = i0Var.f25944c.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            i0Var.f25945d -= size;
        }
    }

    @Override // ch.u1
    public final boolean L(Object obj, Object obj2) {
        Collection collection = (Collection) this.f25944c.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f25945d++;
            return true;
        }
        Collection collectionC = c();
        if (!collectionC.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f25945d++;
        this.f25944c.put(obj, collectionC);
        return true;
    }

    @Override // ch.k0
    final Map a() {
        return new a0(this, this.f25944c);
    }

    @Override // ch.k0
    final Set b() {
        return new c0(this, this.f25944c);
    }

    abstract Collection c();

    abstract Collection e(Object obj, Collection collection);

    public final Collection g(Object obj) {
        Collection collectionC = (Collection) this.f25944c.get(obj);
        if (collectionC == null) {
            collectionC = c();
        }
        return e(obj, collectionC);
    }

    final List h(Object obj, List list, f0 f0Var) {
        return list instanceof RandomAccess ? new d0(this, obj, list, f0Var) : new h0(this, obj, list, f0Var);
    }

    public final void m() {
        Iterator it = this.f25944c.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f25944c.clear();
        this.f25945d = 0;
    }
}
