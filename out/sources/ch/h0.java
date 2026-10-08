package ch;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
class h0 extends f0 implements List {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ i0 f25919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h0(i0 i0Var, Object obj, List list, f0 f0Var) {
        super(i0Var, obj, list, f0Var);
        this.f25919f = i0Var;
    }

    @Override // java.util.List
    public final void add(int i15, Object obj) {
        zzb();
        boolean zIsEmpty = this.f25864b.isEmpty();
        ((List) this.f25864b).add(i15, obj);
        this.f25919f.f25945d++;
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
        boolean zAddAll = ((List) this.f25864b).addAll(i15, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f25864b.size();
        this.f25919f.f25945d += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        e();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        zzb();
        return ((List) this.f25864b).get(i15);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f25864b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f25864b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new g0(this);
    }

    @Override // java.util.List
    public final Object remove(int i15) {
        zzb();
        Object objRemove = ((List) this.f25864b).remove(i15);
        this.f25919f.f25945d--;
        f();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i15, Object obj) {
        zzb();
        return ((List) this.f25864b).set(i15, obj);
    }

    @Override // java.util.List
    public final List subList(int i15, int i16) {
        zzb();
        List listSubList = ((List) this.f25864b).subList(i15, i16);
        f0 f0Var = this.f25865c;
        if (f0Var == null) {
            f0Var = this;
        }
        return this.f25919f.h(this.f25863a, listSubList, f0Var);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i15) {
        zzb();
        return new g0(this, i15);
    }
}
