package em;

import android.view.View;
import lh.c;
import nh.h;
import nh.i;

/* JADX INFO: loaded from: classes4.dex */
public class b extends em.a<h, a> implements c.j, c.p, c.q, c.b, c.l {

    public class a extends em.a.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c.j f51921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c.l f51922d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c.p f51923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c.q f51924f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c.b f51925g;

        public a() {
            super();
        }

        public h i(i iVar) {
            h hVarA = b.this.f51915a.a(iVar);
            super.a(hVarA);
            return hVarA;
        }

        public void j(c.j jVar) {
            this.f51921c = jVar;
        }

        public void k(c.l lVar) {
            this.f51922d = lVar;
        }

        public void l(c.p pVar) {
            this.f51923e = pVar;
        }
    }

    public b(c cVar) {
        super(cVar);
    }

    @Override // lh.c.q
    public void a(h hVar) {
        a aVar = (a) this.f51917c.get(hVar);
        if (aVar == null || aVar.f51924f == null) {
            return;
        }
        aVar.f51924f.a(hVar);
    }

    @Override // lh.c.b
    public View b(h hVar) {
        a aVar = (a) this.f51917c.get(hVar);
        if (aVar == null || aVar.f51925g == null) {
            return null;
        }
        return aVar.f51925g.b(hVar);
    }

    @Override // lh.c.q
    public void c(h hVar) {
        a aVar = (a) this.f51917c.get(hVar);
        if (aVar == null || aVar.f51924f == null) {
            return;
        }
        aVar.f51924f.c(hVar);
    }

    @Override // lh.c.p
    public boolean d(h hVar) {
        a aVar = (a) this.f51917c.get(hVar);
        if (aVar == null || aVar.f51923e == null) {
            return false;
        }
        return aVar.f51923e.d(hVar);
    }

    @Override // lh.c.b
    public View e(h hVar) {
        a aVar = (a) this.f51917c.get(hVar);
        if (aVar == null || aVar.f51925g == null) {
            return null;
        }
        return aVar.f51925g.e(hVar);
    }

    @Override // lh.c.j
    public void f(h hVar) {
        a aVar = (a) this.f51917c.get(hVar);
        if (aVar == null || aVar.f51921c == null) {
            return;
        }
        aVar.f51921c.f(hVar);
    }

    @Override // lh.c.l
    public void g(h hVar) {
        a aVar = (a) this.f51917c.get(hVar);
        if (aVar == null || aVar.f51922d == null) {
            return;
        }
        aVar.f51922d.g(hVar);
    }

    @Override // lh.c.q
    public void h(h hVar) {
        a aVar = (a) this.f51917c.get(hVar);
        if (aVar == null || aVar.f51924f == null) {
            return;
        }
        aVar.f51924f.h(hVar);
    }

    @Override // em.a
    public /* bridge */ /* synthetic */ boolean i(h hVar) {
        return super.i(hVar);
    }

    @Override // em.a
    void k() {
        c cVar = this.f51915a;
        if (cVar != null) {
            cVar.C(this);
            this.f51915a.E(this);
            this.f51915a.I(this);
            this.f51915a.J(this);
            this.f51915a.m(this);
        }
    }

    public a l() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // em.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(h hVar) {
        hVar.e();
    }
}
