package ua2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import k40.EmptyStateData;
import mx.Label;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lua2/m;", "viewModel", "Loq/i0;", "l", "(Lua2/m;Lm2/r;I)V", "Lua2/m$a$a;", "state", "i", "(Lua2/m$a$a;Lm2/r;I)V", "Lua2/m$a$b;", "p", "(Lua2/m$a$b;Lm2/r;I)V", "Lua2/m$a;", "viewModelState", "history_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void i(final m.a.Initial initial, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1551907774);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initial) : rVarH.G(initial) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1551907774, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.loggingHistory.LoggingToAppHistoryEmptyScreen (LoggingToAppHistoryScreen.kt:46)");
            }
            rVar2 = rVarH;
            i50.s.r(initial.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-326592783, true, new er.q() { // from class: ua2.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.j(initial, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ua2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.k(initial, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(m.a.Initial initial, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-326592783, i15, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.loggingHistory.LoggingToAppHistoryEmptyScreen.<anonymous> (LoggingToAppHistoryScreen.kt:51)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null);
            w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.k(), rVar, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            k40.d.c(null, initial.getData(), rVar, EmptyStateData.f108236d << 3, 1);
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
    public static final i0 k(m.a.Initial initial, int i15, p076m2.r rVar, int i16) {
        i(initial, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final m mVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1832378961);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(mVar) : rVarH.G(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1832378961, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.loggingHistory.LoggingToAppHistoryScreen (LoggingToAppHistoryScreen.kt:32)");
            }
            m.a aVarM = m(m7.b.c(mVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarM instanceof m.a.Initialized) {
                rVarH.X(20416446);
                p((m.a.Initialized) aVarM, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarM instanceof m.a.Initial)) {
                    rVarH.X(20414266);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(20419036);
                i((m.a.Initial) aVarM, rVarH, 0);
                rVarH.R();
            }
            boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(mVar));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ua2.g
                    @Override // er.a
                    public final Object a() {
                        return i.n(mVar);
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
            d5VarM.a(new er.p() { // from class: ua2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.o(mVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final m.a m(f6<? extends m.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(m mVar) {
        mVar.d();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(m mVar, int i15, p076m2.r rVar, int i16) {
        l(mVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final m.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1159332766);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1159332766, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.loggingHistory.LoggingToAppHistoryScreenContent (LoggingToAppHistoryScreen.kt:67)");
            }
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, y0VarC, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-2049186475, true, new er.q() { // from class: ua2.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.q(y0VarC, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32702);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ua2.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.t(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(y0 y0Var, final m.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2049186475, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.loggingHistory.LoggingToAppHistoryScreenContent.<anonymous> (LoggingToAppHistoryScreen.kt:73)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(a3.l(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
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
            d1.i0 i0Var = d1.i0.f39176a;
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing100(), 5, null);
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ua2.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.r(initialized, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(null, y0Var, d3VarI, false, null, null, null, false, null, (er.l) objE, rVar, 0, 505);
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
    public static final i0 r(final m.a.Initialized initialized, f1.q0 q0Var) {
        f1.q0.e(q0Var, initialized.a().size(), null, null, y2.m.b(-733594815, true, new er.r() { // from class: ua2.f
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i.s(initialized, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(m.a.Initialized initialized, f1.e eVar, int i15, p076m2.r rVar, int i16) {
        int i17;
        if ((i16 & 48) == 0) {
            i17 = i16 | (rVar.c(i15) ? 32 : 16);
        } else {
            i17 = i16;
        }
        if (rVar.r((i17 & 145) != 144, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-733594815, i17, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.loggingHistory.LoggingToAppHistoryScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoggingToAppHistoryScreen.kt:88)");
            }
            wa2.a aVar = initialized.a().get(i15);
            if (aVar instanceof wa2.a.DateDivider) {
                rVar.X(305618783);
                if (i15 != 0) {
                    rVar.X(702596170);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
                } else {
                    rVar.X(302294746);
                }
                rVar.R();
                Label date = ((wa2.a.DateDivider) aVar).getDate();
                k70.a aVar2 = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                j70.h.g(null, null, date, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar2.b(rVar, i18).getSpacing200()), rVar, 0);
                rVar.R();
            } else {
                if (!(aVar instanceof wa2.a.LoggingToAppEvent)) {
                    rVar.X(702592533);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(305994813);
                h0.v(((wa2.a.LoggingToAppEvent) aVar).getSingleCardData(), null, rVar, 0, 2);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(m.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        p(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
