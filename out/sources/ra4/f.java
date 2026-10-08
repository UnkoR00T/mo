package ra4;

import d1.a3;
import d1.d3;
import d1.e0;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lra4/i;", "viewModel", "Loq/i0;", "m", "(Lra4/i;Lm2/r;I)V", "Lra4/i$a;", "data", "f", "(Lra4/i$a;Lm2/r;I)V", "k", "(Lm2/r;I)V", "Lra4/i$a$a;", "h", "(Lra4/i$a$a;Lm2/r;I)V", "schooltimetable_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void f(final i.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1090621001);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1090621001, i16, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.lessondetails.LessonDetailsContent (LessonDetailsScreen.kt:33)");
            }
            if (aVar instanceof i.a.c) {
                rVarH.X(114766335);
                k(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof i.a.DisplayingLessonDetails) {
                rVarH.X(114769165);
                h((i.a.DisplayingLessonDetails) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof i.a.ErrorLoadingLessonDetails)) {
                    rVarH.X(114764175);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(114772913);
                ((i.a.ErrorLoadingLessonDetails) aVar).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: ra4.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.g(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(i.a aVar, int i15, p076m2.r rVar, int i16) {
        f(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void h(final i.a.DisplayingLessonDetails displayingLessonDetails, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1517514126);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(displayingLessonDetails) : rVarH.G(displayingLessonDetails) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1517514126, i16, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.lessondetails.LessonDetailsDisplaying (LessonDetailsScreen.kt:47)");
            }
            i50.s.r(displayingLessonDetails.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(961791967, true, new er.q() { // from class: ra4.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.i(displayingLessonDetails, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, displayingLessonDetails.c(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ra4.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.j(displayingLessonDetails, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(i.a.DisplayingLessonDetails displayingLessonDetails, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(961791967, i16, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.lessondetails.LessonDetailsDisplaying.<anonymous> (LessonDetailsScreen.kt:49)");
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
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, displayingLessonDetails.getTitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).m(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, displayingLessonDetails.getNumberLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(displayingLessonDetails.getDetailsCardData(), null, null, rVar, 0, 6);
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
    public static final i0 j(i.a.DisplayingLessonDetails displayingLessonDetails, int i15, p076m2.r rVar, int i16) {
        h(displayingLessonDetails, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void k(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-1367551780);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1367551780, i15, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.lessondetails.LessonDetailsLoading (LessonDetailsScreen.kt:42)");
            }
            c60.b.b(rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ra4.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.l(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(int i15, p076m2.r rVar, int i16) {
        k(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final i iVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(476228888);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(iVar) : rVarH.G(iVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(476228888, i16, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.lessondetails.LessonDetailsScreen (LessonDetailsScreen.kt:27)");
            }
            f(n(m7.b.c(iVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ra4.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.o(iVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final i.a n(f6<? extends i.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(i iVar, int i15, p076m2.r rVar, int i16) {
        m(iVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
