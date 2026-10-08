package fs;

import es.a0;
import es.b0;
import es.c0;
import es.d0;
import es.e0;
import es.k;
import es.l;
import es.m;
import es.q;
import es.s;
import es.v;
import es.x;
import es.y;
import es.z;
import gs.n;
import java.util.Iterator;
import java.util.List;
import oq.p;
import us.i;
import us.o;
import us.r;
import us.t;
import us.w;
import ws.h;
import ws.j;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f66817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f66818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f66819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f66820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f66821f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f66822g;

        static {
            int[] iArr = new int[t.c.values().length];
            try {
                iArr[t.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66816a = iArr;
            int[] iArr2 = new int[r.b.c.values().length];
            try {
                iArr2[r.b.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[r.b.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[r.b.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[r.b.c.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f66817b = iArr2;
            int[] iArr3 = new int[w.d.values().length];
            try {
                iArr3[w.d.LANGUAGE_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[w.d.COMPILER_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[w.d.API_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f66818c = iArr3;
            int[] iArr4 = new int[oq.b.values().length];
            try {
                iArr4[oq.b.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[oq.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[oq.b.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f66819d = iArr4;
            int[] iArr5 = new int[us.g.d.values().length];
            try {
                iArr5[us.g.d.RETURNS_CONSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[us.g.d.CALLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[us.g.d.RETURNS_NOT_NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            f66820e = iArr5;
            int[] iArr6 = new int[us.g.e.values().length];
            try {
                iArr6[us.g.e.AT_MOST_ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[us.g.e.EXACTLY_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[us.g.e.AT_LEAST_ONCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            f66821f = iArr6;
            int[] iArr7 = new int[i.c.values().length];
            try {
                iArr7[i.c.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr7[i.c.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[i.c.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            f66822g = iArr7;
        }
    }

    public static final int a(int i15) {
        return ws.b.b(ws.b.f214721c.d(i15).booleanValue(), ws.b.f214722d.d(i15), ws.b.f214723e.d(i15), false, false, false);
    }

    public static final int b(o oVar) {
        return oVar.j1() ? oVar.S0() : a(oVar.O0());
    }

    public static final int c(o oVar) {
        return oVar.q1() ? oVar.c1() : a(oVar.O0());
    }

    private static final int d(r rVar) {
        boolean zK0 = rVar.k0();
        return (zK0 ? 1 : 0) + (rVar.g0() << 1);
    }

    private static final int e(t tVar) {
        return tVar.U() ? 1 : 0;
    }

    private static final z f(v vVar) {
        z zVar = new z(0, "_");
        zVar.e(vVar);
        return zVar;
    }

    private static final r g(us.c cVar, e eVar) {
        r rVarI = ws.g.i(cVar, eVar.g());
        if (rVarI != null) {
            return rVarI;
        }
        if (!cVar.q1()) {
            return null;
        }
        Iterator<T> it = cVar.Y0().iterator();
        boolean z15 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z15) {
                    break;
                }
                break;
            }
            Object next = it.next();
            o oVar = (o) next;
            if (ws.g.m(oVar, eVar.g()) == null && fr.t.c(eVar.b(oVar.T0()), eVar.b(cVar.S0()))) {
                if (!z15) {
                    z15 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        o oVar2 = (o) obj;
        if (oVar2 != null) {
            return ws.g.o(oVar2, eVar.g());
        }
        return null;
    }

    private static final c0 h(int i15, e eVar) {
        e0 e0Var;
        d0 d0Var;
        ws.i.b bVarE;
        c0 c0Var = new c0();
        ws.i iVarA = ws.i.f214757f.a(i15, eVar.e(), eVar.h());
        if (iVarA == null && !eVar.d()) {
            throw new es.c("No VersionRequirement with the given id in the table", null, 2, null);
        }
        w.d dVarB = iVarA != null ? iVarA.b() : null;
        int i16 = dVarB == null ? -1 : a.f66818c[dVarB.ordinal()];
        if (i16 == -1) {
            e0Var = e0.UNKNOWN;
        } else if (i16 == 1) {
            e0Var = e0.LANGUAGE_VERSION;
        } else if (i16 == 2) {
            e0Var = e0.COMPILER_VERSION;
        } else {
            if (i16 != 3) {
                throw new p();
            }
            e0Var = e0.API_VERSION;
        }
        oq.b bVarC = iVarA != null ? iVarA.c() : null;
        int i17 = bVarC == null ? -1 : a.f66819d[bVarC.ordinal()];
        if (i17 == -1) {
            d0Var = d0.HIDDEN;
        } else if (i17 == 1) {
            d0Var = d0.WARNING;
        } else if (i17 != 2) {
            if (i17 != 3) {
                throw new p();
            }
            d0Var = d0.HIDDEN;
        } else {
            d0Var = d0.ERROR;
        }
        c0Var.e(e0Var);
        c0Var.f(d0Var);
        c0Var.d(iVarA != null ? iVarA.a() : null);
        c0Var.g(iVarA != null ? iVarA.d() : null);
        if (iVarA == null || (bVarE = iVarA.e()) == null) {
            bVarE = ws.i.b.f214765e;
        }
        c0Var.h(new b0(bVarE.b(), bVarE.c(), bVarE.d()));
        return c0Var;
    }

    public static final es.g i(us.c cVar, ws.d dVar, boolean z15, List<? extends Object> list) {
        es.g gVar = new es.g();
        e eVarI = new e(dVar, new h(cVar.k1()), j.f214769b.a(cVar.m1()), z15, null, list, 16, null).i(cVar.j1());
        gVar.s(cVar.N0());
        gVar.v(eVarI.a(cVar.O0()));
        List<t> listJ1 = cVar.j1();
        List<x> listP = gVar.p();
        Iterator<T> it = listJ1.iterator();
        while (it.hasNext()) {
            listP.add(t((t) it.next(), eVarI));
        }
        List<r> listP2 = ws.g.p(cVar, eVarI.g());
        List<v> listO = gVar.o();
        Iterator<T> it4 = listP2.iterator();
        while (it4.hasNext()) {
            listO.add(r((r) it4.next(), eVarI));
        }
        List<us.e> listD0 = cVar.D0();
        List<es.j> listE = gVar.e();
        Iterator<T> it5 = listD0.iterator();
        while (it5.hasNext()) {
            listE.add(k((us.e) it5.next(), eVarI));
        }
        v(gVar, cVar.R0(), cVar.Y0(), cVar.g1(), eVarI);
        if (cVar.n1()) {
            gVar.r(eVarI.b(cVar.y0()));
        }
        List<Integer> listV0 = cVar.V0();
        List<String> listM = gVar.m();
        Iterator<T> it6 = listV0.iterator();
        while (it6.hasNext()) {
            listM.add(eVarI.b(((Integer) it6.next()).intValue()));
        }
        Iterator<us.h> it7 = cVar.M0().iterator();
        while (true) {
            if (!it7.hasNext()) {
                List<Integer> listZ0 = cVar.Z0();
                List<String> listN = gVar.n();
                Iterator<T> it8 = listZ0.iterator();
                while (it8.hasNext()) {
                    listN.add(eVarI.a(((Integer) it8.next()).intValue()));
                }
                if (cVar.q1()) {
                    gVar.t(eVarI.b(cVar.S0()));
                }
                r rVarG = g(cVar, eVarI);
                gVar.u(rVarG != null ? r(rVarG, eVarI) : null);
                List<r> listB = ws.g.b(cVar, eVarI.g());
                List<v> listF = gVar.f();
                Iterator<T> it9 = listB.iterator();
                while (it9.hasNext()) {
                    listF.add(r((r) it9.next(), eVarI));
                }
                List<Integer> listL1 = cVar.l1();
                List<c0> listQ = gVar.q();
                Iterator<T> it10 = listL1.iterator();
                while (it10.hasNext()) {
                    listQ.add(h(((Integer) it10.next()).intValue(), eVarI));
                }
                Iterator<T> it11 = eVarI.c().iterator();
                while (it11.hasNext()) {
                    ((n) it11.next()).e(gVar, cVar, eVarI);
                }
                return gVar;
            }
            us.h next = it7.next();
            if (!next.Q()) {
                throw new es.c("No name for EnumEntry", null, 2, null);
            }
            gVar.g().add(eVarI.b(next.O()));
            gVar.k().add(o(next, eVarI));
        }
    }

    public static /* synthetic */ es.g j(us.c cVar, ws.d dVar, boolean z15, List list, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        if ((i15 & 4) != 0) {
            list = pq.v.n();
        }
        return i(cVar, dVar, z15, list);
    }

    private static final es.j k(us.e eVar, e eVar2) {
        es.j jVar = new es.j(eVar.Y());
        List<us.v> listC0 = eVar.c0();
        List<z> listD = jVar.d();
        Iterator<T> it = listC0.iterator();
        while (it.hasNext()) {
            listD.add(u((us.v) it.next(), eVar2));
        }
        List<Integer> listD0 = eVar.d0();
        List<c0> listE = jVar.e();
        Iterator<T> it4 = listD0.iterator();
        while (it4.hasNext()) {
            listE.add(h(((Integer) it4.next()).intValue(), eVar2));
        }
        Iterator<T> it5 = eVar2.c().iterator();
        while (it5.hasNext()) {
            ((n) it5.next()).b(jVar, eVar, eVar2);
        }
        return jVar;
    }

    private static final k l(us.f fVar, e eVar) {
        es.p pVar;
        es.o oVar;
        k kVar = new k();
        for (us.g gVar : fVar.B()) {
            if (gVar.N()) {
                us.g.d dVarJ = gVar.J();
                if (dVarJ == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int i15 = a.f66820e[dVarJ.ordinal()];
                if (i15 == 1) {
                    pVar = es.p.RETURNS_CONSTANT;
                } else if (i15 == 2) {
                    pVar = es.p.CALLS;
                } else {
                    if (i15 != 3) {
                        throw new p();
                    }
                    pVar = es.p.RETURNS_NOT_NULL;
                }
                if (gVar.O()) {
                    us.g.e eVarK = gVar.K();
                    if (eVarK == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    int i16 = a.f66821f[eVarK.ordinal()];
                    if (i16 == 1) {
                        oVar = es.o.AT_MOST_ONCE;
                    } else if (i16 == 2) {
                        oVar = es.o.EXACTLY_ONCE;
                    } else {
                        if (i16 != 3) {
                            throw new p();
                        }
                        oVar = es.o.AT_LEAST_ONCE;
                    }
                } else {
                    oVar = null;
                }
                kVar.a().add(m(gVar, pVar, oVar, eVar));
            }
        }
        return kVar;
    }

    private static final m m(us.g gVar, es.p pVar, es.o oVar, e eVar) {
        m mVar = new m(pVar, oVar);
        List<i> listI = gVar.I();
        List<es.n> listA = mVar.a();
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            listA.add(n((i) it.next(), eVar));
        }
        if (gVar.L()) {
            mVar.b(n(gVar.D(), eVar));
        }
        return mVar;
    }

    private static final es.n n(i iVar, e eVar) {
        Boolean bool;
        es.n nVar = new es.n();
        nVar.e(iVar.L());
        nVar.g(iVar.Y() ? Integer.valueOf(iVar.T()) : null);
        if (iVar.U()) {
            i.c cVarJ = iVar.J();
            if (cVarJ == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int i15 = a.f66822g[cVarJ.ordinal()];
            if (i15 == 1) {
                bool = Boolean.TRUE;
            } else if (i15 == 2) {
                bool = Boolean.FALSE;
            } else {
                if (i15 != 3) {
                    throw new p();
                }
                bool = null;
            }
            nVar.d(new es.i(bool));
        }
        r rVarJ = ws.g.j(iVar, eVar.g());
        nVar.f(rVarJ != null ? r(rVarJ, eVar) : null);
        List<i> listI = iVar.I();
        List<es.n> listA = nVar.a();
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            listA.add(n((i) it.next(), eVar));
        }
        List<i> listR = iVar.R();
        List<es.n> listC = nVar.c();
        Iterator<T> it4 = listR.iterator();
        while (it4.hasNext()) {
            listC.add(n((i) it4.next(), eVar));
        }
        return nVar;
    }

    private static final q o(us.h hVar, e eVar) {
        q qVar = new q(eVar.b(hVar.O()));
        Iterator<T> it = eVar.c().iterator();
        while (it.hasNext()) {
            ((n) it.next()).i(qVar, hVar, eVar);
        }
        return qVar;
    }

    private static final s p(us.j jVar, e eVar) {
        s sVar = new s(jVar.C0(), eVar.b(jVar.D0()));
        e eVarI = eVar.i(jVar.L0());
        List<t> listL0 = jVar.L0();
        List<x> listF = sVar.f();
        Iterator<T> it = listL0.iterator();
        while (it.hasNext()) {
            listF.add(t((t) it.next(), eVarI));
        }
        r rVarL = ws.g.l(jVar, eVarI.g());
        sVar.k(rVarL != null ? r(rVarL, eVarI) : null);
        List<us.v> listR0 = jVar.r0();
        List<z> listB = sVar.b();
        Iterator<T> it4 = listR0.iterator();
        while (it4.hasNext()) {
            listB.add(u((us.v) it4.next(), eVarI));
        }
        if (jVar.r0().isEmpty() && !jVar.v0().isEmpty()) {
            List<r> listC = ws.g.c(jVar, eVarI.g());
            List<z> listB2 = sVar.b();
            Iterator<T> it5 = listC.iterator();
            while (it5.hasNext()) {
                listB2.add(f(r((r) it5.next(), eVarI)));
            }
        }
        List<us.v> listP0 = jVar.P0();
        List<z> listG = sVar.g();
        Iterator<T> it6 = listP0.iterator();
        while (it6.hasNext()) {
            listG.add(u((us.v) it6.next(), eVarI));
        }
        sVar.l(r(ws.g.n(jVar, eVarI.g()), eVarI));
        if (jVar.R0()) {
            sVar.i(l(jVar.w0(), eVarI));
        }
        List<Integer> listQ0 = jVar.Q0();
        List<c0> listH = sVar.h();
        Iterator<T> it7 = listQ0.iterator();
        while (it7.hasNext()) {
            listH.add(h(((Integer) it7.next()).intValue(), eVarI));
        }
        Iterator<T> it8 = eVarI.c().iterator();
        while (it8.hasNext()) {
            ((n) it8.next()).j(sVar, jVar, eVarI);
        }
        return sVar;
    }

    public static final es.t q(o oVar, e eVar) {
        es.t tVar = new es.t(oVar.O0(), eVar.b(oVar.T0()), b(oVar), c(oVar));
        e eVarI = eVar.i(oVar.g1());
        List<t> listG1 = oVar.g1();
        List<x> listJ = tVar.j();
        Iterator<T> it = listG1.iterator();
        while (it.hasNext()) {
            listJ.add(t((t) it.next(), eVarI));
        }
        r rVarM = ws.g.m(oVar, eVarI.g());
        tVar.n(rVarM != null ? r(rVarM, eVarI) : null);
        List<us.v> listB0 = oVar.B0();
        List<z> listC = tVar.c();
        Iterator<T> it4 = listB0.iterator();
        while (it4.hasNext()) {
            listC.add(u((us.v) it4.next(), eVarI));
        }
        if (oVar.B0().isEmpty() && !oVar.F0().isEmpty()) {
            List<r> listD = ws.g.d(oVar, eVarI.g());
            List<z> listC2 = tVar.c();
            Iterator<T> it5 = listD.iterator();
            while (it5.hasNext()) {
                listC2.add(f(r((r) it5.next(), eVarI)));
            }
        }
        if (oVar.r1()) {
            tVar.p(u(oVar.d1(), eVarI));
        }
        tVar.o(r(ws.g.o(oVar, eVarI.g()), eVarI));
        List<Integer> listH1 = oVar.h1();
        List<c0> listK = tVar.k();
        Iterator<T> it6 = listH1.iterator();
        while (it6.hasNext()) {
            listK.add(h(((Integer) it6.next()).intValue(), eVarI));
        }
        Iterator<T> it7 = eVarI.c().iterator();
        while (it7.hasNext()) {
            ((n) it7.next()).l(tVar, oVar, eVarI);
        }
        return tVar;
    }

    private static final v r(r rVar, e eVar) {
        es.h cVar;
        v vVarR;
        a0 a0Var;
        v vVar = new v(d(rVar));
        es.r rVar2 = null;
        rVar2 = null;
        if (rVar.s0()) {
            cVar = new es.h.a(eVar.a(rVar.d0()));
        } else if (rVar.A0()) {
            cVar = new es.h.b(eVar.a(rVar.n0()));
        } else if (rVar.B0()) {
            cVar = new es.h.c(rVar.o0());
        } else {
            if (!rVar.C0()) {
                throw new es.c("No classifier (class, type alias or type parameter) recorded for Type", null, 2, null);
            }
            Integer numF = eVar.f(rVar.p0());
            if (numF == null) {
                throw new es.c("No type parameter id for " + eVar.b(rVar.p0()), null, 2, null);
            }
            cVar = new es.h.c(numF.intValue());
        }
        vVar.f(cVar);
        for (r.b bVar : rVar.c0()) {
            r.b.c cVarB = bVar.B();
            if (cVarB == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int i15 = a.f66817b[cVarB.ordinal()];
            if (i15 == 1) {
                a0Var = a0.IN;
            } else if (i15 == 2) {
                a0Var = a0.OUT;
            } else if (i15 == 3) {
                a0Var = a0.INVARIANT;
            } else {
                if (i15 != 4) {
                    throw new p();
                }
                a0Var = null;
            }
            if (a0Var != null) {
                r rVarQ = ws.g.q(bVar, eVar.g());
                if (rVarQ == null) {
                    throw new es.c("No type argument for non-STAR projection in Type", null, 2, null);
                }
                vVar.a().add(new y(a0Var, r(rVarQ, eVar)));
            } else {
                vVar.a().add(y.f53242d);
            }
        }
        r rVarA = ws.g.a(rVar, eVar.g());
        vVar.e(rVarA != null ? r(rVarA, eVar) : null);
        r rVarK = ws.g.k(rVar, eVar.g());
        vVar.i(rVarK != null ? r(rVarK, eVar) : null);
        r rVarF = ws.g.f(rVar, eVar.g());
        if (rVarF != null && (vVarR = r(rVarF, eVar)) != null) {
            rVar2 = new es.r(vVarR, rVar.u0() ? eVar.b(rVar.h0()) : null);
        }
        vVar.h(rVar2);
        Iterator<T> it = eVar.c().iterator();
        while (it.hasNext()) {
            ((n) it.next()).d(vVar, rVar, eVar);
        }
        return vVar;
    }

    private static final es.w s(us.s sVar, e eVar) {
        es.w wVar = new es.w(sVar.g0(), eVar.b(sVar.h0()));
        e eVarI = eVar.i(sVar.k0());
        List<t> listK0 = sVar.k0();
        List<x> listC = wVar.c();
        Iterator<T> it = listK0.iterator();
        while (it.hasNext()) {
            listC.add(t((t) it.next(), eVarI));
        }
        wVar.g(r(ws.g.s(sVar, eVarI.g()), eVarI));
        wVar.e(r(ws.g.e(sVar, eVarI.g()), eVarI));
        List<us.b> listY = sVar.Y();
        List<es.e> listA = wVar.a();
        Iterator<T> it4 = listY.iterator();
        while (it4.hasNext()) {
            listA.add(f.b((us.b) it4.next(), eVarI.e()));
        }
        List<Integer> listN0 = sVar.n0();
        List<c0> listD = wVar.d();
        Iterator<T> it5 = listN0.iterator();
        while (it5.hasNext()) {
            listD.add(h(((Integer) it5.next()).intValue(), eVarI));
        }
        Iterator<T> it6 = eVarI.c().iterator();
        while (it6.hasNext()) {
            ((n) it6.next()).r(wVar, sVar, eVarI);
        }
        return wVar;
    }

    private static final x t(t tVar, e eVar) {
        a0 a0Var;
        t.c cVarA0 = tVar.a0();
        if (cVarA0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i15 = a.f66816a[cVarA0.ordinal()];
        if (i15 == 1) {
            a0Var = a0.IN;
        } else if (i15 == 2) {
            a0Var = a0.OUT;
        } else {
            if (i15 != 3) {
                throw new p();
            }
            a0Var = a0.INVARIANT;
        }
        x xVar = new x(e(tVar), eVar.b(tVar.T()), tVar.R(), a0Var);
        List<r> listT = ws.g.t(tVar, eVar.g());
        List<v> listC = xVar.c();
        Iterator<T> it = listT.iterator();
        while (it.hasNext()) {
            listC.add(r((r) it.next(), eVar));
        }
        Iterator<T> it4 = eVar.c().iterator();
        while (it4.hasNext()) {
            ((n) it4.next()).g(xVar, tVar, eVar);
        }
        return xVar;
    }

    private static final z u(us.v vVar, e eVar) {
        z zVar = new z(vVar.X(), eVar.b(vVar.Y()));
        zVar.e(r(ws.g.r(vVar, eVar.g()), eVar));
        r rVarU = ws.g.u(vVar, eVar.g());
        zVar.f(rVarU != null ? r(rVarU, eVar) : null);
        if (vVar.e0()) {
            zVar.c(f.c(vVar.U(), eVar.e()));
        }
        Iterator<T> it = eVar.c().iterator();
        while (it.hasNext()) {
            ((n) it.next()).n(zVar, vVar, eVar);
        }
        return zVar;
    }

    private static final void v(l lVar, List<us.j> list, List<o> list2, List<us.s> list3, e eVar) {
        List<s> listC = lVar.c();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            listC.add(p((us.j) it.next(), eVar));
        }
        List<es.t> listA = lVar.a();
        Iterator<T> it4 = list2.iterator();
        while (it4.hasNext()) {
            listA.add(q((o) it4.next(), eVar));
        }
        List<es.w> listB = lVar.b();
        Iterator<T> it5 = list3.iterator();
        while (it5.hasNext()) {
            listB.add(s((us.s) it5.next(), eVar));
        }
    }
}
