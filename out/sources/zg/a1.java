package zg;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class a1 extends z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final z0 f235054e = new a1(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f235055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f235056d;

    a1(Object[] objArr, int i15) {
        this.f235055c = objArr;
        this.f235056d = i15;
    }

    @Override // zg.w0
    final Object[] e() {
        return this.f235055c;
    }

    @Override // zg.w0
    final int f() {
        return 0;
    }

    @Override // zg.w0
    final int g() {
        return this.f235056d;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        t0.a(i15, this.f235056d, "index");
        Object obj = this.f235055c[i15];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // zg.w0
    final boolean i() {
        return false;
    }

    @Override // zg.z0, zg.w0
    final int j(Object[] objArr, int i15) {
        System.arraycopy(this.f235055c, 0, objArr, 0, this.f235056d);
        return this.f235056d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f235056d;
    }
}
