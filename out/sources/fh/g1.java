package fh;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class g1 extends m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final m0 f63048f = new g1(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f63049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f63050e;

    g1(Object[] objArr, int i15) {
        this.f63049d = objArr;
        this.f63050e = i15;
    }

    @Override // fh.m0, fh.h0
    final int e(Object[] objArr, int i15) {
        System.arraycopy(this.f63049d, 0, objArr, 0, this.f63050e);
        return this.f63050e;
    }

    @Override // fh.h0
    final int f() {
        return this.f63050e;
    }

    @Override // fh.h0
    final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        hl.a(i15, this.f63050e, "index");
        Object obj = this.f63049d[i15];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // fh.h0
    final Object[] h() {
        return this.f63049d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f63050e;
    }
}
