package p132xc3;

import bd3.d0;
import bd3.u;
import er.q;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;
import zc3.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f217942a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<d0, r, Integer, i0> f217943b = m.b(1373985831, false, new q() { // from class: xc3.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((d0) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q<p, r, Integer, i0> f217944c = m.b(-763125452, false, new q() { // from class: xc3.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((p) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(d0 d0Var, r rVar, int i15) {
        if (t.k()) {
            t.o(1373985831, i15, -1, "pl.gov.coi.mobywatel.feature.userdata.presentation.ComposableSingletons$UserDataNavContentKt.lambda$1373985831.<anonymous> (UserDataNavContent.kt:57)");
        }
        u.p(d0Var, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(p pVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-763125452, i15, -1, "pl.gov.coi.mobywatel.feature.userdata.presentation.ComposableSingletons$UserDataNavContentKt.lambda$-763125452.<anonymous> (UserDataNavContent.kt:78)");
        }
        zc3.m.i(pVar, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    public final q<p, r, Integer, i0> c() {
        return f217944c;
    }

    public final q<d0, r, Integer, i0> d() {
        return f217943b;
    }
}
