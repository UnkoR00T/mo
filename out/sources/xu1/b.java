package xu1;

import d1.r3;
import h30.ButtonData;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f221335a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, oq.i0> f221336b = y2.m.b(847165731, false, new er.q() { // from class: xu1.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(847165731, i16, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.main.ComposableSingletons$DrivingLicenceMainScreenKt.lambda$847165731.<anonymous> (DrivingLicenceMainScreen.kt:254)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(686598287);
            } else {
                rVar.X(686598288);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing150()), rVar, 0);
                h30.q.p(secondaryButtonData, false, null, rVar, 0, 6);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, oq.i0> b() {
        return f221336b;
    }
}
