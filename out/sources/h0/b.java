package h0;

import g0.n0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b extends r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f79132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f79133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<d> f79134c;

    b(n0 n0Var, n0 n0Var2, List<d> list) {
        if (n0Var == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f79132a = n0Var;
        if (n0Var2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f79133b = n0Var2;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f79134c = list;
    }

    @Override // h0.r.b
    public List<d> a() {
        return this.f79134c;
    }

    @Override // h0.r.b
    public n0 b() {
        return this.f79132a;
    }

    @Override // h0.r.b
    public n0 c() {
        return this.f79133b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r.b) {
            r.b bVar = (r.b) obj;
            if (this.f79132a.equals(bVar.b()) && this.f79133b.equals(bVar.c()) && this.f79134c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f79132a.hashCode() ^ 1000003) * 1000003) ^ this.f79133b.hashCode()) * 1000003) ^ this.f79134c.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f79132a + ", secondarySurfaceEdge=" + this.f79133b + ", outConfigs=" + this.f79134c + "}";
    }
}
