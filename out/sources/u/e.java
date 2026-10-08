package u;

/* JADX INFO: loaded from: classes.dex */
final class e extends g0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0.b0<byte[]> f193359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.t0.h f193360b;

    e(g0.b0<byte[]> b0Var, o.t0.h hVar) {
        if (b0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.f193359a = b0Var;
        if (hVar == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.f193360b = hVar;
    }

    @Override // u.g0.a
    o.t0.h a() {
        return this.f193360b;
    }

    @Override // u.g0.a
    g0.b0<byte[]> b() {
        return this.f193359a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.a) {
            g0.a aVar = (g0.a) obj;
            if (this.f193359a.equals(aVar.b()) && this.f193360b.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f193359a.hashCode() ^ 1000003) * 1000003) ^ this.f193360b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f193359a + ", outputFileOptions=" + this.f193360b + "}";
    }
}
