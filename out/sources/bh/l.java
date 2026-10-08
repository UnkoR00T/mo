package bh;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class l extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final f f19440f = new l(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f19441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f19442e;

    l(Object[] objArr, int i15) {
        this.f19441d = objArr;
        this.f19442e = i15;
    }

    @Override // bh.f, bh.c
    final int e(Object[] objArr, int i15) {
        System.arraycopy(this.f19441d, 0, objArr, 0, this.f19442e);
        return this.f19442e;
    }

    @Override // bh.c
    final int f() {
        return this.f19442e;
    }

    @Override // bh.c
    final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        x0.a(i15, this.f19442e, "index");
        Object obj = this.f19441d[i15];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // bh.c
    final Object[] h() {
        return this.f19441d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19442e;
    }
}
