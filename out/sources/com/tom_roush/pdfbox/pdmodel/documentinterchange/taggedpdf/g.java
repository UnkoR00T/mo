package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import bp.k;
import bp.p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final float f37064c = -1.0f;

    public g() {
    }

    protected void A(String str, float[] fArr) {
        bp.a aVar = new bp.a();
        for (float f15 : fArr) {
            aVar.A3(new bp.f(f15));
        }
        bp.b bVarR4 = D1().r4(str);
        D1().a5(str, aVar);
        j(bVarR4, D1().r4(str));
    }

    protected void B(String str, String[] strArr) {
        bp.b bVarR4 = D1().r4(str);
        bp.a aVar = new bp.a();
        for (String str2 : strArr) {
            aVar.A3(new p(str2));
        }
        D1().a5(str, aVar);
        j(bVarR4, D1().r4(str));
    }

    protected void C(String str, op.f fVar) {
        bp.b bVarR4 = D1().r4(str);
        D1().b5(str, fVar);
        j(bVarR4, fVar == null ? null : fVar.D1());
    }

    protected void D(String str, c cVar) {
        bp.b bVarR4 = D1().r4(str);
        D1().b5(str, cVar);
        j(bVarR4, cVar == null ? null : cVar.D1());
    }

    protected void E(String str, int i15) {
        bp.b bVarR4 = D1().r4(str);
        D1().X4(str, i15);
        j(bVarR4, D1().r4(str));
    }

    protected void F(String str, String str2) {
        bp.b bVarR4 = D1().r4(str);
        D1().e5(str, str2);
        j(bVarR4, D1().r4(str));
    }

    protected void G(String str, float f15) {
        bp.b bVarR4 = D1().r4(str);
        D1().V4(str, f15);
        j(bVarR4, D1().r4(str));
    }

    protected void H(String str, int i15) {
        bp.b bVarR4 = D1().r4(str);
        D1().X4(str, i15);
        j(bVarR4, D1().r4(str));
    }

    protected void I(String str, String str2) {
        bp.b bVarR4 = D1().r4(str);
        D1().h5(str, str2);
        j(bVarR4, D1().r4(str));
    }

    protected String[] m(String str) {
        bp.b bVarR4 = D1().r4(str);
        if (!(bVarR4 instanceof bp.a)) {
            return null;
        }
        bp.a aVar = (bp.a) bVarR4;
        String[] strArr = new String[aVar.size()];
        for (int i15 = 0; i15 < aVar.size(); i15++) {
            strArr[i15] = ((bp.i) aVar.k4(i15)).A3();
        }
        return strArr;
    }

    protected op.f n(String str) {
        bp.a aVar = (bp.a) D1().r4(str);
        if (aVar != null) {
            return new op.f(aVar);
        }
        return null;
    }

    protected Object o(String str) {
        bp.a aVar = (bp.a) D1().r4(str);
        if (aVar == null) {
            return null;
        }
        if (aVar.size() == 3) {
            return new op.f(aVar);
        }
        if (aVar.size() == 4) {
            return new c(aVar);
        }
        return null;
    }

    protected int p(String str, int i15) {
        return D1().B4(str, i15);
    }

    protected String q(String str) {
        return D1().J4(str);
    }

    protected String r(String str, String str2) {
        return D1().K4(str, str2);
    }

    protected Object s(String str, String str2) {
        bp.b bVarR4 = D1().r4(str);
        if (!(bVarR4 instanceof bp.a)) {
            return bVarR4 instanceof bp.i ? ((bp.i) bVarR4).A3() : str2;
        }
        bp.a aVar = (bp.a) bVarR4;
        String[] strArr = new String[aVar.size()];
        for (int i15 = 0; i15 < aVar.size(); i15++) {
            bp.b bVarK4 = aVar.k4(i15);
            if (bVarK4 instanceof bp.i) {
                strArr[i15] = ((bp.i) bVarK4).A3();
            }
        }
        return strArr;
    }

    protected float t(String str) {
        return D1().v4(str);
    }

    protected float u(String str, float f15) {
        return D1().w4(str, f15);
    }

    protected Object v(String str, float f15) {
        bp.b bVarR4 = D1().r4(str);
        if (!(bVarR4 instanceof bp.a)) {
            if (bVarR4 instanceof k) {
                return Float.valueOf(((k) bVarR4).i3());
            }
            if (f15 == f37064c) {
                return null;
            }
            return Float.valueOf(f15);
        }
        bp.a aVar = (bp.a) bVarR4;
        float[] fArr = new float[aVar.size()];
        for (int i15 = 0; i15 < aVar.size(); i15++) {
            bp.b bVarK4 = aVar.k4(i15);
            if (bVarK4 instanceof k) {
                fArr[i15] = ((k) bVarK4).i3();
            }
        }
        return fArr;
    }

    protected Object w(String str, String str2) {
        bp.b bVarR4 = D1().r4(str);
        if (bVarR4 instanceof k) {
            return Float.valueOf(((k) bVarR4).i3());
        }
        return bVarR4 instanceof bp.i ? ((bp.i) bVarR4).A3() : str2;
    }

    protected String x(String str) {
        return D1().M4(str);
    }

    public boolean y(String str) {
        return D1().r4(str) != null;
    }

    protected void z(String str, String[] strArr) {
        bp.b bVarR4 = D1().r4(str);
        bp.a aVar = new bp.a();
        for (String str2 : strArr) {
            aVar.A3(bp.i.J3(str2));
        }
        D1().a5(str, aVar);
        j(bVarR4, D1().r4(str));
    }

    public g(bp.d dVar) {
        super(dVar);
    }
}
