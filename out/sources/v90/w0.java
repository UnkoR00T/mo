package v90;

import d1.r3;
import h30.ButtonData;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f205375a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, oq.i0> f205376b = y2.m.b(-1451968643, false, new er.q() { // from class: v90.v0
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return w0.c((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
                p076m2.t.o(-1451968643, i16, -1, "pl.gov.coi.mjunior.feature.activation.presentation.screen.activation.ComposableSingletons$ActivationScreenKt.lambda$-1451968643.<anonymous> (ActivationScreen.kt:117)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(-982068235);
            } else {
                rVar.X(-982068234);
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
        return f205376b;
    }
}
