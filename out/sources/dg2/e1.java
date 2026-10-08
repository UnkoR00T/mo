package dg2;

import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import xg2.SetupData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgg2/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "I", "(Lgg2/a;Ler/a;Lm2/r;I)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ler/a;Lm2/r;I)V", "landregistry_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e1 {
    public static final void I(final gg2.a aVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-990987627);
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
                p076m2.t.o(-990987627, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavContent (LandRegistryNavContent.kt:47)");
            }
            p076m2.d0.c(gg2.c.c().d(aVar), y2.m.d(1332903765, true, new er.p() { // from class: dg2.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e1.J(aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: dg2.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e1.K(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1332903765, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavContent.<anonymous> (LandRegistryNavContent.kt:51)");
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
    public static final oq.i0 K(gg2.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        I(aVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void L(final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1299355348);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1299355348, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph (LandRegistryNavContent.kt:58)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            p pVar = p.f41506a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: dg2.z
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e1.M(aVar, sVarJ, (p136y9.d1) obj);
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
            d5VarM.a(new er.p() { // from class: dg2.a0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e1.r0(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(final er.a aVar, final f00.s sVar, p136y9.d1 d1Var) {
        f00.r.u(d1Var, p.f41506a, null, y2.m.b(-985403725, true, new er.r() { // from class: dg2.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.N(aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, t.f41524a, null, y2.m.b(2005460970, true, new er.r() { // from class: dg2.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.Q(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s.f41521a, null, y2.m.b(-1282583637, true, new er.r() { // from class: dg2.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.T(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.f41494a, null, y2.m.b(-275660948, true, new er.r() { // from class: dg2.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.W(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, r.f41518a, null, y2.m.b(731261741, true, new er.r() { // from class: dg2.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.Z(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, v.f41530a, null, y2.m.b(1738184430, true, new er.r() { // from class: dg2.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.c0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.f41497a, null, y2.m.b(-1549860177, true, new er.r() { // from class: dg2.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.f0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, u.f41527a, null, y2.m.b(-542937488, true, new er.r() { // from class: dg2.j0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.i0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, o.f41503a, null, y2.m.b(463985201, true, new er.r() { // from class: dg2.k0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.l0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, n.f41500a, null, y2.m.b(1470907890, true, new er.r() { // from class: dg2.l0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e1.o0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-985403725, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:65)");
        }
        f00.r.n(wVar, fr.q0.c(hg2.j.class), y2.m.d(690081093, true, new er.q() { // from class: dg2.p0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e1.O(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f41482a.l(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(690081093, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:68)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dg2.w
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.P(aVar, sVar, (hg2.a) obj);
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
    public static final oq.i0 P(er.a aVar, f00.s sVar, hg2.a aVar2) {
        if (fr.t.c(aVar2, hg2.a.C1958a.f84541a)) {
            aVar.a();
        } else if (aVar2 instanceof hg2.a.b) {
            f00.s.m(sVar, r.f41518a, null, 2, null);
        } else if (aVar2 instanceof hg2.a.c) {
            f00.s.m(sVar, t.f41524a, null, 2, null);
        } else {
            if (!(aVar2 instanceof hg2.a.d)) {
                throw new oq.p();
            }
            f00.s.m(sVar, u.f41527a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2005460970, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:90)");
        }
        f00.r.n(wVar, fr.q0.c(dh2.u.class), y2.m.d(1533635068, true, new er.q() { // from class: dg2.r0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e1.R(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f41482a.o(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1533635068, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:93)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dg2.b1
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.S(sVar, (dh2.a.InterfaceC0930a) obj);
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
    public static final oq.i0 S(f00.s sVar, dh2.a.InterfaceC0930a interfaceC0930a) {
        if (fr.t.c(interfaceC0930a, dh2.a.InterfaceC0930a.C0931a.f42561a)) {
            f00.s.m(sVar, p.f41506a, null, 2, null);
        } else if (interfaceC0930a instanceof dh2.a.InterfaceC0930a.ToOrderDetails) {
            f00.s.l(sVar, s.f41521a, ((dh2.a.InterfaceC0930a.ToOrderDetails) interfaceC0930a).getSetupData(), null, 4, null);
        } else if (fr.t.c(interfaceC0930a, dh2.a.InterfaceC0930a.d.f42564a)) {
            f00.s.m(sVar, o.f41503a, null, 2, null);
        } else {
            if (!(interfaceC0930a instanceof dh2.a.InterfaceC0930a.GoToDownloadDocument)) {
                throw new oq.p();
            }
            f00.s.l(sVar, n.f41500a, new SetupData(((dh2.a.InterfaceC0930a.GoToDownloadDocument) interfaceC0930a).getOrderId(), null), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1282583637, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:123)");
        }
        f00.r.o(wVar, fr.q0.c(bh2.p.class), sVar.g(s.f41521a), y2.m.d(-88535844, true, new er.q() { // from class: dg2.q0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e1.U(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f41482a.r(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-88535844, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:129)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dg2.s0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.V(sVar, (bh2.a.c) obj);
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
    public static final oq.i0 V(f00.s sVar, bh2.a.c cVar) {
        if (fr.t.c(cVar, bh2.a.c.C0499a.f19508a)) {
            f00.s.m(sVar, t.f41524a, null, 2, null);
        } else if (cVar instanceof bh2.a.c.ToCheckDocumentStatus) {
            f00.s.l(sVar, l.f41494a, new eg2.SetupData(((bh2.a.c.ToCheckDocumentStatus) cVar).getVerificationCode(), false, null), null, 4, null);
        } else {
            if (!(cVar instanceof bh2.a.c.ToShowQr)) {
                throw new oq.p();
            }
            f00.s.l(sVar, v.f41530a, ((bh2.a.c.ToShowQr) cVar).getSetupData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-275660948, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:155)");
        }
        f00.r.o(wVar, fr.q0.c(eg2.v.class), sVar.g(l.f41494a), y2.m.d(918386845, true, new er.q() { // from class: dg2.w0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e1.X(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f41482a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(918386845, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:161)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dg2.c1
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.Y(sVar, (eg2.a.g) obj);
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
    public static final oq.i0 Y(f00.s sVar, eg2.a.g gVar) {
        if (fr.t.c(gVar, eg2.a.g.C1199a.f50002a)) {
            sVar.c();
        } else {
            if (!fr.t.c(gVar, eg2.a.g.b.f50003a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, p.f41506a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(731261741, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:175)");
        }
        f00.r.o(wVar, fr.q0.c(mg2.l0.class), sVar.g(r.f41518a), y2.m.d(1925309534, true, new er.q() { // from class: dg2.m0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e1.a0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f41482a.p(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1925309534, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:181)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dg2.z0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.b0(sVar, (mg2.i) obj);
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
    public static final oq.i0 b0(f00.s sVar, mg2.i iVar) {
        if (fr.t.c(iVar, mg2.i.a.f126446a)) {
            f00.s.m(sVar, p.f41506a, null, 2, null);
        } else {
            if (!(iVar instanceof mg2.i.GoToDownloadDocument)) {
                throw new oq.p();
            }
            f00.s.l(sVar, n.f41500a, new SetupData(((mg2.i.GoToDownloadDocument) iVar).getOrderId(), null), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1738184430, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:201)");
        }
        f00.r.o(wVar, fr.q0.c(hh2.u.class), sVar.g(v.f41530a), y2.m.d(-1362735073, true, new er.q() { // from class: dg2.n0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e1.d0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f41482a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1362735073, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:207)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dg2.d1
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.e0(sVar, (hh2.a.c) obj);
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
    public static final oq.i0 e0(f00.s sVar, hh2.a.c cVar) {
        if (fr.t.c(cVar, hh2.a.c.C1970a.f84702a)) {
            sVar.c();
        } else {
            if (!fr.t.c(cVar, hh2.a.c.b.f84703a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, m.f41497a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1549860177, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:221)");
        }
        f00.r.n(wVar, fr.q0.c(jg2.l.class), y2.m.d(-2021686079, true, new er.q() { // from class: dg2.u0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e1.g0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f41482a.k(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2021686079, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:224)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dg2.x0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.h0(sVar, (jg2.b) obj);
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
    public static final oq.i0 h0(f00.s sVar, jg2.b bVar) {
        if (!fr.t.c(bVar, jg2.b.a.f102587a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-542937488, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:235)");
        }
        f00.r.n(wVar, fr.q0.c(fh2.y.class), y2.m.d(-1014763390, true, new er.q() { // from class: dg2.o0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e1.j0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f41482a.t(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1014763390, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:238)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dg2.a1
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.k0(sVar, (fh2.a.c) obj);
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
    public static final oq.i0 k0(f00.s sVar, fh2.a.c cVar) {
        if (fr.t.c(cVar, fh2.a.c.C1422a.f63804a)) {
            sVar.c();
        } else {
            if (!(cVar instanceof fh2.a.c.GoToDocument)) {
                throw new oq.p();
            }
            f00.s.l(sVar, l.f41494a, new eg2.SetupData(((fh2.a.c.GoToDocument) cVar).getVerificationCode(), true, null), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(463985201, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:256)");
        }
        f00.r.n(wVar, fr.q0.c(zg2.s.class), y2.m.d(-7840701, true, new er.q() { // from class: dg2.t0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e1.m0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f41482a.s(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-7840701, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:259)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dg2.y0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.n0(sVar, (zg2.g) obj);
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
    public static final oq.i0 n0(f00.s sVar, zg2.g gVar) {
        if (!fr.t.c(gVar, zg2.g.a.f235153a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1470907890, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:270)");
        }
        f00.r.o(wVar, fr.q0.c(xg2.m.class), sVar.g(n.f41500a), y2.m.d(-1630011613, true, new er.q() { // from class: dg2.v0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e1.p0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f41482a.q(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1630011613, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.LandRegistryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LandRegistryNavContent.kt:276)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dg2.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return e1.q0(sVar, (xg2.a.InterfaceC5836a) obj);
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
    public static final oq.i0 q0(f00.s sVar, xg2.a.InterfaceC5836a interfaceC5836a) {
        if (fr.t.c(interfaceC5836a, xg2.a.InterfaceC5836a.C5837a.f218474a)) {
            f00.s.m(sVar, p.f41506a, null, 2, null);
        } else if (interfaceC5836a instanceof xg2.a.InterfaceC5836a.GoToDocument) {
            f00.s.l(sVar, s.f41521a, new bh2.SetupData(((xg2.a.InterfaceC5836a.GoToDocument) interfaceC5836a).getDocument().getDocument()), null, 4, null);
        } else {
            if (!fr.t.c(interfaceC5836a, xg2.a.InterfaceC5836a.c.f218476a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, o.f41503a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r0(er.a aVar, int i15, p076m2.r rVar, int i16) {
        L(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
