package h41;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lh41/e;", "viewModel", "Loq/i0;", "o", "(Lh41/e;Lm2/r;I)V", "Lh41/e$a$b;", "data", "h", "(Lh41/e$a$b;Lm2/r;I)V", "Lh41/e$a;", "state", "childbirthregistration_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    private static final void h(final e.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1366336742);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1366336742, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.birthplaceoffice.BirthPlaceOfficeInitialized (BirthPlaceOfficeScreen.kt:49)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), y2.m.d(-101498405, true, new er.p() { // from class: h41.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.i(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1135337939, true, new er.q() { // from class: h41.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.j(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h41.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.n(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(e.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-101498405, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.birthplaceoffice.BirthPlaceOfficeInitialized.<anonymous> (BirthPlaceOfficeScreen.kt:53)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h30.q.p(initialized.getNextButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(final e.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1135337939, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.birthplaceoffice.BirthPlaceOfficeInitialized.<anonymous> (BirthPlaceOfficeScreen.kt:60)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: h41.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.k((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(companion, false, (er.l) objE, 1, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarN);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label municipalOfficeTitle = initialized.getMunicipalOfficeTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, municipalOfficeTitle, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            d60.m.c(BirthPlaceOfficeFields.b.MUNICIPAL_OFFICE, y2.m.d(1731631579, true, new er.p() { // from class: h41.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.l(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 54);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, initialized.getCivilRegistryOfficeTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            d60.m.c(BirthPlaceOfficeFields.b.CIVIL_REGISTRY_OFFICE, y2.m.d(-326583982, true, new er.p() { // from class: h41.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.m(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 54);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            c30.e.c(null, initialized.getAlertData(), rVar, c30.b.f22944i << 3, 1);
            rVar.x();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(e.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1731631579, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.birthplaceoffice.BirthPlaceOfficeInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BirthPlaceOfficeScreen.kt:79)");
            }
            n50.h0.v(initialized.getMunicipalOfficeCard(), null, rVar, 0, 2);
            Label municipalOfficeError = initialized.getMunicipalOfficeError();
            if (municipalOfficeError == null) {
                rVar.X(184309453);
                rVar.R();
            } else {
                rVar.X(184309454);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing50()), rVar, 0);
                l40.d.d(null, municipalOfficeError, false, rVar, 0, 5);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(e.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-326583982, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.birthplaceoffice.BirthPlaceOfficeInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BirthPlaceOfficeScreen.kt:99)");
            }
            n50.h0.v(initialized.getCivilRegistryOfficeCard(), null, rVar, 0, 2);
            Label civilRegistryOfficeError = initialized.getCivilRegistryOfficeError();
            if (civilRegistryOfficeError == null) {
                rVar.X(-1162342666);
                rVar.R();
            } else {
                rVar.X(-1162342665);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing50()), rVar, 0);
                l40.d.d(null, civilRegistryOfficeError, false, rVar, 0, 5);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(e.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        h(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1868893742);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1868893742, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.birthplaceoffice.BirthPlaceOfficeScreen (BirthPlaceOfficeScreen.kt:34)");
            }
            f6 f6VarC = m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7);
            e.a aVarP = p(f6VarC);
            if (aVarP instanceof e.a.Loading) {
                rVarH.X(-710549501);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarP instanceof e.a.Error) {
                rVarH.X(-710546950);
                ((e.a.Error) aVarP).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarP instanceof e.a.Initialized)) {
                    rVarH.X(-710551687);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-710544902);
                h((e.a.Initialized) aVarP, rVarH, 0);
                rVarH.R();
            }
            p088nul.q0.g(false, p(f6VarC).a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h41.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.q(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a p(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(e eVar, int i15, p076m2.r rVar, int i16) {
        o(eVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
