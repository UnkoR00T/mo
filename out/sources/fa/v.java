package fa;

import ea.NavEntry;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.e0;
import p076m2.n6;
import p114t0.t0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfa/v;", "", "T", "Lea/o;", "Lt0/t0;", "sharedTransitionScope", "<init>", "(Lt0/t0;)V", "navigation3-ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v<T> extends ea.o<T> {
    public v(final t0 t0Var) {
        super(null, y2.m.b(2108709411, true, new er.q(t0Var) { // from class: fa.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return v.f(null, (NavEntry) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(t0 t0Var, NavEntry navEntry, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(navEntry) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2108709411, i16, -1, "androidx.navigation3.scene.SharedEntryInSceneNavEntryDecorator.<init>.<anonymous> (SharedEntryInSceneNavEntryDecorator.kt:44)");
            }
            f3.m mVarR = t0.r(t0Var, f3.m.INSTANCE, t0Var.c(navEntry.getContentKey(), rVar, 0), (p114t0.l) rVar.N(ga.b.c()), null, null, false, 0.0f, null, 124, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.f()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.e(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            navEntry.b(rVar, i16 & 14);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }
}
