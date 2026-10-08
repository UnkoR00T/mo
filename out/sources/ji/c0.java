package ji;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class c0 extends g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f103172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ii.c0 f103173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ii.d0 f103174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LatLng f103175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f103176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ii.i f103177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f103178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f103179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f103180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f103181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private vh.a f103182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f103183l;

    c0() {
    }

    @Override // ji.g.a
    public final List<String> b() {
        List<String> list = this.f103176e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"countries\" has not been set");
    }

    @Override // ji.g.a
    public final List<String> c() {
        List<String> list = this.f103178g;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"typesFilter\" has not been set");
    }

    @Override // ji.g.a
    public final g.a d(vh.a aVar) {
        this.f103182k = aVar;
        return this;
    }

    @Override // ji.g.a
    public final g.a e(List<String> list) {
        if (list == null) {
            throw new NullPointerException("Null countries");
        }
        this.f103176e = list;
        return this;
    }

    @Override // ji.g.a
    public final g.a f(Integer num) {
        this.f103179h = num;
        return this;
    }

    @Override // ji.g.a
    public final g.a g(ii.c0 c0Var) {
        this.f103173b = c0Var;
        return this;
    }

    @Override // ji.g.a
    public final g.a h(ii.d0 d0Var) {
        this.f103174c = d0Var;
        return this;
    }

    @Override // ji.g.a
    public final g.a i(LatLng latLng) {
        this.f103175d = latLng;
        return this;
    }

    @Override // ji.g.a
    public final g.a j(boolean z15) {
        this.f103181j = z15;
        this.f103183l = (byte) 1;
        return this;
    }

    @Override // ji.g.a
    public final g.a k(String str) {
        this.f103172a = str;
        return this;
    }

    @Override // ji.g.a
    public final g.a l(String str) {
        this.f103180i = str;
        return this;
    }

    @Override // ji.g.a
    public final g.a m(ii.i iVar) {
        this.f103177f = iVar;
        return this;
    }

    @Override // ji.g.a
    public final g.a n(List<String> list) {
        if (list == null) {
            throw new NullPointerException("Null typesFilter");
        }
        this.f103178g = list;
        return this;
    }

    @Override // ji.g.a
    final g o() {
        List list;
        List list2;
        if (this.f103183l == 1 && (list = this.f103176e) != null && (list2 = this.f103178g) != null) {
            return new d0(this.f103172a, this.f103173b, this.f103174c, this.f103175d, list, this.f103177f, list2, this.f103179h, this.f103180i, this.f103181j, this.f103182k, null);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f103176e == null) {
            sb5.append(" countries");
        }
        if (this.f103178g == null) {
            sb5.append(" typesFilter");
        }
        if (this.f103183l == 0) {
            sb5.append(" pureServiceAreaBusinessesIncluded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }
}
