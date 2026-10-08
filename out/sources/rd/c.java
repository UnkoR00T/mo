package rd;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173175a = sd.c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final sd.c.a f173176b = sd.c.a.a("k");

    private static void a(nd.b bVar, fd.f fVar) {
        Float fValueOf = Float.valueOf(0.0f);
        if (bVar.m().isEmpty()) {
            bVar.m().add(new ud.a(fVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fVar.f())));
        } else if (((ud.a) bVar.m().get(0)).f197576b == 0) {
            bVar.m().set(0, new ud.a(fVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fVar.f())));
        }
    }

    private static boolean b(nd.e eVar) {
        if (eVar != null) {
            return eVar.k() && eVar.m().get(0).f197576b.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean c(nd.o<PointF, PointF> oVar) {
        if (oVar != null) {
            return !(oVar instanceof nd.i) && oVar.k() && oVar.m().get(0).f197576b.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean d(nd.b bVar) {
        if (bVar != null) {
            return bVar.k() && ((Float) ((ud.a) bVar.m().get(0)).f197576b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean e(nd.g gVar) {
        if (gVar != null) {
            return gVar.k() && ((ud.d) ((ud.a) gVar.m().get(0)).f197576b).a(1.0f, 1.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean f(nd.b bVar) {
        if (bVar != null) {
            return bVar.k() && ((Float) ((ud.a) bVar.m().get(0)).f197576b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean g(nd.b bVar) {
        if (bVar != null) {
            return bVar.k() && ((Float) ((ud.a) bVar.m().get(0)).f197576b).floatValue() == 0.0f;
        }
        return true;
    }

    public static nd.n h(sd.c cVar, fd.f fVar) {
        boolean z15 = cVar.y() == sd.c.b.BEGIN_OBJECT;
        if (z15) {
            cVar.Y();
        }
        nd.e eVarA = null;
        nd.o<PointF, PointF> oVarB = null;
        nd.b bVarF = null;
        nd.g gVarJ = null;
        nd.b bVarF2 = null;
        nd.b bVarF3 = null;
        nd.b bVarF4 = null;
        nd.b bVarF5 = null;
        nd.b bVarF6 = null;
        nd.d dVarH = null;
        nd.b bVarF7 = null;
        nd.b bVarF8 = null;
        while (cVar.p()) {
            switch (cVar.E(f173175a)) {
                case 0:
                    cVar.Y();
                    while (cVar.p()) {
                        if (cVar.E(f173176b) != 0) {
                            cVar.H();
                            cVar.G0();
                        } else {
                            eVarA = a.a(cVar, fVar);
                        }
                    }
                    cVar.h0();
                    break;
                case 1:
                    oVarB = a.b(cVar, fVar);
                    break;
                case 2:
                    gVarJ = d.j(cVar, fVar);
                    break;
                case 3:
                    bVarF6 = d.f(cVar, fVar, false);
                    a(bVarF6, fVar);
                    break;
                case 4:
                    bVarF = d.f(cVar, fVar, false);
                    a(bVarF, fVar);
                    break;
                case 5:
                    dVarH = d.h(cVar, fVar);
                    break;
                case 6:
                    bVarF7 = d.f(cVar, fVar, false);
                    break;
                case 7:
                    bVarF8 = d.f(cVar, fVar, false);
                    break;
                case 8:
                    bVarF2 = d.f(cVar, fVar, false);
                    break;
                case 9:
                    bVarF3 = d.f(cVar, fVar, false);
                    break;
                case 10:
                    bVarF4 = d.f(cVar, fVar, false);
                    a(bVarF4, fVar);
                    break;
                case 11:
                    bVarF5 = d.f(cVar, fVar, false);
                    a(bVarF5, fVar);
                    break;
                default:
                    cVar.H();
                    cVar.G0();
                    break;
            }
        }
        if (z15) {
            cVar.h0();
        }
        return new nd.n(b(eVarA) ? null : eVarA, c(oVarB) ? null : oVarB, e(gVarJ) ? null : gVarJ, d(bVarF) ? null : bVarF, dVarH, bVarF7, bVarF8, g(bVarF2) ? null : bVarF2, f(bVarF3) ? null : bVarF3, d(bVarF4) ? null : bVarF4, d(bVarF5) ? null : bVarF5, d(bVarF6) ? null : bVarF6);
    }
}
