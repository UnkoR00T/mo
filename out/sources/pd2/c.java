package pd2;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f157007a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<sd2.l, p076m2.r, Integer, i0> f157008b = y2.m.b(671444892, false, new er.q() { // from class: pd2.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((sd2.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<qd2.l, p076m2.r, Integer, i0> f157009c = y2.m.b(1377698901, false, new er.q() { // from class: pd2.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((qd2.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(qd2.l lVar, p076m2.r rVar, int i15) {
        if (t.k()) {
            t.o(1377698901, i15, -1, "pl.gov.coi.mobywatel.feature.idverification.presentation.navigation.ComposableSingletons$IdVerificationNavContentKt.lambda$1377698901.<anonymous> (IdVerificationNavContent.kt:82)");
        }
        qd2.i.d(lVar, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(sd2.l lVar, p076m2.r rVar, int i15) {
        if (t.k()) {
            t.o(671444892, i15, -1, "pl.gov.coi.mobywatel.feature.idverification.presentation.navigation.ComposableSingletons$IdVerificationNavContentKt.lambda$671444892.<anonymous> (IdVerificationNavContent.kt:63)");
        }
        sd2.h.e(lVar, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    public final er.q<qd2.l, p076m2.r, Integer, i0> c() {
        return f157009c;
    }

    public final er.q<sd2.l, p076m2.r, Integer, i0> d() {
        return f157008b;
    }
}
