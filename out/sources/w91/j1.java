package w91;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f211387a = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<InfoRowListData, p076m2.r, Integer, oq.i0> f211388b = y2.m.b(-1595010972, false, new er.q() { // from class: w91.g1
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return j1.f((InfoRowListData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, oq.i0> f211389c = y2.m.b(-851275479, false, new er.q() { // from class: w91.h1
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return j1.h((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(final InfoRowListData infoRowListData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(infoRowListData) : rVar.G(infoRowListData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1595010972, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.summary.ComposableSingletons$ChildPassportApplicationSummaryScreenKt.lambda$-1595010972.<anonymous> (ChildPassportApplicationSummaryScreen.kt:155)");
            }
            x30.c.c(null, 0.0f, y2.m.d(1803153315, true, new er.p() { // from class: w91.i1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j1.g(infoRowListData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(InfoRowListData infoRowListData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1803153315, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.summary.ComposableSingletons$ChildPassportApplicationSummaryScreenKt.lambda$-1595010972.<anonymous>.<anonymous> (ChildPassportApplicationSummaryScreen.kt:156)");
            }
            s40.g.c(infoRowListData, 0.0f, rVar, InfoRowListData.f187643b, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-851275479, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.summary.ComposableSingletons$ChildPassportApplicationSummaryScreenKt.lambda$-851275479.<anonymous> (ChildPassportApplicationSummaryScreen.kt:159)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    public final er.q<InfoRowListData, p076m2.r, Integer, oq.i0> d() {
        return f211388b;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, oq.i0> e() {
        return f211389c;
    }
}
