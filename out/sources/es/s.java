package es;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53187b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v f53189d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v f53194i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private k f53196k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<gs.g> f53198m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<x> f53188c = new ArrayList(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<e> f53190e = new ArrayList(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<v> f53191f = new ArrayList(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<z> f53192g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<z> f53193h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<c0> f53195j = new ArrayList(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<e> f53197l = new ArrayList(0);

    public s(int i15, String str) {
        this.f53186a = i15;
        this.f53187b = str;
        List<gs.n> listC = gs.n.f76602a.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((gs.n) it.next()).o());
        }
        this.f53198m = arrayList;
    }

    public final List<e> a() {
        return this.f53197l;
    }

    public final List<z> b() {
        return this.f53193h;
    }

    public final List<e> c() {
        return this.f53190e;
    }

    public final List<gs.g> d() {
        return this.f53198m;
    }

    public final int e() {
        return this.f53186a;
    }

    public final List<x> f() {
        return this.f53188c;
    }

    public final List<z> g() {
        return this.f53192g;
    }

    public final List<c0> h() {
        return this.f53195j;
    }

    public final void i(k kVar) {
        this.f53196k = kVar;
    }

    public final void j(int i15) {
        this.f53186a = i15;
    }

    public final void k(v vVar) {
        this.f53189d = vVar;
    }

    public final void l(v vVar) {
        this.f53194i = vVar;
    }
}
