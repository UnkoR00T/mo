package fh;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class h1 extends m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ i1 f63067d;

    h1(i1 i1Var) {
        this.f63067d = i1Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i15) {
        hl.a(i15, this.f63067d.f63094e, "index");
        int i16 = i15 + i15;
        Object obj = this.f63067d.f63093d[i16];
        Objects.requireNonNull(obj);
        Object obj2 = this.f63067d.f63093d[i16 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f63067d.f63094e;
    }
}
