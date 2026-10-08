package lu2;

import b30.AccordionData;
import d1.r3;
import h30.ButtonData;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f120482a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<i.IconPageDataModel, p076m2.r, Integer, i0> f120483b = y2.m.b(2078144637, false, new er.q() { // from class: lu2.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((i.IconPageDataModel) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f120484c = y2.m.b(1735372053, false, new er.q() { // from class: lu2.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1735372053, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.result.ComposableSingletons$PeselRestrictionVerificationResultScreenKt.lambda$1735372053.<anonymous> (PeselRestrictionVerificationResultScreen.kt:52)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(-52373667);
            } else {
                rVar.X(-52373666);
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
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(i.IconPageDataModel iconPageDataModel, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(iconPageDataModel) : rVar.G(iconPageDataModel) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2078144637, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.result.ComposableSingletons$PeselRestrictionVerificationResultScreenKt.lambda$2078144637.<anonymous> (PeselRestrictionVerificationResultScreen.kt:50)");
            }
            n.e(iconPageDataModel, rVar, (i15 & 14) | AccordionData.f16343b);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> c() {
        return f120484c;
    }

    public final er.q<i.IconPageDataModel, p076m2.r, Integer, i0> d() {
        return f120483b;
    }
}
