package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class g extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36980b = "StructElem";

    public g(String str, h hVar) {
        super(f36980b);
        e0(str);
        c0(hVar);
    }

    private Map<String, Object> G() {
        i iVarI = I();
        if (iVarI != null) {
            return iVarI.v();
        }
        return null;
    }

    private i I() {
        h hVarE = E();
        while (hVarE instanceof g) {
            hVarE = ((g) hVarE).E();
        }
        if (hVarE instanceof i) {
            return (i) hVarE;
        }
        return null;
    }

    public String A() {
        return D1().L4(bp.i.f20826o4);
    }

    public String B() {
        return D1().L4(bp.i.V2);
    }

    public String C() {
        return D1().L4(bp.i.T4);
    }

    public gp.e D() {
        bp.b bVarP4 = D1().p4(bp.i.U6);
        if (bVarP4 instanceof bp.d) {
            return new gp.e((bp.d) bVarP4);
        }
        return null;
    }

    public h E() {
        bp.b bVarP4 = D1().p4(bp.i.A6);
        if (bVarP4 instanceof bp.d) {
            return h.d((bp.d) bVarP4);
        }
        return null;
    }

    public int F() {
        return D1().y4(bp.i.f20800l7, 0);
    }

    public String H() {
        String strJ = J();
        if (G().containsKey(strJ)) {
            Object obj = G().get(strJ);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return strJ;
    }

    public String J() {
        return D1().H4(bp.i.J7);
    }

    public String K() {
        return D1().L4(bp.i.F8);
    }

    public void L() {
        d0(F() + 1);
    }

    public void M(bp.h hVar, Object obj) {
        j(hVar, obj);
    }

    public void N(d dVar, Object obj) {
        l(dVar, obj);
    }

    public void O(e eVar, Object obj) {
        l(eVar, obj);
    }

    public void P(a aVar) {
        bp.i iVar = bp.i.f20733f;
        bp.b bVarP4 = D1().p4(iVar);
        if (bVarP4 instanceof bp.a) {
            bp.a aVar2 = (bp.a) bVarP4;
            aVar2.n4(aVar.D1());
            if (aVar2.size() == 2 && aVar2.getInt(1) == 0) {
                D1().Y4(iVar, aVar2.k4(0));
            }
        } else {
            if (bVarP4 instanceof bp.l) {
                bVarP4 = ((bp.l) bVarP4).X3();
            }
            if (aVar.D1().equals(bVarP4)) {
                D1().Y4(iVar, null);
            }
        }
        aVar.l(null);
    }

    public void Q(String str) {
        if (str == null) {
            return;
        }
        bp.i iVar = bp.i.Q0;
        bp.b bVarP4 = D1().p4(iVar);
        bp.i iVarJ3 = bp.i.J3(str);
        if (!(bVarP4 instanceof bp.a)) {
            if (bVarP4 instanceof bp.l) {
                bVarP4 = ((bp.l) bVarP4).X3();
            }
            if (iVarJ3.equals(bVarP4)) {
                D1().Y4(iVar, null);
                return;
            }
            return;
        }
        bp.a aVar = (bp.a) bVarP4;
        aVar.n4(iVarJ3);
        if (aVar.size() == 2 && aVar.getInt(1) == 0) {
            D1().Y4(iVar, aVar.k4(0));
        }
    }

    public void R(bp.h hVar) {
        m(hVar);
    }

    public void S(d dVar) {
        o(dVar);
    }

    public void T(e eVar) {
        o(eVar);
    }

    public void U(String str) {
        D1().g5(bp.i.f20793l, str);
    }

    public void V(String str) {
        D1().g5(bp.i.f20940z, str);
    }

    public void W(l<a> lVar) {
        bp.i iVar = bp.i.f20733f;
        if (lVar.g() == 1 && lVar.d(0) == 0) {
            a aVarB = lVar.b(0);
            aVarB.l(this);
            D1().Z4(iVar, aVarB);
            return;
        }
        bp.a aVar = new bp.a();
        for (int i15 = 0; i15 < lVar.g(); i15++) {
            a aVarB2 = lVar.b(i15);
            aVarB2.l(this);
            int iD = lVar.d(i15);
            if (iD < 0) {
                throw new IllegalArgumentException("The revision number shall be > -1");
            }
            aVar.J3(aVarB2);
            aVar.A3(bp.h.g4(iD));
        }
        D1().Y4(iVar, aVar);
    }

    public void X(l<String> lVar) {
        if (lVar == null) {
            return;
        }
        bp.i iVar = bp.i.Q0;
        if (lVar.g() == 1 && lVar.d(0) == 0) {
            D1().d5(iVar, lVar.b(0));
            return;
        }
        bp.a aVar = new bp.a();
        for (int i15 = 0; i15 < lVar.g(); i15++) {
            String strB = lVar.b(i15);
            int iD = lVar.d(i15);
            if (iD < 0) {
                throw new IllegalArgumentException("The revision number shall be > -1");
            }
            aVar.A3(bp.i.J3(strB));
            aVar.A3(bp.h.g4(iD));
        }
        D1().Y4(iVar, aVar);
    }

    public void Y(String str) {
        D1().g5(bp.i.f20826o4, str);
    }

    public void Z(String str) {
        D1().g5(bp.i.V2, str);
    }

    public void a0(String str) {
        D1().g5(bp.i.T4, str);
    }

    public void b0(gp.e eVar) {
        D1().Z4(bp.i.U6, eVar);
    }

    public final void c0(h hVar) {
        D1().Z4(bp.i.A6, hVar);
    }

    public void d0(int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException("The revision number shall be > -1");
        }
        D1().W4(bp.i.f20800l7, i15);
    }

    public final void e0(String str) {
        D1().d5(bp.i.J7, str);
    }

    public void f0(String str) {
        D1().g5(bp.i.F8, str);
    }

    public void q(a aVar) {
        bp.a aVar2;
        bp.i iVar = bp.i.f20733f;
        aVar.l(this);
        bp.b bVarP4 = D1().p4(iVar);
        if (bVarP4 instanceof bp.a) {
            aVar2 = (bp.a) bVarP4;
        } else {
            bp.a aVar3 = new bp.a();
            if (bVarP4 != null) {
                aVar3.A3(bVarP4);
                aVar3.A3(bp.h.g4(0L));
            }
            aVar2 = aVar3;
        }
        D1().Y4(iVar, aVar2);
        aVar2.J3(aVar);
        aVar2.A3(bp.h.g4(F()));
    }

    public void r(String str) {
        bp.a aVar;
        if (str == null) {
            return;
        }
        bp.i iVar = bp.i.Q0;
        bp.b bVarP4 = D1().p4(iVar);
        if (bVarP4 instanceof bp.a) {
            aVar = (bp.a) bVarP4;
        } else {
            bp.a aVar2 = new bp.a();
            if (bVarP4 != null) {
                aVar2.A3(bVarP4);
                aVar2.A3(bp.h.g4(0L));
            }
            aVar = aVar2;
        }
        D1().Y4(iVar, aVar);
        aVar.A3(bp.i.J3(str));
        aVar.A3(bp.h.g4(F()));
    }

    public void s(d dVar) {
        c(dVar);
    }

    public void t(e eVar) {
        c(eVar);
    }

    public void u(com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.a aVar) {
        if (aVar == null) {
            return;
        }
        a(bp.h.g4(aVar.j()));
    }

    public void v(a aVar) {
        bp.i iVar = bp.i.f20733f;
        bp.b bVarP4 = D1().p4(iVar);
        if (!(bVarP4 instanceof bp.a)) {
            bp.a aVar2 = new bp.a();
            aVar2.A3(bVarP4);
            aVar2.A3(bp.h.g4(F()));
            D1().Y4(iVar, aVar2);
            return;
        }
        bp.a aVar3 = (bp.a) bVarP4;
        for (int i15 = 0; i15 < aVar3.size(); i15++) {
            if (aVar3.k4(i15).equals(aVar.D1())) {
                int i16 = i15 + 1;
                if (aVar3.g4(i16) instanceof bp.h) {
                    aVar3.p4(i16, bp.h.g4(F()));
                }
            }
        }
    }

    public String w() {
        return D1().L4(bp.i.f20793l);
    }

    public String x() {
        return D1().L4(bp.i.f20940z);
    }

    public l<a> y() {
        l<a> lVar = new l<>();
        bp.b bVarP4 = D1().p4(bp.i.f20733f);
        if (bVarP4 instanceof bp.a) {
            Iterator<bp.b> it = ((bp.a) bVarP4).iterator();
            a aVarD = null;
            while (it.hasNext()) {
                bp.b next = it.next();
                if (next instanceof bp.l) {
                    next = ((bp.l) next).X3();
                }
                if (next instanceof bp.d) {
                    aVarD = a.d((bp.d) next);
                    aVarD.l(this);
                    lVar.a(aVarD, 0);
                } else if (next instanceof bp.h) {
                    lVar.f(aVarD, ((bp.k) next).J3());
                }
            }
        }
        if (bVarP4 instanceof bp.d) {
            a aVarD2 = a.d((bp.d) bVarP4);
            aVarD2.l(this);
            lVar.a(aVarD2, 0);
        }
        return lVar;
    }

    public l<String> z() {
        bp.i iVar = bp.i.Q0;
        l<String> lVar = new l<>();
        bp.b bVarP4 = D1().p4(iVar);
        if (bVarP4 instanceof bp.i) {
            lVar.a(((bp.i) bVarP4).A3(), 0);
        }
        if (bVarP4 instanceof bp.a) {
            Iterator<bp.b> it = ((bp.a) bVarP4).iterator();
            String strA3 = null;
            while (it.hasNext()) {
                bp.b next = it.next();
                if (next instanceof bp.l) {
                    next = ((bp.l) next).X3();
                }
                if (next instanceof bp.i) {
                    strA3 = ((bp.i) next).A3();
                    lVar.a(strA3, 0);
                } else if (next instanceof bp.h) {
                    lVar.f(strA3, ((bp.h) next).J3());
                }
            }
        }
        return lVar;
    }

    public g(bp.d dVar) {
        super(dVar);
    }
}
