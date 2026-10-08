package es;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f53221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<y> f53222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v f53223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v f53224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f53225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<gs.j> f53226g;

    public v(int i15) {
        this.f53220a = i15;
        this.f53222c = new ArrayList(0);
        List<gs.n> listC = gs.n.f76602a.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((gs.n) it.next()).m());
        }
        this.f53226g = arrayList;
    }

    public final List<y> a() {
        return this.f53222c;
    }

    public final h b() {
        h hVar = this.f53221b;
        if (hVar != null) {
            return hVar;
        }
        return null;
    }

    public final List<gs.j> c() {
        return this.f53226g;
    }

    public final int d() {
        return this.f53220a;
    }

    public final void e(v vVar) {
        this.f53223d = vVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fr.t.c(v.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f53220a == vVar.f53220a && fr.t.c(b(), vVar.b()) && fr.t.c(this.f53222c, vVar.f53222c) && fr.t.c(this.f53224e, vVar.f53224e) && fr.t.c(this.f53223d, vVar.f53223d) && fr.t.c(this.f53225f, vVar.f53225f) && fr.t.c(this.f53226g, vVar.f53226g);
    }

    public final void f(h hVar) {
        this.f53221b = hVar;
    }

    public final void g(int i15) {
        this.f53220a = i15;
    }

    public final void h(r rVar) {
        this.f53225f = rVar;
    }

    public int hashCode() {
        return (((this.f53220a * 31) + b().hashCode()) * 31) + this.f53222c.hashCode();
    }

    public final void i(v vVar) {
        this.f53224e = vVar;
    }

    public v() {
        this(0);
    }
}
