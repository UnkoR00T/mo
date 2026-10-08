package i82;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f90131a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<z82.l, p076m2.r, Integer, oq.i0> f90132b = y2.m.b(1402191671, false, new er.q() { // from class: i82.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((z82.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<o82.k, p076m2.r, Integer, oq.i0> f90133c = y2.m.b(721979393, false, new er.q() { // from class: i82.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((o82.k) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(z82.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1402191671, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ComposableSingletons$GiosNavContentKt.lambda$1402191671.<anonymous> (GiosNavContent.kt:148)");
        }
        z82.i.g(lVar, rVar, i15 & 14);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(o82.k kVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(721979393, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ComposableSingletons$GiosNavContentKt.lambda$721979393.<anonymous> (GiosNavContent.kt:163)");
        }
        o82.h.d(kVar, rVar, i15 & 14);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    public final er.q<z82.l, p076m2.r, Integer, oq.i0> c() {
        return f90132b;
    }

    public final er.q<o82.k, p076m2.r, Integer, oq.i0> d() {
        return f90133c;
    }
}
