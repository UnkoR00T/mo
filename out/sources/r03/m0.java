package r03;

import f13.SafeBusPayloadData;
import fr.q0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import x03.SetupData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\n\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ls03/a;", "colorScheme", "Lkotlin/Function1;", "Lf00/s;", "Loq/i0;", "navGraphReady", "Lkotlin/Function0;", "navResult", "z", "(Ls03/a;Ler/l;Ler/a;Lm2/r;I)V", "C", "(Ler/l;Ler/a;Lm2/r;I)V", "safebus_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(er.l lVar, er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(873433560, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavContent.<anonymous> (SafeBusNavContent.kt:43)");
            }
            C(lVar, aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(s03.a aVar, er.l lVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        z(aVar, lVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void C(final er.l<? super f00.s, oq.i0> lVar, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1017711322);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1017711322, i16, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph (SafeBusNavContent.kt:52)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            k kVar = k.f170259a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: r03.l0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m0.D(sVarJ, aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, kVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            lVar.b(sVarJ);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r03.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m0.Z(lVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final oq.i0 D(final f00.s sVar, final er.a aVar, d1 d1Var) {
        f00.r.u(d1Var, k.f170259a, null, y2.m.b(1656221159, true, new er.r() { // from class: r03.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m0.E(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.f170269a, null, y2.m.b(487312976, true, new er.r() { // from class: r03.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m0.H(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.f170265a, null, y2.m.b(250695151, true, new er.r() { // from class: r03.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m0.K(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, j.f170255a, null, y2.m.b(14077326, true, new er.r() { // from class: r03.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m0.N(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.f170249a, null, y2.m.b(-222540499, true, new er.r() { // from class: r03.t
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m0.Q(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, g.f170246a, null, y2.m.b(-459158324, true, new er.r() { // from class: r03.u
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m0.T(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, i.f170252a, new f00.g0.Dialog(null, 1, 0 == true ? 1 : 0), y2.m.b(-695776149, true, new er.r() { // from class: r03.v
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m0.W(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1656221159, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph.<anonymous>.<anonymous>.<anonymous> (SafeBusNavContent.kt:60)");
        }
        mr.c cVarC = q0.c(x03.m.class);
        SetupData setupData = (SetupData) sVar.g(k.f170259a);
        if (setupData == null) {
            setupData = new SetupData(null);
        }
        f00.r.o(wVar, cVarC, setupData, y2.m.d(-753223210, true, new er.q() { // from class: r03.b0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m0.F(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f170239a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-753223210, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeBusNavContent.kt:65)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: r03.e0
                @Override // er.l
                public final Object b(Object obj) {
                    return m0.G(sVar, aVar, (x03.a.d) obj);
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
    public static final oq.i0 G(f00.s sVar, er.a aVar, x03.a.d dVar) {
        if (dVar instanceof x03.a.d.C5756d) {
            f00.s.m(sVar, l.f170265a, null, 2, null);
        } else if (dVar instanceof x03.a.d.c) {
            f00.s.m(sVar, j.f170255a, null, 2, null);
        } else if (dVar instanceof x03.a.d.Verified) {
            f00.s.l(sVar, m.f170269a, new SafeBusPayloadData(((x03.a.d.Verified) dVar).getVehicle()), null, 4, null);
        } else if (dVar instanceof x03.a.d.C5755a) {
            aVar.a();
        } else if (dVar instanceof x03.a.d.Error) {
            f00.s.l(sVar, g.f170246a, ((x03.a.d.Error) dVar).getError(), null, 4, null);
        } else {
            if (!(dVar instanceof x03.a.d.ShowNavigationDialog)) {
                throw new oq.p();
            }
            f00.s.l(sVar, i.f170252a, ((x03.a.d.ShowNavigationDialog) dVar).getDialogData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(487312976, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph.<anonymous>.<anonymous>.<anonymous> (SafeBusNavContent.kt:101)");
        }
        f00.r.o(wVar, q0.c(c13.o.class), sVar.g(m.f170269a), y2.m.d(-1353089, true, new er.q() { // from class: r03.d0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m0.I(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f170239a.f(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1353089, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeBusNavContent.kt:105)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: r03.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return m0.J(sVar, (c13.d) obj);
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
    public static final oq.i0 J(f00.s sVar, c13.d dVar) {
        if (dVar instanceof c13.d.Back) {
            sVar.getNavController().J();
            ((c13.d.Back) dVar).a().a();
        } else {
            if (!fr.t.c(dVar, c13.d.b.f22588a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, h.f170249a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(250695151, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph.<anonymous>.<anonymous>.<anonymous> (SafeBusNavContent.kt:123)");
        }
        f00.r.n(wVar, q0.c(a13.j.class), y2.m.d(1967671453, true, new er.q() { // from class: r03.x
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m0.L(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f170239a.j(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1967671453, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeBusNavContent.kt:126)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: r03.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return m0.M(sVar, (a13.a.b) obj);
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
    public static final oq.i0 M(f00.s sVar, a13.a.b bVar) {
        if (bVar instanceof a13.a.b.C0013a) {
            sVar.getNavController().J();
        } else {
            if (!(bVar instanceof a13.a.b.BackWithResult)) {
                throw new oq.p();
            }
            f00.s.l(sVar, k.f170259a, ((a13.a.b.BackWithResult) bVar).getPayload(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(14077326, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph.<anonymous>.<anonymous>.<anonymous> (SafeBusNavContent.kt:142)");
        }
        f00.r.n(wVar, q0.c(v03.l.class), y2.m.d(1731053628, true, new er.q() { // from class: r03.z
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m0.O(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f170239a.i(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1731053628, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeBusNavContent.kt:145)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: r03.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return m0.P(sVar, (v03.d) obj);
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
    public static final oq.i0 P(f00.s sVar, v03.d dVar) {
        if (!fr.t.c(dVar, v03.d.a.f202969a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-222540499, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph.<anonymous>.<anonymous>.<anonymous> (SafeBusNavContent.kt:156)");
        }
        f00.r.n(wVar, q0.c(t03.k.class), y2.m.d(1494435803, true, new er.q() { // from class: r03.w
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m0.R(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f170239a.g(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1494435803, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeBusNavContent.kt:159)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: r03.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return m0.S(sVar, (t03.b) obj);
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
    public static final oq.i0 S(f00.s sVar, t03.b bVar) {
        if (fr.t.c(bVar, t03.b.a.f186787a)) {
            sVar.c();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-459158324, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph.<anonymous>.<anonymous>.<anonymous> (SafeBusNavContent.kt:170)");
        }
        g gVar = g.f170246a;
        f00.r.r(wVar, gVar, sVar.g(gVar), y2.m.d(-808456309, true, new er.q() { // from class: r03.c0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m0.U(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-808456309, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeBusNavContent.kt:174)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: r03.n
                @Override // er.l
                public final Object b(Object obj) {
                    return m0.V(sVar, (hb4.b.a) obj);
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
    public static final oq.i0 V(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-695776149, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph.<anonymous>.<anonymous>.<anonymous> (SafeBusNavContent.kt:187)");
        }
        i iVar = i.f170252a;
        f00.r.r(wVar, iVar, sVar.g(iVar), y2.m.d(4058944, true, new er.q() { // from class: r03.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m0.X(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(4058944, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeBusNavContent.kt:191)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: r03.y
                @Override // er.l
                public final Object b(Object obj) {
                    return m0.Y(sVar, (cb4.f.a) obj);
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
    public static final oq.i0 Y(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(er.l lVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        C(lVar, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void z(final s03.a aVar, final er.l<? super f00.s, oq.i0> lVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2034291992);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2034291992, i16, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.SafeBusNavContent (SafeBusNavContent.kt:39)");
            }
            p076m2.d0.c(s03.c.c().d(aVar), y2.m.d(873433560, true, new er.p() { // from class: r03.j0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m0.A(lVar, aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: r03.k0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m0.B(aVar, lVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
