package fh;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class k1 extends m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f63310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f63311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f63312f = 1;

    k1(Object[] objArr, int i15, int i16) {
        this.f63310d = objArr;
        this.f63311e = i15;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        hl.a(i15, this.f63312f, "index");
        Object obj = this.f63310d[i15 + i15 + this.f63311e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f63312f;
    }
}
