package bb1;

import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f18056a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f18057b = y2.m.b(582691775, false, new er.q() { // from class: bb1.s
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return t.c((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(582691775, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.serviceunavailable.ComposableSingletons$CompanyServiceUnavailableScreenKt.lambda$582691775.<anonymous> (CompanyServiceUnavailableScreen.kt:80)");
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

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> b() {
        return f18057b;
    }
}
