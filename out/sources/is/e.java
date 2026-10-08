package is;

import es.j;
import es.q;
import es.s;
import es.u;
import es.v;
import es.w;
import es.x;
import es.z;
import gs.i;
import gs.k;
import gs.l;
import gs.n;
import java.util.Iterator;
import java.util.List;
import us.o;
import us.r;
import us.t;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements n {
    @Override // gs.n
    public i a() {
        return null;
    }

    @Override // gs.n
    public void b(j jVar, us.e eVar, fs.e eVar2) {
        b bVarB = c.b(jVar);
        List<us.b> listT = eVar.T();
        List<es.e> listA = jVar.a();
        Iterator<T> it = listT.iterator();
        while (it.hasNext()) {
            listA.add(fs.f.b((us.b) it.next(), eVar2.e()));
        }
        ys.d.b bVarB2 = ys.h.f229107a.b(eVar, eVar2.e(), eVar2.g());
        bVarB.a(bVarB2 != null ? hs.c.b(bVarB2) : null);
    }

    @Override // gs.n
    public gs.d c() {
        return null;
    }

    @Override // gs.n
    public void d(v vVar, r rVar, fs.e eVar) {
        g gVarE = c.e(vVar);
        gVarE.b(((Boolean) rVar.w(xs.a.f220669g)).booleanValue());
        Iterator it = ((List) rVar.w(xs.a.f220668f)).iterator();
        while (it.hasNext()) {
            gVarE.a().add(fs.f.b((us.b) it.next(), eVar.e()));
        }
    }

    @Override // gs.n
    public void e(es.g gVar, us.c cVar, fs.e eVar) {
        String strB;
        a aVarA = c.a(gVar);
        List<us.b> listX0 = cVar.x0();
        List<es.e> listD = gVar.d();
        Iterator<T> it = listX0.iterator();
        while (it.hasNext()) {
            listD.add(fs.f.b((us.b) it.next(), eVar.e()));
        }
        Integer num = (Integer) ws.f.a(cVar, xs.a.f220673k);
        if (num != null) {
            aVarA.c(eVar.b(num.intValue()));
        }
        Iterator it4 = ((List) cVar.w(xs.a.f220672j)).iterator();
        while (it4.hasNext()) {
            aVarA.b().add(fs.g.q((o) it4.next(), eVar));
        }
        Integer num2 = (Integer) ws.f.a(cVar, xs.a.f220671i);
        if (num2 == null || (strB = eVar.b(num2.intValue())) == null) {
            strB = "main";
        }
        aVarA.e(strB);
        Integer num3 = (Integer) ws.f.a(cVar, xs.a.f220674l);
        if (num3 != null) {
            aVarA.d(num3.intValue());
        }
    }

    @Override // gs.n
    public gs.b f() {
        return new a();
    }

    @Override // gs.n
    public void g(x xVar, t tVar, fs.e eVar) {
        h hVarF = c.f(xVar);
        Iterator it = ((List) tVar.w(xs.a.f220670h)).iterator();
        while (it.hasNext()) {
            hVarF.a().add(fs.f.b((us.b) it.next(), eVar.e()));
        }
    }

    @Override // gs.n
    public gs.c h() {
        return new b();
    }

    @Override // gs.n
    public void i(q qVar, us.h hVar, fs.e eVar) {
        Iterator<us.b> it = hVar.L().iterator();
        while (it.hasNext()) {
            qVar.a().add(fs.f.b(it.next(), eVar.e()));
        }
    }

    @Override // gs.n
    public void j(s sVar, us.j jVar, fs.e eVar) {
        d dVarC = c.c(sVar);
        List<us.b> listM0 = jVar.m0();
        List<es.e> listA = sVar.a();
        Iterator<T> it = listM0.iterator();
        while (it.hasNext()) {
            listA.add(fs.f.b((us.b) it.next(), eVar.e()));
        }
        List<us.b> listB0 = jVar.B0();
        List<es.e> listC = sVar.c();
        Iterator<T> it4 = listB0.iterator();
        while (it4.hasNext()) {
            listC.add(fs.f.b((us.b) it4.next(), eVar.e()));
        }
        ys.d.b bVarE = ys.h.f229107a.e(jVar, eVar.e(), eVar.g());
        dVarC.b(bVarE != null ? hs.c.b(bVarE) : null);
        Integer num = (Integer) ws.f.a(jVar, xs.a.f220665c);
        if (num != null) {
            dVarC.a(eVar.b(num.intValue()));
        }
    }

    @Override // gs.n
    public gs.h k() {
        return new f();
    }

    @Override // gs.n
    public void l(es.t tVar, o oVar, fs.e eVar) {
        f fVarD = c.d(tVar);
        List<us.b> listT0 = oVar.t0();
        List<es.e> listA = tVar.a();
        Iterator<T> it = listT0.iterator();
        while (it.hasNext()) {
            listA.add(fs.f.b((us.b) it.next(), eVar.e()));
        }
        List<us.b> listR0 = oVar.R0();
        List<es.e> listA2 = tVar.h().a();
        Iterator<T> it4 = listR0.iterator();
        while (it4.hasNext()) {
            listA2.add(fs.f.b((us.b) it4.next(), eVar.e()));
        }
        u uVarI = tVar.i();
        if (uVarI != null) {
            List<us.b> listB1 = oVar.b1();
            List<es.e> listA3 = uVarI.a();
            Iterator<T> it5 = listB1.iterator();
            while (it5.hasNext()) {
                listA3.add(fs.f.b((us.b) it5.next(), eVar.e()));
            }
        }
        List<us.b> listN0 = oVar.N0();
        List<es.e> listE = tVar.e();
        Iterator<T> it6 = listN0.iterator();
        while (it6.hasNext()) {
            listE.add(fs.f.b((us.b) it6.next(), eVar.e()));
        }
        List<us.b> listW0 = oVar.w0();
        List<es.e> listB = tVar.b();
        Iterator<T> it7 = listW0.iterator();
        while (it7.hasNext()) {
            listB.add(fs.f.b((us.b) it7.next(), eVar.e()));
        }
        List<us.b> listK0 = oVar.K0();
        List<es.e> listD = tVar.d();
        Iterator<T> it8 = listK0.iterator();
        while (it8.hasNext()) {
            listD.add(fs.f.b((us.b) it8.next(), eVar.e()));
        }
        ys.d.a aVarD = ys.h.d(ys.h.f229107a, oVar, eVar.e(), eVar.g(), false, 8, null);
        xs.a.d dVar = (xs.a.d) ws.f.a(oVar, xs.a.f220666d);
        xs.a.c cVarF = (dVar == null || !dVar.K()) ? null : dVar.F();
        xs.a.c cVarG = (dVar == null || !dVar.L()) ? null : dVar.G();
        fVarD.c(((Number) oVar.w(xs.a.f220667e)).intValue());
        fVarD.a(aVarD != null ? hs.c.a(aVarD) : null);
        fVarD.b(cVarF != null ? new hs.d(eVar.b(cVarF.B()), eVar.b(cVarF.A())) : null);
        fVarD.d(cVarG != null ? new hs.d(eVar.b(cVarG.B()), eVar.b(cVarG.A())) : null);
        xs.a.c cVarH = (dVar == null || !dVar.M()) ? null : dVar.H();
        fVarD.e(cVarH != null ? new hs.d(eVar.b(cVarH.B()), eVar.b(cVarH.A())) : null);
        xs.a.c cVarD = (dVar == null || !dVar.I()) ? null : dVar.D();
        fVarD.f(cVarD != null ? new hs.d(eVar.b(cVarD.B()), eVar.b(cVarD.A())) : null);
    }

    @Override // gs.n
    public gs.j m() {
        return new g();
    }

    @Override // gs.n
    public void n(z zVar, us.v vVar, fs.e eVar) {
        List<us.b> listT = vVar.T();
        List<es.e> listA = zVar.a();
        Iterator<T> it = listT.iterator();
        while (it.hasNext()) {
            listA.add(fs.f.b((us.b) it.next(), eVar.e()));
        }
    }

    @Override // gs.n
    public gs.g o() {
        return new d();
    }

    @Override // gs.n
    public k p() {
        return new h();
    }

    @Override // gs.n
    public l q() {
        return null;
    }

    @Override // gs.n
    public void r(w wVar, us.s sVar, fs.e eVar) {
    }
}
