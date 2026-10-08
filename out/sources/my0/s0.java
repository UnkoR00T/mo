package my0;

import hz0.SearchSetupData;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import wy0.LegendEntryData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lny0/a;", "airQualityColorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "I", "(Lny0/a;Ler/a;Lm2/r;I)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ler/a;Lm2/r;I)V", "airquality_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s0 {
    public static final void I(final ny0.a aVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1361346603);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1361346603, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavContent (AirQualityNavContent.kt:46)");
            }
            p076m2.d0.c(ny0.c.c().d(aVar), y2.m.d(-254802795, true, new er.p() { // from class: my0.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s0.J(aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: my0.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s0.K(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-254802795, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavContent.<anonymous> (AirQualityNavContent.kt:50)");
            }
            L(aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(ny0.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        I(aVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void L(final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(860561031);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(860561031, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph (AirQualityNavContent.kt:59)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            b bVar = b.f129312a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: my0.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s0.M(sVarJ, aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, bVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: my0.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s0.r0(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final oq.i0 M(final f00.s sVar, final er.a aVar, d1 d1Var) {
        f00.r.u(d1Var, b.f129312a, null, y2.m.b(1501006246, true, new er.r() { // from class: my0.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s0.N(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, g.f129338a, null, y2.m.b(-60721123, true, new er.r() { // from class: my0.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s0.Q(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.f129342a, null, y2.m.b(-2146563938, true, new er.r() { // from class: my0.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s0.T(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.f129308a, null, y2.m.b(62560543, true, new er.r() { // from class: my0.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s0.W(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, f.f129335a, null, y2.m.b(-2023282272, true, new er.r() { // from class: my0.t
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s0.Z(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i.f129346a, null, y2.m.b(185842209, true, new er.r() { // from class: my0.u
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s0.c0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, j.f129349a, null, y2.m.b(-1900000606, true, new er.r() { // from class: my0.w
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s0.f0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.f129328a, null, y2.m.b(309123875, true, new er.r() { // from class: my0.x
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s0.i0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, c.f129324a, new f00.g0.Dialog(null, 1, 0 == true ? 1 : 0), y2.m.b(-1776718940, true, new er.r() { // from class: my0.y
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s0.l0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, e.f129331a, null, y2.m.b(432405541, true, new er.r() { // from class: my0.z
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s0.o0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1501006246, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:66)");
        }
        mr.c cVarC = fr.q0.c(qy0.v.class);
        py0.b bVar = (py0.b) sVar.g(b.f129312a);
        if (bVar == null) {
            bVar = py0.b.DEFAULT;
        }
        f00.r.o(wVar, cVarC, bVar, y2.m.d(-1901853737, true, new er.q() { // from class: my0.c0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s0.O(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b1.f129315a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1901853737, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:71)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: my0.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return s0.P(aVar, sVar, (qy0.a.g) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(er.a aVar, f00.s sVar, qy0.a.g gVar) {
        if (fr.t.c(gVar, qy0.a.g.C4282a.f169347a)) {
            aVar.a();
        } else if (fr.t.c(gVar, qy0.a.g.d.f169350a)) {
            f00.s.l(sVar, g.f129338a, kh0.l.UNKNOWN, null, 4, null);
        } else if (gVar instanceof qy0.a.g.Error) {
            f00.s.l(sVar, e.f129331a, ((qy0.a.g.Error) gVar).getErrorData(), null, 4, null);
        } else if (gVar instanceof qy0.a.g.ToPoint) {
            f00.s.l(sVar, h.f129342a, ((qy0.a.g.ToPoint) gVar).getPointDetailsEntryPointData(), null, 4, null);
        } else if (gVar instanceof qy0.a.g.ShowNavigationDialog) {
            f00.s.l(sVar, c.f129324a, ((qy0.a.g.ShowNavigationDialog) gVar).getDialogData(), null, 4, null);
        } else {
            if (!(gVar instanceof qy0.a.g.GoToEditWidget)) {
                throw new oq.p();
            }
            f00.s.l(sVar, d.f129328a, ((qy0.a.g.GoToEditWidget) gVar).getDashboardFavoritePoints(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-60721123, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:106)");
        }
        f00.r.o(wVar, fr.q0.c(xy0.n0.class), sVar.g(g.f129338a), y2.m.d(-1739052530, true, new er.q() { // from class: my0.e0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s0.R(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b1.f129315a.l(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1739052530, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:110)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: my0.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return s0.S(sVar, aVar, (xy0.c.n) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(f00.s sVar, er.a aVar, xy0.c.n nVar) {
        if (fr.t.c(nVar, xy0.c.n.a.f222130a)) {
            b bVar = b.f129312a;
            sVar.j(bVar, py0.b.DEFAULT, bVar);
        } else if (fr.t.c(nVar, xy0.c.n.d.f222133a)) {
            f00.s.l(sVar, f.f129335a, new LegendEntryData(py0.c.PM25, wy0.c.MAP), null, 4, null);
        } else if (nVar instanceof xy0.c.n.ToPointDetails) {
            f00.s.l(sVar, h.f129342a, ((xy0.c.n.ToPointDetails) nVar).getPointEntryPointData(), null, 4, null);
        } else if (nVar instanceof xy0.c.n.OpenGpsDialog) {
            f00.s.l(sVar, c.f129324a, ((xy0.c.n.OpenGpsDialog) nVar).getDialogData(), null, 4, null);
        } else if (fr.t.c(nVar, xy0.c.n.b.f222131a)) {
            aVar.a();
        } else if (nVar instanceof xy0.c.n.Error) {
            f00.s.l(sVar, e.f129331a, ((xy0.c.n.Error) nVar).getErrorData(), null, 4, null);
        } else {
            if (!(nVar instanceof xy0.c.n.ToSearch)) {
                throw new oq.p();
            }
            f00.s.l(sVar, j.f129349a, new SearchSetupData(((xy0.c.n.ToSearch) nVar).a()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2146563938, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:159)");
        }
        f00.r.o(wVar, fr.q0.c(az0.o.class), sVar.g(h.f129342a), y2.m.d(470071951, true, new er.q() { // from class: my0.h0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s0.U(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b1.f129315a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(470071951, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:163)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: my0.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return s0.V(sVar, aVar, (az0.a.h) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(f00.s sVar, er.a aVar, az0.a.h hVar) {
        if (hVar instanceof az0.a.h.GoToMap) {
            f00.s.l(sVar, g.f129338a, ((az0.a.h.GoToMap) hVar).getQualityRate(), null, 4, null);
        } else if (fr.t.c(hVar, az0.a.h.C0356a.f15262a)) {
            sVar.c();
        } else if (hVar instanceof az0.a.h.GoToClosePoint) {
            f00.s.l(sVar, a.f129308a, ((az0.a.h.GoToClosePoint) hVar).getEntryPointData(), null, 4, null);
        } else if (hVar instanceof az0.a.h.OpenLegend) {
            f00.s.l(sVar, f.f129335a, ((az0.a.h.OpenLegend) hVar).getLegendEntryData(), null, 4, null);
        } else if (hVar instanceof az0.a.h.Error) {
            f00.s.l(sVar, e.f129331a, ((az0.a.h.Error) hVar).getErrorData(), null, 4, null);
        } else if (hVar instanceof az0.a.h.OpenDeleteFromFavouriteDialog) {
            f00.s.l(sVar, c.f129324a, ((az0.a.h.OpenDeleteFromFavouriteDialog) hVar).getDialogData(), null, 4, null);
        } else if (hVar instanceof az0.a.h.GoToDashboard) {
            b bVar = b.f129312a;
            sVar.j(bVar, ((az0.a.h.GoToDashboard) hVar).getData(), bVar);
        } else if (fr.t.c(hVar, az0.a.h.g.f15268a)) {
            f00.s.m(sVar, i.f129346a, null, 2, null);
        } else {
            if (!fr.t.c(hVar, az0.a.h.b.f15263a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(62560543, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:214)");
        }
        f00.r.o(wVar, fr.q0.c(az0.o.class), sVar.g(a.f129308a), y2.m.d(-1615770864, true, new er.q() { // from class: my0.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s0.X(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b1.f129315a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1615770864, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:218)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: my0.p0
                @Override // er.l
                public final Object b(Object obj) {
                    return s0.Y(sVar, aVar, (az0.a.h) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(f00.s sVar, er.a aVar, az0.a.h hVar) {
        if (hVar instanceof az0.a.h.GoToMap) {
            f00.s.l(sVar, g.f129338a, ((az0.a.h.GoToMap) hVar).getQualityRate(), null, 4, null);
        } else if (fr.t.c(hVar, az0.a.h.C0356a.f15262a)) {
            sVar.c();
        } else if (!(hVar instanceof az0.a.h.GoToClosePoint)) {
            if (hVar instanceof az0.a.h.OpenLegend) {
                f00.s.l(sVar, f.f129335a, ((az0.a.h.OpenLegend) hVar).getLegendEntryData(), null, 4, null);
            } else if (hVar instanceof az0.a.h.Error) {
                f00.s.l(sVar, e.f129331a, ((az0.a.h.Error) hVar).getErrorData(), null, 4, null);
            } else if (hVar instanceof az0.a.h.OpenDeleteFromFavouriteDialog) {
                f00.s.l(sVar, c.f129324a, ((az0.a.h.OpenDeleteFromFavouriteDialog) hVar).getDialogData(), null, 4, null);
            } else if (hVar instanceof az0.a.h.GoToDashboard) {
                b bVar = b.f129312a;
                sVar.j(bVar, ((az0.a.h.GoToDashboard) hVar).getData(), bVar);
            } else if (fr.t.c(hVar, az0.a.h.g.f15268a)) {
                f00.s.m(sVar, i.f129346a, null, 2, null);
            } else {
                if (!fr.t.c(hVar, az0.a.h.b.f15263a)) {
                    throw new oq.p();
                }
                aVar.a();
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2023282272, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:261)");
        }
        f00.r.o(wVar, fr.q0.c(uy0.t.class), sVar.g(f.f129335a), y2.m.d(593353617, true, new er.q() { // from class: my0.f0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s0.a0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b1.f129315a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(593353617, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:265)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: my0.m0
                @Override // er.l
                public final Object b(Object obj) {
                    return s0.b0(sVar, (uy0.c.InterfaceC5258c) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(f00.s sVar, uy0.c.InterfaceC5258c interfaceC5258c) {
        if (fr.t.c(interfaceC5258c, uy0.c.InterfaceC5258c.a.f202164a)) {
            sVar.c();
        } else {
            if (!(interfaceC5258c instanceof uy0.c.InterfaceC5258c.Error)) {
                throw new oq.p();
            }
            f00.s.l(sVar, e.f129331a, ((uy0.c.InterfaceC5258c.Error) interfaceC5258c).getErrorData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(185842209, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:280)");
        }
        f00.r.n(wVar, fr.q0.c(fz0.j.class), y2.m.d(2042343859, true, new er.q() { // from class: my0.i0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s0.d0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b1.f129315a.p(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2042343859, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:283)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: my0.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return s0.e0(sVar, (fz0.b) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(f00.s sVar, fz0.b bVar) {
        if (!(bVar instanceof fz0.b.a)) {
            throw new oq.p();
        }
        b bVar2 = b.f129312a;
        sVar.j(bVar2, py0.b.POINT_ADDED, bVar2);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1900000606, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:302)");
        }
        f00.r.o(wVar, fr.q0.c(hz0.q.class), sVar.g(j.f129349a), y2.m.d(716635283, true, new er.q() { // from class: my0.k0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s0.g0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b1.f129315a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(716635283, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:306)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: my0.v
                @Override // er.l
                public final Object b(Object obj) {
                    return s0.h0(sVar, (hz0.a.f) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(f00.s sVar, hz0.a.f fVar) {
        if (fVar instanceof hz0.a.f.C2041a) {
            sVar.c();
        } else if (fVar instanceof hz0.a.f.GoToPoint) {
            f00.s.l(sVar, h.f129342a, ((hz0.a.f.GoToPoint) fVar).getPointDetails(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(309123875, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:321)");
        }
        f00.r.o(wVar, fr.q0.c(sy0.w.class), sVar.g(d.f129328a), y2.m.d(-1369207532, true, new er.q() { // from class: my0.b0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s0.j0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b1.f129315a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1369207532, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:325)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: my0.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return s0.k0(sVar, (sy0.c.f) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k0(f00.s sVar, sy0.c.f fVar) {
        if (fVar instanceof sy0.c.f.Close) {
            b bVar = b.f129312a;
            sVar.j(bVar, ((sy0.c.f.Close) fVar).getData(), bVar);
        } else if (fVar instanceof sy0.c.f.ShowEditDialog) {
            f00.s.l(sVar, c.f129324a, ((sy0.c.f.ShowEditDialog) fVar).getDialogData(), null, 4, null);
        } else {
            if (!(fVar instanceof sy0.c.f.Error)) {
                throw new oq.p();
            }
            f00.s.l(sVar, e.f129331a, ((sy0.c.f.Error) fVar).getErrorData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1776718940, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:353)");
        }
        c cVar = c.f129324a;
        f00.r.r(wVar, cVar, sVar.g(cVar), y2.m.d(-230122961, true, new er.q() { // from class: my0.j0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s0.m0(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-230122961, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:357)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: my0.k
                @Override // er.l
                public final Object b(Object obj) {
                    return s0.n0(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n0(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(432405541, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:367)");
        }
        e eVar = e.f129331a;
        f00.r.r(wVar, eVar, sVar.g(eVar), y2.m.d(-1795619450, true, new er.q() { // from class: my0.d0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s0.p0(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p0(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1795619450, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.AirQualityNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AirQualityNavContent.kt:371)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: my0.o0
                @Override // er.l
                public final Object b(Object obj) {
                    return s0.q0(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q0(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r0(er.a aVar, int i15, p076m2.r rVar, int i16) {
        L(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
