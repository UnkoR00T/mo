package g0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class c extends v0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f69027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<i0.f> f69028b;

    c(n0 n0Var, List<i0.f> list) {
        if (n0Var == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f69027a = n0Var;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f69028b = list;
    }

    @Override // g0.v0.b
    public List<i0.f> a() {
        return this.f69028b;
    }

    @Override // g0.v0.b
    public n0 b() {
        return this.f69027a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0.b) {
            v0.b bVar = (v0.b) obj;
            if (this.f69027a.equals(bVar.b()) && this.f69028b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f69027a.hashCode() ^ 1000003) * 1000003) ^ this.f69028b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f69027a + ", outConfigs=" + this.f69028b + "}";
    }
}
