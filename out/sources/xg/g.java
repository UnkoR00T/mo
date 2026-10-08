package xg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class g extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient i f218451d;

    g(i iVar) {
        this.f218451d = iVar;
    }

    private final int v(int i15) {
        return (this.f218451d.size() - 1) - i15;
    }

    @Override // xg.i, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f218451d.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i15) {
        i iVar = this.f218451d;
        t.b(i15, iVar.size(), "index");
        return iVar.get(v(i15));
    }

    @Override // xg.i
    public final i i() {
        return this.f218451d;
    }

    @Override // xg.i, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f218451d.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return v(iLastIndexOf);
        }
        return -1;
    }

    @Override // xg.i
    /* JADX INFO: renamed from: j */
    public final i subList(int i15, int i16) {
        i iVar = this.f218451d;
        t.d(i15, i16, iVar.size());
        return iVar.subList(iVar.size() - i16, iVar.size() - i15).i();
    }

    @Override // xg.i, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f218451d.indexOf(obj);
        if (iIndexOf >= 0) {
            return v(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f218451d.size();
    }

    @Override // xg.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i15, int i16) {
        return subList(i15, i16);
    }
}
