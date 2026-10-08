package es;

import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f53199s = {q0.f(new fr.b0(t.class, "_hasSetter", "get_hasSetter()Z", 0)), q0.f(new fr.b0(t.class, "_hasGetter", "get_hasGetter()Z", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fs.a f53202c = fs.c.g(new fs.d(ws.b.C));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fs.a f53203d = fs.c.g(new fs.d(ws.b.B));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f53204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u f53205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<x> f53206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v f53207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<e> f53208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<v> f53209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<z> f53210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private z f53211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v f53212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<c0> f53213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<e> f53214o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<e> f53215p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List<e> f53216q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List<gs.h> f53217r;

    public t(int i15, String str, int i16, int i17) {
        this.f53200a = i15;
        this.f53201b = str;
        u uVar = new u(i16);
        q(true);
        this.f53204e = uVar;
        this.f53205f = l() ? new u(i17) : null;
        this.f53206g = new ArrayList(0);
        this.f53208i = new ArrayList(0);
        this.f53209j = new ArrayList(0);
        this.f53210k = new ArrayList();
        this.f53213n = new ArrayList(0);
        this.f53214o = new ArrayList(0);
        this.f53215p = new ArrayList(0);
        this.f53216q = new ArrayList(0);
        List<gs.n> listC = gs.n.f76602a.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((gs.n) it.next()).k());
        }
        this.f53217r = arrayList;
    }

    private final boolean l() {
        return this.f53202c.a(this, f53199s[0]);
    }

    private final void q(boolean z15) {
        this.f53203d.b(this, f53199s[1], z15);
    }

    public final List<e> a() {
        return this.f53214o;
    }

    public final List<e> b() {
        return this.f53215p;
    }

    public final List<z> c() {
        return this.f53210k;
    }

    public final List<e> d() {
        return this.f53216q;
    }

    public final List<e> e() {
        return this.f53208i;
    }

    public final List<gs.h> f() {
        return this.f53217r;
    }

    public final int g() {
        return this.f53200a;
    }

    public final u h() {
        return this.f53204e;
    }

    public final u i() {
        return this.f53205f;
    }

    public final List<x> j() {
        return this.f53206g;
    }

    public final List<c0> k() {
        return this.f53213n;
    }

    public final void m(int i15) {
        this.f53200a = i15;
    }

    public final void n(v vVar) {
        this.f53207h = vVar;
    }

    public final void o(v vVar) {
        this.f53212m = vVar;
    }

    public final void p(z zVar) {
        this.f53211l = zVar;
    }
}
