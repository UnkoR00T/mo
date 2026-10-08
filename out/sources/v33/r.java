package v33;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import n30.CardListData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import w30.CheckBoxSingleData;
import x33.SummaryContentData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lv33/i;", "viewModel", "Loq/i0;", "o", "(Lv33/i;Lm2/r;I)V", "Lv33/i$a$c;", "data", "k", "(Lv33/i$a$c;Lm2/r;I)V", "Lv33/i$a$b;", "h", "(Lv33/i$a$b;Lm2/r;I)V", "Lv33/i$a;", "state", "sanitary_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r {
    public static final void h(final i.a.Success success, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1287425242);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(success) : rVarH.G(success) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1287425242, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.summary.SuccessContent (SummaryScreen.kt:184)");
            }
            rVar2 = rVarH;
            i50.s.r(success.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-722366195, true, new er.q() { // from class: v33.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return r.i(success, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: v33.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.j(success, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(i.a.Success success, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-722366195, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.summary.SuccessContent.<anonymous> (SummaryScreen.kt:188)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            IconPageData<SummaryContentData, IconPageBottomContentData> iconPageDataC = success.c();
            e eVar = e.f203507a;
            q40.i.b(iconPageDataC, eVar.f(), eVar.e(), rVar, IconPageData.f164667h | d40.b.f39676g | IconPageBottomContentData.f164663d | 432, 0);
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
    public static final oq.i0 j(i.a.Success success, int i15, p076m2.r rVar, int i16) {
        h(success, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void k(final i.a.Summary summary, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-402980230);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(summary) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-402980230, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.summary.SummaryContent (SummaryScreen.kt:53)");
            }
            cb4.i dialogVMSAdapter = summary.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(-750351073);
            } else {
                rVarH.X(-716941534);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            rVar2 = rVarH;
            i50.s.r(summary.getBaseScaffoldData(), y2.m.d(-642337883, true, new er.p() { // from class: v33.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.l(summary, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1882195629, true, new er.q() { // from class: v33.p
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return r.m(summary, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: v33.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.n(summary, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(i.a.Summary summary, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-642337883, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.summary.SummaryContent.<anonymous> (SummaryScreen.kt:59)");
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
            h30.q.p(summary.getNextButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 m(i.a.Summary summary, d3 d3Var, p076m2.r rVar, int i15) {
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
                p076m2.t.o(1882195629, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.summary.SummaryContent.<anonymous> (SummaryScreen.kt:66)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion2, d3Var), 0.0f, 1, null), null, rVar, 0, 1);
            k70.a aVar2 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            f3.m mVarN = t70.s.n(w0.i.d(mVarS, aVar2.a(rVar, i19).getBase().a(), null, 2, null), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            c30.e.c(null, summary.getAlertData(), rVar, c30.b.f22944i << 3, 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i19).getSpacing200()), rVar, 0);
            j70.h.g(null, null, summary.getSubtitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i19).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            p076m2.r rVar2 = rVar;
            CardListData details = summary.getDetails();
            if (details == null) {
                rVar2.X(456913875);
                rVar2.R();
                companion = companion2;
                aVar = aVar2;
                i17 = i19;
                i18 = 0;
            } else {
                rVar2.X(456913876);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i19).getSpacing300()), rVar2, 0);
                j70.h.g(null, null, summary.getDetailsTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i19).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar2;
                i17 = i19;
                companion = companion2;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(details, null, null, rVar2, 0, 6);
                oq.i0 i0Var2 = oq.i0.f148189a;
                rVar2.R();
            }
            CardListData productData = summary.getProductData();
            if (productData == null) {
                rVar2.X(457248303);
            } else {
                rVar2.X(457248304);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, summary.getProductDataTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(productData, null, null, rVar2, 0, 6);
                oq.i0 i0Var3 = oq.i0.f148189a;
            }
            rVar2.R();
            CardListData placeOfPurchaseData = summary.getPlaceOfPurchaseData();
            if (placeOfPurchaseData == null) {
                rVar2.X(457594759);
            } else {
                rVar2.X(457594760);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, summary.getPlaceOfPurchaseDataTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(placeOfPurchaseData, null, null, rVar2, 0, 6);
                oq.i0 i0Var4 = oq.i0.f148189a;
            }
            rVar2.R();
            CardListData sellerOnlineData = summary.getSellerOnlineData();
            if (sellerOnlineData == null) {
                rVar2.X(457945834);
            } else {
                rVar2.X(457945835);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, summary.getSellerOnlineDataTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(sellerOnlineData, null, null, rVar2, 0, 6);
                oq.i0 i0Var5 = oq.i0.f148189a;
            }
            rVar2.R();
            CardListData sellerOfflineData = summary.getSellerOfflineData();
            if (sellerOfflineData == null) {
                rVar2.X(458295049);
            } else {
                rVar2.X(458295050);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, summary.getSellerOfflineDataTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(sellerOfflineData, null, null, rVar2, 0, 6);
                oq.i0 i0Var6 = oq.i0.f148189a;
            }
            rVar2.R();
            CardListData supplierData = summary.getSupplierData();
            if (supplierData == null) {
                rVar2.X(458640110);
            } else {
                rVar2.X(458640111);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, summary.getSupplierDataTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(supplierData, null, null, rVar2, 0, 6);
                oq.i0 i0Var7 = oq.i0.f148189a;
            }
            rVar2.R();
            CardListData place = summary.getPlace();
            if (place == null) {
                rVar2.X(458973205);
            } else {
                rVar2.X(458973206);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, summary.getPlaceTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(place, null, null, rVar2, 0, 6);
                oq.i0 i0Var8 = oq.i0.f148189a;
            }
            rVar2.R();
            CardListData otherReport = summary.getOtherReport();
            if (otherReport == null) {
                rVar2.X(459305711);
            } else {
                rVar2.X(459305712);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, summary.getOtherReportTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(otherReport, null, null, rVar2, 0, 6);
                oq.i0 i0Var9 = oq.i0.f148189a;
            }
            rVar2.R();
            CardListData personal = summary.getPersonal();
            if (personal == null) {
                rVar2.X(459640914);
            } else {
                rVar2.X(459640915);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, summary.getPersonalTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(personal, null, null, rVar2, 0, 6);
                oq.i0 i0Var10 = oq.i0.f148189a;
            }
            rVar2.R();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
            v30.d.f(summary.getStatementCheckBoxSingleData(), rVar2, CheckBoxSingleData.f210090f);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(i.a.Summary summary, int i15, p076m2.r rVar, int i16) {
        k(summary, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final i iVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1344203387);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(iVar) : rVarH.G(iVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1344203387, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.summary.SummaryScreen (SummaryScreen.kt:38)");
            }
            final f6 f6VarC = m7.b.c(iVar.getState(), null, null, null, rVarH, 0, 7);
            i.a aVarP = p(f6VarC);
            if (aVarP instanceof i.a.Error) {
                rVarH.X(-1005694621);
                ((i.a.Error) aVarP).getErrorVMSAdapter().b(rVarH, 0);
                rVarH.R();
            } else if (aVarP instanceof i.a.Summary) {
                rVarH.X(-1005693002);
                k((i.a.Summary) aVarP, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarP instanceof i.a.Success)) {
                    rVarH.X(-1005697145);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1005690794);
                h((i.a.Success) aVarP, rVarH, 0);
                rVarH.R();
            }
            boolean zW = rVarH.W(f6VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: v33.k
                    @Override // er.a
                    public final Object a() {
                        return r.q(f6VarC);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: v33.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.r(iVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final i.a p(f6<? extends i.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(f6 f6Var) {
        p(f6Var).a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(i iVar, int i15, p076m2.r rVar, int i16) {
        o(iVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
