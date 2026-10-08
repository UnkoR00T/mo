package androidx.p016lifecycle;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
class f0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c.a f12736b;

    f0(Object obj) {
        this.f12735a = obj;
        this.f12736b = c.f12723c.c(obj.getClass());
    }

    @Override // androidx.p016lifecycle.n
    public void m(q qVar, j.a aVar) {
        this.f12736b.a(qVar, aVar, this.f12735a);
    }
}
