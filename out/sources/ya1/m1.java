package ya1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import fb1.i2;
import ld1.SearchModel;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p7.CreationExtras;
import tt3.AddressSearchData;
import za1.SetupData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lra1/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "Z", "(Lra1/a;Ler/a;Lm2/r;I)V", "c0", "(Ler/a;Lm2/r;I)V", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m1 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.l<va1.a, oq.i0> {
        a(Object obj) {
            super(1, obj, pa1.n.class, "setup", "setup(Lpl/gov/coi/mobywatel/feature/company/presentation/model/CardListPayload;)V", 0);
        }

        public final void E(va1.a aVar) {
            ((pa1.n) this.f66391b).P5(aVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(va1.a aVar) {
            E(aVar);
            return oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A0(f00.s sVar, jb4.b bVar) {
        f00.s.i(sVar, e.f225718a, bVar, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B0(f00.s sVar, AddressSearchData addressSearchData) {
        f00.s.i(sVar, k.f225746a, addressSearchData, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C0(f00.s sVar, SearchModel searchModel) {
        f00.s.i(sVar, j.f225742a, searchModel, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D0(f00.s sVar, uw.j jVar) {
        f00.s.i(sVar, c.f225710a, jVar, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E0(id1.q0 q0Var) {
        q0Var.s9();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F0(f00.s sVar) {
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G0(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1253902708, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:281)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ya1.d1
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.H0(sVar, (bb1.o.a) obj);
                }
            };
            rVar.v(objE);
        }
        int i16 = i15 >> 3;
        bb1.o oVar = (bb1.o) q7.d.c(fr.q0.c(bb1.o.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, ((i16 & 14) << 3) & 112, 0);
        xw.b<bb1.b> bVarY1 = oVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: ya1.e1
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.I0(sVar, aVar, (bb1.b) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        bb1.k.g(oVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bb1.o H0(f00.s sVar, bb1.o.a aVar) {
        return aVar.a(new bb1.o.a.SetupData((bb1.c) sVar.e(l.f225751a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I0(f00.s sVar, er.a aVar, bb1.b bVar) {
        if (fr.t.c(bVar, bb1.b.a.f18008a)) {
            sVar.c();
        } else {
            if (!fr.t.c(bVar, bb1.b.C0445b.f18009a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1786282571, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:307)");
        }
        androidx.p016lifecycle.y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        final pg1.m0 m0Var = (pg1.m0) q7.d.c(fr.q0.c(pg1.m0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<pg1.f> bVarY1 = m0Var.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ya1.a1
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.K0(sVar, (pg1.f) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        pg1.c.c(m0Var, y2.m.d(1714041146, true, new er.p() { // from class: ya1.b1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return m1.L0(m0Var, sVar, (p076m2.r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, 48);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K0(f00.s sVar, pg1.f fVar) {
        if (fr.t.c(fVar, pg1.f.a.f157327a)) {
            sVar.c();
        } else {
            if (!(fVar instanceof pg1.f.ShowDialog)) {
                throw new oq.p();
            }
            f00.s.i(sVar, h.f225732a, ((pg1.f.ShowDialog) fVar).getDialogData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L0(final pg1.m0 m0Var, final f00.s sVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1714041146, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:320)");
            }
            boolean zG = rVar.G(sVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ya1.j0
                    @Override // er.a
                    public final Object a() {
                        return m1.M0(sVar);
                    }
                };
                rVar.v(objE);
            }
            er.a aVar = (er.a) objE;
            boolean zG2 = rVar.G(sVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: ya1.u0
                    @Override // er.a
                    public final Object a() {
                        return m1.N0(sVar);
                    }
                };
                rVar.v(objE2);
            }
            er.a aVar2 = (er.a) objE2;
            boolean zG3 = rVar.G(sVar);
            Object objE3 = rVar.E();
            if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new er.l() { // from class: ya1.f1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m1.O0(sVar, (jb4.b) obj);
                    }
                };
                rVar.v(objE3);
            }
            er.l lVar = (er.l) objE3;
            boolean zG4 = rVar.G(sVar);
            Object objE4 = rVar.E();
            if (zG4 || objE4 == p076m2.r.INSTANCE.a()) {
                objE4 = new er.l() { // from class: ya1.h1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m1.P0(sVar, (uw.j) obj);
                    }
                };
                rVar.v(objE4);
            }
            er.l lVar2 = (er.l) objE4;
            boolean zG5 = rVar.G(sVar);
            Object objE5 = rVar.E();
            if (zG5 || objE5 == p076m2.r.INSTANCE.a()) {
                objE5 = new er.l() { // from class: ya1.i1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m1.Q0(sVar, (AddressSearchData) obj);
                    }
                };
                rVar.v(objE5);
            }
            er.l lVar3 = (er.l) objE5;
            boolean zG6 = rVar.G(sVar);
            Object objE6 = rVar.E();
            if (zG6 || objE6 == p076m2.r.INSTANCE.a()) {
                objE6 = new er.l() { // from class: ya1.j1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m1.R0(sVar, (SearchModel) obj);
                    }
                };
                rVar.v(objE6);
            }
            er.l lVar4 = (er.l) objE6;
            boolean zG7 = rVar.G(m0Var);
            Object objE7 = rVar.E();
            if (zG7 || objE7 == p076m2.r.INSTANCE.a()) {
                objE7 = new er.a() { // from class: ya1.k1
                    @Override // er.a
                    public final Object a() {
                        return m1.S0(m0Var);
                    }
                };
                rVar.v(objE7);
            }
            nf1.e1.d0(m0Var, aVar, aVar2, lVar, lVar2, lVar3, lVar4, (er.a) objE7, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M0(f00.s sVar) {
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N0(f00.s sVar) {
        d dVar = d.f225714a;
        f00.s.i(sVar, dVar, null, dVar, 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O0(f00.s sVar, jb4.b bVar) {
        f00.s.i(sVar, e.f225718a, bVar, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P0(f00.s sVar, uw.j jVar) {
        f00.s.i(sVar, c.f225710a, jVar, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q0(f00.s sVar, AddressSearchData addressSearchData) {
        f00.s.i(sVar, k.f225746a, addressSearchData, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R0(f00.s sVar, SearchModel searchModel) {
        f00.s.i(sVar, j.f225742a, searchModel, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S0(pg1.m0 m0Var) {
        m0Var.s9();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-531500554, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:361)");
        }
        f00.r.o(wVar, fr.q0.c(za1.a0.class), sVar.g(i.f225737a), y2.m.d(1499720615, true, new er.q() { // from class: ya1.q0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m1.U0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), p1.f225764a.d(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1499720615, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:365)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ya1.l1
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.V0(sVar, (za1.a.f) obj);
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
    public static final oq.i0 V0(f00.s sVar, za1.a.f fVar) {
        if (!fr.t.c(fVar, za1.a.f.C6298a.f233800a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(723281463, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:378)");
        }
        e eVar = e.f225718a;
        f00.r.D(wVar, eVar, sVar.e(eVar), y2.m.d(596606358, true, new er.q() { // from class: ya1.o0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m1.X0(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X0(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(596606358, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:382)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ya1.u
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.Y0(sVar, (hb4.b.a) obj);
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
    public static final oq.i0 Y0(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    public static final void Z(final ra1.a aVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1808398729);
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
                p076m2.t.o(1808398729, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavContent (CompanyNavContent.kt:59)");
            }
            p076m2.d0.c(ra1.c.c().d(aVar), y2.m.d(181525705, true, new er.p() { // from class: ya1.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m1.a0(aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: ya1.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m1.b0(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z0(er.a aVar, int i15, p076m2.r rVar, int i16) {
        c0(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(181525705, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavContent.<anonymous> (CompanyNavContent.kt:63)");
            }
            c0(aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(ra1.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        Z(aVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void c0(final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-136153063);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-136153063, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph (CompanyNavContent.kt:70)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            d dVar = d.f225714a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ya1.z
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m1.d0(sVarJ, aVar, (p136y9.d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, dVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ya1.a0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m1.Z0(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final oq.i0 d0(final f00.s sVar, final er.a aVar, p136y9.d1 d1Var) {
        f00.r.u(d1Var, d.f225714a, null, y2.m.b(1151375224, true, new er.r() { // from class: ya1.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m1.e0(aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b.f225704a, null, y2.m.b(-725040081, true, new er.r() { // from class: ya1.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m1.g0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.f225755a, null, y2.m.b(529741936, true, new er.r() { // from class: ya1.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m1.o0(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.f225746a, null, y2.m.b(1784523953, true, new er.r() { // from class: ya1.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m1.r0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, j.f225742a, null, y2.m.b(-1255661326, true, new er.r() { // from class: ya1.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m1.u0(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, ya1.a.f225699a, null, y2.m.b(-879309, true, new er.r() { // from class: ya1.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m1.x0(aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.f225751a, null, y2.m.b(1253902708, true, new er.r() { // from class: ya1.k0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m1.G0(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, f.f225723a, null, y2.m.b(-1786282571, true, new er.r() { // from class: ya1.l0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m1.J0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i.f225737a, null, y2.m.b(-531500554, true, new er.r() { // from class: ya1.m0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m1.T0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e.f225718a, null, y2.m.b(723281463, true, new er.r() { // from class: ya1.n0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m1.W0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, h.f225732a, new f00.g0.Dialog(null, 1, 0 == true ? 1 : 0), y2.m.b(-551573201, true, new er.r() { // from class: ya1.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m1.i0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, g.f225728a, null, y2.m.b(703208816, true, new er.r() { // from class: ya1.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m1.l0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        uw.m.c(d1Var, c.f225710a, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1151375224, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:77)");
        }
        androidx.p016lifecycle.y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        sa1.c0 c0Var = (sa1.c0) q7.d.c(fr.q0.c(sa1.c0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<sa1.a.k> bVarY1 = c0Var.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ya1.z0
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.f0(aVar, sVar, (sa1.a.k) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        sa1.p.m(c0Var, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(er.a aVar, f00.s sVar, sa1.a.k kVar) {
        if (fr.t.c(kVar, sa1.a.k.C4619a.f179585a)) {
            aVar.a();
        } else if (kVar instanceof sa1.a.k.Error) {
            f00.s.i(sVar, e.f225718a, ((sa1.a.k.Error) kVar).getError(), null, 4, null);
        } else if (kVar instanceof sa1.a.k.GoToAdditionalAddresses) {
            f00.s.i(sVar, b.f225704a, new va1.a.Address(((sa1.a.k.GoToAdditionalAddresses) kVar).a()), null, 4, null);
        } else if (kVar instanceof sa1.a.k.GoToPKDs) {
            sa1.a.k.GoToPKDs eVar = (sa1.a.k.GoToPKDs) kVar;
            f00.s.i(sVar, b.f225704a, new va1.a.Pkd(eVar.a(), eVar.getYear()), null, 4, null);
        } else if (kVar instanceof sa1.a.k.GoToWelcomePage) {
            sVar.h(m.f225755a, ((sa1.a.k.GoToWelcomePage) kVar).getCompanyInfoStatus(), d.f225714a);
        } else if (fr.t.c(kVar, sa1.a.k.g.f179593a)) {
            sVar.h(l.f225751a, bb1.c.a.f18010a, d.f225714a);
        } else if (fr.t.c(kVar, sa1.a.k.C4620k.f179597a)) {
            f00.s.i(sVar, ya1.a.f225699a, null, null, 6, null);
        } else if (fr.t.c(kVar, sa1.a.k.l.f179598a)) {
            f00.s.i(sVar, f.f225723a, ma1.l.SUSPEND_COMPANY, null, 4, null);
        } else if (fr.t.c(kVar, sa1.a.k.i.f179595a)) {
            f00.s.i(sVar, f.f225723a, ma1.l.RESUME_COMPANY, null, 4, null);
        } else if (kVar instanceof sa1.a.k.GoToRepresentatives) {
            sa1.a.k.GoToRepresentatives fVar = (sa1.a.k.GoToRepresentatives) kVar;
            f00.s.l(sVar, i.f225737a, new SetupData(fVar.getEntryId(), fVar.getOwnerAdult()), null, 4, null);
        } else if (kVar instanceof sa1.a.k.ShowDialog) {
            f00.s.l(sVar, h.f225732a, ((sa1.a.k.ShowDialog) kVar).getDialogData(), null, 4, null);
        } else {
            if (!(kVar instanceof sa1.a.k.GoToMoreShortcuts)) {
                throw new oq.p();
            }
            f00.s.l(sVar, g.f225728a, new wa1.SetupData(((sa1.a.k.GoToMoreShortcuts) kVar).a()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-725040081, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:154)");
        }
        androidx.p016lifecycle.y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        pa1.n nVar = (pa1.n) q7.d.c(fr.q0.c(pa1.n.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        b bVar = b.f225704a;
        boolean zG = rVar.G(nVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new a(nVar);
            rVar.v(objE);
        }
        sVar.f(bVar, (er.l) ((mr.g) objE));
        xw.b<pa1.b> bVarY1 = nVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: ya1.y0
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.h0(sVar, (pa1.b) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        pa1.j.j(nVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(f00.s sVar, pa1.b bVar) {
        if (!fr.t.c(bVar, pa1.b.a.f153798a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-551573201, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:394)");
        }
        h hVar = h.f225732a;
        f00.r.r(wVar, hVar, sVar.g(hVar), y2.m.d(1975052996, true, new er.q() { // from class: ya1.c1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m1.j0(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            p076m2.t.o(1975052996, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:398)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ya1.y
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.k0(sVar, (cb4.f.a) obj);
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
    public static final oq.i0 l0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(703208816, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:408)");
        }
        f00.r.o(wVar, fr.q0.c(wa1.l.class), sVar.g(g.f225728a), y2.m.d(-753444385, true, new er.q() { // from class: ya1.g1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m1.m0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), p1.f225764a.c(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-753444385, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:412)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ya1.v
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.n0(sVar, (wa1.b) obj);
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
    public static final oq.i0 n0(f00.s sVar, wa1.b bVar) {
        if (!fr.t.c(bVar, wa1.b.a.f211555a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o0(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(529741936, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:168)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ya1.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.p0(sVar, (db1.u.a) obj);
                }
            };
            rVar.v(objE);
        }
        int i16 = i15 >> 3;
        db1.u uVar = (db1.u) q7.d.c(fr.q0.c(db1.u.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, ((i16 & 14) << 3) & 112, 0);
        xw.b<db1.d> bVarY1 = uVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: ya1.s0
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.q0(aVar, sVar, (db1.d) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        db1.p.p(uVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final db1.u p0(f00.s sVar, db1.u.a aVar) {
        return aVar.a(new db1.u.a.SetupData((ma1.j) sVar.e(m.f225755a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q0(er.a aVar, f00.s sVar, db1.d dVar) {
        if (fr.t.c(dVar, db1.d.a.f40645a)) {
            aVar.a();
        } else if (fr.t.c(dVar, db1.d.c.f40647a)) {
            f00.s.i(sVar, ya1.a.f225699a, null, null, 6, null);
        } else {
            if (!fr.t.c(dVar, db1.d.b.f40646a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, l.f225751a, bb1.c.b.f18011a, null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1784523953, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:199)");
        }
        k kVar = k.f225746a;
        f00.r.D(wVar, kVar, sVar.e(kVar), y2.m.d(1008249052, true, new er.q() { // from class: ya1.p0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m1.s0(sVar, (tt3.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s0(final f00.s sVar, tt3.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1008249052, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:203)");
        }
        xw.b<tt3.d.a> bVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ya1.n
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.t0(sVar, (tt3.d.a) obj);
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
    public static final oq.i0 t0(f00.s sVar, tt3.d.a aVar) {
        if (!fr.t.c(aVar, tt3.d.a.C5021a.f192310a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u0(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1255661326, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:212)");
        }
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ya1.w0
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.v0(sVar, aVar, (bd1.u.b) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        bd1.u uVar = (bd1.u) q7.d.c(fr.q0.c(bd1.u.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<bd1.e> bVarY1 = uVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: ya1.x0
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.w0(sVar, (bd1.e) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        bd1.n.k(uVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bd1.u v0(f00.s sVar, er.a aVar, bd1.u.b bVar) {
        SearchModel searchModel = (SearchModel) sVar.e(j.f225742a);
        if (searchModel == null) {
            SearchModel searchModel2 = new SearchModel(null, null, null, 7, null);
            aVar.a();
            searchModel = searchModel2;
        }
        return bVar.a(searchModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w0(f00.s sVar, bd1.e eVar) {
        if (!fr.t.c(eVar, bd1.e.a.f18318a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x0(final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-879309, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:230)");
        }
        androidx.p016lifecycle.y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        final id1.q0 q0Var = (id1.q0) q7.d.c(fr.q0.c(id1.q0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        g00.a<id1.b> aVarP9 = q0Var.p9();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ya1.t0
                @Override // er.l
                public final Object b(Object obj) {
                    return m1.y0(aVar, sVar, (id1.b) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(aVarP9, (er.l) objE, rVar, g00.a.f69171c);
        id1.l0.c(q0Var, y2.m.d(-2096777391, true, new er.p() { // from class: ya1.v0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return m1.z0(q0Var, sVar, aVar, (p076m2.r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, 48);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y0(er.a aVar, f00.s sVar, id1.b bVar) {
        if (fr.t.c(bVar, id1.b.C2169b.f91042a)) {
            aVar.a();
        } else if (fr.t.c(bVar, id1.b.a.f91041a)) {
            sVar.c();
        } else {
            if (!(bVar instanceof id1.b.ShowDialog)) {
                throw new oq.p();
            }
            f00.s.i(sVar, h.f225732a, ((id1.b.ShowDialog) bVar).getDialogData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z0(final id1.q0 q0Var, final f00.s sVar, er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2096777391, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.CompanyNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanyNavContent.kt:244)");
            }
            boolean zG = rVar.G(sVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ya1.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m1.A0(sVar, (jb4.b) obj);
                    }
                };
                rVar.v(objE);
            }
            er.l lVar = (er.l) objE;
            boolean zG2 = rVar.G(sVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: ya1.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m1.B0(sVar, (AddressSearchData) obj);
                    }
                };
                rVar.v(objE2);
            }
            er.l lVar2 = (er.l) objE2;
            boolean zG3 = rVar.G(sVar);
            Object objE3 = rVar.E();
            if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new er.l() { // from class: ya1.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m1.C0(sVar, (SearchModel) obj);
                    }
                };
                rVar.v(objE3);
            }
            er.l lVar3 = (er.l) objE3;
            boolean zG4 = rVar.G(sVar);
            Object objE4 = rVar.E();
            if (zG4 || objE4 == p076m2.r.INSTANCE.a()) {
                objE4 = new er.l() { // from class: ya1.r
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m1.D0(sVar, (uw.j) obj);
                    }
                };
                rVar.v(objE4);
            }
            er.l lVar4 = (er.l) objE4;
            boolean zG5 = rVar.G(q0Var);
            Object objE5 = rVar.E();
            if (zG5 || objE5 == p076m2.r.INSTANCE.a()) {
                objE5 = new er.a() { // from class: ya1.s
                    @Override // er.a
                    public final Object a() {
                        return m1.E0(q0Var);
                    }
                };
                rVar.v(objE5);
            }
            er.a aVar2 = (er.a) objE5;
            boolean zG6 = rVar.G(sVar);
            Object objE6 = rVar.E();
            if (zG6 || objE6 == p076m2.r.INSTANCE.a()) {
                objE6 = new er.a() { // from class: ya1.t
                    @Override // er.a
                    public final Object a() {
                        return m1.F0(sVar);
                    }
                };
                rVar.v(objE6);
            }
            i2.F0(q0Var, lVar, lVar2, lVar3, lVar4, aVar2, (er.a) objE6, aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }
}
