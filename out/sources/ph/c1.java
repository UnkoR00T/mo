package ph;

import d1.m3;
import d1.p3;
import d1.q3;
import ea.NavEntry;
import java.util.List;
import p076m2.n6;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements fa.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f157547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f157548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NavEntry f157549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NavEntry f157550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f157551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final er.p f157552f = y2.m.b(23545953, true, new er.p() { // from class: ph.b1
        @Override // er.p
        public final /* synthetic */ Object B(Object obj, Object obj2) {
            return c1.c(this.f157544a, (p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    public c1(Object obj, List list, NavEntry navEntry, NavEntry navEntry2) {
        this.f157547a = obj;
        this.f157548b = list;
        this.f157549c = navEntry;
        this.f157550d = navEntry2;
        this.f157551e = pq.v.q(navEntry, navEntry2);
    }

    static /* synthetic */ oq.i0 c(c1 c1Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(23545953, i15, -1, "com.google.android.gms.oss.licenses.v2.ListDetailScene.content.<anonymous> (ListDetailSceneStrategy.kt:36)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.e eVarJ = iVar.j();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarB = m3.b(eVarJ, companion2.l(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.e(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            f3.m mVarC = p3.c(q3Var, companion, 0.4f, false, 2, null);
            p036e4.w0 w0VarA = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.f()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.e(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            c1Var.f157549c.b(rVar, 0);
            rVar.x();
            f3.m mVarC2 = p3.c(q3Var, companion, 0.6f, false, 2, null);
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarC2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.f()) {
                rVar.H(aVarB3);
            } else {
                rVar.u();
            }
            p076m2.r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarA2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.e(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            c1Var.f157550d.b(rVar, 0);
            rVar.x();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    @Override // fa.h
    public final List a() {
        return this.f157548b;
    }

    @Override // fa.h
    public final er.p getContent() {
        return this.f157552f;
    }

    @Override // fa.h
    public final List getEntries() {
        return this.f157551e;
    }

    @Override // fa.h
    public final Object getKey() {
        return this.f157547a;
    }
}
