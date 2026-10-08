package ya1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1 f225764a = new p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<za1.a0, p076m2.r, Integer, oq.i0> f225765b = y2.m.b(5529905, false, new er.q() { // from class: ya1.n1
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return p1.f((za1.a0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<wa1.l, p076m2.r, Integer, oq.i0> f225766c = y2.m.b(1835686185, false, new er.q() { // from class: ya1.o1
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return p1.e((wa1.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(wa1.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1835686185, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.ComposableSingletons$CompanyNavContentKt.lambda$1835686185.<anonymous> (CompanyNavContent.kt:419)");
        }
        wa1.i.g(lVar, rVar, i15 & 14);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(za1.a0 a0Var, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(5529905, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.navigation.ComposableSingletons$CompanyNavContentKt.lambda$5529905.<anonymous> (CompanyNavContent.kt:372)");
        }
        za1.n.t(a0Var, rVar, i15 & 14);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    public final er.q<wa1.l, p076m2.r, Integer, oq.i0> c() {
        return f225766c;
    }

    public final er.q<za1.a0, p076m2.r, Integer, oq.i0> d() {
        return f225765b;
    }
}
