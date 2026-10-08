package u;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b extends y.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Size f193333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f193334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<Integer> f193335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f193336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o.a1 f193337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l0 f193338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g0.u<x0> f193339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final g0.u<d1.a> f193340m;

    b(Size size, int i15, List<Integer> list, boolean z15, o.a1 a1Var, l0 l0Var, g0.u<x0> uVar, g0.u<d1.a> uVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f193333f = size;
        this.f193334g = i15;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f193335h = list;
        this.f193336i = z15;
        this.f193337j = a1Var;
        this.f193338k = l0Var;
        if (uVar == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f193339l = uVar;
        if (uVar2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f193340m = uVar2;
    }

    @Override // u.y.c
    g0.u<d1.a> b() {
        return this.f193340m;
    }

    @Override // u.y.c
    o.a1 c() {
        return this.f193337j;
    }

    @Override // u.y.c
    int d() {
        return this.f193334g;
    }

    @Override // u.y.c
    List<Integer> e() {
        return this.f193335h;
    }

    public boolean equals(Object obj) {
        o.a1 a1Var;
        l0 l0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof y.c) {
            y.c cVar = (y.c) obj;
            if (this.f193333f.equals(cVar.k()) && this.f193334g == cVar.d() && this.f193335h.equals(cVar.e()) && this.f193336i == cVar.m() && ((a1Var = this.f193337j) != null ? a1Var.equals(cVar.c()) : cVar.c() == null) && ((l0Var = this.f193338k) != null ? l0Var.equals(cVar.f()) : cVar.f() == null) && this.f193339l.equals(cVar.h()) && this.f193340m.equals(cVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // u.y.c
    l0 f() {
        return this.f193338k;
    }

    @Override // u.y.c
    g0.u<x0> h() {
        return this.f193339l;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f193333f.hashCode() ^ 1000003) * 1000003) ^ this.f193334g) * 1000003) ^ this.f193335h.hashCode()) * 1000003) ^ (this.f193336i ? 1231 : 1237)) * 1000003;
        o.a1 a1Var = this.f193337j;
        int iHashCode2 = (iHashCode ^ (a1Var == null ? 0 : a1Var.hashCode())) * 1000003;
        l0 l0Var = this.f193338k;
        return ((((iHashCode2 ^ (l0Var != null ? l0Var.hashCode() : 0)) * 1000003) ^ this.f193339l.hashCode()) * 1000003) ^ this.f193340m.hashCode();
    }

    @Override // u.y.c
    Size k() {
        return this.f193333f;
    }

    @Override // u.y.c
    boolean m() {
        return this.f193336i;
    }

    public String toString() {
        return "In{size=" + this.f193333f + ", inputFormat=" + this.f193334g + ", outputFormats=" + this.f193335h + ", virtualCamera=" + this.f193336i + ", imageReaderProxyProvider=" + this.f193337j + ", postviewSettings=" + this.f193338k + ", requestEdge=" + this.f193339l + ", errorEdge=" + this.f193340m + "}";
    }
}
