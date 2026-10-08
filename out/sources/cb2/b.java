package cb2;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f24881a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<gb2.l, p076m2.r, Integer, i0> f24882b = y2.m.b(1134108433, false, new er.q() { // from class: cb2.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((gb2.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(gb2.l lVar, p076m2.r rVar, int i15) {
        if (t.k()) {
            t.o(1134108433, i15, -1, "pl.gov.coi.mobywatel.feature.idcardcollecting.presentation.ComposableSingletons$IdCardCollectingNavContentKt.lambda$1134108433.<anonymous> (IdCardCollectingNavContent.kt:81)");
        }
        gb2.h.g(lVar, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    public final er.q<gb2.l, p076m2.r, Integer, i0> b() {
        return f24882b;
    }
}
