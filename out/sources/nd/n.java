package nd;

import android.graphics.PointF;
import fd.a0;
import id.s;

/* JADX INFO: loaded from: classes3.dex */
public class n implements od.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f134254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o<PointF, PointF> f134255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f134256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f134257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f134258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f134259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f134260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f134261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f134262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f134263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b f134264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f134265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f134266m;

    public n() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // od.c
    public hd.c a(a0 a0Var, fd.f fVar, pd.b bVar) {
        return null;
    }

    public s b() {
        return new s(this);
    }

    public e c() {
        return this.f134254a;
    }

    public b d() {
        return this.f134265l;
    }

    public d e() {
        return this.f134258e;
    }

    public o<PointF, PointF> f() {
        return this.f134255b;
    }

    public b g() {
        return this.f134257d;
    }

    public b h() {
        return this.f134261h;
    }

    public b i() {
        return this.f134262i;
    }

    public b j() {
        return this.f134263j;
    }

    public g k() {
        return this.f134256c;
    }

    public b l() {
        return this.f134259f;
    }

    public b m() {
        return this.f134260g;
    }

    public b n() {
        return this.f134264k;
    }

    public boolean o() {
        return this.f134266m;
    }

    public void p(boolean z15) {
        this.f134266m = z15;
    }

    public n(e eVar, o<PointF, PointF> oVar, g gVar, b bVar, d dVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, b bVar7, b bVar8) {
        this.f134266m = false;
        this.f134254a = eVar;
        this.f134255b = oVar;
        this.f134256c = gVar;
        this.f134257d = bVar;
        this.f134258e = dVar;
        this.f134264k = bVar2;
        this.f134265l = bVar3;
        this.f134259f = bVar4;
        this.f134260g = bVar5;
        this.f134261h = bVar6;
        this.f134262i = bVar7;
        this.f134263j = bVar8;
    }
}
