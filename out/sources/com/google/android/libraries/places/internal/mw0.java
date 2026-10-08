package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class mw0 implements a41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r41 f32993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l41 f32994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b41 f32995c;

    mw0(r41 r41Var, l41 l41Var, b41 b41Var) {
        this.f32993a = r41Var;
        this.f32994b = l41Var;
        this.f32995c = b41Var;
    }

    static final int p(vh.l lVar) {
        if (lVar.q()) {
            return 2;
        }
        Exception exc = (Exception) zj.p.q(lVar.l());
        int iB = (exc instanceof hg.b ? (hg.b) exc : new hg.b(new Status(13, exc.getMessage()))).b();
        if (iB != 7) {
            return iB != 15 ? 1 : 3;
        }
        return 4;
    }

    private final lk q() {
        Locale localeD = this.f32995c.d();
        Locale locale = Locale.getDefault();
        lk lkVarI = nk.I();
        lkVarI.A(localeD.toLanguageTag());
        if (!localeD.equals(locale)) {
            lkVarI.D(locale.toLanguageTag());
        }
        return lkVarI;
    }

    private final void r(vf vfVar, k41 k41Var) {
        s(vfVar, 2, k41Var, hi.c.f84783a);
    }

    private final void s(vf vfVar, int i15, k41 k41Var, hi.c cVar) {
        si siVarB = t41.b(this.f32994b, i15, k41Var, cVar);
        siVarB.T(16);
        siVarB.I(vfVar);
        siVarB.O(this.f32995c.c());
        this.f32993a.a(siVarB);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void a(ji.r rVar, k41 k41Var) {
        int i15;
        zk zkVarI = bl.I();
        gk gkVarI = hk.I();
        gkVarI.A(qz0.a(rVar.i()));
        zkVarI.I((hk) gkVarI.H0());
        ji.r.b bVarJ = rVar.j();
        if (bVarJ == null) {
            i15 = 1;
        } else {
            i15 = true != bVarJ.equals(ji.r.b.DISTANCE) ? 3 : 2;
        }
        zkVarI.K(i15);
        zkVarI.J(rVar.m());
        List<String> listF = rVar.f();
        if (listF != null) {
            zkVarI.A(listF);
        }
        List<String> listD = rVar.d();
        if (listD != null) {
            zkVarI.D(listD);
        }
        List<String> listE = rVar.e();
        if (listE != null) {
            zkVarI.F(listE);
        }
        List<String> listC = rVar.c();
        if (listC != null) {
            zkVarI.G(listC);
        }
        Integer numH = rVar.h();
        if (numH != null) {
            zkVarI.H(numH.intValue());
        }
        rVar.l();
        lk lkVarQ = q();
        lkVarQ.K(2);
        lkVarQ.I((bl) zkVarI.H0());
        nk nkVar = (nk) lkVarQ.H0();
        si siVarB = t41.b(this.f32994b, 3, k41Var, hi.c.f84783a);
        siVarB.T(1);
        siVarB.D(nkVar);
        siVarB.O(this.f32995c.c());
        this.f32993a.a(siVarB);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void b(vh.l lVar, long j15, long j16, int i15, k41 k41Var, hi.c cVar) {
        int size = lVar.q() ? ((ji.h) lVar.m()).a().size() : 0;
        cf cfVarI = df.I();
        cfVarI.A(size);
        df dfVar = (df) cfVarI.H0();
        qf qfVarI = vf.I();
        qfVarI.I(6);
        qfVarI.G(dfVar);
        qfVarI.J(p(lVar));
        qfVarI.A((int) (j16 - j15));
        s((vf) qfVarI.H0(), i15, k41Var, cVar);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void c(vh.l lVar, long j15, long j16, k41 k41Var) {
        qf qfVarI = vf.I();
        qfVarI.I(15);
        qfVarI.J(p(lVar));
        qfVarI.A((int) (j16 - j15));
        r((vf) qfVarI.H0(), k41Var);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void d(vh.l lVar, long j15, long j16, k41 k41Var) {
        int size = lVar.q() ? ((ji.j) lVar.m()).a().size() : 0;
        ve veVarI = we.I();
        veVarI.A(size);
        we weVar = (we) veVarI.H0();
        qf qfVarI = vf.I();
        qfVarI.I(4);
        qfVarI.F(weVar);
        qfVarI.J(p(lVar));
        qfVarI.A((int) (j16 - j15));
        r((vf) qfVarI.H0(), k41Var);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void e(vh.l lVar, long j15, long j16, int i15, k41 k41Var, hi.c cVar) {
        boolean zQ = lVar.q();
        hf hfVarI = jf.I();
        hfVarI.A(1);
        hfVarI.D(zQ ? 1 : 0);
        jf jfVar = (jf) hfVarI.H0();
        qf qfVarI = vf.I();
        qfVarI.I(8);
        qfVarI.D(jfVar);
        qfVarI.J(p(lVar));
        qfVarI.A((int) (j16 - j15));
        s((vf) qfVarI.H0(), i15, k41Var, cVar);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void f(vh.l lVar, long j15, long j16, k41 k41Var, hi.c cVar) {
        qf qfVarI = vf.I();
        qfVarI.I(15);
        qfVarI.J(p(lVar));
        qfVarI.A((int) (j16 - j15));
        s((vf) qfVarI.H0(), 3, k41Var, cVar);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void g(ji.e eVar, k41 k41Var) {
        ck ckVarI = fk.I();
        ckVarI.A(2);
        fk fkVar = (fk) ckVarI.H0();
        si siVarB = t41.b(this.f32994b, 3, k41Var, hi.c.f84783a);
        siVarB.T(5);
        siVarB.F(fkVar);
        siVarB.O(this.f32995c.c());
        this.f32993a.a(siVarB);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void h(ji.p pVar, vh.l lVar, long j15, long j16, k41 k41Var, hi.c cVar) {
        List<ii.u0> listD;
        int size = lVar.q() ? ((ji.q) lVar.m()).c().size() : 0;
        int size2 = (pVar.r() && lVar.q() && (listD = ((ji.q) lVar.m()).d()) != null) ? listD.size() : 0;
        Integer numG = pVar.g();
        zl zlVarI = am.I();
        zlVarI.A(numG == null ? 0 : numG.intValue());
        zlVarI.D(size);
        zlVarI.F(size2);
        if (lVar.q()) {
            ji.q qVar = (ji.q) lVar.m();
            zlVarI.G(qVar.f() != null);
            zlVarI.H(qVar.g());
        }
        qf qfVarI = vf.I();
        qfVarI.I(10);
        qfVarI.H((am) zlVarI.H0());
        qfVarI.J(p(lVar));
        qfVarI.A((int) (j16 - j15));
        s((vf) qfVarI.H0(), 3, k41Var, cVar);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void i(ji.r rVar, vh.l lVar, long j15, long j16, k41 k41Var, hi.c cVar) {
        List<ii.u0> listC;
        int size = lVar.q() ? ((ji.s) lVar.m()).b().size() : 0;
        int size2 = (rVar.m() && lVar.q() && (listC = ((ji.s) lVar.m()).c()) != null) ? listC.size() : 0;
        Integer numH = rVar.h();
        zl zlVarI = am.I();
        zlVarI.A(numH != null ? numH.intValue() : 0);
        zlVarI.D(size);
        zlVarI.F(size2);
        am amVar = (am) zlVarI.H0();
        qf qfVarI = vf.I();
        qfVarI.I(10);
        qfVarI.H(amVar);
        qfVarI.J(p(lVar));
        qfVarI.A((int) (j16 - j15));
        s((vf) qfVarI.H0(), 3, k41Var, cVar);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void j(ji.i iVar, vh.l lVar, long j15, long j16, k41 k41Var) {
        int i15 = true == lVar.q() ? 2 : 1;
        lj ljVarI = nj.I();
        gk gkVarI = hk.I();
        gkVarI.A(h31.a(iVar.c()));
        ljVarI.D((hk) gkVarI.H0());
        ljVarI.A((int) (j16 - j15));
        ljVarI.F(i15);
        nj njVar = (nj) ljVarI.H0();
        si siVarB = t41.b(this.f32994b, 2, k41Var, hi.c.f84783a);
        siVarB.T(6);
        siVarB.G(njVar);
        siVarB.O(this.f32995c.c());
        this.f32993a.a(siVarB);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void k(ji.a aVar, k41 k41Var) {
        ck ckVarI = fk.I();
        ckVarI.A(2);
        fk fkVar = (fk) ckVarI.H0();
        si siVarB = t41.b(this.f32994b, 2, k41Var, hi.c.f84783a);
        siVarB.T(5);
        siVarB.F(fkVar);
        siVarB.O(this.f32995c.c());
        this.f32993a.a(siVarB);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void l(ji.p pVar, k41 k41Var) {
        uk ukVarI = yk.I();
        ukVarI.D(pVar.p());
        gk gkVarI = hk.I();
        gkVarI.A(qz0.a(pVar.i()));
        ukVarI.J((hk) gkVarI.H0());
        ji.p.b bVarK = pVar.k();
        ukVarI.P(bVarK == null ? 1 : true != bVarK.equals(ji.p.b.DISTANCE) ? 3 : 2);
        ukVarI.I(pVar.t());
        ukVarI.K(pVar.r());
        ukVarI.O(pVar.s());
        String strD = pVar.d();
        if (strD != null) {
            ukVarI.A(strD);
        }
        Double dH = pVar.h();
        if (dH != null) {
            ukVarI.F(dH.doubleValue());
        }
        Integer numG = pVar.g();
        if (numG != null) {
            ukVarI.G(numG.intValue());
        }
        pVar.c();
        pVar.m();
        ukVarI.N(pVar.u() != null);
        ArrayList arrayList = new ArrayList();
        for (Integer num : pVar.j()) {
            if (num != null) {
                arrayList.add(num);
            }
        }
        ukVarI.H(arrayList);
        lk lkVarQ = q();
        lkVarQ.K(2);
        lkVarQ.H((yk) ukVarI.H0());
        nk nkVar = (nk) lkVarQ.H0();
        si siVarB = t41.b(this.f32994b, 3, k41Var, hi.c.f84783a);
        siVarB.T(1);
        siVarB.D(nkVar);
        siVarB.O(this.f32995c.c());
        this.f32993a.a(siVarB);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void m(ji.g gVar, int i15, k41 k41Var) {
        jg jgVarI = kg.I();
        List<String> listK = gVar.k();
        Integer numD = gVar.d();
        if (!listK.isEmpty()) {
            Iterator<String> it = listK.iterator();
            while (it.hasNext()) {
                jgVarI.A(it.next());
            }
        }
        if (numD != null) {
            jgVarI.D(numD.intValue());
        }
        kg kgVar = (kg) jgVarI.H0();
        bi biVarI = di.I();
        if (kgVar != null) {
            biVarI.A(kgVar);
        }
        di diVar = (di) biVarI.H0();
        lk lkVarQ = q();
        lkVarQ.K(6);
        lkVarQ.G(diVar);
        nk nkVar = (nk) lkVarQ.H0();
        si siVarB = t41.b(this.f32994b, i15, k41Var, hi.c.f84783a);
        siVarB.T(1);
        siVarB.D(nkVar);
        siVarB.O(this.f32995c.c());
        ii.i iVarJ = gVar.j();
        if (iVarJ != null) {
            siVarB.K(iVarJ.toString());
        }
        this.f32993a.a(siVarB);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void n(ji.c cVar, int i15, k41 k41Var) {
        fj fjVarI = gj.I();
        fjVarI.A(1);
        gk gkVarI = hk.I();
        gkVarI.A(qz0.a(cVar.c()));
        fjVarI.D((hk) gkVarI.H0());
        gj gjVar = (gj) fjVarI.H0();
        lk lkVarQ = q();
        lkVarQ.K(5);
        lkVarQ.J(gjVar);
        nk nkVar = (nk) lkVarQ.H0();
        si siVarB = t41.b(this.f32994b, i15, k41Var, hi.c.f84783a);
        siVarB.T(1);
        siVarB.D(nkVar);
        siVarB.O(this.f32995c.c());
        this.f32993a.a(siVarB);
    }

    @Override // com.google.android.libraries.places.internal.a41
    public final void o(ji.c cVar, int i15, k41 k41Var) {
        fj fjVarI = gj.I();
        fjVarI.A(1);
        gk gkVarI = hk.I();
        gkVarI.A(qz0.a(cVar.c()));
        fjVarI.D((hk) gkVarI.H0());
        gj gjVar = (gj) fjVarI.H0();
        lk lkVarQ = q();
        lkVarQ.K(5);
        lkVarQ.F(gjVar);
        nk nkVar = (nk) lkVarQ.H0();
        si siVarB = t41.b(this.f32994b, i15, k41Var, hi.c.f84783a);
        siVarB.T(1);
        siVarB.D(nkVar);
        siVarB.O(this.f32995c.c());
        ii.i iVarF = cVar.f();
        if (iVarF != null) {
            siVarB.K(iVarF.toString());
        }
        this.f32993a.a(siVarB);
    }
}
