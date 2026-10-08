package mp1;

import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f127463a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p<r, Integer, i0> f127464b = m.b(2088290206, false, new p() { // from class: mp1.a
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return b.c((r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(2088290206, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.bottomSheet.ComposableSingletons$DeveloperBottomSheetScreenKt.lambda$2088290206.<anonymous> (DeveloperBottomSheetScreen.kt:68)");
            }
            l.t(rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final p<r, Integer, i0> b() {
        return f127464b;
    }
}
