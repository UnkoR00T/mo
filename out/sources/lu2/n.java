package lu2;

import b30.AccordionData;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.i0;
import d1.r3;
import i50.BaseScaffoldData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Llu2/i;", "viewModel", "Loq/i0;", "g", "(Llu2/i;Lm2/r;I)V", "Llu2/i$a$b;", "data", "j", "(Llu2/i$a$b;Lm2/r;I)V", "Llu2/i$b;", "e", "(Llu2/i$b;Lm2/r;I)V", "Llu2/i$a;", "peselrestrictionverification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static final void e(final i.IconPageDataModel iconPageDataModel, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1273966942);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(iconPageDataModel) : rVarH.G(iconPageDataModel) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1273966942, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.result.PeselRestrictionVerificationResultInnerContent (PeselRestrictionVerificationResultScreen.kt:66)");
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
            i0 i0Var = i0.f39176a;
            m30.i.d(iconPageDataModel.getDetailItems(), null, null, rVarH, 0, 6);
            AccordionData timelineAccordionData = iconPageDataModel.getTimelineAccordionData();
            if (timelineAccordionData == null) {
                rVarH.X(-23162731);
            } else {
                rVarH.X(-23162730);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
                b30.j.g(timelineAccordionData, rVarH, AccordionData.f16343b);
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lu2.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.f(iconPageDataModel, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(i.IconPageDataModel iconPageDataModel, int i15, p076m2.r rVar, int i16) {
        e(iconPageDataModel, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void g(final i iVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-247310708);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(iVar) : rVarH.G(iVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-247310708, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.result.PeselRestrictionVerificationResultScreen (PeselRestrictionVerificationResultScreen.kt:27)");
            }
            f6 f6VarC = m7.b.c(iVar.getState(), null, null, null, rVarH, 0, 7);
            if (h(f6VarC) instanceof i.a.Initialized) {
                rVarH.X(-1442380746);
                j((i.a.Initialized) h(f6VarC), rVarH, 0);
                rVarH.R();
            } else {
                rVarH.X(-1442376048);
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
            d5VarM.a(new er.p() { // from class: lu2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.i(iVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final i.a h(f6<? extends i.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(i iVar, int i15, p076m2.r rVar, int i16) {
        g(iVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void j(final i.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-39739307);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-39739307, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.result.PeselRestrictionVerificationResultScreenContent (PeselRestrictionVerificationResultScreen.kt:40)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(802269576, true, new er.q() { // from class: lu2.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.k(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: lu2.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.l(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(i.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(802269576, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.result.PeselRestrictionVerificationResultScreenContent.<anonymous> (PeselRestrictionVerificationResultScreen.kt:42)");
            }
            f3.m mVarL = a3.l(w0.i.d(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a(), null, 2, null), d3Var);
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
            i0 i0Var = i0.f39176a;
            IconPageData<i.IconPageDataModel, IconPageBottomContentData> iconPageDataA = initialized.a();
            c cVar = c.f120482a;
            q40.i.b(iconPageDataA, cVar.d(), cVar.c(), rVar, IconPageData.f164667h | AccordionData.f16343b | IconPageBottomContentData.f164663d | 432, 0);
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
    public static final oq.i0 l(i.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        j(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
