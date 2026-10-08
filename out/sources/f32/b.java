package f32;

import h30.ButtonData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f58876a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<ButtonData, p076m2.r, Integer, oq.i0> f58877b = y2.m.b(762204897, false, new er.q() { // from class: f32.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((ButtonData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(ButtonData buttonData, p076m2.r rVar, int i15) {
        p076m2.r rVar2;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(buttonData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(762204897, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.nativeoauth.ComposableSingletons$NativeOAuthScreenKt.lambda$762204897.<anonymous> (NativeOAuthScreen.kt:44)");
            }
            if (buttonData != null) {
                rVar.X(-645954227);
                rVar2 = rVar;
                h30.q.p(buttonData, false, null, rVar2, i15 & 14, 6);
            } else {
                rVar2 = rVar;
                rVar2.X(-647776159);
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    public final er.q<ButtonData, p076m2.r, Integer, oq.i0> b() {
        return f58877b;
    }
}
