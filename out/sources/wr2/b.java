package wr2;

import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f214626a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f214627b = y2.m.b(-1728142469, false, new er.q() { // from class: wr2.a
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
            if (p076m2.t.k()) {
                p076m2.t.o(-1728142469, i15, -1, "pl.gov.coi.mobywatel.feature.passportpickup.presentation.status.ComposableSingletons$PassportPickupStatusScreenKt.lambda$-1728142469.<anonymous> (PassportPickupStatusScreen.kt:33)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> b() {
        return f214627b;
    }
}
