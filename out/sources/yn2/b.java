package yn2;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.t;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f228185a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f228186b = y2.m.b(144423497, false, new er.q() { // from class: yn2.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(144423497, i15, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.success.ComposableSingletons$NetworkSecurityIssuesSuccessScreenKt.lambda$144423497.<anonymous> (NetworkSecurityIssuesSuccessScreen.kt:30)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> b() {
        return f228186b;
    }
}
