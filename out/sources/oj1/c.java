package oj1;

import d1.r3;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f146302a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<j.IconPageCardsContent, p076m2.r, Integer, i0> f146303b = y2.m.b(936899505, false, new er.q() { // from class: oj1.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((j.IconPageCardsContent) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f146304c = y2.m.b(628905068, false, new er.q() { // from class: oj1.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(628905068, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.success.ComposableSingletons$SuccessScreenKt.lambda$628905068.<anonymous> (SuccessScreen.kt:51)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(j.IconPageCardsContent iconPageCardsContent, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(iconPageCardsContent) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(936899505, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.success.ComposableSingletons$SuccessScreenKt.lambda$936899505.<anonymous> (SuccessScreen.kt:47)");
            }
            m30.i.d(iconPageCardsContent.getCardListData(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> c() {
        return f146304c;
    }

    public final er.q<j.IconPageCardsContent, p076m2.r, Integer, i0> d() {
        return f146303b;
    }
}
