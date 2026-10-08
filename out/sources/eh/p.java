package eh;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
class p extends n implements List {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f50900f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(q qVar, Object obj, List list, n nVar) {
        super(qVar, obj, list, nVar);
        this.f50900f = qVar;
    }

    @Override // java.util.List
    public final void add(int i15, Object obj) {
        zzb();
        boolean zIsEmpty = this.f50826b.isEmpty();
        ((List) this.f50826b).add(i15, obj);
        q.i(this.f50900f);
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
        boolean zAddAll = ((List) this.f50826b).addAll(i15, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        q.k(this.f50900f, this.f50826b.size() - size);
        if (size != 0) {
            return zAddAll;
        }
        e();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        zzb();
        return ((List) this.f50826b).get(i15);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f50826b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f50826b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new o(this);
    }

    @Override // java.util.List
    public final Object remove(int i15) {
        zzb();
        Object objRemove = ((List) this.f50826b).remove(i15);
        q.j(this.f50900f);
        f();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i15, Object obj) {
        zzb();
        return ((List) this.f50826b).set(i15, obj);
    }

    @Override // java.util.List
    public final List subList(int i15, int i16) {
        zzb();
        q qVar = this.f50900f;
        Object obj = this.f50825a;
        List listSubList = ((List) this.f50826b).subList(i15, i16);
        n nVar = this.f50827c;
        if (nVar == null) {
            nVar = this;
        }
        return qVar.o(obj, listSubList, nVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i15) {
        zzb();
        return new o(this, i15);
    }
}
