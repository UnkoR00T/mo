package fe3;

import gf3.DownloadPdfSetupData;
import p071kotlin.Metadata;
import vy.Coordinates;
import ye3.PhotosDetailsSetupData;
import ze3.SetupData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lge3/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "j0", "(Lge3/a;Ler/a;Lm2/r;I)V", "m0", "(Ler/a;Lm2/r;I)V", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(306361358, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:533)");
        }
        f00.r.o(wVar, fr.q0.c(ne3.m.class), sVar.g(c5.f61793a), y2.m.d(-1960889731, true, new er.q() { // from class: fe3.d7
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.B0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.x(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1960889731, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:539)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.p7
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.C0(sVar, (ne3.a.d) obj);
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
    public static final oq.i0 C0(f00.s sVar, ne3.a.d dVar) {
        if (fr.t.c(dVar, ne3.a.d.C3348a.f135267a)) {
            sVar.c();
        } else if (dVar instanceof ne3.a.d.ShowError) {
            f00.s.l(sVar, w4.f62021a, ((ne3.a.d.ShowError) dVar).getErrorData(), null, 4, null);
        } else if (dVar instanceof ne3.a.d.ShowExitDialog) {
            f00.s.l(sVar, t4.f61989a, ((ne3.a.d.ShowExitDialog) dVar).getDialogModel(), null, 4, null);
        } else {
            if (!(dVar instanceof ne3.a.d.RefreshDownloadToken)) {
                throw new oq.p();
            }
            ne3.a.d.RefreshDownloadToken bVar = (ne3.a.d.RefreshDownloadToken) dVar;
            PhotosDetailsSetupData.a aVarA = bVar.getEnteredFrom();
            if (aVarA instanceof PhotosDetailsSetupData.a.C6081b) {
                f00.s.l(sVar, z4.f62102a, t0.b.f61979a, null, 4, null);
            } else {
                if (!(aVarA instanceof PhotosDetailsSetupData.a.StatementDetails)) {
                    throw new oq.p();
                }
                f00.s.l(sVar, r4.f61945a, new SetupData(bVar.getProcessId(), true, ((PhotosDetailsSetupData.a.StatementDetails) bVar.getEnteredFrom()).getStatus()), null, 4, null);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-54098353, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:577)");
        }
        f00.r.n(wVar, fr.q0.c(ti3.l.class), y2.m.d(-421432963, true, new er.q() { // from class: fe3.v6
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.E0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.z(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-421432963, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:580)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.r6
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.F0(sVar, (ti3.a) obj);
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
    public static final oq.i0 F0(f00.s sVar, ti3.a aVar) {
        if (!fr.t.c(aVar, ti3.a.C4969a.f190444a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-414558064, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:594)");
        }
        f00.r.o(wVar, fr.q0.c(ii3.u.class), sVar.g(v4.f62011a), y2.m.d(1613158143, true, new er.q() { // from class: fe3.w6
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.H0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.s(), rVar, ((i15 >> 3) & 14) | 27648 | (Coordinates.f208679c << 6));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1613158143, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:600)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.r5
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.I0(sVar, (ii3.d) obj);
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
    public static final oq.i0 I0(f00.s sVar, ii3.d dVar) {
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
    public static final oq.i0 J0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-775017775, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:618)");
        }
        w4 w4Var = w4.f62021a;
        f00.r.r(wVar, w4Var, sVar.g(w4Var), y2.m.d(-1600734256, true, new er.q() { // from class: fe3.j7
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.K0(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K0(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1600734256, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:624)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.n5
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.L0(sVar, (hb4.b.a) obj);
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
    public static final oq.i0 L0(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1135477486, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:634)");
        }
        f00.r.o(wVar, fr.q0.c(we3.p.class), sVar.g(q4.f61934a), y2.m.d(892238721, true, new er.q() { // from class: fe3.k7
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.N0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.C(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(892238721, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:640)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.t5
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.O0(sVar, (we3.a.b) obj);
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
    public static final oq.i0 O0(f00.s sVar, we3.a.b bVar) {
        if (fr.t.c(bVar, we3.a.b.C5621a.f212817a)) {
            sVar.c();
        } else if (bVar instanceof we3.a.b.ShowImagePreview) {
            f00.s.l(sVar, x4.f62033a, ((we3.a.b.ShowImagePreview) bVar).getData(), null, 4, null);
        } else if (bVar instanceof we3.a.b.ShowError) {
            f00.s.l(sVar, w4.f62021a, ((we3.a.b.ShowError) bVar).getErrorData(), null, 4, null);
        } else if (bVar instanceof we3.a.b.ShowDialog) {
            f00.s.l(sVar, t4.f61989a, ((we3.a.b.ShowDialog) bVar).getDialogData(), null, 4, null);
        } else if (bVar instanceof we3.a.b.GoToPhotoDownload) {
            f00.s.l(sVar, c5.f61793a, ((we3.a.b.GoToPhotoDownload) bVar).getData(), null, 4, null);
        } else {
            if (!(bVar instanceof we3.a.b.RefreshDownloadToken)) {
                throw new oq.p();
            }
            we3.a.b.RefreshDownloadToken cVar = (we3.a.b.RefreshDownloadToken) bVar;
            PhotosDetailsSetupData.a aVarA = cVar.getEnteredFrom();
            if (aVarA instanceof PhotosDetailsSetupData.a.C6081b) {
                f00.s.l(sVar, z4.f62102a, t0.b.f61979a, null, 4, null);
            } else {
                if (!(aVarA instanceof PhotosDetailsSetupData.a.StatementDetails)) {
                    throw new oq.p();
                }
                f00.s.l(sVar, r4.f61945a, new SetupData(cVar.getProcessId(), true, ((PhotosDetailsSetupData.a.StatementDetails) cVar.getEnteredFrom()).getStatus()), null, 4, null);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1495937197, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:690)");
        }
        x4 x4Var = x4.f62033a;
        f00.r.r(wVar, x4Var, sVar.g(x4Var), y2.m.d(-381101107, true, new er.q() { // from class: fe3.g7
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.Q0(sVar, (dx3.c) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q0(final f00.s sVar, dx3.c cVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-381101107, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:694)");
        }
        xw.b<dx3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.q7
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.R0(sVar, (dx3.c.a) obj);
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
    public static final oq.i0 R0(f00.s sVar, dx3.c.a aVar) {
        if (!fr.t.c(aVar, dx3.c.a.C1047a.f45490a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1856396908, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:707)");
        }
        t4 t4Var = t4.f61989a;
        f00.r.r(wVar, t4Var, sVar.g(t4Var), y2.m.d(-366012119, true, new er.q() { // from class: fe3.e7
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.T0(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T0(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-366012119, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:711)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.q5
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.U0(sVar, (cb4.f.a) obj);
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
    public static final oq.i0 U0(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1781400371, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:207)");
        }
        f00.r.o(wVar, fr.q0.c(ke3.t.class), sVar.g(l4.f61885a), y2.m.d(-884706178, true, new er.q() { // from class: fe3.f7
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.W0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.w(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-884706178, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:213)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.c7
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.X0(sVar, (ke3.c) obj);
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
    public static final oq.i0 X0(f00.s sVar, ke3.c cVar) {
        if (cVar instanceof ke3.c.a) {
            sVar.c();
        } else if (cVar instanceof ke3.c.ToNewCollisionWithVehicle) {
            f00.s.l(sVar, z4.f62102a, new t0.c.FromAddVehicle(((ke3.c.ToNewCollisionWithVehicle) cVar).getVehicleData()), null, 4, null);
        } else if (cVar instanceof ke3.c.Error) {
            f00.s.l(sVar, w4.f62021a, ((ke3.c.Error) cVar).getErrorData(), null, 4, null);
        } else {
            if (!(cVar instanceof ke3.c.ShowNavigationDialog)) {
                throw new oq.p();
            }
            f00.s.l(sVar, t4.f61989a, ((ke3.c.ShowNavigationDialog) cVar).getNavigationDialogModel(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2141860082, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:243)");
        }
        f00.r.o(wVar, fr.q0.c(vi3.s.class), sVar.g(j5.f61869a), y2.m.d(-1245165889, true, new er.q() { // from class: fe3.z6
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.Z0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.v(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1245165889, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:249)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.m5
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.a1(sVar, (vi3.a.h) obj);
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
    public static final oq.i0 a1(f00.s sVar, vi3.a.h hVar) {
        if (hVar instanceof vi3.a.h.C5418a) {
            sVar.c();
        } else if (hVar instanceof vi3.a.h.BackWithInsurance) {
            vi3.a.h.BackWithInsurance cVar = (vi3.a.h.BackWithInsurance) hVar;
            f00.s.l(sVar, z4.f62102a, new t0.c.FromAddInsurance(cVar.getOldInsurance(), cVar.getNewInsurance()), null, 4, null);
        } else if (hVar instanceof vi3.a.h.ToSearch) {
            f00.s.l(sVar, d5.f61803a, ((vi3.a.h.ToSearch) hVar).getSearchModel(), null, 4, null);
        } else if (hVar instanceof vi3.a.h.Error) {
            f00.s.l(sVar, w4.f62021a, ((vi3.a.h.Error) hVar).getErrorData(), null, 4, null);
        } else {
            if (!(hVar instanceof vi3.a.h.BackWithDeleteInsurance)) {
                throw new oq.p();
            }
            f00.s.l(sVar, z4.f62102a, new t0.c.FromRemoveInsurance(((vi3.a.h.BackWithDeleteInsurance) hVar).getInsurance()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1792647503, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:286)");
        }
        f00.r.o(wVar, fr.q0.c(fi3.u.class), sVar.g(d5.f61803a), y2.m.d(-1605625600, true, new er.q() { // from class: fe3.o7
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.c1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.B(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1605625600, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:292)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.n7
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.d1(sVar, (fi3.e) obj);
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
    public static final oq.i0 d1(f00.s sVar, fi3.e eVar) {
        if (!fr.t.c(eVar, fi3.e.a.f64144a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1432187792, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:305)");
        }
        f00.r.o(wVar, fr.q0.c(qe3.l.class), sVar.g(o4.f61915a), y2.m.d(-1966085311, true, new er.q() { // from class: fe3.m7
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.f1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.E(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1966085311, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:311)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.s5
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.g1(sVar, (qe3.a) obj);
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
    public static final oq.i0 g1(f00.s sVar, qe3.a aVar) {
        if (!fr.t.c(aVar, qe3.a.C4168a.f166263a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1071728081, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:324)");
        }
        f00.r.o(wVar, fr.q0.c(bf3.l.class), sVar.g(s4.f61973a), y2.m.d(1968422274, true, new er.q() { // from class: fe3.x6
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.i1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.r(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1968422274, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:330)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.l5
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.j1(sVar, (bf3.a) obj);
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

    public static final void j0(final ge3.a aVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1553024213);
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
                p076m2.t.o(1553024213, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavContent (VehicleCollisionNavContent.kt:71)");
            }
            p076m2.d0.c(ge3.c.c().d(aVar), y2.m.d(242452885, true, new er.p() { // from class: fe3.u5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t7.k0(aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        p076m2.d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fe3.w5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t7.l0(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j1(f00.s sVar, bf3.a aVar) {
        if (!fr.t.c(aVar, bf3.a.C0488a.f19234a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k0(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(242452885, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavContent.<anonymous> (VehicleCollisionNavContent.kt:75)");
            }
            m0(aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(711268370, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:343)");
        }
        f00.r.o(wVar, fr.q0.c(te3.j.class), sVar.g(p4.f61925a), y2.m.d(1607962563, true, new er.q() { // from class: fe3.y6
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.l1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.F(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(ge3.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        j0(aVar, aVar2, rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1607962563, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:349)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.o5
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.m1(sVar, (te3.a) obj);
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

    private static final void m0(final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-35206538);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-35206538, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph (VehicleCollisionNavContent.kt:82)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            e5 e5Var = e5.f61815a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: fe3.x5
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t7.n0(sVarJ, aVar, (p136y9.d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, e5Var, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        p076m2.d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fe3.y5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t7.t1(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m1(f00.s sVar, te3.a aVar) {
        if (!fr.t.c(aVar, te3.a.C4947a.f189991a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final oq.i0 n0(final f00.s sVar, final er.a aVar, p136y9.d1 d1Var) {
        f00.r.u(d1Var, e5.f61815a, null, y2.m.b(-1886368811, true, new er.r() { // from class: fe3.z5
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.o0(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z4.f62102a, null, y2.m.b(-1420940660, true, new er.r() { // from class: fe3.k6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.r0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l4.f61885a, null, y2.m.b(-1781400371, true, new er.r() { // from class: fe3.l6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.V0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, j5.f61869a, null, y2.m.b(-2141860082, true, new er.r() { // from class: fe3.m6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.Y0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d5.f61803a, null, y2.m.b(1792647503, true, new er.r() { // from class: fe3.n6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.b1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, o4.f61915a, null, y2.m.b(1432187792, true, new er.r() { // from class: fe3.o6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.e1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s4.f61973a, null, y2.m.b(1071728081, true, new er.r() { // from class: fe3.p6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.h1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p4.f61925a, null, y2.m.b(711268370, true, new er.r() { // from class: fe3.q6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.k1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, r4.f61945a, null, y2.m.b(350808659, true, new er.r() { // from class: fe3.s6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.n1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, g5.f61835a, null, y2.m.b(-9651052, true, new er.r() { // from class: fe3.t6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.q1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h5.f61847a, null, y2.m.b(1027280780, true, new er.r() { // from class: fe3.a6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.u0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b5.f61782a, null, y2.m.b(666821069, true, new er.r() { // from class: fe3.b6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.x0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c5.f61793a, null, y2.m.b(306361358, true, new er.r() { // from class: fe3.c6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.A0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i5.f61858a, null, y2.m.b(-54098353, true, new er.r() { // from class: fe3.d6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.D0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, v4.f62011a, null, y2.m.b(-414558064, true, new er.r() { // from class: fe3.e6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.G0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, w4.f62021a, null, y2.m.b(-775017775, true, new er.r() { // from class: fe3.f6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.J0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, q4.f61934a, null, y2.m.b(-1135477486, true, new er.r() { // from class: fe3.h6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.M0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x4.f62033a, null, y2.m.b(-1495937197, true, new er.r() { // from class: fe3.i6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.P0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, t4.f61989a, new f00.g0.Dialog(null, 1, 0 == true ? 1 : 0), y2.m.b(-1856396908, true, new er.r() { // from class: fe3.j6
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.S0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(350808659, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:362)");
        }
        f00.r.o(wVar, fr.q0.c(ze3.z.class), sVar.g(r4.f61945a), y2.m.d(1247502852, true, new er.q() { // from class: fe3.u6
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.o1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.t(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o0(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1886368811, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:90)");
        }
        f00.r.o(wVar, fr.q0.c(li3.v.class), sVar.g(e5.f61815a), y2.m.d(-504431674, true, new er.q() { // from class: fe3.i7
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.p0(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.u(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1247502852, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:368)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.s7
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.p1(sVar, (ze3.a.i) obj);
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
    public static final oq.i0 p0(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-504431674, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:94)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.r7
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.q0(sVar, aVar, (li3.a.InterfaceC2876a) obj);
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
    public static final oq.i0 p1(f00.s sVar, ze3.a.i iVar) {
        if (iVar instanceof ze3.a.i.GoToInsuranceDetails) {
            f00.s.l(sVar, o4.f61915a, ((ze3.a.i.GoToInsuranceDetails) iVar).getInsuranceDetailsData(), null, 4, null);
        } else if (iVar instanceof ze3.a.i.GoToVehicleDetails) {
            f00.s.l(sVar, s4.f61973a, ((ze3.a.i.GoToVehicleDetails) iVar).getVehicleDetailsData(), null, 4, null);
        } else if (iVar instanceof ze3.a.i.GoToPersonalDetails) {
            f00.s.l(sVar, p4.f61925a, ((ze3.a.i.GoToPersonalDetails) iVar).getPersonalDetailsData(), null, 4, null);
        } else if (fr.t.c(iVar, ze3.a.i.C6327a.f234794a)) {
            sVar.c();
        } else if (iVar instanceof ze3.a.i.GoToMapDetails) {
            f00.s.l(sVar, v4.f62011a, ((ze3.a.i.GoToMapDetails) iVar).getShowLocalizationModel(), null, 4, null);
        } else if (iVar instanceof ze3.a.i.ShowError) {
            f00.s.l(sVar, w4.f62021a, ((ze3.a.i.ShowError) iVar).getErrorData(), null, 4, null);
        } else if (iVar instanceof ze3.a.i.GoToAutomaticReport) {
            ze3.a.i.GoToAutomaticReport bVar = (ze3.a.i.GoToAutomaticReport) iVar;
            f00.s.l(sVar, g5.f61835a, new oi3.SetupData(bVar.getProcessId(), bVar.getStatus()), null, 4, null);
        } else if (iVar instanceof ze3.a.i.ShowDialog) {
            f00.s.l(sVar, t4.f61989a, ((ze3.a.i.ShowDialog) iVar).getDialogData(), null, 4, null);
        } else if (iVar instanceof ze3.a.i.GoToDownloadScreen) {
            f00.s.l(sVar, b5.f61782a, ((ze3.a.i.GoToDownloadScreen) iVar).getData(), null, 4, null);
        } else {
            if (!(iVar instanceof ze3.a.i.GoToPhotosDetails)) {
                throw new oq.p();
            }
            f00.s.l(sVar, q4.f61934a, ((ze3.a.i.GoToPhotosDetails) iVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q0(f00.s sVar, er.a aVar, li3.a.InterfaceC2876a interfaceC2876a) {
        if (interfaceC2876a instanceof li3.a.InterfaceC2876a.ToNewStatement) {
            f00.s.l(sVar, z4.f62102a, new NewStatement(((li3.a.InterfaceC2876a.ToNewStatement) interfaceC2876a).getWorkingCopyValidityDays()), null, 4, null);
        } else if (interfaceC2876a instanceof li3.a.InterfaceC2876a.C2877a) {
            aVar.a();
        } else if (interfaceC2876a instanceof li3.a.InterfaceC2876a.GoToCreatedStatement) {
            li3.a.InterfaceC2876a.GoToCreatedStatement bVar = (li3.a.InterfaceC2876a.GoToCreatedStatement) interfaceC2876a;
            f00.s.l(sVar, r4.f61945a, new SetupData(bVar.getProcessId(), false, bVar.getStatus()), null, 4, null);
        } else if (interfaceC2876a instanceof li3.a.InterfaceC2876a.ShowNavigationDialog) {
            f00.s.l(sVar, t4.f61989a, ((li3.a.InterfaceC2876a.ShowNavigationDialog) interfaceC2876a).getNavigationDialogModel(), null, 4, null);
        } else {
            if (!(interfaceC2876a instanceof li3.a.InterfaceC2876a.GoToDraftStatement)) {
                throw new oq.p();
            }
            li3.a.InterfaceC2876a.GoToDraftStatement cVar = (li3.a.InterfaceC2876a.GoToDraftStatement) interfaceC2876a;
            f00.s.l(sVar, z4.f62102a, new RecoveredCollision(cVar.getRecoveredNewCollision(), cVar.getWorkingCopyValidityDays()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-9651052, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:429)");
        }
        f00.r.o(wVar, fr.q0.c(oi3.t.class), sVar.g(g5.f61835a), y2.m.d(887043141, true, new er.q() { // from class: fe3.b7
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.r1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.G(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1420940660, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:136)");
        }
        f00.r.o(wVar, fr.q0.c(og3.n0.class), sVar.g(z4.f62102a), y2.m.d(-524246467, true, new er.q() { // from class: fe3.h7
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.s0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.D(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(887043141, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:435)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.g6
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.s1(sVar, (oi3.a.b) obj);
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
    public static final oq.i0 s0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-524246467, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:142)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.p5
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.t0(sVar, (og3.w.c) obj);
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
    public static final oq.i0 s1(f00.s sVar, oi3.a.b bVar) {
        if (fr.t.c(bVar, oi3.a.b.C3630a.f146000a)) {
            sVar.c();
        } else if (bVar instanceof oi3.a.b.GoToReportSuccess) {
            f00.s.l(sVar, h5.f61847a, ((oi3.a.b.GoToReportSuccess) bVar).getAutomaticReportSuccessSetupData(), null, 4, null);
        } else if (fr.t.c(bVar, oi3.a.b.C3631b.f146001a)) {
            f00.s.m(sVar, i5.f61858a, null, 2, null);
        } else if (bVar instanceof oi3.a.b.ShowError) {
            f00.s.l(sVar, w4.f62021a, ((oi3.a.b.ShowError) bVar).getErrorData(), null, 4, null);
        } else {
            if (!(bVar instanceof oi3.a.b.ShowDialog)) {
                throw new oq.p();
            }
            f00.s.l(sVar, t4.f61989a, ((oi3.a.b.ShowDialog) bVar).getDialogData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t0(f00.s sVar, og3.w.c cVar) {
        if (cVar instanceof og3.w.c.GoToAddVehicle) {
            f00.s.l(sVar, l4.f61885a, ((og3.w.c.GoToAddVehicle) cVar).getProcessId(), null, 4, null);
        } else if (cVar instanceof og3.w.c.GoToWriteInsurance) {
            f00.s.l(sVar, j5.f61869a, ((og3.w.c.GoToWriteInsurance) cVar).getWriteInsuranceMode(), null, 4, null);
        } else if (cVar instanceof og3.w.c.GoToInsuranceDetails) {
            f00.s.l(sVar, o4.f61915a, ((og3.w.c.GoToInsuranceDetails) cVar).getInsuranceDetailsData(), null, 4, null);
        } else if (cVar instanceof og3.w.c.GoToVehicleDetails) {
            f00.s.l(sVar, s4.f61973a, ((og3.w.c.GoToVehicleDetails) cVar).getVehicleDetailsData(), null, 4, null);
        } else if (cVar instanceof og3.w.c.GoToPersonalDetails) {
            f00.s.l(sVar, p4.f61925a, ((og3.w.c.GoToPersonalDetails) cVar).getPersonalDetailsData(), null, 4, null);
        } else if (cVar instanceof og3.w.c.GoToAutomaticReport) {
            og3.w.c.GoToAutomaticReport bVar = (og3.w.c.GoToAutomaticReport) cVar;
            f00.s.l(sVar, g5.f61835a, new oi3.SetupData(bVar.getProcessId(), bVar.getStatus()), null, 4, null);
        } else if (fr.t.c(cVar, og3.w.c.i.f145680a)) {
            f00.s.m(sVar, e5.f61815a, null, 2, null);
        } else if (cVar instanceof og3.w.c.GoToDownloadPdf) {
            f00.s.l(sVar, b5.f61782a, ((og3.w.c.GoToDownloadPdf) cVar).getData(), null, 4, null);
        } else if (cVar instanceof og3.w.c.GoToPhotosDetails) {
            f00.s.l(sVar, q4.f61934a, ((og3.w.c.GoToPhotosDetails) cVar).getData(), null, 4, null);
        } else {
            if (!(cVar instanceof og3.w.c.ShowError)) {
                throw new oq.p();
            }
            f00.s.l(sVar, w4.f62021a, ((og3.w.c.ShowError) cVar).getErrorData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t1(er.a aVar, int i15, p076m2.r rVar, int i16) {
        m0(aVar, rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1027280780, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:466)");
        }
        f00.r.o(wVar, fr.q0.c(ri3.p.class), sVar.g(h5.f61847a), y2.m.d(-1239970309, true, new er.q() { // from class: fe3.a7
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.v0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.A(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1239970309, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:472)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.k5
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.w0(sVar, (ri3.a.c) obj);
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
    public static final oq.i0 w0(f00.s sVar, ri3.a.c cVar) {
        if (!(cVar instanceof ri3.a.c.C4447a)) {
            throw new oq.p();
        }
        f00.s.m(sVar, e5.f61815a, null, 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(666821069, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:487)");
        }
        f00.r.o(wVar, fr.q0.c(ef3.m.class), sVar.g(b5.f61782a), y2.m.d(-1600430020, true, new er.q() { // from class: fe3.l7
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t7.y0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), s0.f61951a.y(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1600430020, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.VehicleCollisionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionNavContent.kt:493)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fe3.v5
                @Override // er.l
                public final Object b(Object obj) {
                    return t7.z0(sVar, (ef3.a.d) obj);
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
    public static final oq.i0 z0(f00.s sVar, ef3.a.d dVar) {
        if (fr.t.c(dVar, ef3.a.d.C1193a.f49836a)) {
            sVar.c();
        } else if (dVar instanceof ef3.a.d.ShowError) {
            f00.s.l(sVar, w4.f62021a, ((ef3.a.d.ShowError) dVar).getErrorData(), null, 4, null);
        } else if (dVar instanceof ef3.a.d.ShowExitDialog) {
            f00.s.l(sVar, t4.f61989a, ((ef3.a.d.ShowExitDialog) dVar).getDialogModel(), null, 4, null);
        } else {
            if (!(dVar instanceof ef3.a.d.RefreshDownloadToken)) {
                throw new oq.p();
            }
            ef3.a.d.RefreshDownloadToken bVar = (ef3.a.d.RefreshDownloadToken) dVar;
            DownloadPdfSetupData.InterfaceC1662a interfaceC1662aA = bVar.getEnteredFrom();
            if (interfaceC1662aA instanceof DownloadPdfSetupData.InterfaceC1662a.b) {
                f00.s.l(sVar, z4.f62102a, t0.a.f61978a, null, 4, null);
            } else {
                if (!(interfaceC1662aA instanceof DownloadPdfSetupData.InterfaceC1662a.StatementDetails)) {
                    throw new oq.p();
                }
                f00.s.l(sVar, r4.f61945a, new SetupData(bVar.getProcessId(), true, ((DownloadPdfSetupData.InterfaceC1662a.StatementDetails) bVar.getEnteredFrom()).getStatus()), null, 4, null);
            }
        }
        return oq.i0.f148189a;
    }
}
