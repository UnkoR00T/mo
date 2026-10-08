package iq3;

import d1.r3;
import h30.ButtonData;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f96543a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, oq.i0> f96544b = y2.m.b(899955846, false, new er.q() { // from class: iq3.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.p<p076m2.r, Integer, oq.i0> f96545c = y2.m.b(-911264094, false, new er.p() { // from class: iq3.b
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return c.f((p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(899955846, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.ComposableSingletons$VoteIdeaListScreenKt.lambda$899955846.<anonymous> (VoteIdeaListScreen.kt:64)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(1398887512);
            } else {
                rVar.X(1398887513);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-911264094, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.ComposableSingletons$VoteIdeaListScreenKt.lambda$-911264094.<anonymous> (VoteIdeaListScreen.kt:93)");
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    public final er.p<p076m2.r, Integer, oq.i0> c() {
        return f96545c;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, oq.i0> d() {
        return f96544b;
    }
}
