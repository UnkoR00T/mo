package kj1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\u0006\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lkj1/d;", "viewModel", "Loq/i0;", "e", "(Lkj1/d;Lm2/r;I)V", "Lkj1/d$a$a;", "data", "h", "(Lkj1/d$a$a;Lm2/r;I)V", "Lkj1/d$a;", "defencetraining_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void e(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(195830783);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(195830783, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.choosetrainingdate.ChooseTrainingDateScreen (ChooseTrainingDateScreen.kt:28)");
            }
            d.a aVarF = f(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarF instanceof d.a.InterfaceC2676a) {
                rVarH.X(-785171502);
                h((d.a.InterfaceC2676a) aVarF, rVarH, 0);
                rVarH.R();
            } else if (aVarF instanceof d.a.Error) {
                rVarH.X(-785167705);
                ((d.a.Error) aVarF).getError().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!fr.t.c(aVarF, d.a.c.f111159a)) {
                    rVarH.X(-785173961);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-785165936);
                c60.b.b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: kj1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.g(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a f(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(d dVar, int i15, p076m2.r rVar, int i16) {
        e(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final d.a.InterfaceC2676a interfaceC2676a, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1428934339);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(interfaceC2676a) : rVarH.G(interfaceC2676a) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1428934339, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.choosetrainingdate.ChooseTrainingDateScreenContent (ChooseTrainingDateScreen.kt:41)");
            }
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            q0.g(false, interfaceC2676a.a(), rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(interfaceC2676a.getBaseScaffoldData(), y2.m.d(-102585490, true, new er.p() { // from class: kj1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.i(interfaceC2676a, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, f3VarB, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1928434294, true, new er.q() { // from class: kj1.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.j(f3VarB, interfaceC2676a, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32700);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: kj1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.k(interfaceC2676a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(d.a.InterfaceC2676a interfaceC2676a, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-102585490, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.choosetrainingdate.ChooseTrainingDateScreenContent.<anonymous> (ChooseTrainingDateScreen.kt:49)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            h30.q.p(interfaceC2676a.getNextButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 j(f3 f3Var, d.a.InterfaceC2676a interfaceC2676a, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1928434294, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.choosetrainingdate.ChooseTrainingDateScreenContent.<anonymous> (ChooseTrainingDateScreen.kt:56)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), f3Var, rVar, 0, 0), rVar, 0);
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
            Label title = interfaceC2676a.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(interfaceC2676a.getCardList(), null, null, rVar, 0, 6);
            p076m2.r rVar2 = rVar;
            if (interfaceC2676a instanceof d.a.InterfaceC2676a.MoreDates) {
                rVar2.X(1207976603);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
                d.a.InterfaceC2676a.MoreDates moreDates = (d.a.InterfaceC2676a.MoreDates) interfaceC2676a;
                j70.h.g(null, null, moreDates.getDateListTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(moreDates.getDateList(), null, null, rVar2, 0, 6);
            } else {
                rVar2.X(1205167042);
            }
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(d.a.InterfaceC2676a interfaceC2676a, int i15, p076m2.r rVar, int i16) {
        h(interfaceC2676a, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
