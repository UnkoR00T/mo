package ch;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class x1 extends i1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final i1 f26467f = new x1(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f26468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f26469e;

    x1(Object[] objArr, int i15) {
        this.f26468d = objArr;
        this.f26469e = i15;
    }

    @Override // ch.i1, ch.d1
    final int e(Object[] objArr, int i15) {
        System.arraycopy(this.f26468d, 0, objArr, i15, this.f26469e);
        return i15 + this.f26469e;
    }

    @Override // ch.d1
    final int f() {
        return this.f26469e;
    }

    @Override // ch.d1
    final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        t.a(i15, this.f26469e, "index");
        Object obj = this.f26468d[i15];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // ch.d1
    final Object[] i() {
        return this.f26468d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26469e;
    }
}
