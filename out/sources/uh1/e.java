package uh1;

import d1.a3;
import d1.d3;
import f30.BottomNavigationData;
import i50.BaseScaffoldData;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Luh1/j;", "viewModel", "Lkotlin/Function1;", "Ll3/d0;", "Loq/i0;", "innerNavContent", "e", "(Luh1/j;Ler/q;Lm2/r;I)V", "Luh1/j$a;", "state", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198388e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f198389f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f198389f = jVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f198388e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f198389f.n();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f198389f, eVar);
        }
    }

    public static final void e(final j jVar, final er.q<? super l3.d0, ? super p076m2.r, ? super Integer, oq.i0> qVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1841039565);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(qVar) ? 32 : 16;
        }
        int i17 = i16;
        boolean z15 = false;
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1841039565, i17, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.main.DashboardMainScreen (DashboardMainScreen.kt:19)");
            }
            final f6 f6VarC = m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7);
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new l3.d0();
                rVarH.v(objE);
            }
            final l3.d0 d0Var = (l3.d0) objE;
            i50.s.r(f(f6VarC).getBaseScaffoldData(), y2.m.d(-1578680600, true, new er.p() { // from class: uh1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.g(f6VarC, d0Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1866620704, true, new er.q() { // from class: uh1.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return e.i(qVar, d0Var, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196992, 28668);
            rVarH = rVarH;
            oq.i0 i0Var = oq.i0.f148189a;
            if ((i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(jVar))) {
                z15 = true;
            }
            Object objE2 = rVarH.E();
            if (z15 || objE2 == companion.a()) {
                objE2 = new a(jVar, null);
                rVarH.v(objE2);
            }
            Function0.d(i0Var, (er.p) objE2, rVarH, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: uh1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.j(jVar, qVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final j.Data f(f6<j.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(final f6 f6Var, final l3.d0 d0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1578680600, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.main.DashboardMainScreen.<anonymous> (DashboardMainScreen.kt:25)");
            }
            e20.j.e(!f(f6Var).getIsImeVisible(), y2.m.d(1784975667, true, new er.p() { // from class: uh1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.h(d0Var, f6Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(l3.d0 d0Var, f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1784975667, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.main.DashboardMainScreen.<anonymous>.<anonymous> (DashboardMainScreen.kt:26)");
            }
            f30.j.h(f(f6Var).getBottomNavigationData(), d0Var, rVar, BottomNavigationData.f58833c | 48, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(er.q qVar, l3.d0 d0Var, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1866620704, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.main.DashboardMainScreen.<anonymous> (DashboardMainScreen.kt:34)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            qVar.w(d0Var, rVar, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(j jVar, er.q qVar, int i15, p076m2.r rVar, int i16) {
        e(jVar, qVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
