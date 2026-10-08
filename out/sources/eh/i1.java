package eh;

/* JADX INFO: loaded from: classes3.dex */
final class i1 extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient Object[] f50652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f50653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f50654e;

    i1(Object[] objArr, int i15, int i16) {
        this.f50652c = objArr;
        this.f50653d = i15;
        this.f50654e = i16;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        c.a(i15, this.f50654e, "index");
        Object obj = this.f50652c[i15 + i15 + this.f50653d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50654e;
    }
}
