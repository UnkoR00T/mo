package u;

import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
final class f extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Size f193369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f193370b;

    f(Size size, int i15) {
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        this.f193369a = size;
        this.f193370b = i15;
    }

    @Override // u.l0
    public int b() {
        return this.f193370b;
    }

    @Override // u.l0
    public Size c() {
        return this.f193369a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            if (this.f193369a.equals(l0Var.c()) && this.f193370b == l0Var.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f193369a.hashCode() ^ 1000003) * 1000003) ^ this.f193370b;
    }

    public String toString() {
        return "PostviewSettings{resolution=" + this.f193369a + ", inputFormat=" + this.f193370b + "}";
    }
}
