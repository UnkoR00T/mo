package fh;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class j extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f63141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f63142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final j f63143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Collection f63144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ m f63145e;

    j(m mVar, Object obj, Collection collection, j jVar) {
        this.f63145e = mVar;
        this.f63141a = obj;
        this.f63142b = collection;
        this.f63143c = jVar;
        this.f63144d = jVar == null ? null : jVar.f63142b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f63142b.isEmpty();
        boolean zAdd = this.f63142b.add(obj);
        if (zAdd) {
            this.f63145e.f63379d++;
            if (zIsEmpty) {
                e();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f63142b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f63142b.size();
        this.f63145e.f63379d += size2 - size;
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
        this.f63142b.clear();
        this.f63145e.f63379d -= size;
        f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f63142b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f63142b.containsAll(collection);
    }

    final void e() {
        j jVar = this.f63143c;
        if (jVar != null) {
            jVar.e();
            return;
        }
        m mVar = this.f63145e;
        mVar.f63378c.put(this.f63141a, this.f63142b);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f63142b.equals(obj);
    }

    final void f() {
        j jVar = this.f63143c;
        if (jVar != null) {
            jVar.f();
        } else if (this.f63142b.isEmpty()) {
            m mVar = this.f63145e;
            mVar.f63378c.remove(this.f63141a);
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f63142b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new i(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f63142b.remove(obj);
        if (zRemove) {
            this.f63145e.f63379d--;
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
        boolean zRemoveAll = this.f63142b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f63142b.size();
            this.f63145e.f63379d += size2 - size;
            f();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f63142b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f63142b.size();
            this.f63145e.f63379d += size2 - size;
            f();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f63142b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f63142b.toString();
    }

    final void zzb() {
        j jVar = this.f63143c;
        if (jVar != null) {
            jVar.zzb();
            j jVar2 = this.f63143c;
            if (jVar2.f63142b != this.f63144d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f63142b.isEmpty()) {
            m mVar = this.f63145e;
            Collection collection = (Collection) mVar.f63378c.get(this.f63141a);
            if (collection != null) {
                this.f63142b = collection;
            }
        }
    }
}
