package hj1;

import mj1.SetupData;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import zp0.BEUserRegisteredDefenceTraining;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lhj1/s;", "sharedVM", "Loq/i0;", "A", "(Lhj1/s;Lm2/r;I)V", "defencetraining_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t0 {
    public static final void A(final s sVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1111620986);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(sVar) : rVarH.G(sVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1111620986, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent (NewRegistrationSharedNavContent.kt:37)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            zx.a aVar = sVar.m1() ? xi1.n.f.f219026b : xi1.n.e.f219025b;
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(sVar))) {
                z15 = true;
            }
            boolean zG = rVarH.G(sVarJ) | z15;
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: hj1.t
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t0.B(sVar, sVarJ, (p136y9.d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, aVar, (er.l) objE, rVarH, f00.s.f54562e);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hj1.e0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t0.a0(sVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(final s sVar, final f00.s sVar2, p136y9.d1 d1Var) {
        f00.r.u(d1Var, xi1.n.f.f219026b, null, y2.m.b(-1589536581, true, new er.r() { // from class: hj1.l0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.C(sVar, sVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, xi1.n.e.f219025b, null, y2.m.b(-2127216732, true, new er.r() { // from class: hj1.m0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.F(sVar, sVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, xi1.n.b.f219022b, null, y2.m.b(-1175384893, true, new er.r() { // from class: hj1.n0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.I(sVar, sVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, xi1.n.c.f219023b, null, y2.m.b(-223553054, true, new er.r() { // from class: hj1.o0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.L(sVar2, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, xi1.n.a.f219021b, null, y2.m.b(728278785, true, new er.r() { // from class: hj1.p0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.O(sVar2, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, xi1.n.g.f219027b, null, y2.m.b(1680110624, true, new er.r() { // from class: hj1.q0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.R(sVar2, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, xi1.n.d.f219024b, null, y2.m.b(-1663024833, true, new er.r() { // from class: hj1.r0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.U(sVar2, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, xi1.j.f219007a, new f00.g0.Dialog(null, 1, null), y2.m.b(-711192994, true, new er.r() { // from class: hj1.s0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.X(sVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(final s sVar, final f00.s sVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1589536581, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:49)");
        }
        f00.r.o(wVar, fr.q0.c(uj1.n.class), sVar, y2.m.d(1559591466, true, new er.q() { // from class: hj1.b0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.D(sVar, sVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f85053a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(final s sVar, final f00.s sVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1559591466, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:53)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(sVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hj1.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.E(sVar, sVar2, (uj1.b) obj);
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
    public static final oq.i0 E(s sVar, f00.s sVar2, uj1.b bVar) {
        if (bVar instanceof uj1.b.a) {
            sVar.C2();
        } else {
            if (!(bVar instanceof uj1.b.C5166b)) {
                throw new oq.p();
            }
            f00.s.m(sVar2, xi1.n.e.f219025b, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(final s sVar, final f00.s sVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2127216732, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:67)");
        }
        f00.r.o(wVar, fr.q0.c(qj1.u0.class), sVar, y2.m.d(527860051, true, new er.q() { // from class: hj1.z
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.G(sVar, sVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f85053a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(final s sVar, final f00.s sVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(527860051, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:71)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(sVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hj1.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.H(sVar, sVar2, (qj1.d.h) obj);
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
    public static final oq.i0 H(s sVar, f00.s sVar2, qj1.d.h hVar) {
        if (fr.t.c(hVar, qj1.d.h.a.f166756a)) {
            if (sVar.m1()) {
                sVar2.c();
            } else {
                sVar.C2();
            }
        } else if (fr.t.c(hVar, qj1.d.h.c.f166758a)) {
            f00.s.m(sVar2, xi1.n.b.f219022b, null, 2, null);
        } else if (hVar instanceof qj1.d.h.ShowDialog) {
            f00.s.l(sVar2, xi1.j.f219007a, ((qj1.d.h.ShowDialog) hVar).getDialogData(), null, 4, null);
        } else {
            if (!fr.t.c(hVar, qj1.d.h.b.f166757a)) {
                throw new oq.p();
            }
            sVar.C2();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(final s sVar, final f00.s sVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1175384893, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:95)");
        }
        f00.r.o(wVar, fr.q0.c(kj1.o.class), sVar, y2.m.d(1479691890, true, new er.q() { // from class: hj1.y
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.J(sVar2, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f85053a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(final f00.s sVar, final s sVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1479691890, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:99)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(sVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hj1.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.K(sVar, sVar2, (kj1.a.c) obj);
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
    public static final oq.i0 K(f00.s sVar, s sVar2, kj1.a.c cVar) {
        if (fr.t.c(cVar, kj1.a.c.C2673a.f111130a)) {
            sVar.c();
        } else if (fr.t.c(cVar, kj1.a.c.C2674c.f111132a)) {
            f00.s.l(sVar, xi1.n.c.f219023b, new SetupData(sVar2, false), null, 4, null);
        } else {
            if (!fr.t.c(cVar, kj1.a.c.b.f111131a)) {
                throw new oq.p();
            }
            sVar2.C2();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final f00.s sVar, final s sVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-223553054, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:118)");
        }
        f00.r.o(wVar, fr.q0.c(mj1.z.class), sVar.g(xi1.n.c.f219023b), y2.m.d(-1863443567, true, new er.q() { // from class: hj1.x
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.M(sVar, sVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f85053a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(final f00.s sVar, final s sVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1863443567, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:124)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(sVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hj1.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.N(sVar, sVar2, (mj1.a.e) obj);
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
    public static final oq.i0 N(f00.s sVar, s sVar2, mj1.a.e eVar) {
        if (fr.t.c(eVar, mj1.a.e.C3122a.f126734a)) {
            sVar.c();
        } else if (fr.t.c(eVar, mj1.a.e.c.f126736a)) {
            f00.s.l(sVar, xi1.n.a.f219021b, new ij1.SetupData(sVar2, null), null, 4, null);
        } else if (eVar instanceof mj1.a.e.GoToSuccess) {
            f00.s.l(sVar, xi1.n.d.f219024b, ((mj1.a.e.GoToSuccess) eVar).getRegistered(), null, 4, null);
        } else if (eVar instanceof mj1.a.e.C3123e) {
            f00.s.l(sVar, xi1.j.f219007a, ((mj1.a.e.C3123e) eVar).a(), null, 4, null);
        } else {
            if (!fr.t.c(eVar, mj1.a.e.b.f126735a)) {
                throw new oq.p();
            }
            sVar2.C2();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final f00.s sVar, final s sVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(728278785, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:154)");
        }
        f00.r.o(wVar, fr.q0.c(ij1.p.class), sVar.g(xi1.n.a.f219021b), y2.m.d(-911611728, true, new er.q() { // from class: hj1.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.P(sVar, sVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f85053a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(final f00.s sVar, final s sVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-911611728, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:160)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(sVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hj1.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.Q(sVar, sVar2, (ij1.a.c) obj);
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
    public static final oq.i0 Q(f00.s sVar, s sVar2, ij1.a.c cVar) {
        if (fr.t.c(cVar, ij1.a.c.C2191a.f93036a)) {
            sVar.c();
        } else if (cVar instanceof ij1.a.c.GoToWriteNewChild) {
            f00.s.l(sVar, xi1.n.g.f219027b, ((ij1.a.c.GoToWriteNewChild) cVar).getSetupData(), null, 4, null);
        } else {
            if (!fr.t.c(cVar, ij1.a.c.b.f93037a)) {
                throw new oq.p();
            }
            f00.s.l(sVar, xi1.n.c.f219023b, new SetupData(sVar2, true), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final f00.s sVar, final s sVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1680110624, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:182)");
        }
        f00.r.o(wVar, fr.q0.c(wj1.q.class), sVar.g(xi1.n.g.f219027b), y2.m.d(40220111, true, new er.q() { // from class: hj1.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.S(sVar, sVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f85053a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(final f00.s sVar, final s sVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(40220111, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:188)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(sVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hj1.d0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.T(sVar, sVar2, (wj1.a.d) obj);
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
    public static final oq.i0 T(f00.s sVar, s sVar2, wj1.a.d dVar) {
        if (fr.t.c(dVar, wj1.a.d.C5651a.f213761a)) {
            sVar.c();
        } else {
            if (!(dVar instanceof wj1.a.d.BackWithData)) {
                throw new oq.p();
            }
            f00.s.l(sVar, xi1.n.a.f219021b, new ij1.SetupData(sVar2, ((wj1.a.d.BackWithData) dVar).getChild()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(f00.s sVar, final s sVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1663024833, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:206)");
        }
        mr.c cVarC = fr.q0.c(oj1.s.class);
        BEUserRegisteredDefenceTraining bEUserRegisteredDefenceTraining = (BEUserRegisteredDefenceTraining) sVar.g(xi1.n.d.f219024b);
        f00.r.o(wVar, cVarC, bEUserRegisteredDefenceTraining != null ? new oj1.SetupData(bEUserRegisteredDefenceTraining, sVar2) : null, y2.m.d(992051950, true, new er.q() { // from class: hj1.w
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.V(sVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f85053a.l(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(final s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(992051950, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:217)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hj1.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.W(sVar, (oj1.f) obj);
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
    public static final oq.i0 W(s sVar, oj1.f fVar) {
        if (!fr.t.c(fVar, oj1.f.a.f146307a)) {
            throw new oq.p();
        }
        sVar.C2();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-711192994, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:231)");
        }
        xi1.j jVar = xi1.j.f219007a;
        f00.r.r(wVar, jVar, sVar.g(jVar), y2.m.d(690587059, true, new er.q() { // from class: hj1.v
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.Y(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(690587059, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.NewRegistrationSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewRegistrationSharedNavContent.kt:237)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hj1.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.Z(sVar, (cb4.f.a) obj);
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
    public static final oq.i0 Z(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(s sVar, int i15, p076m2.r rVar, int i16) {
        A(sVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
