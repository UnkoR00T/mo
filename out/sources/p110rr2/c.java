package p110rr2;

import er.q;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import ur2.l;
import ur2.p;
import wr2.i;
import y2.m;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f175543a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<p, r, Integer, i0> f175544b = m.b(-1414503906, false, new q() { // from class: rr2.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((p) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q<wr2.p, r, Integer, i0> f175545c = m.b(243383341, false, new q() { // from class: rr2.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((wr2.p) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(wr2.p pVar, r rVar, int i15) {
        if (t.k()) {
            t.o(243383341, i15, -1, "pl.gov.coi.mobywatel.feature.passportpickup.presentation.ComposableSingletons$PassportPickupNavContentKt.lambda$243383341.<anonymous> (PassportPickupNavContent.kt:62)");
        }
        i.g(pVar, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(p pVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1414503906, i15, -1, "pl.gov.coi.mobywatel.feature.passportpickup.presentation.ComposableSingletons$PassportPickupNavContentKt.lambda$-1414503906.<anonymous> (PassportPickupNavContent.kt:44)");
        }
        l.e(pVar, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    public final q<p, r, Integer, i0> c() {
        return f175544b;
    }

    public final q<wr2.p, r, Integer, i0> d() {
        return f175545c;
    }
}
