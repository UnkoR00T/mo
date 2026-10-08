package r31;

import d1.r3;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f171278a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<f1.e, p076m2.r, Integer, i0> f171279b = y2.m.b(-478713629, false, new er.q() { // from class: r31.z
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return a0.c((f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-478713629, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.birthplaceofficesearch.ComposableSingletons$BirthPlaceOfficeSearchScreenKt.lambda$-478713629.<anonymous> (BirthPlaceOfficeSearchScreen.kt:116)");
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
        return f171279b;
    }
}
