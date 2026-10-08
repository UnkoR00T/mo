package g30;

import d1.e0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f70152a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.p<p076m2.r, Integer, i0> f70153b = y2.m.b(-664384509, false, new er.p() { // from class: g30.a
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return d.h((p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.p<p076m2.r, Integer, i0> f70154c = y2.m.b(526257083, false, new er.p() { // from class: g30.b
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return d.f((p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static er.p<p076m2.r, Integer, i0> f70155d = y2.m.b(5700703, false, new er.p() { // from class: g30.c
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return d.g((p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(526257083, i15, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ComposableSingletons$ModalBottomSheet3Kt.lambda$526257083.<anonymous> (ModalBottomSheet3.kt:98)");
            }
            m.h(rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(5700703, i15, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ComposableSingletons$ModalBottomSheet3Kt.lambda$5700703.<anonymous> (ModalBottomSheet3.kt:240)");
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarH);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            j70.h.g(null, null, mx.b.b("BottomSheet content", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-664384509, i15, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ComposableSingletons$ModalBottomSheet3Kt.lambda$-664384509.<anonymous> (ModalBottomSheet3.kt:56)");
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.p<p076m2.r, Integer, i0> d() {
        return f70153b;
    }

    public final er.p<p076m2.r, Integer, i0> e() {
        return f70154c;
    }
}
