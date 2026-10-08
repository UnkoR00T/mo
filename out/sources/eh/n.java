package eh;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class n extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f50825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f50826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final n f50827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Collection f50828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ q f50829e;

    n(q qVar, Object obj, Collection collection, n nVar) {
        this.f50829e = qVar;
        this.f50825a = obj;
        this.f50826b = collection;
        this.f50827c = nVar;
        this.f50828d = nVar == null ? null : nVar.f50826b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f50826b.isEmpty();
        boolean zAdd = this.f50826b.add(obj);
        if (!zAdd) {
            return zAdd;
        }
        q.i(this.f50829e);
        if (!zIsEmpty) {
            return zAdd;
        }
        e();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f50826b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        q.k(this.f50829e, this.f50826b.size() - size);
        if (size != 0) {
            return zAddAll;
        }
        e();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f50826b.clear();
        q.m(this.f50829e, size);
        f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f50826b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f50826b.containsAll(collection);
    }

    final void e() {
        n nVar = this.f50827c;
        if (nVar != null) {
            nVar.e();
        } else {
            this.f50829e.f50946c.put(this.f50825a, this.f50826b);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f50826b.equals(obj);
    }

    final void f() {
        n nVar = this.f50827c;
        if (nVar != null) {
            nVar.f();
        } else if (this.f50826b.isEmpty()) {
            this.f50829e.f50946c.remove(this.f50825a);
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f50826b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f50826b.remove(obj);
        if (zRemove) {
            q.j(this.f50829e);
            f();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f50826b.removeAll(collection);
        if (zRemoveAll) {
            q.k(this.f50829e, this.f50826b.size() - size);
            f();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f50826b.retainAll(collection);
        if (zRetainAll) {
            q.k(this.f50829e, this.f50826b.size() - size);
            f();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f50826b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f50826b.toString();
    }

    final void zzb() {
        Collection collection;
        n nVar = this.f50827c;
        if (nVar != null) {
            nVar.zzb();
            if (this.f50827c.f50826b != this.f50828d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f50826b.isEmpty() || (collection = (Collection) this.f50829e.f50946c.get(this.f50825a)) == null) {
                return;
            }
            this.f50826b = collection;
        }
    }
}
