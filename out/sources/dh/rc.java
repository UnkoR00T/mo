package dh;

/* JADX INFO: loaded from: classes3.dex */
final class rc extends mc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final mc f42203e = new rc(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f42204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f42205d;

    rc(Object[] objArr, int i15) {
        this.f42204c = objArr;
        this.f42205d = i15;
    }

    @Override // dh.mc, dh.la
    final int e(Object[] objArr, int i15) {
        System.arraycopy(this.f42204c, 0, objArr, 0, this.f42205d);
        return this.f42205d;
    }

    @Override // dh.la
    final int f() {
        return this.f42205d;
    }

    @Override // dh.la
    final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        f4.a(i15, this.f42205d, "index");
        Object obj = this.f42204c[i15];
        obj.getClass();
        return obj;
    }

    @Override // dh.la
    final Object[] h() {
        return this.f42204c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42205d;
    }
}
