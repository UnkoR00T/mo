package eh;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
final class f1 extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ g1 f50536c;

    f1(g1 g1Var) {
        this.f50536c = g1Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i15) {
        c.a(i15, this.f50536c.f50567e, "index");
        g1 g1Var = this.f50536c;
        int i16 = i15 + i15;
        Object obj = g1Var.f50566d[i16];
        obj.getClass();
        Object obj2 = g1Var.f50566d[i16 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50536c.f50567e;
    }
}
