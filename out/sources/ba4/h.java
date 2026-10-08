package ba4;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lba4/k;", "viewModel", "Loq/i0;", "r", "(Lba4/k;Lm2/r;I)V", "Lba4/k$a;", "data", "h", "(Lba4/k$a;Lm2/r;I)V", "p", "(Lm2/r;I)V", "Lba4/k$a$b;", "j", "(Lba4/k$a$b;Lm2/r;I)V", "Lba4/k$a$a;", "m", "(Lba4/k$a$a;Lm2/r;I)V", "schoolgrades_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void h(final k.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(101884579);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(101884579, i16, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.gradedetails.GradeDetailsContent (GradeDetailsScreen.kt:33)");
            }
            if (aVar instanceof k.a.d) {
                rVarH.X(-873162920);
                p(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof k.a.DisplayingGradeDetails) {
                rVarH.X(-873160186);
                j((k.a.DisplayingGradeDetails) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof k.a.DisplayingFullGradeText) {
                rVarH.X(-873156988);
                m((k.a.DisplayingFullGradeText) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof k.a.ErrorLoadingGradeDetails)) {
                    rVarH.X(-873164925);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-873153397);
                ((k.a.ErrorLoadingGradeDetails) aVar).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: ba4.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.i(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(k.a aVar, int i15, p076m2.r rVar, int i16) {
        h(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void j(final k.a.DisplayingGradeDetails displayingGradeDetails, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-552803909);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(displayingGradeDetails) : rVarH.G(displayingGradeDetails) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-552803909, i16, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.gradedetails.GradeDetailsDisplaying (GradeDetailsScreen.kt:48)");
            }
            i50.s.r(displayingGradeDetails.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1863662830, true, new er.q() { // from class: ba4.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.k(displayingGradeDetails, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, displayingGradeDetails.c(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ba4.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.l(displayingGradeDetails, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(k.a.DisplayingGradeDetails displayingGradeDetails, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1863662830, i16, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.gradedetails.GradeDetailsDisplaying.<anonymous> (GradeDetailsScreen.kt:50)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar2, 0, 1), rVar2, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            m30.i.d(displayingGradeDetails.getFirstCardData(), null, null, rVar2, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            m30.i.d(displayingGradeDetails.getDetailsCardData(), null, null, rVar2, 0, 6);
            CardListData previousGradeCardData = displayingGradeDetails.getPreviousGradeCardData();
            if (previousGradeCardData == null) {
                rVar2.X(270819850);
                rVar2.R();
            } else {
                rVar2.X(270819851);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                Label previousGradeSectionTitle = displayingGradeDetails.getPreviousGradeSectionTitle();
                if (previousGradeSectionTitle == null) {
                    rVar2.X(643564376);
                } else {
                    rVar2.X(643564377);
                    j70.h.g(null, null, previousGradeSectionTitle, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                    rVar2 = rVar;
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
                }
                rVar2.R();
                m30.i.d(previousGradeCardData, null, null, rVar2, 0, 6);
                rVar.R();
            }
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
    public static final i0 l(k.a.DisplayingGradeDetails displayingGradeDetails, int i15, p076m2.r rVar, int i16) {
        j(displayingGradeDetails, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void m(final k.a.DisplayingFullGradeText displayingFullGradeText, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1589799085);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(displayingFullGradeText) : rVarH.G(displayingFullGradeText) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1589799085, i16, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.gradedetails.GradeDetailsFullText (GradeDetailsScreen.kt:78)");
            }
            i50.s.r(displayingFullGradeText.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-403469888, true, new er.q() { // from class: ba4.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.n(displayingFullGradeText, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, displayingFullGradeText.b(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ba4.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.o(displayingFullGradeText, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(k.a.DisplayingFullGradeText displayingFullGradeText, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-403469888, i16, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.gradedetails.GradeDetailsFullText.<anonymous> (GradeDetailsScreen.kt:80)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            j70.h.g(null, null, displayingFullGradeText.getGradeLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
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
    public static final i0 o(k.a.DisplayingFullGradeText displayingFullGradeText, int i15, p076m2.r rVar, int i16) {
        m(displayingFullGradeText, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void p(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-1630565968);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1630565968, i15, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.gradedetails.GradeDetailsLoading (GradeDetailsScreen.kt:43)");
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
            d5VarM.a(new er.p() { // from class: ba4.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.q(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(int i15, p076m2.r rVar, int i16) {
        p(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void r(final k kVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1424966900);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1424966900, i16, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.gradedetails.GradeDetailsScreen (GradeDetailsScreen.kt:27)");
            }
            h(s(m7.b.c(kVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ba4.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.t(kVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final k.a s(f6<? extends k.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(k kVar, int i15, p076m2.r rVar, int i16) {
        r(kVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
