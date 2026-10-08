package a12;

import d1.e0;
import d1.i0;
import d1.m3;
import d1.q3;
import d1.r3;
import er.p;
import f3.j;
import f3.m;
import j30.ButtonTextData;
import j30.f;
import j70.h;
import mx.Label;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La12/e;", "data", "Loq/i0;", "b", "(La12/e;Lm2/r;I)V", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void b(final SearchResultSingleCardData searchResultSingleCardData, r rVar, final int i15) {
        int i16;
        m.Companion companion;
        int i17;
        r rVarH = rVar.h(824569539);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(searchResultSingleCardData) : rVarH.G(searchResultSingleCardData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(824569539, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.custom.singlecard.SearchResultSingleCard (SearchResultSingleCardCustomContent.kt:35)");
            }
            m.Companion companion2 = m.INSTANCE;
            m mVarO = i.O(companion2, searchResultSingleCardData.getContentDescription(), false, null, rVarH, 6, 6);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarO);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            i0 i0Var = i0.f39176a;
            Label infoLabel = searchResultSingleCardData.getInfoLabel();
            if (infoLabel == null) {
                rVarH.X(-485823717);
                rVarH.R();
                companion = companion2;
                i17 = 0;
            } else {
                rVarH.X(-485823716);
                k70.a aVar = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                companion = companion2;
                h.g(null, null, infoLabel, null, null, aVar.a(rVarH, i18).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
                m mVarI = androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing50());
                i17 = 0;
                r3.a(mVarI, rVarH, 0);
                oq.i0 i0Var2 = oq.i0.f148189a;
                rVarH.R();
            }
            w0 w0VarB = m3.b(iVar.j(), companion3.i(), rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, i17));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, companion);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            q3 q3Var = q3.f39261a;
            r50.a statusBadge = searchResultSingleCardData.getStatusBadge();
            if (statusBadge == null) {
                rVarH.X(284554217);
            } else {
                rVarH.X(284554218);
                r50.e.f(statusBadge, false, null, false, rVarH, r50.a.f171863f, 14);
                r3.a(androidx.compose.foundation.layout.d.y(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50()), rVarH, i17);
                oq.i0 i0Var3 = oq.i0.f148189a;
            }
            rVarH.R();
            Label titleLabel = searchResultSingleCardData.getTitleLabel();
            k70.a aVar2 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            r rVar2 = rVarH;
            h.g(null, null, titleLabel, null, null, aVar2.a(rVarH, i19).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i19).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            rVarH = rVar2;
            rVarH.x();
            Label descriptionLabel = searchResultSingleCardData.getDescriptionLabel();
            if (descriptionLabel == null) {
                rVarH.X(-485173957);
            } else {
                rVarH.X(-485173956);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i19).getSpacing50()), rVarH, 0);
                h.g(null, null, descriptionLabel, null, null, aVar2.a(rVarH, i19).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i19).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
                oq.i0 i0Var4 = oq.i0.f148189a;
            }
            rVarH.R();
            ButtonTextData moreButtonData = searchResultSingleCardData.getMoreButtonData();
            if (moreButtonData == null) {
                rVarH.X(-484915076);
            } else {
                rVarH.X(-484915075);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i19).getSpacing100()), rVarH, 0);
                r rVar3 = rVarH;
                f.e(null, moreButtonData, false, rVar3, ButtonTextData.f99099f << 3, 5);
                rVarH = rVar3;
                oq.i0 i0Var5 = oq.i0.f148189a;
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a12.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.c(searchResultSingleCardData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(SearchResultSingleCardData searchResultSingleCardData, int i15, r rVar, int i16) {
        b(searchResultSingleCardData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
