package sy0;

import d1.r3;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f185567a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<f1.e, p076m2.r, Integer, i0> f185568b = y2.m.b(-745196963, false, new er.q() { // from class: sy0.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-745196963, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.editfavoritepoints.ComposableSingletons$EditFavoritePointsScreenKt.lambda$-745196963.<anonymous> (EditFavoritePointsScreen.kt:75)");
            }
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<f1.e, p076m2.r, Integer, i0> b() {
        return f185568b;
    }
}
