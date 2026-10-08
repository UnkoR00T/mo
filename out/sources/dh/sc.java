package dh;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
final class sc extends mc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ tc f42229c;

    sc(tc tcVar) {
        this.f42229c = tcVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i15) {
        f4.a(i15, this.f42229c.f42301e, "index");
        tc tcVar = this.f42229c;
        int i16 = i15 + i15;
        Object obj = tcVar.f42300d[i16];
        obj.getClass();
        Object obj2 = tcVar.f42300d[i16 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42229c.f42301e;
    }
}
