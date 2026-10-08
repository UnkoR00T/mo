package hi1;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\u000f\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0013\u001a\u00020\u0002*\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Lhi1/g;", "viewModel", "Loq/i0;", "o", "(Lhi1/g;Lm2/r;I)V", "Lhi1/g$b$c;", "data", "s", "(Lhi1/g$b$c;Lm2/r;I)V", "Lf1/q0;", "Lmx/a;", "listHeader", "", "Ln50/k;", "serviceList", "G", "(Lf1/q0;Lmx/a;Ljava/util/List;)V", "Lhi1/g$a;", "categoriesList", ip.a.f96138c, "(Lf1/q0;Ljava/util/List;)V", "Lhi1/g$b$a;", "y", "(Lhi1/g$b$a;Lm2/r;I)V", "Lhi1/g$b$b;", "B", "(Lhi1/g$b$b;Lm2/r;I)V", "Lhi1/g$b;", "servicesScreenState", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(g.b.EmptyState emptyState, int i15, p076m2.r rVar, int i16) {
        y(emptyState, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void B(final g.b.Loading loading, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1034327651);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(loading) : rVarH.G(loading) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1034327651, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.ServicesScreenLoading (ServiceListScreen.kt:187)");
            }
            rVar2 = rVarH;
            i50.s.r(loading.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, c.f84794a.c(), rVar2, BaseScaffoldData.f89350g, 196992, 28670);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hi1.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.C(loading, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(g.b.Loading loading, int i15, p076m2.r rVar, int i16) {
        B(loading, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void D(f1.q0 q0Var, List<g.CategoryItem> list) {
        final int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            final g.CategoryItem categoryItem = (g.CategoryItem) obj;
            f1.q0.c(q0Var, null, null, y2.m.b(-1888522629, true, new er.q() { // from class: hi1.i
                @Override // er.q
                public final Object w(Object obj2, Object obj3, Object obj4) {
                    return v.E(i15, categoryItem, (f1.e) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            }), 3, null);
            final int i17 = 0;
            for (Object obj2 : categoryItem.b()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    pq.v.x();
                }
                final n50.k kVar = (n50.k) obj2;
                f1.q0.c(q0Var, null, null, y2.m.b(-569843312, true, new er.q() { // from class: hi1.j
                    @Override // er.q
                    public final Object w(Object obj3, Object obj4, Object obj5) {
                        return v.F(i17, kVar, (f1.e) obj3, (p076m2.r) obj4, ((Integer) obj5).intValue());
                    }
                }), 3, null);
                i17 = i18;
            }
            i15 = i16;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(int i15, g.CategoryItem categoryItem, f1.e eVar, p076m2.r rVar, int i16) {
        if (rVar.r((i16 & 17) != 16, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1888522629, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.categoriesListContent.<anonymous>.<anonymous> (ServiceListScreen.kt:134)");
            }
            if (i15 > 0) {
                rVar.X(-1200996877);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            } else {
                rVar.X(-1205819609);
            }
            rVar.R();
            Label name = categoryItem.getName();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, name, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(int i15, n50.k kVar, f1.e eVar, p076m2.r rVar, int i16) {
        if (rVar.r((i16 & 17) != 16, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-569843312, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.categoriesListContent.<anonymous>.<anonymous>.<anonymous> (ServiceListScreen.kt:145)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarR = t70.i.r(companion, -1);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            if (i15 > 0) {
                rVar.X(-889276544);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            } else {
                rVar.X(-894578660);
            }
            rVar.R();
            n50.h0.v(kVar, null, rVar, 0, 2);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    private static final void G(f1.q0 q0Var, final Label label, List<? extends n50.k> list) {
        if (list.isEmpty()) {
            return;
        }
        f1.q0.c(q0Var, null, null, y2.m.b(655147081, true, new er.q() { // from class: hi1.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return v.H(label, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        for (final n50.k kVar : list) {
            f1.q0.c(q0Var, null, null, y2.m.b(-1008734454, true, new er.q() { // from class: hi1.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return v.I(kVar, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        f1.q0.c(q0Var, null, null, c.f84794a.d(), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(Label label, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(655147081, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.favouriteServicesListContent.<anonymous> (ServiceListScreen.kt:111)");
            }
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(n50.k kVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1008734454, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.favouriteServicesListContent.<anonymous>.<anonymous> (ServiceListScreen.kt:119)");
            }
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            n50.h0.v(kVar, null, rVar, 0, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    public static final void o(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1416901183);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1416901183, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.ServicesScreen (ServiceListScreen.kt:42)");
            }
            f6 f6VarC = m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(gVar.getLifecycleConnector(), rVarH, 0);
            g.b bVarP = p(f6VarC);
            if (bVarP instanceof g.b.EmptyState) {
                rVarH.X(-137395194);
                y((g.b.EmptyState) bVarP, rVarH, 0);
                rVarH.R();
            } else if (bVarP instanceof g.b.ServicesLoaded) {
                rVarH.X(-137392317);
                s((g.b.ServicesLoaded) bVarP, rVarH, 0);
                rVarH.R();
            } else {
                if (!(bVarP instanceof g.b.Loading)) {
                    rVarH.X(-137397751);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-137389757);
                B((g.b.Loading) bVarP, rVarH, 0);
                rVarH.R();
            }
            boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(gVar));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: hi1.h
                    @Override // er.a
                    public final Object a() {
                        return v.q(gVar);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hi1.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.r(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.b p(f6<? extends g.b> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(g gVar) {
        gVar.P();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(g gVar, int i15, p076m2.r rVar, int i16) {
        o(gVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void s(final g.b.ServicesLoaded servicesLoaded, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1762406123);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(servicesLoaded) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1762406123, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.ServicesScreenContent (ServiceListScreen.kt:60)");
            }
            rVar2 = rVarH;
            i50.s.r(servicesLoaded.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(129883736, true, new er.q() { // from class: hi1.q
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return v.t(servicesLoaded, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196992, 28670);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hi1.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.x(servicesLoaded, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(final g.b.ServicesLoaded servicesLoaded, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(129883736, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.ServicesScreenContent.<anonymous> (ServiceListScreen.kt:65)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(a3.l(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 10, null);
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            boolean zG = rVar.G(servicesLoaded);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: hi1.s
                    @Override // er.l
                    public final Object b(Object obj) {
                        return v.u(servicesLoaded, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarR, null, d3VarI, false, null, null, null, false, null, (er.l) objE, rVar, 0, 506);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(final g.b.ServicesLoaded servicesLoaded, f1.q0 q0Var) {
        f1.q0.c(q0Var, null, null, y2.m.b(990585517, true, new er.q() { // from class: hi1.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return v.v(servicesLoaded, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        if (!servicesLoaded.f().isEmpty()) {
            f1.q0.c(q0Var, null, null, y2.m.b(-14198904, true, new er.q() { // from class: hi1.u
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return v.w(servicesLoaded, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        G(q0Var, servicesLoaded.getFavouriteServicesTitle(), servicesLoaded.d());
        D(q0Var, servicesLoaded.a());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(g.b.ServicesLoaded servicesLoaded, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(990585517, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.ServicesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServiceListScreen.kt:80)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.j(), rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarH);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            j30.f.e(null, servicesLoaded.getEditButtonData(), false, rVar, ButtonTextData.f99099f << 3, 5);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
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
    public static final oq.i0 w(g.b.ServicesLoaded servicesLoaded, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-14198904, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.ServicesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServiceListScreen.kt:90)");
            }
            m50.c.b(servicesLoaded.f(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(g.b.ServicesLoaded servicesLoaded, int i15, p076m2.r rVar, int i16) {
        s(servicesLoaded, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void y(final g.b.EmptyState emptyState, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-713252859);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(emptyState) : rVarH.G(emptyState) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-713252859, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.ServicesScreenEmptyState (ServiceListScreen.kt:162)");
            }
            rVar2 = rVarH;
            i50.s.r(emptyState.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1320104200, true, new er.q() { // from class: hi1.o
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return v.z(emptyState, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196992, 28670);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hi1.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.A(emptyState, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(g.b.EmptyState emptyState, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1320104200, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.ServicesScreenEmptyState.<anonymous> (ServiceListScreen.kt:167)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarN = a3.n(a3.l(w0.i.d(mVarF, aVar.a(rVar, i16).getBase().a(), null, 2, null), d3Var), aVar.b(rVar, i16).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k40.d.c(a3.n(companion, aVar.b(rVar, i16).getSpacing300()), emptyState.getContent(), rVar, EmptyStateData.f108236d << 3, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }
}
