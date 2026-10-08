package ge2;

import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import vy.Coordinates;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lge2/m;", "sharedVM", "Loq/i0;", "G", "(Lge2/m;Lm2/r;I)V", "incidentreport_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t0 {
    public static final void G(final m mVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1427052417);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(mVar) : rVarH.G(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1427052417, i16, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent (NewIncidentSharedNavContent.kt:44)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            be2.h.f fVar = be2.h.f.f18959b;
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(mVar))) {
                z15 = true;
            }
            boolean zG = rVarH.G(sVarJ) | z15;
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ge2.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t0.H(sVarJ, mVar, (p136y9.d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, fVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ge2.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t0.m0(mVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(final f00.s sVar, final m mVar, p136y9.d1 d1Var) {
        f00.r.u(d1Var, be2.h.f.f18959b, null, y2.m.b(-1982785634, true, new er.r() { // from class: ge2.j0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.I(mVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, be2.h.b.f18955b, null, y2.m.b(1489725973, true, new er.r() { // from class: ge2.m0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.L(mVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, be2.h.d.f18957b, null, y2.m.b(-269633898, true, new er.r() { // from class: ge2.n0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.O(mVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, be2.h.e.f18958b, null, y2.m.b(-2028993769, true, new er.r() { // from class: ge2.o0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.R(mVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, be2.h.c.f18956b, null, y2.m.b(506613656, true, new er.r() { // from class: ge2.p0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.U(mVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, be2.h.i.f18962b, null, y2.m.b(-1252746215, true, new er.r() { // from class: ge2.q0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.X(mVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, be2.h.g.f18960b, null, y2.m.b(1282861210, true, new er.r() { // from class: ge2.r0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.a0(mVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, be2.h.C0474h.f18961b, null, y2.m.b(-476498661, true, new er.r() { // from class: ge2.s0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.d0(mVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, be2.k.f18968a, null, y2.m.b(2059108764, true, new er.r() { // from class: ge2.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.g0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, be2.f.f18949a, null, y2.m.b(299748893, true, new er.r() { // from class: ge2.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t0.j0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        uw.m.c(d1Var, be2.h.a.f18954b, sVar);
        ww.d.c(d1Var, be2.h.j.f18963b, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(final m mVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1982785634, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:52)");
        }
        f00.r.o(wVar, fr.q0.c(re2.z.class), mVar, y2.m.d(-186610225, true, new er.q() { // from class: ge2.z
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.J(mVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f72140a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(final m mVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-186610225, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:56)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(mVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ge2.d0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.K(mVar, sVar, (re2.a.f) obj);
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
    public static final oq.i0 K(m mVar, f00.s sVar, re2.a.f fVar) {
        if (fr.t.c(fVar, re2.a.f.C4428a.f173466a)) {
            mVar.R6();
        } else if (fr.t.c(fVar, re2.a.f.b.f173467a)) {
            f00.s.m(sVar, be2.h.b.f18955b, null, 2, null);
        } else {
            if (!(fVar instanceof re2.a.f.ShowImagePreview)) {
                throw new oq.p();
            }
            f00.s.l(sVar, be2.f.f18949a, ((re2.a.f.ShowImagePreview) fVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final m mVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1489725973, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:74)");
        }
        f00.r.o(wVar, fr.q0.c(he2.o.class), mVar, y2.m.d(1037441030, true, new er.q() { // from class: ge2.x
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.M(sVar, mVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f72140a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(final f00.s sVar, final m mVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1037441030, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:78)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(mVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ge2.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.N(sVar, mVar, (he2.a.b) obj);
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
    public static final oq.i0 N(f00.s sVar, m mVar, he2.a.b bVar) {
        if (fr.t.c(bVar, he2.a.b.C1934a.f83979a)) {
            sVar.c();
        } else if (fr.t.c(bVar, he2.a.b.C1935b.f83980a)) {
            mVar.R6();
        } else {
            if (!fr.t.c(bVar, he2.a.b.c.f83981a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, be2.h.d.f18957b, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final m mVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-269633898, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:93)");
        }
        f00.r.o(wVar, fr.q0.c(le2.r.class), mVar, y2.m.d(-721918841, true, new er.q() { // from class: ge2.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.P(sVar, mVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f72140a.r(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(final f00.s sVar, final m mVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-721918841, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:97)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(mVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ge2.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.Q(sVar, mVar, (le2.b.InterfaceC2864b) obj);
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
    public static final oq.i0 Q(f00.s sVar, m mVar, le2.b.InterfaceC2864b interfaceC2864b) {
        if (fr.t.c(interfaceC2864b, le2.b.InterfaceC2864b.a.f118000a)) {
            sVar.c();
        } else if (fr.t.c(interfaceC2864b, le2.b.InterfaceC2864b.C2865b.f118001a)) {
            mVar.R6();
        } else if (fr.t.c(interfaceC2864b, le2.b.InterfaceC2864b.d.f118003a)) {
            f00.s.m(sVar, be2.h.e.f18958b, null, 2, null);
        } else if (fr.t.c(interfaceC2864b, le2.b.InterfaceC2864b.c.f118002a)) {
            f00.s.m(sVar, be2.h.c.f18956b, null, 2, null);
        } else if (interfaceC2864b instanceof le2.b.InterfaceC2864b.ShowDatePicker) {
            f00.s.l(sVar, be2.h.a.f18954b, ((le2.b.InterfaceC2864b.ShowDatePicker) interfaceC2864b).getData(), null, 4, null);
        } else {
            if (!(interfaceC2864b instanceof le2.b.InterfaceC2864b.ShowTimePicker)) {
                throw new oq.p();
            }
            f00.s.l(sVar, be2.h.j.f18963b, ((le2.b.InterfaceC2864b.ShowTimePicker) interfaceC2864b).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(m mVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2028993769, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:123)");
        }
        f00.r.o(wVar, fr.q0.c(ne2.t.class), mVar, y2.m.d(1813688584, true, new er.q() { // from class: ge2.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.S(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f72140a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1813688584, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:127)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ge2.e0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.T(sVar, (ne2.a.f) obj);
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
    public static final oq.i0 T(f00.s sVar, ne2.a.f fVar) {
        if (!fr.t.c(fVar, ne2.a.f.C3344a.f135104a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final m mVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(506613656, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:138)");
        }
        f00.r.o(wVar, fr.q0.c(je2.p.class), mVar, y2.m.d(54328713, true, new er.q() { // from class: ge2.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.V(sVar, mVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f72140a.p(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(final f00.s sVar, final m mVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(54328713, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:142)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(mVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ge2.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.W(sVar, mVar, (je2.a.b) obj);
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
    public static final oq.i0 W(f00.s sVar, m mVar, je2.a.b bVar) {
        if (fr.t.c(bVar, je2.a.b.C2417a.f102188a)) {
            sVar.c();
        } else if (fr.t.c(bVar, je2.a.b.C2418b.f102189a)) {
            mVar.R6();
        } else {
            if (!fr.t.c(bVar, je2.a.b.c.f102190a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, be2.h.i.f18962b, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final m mVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1252746215, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:157)");
        }
        f00.r.o(wVar, fr.q0.c(xe2.v.class), mVar, y2.m.d(-1705031158, true, new er.q() { // from class: ge2.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.Y(sVar, mVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f72140a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(final f00.s sVar, final m mVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1705031158, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:161)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(mVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ge2.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.Z(sVar, mVar, (xe2.a.d) obj);
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
    public static final oq.i0 Z(f00.s sVar, m mVar, xe2.a.d dVar) {
        if (fr.t.c(dVar, xe2.a.d.C5827a.f218125a)) {
            sVar.c();
        } else if (fr.t.c(dVar, xe2.a.d.b.f218126a)) {
            mVar.R6();
        } else if (fr.t.c(dVar, xe2.a.d.c.f218127a)) {
            f00.s.m(sVar, be2.h.C0474h.f18961b, null, 2, null);
        } else if (dVar instanceof xe2.a.d.ToLocalizationMap) {
            f00.s.l(sVar, be2.k.f18968a, ((xe2.a.d.ToLocalizationMap) dVar).getSetupData(), null, 4, null);
        } else {
            if (!fr.t.c(dVar, xe2.a.d.e.f218130a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, be2.h.g.f18960b, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(m mVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1282861210, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:184)");
        }
        f00.r.o(wVar, fr.q0.c(te2.m.class), mVar, y2.m.d(830576267, true, new er.q() { // from class: ge2.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.b0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f72140a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(830576267, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:188)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ge2.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.c0(sVar, (te2.a.InterfaceC4941a) obj);
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
    public static final oq.i0 c0(f00.s sVar, te2.a.InterfaceC4941a interfaceC4941a) {
        if (interfaceC4941a instanceof te2.a.InterfaceC4941a.C4942a) {
            sVar.c();
        } else {
            if (!(interfaceC4941a instanceof te2.a.InterfaceC4941a.ShowImagePreview)) {
                throw new oq.p();
            }
            f00.s.l(sVar, be2.f.f18949a, ((te2.a.InterfaceC4941a.ShowImagePreview) interfaceC4941a).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final m mVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-476498661, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:203)");
        }
        f00.r.n(wVar, fr.q0.c(ve2.m.class), y2.m.d(-508664659, true, new er.q() { // from class: ge2.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.e0(mVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f72140a.q(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(final m mVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-508664659, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:206)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(mVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ge2.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.f0(mVar, (ve2.c) obj);
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
    public static final oq.i0 f0(m mVar, ve2.c cVar) {
        if (!fr.t.c(cVar, ve2.c.a.f206328a)) {
            throw new oq.p();
        }
        mVar.R6();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2059108764, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:217)");
        }
        f00.r.o(wVar, fr.q0.c(bf2.q.class), sVar.g(be2.k.f18968a), y2.m.d(1606823821, true, new er.q() { // from class: ge2.w
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.h0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f72140a.l(), rVar, ((i15 >> 3) & 14) | 27648 | (Coordinates.f208679c << 6));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1606823821, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:223)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ge2.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.i0(sVar, (bf2.a.e) obj);
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
    public static final oq.i0 i0(f00.s sVar, bf2.a.e eVar) {
        if (!(eVar instanceof bf2.a.e.C0485a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(299748893, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:236)");
        }
        be2.f fVar2 = be2.f.f18949a;
        f00.r.r(wVar, fVar2, sVar.g(fVar2), y2.m.d(-1418700829, true, new er.q() { // from class: ge2.v
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t0.k0(sVar, (dx3.c) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k0(final f00.s sVar, dx3.c cVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1418700829, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.NewIncidentSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewIncidentSharedNavContent.kt:240)");
        }
        xw.b<dx3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ge2.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.l0(sVar, (dx3.c.a) obj);
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
    public static final oq.i0 l0(f00.s sVar, dx3.c.a aVar) {
        if (!fr.t.c(aVar, dx3.c.a.C1047a.f45490a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(m mVar, int i15, p076m2.r rVar, int i16) {
        G(mVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
