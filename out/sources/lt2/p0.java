package lt2;

import fr.q0;
import java.time.LocalDate;
import nt2.PeselRestrictionStatusSetupData;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxs2/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "z", "(Lxs2/a;Ler/a;Lm2/r;I)V", "C", "(Ler/a;Lm2/r;I)V", "peselrestriction_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(11517369, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavContent.<anonymous> (PeselRestrictionNavContent.kt:45)");
            }
            C(aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(xs2.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        z(aVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void C(final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-147248135);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-147248135, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph (PeselRestrictionNavContent.kt:52)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            n nVar = n.f120349a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: lt2.o0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p0.D(sVarJ, aVar, (d1) obj);
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
            d5VarM.a(new er.p() { // from class: lt2.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p0.Z(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(final f00.s sVar, final er.a aVar, d1 d1Var) {
        f00.r.u(d1Var, n.f120349a, null, y2.m.b(1362192698, true, new er.r() { // from class: lt2.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return p0.E(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.f120346a, null, y2.m.b(-88473053, true, new er.r() { // from class: lt2.t
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return p0.H(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p.f120358a, null, y2.m.b(505015618, true, new er.r() { // from class: lt2.u
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return p0.K(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.f120342a, null, y2.m.b(1098504289, true, new er.r() { // from class: lt2.v
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return p0.N(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.f120338a, null, y2.m.b(1691992960, true, new er.r() { // from class: lt2.w
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return p0.Q(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.f120329a, null, y2.m.b(-2009485665, true, new er.r() { // from class: lt2.x
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return p0.T(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, j.f120335a, null, y2.m.b(-1415996994, true, new er.r() { // from class: lt2.y
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return p0.W(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        uw.m.c(d1Var, i.f120332a, sVar);
        ww.d.c(d1Var, o.f120354a, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1362192698, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionNavContent.kt:59)");
        }
        mr.c cVarC = q0.c(nt2.z.class);
        PeselRestrictionStatusSetupData peselRestrictionStatusSetupData = (PeselRestrictionStatusSetupData) sVar.g(n.f120349a);
        if (peselRestrictionStatusSetupData == null) {
            peselRestrictionStatusSetupData = new PeselRestrictionStatusSetupData(null);
        }
        f00.r.o(wVar, cVarC, peselRestrictionStatusSetupData, y2.m.d(643565737, true, new er.q() { // from class: lt2.c0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return p0.F(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), g.f120321a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(643565737, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionNavContent.kt:65)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: lt2.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return p0.G(aVar, sVar, (nt2.a.j) obj);
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
    public static final oq.i0 G(er.a aVar, f00.s sVar, nt2.a.j jVar) {
        if (fr.t.c(jVar, nt2.a.j.C3419a.f138408a)) {
            aVar.a();
        } else if (jVar instanceof nt2.a.j.Error) {
            f00.s.l(sVar, j.f120335a, ((nt2.a.j.Error) jVar).getErrorData(), null, 4, null);
        } else if (jVar instanceof nt2.a.j.ToMoreInfo) {
            f00.s.l(sVar, l.f120342a, ((nt2.a.j.ToMoreInfo) jVar).getPeselRestrictionMoreInfoNavParams(), null, 4, null);
        } else if (jVar instanceof nt2.a.j.ToRestrictionHistory) {
            f00.s.l(sVar, m.f120346a, ((nt2.a.j.ToRestrictionHistory) jVar).getPeselRestrictionHistoryNavParams(), null, 4, null);
        } else {
            if (!fr.t.c(jVar, nt2.a.j.e.f138412a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, p.f120358a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-88473053, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionNavContent.kt:94)");
        }
        f00.r.o(wVar, q0.c(gt2.y.class), sVar.g(m.f120346a), y2.m.d(800752082, true, new er.q() { // from class: lt2.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return p0.I(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), g.f120321a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(800752082, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionNavContent.kt:100)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: lt2.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return p0.J(sVar, (gt2.c.f) obj);
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
    public static final oq.i0 J(f00.s sVar, gt2.c.f fVar) {
        if (fr.t.c(fVar, gt2.c.f.a.f76770a)) {
            sVar.c();
        } else if (fVar instanceof gt2.c.f.Error) {
            f00.s.l(sVar, j.f120335a, ((gt2.c.f.Error) fVar).getErrorData(), null, 4, null);
        } else if (fVar instanceof gt2.c.f.ToFilter) {
            f00.s.l(sVar, k.f120338a, ((gt2.c.f.ToFilter) fVar).getPeselRestrictionHistoryFilterNavParams(), null, 4, null);
        } else {
            if (!(fVar instanceof gt2.c.f.ToRestrictionCheckDetails)) {
                throw new oq.p();
            }
            f00.s.l(sVar, h.f120329a, ((gt2.c.f.ToRestrictionCheckDetails) fVar).getPeselRestrictionHistoryChecksDetailsDestinationParams(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(505015618, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionNavContent.kt:126)");
        }
        f00.r.n(wVar, q0.c(qt2.q.class), y2.m.d(1625503472, true, new er.q() { // from class: lt2.g0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return p0.L(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), g.f120321a.l(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1625503472, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionNavContent.kt:129)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: lt2.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return p0.M(sVar, (qt2.a.b) obj);
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
    public static final oq.i0 M(f00.s sVar, qt2.a.b bVar) {
        if (fr.t.c(bVar, qt2.a.b.C4262a.f168526a)) {
            sVar.c();
        } else if (bVar instanceof qt2.a.b.GoBackToPreviousScreen) {
            f00.s.l(sVar, n.f120349a, new PeselRestrictionStatusSetupData(((qt2.a.b.GoBackToPreviousScreen) bVar).getNavParam()), null, 4, null);
        } else if (bVar instanceof qt2.a.b.ToErrorScreen) {
            f00.s.l(sVar, j.f120335a, ((qt2.a.b.ToErrorScreen) bVar).getResultData(), null, 4, null);
        } else if (bVar instanceof qt2.a.b.OpenDatePicker) {
            qt2.a.b.OpenDatePicker cVar = (qt2.a.b.OpenDatePicker) bVar;
            f00.s.l(sVar, i.f120332a, new uw.j.Single(null, cVar.getCurrentDate(), cVar.c(), cVar.getMinDate(), null, 17, null), null, 4, null);
        } else {
            if (!(bVar instanceof qt2.a.b.OpenTimePicker)) {
                throw new oq.p();
            }
            f00.s.l(sVar, o.f120354a, ((qt2.a.b.OpenTimePicker) bVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1098504289, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionNavContent.kt:166)");
        }
        f00.r.o(wVar, q0.c(jt2.m.class), sVar.g(l.f120342a), y2.m.d(1987729424, true, new er.q() { // from class: lt2.e0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return p0.O(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), g.f120321a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1987729424, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionNavContent.kt:172)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: lt2.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return p0.P(aVar, sVar, (jt2.b) obj);
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
    public static final oq.i0 P(er.a aVar, f00.s sVar, jt2.b bVar) {
        if (fr.t.c(bVar, jt2.b.C2503b.f105393a)) {
            aVar.a();
        } else {
            if (!fr.t.c(bVar, jt2.b.a.f105392a)) {
                throw new oq.p();
            }
            sVar.c();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1691992960, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionNavContent.kt:184)");
        }
        f00.r.o(wVar, q0.c(ct2.p.class), sVar.g(k.f120338a), y2.m.d(-1713749201, true, new er.q() { // from class: lt2.d0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return p0.R(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), g.f120321a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1713749201, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionNavContent.kt:190)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: lt2.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return p0.S(sVar, (ct2.a.c) obj);
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
    public static final oq.i0 S(f00.s sVar, ct2.a.c cVar) {
        if (fr.t.c(cVar, ct2.a.c.b.f37750a)) {
            sVar.c();
        } else if (cVar instanceof ct2.a.c.OpenDatePicker) {
            i iVar = i.f120332a;
            ct2.a.c.OpenDatePicker openDatePicker = (ct2.a.c.OpenDatePicker) cVar;
            LocalDate currentDate = openDatePicker.getCurrentDate();
            if (currentDate == null) {
                currentDate = LocalDate.now();
            }
            f00.s.l(sVar, iVar, new uw.j.Single(null, currentDate, openDatePicker.d(), openDatePicker.getMinDate(), openDatePicker.getMaxDate(), 1, null), null, 4, null);
        } else {
            if (!(cVar instanceof ct2.a.c.ApplyFilterData)) {
                throw new oq.p();
            }
            f00.s.l(sVar, m.f120346a, ((ct2.a.c.ApplyFilterData) cVar).getNavParams(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2009485665, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionNavContent.kt:217)");
        }
        f00.r.o(wVar, q0.c(ys2.n.class), sVar.g(h.f120329a), y2.m.d(-1120260530, true, new er.q() { // from class: lt2.z
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return p0.U(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), g.f120321a.g(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1120260530, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionNavContent.kt:223)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: lt2.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return p0.V(sVar, (ys2.b) obj);
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
    public static final oq.i0 V(f00.s sVar, ys2.b bVar) {
        if (!fr.t.c(bVar, ys2.b.a.f229228a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1415996994, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionNavContent.kt:234)");
        }
        j jVar = j.f120335a;
        f00.r.r(wVar, jVar, sVar.g(jVar), y2.m.d(-1799604227, true, new er.q() { // from class: lt2.f0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return p0.X(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            p076m2.t.o(-1799604227, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionNavContent.kt:238)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: lt2.q
                @Override // er.l
                public final Object b(Object obj) {
                    return p0.Y(sVar, (hb4.b.a) obj);
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
    public static final oq.i0 Z(er.a aVar, int i15, p076m2.r rVar, int i16) {
        C(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void z(final xs2.a aVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1588099705);
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
                p076m2.t.o(1588099705, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.navigation.PeselRestrictionNavContent (PeselRestrictionNavContent.kt:41)");
            }
            p076m2.d0.c(xs2.c.c().d(aVar), y2.m.d(11517369, true, new er.p() { // from class: lt2.m0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p0.A(aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: lt2.n0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p0.B(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
