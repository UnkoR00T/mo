package fe3;

import android.os.Bundle;
import eh3.SummaryContract;
import java.time.LocalDate;
import java.util.Iterator;
import p071kotlin.Metadata;
import ug3.SetupData;
import vy.Coordinates;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Log3/x;", "newCollisionNavigation", "Loq/i0;", "O0", "(Log3/x;Lm2/r;I)V", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A1(final f00.s sVar, final og3.x xVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1756795340, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:243)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(xVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.b4
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.B1(sVar, xVar, (bg3.a) obj);
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
    public static final oq.i0 A2(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(850842021, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:479)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.n3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.B2(xVar, sVar, (sf3.a.b) obj);
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
    public static final oq.i0 B1(f00.s sVar, og3.x xVar, bg3.a aVar) {
        if (fr.t.c(aVar, bg3.a.c.f19371a)) {
            f00.s.m(sVar, y4.r.f62080a, null, 2, null);
        } else if (fr.t.c(aVar, bg3.a.C0494a.f19369a)) {
            xVar.A();
        } else {
            if (!fr.t.c(aVar, bg3.a.b.f19370a)) {
                throw new oq.p();
            }
            xVar.e4();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B2(og3.x xVar, f00.s sVar, sf3.a.b bVar) {
        if (fr.t.c(bVar, sf3.a.b.C4663a.f181337a)) {
            xVar.e4();
        } else if (bVar instanceof sf3.a.b.ShowError) {
            f00.s.l(sVar, w4.f62021a, ((sf3.a.b.ShowError) bVar).getErrorData(), null, 4, null);
        } else if (bVar instanceof sf3.a.b.ShowDialog) {
            f00.s.l(sVar, t4.f61989a, ((sf3.a.b.ShowDialog) bVar).getNavigationDialogModel(), null, 4, null);
        } else if (bVar instanceof sf3.a.b.OpenPlace) {
            f00.s.l(sVar, v4.f62011a, ((sf3.a.b.OpenPlace) bVar).getShowLocalizationModel(), null, 4, null);
        } else {
            if (!(bVar instanceof sf3.a.b.C4664b)) {
                throw new oq.p();
            }
            xVar.B1();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C1(final og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(764617012, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:843)");
        }
        f00.r.o(wVar, fr.q0.c(sg3.p.class), xVar, y2.m.d(-284223131, true, new er.q() { // from class: fe3.b3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.D1(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.W(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C2(og3.x xVar, int i15, p076m2.r rVar, int i16) {
        O0(xVar, rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D1(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-284223131, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:847)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.o3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.E1(xVar, sVar, (sg3.a.d) obj);
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
    public static final oq.i0 E1(og3.x xVar, f00.s sVar, sg3.a.d dVar) {
        if (dVar instanceof sg3.a.d.C4668a) {
            xVar.A();
        } else if (dVar instanceof sg3.a.d.b) {
            xVar.B1();
        } else if (dVar instanceof sg3.a.d.ShowError) {
            f00.s.l(sVar, w4.f62021a, ((sg3.a.d.ShowError) dVar).getErrorData(), null, 4, null);
        } else if (dVar instanceof sg3.a.d.GoToSummaryStatement) {
            f00.s.l(sVar, y4.p.f62076a, ((sg3.a.d.GoToSummaryStatement) dVar).getStatementDetails(), null, 4, null);
        } else if (fr.t.c(dVar, sg3.a.d.f.f181556a)) {
            xVar.e4();
        } else {
            if (!fr.t.c(dVar, sg3.a.d.c.f181553a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, y4.e.f62054a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F1(final og3.x xVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-241964578, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:879)");
        }
        f00.r.n(wVar, fr.q0.c(xg3.m.class), y2.m.d(581057008, true, new er.q() { // from class: fe3.g2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.G1(xVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.C(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G1(final og3.x xVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(581057008, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:882)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.f3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.H1(xVar, (xg3.b) obj);
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
    public static final oq.i0 H1(og3.x xVar, xg3.b bVar) {
        if (fr.t.c(bVar, xg3.b.a.f218540a)) {
            xVar.A();
        } else {
            if (!fr.t.c(bVar, xg3.b.C5841b.f218541a)) {
                throw new oq.p();
            }
            xVar.e4();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I1(f00.s sVar, final og3.x xVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1469313789, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:898)");
        }
        f00.r.o(wVar, fr.q0.c(zg3.m.class), sVar.g(y4.n.f62072a), y2.m.d(420473646, true, new er.q() { // from class: fe3.b2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.J1(xVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.X(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J1(final og3.x xVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(420473646, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:904)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.t3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.K1(xVar, (zg3.b) obj);
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
    public static final oq.i0 K1(og3.x xVar, zg3.b bVar) {
        if (fr.t.c(bVar, zg3.b.a.f235198a)) {
            xVar.A();
        } else {
            if (!fr.t.c(bVar, zg3.b.C6337b.f235199a)) {
                throw new oq.p();
            }
            xVar.e4();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L1(og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1114375140, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:918)");
        }
        f00.r.o(wVar, fr.q0.c(kf3.v.class), xVar, y2.m.d(2131752013, true, new er.q() { // from class: fe3.u2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.M1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.S(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2131752013, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:922)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.x3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.N1(sVar, (kf3.a.e) obj);
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
    public static final oq.i0 N1(f00.s sVar, kf3.a.e eVar) {
        if (fr.t.c(eVar, kf3.a.e.C2656a.f110665a)) {
            sVar.c();
        } else {
            if (!(eVar instanceof kf3.a.e.ShowDialog)) {
                throw new oq.p();
            }
            f00.s.l(sVar, t4.f61989a, ((kf3.a.e.ShowDialog) eVar).getDialogData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    public static final void O0(final og3.x xVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-855348749);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(xVar) : rVarH.G(xVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-855348749, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent (NewCollisionNavContent.kt:102)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            xw.b<og3.w.c.j> bVarG = xVar.g();
            boolean zG = rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: fe3.w0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k4.P0(sVarJ, (og3.w.c.j) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.f0.b(bVarG, (er.l) objE, rVarH, xw.b.f221619c);
            y4.h hVar = y4.h.f62060a;
            boolean zG2 = rVarH.G(sVarJ);
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(xVar))) {
                z15 = true;
            }
            boolean z16 = zG2 | z15;
            Object objE2 = rVarH.E();
            if (z16 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: fe3.h1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k4.Q0(sVarJ, xVar, (p136y9.d1) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f00.d0.j(sVarJ, hVar, (er.l) objE2, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        p076m2.d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fe3.s1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k4.C2(xVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(596903227, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:940)");
        }
        f00.r.o(wVar, fr.q0.c(ii3.u.class), sVar.g(v4.f62011a), y2.m.d(-451936916, true, new er.q() { // from class: fe3.x2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.P1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.N(), rVar, ((i15 >> 3) & 14) | 27648 | (Coordinates.f208679c << 6));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P0(f00.s sVar, og3.w.c.j jVar) {
        if (jVar instanceof og3.w.c.j.a) {
            sVar.c();
        } else if (jVar instanceof og3.w.c.j.ShowExitDialog) {
            f00.s.l(sVar, t4.f61989a, ((og3.w.c.j.ShowExitDialog) jVar).getNavigationDialogModel(), null, 4, null);
        } else if (jVar instanceof og3.w.c.j.ShowErrorInNestedNavContent) {
            f00.s.l(sVar, w4.f62021a, ((og3.w.c.j.ShowErrorInNestedNavContent) jVar).getErrorData(), null, 4, null);
        } else if (fr.t.c(jVar, og3.w.c.j.b.f145682a)) {
            f00.s.m(sVar, y4.a.f62046a, null, 2, null);
        } else if (fr.t.c(jVar, og3.w.c.j.q.f145697a)) {
            f00.s.m(sVar, y4.u.f62086a, null, 2, null);
        } else if (fr.t.c(jVar, og3.w.c.j.r.f145698a)) {
            f00.s.m(sVar, y4.v.f62088a, null, 2, null);
        } else if (fr.t.c(jVar, og3.w.c.j.g.f145687a)) {
            f00.s.m(sVar, y4.i.f62062a, null, 2, null);
        } else if (fr.t.c(jVar, og3.w.c.j.d.f145684a)) {
            f00.s.m(sVar, y4.m.f62070a, null, 2, null);
        } else if (jVar instanceof og3.w.c.j.GoToPreparationStatementWaiting) {
            f00.s.l(sVar, y4.n.f62072a, ((og3.w.c.j.GoToPreparationStatementWaiting) jVar).getProcessId(), null, 4, null);
        } else if (fr.t.c(jVar, og3.w.c.j.k.f145691a)) {
            f00.s.m(sVar, y4.q.f62078a, null, 2, null);
        } else if (fr.t.c(jVar, og3.w.c.j.C3618c.f145683a)) {
            f00.s.m(sVar, y4.b.f62048a, null, 2, null);
        } else if (jVar instanceof og3.w.c.j.GoToSuccess) {
            y4.o oVar = y4.o.f62074a;
            sVar.j(oVar, ((og3.w.c.j.GoToSuccess) jVar).getSetupData(), oVar);
        } else if (fr.t.c(jVar, og3.w.c.j.e.f145685a)) {
            f00.s.m(sVar, y4.e.f62054a, null, 2, null);
        } else if (fr.t.c(jVar, og3.w.c.j.o.f145695a)) {
            f00.s.m(sVar, y4.s.f62082a, null, 2, null);
        } else if (fr.t.c(jVar, og3.w.c.j.p.f145696a)) {
            f00.s.m(sVar, y4.t.f62084a, null, 2, null);
        } else if (fr.t.c(jVar, og3.w.c.j.h.f145688a)) {
            f00.s.m(sVar, y4.j.f62064a, null, 2, null);
        } else if (fr.t.c(jVar, og3.w.c.j.s.f145699a)) {
            f00.s.m(sVar, y4.w.f62090a, null, 2, null);
        } else if (jVar instanceof og3.w.c.j.GoToSummary) {
            f00.s.l(sVar, y4.p.f62076a, ((og3.w.c.j.GoToSummary) jVar).getReadyToSignStatement(), null, 4, null);
        } else if (jVar instanceof og3.w.c.j.C3619j) {
            f00.s.m(sVar, y4.k.f62066a, null, 2, null);
        } else if (jVar instanceof og3.w.c.j.GoToSecondPersonDetails) {
            f00.s.l(sVar, y4.l.f62068a, ((og3.w.c.j.GoToSecondPersonDetails) jVar).getConfirmationModel(), null, 4, null);
        } else {
            if (!(jVar instanceof og3.w.c.j.GoToDescriptionWaiting)) {
                throw new oq.p();
            }
            f00.s.l(sVar, y4.g.f62058a, ((og3.w.c.j.GoToDescriptionWaiting) jVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-451936916, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:946)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.q3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.Q1(sVar, (ii3.d) obj);
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
    public static final oq.i0 Q0(final f00.s sVar, final og3.x xVar, p136y9.d1 d1Var) {
        sVar.getNavController().i(new y9.e0.c() { // from class: fe3.d2
            @Override // y9.e0.c
            public final void a(p136y9.e0 e0Var, p136y9.y0 y0Var, Bundle bundle) {
                k4.R0(xVar, e0Var, y0Var, bundle);
            }
        });
        f00.r.u(d1Var, y4.h.f62060a, null, y2.m.b(460933428, true, new er.r() { // from class: fe3.b1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.S0(sVar, xVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.f.f62056a, null, y2.m.b(1790628893, true, new er.r() { // from class: fe3.n1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.z1(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.a.f62046a, null, y2.m.b(-793060036, true, new er.r() { // from class: fe3.o1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.g2(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.b.f62048a, null, y2.m.b(918218331, true, new er.r() { // from class: fe3.p1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.j2(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.g.f62058a, null, y2.m.b(-1665470598, true, new er.r() { // from class: fe3.q1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.n2(sVar, xVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.q.f62078a, null, y2.m.b(45807769, true, new er.r() { // from class: fe3.r1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.q2(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.r.f62080a, null, y2.m.b(1757086136, true, new er.r() { // from class: fe3.t1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.t2(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.l.f62068a, null, y2.m.b(-826602793, true, new er.r() { // from class: fe3.u1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.w2(sVar, xVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.d.f62052a, null, y2.m.b(884675574, true, new er.r() { // from class: fe3.v1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.z2(sVar, xVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.u.f62086a, null, y2.m.b(-1699013355, true, new er.r() { // from class: fe3.o2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.V0(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.v.f62088a, null, y2.m.b(-1751986403, true, new er.r() { // from class: fe3.z2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.Y0(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.j.f62064a, null, y2.m.b(-40708036, true, new er.r() { // from class: fe3.k3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.b1(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.s.f62082a, null, y2.m.b(1670570331, true, new er.r() { // from class: fe3.v3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.e1(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.t.f62084a, null, y2.m.b(-913118598, true, new er.r() { // from class: fe3.g4
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.h1(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.w.f62090a, null, y2.m.b(798159769, true, new er.r() { // from class: fe3.j4
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.k1(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.e.f62054a, null, y2.m.b(-1785529160, true, new er.r() { // from class: fe3.x0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.n1(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.p.f62076a, null, y2.m.b(-74250793, true, new er.r() { // from class: fe3.y0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.q1(sVar, xVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.o.f62074a, null, y2.m.b(1637027574, true, new er.r() { // from class: fe3.z0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.t1(sVar, xVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.i.f62062a, null, y2.m.b(-946661355, true, new er.r() { // from class: fe3.a1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.w1(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.k.f62066a, null, y2.m.b(764617012, true, new er.r() { // from class: fe3.c1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.C1(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.m.f62070a, null, y2.m.b(-241964578, true, new er.r() { // from class: fe3.d1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.F1(xVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y4.n.f62072a, null, y2.m.b(1469313789, true, new er.r() { // from class: fe3.e1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.I1(sVar, xVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, u4.f61999a, null, y2.m.b(-1114375140, true, new er.r() { // from class: fe3.f1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.L1(xVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, v4.f62011a, null, y2.m.b(596903227, true, new er.r() { // from class: fe3.g1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.O1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m4.f61894a, null, y2.m.b(-1986785702, true, new er.r() { // from class: fe3.i1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.R1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a5.f61771a, null, y2.m.b(-275507335, true, new er.r() { // from class: fe3.j1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.U1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x4.f62033a, null, y2.m.b(1435771032, true, new er.r() { // from class: fe3.k1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.X1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, w4.f62021a, null, y2.m.b(-1147917897, true, new er.r() { // from class: fe3.l1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.a2(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        uw.m.c(d1Var, n4.f61904a, sVar);
        ww.d.c(d1Var, f5.f61825a, sVar);
        f00.r.t(d1Var, t4.f61989a, new f00.g0.Dialog(null, 1, null), y2.m.b(563360470, true, new er.r() { // from class: fe3.m1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k4.d2(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q1(f00.s sVar, ii3.d dVar) {
        if (dVar instanceof ii3.d.a) {
            sVar.c();
        } else {
            if (!(dVar instanceof ii3.d.ShowDialog)) {
                throw new oq.p();
            }
            f00.s.l(sVar, t4.f61989a, ((ii3.d.ShowDialog) dVar).getDialogData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R0(og3.x xVar, p136y9.e0 e0Var, p136y9.y0 y0Var, Bundle bundle) {
        Object next;
        Iterator<T> it = y4.INSTANCE.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fr.t.c(((y4) next).getRoute(), y0Var.u()));
        y4 y4Var = (y4) next;
        if (y4Var != null) {
            xVar.A2(y4Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1986785702, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:964)");
        }
        f00.r.n(wVar, fr.q0.c(zf3.l.class), y2.m.d(-1163764116, true, new er.q() { // from class: fe3.q2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.S1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.Z(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S0(final f00.s sVar, final og3.x xVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(460933428, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:215)");
        }
        f00.r.n(wVar, fr.q0.c(hg3.p.class), y2.m.d(-1739505054, true, new er.q() { // from class: fe3.h2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.T0(sVar, xVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.E(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1163764116, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:967)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.s3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.T1(sVar, (zf3.b) obj);
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
    public static final oq.i0 T0(final f00.s sVar, final og3.x xVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1739505054, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:218)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(xVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.f4
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.U0(sVar, xVar, (hg3.b) obj);
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
    public static final oq.i0 T1(f00.s sVar, zf3.b bVar) {
        if (!(bVar instanceof zf3.b.a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U0(f00.s sVar, og3.x xVar, hg3.b bVar) {
        if (bVar instanceof hg3.b.C1962b) {
            f00.s.m(sVar, y4.a.f62046a, null, 2, null);
        } else if (fr.t.c(bVar, hg3.b.c.f84582a)) {
            f00.s.m(sVar, a5.f61771a, null, 2, null);
        } else {
            if (!fr.t.c(bVar, hg3.b.a.f84580a)) {
                throw new oq.p();
            }
            xVar.e4();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-275507335, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:980)");
        }
        f00.r.n(wVar, fr.q0.c(qg3.l.class), y2.m.d(547514251, true, new er.q() { // from class: fe3.f2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.V1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.R(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V0(final og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1699013355, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:509)");
        }
        f00.r.o(wVar, fr.q0.c(sh3.f0.class), xVar, y2.m.d(-1732846908, true, new er.q() { // from class: fe3.c2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.W0(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.H(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(547514251, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:983)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.l3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.W1(sVar, (qg3.b) obj);
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
    public static final oq.i0 W0(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1732846908, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:513)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.e3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.X0(xVar, sVar, (sh3.c.e) obj);
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
    public static final oq.i0 W1(f00.s sVar, qg3.b bVar) {
        if (!(bVar instanceof qg3.b.a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X0(og3.x xVar, f00.s sVar, sh3.c.e eVar) {
        if (fr.t.c(eVar, sh3.c.e.b.f181729a)) {
            xVar.e4();
        } else if (fr.t.c(eVar, sh3.c.e.a.f181728a)) {
            xVar.A();
        } else if (fr.t.c(eVar, sh3.c.e.d.f181731a)) {
            xVar.U4();
        } else if (fr.t.c(eVar, sh3.c.e.C4677e.f181732a)) {
            xVar.b7();
        } else if (fr.t.c(eVar, sh3.c.e.C4676c.f181730a)) {
            xVar.B1();
        } else if (eVar instanceof sh3.c.e.ShowDialog) {
            f00.s.l(sVar, t4.f61989a, ((sh3.c.e.ShowDialog) eVar).getDialogData(), null, 4, null);
        } else {
            if (!(eVar instanceof sh3.c.e.ShowError)) {
                throw new oq.p();
            }
            f00.s.l(sVar, w4.f62021a, ((sh3.c.e.ShowError) eVar).getErrorData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1435771032, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:998)");
        }
        x4 x4Var = x4.f62033a;
        f00.r.r(wVar, x4Var, sVar.g(x4Var), y2.m.d(-1942638626, true, new er.q() { // from class: fe3.z1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.Y1(sVar, (dx3.c) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y0(final og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1751986403, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:540)");
        }
        f00.r.o(wVar, fr.q0.c(wh3.q0.class), xVar, y2.m.d(1494140750, true, new er.q() { // from class: fe3.v2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.Z0(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.V(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y1(final f00.s sVar, dx3.c cVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1942638626, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:1002)");
        }
        xw.b<dx3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.c4
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.Z1(sVar, (dx3.c.a) obj);
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
    public static final oq.i0 Z0(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1494140750, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:544)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.i3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.a1(xVar, sVar, (wh3.c) obj);
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
    public static final oq.i0 Z1(f00.s sVar, dx3.c.a aVar) {
        if (!fr.t.c(aVar, dx3.c.a.C1047a.f45490a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a1(og3.x xVar, f00.s sVar, wh3.c cVar) {
        if (fr.t.c(cVar, wh3.c.b.f213392a)) {
            xVar.e4();
        } else if (fr.t.c(cVar, wh3.c.a.f213391a)) {
            xVar.A();
        } else {
            if (!fr.t.c(cVar, wh3.c.C5638c.f213393a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, y4.j.f62064a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a2(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1147917897, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:1012)");
        }
        w4 w4Var = w4.f62021a;
        f00.r.r(wVar, w4Var, sVar.g(w4Var), y2.m.d(-463030952, true, new er.q() { // from class: fe3.w1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.b2(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b1(final og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-40708036, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:561)");
        }
        f00.r.o(wVar, fr.q0.c(kg3.p.class), xVar, y2.m.d(-1089548179, true, new er.q() { // from class: fe3.y1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.c1(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.D(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-463030952, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:1016)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.a4
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.c2(sVar, (hb4.b.a) obj);
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
    public static final oq.i0 c1(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1089548179, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:565)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.h3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.d1(xVar, sVar, (kg3.a.d) obj);
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
    public static final oq.i0 c2(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d1(og3.x xVar, f00.s sVar, kg3.a.d dVar) {
        if (fr.t.c(dVar, kg3.a.d.b.f110855a)) {
            xVar.e4();
        } else if (fr.t.c(dVar, kg3.a.d.C2663a.f110854a)) {
            xVar.A();
        } else if (fr.t.c(dVar, kg3.a.d.c.f110856a)) {
            f00.s.m(sVar, y4.s.f62082a, null, 2, null);
        } else if (dVar instanceof kg3.a.d.GoToWriteInsurance) {
            xVar.u1(((kg3.a.d.GoToWriteInsurance) dVar).getModel());
        } else {
            if (!(dVar instanceof kg3.a.d.ShowDialog)) {
                throw new oq.p();
            }
            f00.s.l(sVar, t4.f61989a, ((kg3.a.d.ShowDialog) dVar).getDialogData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(563360470, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:1039)");
        }
        t4 t4Var = t4.f61989a;
        f00.r.r(wVar, t4Var, sVar.g(t4Var), y2.m.d(918393377, true, new er.q() { // from class: fe3.m2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.e2(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e1(final og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1670570331, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:592)");
        }
        f00.r.o(wVar, fr.q0.c(mh3.m.class), xVar, y2.m.d(621730188, true, new er.q() { // from class: fe3.a2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.f1(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.I(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e2(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(918393377, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:1043)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.j3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.f2(sVar, (cb4.f.a) obj);
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
    public static final oq.i0 f1(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(621730188, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:596)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.c3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.g1(xVar, sVar, (mh3.a) obj);
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
    public static final oq.i0 f2(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g1(og3.x xVar, f00.s sVar, mh3.a aVar) {
        if (fr.t.c(aVar, mh3.a.b.f126624a)) {
            xVar.e4();
        } else if (fr.t.c(aVar, mh3.a.C3114a.f126623a)) {
            xVar.A();
        } else if (fr.t.c(aVar, mh3.a.d.f126626a)) {
            f00.s.m(sVar, y4.w.f62090a, null, 2, null);
        } else {
            if (!fr.t.c(aVar, mh3.a.c.f126625a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, y4.t.f62084a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g2(final og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-793060036, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:261)");
        }
        f00.r.o(wVar, fr.q0.c(hf3.l.class), xVar, y2.m.d(-826893589, true, new er.q() { // from class: fe3.r2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.h2(sVar, xVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.A(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h1(final og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-913118598, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:619)");
        }
        f00.r.o(wVar, fr.q0.c(ph3.r.class), xVar, y2.m.d(-1961958741, true, new er.q() { // from class: fe3.t2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.i1(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.B(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h2(final f00.s sVar, final og3.x xVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-826893589, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:265)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(xVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.e4
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.i2(sVar, xVar, (hf3.a) obj);
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
    public static final oq.i0 i1(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1961958741, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:623)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.g3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.j1(xVar, sVar, (ph3.b) obj);
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
    public static final oq.i0 i2(f00.s sVar, og3.x xVar, hf3.a aVar) {
        if (aVar instanceof hf3.a.c) {
            f00.s.m(sVar, y4.f.f62056a, null, 2, null);
        } else if (fr.t.c(aVar, hf3.a.d.f84253a)) {
            f00.s.m(sVar, y4.q.f62078a, null, 2, null);
        } else if (fr.t.c(aVar, hf3.a.C1945a.f84250a)) {
            xVar.A();
        } else {
            if (!fr.t.c(aVar, hf3.a.b.f84251a)) {
                throw new oq.p();
            }
            xVar.e4();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j1(og3.x xVar, f00.s sVar, ph3.b bVar) {
        if (fr.t.c(bVar, ph3.b.C3912b.f157780a)) {
            xVar.e4();
        } else if (fr.t.c(bVar, ph3.b.a.f157779a)) {
            xVar.A();
        } else {
            if (!fr.t.c(bVar, ph3.b.c.f157781a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, y4.w.f62090a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j2(final og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(918218331, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:288)");
        }
        f00.r.o(wVar, fr.q0.c(of3.b0.class), xVar, y2.m.d(884384778, true, new er.q() { // from class: fe3.j2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.k2(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.L(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k1(final og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(798159769, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:642)");
        }
        f00.r.o(wVar, fr.q0.c(ai3.z.class), xVar, y2.m.d(-250680374, true, new er.q() { // from class: fe3.s2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.l1(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.Q(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k2(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(884384778, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:292)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.w3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.l2(xVar, sVar, (of3.a.b) obj);
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
    public static final oq.i0 l1(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-250680374, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:646)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.m3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.m1(xVar, sVar, (ai3.a.g) obj);
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
    public static final oq.i0 l2(og3.x xVar, f00.s sVar, final of3.a.b bVar) {
        if (fr.t.c(bVar, of3.a.b.C3603a.f145160a)) {
            xVar.e4();
        } else if (bVar instanceof of3.a.b.GoToWaitingScreen) {
            f00.s.l(sVar, y4.g.f62058a, ((of3.a.b.GoToWaitingScreen) bVar).getData(), null, 4, null);
        } else if (bVar instanceof of3.a.b.ShowDataPicker) {
            of3.a.b.ShowDataPicker showDataPicker = (of3.a.b.ShowDataPicker) bVar;
            f00.s.l(sVar, n4.f61904a, new uw.j.Single(null, showDataPicker.getCrashDate().getDate(), new er.l() { // from class: fe3.i4
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.m2(bVar, (LocalDate) obj);
                }
            }, showDataPicker.getMinDate(), showDataPicker.getMaxDate(), 1, null), null, 4, null);
        } else if (bVar instanceof of3.a.b.C3604b) {
            f00.s.m(sVar, u4.f61999a, null, 2, null);
        } else if (bVar instanceof of3.a.b.ShowTimePicker) {
            f00.s.l(sVar, f5.f61825a, ((of3.a.b.ShowTimePicker) bVar).getData(), null, 4, null);
        } else {
            if (!(bVar instanceof of3.a.b.ShowError)) {
                throw new oq.p();
            }
            f00.s.l(sVar, w4.f62021a, ((of3.a.b.ShowError) bVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m1(og3.x xVar, f00.s sVar, ai3.a.g gVar) {
        if (fr.t.c(gVar, ai3.a.g.c.f6436a)) {
            xVar.e4();
        } else {
            ai3.a.g.C0138a c0138a = ai3.a.g.C0138a.f6434a;
            if (fr.t.c(gVar, c0138a)) {
                xVar.A();
            } else if (fr.t.c(gVar, ai3.a.g.d.f6437a)) {
                f00.s.m(sVar, y4.e.f62054a, null, 2, null);
            } else if (gVar instanceof ai3.a.g.ShowDialog) {
                f00.s.l(sVar, t4.f61989a, ((ai3.a.g.ShowDialog) gVar).getDialog(), null, 4, null);
            } else if (gVar instanceof ai3.a.g.ShowImagePreview) {
                f00.s.l(sVar, x4.f62033a, ((ai3.a.g.ShowImagePreview) gVar).getData(), null, 4, null);
            } else if (fr.t.c(gVar, c0138a)) {
                xVar.A();
            } else {
                if (!(gVar instanceof ai3.a.g.Error)) {
                    throw new oq.p();
                }
                f00.s.l(sVar, w4.f62021a, ((ai3.a.g.Error) gVar).getErrorData(), null, 4, null);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m2(of3.a.b bVar, LocalDate localDate) {
        ((of3.a.b.ShowDataPicker) bVar).b().b(new fz.b.LocalDate(localDate));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n1(final og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1785529160, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:680)");
        }
        f00.r.o(wVar, fr.q0.c(vf3.h0.class), xVar, y2.m.d(1460597993, true, new er.q() { // from class: fe3.x1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.o1(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.G(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n2(f00.s sVar, final og3.x xVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1665470598, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:336)");
        }
        f00.r.o(wVar, fr.q0.c(eg3.k.class), sVar.g(y4.g.f62058a), y2.m.d(-1699304151, true, new er.q() { // from class: fe3.n2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.o2(xVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.O(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o1(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1460597993, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:684)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.d4
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.p1(xVar, sVar, (vf3.a.b) obj);
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
    public static final oq.i0 o2(final og3.x xVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1699304151, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:342)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.p3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.p2(xVar, (eg3.a) obj);
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
    public static final oq.i0 p1(og3.x xVar, f00.s sVar, vf3.a.b bVar) {
        if (fr.t.c(bVar, vf3.a.b.C5400b.f206447a)) {
            xVar.e4();
        } else if (fr.t.c(bVar, vf3.a.b.C5399a.f206446a)) {
            xVar.A();
        } else if (bVar instanceof vf3.a.b.c) {
            xVar.B1();
        } else if (bVar instanceof vf3.a.b.f) {
            xVar.x5();
        } else if (bVar instanceof vf3.a.b.ShowError) {
            f00.s.l(sVar, w4.f62021a, ((vf3.a.b.ShowError) bVar).getErrorData(), null, 4, null);
        } else {
            if (!(bVar instanceof vf3.a.b.d)) {
                throw new oq.p();
            }
            f00.s.m(sVar, y4.k.f62066a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p2(og3.x xVar, eg3.a aVar) {
        if (aVar instanceof eg3.a.StartListeningForDescription) {
            xVar.L4(((eg3.a.StartListeningForDescription) aVar).getProcessId());
        } else {
            if (!fr.t.c(aVar, eg3.a.C1206a.f50174a)) {
                throw new oq.p();
            }
            xVar.e4();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q1(final f00.s sVar, final og3.x xVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-74250793, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:710)");
        }
        mr.c cVarC = fr.q0.c(dh3.r.class);
        sv0.c0 c0Var = (sv0.c0) sVar.g(y4.p.f62076a);
        f00.r.o(wVar, cVarC, c0Var != null ? new SummaryContract(xVar, c0Var) : null, y2.m.d(-1123090936, true, new er.q() { // from class: fe3.k2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.r1(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.P(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q2(final og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(45807769, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:358)");
        }
        f00.r.o(wVar, fr.q0.c(gh3.c0.class), xVar, y2.m.d(11974216, true, new er.q() { // from class: fe3.i2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.r2(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.J(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r1(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1123090936, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:721)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.h4
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.s1(xVar, sVar, (dh3.a.g) obj);
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
    public static final oq.i0 r2(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(11974216, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:362)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.u3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.s2(xVar, sVar, (gh3.a.d) obj);
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
    public static final oq.i0 s1(og3.x xVar, f00.s sVar, dh3.a.g gVar) {
        if (fr.t.c(gVar, dh3.a.g.C0939a.f42683a)) {
            xVar.e4();
        } else if (fr.t.c(gVar, dh3.a.g.b.f42684a)) {
            xVar.B1();
        } else if (fr.t.c(gVar, dh3.a.g.d.f42686a)) {
            f00.s.m(sVar, y4.m.f62070a, null, 2, null);
        } else if (gVar instanceof dh3.a.g.GoToInsuranceDetails) {
            xVar.s4(((dh3.a.g.GoToInsuranceDetails) gVar).getInsuranceDetailsData());
        } else if (gVar instanceof dh3.a.g.GoToVehicleDetails) {
            xVar.d4(((dh3.a.g.GoToVehicleDetails) gVar).getVehicleDetailsData());
        } else if (gVar instanceof dh3.a.g.GoToPersonalDetails) {
            xVar.O5(((dh3.a.g.GoToPersonalDetails) gVar).getPersonalDetailsData());
        } else if (gVar instanceof dh3.a.g.ForceBack) {
            xVar.Z1(new yd3.f.InitialInfoConfirmed(((dh3.a.g.ForceBack) gVar).getSavedDraftCollision()));
        } else if (gVar instanceof dh3.a.g.GoToMapDetails) {
            f00.s.l(sVar, v4.f62011a, ((dh3.a.g.GoToMapDetails) gVar).getShowLocalizationModel(), null, 4, null);
        } else if (gVar instanceof dh3.a.g.ShowError) {
            f00.s.l(sVar, w4.f62021a, ((dh3.a.g.ShowError) gVar).getErrorData(), null, 4, null);
        } else if (gVar instanceof dh3.a.g.ShowNavigationDialog) {
            f00.s.l(sVar, t4.f61989a, ((dh3.a.g.ShowNavigationDialog) gVar).getDialogData(), null, 4, null);
        } else {
            if (!(gVar instanceof dh3.a.g.GoToPhotosDetails)) {
                throw new oq.p();
            }
            xVar.O7(((dh3.a.g.GoToPhotosDetails) gVar).getData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s2(og3.x xVar, f00.s sVar, gh3.a.d dVar) {
        if (fr.t.c(dVar, gh3.a.d.b.f73027a)) {
            xVar.e4();
        } else if (fr.t.c(dVar, gh3.a.d.C1670a.f73026a)) {
            xVar.A();
        } else if (fr.t.c(dVar, gh3.a.d.C1671d.f73029a)) {
            f00.s.m(sVar, m4.f61894a, null, 2, null);
        } else if (fr.t.c(dVar, gh3.a.d.c.f73028a)) {
            f00.s.m(sVar, y4.b.f62048a, null, 2, null);
        } else {
            if (!(dVar instanceof gh3.a.d.GoToDescriptionWaiting)) {
                throw new oq.p();
            }
            f00.s.l(sVar, y4.g.f62058a, ((gh3.a.d.GoToDescriptionWaiting) dVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t1(final f00.s sVar, final og3.x xVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1637027574, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:774)");
        }
        f00.r.o(wVar, fr.q0.c(bh3.r.class), sVar.g(y4.o.f62074a), y2.m.d(588187431, true, new er.q() { // from class: fe3.w2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.u1(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.K(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t2(final og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1757086136, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:389)");
        }
        f00.r.o(wVar, fr.q0.c(jh3.s.class), xVar, y2.m.d(1723252583, true, new er.q() { // from class: fe3.y2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.u2(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.U(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u1(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(588187431, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:780)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.r3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.v1(xVar, sVar, (bh3.e.InterfaceC0504e) obj);
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
    public static final oq.i0 u2(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1723252583, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:393)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.z3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.v2(xVar, sVar, (jh3.a.c) obj);
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
    public static final oq.i0 v1(og3.x xVar, f00.s sVar, bh3.e.InterfaceC0504e interfaceC0504e) {
        if (fr.t.c(interfaceC0504e, bh3.e.InterfaceC0504e.b.f19639a)) {
            xVar.B1();
        } else if (interfaceC0504e instanceof bh3.e.InterfaceC0504e.GoToAutomaticReport) {
            bh3.e.InterfaceC0504e.GoToAutomaticReport goToAutomaticReport = (bh3.e.InterfaceC0504e.GoToAutomaticReport) interfaceC0504e;
            xVar.O4(goToAutomaticReport.getProcessId(), goToAutomaticReport.getStatus());
        } else if (fr.t.c(interfaceC0504e, bh3.e.InterfaceC0504e.a.f19638a)) {
            xVar.A();
        } else if (interfaceC0504e instanceof bh3.e.InterfaceC0504e.ShowDialog) {
            f00.s.l(sVar, t4.f61989a, ((bh3.e.InterfaceC0504e.ShowDialog) interfaceC0504e).getDialogData(), null, 4, null);
        } else if (interfaceC0504e instanceof bh3.e.InterfaceC0504e.ShowError) {
            f00.s.l(sVar, w4.f62021a, ((bh3.e.InterfaceC0504e.ShowError) interfaceC0504e).getErrorData(), null, 4, null);
        } else {
            if (!(interfaceC0504e instanceof bh3.e.InterfaceC0504e.GoToDownloadScreen)) {
                throw new oq.p();
            }
            xVar.w5(((bh3.e.InterfaceC0504e.GoToDownloadScreen) interfaceC0504e).getData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v2(og3.x xVar, f00.s sVar, jh3.a.c cVar) {
        if (fr.t.c(cVar, jh3.a.c.e.f103019a)) {
            xVar.e4();
        } else if (fr.t.c(cVar, jh3.a.c.C2431a.f103015a)) {
            xVar.A();
        } else if (fr.t.c(cVar, jh3.a.c.C2432c.f103017a)) {
            f00.s.m(sVar, m4.f61894a, null, 2, null);
        } else if (fr.t.c(cVar, jh3.a.c.b.f103016a)) {
            f00.s.m(sVar, y4.b.f62048a, null, 2, null);
        } else {
            if (!(cVar instanceof jh3.a.c.GoToDescriptionWaiting)) {
                throw new oq.p();
            }
            f00.s.l(sVar, y4.g.f62058a, ((jh3.a.c.GoToDescriptionWaiting) cVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w1(final og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-946661355, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:815)");
        }
        f00.r.n(wVar, fr.q0.c(di3.m.class), y2.m.d(-123639769, true, new er.q() { // from class: fe3.e2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.x1(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.T(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w2(final f00.s sVar, final og3.x xVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-826602793, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:422)");
        }
        mr.c cVarC = fr.q0.c(ug3.m.class);
        yd3.a aVar = (yd3.a) sVar.g(y4.l.f62068a);
        f00.r.o(wVar, cVarC, aVar != null ? new SetupData(aVar, xVar) : null, y2.m.d(-860436346, true, new er.q() { // from class: fe3.l2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.x2(sVar, xVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.F(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x1(final og3.x xVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-123639769, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:818)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(xVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.y3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.y1(xVar, sVar, (di3.c) obj);
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
    public static final oq.i0 x2(final f00.s sVar, final og3.x xVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-860436346, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:433)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(xVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.d3
                @Override // er.l
                public final Object b(Object obj) {
                    return k4.y2(sVar, xVar, (ug3.a.b) obj);
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
    public static final oq.i0 y1(og3.x xVar, f00.s sVar, di3.c cVar) {
        if (fr.t.c(cVar, di3.c.a.f42843a)) {
            xVar.A();
        } else if (fr.t.c(cVar, di3.c.b.f42844a)) {
            xVar.e4();
        } else {
            if (!(cVar instanceof di3.c.C0946c)) {
                throw new oq.p();
            }
            f00.s.l(sVar, w4.f62021a, ((di3.c.C0946c) cVar).a(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y2(f00.s sVar, og3.x xVar, ug3.a.b bVar) {
        if (bVar instanceof ug3.a.b.GoToConfirmationData) {
            f00.s.l(sVar, y4.d.f62052a, ((ug3.a.b.GoToConfirmationData) bVar).getData(), null, 4, null);
        } else if (fr.t.c(bVar, ug3.a.b.c.f198097a)) {
            f00.s.m(sVar, y4.u.f62086a, null, 2, null);
        } else if (bVar instanceof ug3.a.b.ShowError) {
            f00.s.l(sVar, w4.f62021a, ((ug3.a.b.ShowError) bVar).getErrorData(), null, 4, null);
        } else if (bVar instanceof ug3.a.b.ShowRejectionDialog) {
            f00.s.l(sVar, t4.f61989a, ((ug3.a.b.ShowRejectionDialog) bVar).getNavigationDialogModel(), null, 4, null);
        } else if (fr.t.c(bVar, ug3.a.b.d.f198098a)) {
            xVar.B1();
        } else {
            if (!fr.t.c(bVar, ug3.a.b.C5152a.f198095a)) {
                throw new oq.p();
            }
            xVar.e4();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z1(final og3.x xVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1790628893, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:239)");
        }
        f00.r.o(wVar, fr.q0.c(bg3.l.class), xVar, y2.m.d(1756795340, true, new er.q() { // from class: fe3.p2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.A1(sVar, xVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.M(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z2(final f00.s sVar, final og3.x xVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(884675574, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.NewCollisionNavContent.<anonymous>.<anonymous>.<anonymous> (NewCollisionNavContent.kt:468)");
        }
        mr.c cVarC = fr.q0.c(sf3.q.class);
        yd3.a.OfAuthor ofAuthor = (yd3.a.OfAuthor) sVar.g(y4.d.f62052a);
        f00.r.o(wVar, cVarC, ofAuthor != null ? new sf3.SetupData(ofAuthor, xVar) : null, y2.m.d(850842021, true, new er.q() { // from class: fe3.a3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k4.A2(xVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), a0.f61738a.Y(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }
}
