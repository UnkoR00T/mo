package ch;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class f0 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f25863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f25864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final f0 f25865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Collection f25866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ i0 f25867e;

    f0(i0 i0Var, Object obj, Collection collection, f0 f0Var) {
        this.f25867e = i0Var;
        this.f25863a = obj;
        this.f25864b = collection;
        this.f25865c = f0Var;
        this.f25866d = f0Var == null ? null : f0Var.f25864b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f25864b.isEmpty();
        boolean zAdd = this.f25864b.add(obj);
        if (zAdd) {
            this.f25867e.f25945d++;
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
        boolean zAddAll = this.f25864b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f25864b.size();
        this.f25867e.f25945d += size2 - size;
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
        this.f25864b.clear();
        this.f25867e.f25945d -= size;
        f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f25864b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f25864b.containsAll(collection);
    }

    final void e() {
        f0 f0Var = this.f25865c;
        if (f0Var != null) {
            f0Var.e();
            return;
        }
        i0 i0Var = this.f25867e;
        i0Var.f25944c.put(this.f25863a, this.f25864b);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f25864b.equals(obj);
    }

    final void f() {
        f0 f0Var = this.f25865c;
        if (f0Var != null) {
            f0Var.f();
        } else if (this.f25864b.isEmpty()) {
            i0 i0Var = this.f25867e;
            i0Var.f25944c.remove(this.f25863a);
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f25864b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new e0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f25864b.remove(obj);
        if (zRemove) {
            this.f25867e.f25945d--;
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
        boolean zRemoveAll = this.f25864b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f25864b.size();
            this.f25867e.f25945d += size2 - size;
            f();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f25864b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f25864b.size();
            this.f25867e.f25945d += size2 - size;
            f();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f25864b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f25864b.toString();
    }

    final void zzb() {
        f0 f0Var = this.f25865c;
        if (f0Var != null) {
            f0Var.zzb();
            f0 f0Var2 = this.f25865c;
            if (f0Var2.f25864b != this.f25866d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f25864b.isEmpty()) {
            i0 i0Var = this.f25867e;
            Collection collection = (Collection) i0Var.f25944c.get(this.f25863a);
            if (collection != null) {
                this.f25864b = collection;
            }
        }
    }
}
