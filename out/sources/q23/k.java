package q23;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import n30.CardListData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lq23/f;", "viewModel", "Loq/i0;", "h", "(Lq23/f;Lm2/r;I)V", "Lq23/f$a$c;", "data", "e", "(Lq23/f$a$c;Lm2/r;I)V", "Lq23/f$a;", "state", "sanitary_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void e(final f.a.Screen screen, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1219133957);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(screen) : rVarH.G(screen) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1219133957, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.detailsIntervention.DetailsInterventionContent (DetailsInterventionScreen.kt:44)");
            }
            rVar2 = rVarH;
            i50.s.r(screen.getBaseScaffoldData(), b.f163878a.b(), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(676890920, true, new er.q() { // from class: q23.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.f(screen, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: q23.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.g(screen, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(f.a.Screen screen, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        k70.a aVar;
        int i17;
        f3.m.Companion companion;
        int i18;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(676890920, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.detailsIntervention.DetailsInterventionContent.<anonymous> (DetailsInterventionScreen.kt:55)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion2, d3Var), 0.0f, 1, null), null, rVar, 0, 1);
            k70.a aVar2 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            f3.m mVarN = t70.s.n(w0.i.d(mVarS, aVar2.a(rVar, i19).getBase().a(), null, 2, null), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            j70.h.g(null, null, screen.getNumber(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i19).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            p076m2.r rVar2 = rVar;
            CardListData details = screen.getDetails();
            if (details == null) {
                rVar2.X(-743408820);
                rVar2.R();
                companion = companion2;
                aVar = aVar2;
                i17 = i19;
                i18 = 0;
            } else {
                rVar2.X(-743408819);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i19).getSpacing300()), rVar2, 0);
                j70.h.g(null, null, screen.getDetailsTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i19).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar2;
                i17 = i19;
                companion = companion2;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(details, null, null, rVar2, 0, 6);
                i0 i0Var2 = i0.f148189a;
                rVar2.R();
            }
            CardListData productData = screen.getProductData();
            if (productData == null) {
                rVar2.X(-743074392);
            } else {
                rVar2.X(-743074391);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, screen.getProductDataTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(productData, null, null, rVar2, 0, 6);
                i0 i0Var3 = i0.f148189a;
            }
            rVar2.R();
            CardListData placeOfPurchaseData = screen.getPlaceOfPurchaseData();
            if (placeOfPurchaseData == null) {
                rVar2.X(-742727936);
            } else {
                rVar2.X(-742727935);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, screen.getPlaceOfPurchaseDataTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(placeOfPurchaseData, null, null, rVar2, 0, 6);
                i0 i0Var4 = i0.f148189a;
            }
            rVar2.R();
            CardListData sellerData = screen.getSellerData();
            if (sellerData == null) {
                rVar2.X(-742382999);
            } else {
                rVar2.X(-742382998);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, screen.getSellerDataTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(sellerData, null, null, rVar2, 0, 6);
                i0 i0Var5 = i0.f148189a;
            }
            rVar2.R();
            CardListData supplierData = screen.getSupplierData();
            if (supplierData == null) {
                rVar2.X(-742044665);
            } else {
                rVar2.X(-742044664);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, screen.getSupplierDataTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(supplierData, null, null, rVar2, 0, 6);
                i0 i0Var6 = i0.f148189a;
            }
            rVar2.R();
            CardListData place = screen.getPlace();
            if (place == null) {
                rVar2.X(-741711570);
            } else {
                rVar2.X(-741711569);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, screen.getPlaceTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(place, null, null, rVar2, 0, 6);
                i0 i0Var7 = i0.f148189a;
            }
            rVar2.R();
            CardListData otherReport = screen.getOtherReport();
            if (otherReport == null) {
                rVar2.X(-741379064);
            } else {
                rVar2.X(-741379063);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, screen.getOtherReportTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(otherReport, null, null, rVar2, 0, 6);
                i0 i0Var8 = i0.f148189a;
            }
            rVar2.R();
            CardListData personal = screen.getPersonal();
            if (personal == null) {
                rVar2.X(-741043861);
                rVar2.R();
            } else {
                rVar2.X(-741043860);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, screen.getPersonalTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
                m30.i.d(personal, null, null, rVar, 0, 6);
                i0 i0Var9 = i0.f148189a;
                rVar.R();
            }
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(f.a.Screen screen, int i15, p076m2.r rVar, int i16) {
        e(screen, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-143818104);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-143818104, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.detailsIntervention.DetailsInterventionScreen (DetailsInterventionScreen.kt:29)");
            }
            final f6 f6VarC = m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7);
            f.a aVarI = i(f6VarC);
            if (aVarI instanceof f.a.Error) {
                rVarH.X(-770236752);
                ((f.a.Error) aVarI).getErrorVMSAdapter().b(rVarH, 0);
                rVarH.R();
            } else if (aVarI instanceof f.a.Screen) {
                rVarH.X(-770234769);
                e((f.a.Screen) aVarI, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarI instanceof f.a.Loading)) {
                    rVarH.X(-770239623);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-770231815);
                c60.b.b(rVarH, 0);
                rVarH.R();
            }
            boolean zW = rVarH.W(f6VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: q23.g
                    @Override // er.a
                    public final Object a() {
                        return k.j(f6VarC);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: q23.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.k(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.a i(f6<? extends f.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f6 f6Var) {
        i(f6Var).a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(f fVar, int i15, p076m2.r rVar, int i16) {
        h(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
