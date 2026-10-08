package ir2;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.t;
import q40.IconPageBottomContentData;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f96723a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<g.IconPageContentData, p076m2.r, Integer, i0> f96724b = y2.m.b(-495806622, false, new er.q() { // from class: ir2.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((g.IconPageContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f96725c = y2.m.b(165957166, false, new er.q() { // from class: ir2.b
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
            if (t.k()) {
                t.o(165957166, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.screens.wizardsteps.success.ComposableSingletons$SuccessScreenKt.lambda$165957166.<anonymous> (SuccessScreen.kt:49)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(g.IconPageContentData iconPageContentData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(iconPageContentData) : rVar.G(iconPageContentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-495806622, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.screens.wizardsteps.success.ComposableSingletons$SuccessScreenKt.lambda$-495806622.<anonymous> (SuccessScreen.kt:47)");
            }
            m.i(iconPageContentData, rVar, (i15 & 14) | InfoRowListData.f187643b);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<g.IconPageContentData, p076m2.r, Integer, i0> c() {
        return f96724b;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> d() {
        return f96725c;
    }
}
