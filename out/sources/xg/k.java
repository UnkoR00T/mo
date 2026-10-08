package xg;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class k extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final i f218457f = new k(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f218458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f218459e;

    k(Object[] objArr, int i15) {
        this.f218458d = objArr;
        this.f218459e = i15;
    }

    @Override // xg.d
    final Object[] e() {
        return this.f218458d;
    }

    @Override // xg.d
    final int f() {
        return 0;
    }

    @Override // xg.d
    final int g() {
        return this.f218459e;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        t.b(i15, this.f218459e, "index");
        Object obj = this.f218458d[i15];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // xg.i, xg.d
    final int h(Object[] objArr, int i15) {
        Object[] objArr2 = this.f218458d;
        int i16 = this.f218459e;
        System.arraycopy(objArr2, 0, objArr, 0, i16);
        return i16;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f218459e;
    }
}
