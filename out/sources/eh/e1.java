package eh;

/* JADX INFO: loaded from: classes3.dex */
final class e1 extends p0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final p0 f50480e = new e1(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f50481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f50482d;

    e1(Object[] objArr, int i15) {
        this.f50481c = objArr;
        this.f50482d = i15;
    }

    @Override // eh.p0, eh.k0
    final int e(Object[] objArr, int i15) {
        System.arraycopy(this.f50481c, 0, objArr, 0, this.f50482d);
        return this.f50482d;
    }

    @Override // eh.k0
    final int f() {
        return this.f50482d;
    }

    @Override // eh.k0
    final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        c.a(i15, this.f50482d, "index");
        Object obj = this.f50481c[i15];
        obj.getClass();
        return obj;
    }

    @Override // eh.k0
    final Object[] h() {
        return this.f50481c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50482d;
    }
}
