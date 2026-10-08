package i43;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import mx.Label;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Li43/c;", "viewModel", "Loq/i0;", "k", "(Li43/c;Lm2/r;I)V", "Li43/c$a;", "data", "f", "(Li43/c$a;Lm2/r;I)V", "Li43/c$a$a;", "h", "(Li43/c$a$a;Lm2/r;I)V", "Lmx/a;", "title", "Ln50/k;", "card", "n", "(Lmx/a;Ln50/k;Lm2/r;I)V", "schooldashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    private static final void f(final c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2019216019);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2019216019, i16, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.screens.childdashboard.SchoolChildDashboardContent (SchoolChildDashboardScreen.kt:38)");
            }
            if (aVar instanceof c.a.C2109c) {
                rVarH.X(-858618025);
                rVarH.R();
            } else if (aVar instanceof c.a.DisplayingChildDashboard) {
                rVarH.X(-858615316);
                h((c.a.DisplayingChildDashboard) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.ErrorChildDashboard)) {
                    rVarH.X(-858620510);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-858610501);
                ((c.a.ErrorChildDashboard) aVar).getErrorVMSAdapter().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: i43.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.g(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c.a aVar, int i15, p076m2.r rVar, int i16) {
        f(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void h(final c.a.DisplayingChildDashboard displayingChildDashboard, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1954147448);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(displayingChildDashboard) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1954147448, i16, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.screens.childdashboard.SchoolChildDashboardDisplayingChildDashboard (SchoolChildDashboardScreen.kt:54)");
            }
            rVar2 = rVarH;
            i50.s.r(displayingChildDashboard.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1337186475, true, new er.q() { // from class: i43.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.i(displayingChildDashboard, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: i43.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(displayingChildDashboard, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c.a.DisplayingChildDashboard displayingChildDashboard, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1337186475, i16, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.screens.childdashboard.SchoolChildDashboardDisplayingChildDashboard.<anonymous> (SchoolChildDashboardScreen.kt:56)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            Label labelB = mx.b.b(displayingChildDashboard.getChild().getName(), "SchoolChildDashboardChildName");
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(mVarH, null, labelB, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).k(), null, null, false, false, null, rVar, 6, 0, 0, 33030138);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, mx.b.b(displayingChildDashboard.getChild().getSchoolClass(), "SchoolChildDashboardChildClass"), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 6, 0, 0, 33030138);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            h70.g.f(displayingChildDashboard.getShortcutsLayoutData(), rVar, ShortcutsLayoutData.f81324c);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            n50.k latestGradeCard = displayingChildDashboard.getLatestGradeCard();
            if (latestGradeCard == null) {
                rVar.X(647381288);
            } else {
                rVar.X(647381289);
                n(displayingChildDashboard.getLatestGradeTitle(), latestGradeCard, rVar, 0);
            }
            rVar.R();
            n50.k latestAbsenceCard = displayingChildDashboard.getLatestAbsenceCard();
            if (latestAbsenceCard == null) {
                rVar.X(647543046);
            } else {
                rVar.X(647543047);
                n(displayingChildDashboard.getLatestAbsenceTitle(), latestAbsenceCard, rVar, 0);
            }
            rVar.R();
            n50.k nextLessonCard = displayingChildDashboard.getNextLessonCard();
            if (nextLessonCard == null) {
                rVar.X(647703657);
            } else {
                rVar.X(647703658);
                n(displayingChildDashboard.getNextLessonTitle(), nextLessonCard, rVar, 0);
            }
            rVar.R();
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
    public static final i0 j(c.a.DisplayingChildDashboard displayingChildDashboard, int i15, p076m2.r rVar, int i16) {
        h(displayingChildDashboard, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(143885156);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(143885156, i16, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.screens.childdashboard.SchoolChildDashboardScreen (SchoolChildDashboardScreen.kt:30)");
            }
            f(l(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i43.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.m(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a l(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c cVar, int i15, p076m2.r rVar, int i16) {
        k(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void n(final Label label, n50.k kVar, p076m2.r rVar, final int i15) {
        int i16;
        final n50.k kVar2;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(254732431);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(kVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(254732431, i16, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.screens.childdashboard.SchoolChildDashboardSection (SchoolChildDashboardScreen.kt:103)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).p(), null, null, false, false, null, rVarH, (i16 << 6) & 896, 0, 0, 33030139);
            rVar2 = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            int i18 = (i16 >> 3) & 14;
            kVar2 = kVar;
            h0.v(kVar2, null, rVar2, i18, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            kVar2 = kVar;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i43.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.o(label, kVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(Label label, n50.k kVar, int i15, p076m2.r rVar, int i16) {
        n(label, kVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
