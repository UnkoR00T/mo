package ot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import vr.c1;
import vr.g1;
import vr.h1;
import vr.l1;
import vr.m1;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f149788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f149789b;

    public l0(p pVar) {
        this.f149788a = pVar;
        this.f149789b = new g(pVar.c().q(), pVar.c().r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ft.g A(l0 l0Var, us.o oVar, qt.n0 n0Var) {
        return l0Var.f149788a.c().d().k(l0Var.j(l0Var.f149788a.e()), oVar, n0Var.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rt.j B(l0 l0Var, us.o oVar, qt.n0 n0Var) {
        return l0Var.f149788a.h().c(new k0(l0Var, oVar, n0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ft.g C(l0 l0Var, us.o oVar, qt.n0 n0Var) {
        return l0Var.f149788a.c().d().d(l0Var.j(l0Var.f149788a.e()), oVar, n0Var.f());
    }

    private final List<t1> E(List<us.v> list, bt.q qVar, d dVar) {
        l0 l0Var;
        wr.h hVarB;
        l0 l0Var2 = this;
        vr.a aVar = (vr.a) l0Var2.f149788a.e();
        o0 o0VarJ = l0Var2.j(aVar.b());
        List<us.v> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            us.v vVar = (us.v) obj;
            int iX = vVar.f0() ? vVar.X() : 0;
            if (o0VarJ == null || !ws.b.f214721c.d(iX).booleanValue()) {
                l0Var = l0Var2;
                hVarB = wr.h.f214542p0.b();
            } else {
                int i17 = i15;
                l0Var = l0Var2;
                i15 = i17;
                hVarB = new qt.s0(l0Var2.f149788a.h(), new h0(l0Var2, o0VarJ, qVar, dVar, i17, vVar));
            }
            wr.h hVar = hVarB;
            zs.f fVarB = m0.b(l0Var.f149788a.g(), vVar.Y());
            st.t0 t0VarU = l0Var.f149788a.i().u(ws.g.r(vVar, l0Var.f149788a.j()));
            boolean zBooleanValue = ws.b.K.d(iX).booleanValue();
            boolean zBooleanValue2 = ws.b.L.d(iX).booleanValue();
            boolean zBooleanValue3 = ws.b.M.d(iX).booleanValue();
            us.r rVarU = ws.g.u(vVar, l0Var.f149788a.j());
            vr.a aVar2 = aVar;
            arrayList.add(new yr.u0(aVar2, null, i15, hVar, fVarB, t0VarU, zBooleanValue, zBooleanValue2, zBooleanValue3, rVarU != null ? l0Var.f149788a.i().u(rVarU) : null, h1.f208052a));
            l0Var2 = l0Var;
            aVar = aVar2;
            i15 = i16;
            o0VarJ = o0VarJ;
        }
        return pq.v.f1(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List F(l0 l0Var, o0 o0Var, bt.q qVar, d dVar, int i15, us.v vVar) {
        return pq.v.f1(l0Var.f149788a.c().d().i(o0Var, qVar, dVar, i15, vVar));
    }

    private final o0 j(vr.m mVar) {
        if (mVar instanceof vr.o0) {
            return new o0.b(((vr.o0) mVar).g(), this.f149788a.g(), this.f149788a.j(), this.f149788a.d());
        }
        if (mVar instanceof qt.m) {
            return ((qt.m) mVar).o1();
        }
        return null;
    }

    private final List<c1> k(List<us.r> list, List<us.v> list2, bt.q qVar, d dVar) {
        vr.a aVar = (vr.a) this.f149788a.e();
        o0 o0VarJ = j(aVar.b());
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            us.r rVar = (us.r) obj;
            us.v vVar = (us.v) pq.v.o0(list2, i15);
            c1 c1VarB = dt.h.b(aVar, this.f149788a.i().u(rVar), null, (o0VarJ == null || !ws.b.f214721c.d((vVar == null || !vVar.f0()) ? 0 : vVar.X()).booleanValue()) ? wr.h.f214542p0.b() : new qt.s0(this.f149788a.h(), new i0(this, o0VarJ, qVar, dVar, i15, vVar)), i15);
            if (c1VarB != null) {
                arrayList.add(c1VarB);
            }
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List l(l0 l0Var, o0 o0Var, bt.q qVar, d dVar, int i15, us.v vVar) {
        return pq.v.f1(l0Var.f149788a.c().d().g(o0Var, qVar, dVar, i15, vVar));
    }

    private final wr.h m(bt.q qVar, int i15, d dVar) {
        return !ws.b.f214721c.d(i15).booleanValue() ? wr.h.f214542p0.b() : new qt.s0(this.f149788a.h(), new e0(this, qVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n(l0 l0Var, bt.q qVar, d dVar) {
        o0 o0VarJ = l0Var.j(l0Var.f149788a.e());
        List listF1 = o0VarJ != null ? pq.v.f1(l0Var.f149788a.c().d().l(o0VarJ, qVar, dVar)) : null;
        return listF1 == null ? pq.v.n() : listF1;
    }

    private final c1 o() {
        vr.m mVarE = this.f149788a.e();
        vr.e eVar = mVarE instanceof vr.e ? (vr.e) mVarE : null;
        if (eVar != null) {
            return eVar.P0();
        }
        return null;
    }

    private final wr.h p(us.o oVar, boolean z15) {
        return !ws.b.f214721c.d(oVar.O0()).booleanValue() ? wr.h.f214542p0.b() : new qt.s0(this.f149788a.h(), new f0(this, z15, oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List q(l0 l0Var, boolean z15, us.o oVar) {
        List listF1;
        o0 o0VarJ = l0Var.j(l0Var.f149788a.e());
        if (o0VarJ != null) {
            listF1 = z15 ? pq.v.f1(l0Var.f149788a.c().d().m(o0VarJ, oVar)) : pq.v.f1(l0Var.f149788a.c().d().a(o0VarJ, oVar));
        } else {
            listF1 = null;
        }
        return listF1 == null ? pq.v.n() : listF1;
    }

    private final wr.h r(bt.q qVar, d dVar) {
        return new qt.a(this.f149788a.h(), new g0(this, qVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List s(l0 l0Var, bt.q qVar, d dVar) {
        o0 o0VarJ = l0Var.j(l0Var.f149788a.e());
        List<wr.c> listJ = o0VarJ != null ? l0Var.f149788a.c().d().j(o0VarJ, qVar, dVar) : null;
        return listJ == null ? pq.v.n() : listJ;
    }

    private final void t(qt.o0 o0Var, c1 c1Var, c1 c1Var2, List<? extends c1> list, List<? extends m1> list2, List<? extends t1> list3, st.t0 t0Var, vr.f0 f0Var, vr.u uVar, Map<? extends vr.a.InterfaceC5463a<?>, ?> map) {
        o0Var.u1(c1Var, c1Var2, list, list2, list3, t0Var, f0Var, uVar, map);
    }

    private final int w(int i15) {
        return (i15 & 63) + ((i15 >> 8) << 6);
    }

    public static /* synthetic */ vr.z0 y(l0 l0Var, us.o oVar, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return l0Var.x(oVar, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rt.j z(l0 l0Var, us.o oVar, qt.n0 n0Var) {
        return l0Var.f149788a.h().c(new j0(l0Var, oVar, n0Var));
    }

    public final l1 D(us.s sVar) {
        wr.h.a aVar = wr.h.f214542p0;
        List<us.b> listY = sVar.Y();
        ArrayList arrayList = new ArrayList(pq.v.y(listY, 10));
        Iterator<T> it = listY.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f149789b.a((us.b) it.next(), this.f149788a.g()));
        }
        qt.p0 p0Var = new qt.p0(this.f149788a.h(), this.f149788a.e(), aVar.a(arrayList), m0.b(this.f149788a.g(), sVar.h0()), q0.a(p0.f149838a, ws.b.f214722d.d(sVar.g0())), sVar, this.f149788a.g(), this.f149788a.j(), this.f149788a.k(), this.f149788a.d());
        p pVarB = p.b(this.f149788a, p0Var, sVar.k0(), null, null, null, null, 60, null);
        p0Var.c1(pVarB.i().m(), pVarB.i().o(ws.g.s(sVar, this.f149788a.j()), false), pVarB.i().o(ws.g.e(sVar, this.f149788a.j()), false));
        return p0Var;
    }

    public final vr.d u(us.e eVar, boolean z15) {
        vr.e eVar2 = (vr.e) this.f149788a.e();
        int iY = eVar.Y();
        d dVar = d.FUNCTION;
        qt.c cVar = new qt.c(eVar2, null, m(eVar, iY, dVar), z15, vr.b.a.DECLARATION, eVar, this.f149788a.g(), this.f149788a.j(), this.f149788a.k(), this.f149788a.d(), null, 1024, null);
        cVar.w1(p.b(this.f149788a, cVar, pq.v.n(), null, null, null, null, 60, null).f().E(eVar.c0(), eVar, dVar), q0.a(p0.f149838a, ws.b.f214722d.d(eVar.Y())));
        cVar.m1(eVar2.t());
        cVar.c1(eVar2.o0());
        cVar.e1(!ws.b.f214733o.d(eVar.Y()).booleanValue());
        return cVar;
    }

    public final g1 v(us.j jVar) {
        st.t0 t0VarU;
        int iC0 = jVar.S0() ? jVar.C0() : w(jVar.E0());
        d dVar = d.FUNCTION;
        wr.h hVarM = m(jVar, iC0, dVar);
        wr.h hVarR = ws.g.g(jVar) ? r(jVar, dVar) : wr.h.f214542p0.b();
        ws.j jVarB = fr.t.c(ht.e.o(this.f149788a.e()).b(m0.b(this.f149788a.g(), jVar.D0())), r0.f149852a) ? ws.j.f214769b.b() : this.f149788a.k();
        vr.m mVarE = this.f149788a.e();
        zs.f fVarB = m0.b(this.f149788a.g(), jVar.D0());
        p0 p0Var = p0.f149838a;
        wr.h hVar = hVarR;
        qt.o0 o0Var = new qt.o0(mVarE, null, hVarM, fVarB, q0.b(p0Var, ws.b.f214735q.d(iC0)), jVar, this.f149788a.g(), this.f149788a.j(), jVarB, this.f149788a.d(), null, 1024, null);
        p pVarB = p.b(this.f149788a, o0Var, jVar.L0(), null, null, null, null, 60, null);
        us.r rVarL = ws.g.l(jVar, this.f149788a.j());
        t(o0Var, (rVarL == null || (t0VarU = pVarB.i().u(rVarL)) == null) ? null : dt.h.i(o0Var, t0VarU, hVar), o(), pVarB.f().k(ws.g.c(jVar, this.f149788a.j()), jVar.r0(), jVar, dVar), pVarB.i().m(), pVarB.f().E(jVar.P0(), jVar, dVar), pVarB.i().u(ws.g.n(jVar, this.f149788a.j())), p0Var.b(ws.b.f214723e.d(iC0)), q0.a(p0Var, ws.b.f214722d.d(iC0)), pq.v0.i());
        o0Var.l1(ws.b.f214736r.d(iC0).booleanValue());
        o0Var.i1(ws.b.f214737s.d(iC0).booleanValue());
        o0Var.d1(ws.b.f214740v.d(iC0).booleanValue());
        o0Var.k1(ws.b.f214738t.d(iC0).booleanValue());
        o0Var.o1(ws.b.f214739u.d(iC0).booleanValue());
        o0Var.n1(ws.b.f214741w.d(iC0).booleanValue());
        o0Var.c1(ws.b.f214742x.d(iC0).booleanValue());
        o0Var.e1(!ws.b.f214743y.d(iC0).booleanValue());
        oq.r<vr.a.InterfaceC5463a<?>, Object> rVarA = this.f149788a.c().h().a(jVar, o0Var, this.f149788a.j(), pVarB.i());
        if (rVarA != null) {
            o0Var.a1(rVarA.c(), rVarA.d());
        }
        return o0Var;
    }

    public final vr.z0 x(us.o oVar, boolean z15) {
        wr.h hVarM;
        ws.b.d<us.l> dVar;
        yr.l0 l0VarD;
        yr.m0 m0VarE;
        st.t0 t0VarU;
        int iO0 = oVar.i1() ? oVar.O0() : w(oVar.U0());
        if (z15) {
            wr.h.a aVar = wr.h.f214542p0;
            List<us.b> listT0 = oVar.t0();
            ArrayList arrayList = new ArrayList(pq.v.y(listT0, 10));
            Iterator<T> it = listT0.iterator();
            while (it.hasNext()) {
                arrayList.add(this.f149789b.a((us.b) it.next(), this.f149788a.g()));
            }
            hVarM = aVar.a(arrayList);
        } else {
            hVarM = null;
        }
        vr.m mVarE = this.f149788a.e();
        if (hVarM == null) {
            hVarM = m(oVar, iO0, d.PROPERTY);
        }
        p0 p0Var = p0.f149838a;
        ws.b.d<us.l> dVar2 = ws.b.f214723e;
        vr.f0 f0VarB = p0Var.b(dVar2.d(iO0));
        ws.b.d<us.y> dVar3 = ws.b.f214722d;
        int i15 = iO0;
        p0 p0Var2 = p0Var;
        qt.n0 n0Var = new qt.n0(mVarE, null, hVarM, f0VarB, q0.a(p0Var, dVar3.d(iO0)), ws.b.A.d(iO0).booleanValue(), m0.b(this.f149788a.g(), oVar.T0()), q0.b(p0Var, ws.b.f214735q.d(iO0)), ws.b.E.d(iO0).booleanValue(), ws.b.D.d(iO0).booleanValue(), ws.b.G.d(iO0).booleanValue(), ws.b.H.d(iO0).booleanValue(), ws.b.I.d(iO0).booleanValue(), oVar, this.f149788a.g(), this.f149788a.j(), this.f149788a.k(), this.f149788a.d());
        p pVarB = p.b(this.f149788a, n0Var, oVar.g1(), null, null, null, null, 60, null);
        boolean zBooleanValue = ws.b.B.d(i15).booleanValue();
        wr.h hVarR = (zBooleanValue && ws.g.h(oVar)) ? r(oVar, d.PROPERTY_GETTER) : wr.h.f214542p0.b();
        st.t0 t0VarU2 = pVarB.i().u(ws.g.o(oVar, this.f149788a.j()));
        List<m1> listM = pVarB.i().m();
        c1 c1VarO = o();
        us.r rVarM = ws.g.m(oVar, this.f149788a.j());
        c1 c1VarI = (rVarM == null || (t0VarU = pVarB.i().u(rVarM)) == null) ? null : dt.h.i(n0Var, t0VarU, hVarR);
        l0 l0VarF = pVarB.f();
        List<us.r> listD = ws.g.d(oVar, this.f149788a.j());
        List<us.v> listB0 = oVar.B0();
        d dVar4 = d.PROPERTY_GETTER;
        n0Var.h1(t0VarU2, listM, c1VarO, c1VarI, l0VarF.k(listD, listB0, oVar, dVar4));
        ws.b.d<us.y> dVar5 = dVar3;
        int iB = ws.b.b(ws.b.f214721c.d(i15).booleanValue(), dVar5.d(i15), dVar2.d(i15), false, false, false);
        if (zBooleanValue) {
            int iS0 = oVar.j1() ? oVar.S0() : iB;
            boolean zBooleanValue2 = ws.b.N.d(iS0).booleanValue();
            boolean zBooleanValue3 = ws.b.O.d(iS0).booleanValue();
            boolean zBooleanValue4 = ws.b.P.d(iS0).booleanValue();
            wr.h hVarM2 = m(oVar, iS0, dVar4);
            if (zBooleanValue2) {
                dVar = dVar2;
                l0VarD = new yr.l0(n0Var, hVarM2, p0Var2.b(dVar2.d(iS0)), q0.a(p0Var2, dVar5.d(iS0)), !zBooleanValue2, zBooleanValue3, zBooleanValue4, n0Var.k(), null, h1.f208052a);
            } else {
                dVar = dVar2;
                l0VarD = dt.h.d(n0Var, hVarM2);
            }
            l0VarD.W0(n0Var.f());
        } else {
            dVar5 = dVar5;
            p0Var2 = p0Var2;
            dVar = dVar2;
            l0VarD = null;
        }
        if (ws.b.C.d(i15).booleanValue()) {
            if (oVar.q1()) {
                iB = oVar.c1();
            }
            int i16 = iB;
            boolean zBooleanValue5 = ws.b.N.d(i16).booleanValue();
            boolean zBooleanValue6 = ws.b.O.d(i16).booleanValue();
            boolean zBooleanValue7 = ws.b.P.d(i16).booleanValue();
            d dVar6 = d.PROPERTY_SETTER;
            wr.h hVarM3 = m(oVar, i16, dVar6);
            if (zBooleanValue5) {
                yr.m0 m0Var = new yr.m0(n0Var, hVarM3, p0Var2.b(dVar.d(i16)), q0.a(p0Var2, dVar5.d(i16)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, n0Var.k(), null, h1.f208052a);
                m0VarE = m0Var;
                m0VarE.X0((t1) pq.v.P0(p.b(pVarB, m0Var, pq.v.n(), null, null, null, null, 60, null).f().E(pq.v.e(oVar.d1()), oVar, dVar6)));
            } else {
                m0VarE = dt.h.e(n0Var, hVarM3, wr.h.f214542p0.b());
            }
        } else {
            m0VarE = null;
        }
        if (ws.b.F.d(i15).booleanValue()) {
            n0Var.R0(new c0(this, oVar, n0Var));
        }
        vr.m mVarE2 = this.f149788a.e();
        vr.e eVar = mVarE2 instanceof vr.e ? (vr.e) mVarE2 : null;
        if ((eVar != null ? eVar.k() : null) == vr.f.ANNOTATION_CLASS) {
            n0Var.R0(new d0(this, oVar, n0Var));
        }
        n0Var.b1(l0VarD, m0VarE, new yr.r(p(oVar, false), n0Var), new yr.r(p(oVar, true), n0Var));
        return n0Var;
    }
}
