package c13;

import b30.AccordionData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f22584a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<g.Data.ContentData, p076m2.r, Integer, i0> f22585b = y2.m.b(261111602, false, new er.q() { // from class: c13.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((g.Data.ContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(g.Data.ContentData contentData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(contentData) : rVar.G(contentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(261111602, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.verified.ComposableSingletons$SafeBusVerifiedScreenKt.lambda$261111602.<anonymous> (SafeBusVerifiedScreen.kt:47)");
            }
            l.e(contentData, rVar, (i15 & 14) | AccordionData.f16343b);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<g.Data.ContentData, p076m2.r, Integer, i0> b() {
        return f22585b;
    }
}
