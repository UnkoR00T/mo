package u;

/* JADX INFO: loaded from: classes.dex */
final class i extends d1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f193388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.v0 f193389b;

    i(int i15, o.v0 v0Var) {
        this.f193388a = i15;
        if (v0Var == null) {
            throw new NullPointerException("Null imageCaptureException");
        }
        this.f193389b = v0Var;
    }

    @Override // u.d1.a
    o.v0 a() {
        return this.f193389b;
    }

    @Override // u.d1.a
    int b() {
        return this.f193388a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d1.a) {
            d1.a aVar = (d1.a) obj;
            if (this.f193388a == aVar.b() && this.f193389b.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f193388a ^ 1000003) * 1000003) ^ this.f193389b.hashCode();
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f193388a + ", imageCaptureException=" + this.f193389b + "}";
    }
}
