package gn;

/* JADX INFO: loaded from: classes4.dex */
abstract class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final g f74998b = new e(null, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f74999a;

    g(g gVar) {
        this.f74999a = gVar;
    }

    final g a(int i15, int i16) {
        return new e(this, i15, i16);
    }

    final g b(int i15, int i16) {
        return new b(this, i15, i16);
    }

    abstract void c(hn.a aVar, byte[] bArr);

    final g d() {
        return this.f74999a;
    }
}
