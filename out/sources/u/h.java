package u;

/* JADX INFO: loaded from: classes.dex */
final class h extends w0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x0 f193378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.o f193379b;

    h(x0 x0Var, androidx.camera.core.o oVar) {
        if (x0Var == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f193378a = x0Var;
        if (oVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f193379b = oVar;
    }

    @Override // u.w0.b
    androidx.camera.core.o a() {
        return this.f193379b;
    }

    @Override // u.w0.b
    x0 b() {
        return this.f193378a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0.b) {
            w0.b bVar = (w0.b) obj;
            if (this.f193378a.equals(bVar.b()) && this.f193379b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f193378a.hashCode() ^ 1000003) * 1000003) ^ this.f193379b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f193378a + ", imageProxy=" + this.f193379b + "}";
    }
}
