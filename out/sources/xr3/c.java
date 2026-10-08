package xr3;

import d1.r3;
import h30.ButtonData;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.t;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f220609a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<CardListData, p076m2.r, Integer, i0> f220610b = y2.m.b(1625474629, false, new er.q() { // from class: xr3.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((CardListData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f220611c = y2.m.b(82271844, false, new er.q() { // from class: xr3.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(CardListData cardListData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(cardListData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1625474629, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitoutro.ComposableSingletons$NewVisitOutroScreenKt.lambda$1625474629.<anonymous> (NewVisitOutroScreen.kt:73)");
            }
            m30.i.d(cardListData, null, null, rVar, i15 & 14, 6);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(82271844, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitoutro.ComposableSingletons$NewVisitOutroScreenKt.lambda$82271844.<anonymous> (NewVisitOutroScreen.kt:77)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(-1465679896);
            } else {
                rVar.X(-1465679895);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing150()), rVar, 0);
                h30.q.p(secondaryButtonData, false, null, rVar, 0, 6);
            }
            rVar.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<CardListData, p076m2.r, Integer, i0> c() {
        return f220610b;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> d() {
        return f220611c;
    }
}
