package u;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
final class a extends k.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0.b0<Bitmap> f193322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f193323b;

    a(g0.b0<Bitmap> b0Var, int i15) {
        if (b0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.f193322a = b0Var;
        this.f193323b = i15;
    }

    @Override // u.k.b
    int a() {
        return this.f193323b;
    }

    @Override // u.k.b
    g0.b0<Bitmap> b() {
        return this.f193322a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k.b) {
            k.b bVar = (k.b) obj;
            if (this.f193322a.equals(bVar.b()) && this.f193323b == bVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f193322a.hashCode() ^ 1000003) * 1000003) ^ this.f193323b;
    }

    public String toString() {
        return "In{packet=" + this.f193322a + ", jpegQuality=" + this.f193323b + "}";
    }
}
