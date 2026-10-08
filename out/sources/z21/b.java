package z21;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f232357a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<g.Data.InterfaceC6236a.Failure.ContentData, p076m2.r, Integer, i0> f232358b = y2.m.b(-2006535620, false, new er.q() { // from class: z21.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((g.Data.InterfaceC6236a.Failure.ContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(g.Data.InterfaceC6236a.Failure.ContentData contentData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(contentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2006535620, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.insurance.ComposableSingletons$InsuranceScreenKt.lambda$-2006535620.<anonymous> (InsuranceScreen.kt:85)");
            }
            n.l(contentData, rVar, i15 & 14);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<g.Data.InterfaceC6236a.Failure.ContentData, p076m2.r, Integer, i0> b() {
        return f232358b;
    }
}
