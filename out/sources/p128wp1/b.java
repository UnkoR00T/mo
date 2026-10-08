package p128wp1;

import androidx.compose.foundation.layout.d;
import er.p;
import j70.h;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f214289a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p<r, Integer, i0> f214290b = m.b(-1149114131, false, new p() { // from class: wp1.a
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return b.c((r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1149114131, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.contentbox.ComposableSingletons$DeveloperContentBoxScreenKt.lambda$-1149114131.<anonymous> (DeveloperContentBoxScreen.kt:65)");
            }
            d1.r.b(d.h(f3.m.INSTANCE, 0.0f, 1, null), rVar, 6);
            h.g(null, null, mx.b.b("Test", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final p<r, Integer, i0> b() {
        return f214290b;
    }
}
