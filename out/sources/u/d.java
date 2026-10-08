package u;

/* JADX INFO: loaded from: classes.dex */
final class d extends c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0.b0<androidx.camera.core.o> f193357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f193358b;

    d(g0.b0<androidx.camera.core.o> b0Var, int i15) {
        if (b0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.f193357a = b0Var;
        this.f193358b = i15;
    }

    @Override // u.c0.a
    int a() {
        return this.f193358b;
    }

    @Override // u.c0.a
    g0.b0<androidx.camera.core.o> b() {
        return this.f193357a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.a) {
            c0.a aVar = (c0.a) obj;
            if (this.f193357a.equals(aVar.b()) && this.f193358b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f193357a.hashCode() ^ 1000003) * 1000003) ^ this.f193358b;
    }

    public String toString() {
        return "In{packet=" + this.f193357a + ", jpegQuality=" + this.f193358b + "}";
    }
}
