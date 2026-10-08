package bh;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class p extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f19460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f19461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f19462f;

    p(Object[] objArr, int i15, int i16) {
        this.f19460d = objArr;
        this.f19461e = i15;
        this.f19462f = i16;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        x0.a(i15, this.f19462f, "index");
        Object obj = this.f19460d[i15 + i15 + this.f19461e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19462f;
    }
}
