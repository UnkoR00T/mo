package g31;

import a31.SetupData;
import f00.f0;
import f00.g0;
import fr.q0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\n\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ly21/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "Lkotlin/Function1;", "Lgx/b;", "navigateToGlobalDestination", "t", "(Ly21/a;Ler/a;Ler/l;Lm2/r;I)V", "w", "(Ler/a;Ler/l;Lm2/r;I)V", "checkvehicleinsurance_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(er.a aVar, f00.s sVar, h31.c.a aVar2) {
        if (fr.t.c(aVar2, h31.c.a.C1829a.f80366a)) {
            aVar.a();
        } else if (aVar2 instanceof h31.c.a.Next) {
            f00.s.l(sVar, z.c.f70283c, ((h31.c.a.Next) aVar2).getInsuranceData(), null, 4, null);
        } else {
            if (!(aVar2 instanceof h31.c.a.DatePicker)) {
                throw new oq.p();
            }
            f00.s.l(sVar, z.a.f70281c, ((h31.c.a.DatePicker) aVar2).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(517805594, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (CheckVehicleInsuranceNavContent.kt:86)");
        }
        f00.r.o(wVar, q0.c(z21.t.class), sVar.g(z.c.f70283c), y2.m.d(-190523767, true, new er.q() { // from class: g31.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t.C(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f70274a.g(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-190523767, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckVehicleInsuranceNavContent.kt:90)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: g31.m
                @Override // er.l
                public final Object b(Object obj) {
                    return t.D(sVar, (z21.e.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(f00.s sVar, z21.e.a aVar) {
        if (fr.t.c(aVar, z21.e.a.C6234a.f232361a)) {
            sVar.c();
        } else if (aVar instanceof z21.e.a.MoreInfo) {
            f00.s.l(sVar, z.d.f70284c, ((z21.e.a.MoreInfo) aVar).getInfoPageType(), null, 4, null);
        } else {
            if (!(aVar instanceof z21.e.a.DownloadInsuranceConfirmation)) {
                throw new oq.p();
            }
            f00.s.l(sVar, z.b.f70282c, new SetupData(((z21.e.a.DownloadInsuranceConfirmation) aVar).getQueryUuid()), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1086198279, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (CheckVehicleInsuranceNavContent.kt:112)");
        }
        f00.r.o(wVar, q0.c(a31.q.class), sVar.g(z.b.f70282c), y2.m.d(-1794527640, true, new er.q() { // from class: g31.f
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t.F(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f70274a.e(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1794527640, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckVehicleInsuranceNavContent.kt:116)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: g31.a
                @Override // er.l
                public final Object b(Object obj) {
                    return t.G(sVar, (a31.c.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(f00.s sVar, a31.c.a aVar) {
        if (!fr.t.c(aVar, a31.c.a.C0029a.f2278a) && !fr.t.c(aVar, a31.c.a.b.f2279a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1604765144, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (CheckVehicleInsuranceNavContent.kt:131)");
        }
        f00.r.o(wVar, q0.c(d31.r.class), sVar.g(z.d.f70284c), y2.m.d(896435783, true, new er.q() { // from class: g31.g
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t.I(sVar, lVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f70274a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(final f00.s sVar, final er.l lVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(896435783, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckVehicleInsuranceNavContent.kt:135)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: g31.l
                @Override // er.l
                public final Object b(Object obj) {
                    return t.J(sVar, lVar, (d31.c.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(f00.s sVar, er.l lVar, d31.c.a aVar) {
        if (fr.t.c(aVar, d31.c.a.C0852a.f39544a)) {
            sVar.c();
        } else if (fr.t.c(aVar, d31.c.a.b.f39545a)) {
            lVar.b(nd3.a.f134345a);
        } else if (aVar instanceof d31.c.a.TemporaryInterruptionDialog) {
            f00.s.l(sVar, z.e.f70285c, ((d31.c.a.TemporaryInterruptionDialog) aVar).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(761271, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (CheckVehicleInsuranceNavContent.kt:159)");
        }
        z.e eVar = z.e.f70285c;
        f00.r.r(wVar, eVar, sVar.g(eVar), y2.m.d(-135181492, true, new er.q() { // from class: g31.h
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t.L(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-135181492, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckVehicleInsuranceNavContent.kt:164)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: g31.k
                @Override // er.l
                public final Object b(Object obj) {
                    return t.M(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(er.a aVar, er.l lVar, int i15, p076m2.r rVar, int i16) {
        w(aVar, lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void t(final y21.a aVar, final er.a<i0> aVar2, final er.l<? super gx.b, i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1126142332);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(lVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1126142332, i16, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.navigation.CheckVehicleInsuranceNavContent (CheckVehicleInsuranceNavContent.kt:35)");
            }
            d0.c(y21.c.c().d(aVar), y2.m.d(2135065028, true, new er.p() { // from class: g31.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.u(aVar2, lVar, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: g31.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.v(aVar, aVar2, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(er.a aVar, er.l lVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2135065028, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.navigation.CheckVehicleInsuranceNavContent.<anonymous> (CheckVehicleInsuranceNavContent.kt:40)");
            }
            w(aVar, lVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(y21.a aVar, er.a aVar2, er.l lVar, int i15, p076m2.r rVar, int i16) {
        t(aVar, aVar2, lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void w(final er.a<i0> aVar, final er.l<? super gx.b, i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1743845520);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1743845520, i16, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.navigation.NavContent (CheckVehicleInsuranceNavContent.kt:51)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            z.f fVar = z.f.f70286c;
            boolean zG = ((i16 & 14) == 4) | rVarH.G(sVarJ) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: g31.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.x(sVarJ, aVar, lVar, (d1) obj);
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
            d5VarM.a(new er.p() { // from class: g31.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.N(aVar, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 x(final f00.s sVar, final er.a aVar, final er.l lVar, d1 d1Var) {
        f00.r.u(d1Var, z.f.f70286c, null, y2.m.b(-493187087, true, new er.r() { // from class: g31.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t.y(aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.c.f70283c, null, y2.m.b(517805594, true, new er.r() { // from class: g31.b
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t.B(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.b.f70282c, null, y2.m.b(-1086198279, true, new er.r() { // from class: g31.c
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t.E(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.d.f70284c, null, y2.m.b(1604765144, true, new er.r() { // from class: g31.d
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t.H(sVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        uw.m.c(d1Var, z.a.f70281c, sVar);
        f00.r.t(d1Var, z.e.f70285c, new g0.Dialog(null, 1, 0 == true ? 1 : 0), y2.m.b(761271, true, new er.r() { // from class: g31.e
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t.K(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-493187087, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (CheckVehicleInsuranceNavContent.kt:61)");
        }
        f00.r.n(wVar, q0.c(h31.r.class), y2.m.d(-1490333025, true, new er.q() { // from class: g31.i
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t.z(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f70274a.f(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1490333025, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckVehicleInsuranceNavContent.kt:64)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: g31.n
                @Override // er.l
                public final Object b(Object obj) {
                    return t.A(aVar, sVar, (h31.c.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }
}
