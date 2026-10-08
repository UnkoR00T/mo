package p045f11;

import er.q;
import g11.h;
import g11.n;
import i11.t;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import y2.m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f55113a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<t, p076m2.r, Integer, i0> f55114b = m.b(251161356, false, new q() { // from class: f11.p
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return r.f((t) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q<n, p076m2.r, Integer, i0> f55115c = m.b(2131894611, false, new q() { // from class: f11.q
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return r.e((n) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(n nVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2131894611, i15, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.ComposableSingletons$CasesNavContentKt.lambda$2131894611.<anonymous> (CasesNavContent.kt:63)");
        }
        h.g(nVar, rVar, i15 & 14);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(t tVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(251161356, i15, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.ComposableSingletons$CasesNavContentKt.lambda$251161356.<anonymous> (CasesNavContent.kt:47)");
        }
        i11.m.j(tVar, rVar, i15 & 14);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    public final q<n, p076m2.r, Integer, i0> c() {
        return f55115c;
    }

    public final q<t, p076m2.r, Integer, i0> d() {
        return f55114b;
    }
}
