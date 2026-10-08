package n20;

import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f130773a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p<r, Integer, i0> f130774b = m.b(435174922, false, new p() { // from class: n20.k
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return l.c((r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(435174922, i15, -1, "pl.gov.coi.common.ui.document.ComposableSingletons$BaseDocumentScreenKt.lambda$435174922.<anonymous> (BaseDocumentScreen.kt:82)");
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final p<r, Integer, i0> b() {
        return f130774b;
    }
}
