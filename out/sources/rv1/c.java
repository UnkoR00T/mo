package rv1;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f176382a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<dw1.v, p076m2.r, Integer, i0> f176383b = y2.m.b(-25972138, false, new er.q() { // from class: rv1.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((dw1.v) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<xv1.q, p076m2.r, Integer, i0> f176384c = y2.m.b(-1105500741, false, new er.q() { // from class: rv1.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((xv1.q) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(xv1.q qVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1105500741, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.ComposableSingletons$DynamicDocumentNavContentKt.lambda$-1105500741.<anonymous> (DynamicDocumentNavContent.kt:112)");
        }
        xv1.j.j(qVar, rVar, i15 & 14);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(dw1.v vVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-25972138, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.ComposableSingletons$DynamicDocumentNavContentKt.lambda$-25972138.<anonymous> (DynamicDocumentNavContent.kt:80)");
        }
        dw1.f.l(vVar, rVar, i15 & 14);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    public final er.q<xv1.q, p076m2.r, Integer, i0> c() {
        return f176384c;
    }

    public final er.q<dw1.v, p076m2.r, Integer, i0> d() {
        return f176383b;
    }
}
