package o70;

import er.p;
import h60.f;
import h60.g;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f142870a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p<r, Integer, i0> f142871b = m.b(-1740346624, false, new p() { // from class: o70.c
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return d.c((r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1740346624, i15, -1, "pl.gov.coi.common.ui.tooltips.ComposableSingletons$BottomSheetTooltipKt.lambda$-1740346624.<anonymous> (BottomSheetTooltip.kt:67)");
            }
            int i16 = jz.a.Y;
            f.e(null, null, Integer.valueOf(i16), g.Medium, k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b(), 0.0f, null, null, 0L, 0.0f, 0.0f, c70.a.f23835a.a().r0().getText(), rVar, 3072, 0, 2019);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final p<r, Integer, i0> b() {
        return f142871b;
    }
}
