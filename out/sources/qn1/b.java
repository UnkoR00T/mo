package qn1;

import h30.ButtonData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f167460a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<ButtonData, r, Integer, i0> f167461b = y2.m.b(642087234, false, new er.q() { // from class: qn1.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((ButtonData) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(ButtonData buttonData, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(buttonData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(642087234, i15, -1, "pl.gov.coi.mobywatel.feature.dependentidsuspension.presentation.step.success.ComposableSingletons$SuccessScreenKt.lambda$642087234.<anonymous> (SuccessScreen.kt:34)");
            }
            h30.q.p(buttonData, false, null, rVar, i15 & 14, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<ButtonData, r, Integer, i0> b() {
        return f167461b;
    }
}
