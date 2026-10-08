package u;

/* JADX INFO: loaded from: classes.dex */
final class c extends z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.o f193353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f193354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o.t0.h f193355c;

    c(androidx.camera.core.o oVar, int i15, o.t0.h hVar) {
        if (oVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f193353a = oVar;
        this.f193354b = i15;
        if (hVar == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.f193355c = hVar;
    }

    @Override // u.z.a
    androidx.camera.core.o a() {
        return this.f193353a;
    }

    @Override // u.z.a
    o.t0.h b() {
        return this.f193355c;
    }

    @Override // u.z.a
    int c() {
        return this.f193354b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z.a) {
            z.a aVar = (z.a) obj;
            if (this.f193353a.equals(aVar.a()) && this.f193354b == aVar.c() && this.f193355c.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f193353a.hashCode() ^ 1000003) * 1000003) ^ this.f193354b) * 1000003) ^ this.f193355c.hashCode();
    }

    public String toString() {
        return "In{imageProxy=" + this.f193353a + ", rotationDegrees=" + this.f193354b + ", outputFileOptions=" + this.f193355c + "}";
    }
}
