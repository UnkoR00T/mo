package es;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f53116b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f53123i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f53128n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private v f53129o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List<gs.b> f53133s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<x> f53117c = new ArrayList(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<v> f53118d = new ArrayList(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<s> f53119e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<t> f53120f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<w> f53121g = new ArrayList(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<j> f53122h = new ArrayList(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<String> f53124j = new ArrayList(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<String> f53125k = new ArrayList(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<q> f53126l = new ArrayList(0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<String> f53127m = new ArrayList(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<e> f53130p = new ArrayList(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List<v> f53131q = new ArrayList(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List<c0> f53132r = new ArrayList(0);

    public g() {
        List<gs.n> listC = gs.n.f76602a.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((gs.n) it.next()).f());
        }
        this.f53133s = arrayList;
    }

    @Override // es.l
    public List<t> a() {
        return this.f53120f;
    }

    @Override // es.l
    public List<w> b() {
        return this.f53121g;
    }

    @Override // es.l
    public List<s> c() {
        return this.f53119e;
    }

    public final List<e> d() {
        return this.f53130p;
    }

    public final List<j> e() {
        return this.f53122h;
    }

    public final List<v> f() {
        return this.f53131q;
    }

    public final List<String> g() {
        return this.f53125k;
    }

    public final List<gs.b> h() {
        return this.f53133s;
    }

    public final int i() {
        return this.f53115a;
    }

    public final v j() {
        return this.f53129o;
    }

    public final List<q> k() {
        return this.f53126l;
    }

    public final String l() {
        String str = this.f53116b;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final List<String> m() {
        return this.f53124j;
    }

    public final List<String> n() {
        return this.f53127m;
    }

    public final List<v> o() {
        return this.f53118d;
    }

    public final List<x> p() {
        return this.f53117c;
    }

    public final List<c0> q() {
        return this.f53132r;
    }

    public final void r(String str) {
        this.f53123i = str;
    }

    public final void s(int i15) {
        this.f53115a = i15;
    }

    public final void t(String str) {
        this.f53128n = str;
    }

    public final void u(v vVar) {
        this.f53129o = vVar;
    }

    public final void v(String str) {
        this.f53116b = str;
    }
}
