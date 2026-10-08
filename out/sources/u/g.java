package u;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class g extends w0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0.u<w0.b> f193373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0.u<w0.b> f193374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f193375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Integer> f193376d;

    g(g0.u<w0.b> uVar, g0.u<w0.b> uVar2, int i15, List<Integer> list) {
        if (uVar == null) {
            throw new NullPointerException("Null edge");
        }
        this.f193373a = uVar;
        if (uVar2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.f193374b = uVar2;
        this.f193375c = i15;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f193376d = list;
    }

    @Override // u.w0.a
    g0.u<w0.b> a() {
        return this.f193373a;
    }

    @Override // u.w0.a
    int b() {
        return this.f193375c;
    }

    @Override // u.w0.a
    List<Integer> c() {
        return this.f193376d;
    }

    @Override // u.w0.a
    g0.u<w0.b> d() {
        return this.f193374b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0.a) {
            w0.a aVar = (w0.a) obj;
            if (this.f193373a.equals(aVar.a()) && this.f193374b.equals(aVar.d()) && this.f193375c == aVar.b() && this.f193376d.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f193373a.hashCode() ^ 1000003) * 1000003) ^ this.f193374b.hashCode()) * 1000003) ^ this.f193375c) * 1000003) ^ this.f193376d.hashCode();
    }

    public String toString() {
        return "In{edge=" + this.f193373a + ", postviewEdge=" + this.f193374b + ", inputFormat=" + this.f193375c + ", outputFormats=" + this.f193376d + "}";
    }
}
