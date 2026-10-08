package g0;

/* JADX INFO: loaded from: classes.dex */
final class a extends t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f69017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.concurrent.futures.c.a<Void> f69018c;

    a(int i15, int i16, androidx.concurrent.futures.c.a<Void> aVar) {
        this.f69016a = i15;
        this.f69017b = i16;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f69018c = aVar;
    }

    @Override // g0.t.b
    androidx.concurrent.futures.c.a<Void> a() {
        return this.f69018c;
    }

    @Override // g0.t.b
    int b() {
        return this.f69016a;
    }

    @Override // g0.t.b
    int c() {
        return this.f69017b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t.b) {
            t.b bVar = (t.b) obj;
            if (this.f69016a == bVar.b() && this.f69017b == bVar.c() && this.f69018c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f69016a ^ 1000003) * 1000003) ^ this.f69017b) * 1000003) ^ this.f69018c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f69016a + ", rotationDegrees=" + this.f69017b + ", completer=" + this.f69018c + "}";
    }
}
