package rd;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r0.m1;

/* JADX INFO: loaded from: classes3.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173231a = sd.c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static sd.c.a f173232b = sd.c.a.a("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final sd.c.a f173233c = sd.c.a.a("list");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final sd.c.a f173234d = sd.c.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0044. Please report as an issue. */
    public static fd.f a(sd.c cVar) {
        cVar = cVar;
        float fE = td.m.e();
        r0.a0<pd.e> a0Var = new r0.a0<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        m1<md.d> m1Var = new m1<>();
        fd.f fVar = new fd.f();
        cVar.Y();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iNextDouble = 0;
        int iNextDouble2 = 0;
        while (cVar.p()) {
            switch (cVar.E(f173231a)) {
                case 0:
                    iNextDouble2 = (int) cVar.nextDouble();
                    fE = fE;
                    break;
                case 1:
                    iNextDouble = (int) cVar.nextDouble();
                    fE = fE;
                    break;
                case 2:
                    fNextDouble = (float) cVar.nextDouble();
                    fE = fE;
                    break;
                case 3:
                    fNextDouble2 = ((float) cVar.nextDouble()) - 0.01f;
                    fE = fE;
                    break;
                case 4:
                    fNextDouble3 = (float) cVar.nextDouble();
                    fE = fE;
                    break;
                case 5:
                    String[] strArrSplit = cVar.q2().split("\\.");
                    if (!td.m.j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        fVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    break;
                case 6:
                    e(cVar, fVar, arrayList, a0Var);
                    break;
                case 7:
                    b(cVar, fVar, map, map2);
                    break;
                case 8:
                    d(cVar, map3);
                    break;
                case 9:
                    c(cVar, fVar, m1Var);
                    break;
                case 10:
                    f(cVar, arrayList2);
                    break;
                default:
                    cVar.H();
                    cVar.G0();
                    break;
            }
        }
        float f15 = fE;
        fVar.t(new Rect(0, 0, (int) (iNextDouble2 * f15), (int) (iNextDouble * f15)), fNextDouble, fNextDouble2, fNextDouble3, arrayList, a0Var, map, map2, td.m.e(), m1Var, map3, arrayList2, iNextDouble2, iNextDouble);
        return fVar;
    }

    private static void b(sd.c cVar, fd.f fVar, Map<String, List<pd.e>> map, Map<String, fd.d0> map2) {
        cVar.h();
        while (cVar.p()) {
            ArrayList arrayList = new ArrayList();
            r0.a0 a0Var = new r0.a0();
            cVar.Y();
            int iNextInt = 0;
            int iNextInt2 = 0;
            String strQ2 = null;
            String strQ3 = null;
            String strQ4 = null;
            while (cVar.p()) {
                int iE = cVar.E(f173232b);
                if (iE == 0) {
                    strQ2 = cVar.q2();
                } else if (iE == 1) {
                    cVar.h();
                    while (cVar.p()) {
                        pd.e eVarB = v.b(cVar, fVar);
                        a0Var.m(eVarB.e(), eVarB);
                        arrayList.add(eVarB);
                    }
                    cVar.m();
                } else if (iE == 2) {
                    iNextInt = cVar.nextInt();
                } else if (iE == 3) {
                    iNextInt2 = cVar.nextInt();
                } else if (iE == 4) {
                    strQ3 = cVar.q2();
                } else if (iE != 5) {
                    cVar.H();
                    cVar.G0();
                } else {
                    strQ4 = cVar.q2();
                }
            }
            cVar.h0();
            if (strQ3 != null) {
                fd.d0 d0Var = new fd.d0(iNextInt, iNextInt2, strQ2, strQ3, strQ4);
                map2.put(d0Var.e(), d0Var);
            } else {
                map.put(strQ2, arrayList);
            }
        }
        cVar.m();
    }

    private static void c(sd.c cVar, fd.f fVar, m1<md.d> m1Var) {
        cVar.h();
        while (cVar.p()) {
            md.d dVarA = m.a(cVar, fVar);
            m1Var.n(dVarA.hashCode(), dVarA);
        }
        cVar.m();
    }

    private static void d(sd.c cVar, Map<String, md.c> map) {
        cVar.Y();
        while (cVar.p()) {
            if (cVar.E(f173233c) != 0) {
                cVar.H();
                cVar.G0();
            } else {
                cVar.h();
                while (cVar.p()) {
                    md.c cVarA = n.a(cVar);
                    map.put(cVarA.b(), cVarA);
                }
                cVar.m();
            }
        }
        cVar.h0();
    }

    private static void e(sd.c cVar, fd.f fVar, List<pd.e> list, r0.a0<pd.e> a0Var) {
        cVar.h();
        int i15 = 0;
        while (cVar.p()) {
            pd.e eVarB = v.b(cVar, fVar);
            if (eVarB.g() == pd.e.a.IMAGE) {
                i15++;
            }
            list.add(eVarB);
            a0Var.m(eVarB.e(), eVarB);
            if (i15 > 4) {
                td.e.c("You have " + i15 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.m();
    }

    private static void f(sd.c cVar, List<md.h> list) {
        cVar.h();
        while (cVar.p()) {
            cVar.Y();
            float fNextDouble = 0.0f;
            String strQ2 = null;
            float fNextDouble2 = 0.0f;
            while (cVar.p()) {
                int iE = cVar.E(f173234d);
                if (iE == 0) {
                    strQ2 = cVar.q2();
                } else if (iE == 1) {
                    fNextDouble = (float) cVar.nextDouble();
                } else if (iE != 2) {
                    cVar.H();
                    cVar.G0();
                } else {
                    fNextDouble2 = (float) cVar.nextDouble();
                }
            }
            cVar.h0();
            list.add(new md.h(strQ2, fNextDouble, fNextDouble2));
        }
        cVar.m();
    }
}
