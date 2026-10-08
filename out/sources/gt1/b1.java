package gt1;

import kt1.DrivingLicenceRestrictionConfirmationData;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p7.CreationExtras;
import qt1.SetupData;
import tt1.DocumentRestrictionPassportDetailsSetupData;
import tt1.DocumentRestrictionPassportsListSetupData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lht1/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lht1/a;Ler/a;Lm2/r;I)V", "K", "(Ler/a;Lm2/r;I)V", "documentrestriction_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b1 {
    public static final void H(final ht1.a aVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(724570949);
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
                p076m2.t.o(724570949, i16, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavContent (DocumentRestrictionNavContent.kt:50)");
            }
            p076m2.d0.c(ht1.c.c().d(aVar), y2.m.d(-904841211, true, new er.p() { // from class: gt1.a1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b1.I(aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: gt1.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b1.J(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-904841211, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavContent.<anonymous> (DocumentRestrictionNavContent.kt:54)");
            }
            K(aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(ht1.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        H(aVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void K(final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-922566375);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-922566375, i16, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph (DocumentRestrictionNavContent.kt:61)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            j jVar = j.f76704a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: gt1.w
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b1.L(sVarJ, aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, jVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gt1.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b1.p0(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final f00.s sVar, final er.a aVar, d1 d1Var) {
        f00.r.u(d1Var, j.f76704a, null, y2.m.b(-1363453286, true, new er.r() { // from class: gt1.y
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b1.M(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.f76713a, null, y2.m.b(-935913021, true, new er.r() { // from class: gt1.z
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b1.O(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p.f76722a, null, y2.m.b(1183137954, true, new er.r() { // from class: gt1.a0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b1.R(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, r.f76728a, null, y2.m.b(-992778367, true, new er.r() { // from class: gt1.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b1.U(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, q.f76725a, null, y2.m.b(1126272608, true, new er.r() { // from class: gt1.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b1.X(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, n.f76716a, null, y2.m.b(-1049643713, true, new er.r() { // from class: gt1.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b1.a0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, o.f76719a, null, y2.m.b(1069407262, true, new er.r() { // from class: gt1.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b1.d0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.f76707a, null, y2.m.b(-1106509059, true, new er.r() { // from class: gt1.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b1.g0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.f76710a, null, i.f76694a.j(), 2, null);
        f00.r.u(d1Var, s.f76731a, null, y2.m.b(-1163374405, true, new er.r() { // from class: gt1.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b1.j0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, t.f76734a, null, y2.m.b(1375458499, true, new er.r() { // from class: gt1.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b1.m0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1363453286, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:68)");
        }
        androidx.p016lifecycle.y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        it1.z zVar = (it1.z) q7.d.c(fr.q0.c(it1.z.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<it1.a.d> bVarY1 = zVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gt1.t0
                @Override // er.l
                public final Object b(Object obj) {
                    return b1.N(sVar, aVar, (it1.a.d) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        it1.q.l(zVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(f00.s sVar, er.a aVar, it1.a.d dVar) {
        if (fr.t.c(dVar, it1.a.d.C2268d.f96950a)) {
            f00.s.l(sVar, m.f76713a, new SetupData(false, 1, null), null, 4, null);
        } else if (dVar instanceof it1.a.d.b) {
            f00.s.l(sVar, s.f76731a, ((it1.a.d.b) dVar).a(), null, 4, null);
        } else if (fr.t.c(dVar, it1.a.d.C2267a.f96948a)) {
            aVar.a();
        } else if (dVar instanceof it1.a.d.ToPassportRestrictionDetails) {
            f00.s.l(sVar, n.f76716a, new DocumentRestrictionPassportDetailsSetupData(((it1.a.d.ToPassportRestrictionDetails) dVar).getPassport()), null, 4, null);
        } else if (dVar instanceof it1.a.d.ToPassportsList) {
            f00.s.l(sVar, o.f76719a, new DocumentRestrictionPassportsListSetupData(((it1.a.d.ToPassportsList) dVar).a()), null, 4, null);
        } else {
            if (!fr.t.c(dVar, it1.a.d.c.f96949a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, k.f76707a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-935913021, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:109)");
        }
        f00.r.o(wVar, fr.q0.c(qt1.r.class), sVar.g(m.f76713a), y2.m.d(-1654539982, true, new er.q() { // from class: gt1.k0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b1.P(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f76694a.l(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1654539982, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:115)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gt1.y0
                @Override // er.l
                public final Object b(Object obj) {
                    return b1.Q(sVar, (qt1.a.c) obj);
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
    public static final oq.i0 Q(f00.s sVar, qt1.a.c cVar) {
        if (fr.t.c(cVar, qt1.a.c.C4256a.f168437a)) {
            sVar.c();
        } else if (cVar instanceof qt1.a.c.Error) {
            f00.s.l(sVar, s.f76731a, ((qt1.a.c.Error) cVar).getErrorData(), null, 4, null);
        } else if (cVar instanceof qt1.a.c.RestrictIdCard) {
            f00.s.l(sVar, p.f76722a, new kt1.a.IdSetupData(((qt1.a.c.RestrictIdCard) cVar).getPhysicalIdCardRestrictions()), null, 4, null);
        } else {
            if (!(cVar instanceof qt1.a.c.UndoRestrictionIdCard)) {
                throw new oq.p();
            }
            f00.s.l(sVar, r.f76728a, new mt1.a.IdSetupData(((qt1.a.c.UndoRestrictionIdCard) cVar).getPhysicalIdCardRestrictions()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1183137954, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:146)");
        }
        f00.r.o(wVar, fr.q0.c(jt1.d0.class), sVar.g(p.f76722a), y2.m.d(464510993, true, new er.q() { // from class: gt1.n0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b1.S(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f76694a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(464510993, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:152)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gt1.z0
                @Override // er.l
                public final Object b(Object obj) {
                    return b1.T(sVar, (jt1.a.c) obj);
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
    public static final oq.i0 T(f00.s sVar, jt1.a.c cVar) {
        if (fr.t.c(cVar, jt1.a.c.C2497a.f105234a)) {
            sVar.c();
        } else {
            if (!(cVar instanceof jt1.a.c.Success)) {
                throw new oq.p();
            }
            jt1.a.c.Success success = (jt1.a.c.Success) cVar;
            f00.s.l(sVar, q.f76725a, new ut1.SetupData(success.getTitle(), success.getDescription(), success.getRestrictedDocumentType(), success.getPassport()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-992778367, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:174)");
        }
        f00.r.o(wVar, fr.q0.c(lt1.b0.class), sVar.g(r.f76728a), y2.m.d(-1711405328, true, new er.q() { // from class: gt1.o0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b1.V(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f76694a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1711405328, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:180)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gt1.w0
                @Override // er.l
                public final Object b(Object obj) {
                    return b1.W(sVar, (lt1.a.c) obj);
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
    public static final oq.i0 W(f00.s sVar, lt1.a.c cVar) {
        if (fr.t.c(cVar, lt1.a.c.C2933a.f120158a)) {
            sVar.c();
        } else {
            if (!(cVar instanceof lt1.a.c.Success)) {
                throw new oq.p();
            }
            lt1.a.c.Success success = (lt1.a.c.Success) cVar;
            f00.s.l(sVar, q.f76725a, new ut1.SetupData(success.getTitle(), success.getDescription(), success.getRestrictedDocumentType(), success.getPassport()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1126272608, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:203)");
        }
        f00.r.o(wVar, fr.q0.c(ut1.n.class), sVar.g(q.f76725a), y2.m.d(407645647, true, new er.q() { // from class: gt1.r0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b1.Y(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f76694a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(407645647, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:209)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gt1.u0
                @Override // er.l
                public final Object b(Object obj) {
                    return b1.Z(sVar, (ut1.d) obj);
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
    public static final oq.i0 Z(f00.s sVar, ut1.d dVar) {
        if (fr.t.c(dVar, ut1.d.b.f201346a)) {
            m mVar = m.f76713a;
            sVar.j(mVar, new SetupData(true), mVar);
        } else if (dVar instanceof ut1.d.CloseToPassportDashboard) {
            n nVar = n.f76716a;
            sVar.j(nVar, new DocumentRestrictionPassportDetailsSetupData(((ut1.d.CloseToPassportDashboard) dVar).getPassport()), nVar);
        } else {
            if (!fr.t.c(dVar, ut1.d.a.f201345a)) {
                throw new oq.p();
            }
            k kVar = k.f76707a;
            sVar.k(kVar, kVar);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1049643713, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:238)");
        }
        f00.r.o(wVar, fr.q0.c(rt1.w.class), sVar.g(n.f76716a), y2.m.d(-1768270674, true, new er.q() { // from class: gt1.l0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b1.b0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f76694a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1768270674, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:244)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gt1.v0
                @Override // er.l
                public final Object b(Object obj) {
                    return b1.c0(sVar, (rt1.a.d) obj);
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
    public static final oq.i0 c0(f00.s sVar, rt1.a.d dVar) {
        if (fr.t.c(dVar, rt1.a.d.C4488a.f175987a)) {
            sVar.c();
        } else if (dVar instanceof rt1.a.d.Error) {
            f00.s.l(sVar, s.f76731a, ((rt1.a.d.Error) dVar).getErrorData(), null, 4, null);
        } else if (dVar instanceof rt1.a.d.Restrict) {
            rt1.a.d.Restrict cVar = (rt1.a.d.Restrict) dVar;
            f00.s.l(sVar, p.f76722a, new kt1.a.PassportSetupData(cVar.getPassport(), cVar.getPassportRestriction()), null, 4, null);
        } else {
            if (!(dVar instanceof rt1.a.d.UnRestrict)) {
                throw new oq.p();
            }
            rt1.a.d.UnRestrict c4489d = (rt1.a.d.UnRestrict) dVar;
            f00.s.l(sVar, r.f76728a, new mt1.a.PassportSetupData(c4489d.getPassport(), c4489d.getPassportRestriction()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1069407262, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:276)");
        }
        f00.r.o(wVar, fr.q0.c(st1.r.class), sVar.g(o.f76719a), y2.m.d(350780301, true, new er.q() { // from class: gt1.m0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b1.e0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f76694a.p(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(350780301, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:282)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gt1.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return b1.f0(sVar, (st1.a.c) obj);
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
    public static final oq.i0 f0(f00.s sVar, st1.a.c cVar) {
        if (fr.t.c(cVar, st1.a.c.C4750a.f184195a)) {
            sVar.c();
        } else if (cVar instanceof st1.a.c.Error) {
            f00.s.l(sVar, s.f76731a, ((st1.a.c.Error) cVar).getErrorData(), null, 4, null);
        } else {
            if (!(cVar instanceof st1.a.c.ToRestrictionPassportDetails)) {
                throw new oq.p();
            }
            f00.s.l(sVar, n.f76716a, new DocumentRestrictionPassportDetailsSetupData(((st1.a.c.ToRestrictionPassportDetails) cVar).getPassport()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1106509059, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:304)");
        }
        f00.r.n(wVar, fr.q0.c(nt1.t.class), y2.m.d(1683480619, true, new er.q() { // from class: gt1.j0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b1.h0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i.f76694a.i(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1683480619, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:307)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gt1.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return b1.i0(sVar, (nt1.a.b) obj);
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
    public static final oq.i0 i0(f00.s sVar, nt1.a.b bVar) {
        if (fr.t.c(bVar, nt1.a.b.C3413a.f138312a)) {
            sVar.c();
        } else if (bVar instanceof nt1.a.b.RestrictDrivingLicence) {
            nt1.a.b.RestrictDrivingLicence restrictDrivingLicence = (nt1.a.b.RestrictDrivingLicence) bVar;
            f00.s.l(sVar, p.f76722a, new kt1.a.DrivingLicenceSetupData(new DrivingLicenceRestrictionConfirmationData(restrictDrivingLicence.getDrivingLicence().getDocumentId(), restrictDrivingLicence.getDrivingLicence().getDocumentNumber())), null, 4, null);
        } else {
            if (!(bVar instanceof nt1.a.b.UndoRestrictionDrivingLicence)) {
                throw new oq.p();
            }
            f00.s.l(sVar, r.f76728a, new mt1.a.DrivingLicenceSetupData(((nt1.a.b.UndoRestrictionDrivingLicence) bVar).getDrivingLicence()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1163374405, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:341)");
        }
        s sVar2 = s.f76731a;
        f00.r.D(wVar, sVar2, sVar.e(sVar2), y2.m.d(1337127484, true, new er.q() { // from class: gt1.p0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b1.k0(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k0(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1337127484, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:347)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gt1.u
                @Override // er.l
                public final Object b(Object obj) {
                    return b1.l0(sVar, (hb4.b.a) obj);
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
    public static final oq.i0 l0(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1375458499, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:356)");
        }
        t tVar = t.f76734a;
        f00.r.D(wVar, tVar, sVar.e(tVar), y2.m.d(1581605730, true, new er.q() { // from class: gt1.s0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b1.n0(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n0(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1581605730, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.DocumentRestrictionNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentRestrictionNavContent.kt:362)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gt1.x0
                @Override // er.l
                public final Object b(Object obj) {
                    return b1.o0(sVar, (hb4.b.a) obj);
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
    public static final oq.i0 o0(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        f00.s.m(sVar, j.f76704a, null, 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p0(er.a aVar, int i15, p076m2.r rVar, int i16) {
        K(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
