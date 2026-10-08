package mp2;

import h30.ButtonData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f127482a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<ButtonData, p076m2.r, Integer, i0> f127483b = y2.m.b(1335308434, false, new er.q() { // from class: mp2.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((ButtonData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(ButtonData buttonData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(buttonData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1335308434, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.childdata.ComposableSingletons$PassportAgreementChildDataScreenKt.lambda$1335308434.<anonymous> (PassportAgreementChildDataScreen.kt:96)");
            }
            h30.q.p(buttonData, false, null, rVar, i15 & 14, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<ButtonData, p076m2.r, Integer, i0> b() {
        return f127483b;
    }
}
