package e72;

import f72.FloodAlertAlarmStateNavigationParams;
import i72.VoivodeshipPickerNavigationParams;
import m72.AlarmStateDetailsNavigationParams;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lj72/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "C", "(Lj72/a;Ler/a;Lm2/r;I)V", "F", "(Ler/a;Lm2/r;I)V", "floodalert_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t0 {
    public static final void C(final j72.a aVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2059645653);
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
                p076m2.t.o(2059645653, i16, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavContent (FloodAlertNavContent.kt:40)");
            }
            p076m2.d0.c(j72.c.c().d(aVar), y2.m.d(-1128777835, true, new er.p() { // from class: e72.r0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t0.D(aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: e72.s0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t0.E(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1128777835, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavContent.<anonymous> (FloodAlertNavContent.kt:44)");
            }
            F(aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(j72.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        C(aVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void F(final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(600152286);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(600152286, i16, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph (FloodAlertNavContent.kt:51)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            l lVar = l.f48077a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: e72.s
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t0.G(sVarJ, aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, lVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: e72.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t0.f0(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(final f00.s sVar, final er.a aVar, d1 d1Var) {
        f00.r.u(d1Var, l.f48077a, null, y2.m.b(1240597501, true, new er.r() { // from class: e72.u
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.H(aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, j.f48071a, null, y2.m.b(-321129868, true, new er.r() { // from class: e72.v
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.K(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, q.f48093a, null, y2.m.b(1887994613, true, new er.r() { // from class: e72.w
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.N(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.f48074a, null, y2.m.b(-197848202, true, new er.r() { // from class: e72.x
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.Q(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, n.f48084a, null, y2.m.b(2011276279, true, new er.r() { // from class: e72.y
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.T(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.f48081a, null, y2.m.b(-74566536, true, new er.r() { // from class: e72.z
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.W(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p.f48090a, null, y2.m.b(2134557945, true, new er.r() { // from class: e72.a0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.Z(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, o.f48087a, null, y2.m.b(48715130, true, new er.r() { // from class: e72.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.c0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        tw.c.c(d1Var, i.f48068a, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1240597501, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:58)");
        }
        f00.r.n(wVar, fr.q0.c(k72.p.class), y2.m.d(-420038641, true, new er.q() { // from class: e72.f0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.I(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f48059a.j(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-420038641, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:61)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: e72.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.J(aVar, sVar, (k72.b) obj);
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
    public static final oq.i0 J(er.a aVar, f00.s sVar, k72.b bVar) {
        if (fr.t.c(bVar, k72.b.a.f108938a)) {
            aVar.a();
        } else if (fr.t.c(bVar, k72.b.C2594b.f108939a)) {
            f00.s.l(sVar, j.f48071a, new FloodAlertAlarmStateNavigationParams(null), null, 4, null);
        } else if (fr.t.c(bVar, k72.b.c.f108940a)) {
            f00.s.m(sVar, n.f48084a, null, 2, null);
        } else {
            if (!fr.t.c(bVar, k72.b.d.f108941a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, p.f48090a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-321129868, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:83)");
        }
        f00.r.o(wVar, fr.q0.c(f72.f.class), sVar.g(j.f48071a), y2.m.d(-1999461275, true, new er.q() { // from class: e72.h0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.L(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f48059a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1999461275, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:87)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: e72.m0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.M(sVar, (f72.m.e) obj);
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
    public static final oq.i0 M(f00.s sVar, f72.m.e eVar) {
        if (fr.t.c(eVar, f72.m.e.a.f59809a)) {
            sVar.c();
        } else if (eVar instanceof f72.m.e.ToAlarmStateDetails) {
            f00.s.l(sVar, k.f48074a, new AlarmStateDetailsNavigationParams(((f72.m.e.ToAlarmStateDetails) eVar).getHydroWarning()), null, 4, null);
        } else if (eVar instanceof f72.m.e.Error) {
            f00.s.l(sVar, m.f48081a, ((f72.m.e.Error) eVar).getErrorData(), null, 4, null);
        } else {
            if (!(eVar instanceof f72.m.e.ToVoivodeshipPicker)) {
                throw new oq.p();
            }
            f00.s.l(sVar, q.f48093a, new VoivodeshipPickerNavigationParams(((f72.m.e.ToVoivodeshipPicker) eVar).getPickedVoivodeship()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1887994613, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:115)");
        }
        f00.r.o(wVar, fr.q0.c(i72.p.class), sVar.g(q.f48093a), y2.m.d(209663206, true, new er.q() { // from class: e72.g0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.O(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f48059a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(209663206, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:121)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: e72.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.P(sVar, (i72.c) obj);
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
    public static final oq.i0 P(f00.s sVar, i72.c cVar) {
        if (fr.t.c(cVar, i72.c.a.f89870a)) {
            sVar.c();
        } else {
            if (!(cVar instanceof i72.c.GoBackWithResult)) {
                throw new oq.p();
            }
            f00.s.l(sVar, j.f48071a, new FloodAlertAlarmStateNavigationParams(((i72.c.GoBackWithResult) cVar).getSelectedVoivodeship()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-197848202, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:139)");
        }
        f00.r.o(wVar, fr.q0.c(m72.o.class), sVar.g(k.f48074a), y2.m.d(-1876179609, true, new er.q() { // from class: e72.j0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.R(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f48059a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1876179609, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:145)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: e72.r
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.S(sVar, (m72.b) obj);
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
    public static final oq.i0 S(f00.s sVar, m72.b bVar) {
        if (fr.t.c(bVar, m72.b.a.f124061a)) {
            sVar.c();
        } else {
            if (!fr.t.c(bVar, m72.b.C3040b.f124062a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, o.f48087a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2011276279, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:159)");
        }
        f00.r.n(wVar, fr.q0.c(o72.r.class), y2.m.d(-427189367, true, new er.q() { // from class: e72.e0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.U(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f48059a.l(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-427189367, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:162)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: e72.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.V(sVar, (o72.b) obj);
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
    public static final oq.i0 V(f00.s sVar, o72.b bVar) {
        if (!fr.t.c(bVar, o72.b.a.f142879a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-74566536, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:173)");
        }
        m mVar = m.f48081a;
        f00.r.r(wVar, mVar, sVar.g(mVar), y2.m.d(1992375769, true, new er.q() { // from class: e72.d0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.X(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1992375769, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:177)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: e72.o0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.Y(sVar, (hb4.b.a) obj);
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
    public static final oq.i0 Y(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2134557945, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:187)");
        }
        f00.r.n(wVar, fr.q0.c(s72.t.class), y2.m.d(-303907701, true, new er.q() { // from class: e72.i0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.a0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f48059a.n(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-303907701, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:190)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: e72.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.b0(sVar, (s72.a.f) obj);
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
    public static final oq.i0 b0(f00.s sVar, s72.a.f fVar) {
        if (fr.t.c(fVar, s72.a.f.C4589a.f178724a)) {
            sVar.c();
        } else if (fVar instanceof s72.a.f.OpenGpsDialog) {
            f00.s.l(sVar, i.f48068a, ((s72.a.f.OpenGpsDialog) fVar).getNavigationDialogModel(), null, 4, null);
        } else if (fVar instanceof s72.a.f.Error) {
            f00.s.l(sVar, m.f48081a, ((s72.a.f.Error) fVar).getErrorData(), null, 4, null);
        } else {
            if (!fr.t.c(fVar, s72.a.f.d.f178728a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, o.f48087a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(48715130, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:212)");
        }
        f00.r.n(wVar, fr.q0.c(r72.l.class), y2.m.d(1905216780, true, new er.q() { // from class: e72.k0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.d0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f48059a.m(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1905216780, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.FloodAlertNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloodAlertNavContent.kt:215)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: e72.p0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.e0(sVar, (r72.b) obj);
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
    public static final oq.i0 e0(f00.s sVar, r72.b bVar) {
        if (!fr.t.c(bVar, r72.b.a.f172278a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(er.a aVar, int i15, p076m2.r rVar, int i16) {
        F(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
