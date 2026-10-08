package v;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SurfaceConfig f202590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f202591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f202592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o.i0 f202593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<x3.b> f202594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p1 f202595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f202596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Range<Integer> f202597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f202598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f202599j;

    h(SurfaceConfig surfaceConfig, int i15, Size size, o.i0 i0Var, List<x3.b> list, p1 p1Var, int i16, Range<Integer> range, boolean z15, int i17) {
        if (surfaceConfig == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f202590a = surfaceConfig;
        this.f202591b = i15;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f202592c = size;
        if (i0Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f202593d = i0Var;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f202594e = list;
        this.f202595f = p1Var;
        this.f202596g = i16;
        if (range == null) {
            throw new NullPointerException("Null targetFrameRate");
        }
        this.f202597h = range;
        this.f202598i = z15;
        this.f202599j = i17;
    }

    @Override // v.g
    public List<x3.b> b() {
        return this.f202594e;
    }

    @Override // v.g
    public int c() {
        return this.f202599j;
    }

    @Override // v.g
    public o.i0 d() {
        return this.f202593d;
    }

    @Override // v.g
    public int e() {
        return this.f202591b;
    }

    public boolean equals(Object obj) {
        p1 p1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f202590a.equals(gVar.i()) && this.f202591b == gVar.e() && this.f202592c.equals(gVar.h()) && this.f202593d.equals(gVar.d()) && this.f202594e.equals(gVar.b()) && ((p1Var = this.f202595f) != null ? p1Var.equals(gVar.f()) : gVar.f() == null) && this.f202596g == gVar.g() && this.f202597h.equals(gVar.j()) && this.f202598i == gVar.k() && this.f202599j == gVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // v.g
    public p1 f() {
        return this.f202595f;
    }

    @Override // v.g
    public int g() {
        return this.f202596g;
    }

    @Override // v.g
    public Size h() {
        return this.f202592c;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f202590a.hashCode() ^ 1000003) * 1000003) ^ this.f202591b) * 1000003) ^ this.f202592c.hashCode()) * 1000003) ^ this.f202593d.hashCode()) * 1000003) ^ this.f202594e.hashCode()) * 1000003;
        p1 p1Var = this.f202595f;
        return ((((((((iHashCode ^ (p1Var == null ? 0 : p1Var.hashCode())) * 1000003) ^ this.f202596g) * 1000003) ^ this.f202597h.hashCode()) * 1000003) ^ (this.f202598i ? 1231 : 1237)) * 1000003) ^ this.f202599j;
    }

    @Override // v.g
    public SurfaceConfig i() {
        return this.f202590a;
    }

    @Override // v.g
    public Range<Integer> j() {
        return this.f202597h;
    }

    @Override // v.g
    public boolean k() {
        return this.f202598i;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f202590a + ", imageFormat=" + this.f202591b + ", size=" + this.f202592c + ", dynamicRange=" + this.f202593d + ", captureTypes=" + this.f202594e + ", implementationOptions=" + this.f202595f + ", sessionType=" + this.f202596g + ", targetFrameRate=" + this.f202597h + ", strictFrameRateRequired=" + this.f202598i + ", customMaxFrameRate=" + this.f202599j + "}";
    }
}
