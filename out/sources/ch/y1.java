package ch;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class y1 extends i1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ z1 f26538d;

    y1(z1 z1Var) {
        this.f26538d = z1Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i15) {
        t.a(i15, this.f26538d.f26721e, "index");
        int i16 = i15 + i15;
        Object obj = this.f26538d.f26720d[i16];
        Objects.requireNonNull(obj);
        Object obj2 = this.f26538d.f26720d[i16 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26538d.f26721e;
    }
}
