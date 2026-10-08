package ms3;

import d1.e0;
import d1.r3;
import java.util.Iterator;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lms3/e;", "viewModel", "Loq/i0;", "h", "(Lms3/e;Lm2/r;I)V", "Lms3/e$a;", "screenData", "d", "(Lms3/e$a;Lm2/r;I)V", "Lms3/e$a$a;", "f", "(Lms3/e$a$a;Lm2/r;I)V", "zusvisit_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void d(final e.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-350137280);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-350137280, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosetopic.ChooseTopicContent (ChooseTopicScreen.kt:35)");
            }
            if (aVar instanceof e.a.b) {
                rVarH.X(1535985504);
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.Displayed)) {
                    rVarH.X(-1474474579);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1474471140);
                f((e.a.Displayed) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: ms3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.e(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(e.a aVar, int i15, p076m2.r rVar, int i16) {
        d(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void f(final e.a.Displayed displayed, p076m2.r rVar, final int i15) {
        int i16;
        int i17;
        Object obj;
        p076m2.r rVarH = rVar.h(-341839545);
        char c15 = 2;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(displayed) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-341839545, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosetopic.ChooseTopicDisplayedScreen (ChooseTopicScreen.kt:45)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarN = t70.s.n(t70.i.S(w0.i.d(mVarF, aVar.a(rVarH, i18).getBase().a(), null, 2, null), null, rVarH, 0, 1), rVarH, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
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
            os3.a basicTopicsGroup = displayed.getBasicTopicsGroup();
            if (basicTopicsGroup == null) {
                rVarH.X(-1030146789);
                rVarH.R();
                obj = null;
                i17 = 0;
            } else {
                rVarH.X(-1030146788);
                j70.h.g(null, null, basicTopicsGroup.getTitle(), null, null, aVar.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).i(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
                i17 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing300()), rVarH, 0);
                rVarH.X(-448864236);
                Iterator<T> it = basicTopicsGroup.b().iterator();
                while (it.hasNext()) {
                    h0.v((n50.k) it.next(), null, rVarH, 0, 2);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, 0);
                }
                obj = null;
                c15 = 2;
                rVarH.R();
                rVarH.R();
            }
            os3.a pjmTopicsGroup = displayed.getPjmTopicsGroup();
            if (pjmTopicsGroup == null) {
                rVarH.X(-1029660058);
            } else {
                rVarH.X(-1029660057);
                f3.m.Companion companion3 = f3.m.INSTANCE;
                k70.a aVar2 = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVarH, i19).getSpacing250()), rVarH, i17);
                p076m2.r rVar2 = rVarH;
                j70.h.g(null, null, pjmTopicsGroup.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i19).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
                rVarH = rVar2;
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVarH, i19).getSpacing250()), rVarH, 0);
                rVarH.X(-448847884);
                Iterator<T> it4 = pjmTopicsGroup.b().iterator();
                while (it4.hasNext()) {
                    h0.v((n50.k) it4.next(), null, rVarH, 0, 2);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, 0);
                }
                rVarH.R();
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
            d5VarM.a(new er.p() { // from class: ms3.h
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return i.g(displayed, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(e.a.Displayed displayed, int i15, p076m2.r rVar, int i16) {
        f(displayed, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1394014831);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1394014831, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosetopic.ChooseTopicScreen (ChooseTopicScreen.kt:24)");
            }
            d(i(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ms3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a i(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(e eVar, int i15, p076m2.r rVar, int i16) {
        h(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
