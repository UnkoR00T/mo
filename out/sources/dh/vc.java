package dh;

/* JADX INFO: loaded from: classes3.dex */
final class vc extends mc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient Object[] f42378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f42379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f42380e;

    vc(Object[] objArr, int i15, int i16) {
        this.f42378c = objArr;
        this.f42379d = i15;
        this.f42380e = i16;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        f4.a(i15, this.f42380e, "index");
        Object obj = this.f42378c[i15 + i15 + this.f42379d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42380e;
    }
}
