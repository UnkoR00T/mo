package jy2;

import d1.r3;
import h30.ButtonData;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f106482a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<InfoRowListData, p076m2.r, Integer, i0> f106483b = y2.m.b(-558881214, false, new er.q() { // from class: jy2.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((InfoRowListData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f106484c = y2.m.b(1924222237, false, new er.q() { // from class: jy2.b
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
                p076m2.t.o(1924222237, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.success.ComposableSingletons$SuccessScreenKt.lambda$1924222237.<anonymous> (SuccessScreen.kt:39)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(-423700441);
            } else {
                rVar.X(-423700440);
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
    public static final i0 f(InfoRowListData infoRowListData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(infoRowListData) : rVar.G(infoRowListData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-558881214, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.success.ComposableSingletons$SuccessScreenKt.lambda$-558881214.<anonymous> (SuccessScreen.kt:36)");
            }
            o.g(infoRowListData, rVar, (i15 & 14) | InfoRowListData.f187643b);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<InfoRowListData, p076m2.r, Integer, i0> c() {
        return f106483b;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> d() {
        return f106484c;
    }
}
