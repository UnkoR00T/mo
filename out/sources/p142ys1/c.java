package p142ys1;

import ct1.i;
import ct1.l;
import er.q;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;
import zs1.b1;
import zs1.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f229189a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<x1, r, Integer, i0> f229190b = m.b(824220636, false, new q() { // from class: ys1.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((x1) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q<l, r, Integer, i0> f229191c = m.b(1395632694, false, new q() { // from class: ys1.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((l) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(l lVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1395632694, i15, -1, "pl.gov.coi.mobywatel.feature.diia.presentation.ComposableSingletons$NavContentKt.lambda$1395632694.<anonymous> (NavContent.kt:102)");
        }
        i.g(lVar, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(x1 x1Var, r rVar, int i15) {
        if (t.k()) {
            t.o(824220636, i15, -1, "pl.gov.coi.mobywatel.feature.diia.presentation.ComposableSingletons$NavContentKt.lambda$824220636.<anonymous> (NavContent.kt:54)");
        }
        b1.o(x1Var, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    public final q<l, r, Integer, i0> c() {
        return f229191c;
    }

    public final q<x1, r, Integer, i0> d() {
        return f229190b;
    }
}
