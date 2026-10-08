package tz1;

import c02.SetupData;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Liz1/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "I", "(Liz1/a;Ler/a;Lm2/r;I)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ler/a;Lm2/r;I)V", "electoralsupport_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d1 {
    public static final void I(final iz1.a aVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-217393789);
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
                p076m2.t.o(-217393789, i16, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavContent (ElectoralSupportNavContent.kt:46)");
            }
            p076m2.d0.c(iz1.c.c().d(aVar), y2.m.d(-1793976125, true, new er.p() { // from class: tz1.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d1.J(aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: tz1.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d1.K(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1793976125, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavContent.<anonymous> (ElectoralSupportNavContent.kt:50)");
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
    public static final oq.i0 K(iz1.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        I(aVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void L(final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(485250062);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(485250062, i16, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph (ElectoralSupportNavContent.kt:57)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            n nVar = n.f192727a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: tz1.y
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d1.M(aVar, sVarJ, (p136y9.d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, nVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: tz1.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d1.r0(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(final er.a aVar, final f00.s sVar, p136y9.d1 d1Var) {
        f00.r.u(d1Var, n.f192727a, null, y2.m.b(1994690895, true, new er.r() { // from class: tz1.a0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.N(aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, u.f192748a, null, y2.m.b(544025144, true, new er.r() { // from class: tz1.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.Q(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s.f192742a, null, y2.m.b(1137513815, true, new er.r() { // from class: tz1.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.T(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.f192723a, null, y2.m.b(1731002486, true, new er.r() { // from class: tz1.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.W(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.f192720a, null, y2.m.b(-1970476139, true, new er.r() { // from class: tz1.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.Z(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, t.f192745a, null, y2.m.b(-1376987468, true, new er.r() { // from class: tz1.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.c0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, o.f192730a, null, y2.m.b(-783498797, true, new er.r() { // from class: tz1.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.f0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p.f192733a, null, y2.m.b(-190010126, true, new er.r() { // from class: tz1.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.i0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, q.f192736a, null, y2.m.b(403478545, true, new er.r() { // from class: tz1.j0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.l0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, r.f192739a, null, y2.m.b(996967216, true, new er.r() { // from class: tz1.k0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.o0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1994690895, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:64)");
        }
        f00.r.n(wVar, fr.q0.c(nz1.d0.class), y2.m.d(489713277, true, new er.q() { // from class: tz1.m0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.O(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f192708a.q(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(489713277, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:67)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tz1.b1
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.P(aVar, sVar, (nz1.a.e) obj);
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
    public static final oq.i0 P(er.a aVar, f00.s sVar, nz1.a.e eVar) {
        if (fr.t.c(eVar, nz1.a.e.C3465a.f139730a)) {
            aVar.a();
        } else if (eVar instanceof nz1.a.e.OnElectionSupportClick) {
            nz1.a.e.OnElectionSupportClick onElectionSupportClick = (nz1.a.e.OnElectionSupportClick) eVar;
            f00.s.l(sVar, u.f192748a, new SetupData(onElectionSupportClick.getAvailableElectionSupport(), onElectionSupportClick.getTrustedProfileStatus()), null, 4, null);
        } else if (eVar instanceof nz1.a.e.OnHistoryOfSupportClick) {
            f00.s.l(sVar, o.f192730a, new wz1.SetupData(((nz1.a.e.OnHistoryOfSupportClick) eVar).getJwtToken()), null, 4, null);
        } else if (!fr.t.c(eVar, nz1.a.e.d.f139734a)) {
            throw new oq.p();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(544025144, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:96)");
        }
        f00.r.o(wVar, fr.q0.c(c02.n.class), sVar.g(u.f192748a), y2.m.d(1433250279, true, new er.q() { // from class: tz1.t0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.R(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f192708a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1433250279, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:100)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tz1.z0
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.S(sVar, (c02.b) obj);
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
    public static final oq.i0 S(f00.s sVar, c02.b bVar) {
        if (fr.t.c(bVar, c02.b.a.f22295a)) {
            sVar.c();
        } else if (fr.t.c(bVar, c02.b.C0593b.f22296a)) {
            sVar.k(s.f192742a, u.f192748a);
        } else if (bVar instanceof c02.b.NextOtherElections) {
            f00.s.l(sVar, m.f192723a, ((c02.b.NextOtherElections) bVar).getAvailableElectionSupport(), null, 4, null);
        } else {
            if (!(bVar instanceof c02.b.NextPresidentialElection)) {
                throw new oq.p();
            }
            f00.s.l(sVar, l.f192720a, ((c02.b.NextPresidentialElection) bVar).getAvailableElectionSupport(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1137513815, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:127)");
        }
        f00.r.n(wVar, fr.q0.c(rz1.j.class), y2.m.d(-2036965627, true, new er.q() { // from class: tz1.n0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.U(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f192708a.t(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2036965627, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:130)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tz1.y0
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.V(sVar, (rz1.b) obj);
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
    public static final oq.i0 V(f00.s sVar, rz1.b bVar) {
        if (!fr.t.c(bVar, rz1.b.a.f176931a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1731002486, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:141)");
        }
        f00.r.o(wVar, fr.q0.c(lz1.l.class), sVar.g(m.f192723a), y2.m.d(-1674739675, true, new er.q() { // from class: tz1.s0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.X(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f192708a.r(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1674739675, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:145)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tz1.v
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.Y(sVar, (lz1.a) obj);
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
    public static final oq.i0 Y(f00.s sVar, lz1.a aVar) {
        if (fr.t.c(aVar, lz1.a.b.f121651a)) {
            sVar.k(n.f192727a, u.f192748a);
        } else if (fr.t.c(aVar, lz1.a.C2981a.f121650a)) {
            sVar.c();
        } else {
            if (!(aVar instanceof lz1.a.Next)) {
                throw new oq.p();
            }
            f00.s.l(sVar, l.f192720a, ((lz1.a.Next) aVar).getAvailableElectionSupport(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1970476139, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:165)");
        }
        f00.r.o(wVar, fr.q0.c(jz1.q.class), sVar.g(l.f192720a), y2.m.d(-1081251004, true, new er.q() { // from class: tz1.q0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.a0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f192708a.s(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1081251004, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:169)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tz1.c1
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.b0(sVar, (jz1.b) obj);
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
    public static final oq.i0 b0(f00.s sVar, jz1.b bVar) {
        if (fr.t.c(bVar, jz1.b.C2546b.f106924a)) {
            f00.s.m(sVar, n.f192727a, null, 2, null);
        } else if (fr.t.c(bVar, jz1.b.a.f106923a)) {
            sVar.c();
        } else {
            if (!(bVar instanceof jz1.b.Next)) {
                throw new oq.p();
            }
            jz1.b.Next next = (jz1.b.Next) bVar;
            f00.s.l(sVar, t.f192745a, new uz1.SetupData(next.getAvailableElectionSupport(), next.getCommitteeData()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1376987468, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:191)");
        }
        f00.r.o(wVar, fr.q0.c(uz1.p.class), sVar.g(t.f192745a), y2.m.d(-487762333, true, new er.q() { // from class: tz1.p0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.d0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f192708a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-487762333, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:195)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tz1.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.e0(sVar, (uz1.a.b) obj);
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
    public static final oq.i0 e0(f00.s sVar, uz1.a.b bVar) {
        if (fr.t.c(bVar, uz1.a.b.C5264b.f202386a)) {
            f00.s.m(sVar, n.f192727a, null, 2, null);
        } else if (fr.t.c(bVar, uz1.a.b.C5263a.f202385a)) {
            sVar.c();
        } else if (!fr.t.c(bVar, uz1.a.b.c.f202387a)) {
            throw new oq.p();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-783498797, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:213)");
        }
        f00.r.o(wVar, fr.q0.c(wz1.q.class), sVar.g(o.f192730a), y2.m.d(105726338, true, new er.q() { // from class: tz1.u0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.g0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f192708a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(105726338, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:217)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tz1.a1
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.h0(sVar, (wz1.a.b) obj);
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
    public static final oq.i0 h0(f00.s sVar, wz1.a.b bVar) {
        if (fr.t.c(bVar, wz1.a.b.C5740a.f216015a)) {
            sVar.c();
        } else if (bVar instanceof wz1.a.b.Next) {
            f00.s.l(sVar, p.f192733a, ((wz1.a.b.Next) bVar).getGrantedSupport(), null, 4, null);
        } else {
            if (!fr.t.c(bVar, wz1.a.b.C5741b.f216016a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, r.f192739a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-190010126, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:236)");
        }
        f00.r.o(wVar, fr.q0.c(yz1.k.class), sVar.g(p.f192733a), y2.m.d(699215009, true, new er.q() { // from class: tz1.o0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.j0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f192708a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(699215009, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:240)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tz1.w0
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.k0(sVar, (yz1.a.b) obj);
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
    public static final oq.i0 k0(f00.s sVar, yz1.a.b bVar) {
        if (fr.t.c(bVar, yz1.a.b.C6210a.f230924a)) {
            sVar.c();
        } else {
            if (!(bVar instanceof yz1.a.b.Next)) {
                throw new oq.p();
            }
            yz1.a.b.Next next = (yz1.a.b.Next) bVar;
            f00.s.l(sVar, q.f192736a, new a02.SetupData(next.getActionName(), next.getGrantedSupport()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(403478545, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:258)");
        }
        f00.r.o(wVar, fr.q0.c(a02.k.class), sVar.g(q.f192736a), y2.m.d(1292703680, true, new er.q() { // from class: tz1.v0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.m0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f192708a.p(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1292703680, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:262)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tz1.x0
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.n0(sVar, (a02.a) obj);
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
    public static final oq.i0 n0(f00.s sVar, a02.a aVar) {
        if (!fr.t.c(aVar, a02.a.C0006a.f1112a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(996967216, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:273)");
        }
        f00.r.n(wVar, fr.q0.c(pz1.l.class), y2.m.d(2117455070, true, new er.q() { // from class: tz1.l0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.p0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f192708a.l(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2117455070, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.navigation.ElectoralSupportNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportNavContent.kt:276)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tz1.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.q0(sVar, (pz1.a) obj);
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
    public static final oq.i0 q0(f00.s sVar, pz1.a aVar) {
        if (!fr.t.c(aVar, pz1.a.C4048a.f163300a)) {
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
