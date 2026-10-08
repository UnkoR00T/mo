package od;

import fd.a0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f144683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f144684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nd.c f144685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nd.d f144686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nd.f f144687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nd.f f144688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final nd.b f144689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s.b f144690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s.c f144691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f144692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<nd.b> f144693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final nd.b f144694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f144695m;

    public f(String str, g gVar, nd.c cVar, nd.d dVar, nd.f fVar, nd.f fVar2, nd.b bVar, s.b bVar2, s.c cVar2, float f15, List<nd.b> list, nd.b bVar3, boolean z15) {
        this.f144683a = str;
        this.f144684b = gVar;
        this.f144685c = cVar;
        this.f144686d = dVar;
        this.f144687e = fVar;
        this.f144688f = fVar2;
        this.f144689g = bVar;
        this.f144690h = bVar2;
        this.f144691i = cVar2;
        this.f144692j = f15;
        this.f144693k = list;
        this.f144694l = bVar3;
        this.f144695m = z15;
    }

    @Override // od.c
    public hd.c a(a0 a0Var, fd.f fVar, pd.b bVar) {
        return new hd.i(a0Var, bVar, this);
    }

    public s.b b() {
        return this.f144690h;
    }

    public nd.b c() {
        return this.f144694l;
    }

    public nd.f d() {
        return this.f144688f;
    }

    public nd.c e() {
        return this.f144685c;
    }

    public g f() {
        return this.f144684b;
    }

    public s.c g() {
        return this.f144691i;
    }

    public List<nd.b> h() {
        return this.f144693k;
    }

    public float i() {
        return this.f144692j;
    }

    public String j() {
        return this.f144683a;
    }

    public nd.d k() {
        return this.f144686d;
    }

    public nd.f l() {
        return this.f144687e;
    }

    public nd.b m() {
        return this.f144689g;
    }

    public boolean n() {
        return this.f144695m;
    }
}
