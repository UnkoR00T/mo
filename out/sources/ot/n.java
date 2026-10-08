package ot;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import st.s1;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rt.n f149793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vr.i0 f149794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f149795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f149796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e<wr.c, ft.g<?>> f149797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vr.p0 f149798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b0 f149799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f149800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ds.c f149801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final x f149802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Iterable<xr.b> f149803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final vr.n0 f149804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m f149805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final xr.a f149806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final xr.c f149807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final bt.g f149808p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final tt.p f149809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final kt.a f149810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List<s1> f149811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final v f149812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final l f149813u;

    /* JADX WARN: Multi-variable type inference failed */
    public n(rt.n nVar, vr.i0 i0Var, o oVar, j jVar, e<? extends wr.c, ? extends ft.g<?>> eVar, vr.p0 p0Var, b0 b0Var, w wVar, ds.c cVar, x xVar, Iterable<? extends xr.b> iterable, vr.n0 n0Var, m mVar, xr.a aVar, xr.c cVar2, bt.g gVar, tt.p pVar, kt.a aVar2, List<? extends s1> list, v vVar) {
        this.f149793a = nVar;
        this.f149794b = i0Var;
        this.f149795c = oVar;
        this.f149796d = jVar;
        this.f149797e = eVar;
        this.f149798f = p0Var;
        this.f149799g = b0Var;
        this.f149800h = wVar;
        this.f149801i = cVar;
        this.f149802j = xVar;
        this.f149803k = iterable;
        this.f149804l = n0Var;
        this.f149805m = mVar;
        this.f149806n = aVar;
        this.f149807o = cVar2;
        this.f149808p = gVar;
        this.f149809q = pVar;
        this.f149810r = aVar2;
        this.f149811s = list;
        this.f149812t = vVar;
        this.f149813u = new l(this);
    }

    public final p a(vr.o0 o0Var, ws.d dVar, ws.h hVar, ws.j jVar, ws.a aVar, qt.s sVar) {
        return new p(this, dVar, o0Var, hVar, jVar, aVar, sVar, null, pq.v.n());
    }

    public final vr.e b(zs.b bVar) {
        return l.f(this.f149813u, bVar, null, 2, null);
    }

    public final xr.a c() {
        return this.f149806n;
    }

    public final e<wr.c, ft.g<?>> d() {
        return this.f149797e;
    }

    public final j e() {
        return this.f149796d;
    }

    public final l f() {
        return this.f149813u;
    }

    public final o g() {
        return this.f149795c;
    }

    public final m h() {
        return this.f149805m;
    }

    public final v i() {
        return this.f149812t;
    }

    public final w j() {
        return this.f149800h;
    }

    public final bt.g k() {
        return this.f149808p;
    }

    public final Iterable<xr.b> l() {
        return this.f149803k;
    }

    public final x m() {
        return this.f149802j;
    }

    public final tt.p n() {
        return this.f149809q;
    }

    public final b0 o() {
        return this.f149799g;
    }

    public final ds.c p() {
        return this.f149801i;
    }

    public final vr.i0 q() {
        return this.f149794b;
    }

    public final vr.n0 r() {
        return this.f149804l;
    }

    public final vr.p0 s() {
        return this.f149798f;
    }

    public final xr.c t() {
        return this.f149807o;
    }

    public final rt.n u() {
        return this.f149793a;
    }

    public final List<s1> v() {
        return this.f149811s;
    }

    public /* synthetic */ n(rt.n nVar, vr.i0 i0Var, o oVar, j jVar, e eVar, vr.p0 p0Var, b0 b0Var, w wVar, ds.c cVar, x xVar, Iterable iterable, vr.n0 n0Var, m mVar, xr.a aVar, xr.c cVar2, bt.g gVar, tt.p pVar, kt.a aVar2, List list, v vVar, int i15, fr.k kVar) {
        this(nVar, i0Var, oVar, jVar, eVar, p0Var, b0Var, wVar, cVar, xVar, iterable, n0Var, mVar, (i15 & PKIFailureInfo.certRevoked) != 0 ? xr.a.C5895a.f220525a : aVar, (i15 & 16384) != 0 ? xr.c.a.f220526a : cVar2, gVar, (65536 & i15) != 0 ? tt.p.f192137b.a() : pVar, aVar2, (262144 & i15) != 0 ? pq.v.e(st.y.f184168a) : list, (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? v.a.f149866a : vVar);
    }
}
