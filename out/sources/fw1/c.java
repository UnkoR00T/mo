package fw1;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f68380a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<zv1.v, p076m2.r, Integer, i0> f68381b = y2.m.b(-865591270, false, new er.q() { // from class: fw1.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((zv1.v) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<bw1.n, p076m2.r, Integer, i0> f68382c = y2.m.b(-1252316950, false, new er.q() { // from class: fw1.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((bw1.n) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(bw1.n nVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1252316950, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.ComposableSingletons$DynamicMultiDocumentNavContentKt.lambda$-1252316950.<anonymous> (DynamicMultiDocumentNavContent.kt:234)");
        }
        bw1.h.g(nVar, rVar, i15 & 14);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(zv1.v vVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-865591270, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.ComposableSingletons$DynamicMultiDocumentNavContentKt.lambda$-865591270.<anonymous> (DynamicMultiDocumentNavContent.kt:152)");
        }
        zv1.l.j(vVar, rVar, i15 & 14);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    public final er.q<bw1.n, p076m2.r, Integer, i0> c() {
        return f68382c;
    }

    public final er.q<zv1.v, p076m2.r, Integer, i0> d() {
        return f68381b;
    }
}
