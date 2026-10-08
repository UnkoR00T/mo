package sr1;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import i50.BaseScaffoldData;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lsr1/c;", "viewModel", "Loq/i0;", "t", "(Lsr1/c;Lm2/r;I)V", "Lsr1/c$a;", "data", "j", "(Lsr1/c$a;Lm2/r;I)V", "Lsr1/c$a$b;", "l", "(Lsr1/c$a$b;Lm2/r;I)V", "state", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    private static final void j(final c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1659155475);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1659155475, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.pulltorefresh.DeveloperPullToRefreshContent (DeveloperPullToRefreshScreen.kt:41)");
            }
            if (aVar instanceof c.a.C4728a) {
                rVarH.X(1015549604);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.Initialized)) {
                    rVarH.X(1015547596);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1015552058);
                l((c.a.Initialized) aVar, rVarH, i16 & 14);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sr1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.k(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(c.a aVar, int i15, p076m2.r rVar, int i16) {
        j(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1125090684);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1125090684, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.pulltorefresh.DeveloperPullToRefreshInitialized (DeveloperPullToRefreshScreen.kt:50)");
            }
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2138863977, true, new er.q() { // from class: sr1.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.m(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean zG = rVarH.G(initialized);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sr1.g
                    @Override // er.a
                    public final Object a() {
                        return m.r(initialized);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sr1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.s(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = (rVar.W(d3Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2138863977, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.pulltorefresh.DeveloperPullToRefreshInitialized.<anonymous> (DeveloperPullToRefreshScreen.kt:54)");
            }
            k2.t.o(initialized.getIsRefreshing(), initialized.e(), a3.l(f3.m.INSTANCE, d3Var), null, null, null, false, 0.0f, y2.m.d(509823173, true, new er.q() { // from class: sr1.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.n(initialized, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 100663296, 248);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(final c.a.Initialized initialized, d1.w wVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(509823173, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.pulltorefresh.DeveloperPullToRefreshInitialized.<anonymous>.<anonymous> (DeveloperPullToRefreshScreen.kt:59)");
            }
            f3.m mVarP = a3.p(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200(), 0.0f, 2, null);
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: sr1.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.o(initialized, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarP, null, null, false, null, null, null, false, null, (er.l) objE, rVar, 0, 510);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final c.a.Initialized initialized, f1.q0 q0Var) {
        f1.q0.c(q0Var, null, null, y2.m.b(223318736, true, new er.q() { // from class: sr1.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m.p(initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        f1.q0.e(q0Var, initialized.b().size(), null, null, y2.m.b(-560310297, true, new er.r() { // from class: sr1.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m.q(initialized, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(c.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(223318736, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.pulltorefresh.DeveloperPullToRefreshInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeveloperPullToRefreshScreen.kt:65)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            w0 w0VarB = m3.b(d1.i.f39152a.e(), f3.c.INSTANCE.l(), rVar, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            j70.h.g(null, null, initialized.getLastRefreshTimeLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(c.a.Initialized initialized, f1.e eVar, int i15, p076m2.r rVar, int i16) {
        float spacing50;
        if ((i16 & 48) == 0) {
            i16 |= rVar.c(i15) ? 32 : 16;
        }
        if (rVar.r((i16 & 145) != 144, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-560310297, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.pulltorefresh.DeveloperPullToRefreshInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeveloperPullToRefreshScreen.kt:77)");
            }
            h0.v(initialized.b().get(i15), null, rVar, 0, 2);
            f3.m.Companion companion = f3.m.INSTANCE;
            boolean z15 = i15 == initialized.b().size() - 1;
            if (z15) {
                rVar.X(-1587274255);
                spacing50 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200();
                rVar.R();
            } else {
                if (z15) {
                    rVar.X(-1587277191);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-1587272464);
                spacing50 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing50();
                rVar.R();
            }
            r3.a(androidx.compose.foundation.layout.d.i(companion, spacing50), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(c.a.Initialized initialized) {
        initialized.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        l(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void t(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-457641694);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-457641694, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.pulltorefresh.DeveloperPullToRefreshScreen (DeveloperPullToRefreshScreen.kt:30)");
            }
            j(u(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sr1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.v(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a u(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(c cVar, int i15, p076m2.r rVar, int i16) {
        t(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
