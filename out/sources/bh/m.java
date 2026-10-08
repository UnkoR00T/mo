package bh;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class m extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ n f19444d;

    m(n nVar) {
        this.f19444d = nVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i15) {
        x0.a(i15, this.f19444d.f19456e, "index");
        int i16 = i15 + i15;
        Object obj = this.f19444d.f19455d[i16];
        Objects.requireNonNull(obj);
        Object obj2 = this.f19444d.f19455d[i16 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19444d.f19456e;
    }
}
