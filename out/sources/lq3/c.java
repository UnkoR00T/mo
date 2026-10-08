package lq3;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.t;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f119627a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<g.IconPageContentData, p076m2.r, Integer, i0> f119628b = y2.m.b(1540974234, false, new er.q() { // from class: lq3.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((g.IconPageContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f119629c = y2.m.b(-15849138, false, new er.q() { // from class: lq3.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(g.IconPageContentData iconPageContentData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(iconPageContentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1540974234, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votesucces.ComposableSingletons$VoteSuccessScreenKt.lambda$1540974234.<anonymous> (VoteSuccessScreen.kt:44)");
            }
            l.e(iconPageContentData, rVar, i15 & 14);
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
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-15849138, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votesucces.ComposableSingletons$VoteSuccessScreenKt.lambda$-15849138.<anonymous> (VoteSuccessScreen.kt:46)");
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

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> c() {
        return f119629c;
    }

    public final er.q<g.IconPageContentData, p076m2.r, Integer, i0> d() {
        return f119628b;
    }
}
