package v;

import android.util.Size;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class r extends r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Size f202823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, Size> f202824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f202825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Integer, Size> f202826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Size f202827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Integer, Size> f202828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Integer, Size> f202829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<Integer, Size> f202830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<Integer, Size> f202831i;

    r(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4, Map<Integer, Size> map5, Map<Integer, Size> map6) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f202823a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f202824b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f202825c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f202826d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f202827e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f202828f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null maximum4x3SizeMap");
        }
        this.f202829g = map4;
        if (map5 == null) {
            throw new NullPointerException("Null maximum16x9SizeMap");
        }
        this.f202830h = map5;
        if (map6 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f202831i = map6;
    }

    @Override // v.r3
    public Size b() {
        return this.f202823a;
    }

    @Override // v.r3
    public Map<Integer, Size> d() {
        return this.f202830h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r3) {
            r3 r3Var = (r3) obj;
            if (this.f202823a.equals(r3Var.b()) && this.f202824b.equals(r3Var.n()) && this.f202825c.equals(r3Var.i()) && this.f202826d.equals(r3Var.l()) && this.f202827e.equals(r3Var.j()) && this.f202828f.equals(r3Var.h()) && this.f202829g.equals(r3Var.f()) && this.f202830h.equals(r3Var.d()) && this.f202831i.equals(r3Var.p())) {
                return true;
            }
        }
        return false;
    }

    @Override // v.r3
    public Map<Integer, Size> f() {
        return this.f202829g;
    }

    @Override // v.r3
    public Map<Integer, Size> h() {
        return this.f202828f;
    }

    public int hashCode() {
        return ((((((((((((((((this.f202823a.hashCode() ^ 1000003) * 1000003) ^ this.f202824b.hashCode()) * 1000003) ^ this.f202825c.hashCode()) * 1000003) ^ this.f202826d.hashCode()) * 1000003) ^ this.f202827e.hashCode()) * 1000003) ^ this.f202828f.hashCode()) * 1000003) ^ this.f202829g.hashCode()) * 1000003) ^ this.f202830h.hashCode()) * 1000003) ^ this.f202831i.hashCode();
    }

    @Override // v.r3
    public Size i() {
        return this.f202825c;
    }

    @Override // v.r3
    public Size j() {
        return this.f202827e;
    }

    @Override // v.r3
    public Map<Integer, Size> l() {
        return this.f202826d;
    }

    @Override // v.r3
    public Map<Integer, Size> n() {
        return this.f202824b;
    }

    @Override // v.r3
    public Map<Integer, Size> p() {
        return this.f202831i;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f202823a + ", s720pSizeMap=" + this.f202824b + ", previewSize=" + this.f202825c + ", s1440pSizeMap=" + this.f202826d + ", recordSize=" + this.f202827e + ", maximumSizeMap=" + this.f202828f + ", maximum4x3SizeMap=" + this.f202829g + ", maximum16x9SizeMap=" + this.f202830h + ", ultraMaximumSizeMap=" + this.f202831i + "}";
    }
}
