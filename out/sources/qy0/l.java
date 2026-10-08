package qy0;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0011\u001a\u00020\u0002*\u00020\f2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Lqy0/c;", "viewModel", "Loq/i0;", "q", "(Lqy0/c;Lm2/r;I)V", "Lqy0/c$a$a;", "data", "i", "(Lqy0/c$a$a;Lm2/r;I)V", "Lqy0/c$a$c;", "m", "(Lqy0/c$a$c;Lm2/r;I)V", "Lf1/q0;", "", "index", "Ln50/k;", "singleCardData", "t", "(Lf1/q0;Lqy0/c$a$c;ILn50/k;)V", "Lqy0/c$a;", "state", "airquality_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    private static final void i(final c.a.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(275240724);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(275240724, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.dashboard.DashboardEmptyContent (DashboardScreen.kt:44)");
            }
            i50.s.r(empty.getBaseScaffoldData(), y2.m.d(1445088073, true, new er.p() { // from class: qy0.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.j(empty, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1898751679, true, new er.q() { // from class: qy0.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.k(empty, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVarH = rVarH;
            q0.g(false, empty.d(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qy0.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.l(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.a.Empty empty, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1445088073, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.dashboard.DashboardEmptyContent.<anonymous> (DashboardScreen.kt:57)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarR = a3.r(companion, aVar.b(rVar, i16).getSpacing200(), 0.0f, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200(), 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            h30.q.p(empty.getButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 k(c.a.Empty empty, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1898751679, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.dashboard.DashboardEmptyContent.<anonymous> (DashboardScreen.kt:49)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            q40.i.b(empty.c(), null, null, rVar, IconPageData.f164667h, 6);
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
    public static final i0 l(c.a.Empty empty, int i15, p076m2.r rVar, int i16) {
        i(empty, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void m(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1434927180);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1434927180, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.dashboard.DashboardInitializedContent (DashboardScreen.kt:77)");
            }
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1454990945, true, new er.q() { // from class: qy0.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.n(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, initialized.d(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qy0.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.p(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(final c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1454990945, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.dashboard.DashboardInitializedContent.<anonymous> (DashboardScreen.kt:82)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200(), 2, null);
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarB = h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null);
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: qy0.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.o(initialized, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarB, null, d3VarI, false, null, null, null, false, null, (er.l) objE, rVar, 0, 506);
            f3.m mVarR2 = a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 0.0f, 13, null);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.x xVar = d1.x.f39368a;
            h30.q.p(initialized.getButtonData(), false, null, rVar, 0, 6);
            rVar.x();
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
    public static final i0 o(c.a.Initialized initialized, f1.q0 q0Var) {
        int i15 = 0;
        for (Object obj : initialized.c()) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            t(q0Var, initialized, i15, (n50.k) obj);
            i15 = i16;
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        m(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void q(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(205244363);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(205244363, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.dashboard.DashboardScreen (DashboardScreen.kt:30)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(cVar.getLifecycleConnector(), rVarH, 0);
            c.a aVarR = r(f6VarC);
            if (fr.t.c(aVarR, c.a.b.f169368a)) {
                rVarH.X(-328655313);
                rVarH.R();
            } else if (aVarR instanceof c.a.Empty) {
                rVarH.X(-328653811);
                i((c.a.Empty) aVarR, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarR instanceof c.a.Initialized)) {
                    rVarH.X(-328657191);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-328651181);
                m((c.a.Initialized) aVarR, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: qy0.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.s(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a r(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(c cVar, int i15, p076m2.r rVar, int i16) {
        q(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void t(f1.q0 q0Var, c.a.Initialized initialized, int i15, final n50.k kVar) {
        f1.q0.c(q0Var, null, null, y2.m.b(695816561, true, new er.q() { // from class: qy0.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l.u(kVar, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(n50.k kVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(695816561, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.dashboard.favoritePointCard.<anonymous> (DashboardScreen.kt:126)");
            }
            n50.h0.v(kVar, null, rVar, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }
}
