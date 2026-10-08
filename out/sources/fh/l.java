package fh;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
class l extends j implements List {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ m f63356f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, Object obj, List list, j jVar) {
        super(mVar, obj, list, jVar);
        this.f63356f = mVar;
    }

    @Override // java.util.List
    public final void add(int i15, Object obj) {
        zzb();
        boolean zIsEmpty = this.f63142b.isEmpty();
        ((List) this.f63142b).add(i15, obj);
        this.f63356f.f63379d++;
        if (zIsEmpty) {
            e();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i15, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f63142b).addAll(i15, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f63142b.size();
        this.f63356f.f63379d += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        e();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        zzb();
        return ((List) this.f63142b).get(i15);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f63142b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f63142b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new k(this);
    }

    @Override // java.util.List
    public final Object remove(int i15) {
        zzb();
        Object objRemove = ((List) this.f63142b).remove(i15);
        this.f63356f.f63379d--;
        f();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i15, Object obj) {
        zzb();
        return ((List) this.f63142b).set(i15, obj);
    }

    @Override // java.util.List
    public final List subList(int i15, int i16) {
        zzb();
        List listSubList = ((List) this.f63142b).subList(i15, i16);
        j jVar = this.f63143c;
        if (jVar == null) {
            jVar = this;
        }
        return this.f63356f.j(this.f63141a, listSubList, jVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i15) {
        zzb();
        return new k(this, i15);
    }
}
