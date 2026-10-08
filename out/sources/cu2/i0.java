package cu2;

import fr.q0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ldu2/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "Lcu2/i;", "startDestination", "z", "(Ldu2/a;Ler/a;Lcu2/i;Lm2/r;I)V", "C", "(Ler/a;Lcu2/i;Lm2/r;I)V", "peselrestrictionverification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(er.a aVar, i iVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-138040171, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavContent.<anonymous> (PeselRestrictionVerificationNavContent.kt:43)");
            }
            C(aVar, iVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(du2.a aVar, er.a aVar2, i iVar, int i15, p076m2.r rVar, int i16) {
        z(aVar, aVar2, iVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void C(final er.a<oq.i0> aVar, final i iVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(230363866);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(iVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(230363866, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph (PeselRestrictionVerificationNavContent.kt:51)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: cu2.h0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i0.D(sVarJ, aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, iVar, (er.l) objE, rVarH, (i16 & 112) | f00.s.f54562e);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cu2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i0.Z(aVar, iVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(final f00.s sVar, final er.a aVar, d1 d1Var) {
        f00.r.u(d1Var, i.e.f37990a, null, y2.m.b(-62650951, true, new er.r() { // from class: cu2.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.E(aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i.C0807i.f38003a, null, y2.m.b(-1580117520, true, new er.r() { // from class: cu2.m
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.H(aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i.c.f37980a, null, y2.m.b(-536329551, true, new er.r() { // from class: cu2.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.K(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i.f.f37993a, null, y2.m.b(507458418, true, new er.r() { // from class: cu2.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.N(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i.h.f38001a, null, y2.m.b(1551246387, true, new er.r() { // from class: cu2.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.Q(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i.j.f38005a, null, y2.m.b(-1699932940, true, new er.r() { // from class: cu2.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.T(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i.b.f37978a, null, y2.m.b(-656144971, true, new er.r() { // from class: cu2.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.W(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        uw.m.c(d1Var, i.a.f37976a, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-62650951, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionVerificationNavContent.kt:61)");
        }
        f00.r.n(wVar, q0.c(gu2.k.class), y2.m.d(342244939, true, new er.q() { // from class: cu2.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i0.F(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f37968a.l(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(342244939, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionVerificationNavContent.kt:64)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: cu2.d0
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.G(aVar, sVar, (gu2.a.c) obj);
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
    public static final oq.i0 G(er.a aVar, f00.s sVar, gu2.a.c cVar) {
        if (fr.t.c(cVar, gu2.a.c.C1745a.f77001a)) {
            aVar.a();
        } else if (cVar instanceof gu2.a.c.GoToErrorScreen) {
            f00.s.l(sVar, i.b.f37978a, ((gu2.a.c.GoToErrorScreen) cVar).getErrorData(), null, 4, null);
        } else {
            if (!fr.t.c(cVar, gu2.a.c.C1746c.f77003a)) {
                throw new oq.p();
            }
            sVar.k(i.C0807i.f38003a, i.e.f37990a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1580117520, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionVerificationNavContent.kt:88)");
        }
        f00.r.n(wVar, q0.c(pu2.o.class), y2.m.d(977776130, true, new er.q() { // from class: cu2.z
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i0.I(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f37968a.h(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(977776130, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionVerificationNavContent.kt:91)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: cu2.j
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.J(aVar, sVar, (pu2.b) obj);
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
    public static final oq.i0 J(er.a aVar, f00.s sVar, pu2.b bVar) {
        if (fr.t.c(bVar, pu2.b.a.f162745a)) {
            aVar.a();
        } else if (bVar instanceof pu2.b.C4012b) {
            f00.s.m(sVar, i.c.f37980a, null, 2, null);
        } else {
            if (!fr.t.c(bVar, pu2.b.c.f162747a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, i.f.f37993a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-536329551, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionVerificationNavContent.kt:112)");
        }
        f00.r.n(wVar, q0.c(eu2.g0.class), y2.m.d(2021564099, true, new er.q() { // from class: cu2.y
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i0.L(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f37968a.i(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2021564099, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionVerificationNavContent.kt:115)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: cu2.a0
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.M(sVar, aVar, (eu2.a.d) obj);
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
    public static final oq.i0 M(f00.s sVar, er.a aVar, eu2.a.d dVar) {
        if (fr.t.c(dVar, eu2.a.d.C1263a.f53585a)) {
            sVar.c();
        } else if (fr.t.c(dVar, eu2.a.d.c.f53587a)) {
            aVar.a();
        } else if (dVar instanceof eu2.a.d.OpenExitDialog) {
            f00.s.l(sVar, i.j.f38005a, ((eu2.a.d.OpenExitDialog) dVar).getDialogData(), null, 4, null);
        } else if (dVar instanceof eu2.a.d.GoToResult) {
            sVar.j(i.h.f38001a, ((eu2.a.d.GoToResult) dVar).getWizardResultData(), i.C0807i.f38003a);
        } else if (dVar instanceof eu2.a.d.Error) {
            f00.s.l(sVar, i.b.f37978a, ((eu2.a.d.Error) dVar).getErrorData(), null, 4, null);
        } else {
            if (!(dVar instanceof eu2.a.d.ToDatePicker)) {
                throw new oq.p();
            }
            eu2.a.d.ToDatePicker fVar = (eu2.a.d.ToDatePicker) dVar;
            f00.s.l(sVar, i.a.f37976a, new uw.j.Single(null, fVar.getInitialDate(), fVar.d(), fVar.getMinimumDate(), fVar.getMaximumDate(), 1, null), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(507458418, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionVerificationNavContent.kt:159)");
        }
        f00.r.n(wVar, q0.c(ju2.g0.class), y2.m.d(-1229615228, true, new er.q() { // from class: cu2.v
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i0.O(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f37968a.j(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1229615228, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionVerificationNavContent.kt:162)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: cu2.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.P(sVar, aVar, (ju2.e.d) obj);
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
    public static final oq.i0 P(f00.s sVar, er.a aVar, ju2.e.d dVar) {
        if (fr.t.c(dVar, ju2.e.d.a.f105888a)) {
            sVar.c();
        } else if (fr.t.c(dVar, ju2.e.d.c.f105890a)) {
            aVar.a();
        } else if (dVar instanceof ju2.e.d.OpenExitDialog) {
            f00.s.l(sVar, i.j.f38005a, ((ju2.e.d.OpenExitDialog) dVar).getDialogData(), null, 4, null);
        } else if (dVar instanceof ju2.e.d.GoToResult) {
            sVar.j(i.h.f38001a, ((ju2.e.d.GoToResult) dVar).getWizardResultData(), i.C0807i.f38003a);
        } else if (dVar instanceof ju2.e.d.Error) {
            f00.s.l(sVar, i.b.f37978a, ((ju2.e.d.Error) dVar).getErrorData(), null, 4, null);
        } else {
            if (!(dVar instanceof ju2.e.d.ToDatePicker)) {
                throw new oq.p();
            }
            ju2.e.d.ToDatePicker fVar = (ju2.e.d.ToDatePicker) dVar;
            f00.s.l(sVar, i.a.f37976a, new uw.j.Single(null, fVar.getInitialDate(), fVar.d(), fVar.getMinimumDate(), fVar.getMaximumDate(), 1, null), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1551246387, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionVerificationNavContent.kt:204)");
        }
        f00.r.o(wVar, q0.c(lu2.q.class), sVar.g(i.h.f38001a), y2.m.d(-226782620, true, new er.q() { // from class: cu2.w
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i0.R(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f37968a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-226782620, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionVerificationNavContent.kt:210)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: cu2.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.S(aVar, sVar, (lu2.e) obj);
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
    public static final oq.i0 S(er.a aVar, f00.s sVar, lu2.e eVar) {
        if (fr.t.c(eVar, lu2.e.a.f120486a)) {
            aVar.a();
        } else {
            if (!fr.t.c(eVar, lu2.e.b.f120487a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, i.C0807i.f38003a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1699932940, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionVerificationNavContent.kt:228)");
        }
        i.j jVar = i.j.f38005a;
        f00.r.r(wVar, jVar, sVar.g(jVar), y2.m.d(1078765119, true, new er.q() { // from class: cu2.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i0.U(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1078765119, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionVerificationNavContent.kt:234)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: cu2.u
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.V(sVar, (cb4.f.a) obj);
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
    public static final oq.i0 V(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-656144971, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionVerificationNavContent.kt:244)");
        }
        i.b bVar = i.b.f37978a;
        f00.r.r(wVar, bVar, sVar.g(bVar), y2.m.d(-1682462890, true, new er.q() { // from class: cu2.x
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i0.X(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            p076m2.t.o(-1682462890, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionVerificationNavContent.kt:248)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: cu2.e0
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.Y(sVar, (hb4.b.a) obj);
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
    public static final oq.i0 Z(er.a aVar, i iVar, int i15, p076m2.r rVar, int i16) {
        C(aVar, iVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void z(final du2.a aVar, final er.a<oq.i0> aVar2, final i iVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2051299371);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(iVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2051299371, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.PeselRestrictionVerificationNavContent (PeselRestrictionVerificationNavContent.kt:39)");
            }
            p076m2.d0.c(du2.c.c().d(aVar), y2.m.d(-138040171, true, new er.p() { // from class: cu2.f0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i0.A(aVar2, iVar, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: cu2.g0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i0.B(aVar, aVar2, iVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
