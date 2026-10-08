package nr1;

import d1.r3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f137898a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.s<f1.e, Integer, Cheese, p076m2.r, Integer, oq.i0> f137899b = y2.m.b(-319752871, false, new er.s() { // from class: nr1.g
        @Override // er.s
        public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return h.c((f1.e) obj, ((Integer) obj2).intValue(), (Cheese) obj3, (p076m2.r) obj4, ((Integer) obj5).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(f1.e eVar, int i15, Cheese cheese, p076m2.r rVar, int i16) {
        int i17;
        Cheese cheese2;
        if ((i16 & 48) == 0) {
            i17 = (rVar.c(i15) ? 32 : 16) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            cheese2 = cheese;
            i17 |= rVar.W(cheese2) ? 256 : 128;
        } else {
            cheese2 = cheese;
        }
        if (rVar.r((i17 & 1169) != 1168, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-319752871, i17, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.paging.ComposableSingletons$DeveloperPagingScreenKt.lambda$-319752871.<anonymous> (DeveloperPagingScreen.kt:67)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            j70.h.g(null, null, mx.b.b(i15 + ". " + cheese2.getName(), ""), null, null, 0L, c5.w.g(20), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 1572864, 0, 0, 33554363);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    public final er.s<f1.e, Integer, Cheese, p076m2.r, Integer, oq.i0> b() {
        return f137899b;
    }
}
