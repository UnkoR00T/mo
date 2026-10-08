package b92;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f17608a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.p<p076m2.r, Integer, i0> f17609b = y2.m.b(364034568, false, new er.p() { // from class: b92.a
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return c.e((p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.p<p076m2.r, Integer, i0> f17610c = y2.m.b(858683589, false, new er.p() { // from class: b92.b
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return c.f((p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(364034568, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.reportviolationwizard.ComposableSingletons$ReportViolationWizardScreenKt.lambda$364034568.<anonymous> (ReportViolationWizardScreen.kt:30)");
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(858683589, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.reportviolationwizard.ComposableSingletons$ReportViolationWizardScreenKt.lambda$858683589.<anonymous> (ReportViolationWizardScreen.kt:43)");
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.p<p076m2.r, Integer, i0> c() {
        return f17609b;
    }

    public final er.p<p076m2.r, Integer, i0> d() {
        return f17610c;
    }
}
