package xi1;

import ak1.SetupData;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import zp0.BEUserDefenceTrainingRegistration;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyi1/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "F", "(Lyi1/a;Ler/a;Lm2/r;I)V", "I", "(Ler/a;Lm2/r;I)V", "defencetraining_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class y0 {
    public static final void F(final yi1.a aVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(291602757);
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
                p076m2.t.o(291602757, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavContent (DefenceTrainingNavContent.kt:43)");
            }
            p076m2.d0.c(yi1.c.c().d(aVar), y2.m.d(581182981, true, new er.p() { // from class: xi1.x0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y0.G(aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: xi1.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y0.H(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(581182981, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavContent.<anonymous> (DefenceTrainingNavContent.kt:47)");
            }
            I(aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(yi1.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        F(aVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void I(final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1349716114);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1349716114, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph (DefenceTrainingNavContent.kt:54)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            p pVar = p.f219032a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: xi1.v
                    @Override // er.l
                    public final Object b(Object obj) {
                        return y0.J(aVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, pVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xi1.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y0.l0(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final oq.i0 J(final er.a aVar, final f00.s sVar, d1 d1Var) {
        f00.r.u(d1Var, p.f219032a, null, y2.m.b(877070959, true, new er.r() { // from class: xi1.x
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return y0.K(aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.f219014a, null, y2.m.b(-1185841384, true, new er.r() { // from class: xi1.y
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return y0.N(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.f219010a, null, y2.m.b(-1619805065, true, new er.r() { // from class: xi1.z
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return y0.Q(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.f219017a, null, y2.m.b(-2053768746, true, new er.r() { // from class: xi1.a0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return y0.T(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, o.f219029a, null, y2.m.b(1807234869, true, new er.r() { // from class: xi1.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return y0.W(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, r.f219039a, null, y2.m.b(1373271188, true, new er.r() { // from class: xi1.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return y0.Z(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, q.f219036a, null, y2.m.b(939307507, true, new er.r() { // from class: xi1.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return y0.c0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s.f219042a, null, y2.m.b(505343826, true, new er.r() { // from class: xi1.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return y0.f0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, j.f219007a, new f00.g0.Dialog(null, 1, 0 == true ? 1 : 0), y2.m.b(71380145, true, new er.r() { // from class: xi1.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return y0.i0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(877070959, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:61)");
        }
        f00.r.n(wVar, fr.q0.c(yj1.n.class), y2.m.d(-620400611, true, new er.q() { // from class: xi1.k0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return y0.L(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f218997a.j(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-620400611, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:64)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xi1.p0
                @Override // er.l
                public final Object b(Object obj) {
                    return y0.M(aVar, sVar, (yj1.b) obj);
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
    public static final oq.i0 M(er.a aVar, f00.s sVar, yj1.b bVar) {
        if (fr.t.c(bVar, yj1.b.a.f227286a)) {
            aVar.a();
        } else if (bVar instanceof yj1.b.c) {
            f00.s.m(sVar, l.f219014a, null, 2, null);
        } else if (bVar instanceof yj1.b.C6091b) {
            f00.s.m(sVar, k.f219010a, null, 2, null);
        } else {
            if (!fr.t.c(bVar, yj1.b.d.f227289a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, m.f219017a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1185841384, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:86)");
        }
        f00.r.n(wVar, fr.q0.c(cj1.r.class), y2.m.d(-1441975994, true, new er.q() { // from class: xi1.n0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return y0.O(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f218997a.k(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1441975994, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:89)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xi1.u0
                @Override // er.l
                public final Object b(Object obj) {
                    return y0.P(sVar, (cj1.a.c) obj);
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
    public static final oq.i0 P(f00.s sVar, cj1.a.c cVar) {
        if (fr.t.c(cVar, cj1.a.c.C0705a.f27336a)) {
            sVar.c();
        } else if (cVar instanceof cj1.a.c.GoToNewRegistration) {
            f00.s.l(sVar, o.f219029a, ((cj1.a.c.GoToNewRegistration) cVar).getSetupData(), null, 4, null);
        } else if (cVar instanceof cj1.a.c.GoToDetails) {
            f00.s.l(sVar, q.f219036a, ((cj1.a.c.GoToDetails) cVar).getTraining(), null, 4, null);
        } else {
            if (!fr.t.c(cVar, cj1.a.c.C0706c.f27338a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, r.f219039a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1619805065, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:113)");
        }
        f00.r.n(wVar, fr.q0.c(aj1.m.class), y2.m.d(-1875939675, true, new er.q() { // from class: xi1.o0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return y0.R(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f218997a.i(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1875939675, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:116)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xi1.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return y0.S(sVar, (aj1.b) obj);
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
    public static final oq.i0 S(f00.s sVar, aj1.b bVar) {
        if (!fr.t.c(bVar, aj1.b.a.f6690a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2053768746, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:127)");
        }
        f00.r.n(wVar, fr.q0.c(fj1.m.class), y2.m.d(1985063940, true, new er.q() { // from class: xi1.j0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return y0.U(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f218997a.m(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1985063940, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:130)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xi1.e0
                @Override // er.l
                public final Object b(Object obj) {
                    return y0.V(sVar, (fj1.b) obj);
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
    public static final oq.i0 V(f00.s sVar, fj1.b bVar) {
        if (!fr.t.c(bVar, fj1.b.a.f64229a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1807234869, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:141)");
        }
        f00.r.o(wVar, fr.q0.c(hj1.w0.class), sVar.g(o.f219029a), y2.m.d(-642038492, true, new er.q() { // from class: xi1.q0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return y0.X(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f218997a.l(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-642038492, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:147)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xi1.v0
                @Override // er.l
                public final Object b(Object obj) {
                    return y0.Y(sVar, (hj1.l) obj);
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
    public static final oq.i0 Y(f00.s sVar, hj1.l lVar) {
        if (fr.t.c(lVar, hj1.l.a.f85072a)) {
            sVar.c();
        } else {
            if (!(lVar instanceof hj1.l.ToDetails)) {
                throw new oq.p();
            }
            f00.s.l(sVar, q.f219036a, ((hj1.l.ToDetails) lVar).getTraining(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1373271188, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:166)");
        }
        f00.r.n(wVar, fr.q0.c(ck1.m.class), y2.m.d(1117136578, true, new er.q() { // from class: xi1.i0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return y0.a0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f218997a.p(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1117136578, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:169)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xi1.s0
                @Override // er.l
                public final Object b(Object obj) {
                    return y0.b0(sVar, (ck1.b) obj);
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
    public static final oq.i0 b0(f00.s sVar, ck1.b bVar) {
        if (!fr.t.c(bVar, ck1.b.a.f27829a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(939307507, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:180)");
        }
        mr.c cVarC = fr.q0.c(ak1.t.class);
        BEUserDefenceTrainingRegistration bEUserDefenceTrainingRegistration = (BEUserDefenceTrainingRegistration) sVar.g(q.f219036a);
        f00.r.o(wVar, cVarC, bEUserDefenceTrainingRegistration != null ? new SetupData(bEUserDefenceTrainingRegistration) : null, y2.m.d(-1509965854, true, new er.q() { // from class: xi1.m0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return y0.d0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f218997a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1509965854, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:190)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xi1.w0
                @Override // er.l
                public final Object b(Object obj) {
                    return y0.e0(sVar, (ak1.c.e) obj);
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
    public static final oq.i0 e0(f00.s sVar, ak1.c.e eVar) {
        if (fr.t.c(eVar, ak1.c.e.a.f7049a)) {
            f00.s.m(sVar, l.f219014a, null, 2, null);
        } else if (eVar instanceof ak1.c.e.ShowDialog) {
            f00.s.l(sVar, j.f219007a, ((ak1.c.e.ShowDialog) eVar).getDialogData(), null, 4, null);
        } else {
            if (!(eVar instanceof ak1.c.e.C0152c)) {
                throw new oq.p();
            }
            f00.s.m(sVar, s.f219042a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(505343826, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:212)");
        }
        f00.r.n(wVar, fr.q0.c(ek1.k.class), y2.m.d(249209216, true, new er.q() { // from class: xi1.h0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return y0.g0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f218997a.n(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(249209216, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:215)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xi1.t
                @Override // er.l
                public final Object b(Object obj) {
                    return y0.h0(sVar, (ek1.b) obj);
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
    public static final oq.i0 h0(f00.s sVar, ek1.b bVar) {
        if (!fr.t.c(bVar, ek1.b.a.f51767a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(71380145, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:229)");
        }
        j jVar = j.f219007a;
        f00.r.r(wVar, jVar, sVar.g(jVar), y2.m.d(-1807501626, true, new er.q() { // from class: xi1.l0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return y0.j0(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1807501626, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.DefenceTrainingNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefenceTrainingNavContent.kt:235)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: xi1.t0
                @Override // er.l
                public final Object b(Object obj) {
                    return y0.k0(sVar, (cb4.f.a) obj);
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
    public static final oq.i0 k0(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(er.a aVar, int i15, p076m2.r rVar, int i16) {
        I(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
