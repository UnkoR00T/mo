package ri3;

import d1.r3;
import h30.ButtonData;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f174560a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f174561b = y2.m.b(1903179844, false, new er.q() { // from class: ri3.t
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return u.c((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1903179844, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.wheretoreport.automaticreportsuccess.ComposableSingletons$AutomaticReportSuccessScreenKt.lambda$1903179844.<anonymous> (AutomaticReportSuccessScreen.kt:50)");
            }
            if (iconPageBottomContentData == null) {
                rVar.X(-232480852);
            } else {
                rVar.X(-232480851);
                h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
                ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
                if (secondaryButtonData == null) {
                    rVar.X(-459166372);
                } else {
                    rVar.X(-459166371);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
                    h30.q.p(secondaryButtonData, false, null, rVar, 0, 6);
                }
                rVar.R();
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> b() {
        return f174561b;
    }
}
