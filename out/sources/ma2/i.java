package ma2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.i0;
import d1.r3;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import k40.EmptyStateData;
import mx.Label;
import n50.h0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0012\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, d2 = {"Lma2/l;", "viewModel", "Loq/i0;", "n", "(Lma2/l;Lm2/r;I)V", "Lma2/l$a$a;", "state", "Lc5/h;", "paddingTop", "i", "(Lma2/l$a$a;FLm2/r;I)V", "Lka/a;", "Loa2/a;", "activityLogs", "k", "(Lma2/l$a$a;Lka/a;Lm2/r;I)V", "Lf1/y0;", "lazyColumnState", "r", "(Lka/a;Lf1/y0;Lm2/r;I)V", "Lma2/l$a;", "screenData", "history_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void i(final l.a.Initialized initialized, final float f15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(702109530);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.b(f15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(702109530, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.activityLog.ActivityLogHistoryEmptyScreen (ActivityLogScreen.kt:63)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(w0.i.d(a3.r(f3.m.INSTANCE, 0.0f, f15, 0.0f, 0.0f, 13, null), k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a(), null, 2, null), 0.0f, 1, null);
            w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.k(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarF);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            i0 i0Var = i0.f39176a;
            k40.d.c(null, initialized.getData(), rVarH, EmptyStateData.f108236d << 3, 1);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ma2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(initialized, f15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(l.a.Initialized initialized, float f15, int i15, p076m2.r rVar, int i16) {
        i(initialized, f15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void k(final l.a.Initialized initialized, final ka.a<oa2.a> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(447843002);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(447843002, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.activityLog.ActivityLogHistoryScreenContent (ActivityLogScreen.kt:81)");
            }
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            if (fr.t.c(aVar.i().getRefresh(), ja.w.Loading.f101205b)) {
                rVarH.X(1522694868);
                x70.f.g(x70.a.b.f217282c, rVarH, x70.a.b.f217283d);
                rVarH.R();
                rVar2 = rVarH;
            } else {
                rVarH.X(1522772058);
                rVar2 = rVarH;
                i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, y0VarC, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-887812087, true, new er.q() { // from class: ma2.a
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return i.l(aVar, initialized, y0VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32702);
                rVar2.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ma2.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.m(initialized, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(ka.a aVar, l.a.Initialized initialized, y0 y0Var, d3 d3Var, p076m2.r rVar, int i15) {
        d3 d3Var2;
        int i16;
        if ((i15 & 6) == 0) {
            d3Var2 = d3Var;
            i16 = i15 | (rVar.W(d3Var2) ? 4 : 2);
        } else {
            d3Var2 = d3Var;
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-887812087, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.activityLog.ActivityLogHistoryScreenContent.<anonymous> (ActivityLogScreen.kt:90)");
            }
            f3.m mVarP = a3.p(androidx.compose.foundation.layout.d.f(a3.r(f3.m.INSTANCE, 0.0f, d3Var2.getTop(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            i0 i0Var = i0.f39176a;
            if (aVar.g() == 0) {
                rVar.X(-472003179);
                i(initialized, d3Var2.getTop(), rVar, BaseScaffoldData.f89350g | EmptyStateData.f108236d);
                rVar.R();
            } else {
                rVar.X(-471845048);
                r(aVar, y0Var, rVar, ka.a.f109310f);
                rVar.R();
            }
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
    public static final oq.i0 m(l.a.Initialized initialized, ka.a aVar, int i15, p076m2.r rVar, int i16) {
        k(initialized, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void n(final l lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-367776789);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(lVar) : rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-367776789, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.activityLog.ActivityLogScreen (ActivityLogScreen.kt:43)");
            }
            f6 f6VarC = m7.b.c(lVar.getState(), null, null, null, rVarH, 0, 7);
            ka.a aVarB = ka.b.b(lVar.C8(), null, rVarH, 0, 1);
            l.a aVarO = o(f6VarC);
            if (!(aVarO instanceof l.a.Initialized)) {
                rVarH.X(-1246169700);
                rVarH.R();
                throw new oq.p();
            }
            rVarH.X(-1246167410);
            k((l.a.Initialized) aVarO, aVarB, rVarH, ka.a.f109310f << 3);
            rVarH.R();
            boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(lVar));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ma2.g
                    @Override // er.a
                    public final Object a() {
                        return i.p(lVar);
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
            d5VarM.a(new er.p() { // from class: ma2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.q(lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final l.a o(f6<? extends l.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(l lVar) {
        lVar.d();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(l lVar, int i15, p076m2.r rVar, int i16) {
        n(lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void r(final ka.a<oa2.a> aVar, final y0 y0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1762958339);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(y0Var) ? 32 : 16;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1762958339, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.activityLog.ActivityLogs (ActivityLogScreen.kt:116)");
            }
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d3 d3VarI = a3.i(0.0f, aVar2.b(rVarH, i17).getSpacing100(), 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 5, null);
            if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(aVar))) {
                z15 = false;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ma2.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.s(aVar, (f1.q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(null, y0Var, d3VarI, false, null, null, null, false, null, (er.l) objE, rVarH, i16 & 112, 505);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ma2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.u(aVar, y0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(final ka.a aVar, f1.q0 q0Var) {
        f1.q0.e(q0Var, aVar.g(), null, null, y2.m.b(1920336033, true, new er.r() { // from class: ma2.f
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i.t(aVar, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        if (fr.t.c(aVar.i().getAppend(), ja.w.Loading.f101205b)) {
            f1.q0.c(q0Var, null, null, w.f125178a.b(), 3, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(ka.a aVar, f1.e eVar, int i15, p076m2.r rVar, int i16) {
        int i17;
        p076m2.r rVar2 = rVar;
        if ((i16 & 48) == 0) {
            i17 = i16 | (rVar2.c(i15) ? 32 : 16);
        } else {
            i17 = i16;
        }
        if (rVar2.r((i17 & 145) != 144, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1920336033, i17, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.activityLog.ActivityLogs.<anonymous>.<anonymous>.<anonymous> (ActivityLogScreen.kt:125)");
            }
            oa2.a aVar2 = (oa2.a) aVar.f(i15);
            if (aVar2 == null) {
                rVar2.X(-233563879);
            } else {
                rVar2.X(-233563878);
                if (aVar2 instanceof oa2.a.DateDivider) {
                    rVar2.X(1645565166);
                    if (i15 != 0) {
                        rVar2.X(884367429);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
                    } else {
                        rVar2.X(1641179007);
                    }
                    rVar2.R();
                    Label date = ((oa2.a.DateDivider) aVar2).getDate();
                    k70.a aVar3 = k70.a.f108864a;
                    int i18 = k70.a.f108865b;
                    j70.h.g(null, null, date, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i18).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                    rVar2 = rVar;
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar3.b(rVar2, i18).getSpacing200()), rVar2, 0);
                    rVar2.R();
                } else {
                    if (!(aVar2 instanceof oa2.a.ActivityEvent)) {
                        rVar2.X(884364313);
                        rVar2.R();
                        throw new oq.p();
                    }
                    rVar2.X(1645950899);
                    h0.v(((oa2.a.ActivityEvent) aVar2).getSingleCardData(), null, rVar2, 0, 2);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing100()), rVar2, 0);
                    rVar2.R();
                }
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(ka.a aVar, y0 y0Var, int i15, p076m2.r rVar, int i16) {
        r(aVar, y0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
