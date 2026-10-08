package wx3;

import cy3.PaymentCardsSetupData;
import ey3.PaymentsDeleteCardsSetupData;
import gy3.GooglePaySetupData;
import jy3.SetupData;
import ky3.OneClickSetupData;
import my3.PaymentResultSetupData;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import zx3.PaymentBlikSetupData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwx3/v;", "sharedVM", "Loq/i0;", "A", "(Lwx3/v;Lm2/r;I)V", "Lf00/s;", "b0", "(Lf00/s;)V", "makepayment_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w0 {
    public static final void A(final v vVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1441337082);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(vVar) : rVarH.G(vVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1441337082, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent (MakePaymentSharedNavContent.kt:35)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            m mVar = m.f215827a;
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(vVar))) {
                z15 = true;
            }
            boolean zG = rVarH.G(sVarJ) | z15;
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: wx3.w
                    @Override // er.l
                    public final Object b(Object obj) {
                        return w0.B(sVarJ, vVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, mVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: wx3.h0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w0.a0(vVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(final f00.s sVar, final v vVar, d1 d1Var) {
        f00.r.u(d1Var, m.f215827a, null, y2.m.b(-392673337, true, new er.r() { // from class: wx3.o0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.C(vVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.f215819a, null, y2.m.b(1423455792, true, new er.r() { // from class: wx3.p0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.F(sVar, vVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, j.f215816a, null, y2.m.b(996186063, true, new er.r() { // from class: wx3.q0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.I(sVar, vVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i.f215812a, null, y2.m.b(568916334, true, new er.r() { // from class: wx3.r0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.L(sVar, vVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, o.f215835a, null, y2.m.b(141646605, true, new er.r() { // from class: wx3.s0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.O(sVar, vVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p.f215839a, null, y2.m.b(-285623124, true, new er.r() { // from class: wx3.t0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.R(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, n.f215831a, null, y2.m.b(-712892853, true, new er.r() { // from class: wx3.u0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.U(sVar, vVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.f215823a, null, y2.m.b(-1140162582, true, new er.r() { // from class: wx3.v0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.X(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        tw.c.c(d1Var, q.f215843a, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(final v vVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-392673337, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:42)");
        }
        f00.r.o(wVar, fr.q0.c(jy3.h0.class), new SetupData(vVar.getMakePaymentInitialData()), y2.m.d(1453020598, true, new er.q() { // from class: wx3.z
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.D(vVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f215802a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(final v vVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1453020598, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:48)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(vVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: wx3.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.E(vVar, sVar, (jy3.a.e) obj);
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
    public static final oq.i0 E(v vVar, f00.s sVar, jy3.a.e eVar) {
        if (fr.t.c(eVar, jy3.a.e.C2539a.f106539a)) {
            vVar.c4();
        } else if (eVar instanceof jy3.a.e.ToBlik) {
            f00.s.l(sVar, k.f215819a, new PaymentBlikSetupData(((jy3.a.e.ToBlik) eVar).getBlikRequiredData(), vVar.getMakePaymentInitialData().getPaymentSuccessResultType()), null, 4, null);
        } else if (eVar instanceof jy3.a.e.ToCards) {
            f00.s.l(sVar, o.f215835a, new PaymentCardsSetupData(((jy3.a.e.ToCards) eVar).getPaymentCardsNavParams()), null, 4, null);
        } else if (eVar instanceof jy3.a.e.ToOneClickAliases) {
            f00.s.l(sVar, j.f215816a, new OneClickSetupData(((jy3.a.e.ToOneClickAliases) eVar).getOneClickRequiredData(), vVar.getMakePaymentInitialData().getPaymentSuccessResultType()), null, 4, null);
        } else {
            if (!(eVar instanceof jy3.a.e.ToGooglePay)) {
                throw new oq.p();
            }
            f00.s.l(sVar, i.f215812a, new GooglePaySetupData(((jy3.a.e.ToGooglePay) eVar).getGooglePayNavParams(), vVar.getMakePaymentInitialData().getPaymentSuccessResultType()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(final f00.s sVar, final v vVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1423455792, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:90)");
        }
        f00.r.o(wVar, fr.q0.c(zx3.i0.class), sVar.g(k.f215819a), y2.m.d(1313834079, true, new er.q() { // from class: wx3.b0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.G(sVar, vVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f215802a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(final f00.s sVar, final v vVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1313834079, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:94)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(vVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: wx3.m0
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.H(sVar, vVar, (zx3.a.h) obj);
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
    public static final oq.i0 H(f00.s sVar, v vVar, zx3.a.h hVar) {
        if (fr.t.c(hVar, zx3.a.h.b.f238312a)) {
            sVar.c();
        } else if (fr.t.c(hVar, zx3.a.h.C6441a.f238311a)) {
            vVar.I2();
        } else if (hVar instanceof zx3.a.h.d) {
            f00.s.l(sVar, l.f215823a, ((zx3.a.h.d) hVar).a(), null, 4, null);
        } else if (hVar instanceof zx3.a.h.ToInterruptionDialog) {
            f00.s.l(sVar, q.f215843a, ((zx3.a.h.ToInterruptionDialog) hVar).getNavigationDialogModel(), null, 4, null);
        } else if (fr.t.c(hVar, zx3.a.h.e.f238314a)) {
            b0(sVar);
        } else {
            if (!(hVar instanceof zx3.a.h.GoToResult)) {
                throw new oq.p();
            }
            f00.s.l(sVar, n.f215831a, new PaymentResultSetupData(((zx3.a.h.GoToResult) hVar).getResult(), vVar.getMakePaymentInitialData().getPaymentSuccessResultType()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(final f00.s sVar, final v vVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(996186063, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:125)");
        }
        f00.r.o(wVar, fr.q0.c(ky3.w0.class), sVar.g(j.f215816a), y2.m.d(886564350, true, new er.q() { // from class: wx3.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.J(vVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f215802a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(final v vVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(886564350, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:129)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(vVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: wx3.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.K(vVar, sVar, (ky3.a.i) obj);
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
    public static final oq.i0 K(v vVar, f00.s sVar, ky3.a.i iVar) {
        if (fr.t.c(iVar, ky3.a.i.C2750a.f113232a)) {
            vVar.I2();
        } else if (fr.t.c(iVar, ky3.a.i.b.f113233a)) {
            sVar.c();
        } else if (iVar instanceof ky3.a.i.f) {
            f00.s.l(sVar, l.f215823a, ((ky3.a.i.f) iVar).a(), null, 4, null);
        } else if (fr.t.c(iVar, ky3.a.i.d.f113235a)) {
            b0(sVar);
        } else if (iVar instanceof ky3.a.i.ToInterruptionDialog) {
            f00.s.l(sVar, q.f215843a, ((ky3.a.i.ToInterruptionDialog) iVar).getNavigationDialogModel(), null, 4, null);
        } else if (iVar instanceof ky3.a.i.ToBlik) {
            f00.s.l(sVar, k.f215819a, new PaymentBlikSetupData(((ky3.a.i.ToBlik) iVar).getPaymentData(), vVar.getMakePaymentInitialData().getPaymentSuccessResultType()), null, 4, null);
        } else {
            if (!(iVar instanceof ky3.a.i.GoToResult)) {
                throw new oq.p();
            }
            f00.s.l(sVar, n.f215831a, new PaymentResultSetupData(((ky3.a.i.GoToResult) iVar).getPaymentResultState(), vVar.getMakePaymentInitialData().getPaymentSuccessResultType()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final f00.s sVar, final v vVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(568916334, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:168)");
        }
        f00.r.o(wVar, fr.q0.c(gy3.p.class), sVar.g(i.f215812a), y2.m.d(459294621, true, new er.q() { // from class: wx3.y
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.M(vVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f215802a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(final v vVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(459294621, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:172)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(vVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: wx3.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.N(vVar, sVar, (gy3.a.b) obj);
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
    public static final oq.i0 N(v vVar, f00.s sVar, gy3.a.b bVar) {
        if (bVar instanceof gy3.a.b.C1786a) {
            vVar.I2();
        } else {
            if (!(bVar instanceof gy3.a.b.ToResult)) {
                throw new oq.p();
            }
            f00.s.l(sVar, n.f215831a, new PaymentResultSetupData(((gy3.a.b.ToResult) bVar).getPaymentResult(), vVar.getMakePaymentInitialData().getPaymentSuccessResultType()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final f00.s sVar, final v vVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(141646605, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:191)");
        }
        f00.r.o(wVar, fr.q0.c(cy3.p0.class), sVar.g(o.f215835a), y2.m.d(32024892, true, new er.q() { // from class: wx3.x
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.P(sVar, vVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f215802a.l(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(final f00.s sVar, final v vVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(32024892, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:197)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(vVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: wx3.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.Q(sVar, vVar, (cy3.a.e) obj);
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
    public static final oq.i0 Q(f00.s sVar, v vVar, cy3.a.e eVar) {
        if (fr.t.c(eVar, cy3.a.e.C0827a.f38510a)) {
            sVar.c();
        } else if (eVar instanceof cy3.a.e.ToDeleteCards) {
            f00.s.l(sVar, p.f215839a, new PaymentsDeleteCardsSetupData(((cy3.a.e.ToDeleteCards) eVar).getDeleteCardsRequiredData()), null, 4, null);
        } else if (eVar instanceof cy3.a.e.GoToResult) {
            f00.s.l(sVar, n.f215831a, new PaymentResultSetupData(((cy3.a.e.GoToResult) eVar).getPaymentResultState(), vVar.getMakePaymentInitialData().getPaymentSuccessResultType()), null, 4, null);
        } else {
            if (!(eVar instanceof cy3.a.e.ToPaymentsDialog)) {
                throw new oq.p();
            }
            f00.s.l(sVar, q.f215843a, ((cy3.a.e.ToPaymentsDialog) eVar).getNavigationDialogModel(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-285623124, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:228)");
        }
        f00.r.o(wVar, fr.q0.c(ey3.s.class), sVar.g(p.f215839a), y2.m.d(-395244837, true, new er.q() { // from class: wx3.c0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.S(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f215802a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-395244837, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:234)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: wx3.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.T(sVar, (ey3.a.f) obj);
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
    public static final oq.i0 T(f00.s sVar, ey3.a.f fVar) {
        if (fr.t.c(fVar, ey3.a.f.C1278a.f54270a)) {
            sVar.c();
        } else if (fVar instanceof ey3.a.f.Error) {
            f00.s.l(sVar, l.f215823a, ((ey3.a.f.Error) fVar).getErrorData(), null, 4, null);
        } else if (fVar instanceof ey3.a.f.DeleteCardDialog) {
            f00.s.l(sVar, q.f215843a, ((ey3.a.f.DeleteCardDialog) fVar).getNavigationDialogModel(), null, 4, null);
        } else {
            if (!(fVar instanceof ey3.a.f.PaymentCards)) {
                throw new oq.p();
            }
            o oVar = o.f215835a;
            sVar.j(oVar, new PaymentCardsSetupData(((ey3.a.f.PaymentCards) fVar).getPaymentCardsNavParams()), oVar);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final f00.s sVar, final v vVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-712892853, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:262)");
        }
        f00.r.o(wVar, fr.q0.c(my3.t.class), sVar.g(n.f215831a), y2.m.d(-822514566, true, new er.q() { // from class: wx3.d0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.V(sVar, vVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f215802a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(final f00.s sVar, final v vVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-822514566, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:268)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(vVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: wx3.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.W(sVar, vVar, (my3.d.f) obj);
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
    public static final oq.i0 W(f00.s sVar, v vVar, my3.d.f fVar) {
        if (fVar instanceof my3.d.f.GoToBlikPayment) {
            f00.s.l(sVar, k.f215819a, new PaymentBlikSetupData(((my3.d.f.GoToBlikPayment) fVar).getBlikRequiredData(), vVar.getMakePaymentInitialData().getPaymentSuccessResultType()), null, 4, null);
        } else if (fVar instanceof my3.d.f.HandleGenericError) {
            f00.s.l(sVar, l.f215823a, ((my3.d.f.HandleGenericError) fVar).getErrorData(), null, 4, null);
        } else if (fVar instanceof my3.d.f.ToPermissionsDialog) {
            f00.s.l(sVar, q.f215843a, ((my3.d.f.ToPermissionsDialog) fVar).getNavigationDialogModel(), null, 4, null);
        } else if (fr.t.c(fVar, my3.d.f.a.f129506a)) {
            vVar.I2();
        } else {
            if (!(fVar instanceof my3.d.f.CompleteProcess)) {
                throw new oq.p();
            }
            vVar.m7(((my3.d.f.CompleteProcess) fVar).getIsPaymentBeingProcessed());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1140162582, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:300)");
        }
        l lVar = l.f215823a;
        f00.r.r(wVar, lVar, sVar.g(lVar), y2.m.d(1232159913, true, new er.q() { // from class: wx3.e0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.Y(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1232159913, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.MakePaymentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MakePaymentSharedNavContent.kt:304)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: wx3.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.Z(sVar, (hb4.b.a) obj);
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
    public static final oq.i0 Z(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(v vVar, int i15, p076m2.r rVar, int i16) {
        A(vVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void b0(f00.s sVar) {
        p136y9.y0 y0VarS = sVar.getNavController().s();
        if (fr.t.c(y0VarS != null ? y0VarS.u() : null, q.f215843a.getRoute())) {
            sVar.c();
        }
    }
}
