package hs2;

import b30.AccordionData;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import n30.CardListData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lhs2/f;", "viewModel", "Loq/i0;", "e", "(Lhs2/f;Lm2/r;I)V", "Lhs2/f$a;", "data", "k", "(Lhs2/f$a;Lm2/r;I)V", "Lhs2/f$a$a;", "h", "(Lhs2/f$a$a;Lm2/r;I)V", "penaltypoints_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void e(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1140097482);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1140097482, i16, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.violationdetails.ViolationDetailsScreen (ViolationDetailsScreen.kt:24)");
            }
            k(f(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hs2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.g(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.a f(f6<? extends f.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(f fVar, int i15, p076m2.r rVar, int i16) {
        e(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void h(final f.a.DataLoaded dataLoaded, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1053143916);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(dataLoaded) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1053143916, i16, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.violationdetails.ViolationDetailsScreenContent (ViolationDetailsScreen.kt:42)");
            }
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(dataLoaded.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1410137153, true, new er.q() { // from class: hs2.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.i(f3VarB, dataLoaded, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hs2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.j(dataLoaded, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(f3 f3Var, f.a.DataLoaded dataLoaded, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1410137153, i16, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.violationdetails.ViolationDetailsScreenContent.<anonymous> (ViolationDetailsScreen.kt:46)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), f3Var, rVar, 6, 0), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 10, null);
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
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            m30.i.d(new CardListData(dataLoaded.c(), null, false, null, null, 30, null), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            AccordionData violationPlaceAccordionData = dataLoaded.getViolationPlaceAccordionData();
            int i18 = AccordionData.f16343b;
            b30.j.g(violationPlaceAccordionData, rVar, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            b30.j.g(dataLoaded.getVehicleAccordionData(), rVar, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f.a.DataLoaded dataLoaded, int i15, p076m2.r rVar, int i16) {
        h(dataLoaded, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void k(final f.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1545823119);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1545823119, i16, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.violationdetails.ViolationDetailsScreenStatesSwitcher (ViolationDetailsScreen.kt:32)");
            }
            if (fr.t.c(aVar, f.a.b.f86546a)) {
                rVarH.X(-977043537);
                rVarH.R();
            } else {
                if (!(aVar instanceof f.a.DataLoaded)) {
                    rVarH.X(522670066);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(522673627);
                h((f.a.DataLoaded) aVar, rVarH, i16 & 14);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hs2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.l(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(f.a aVar, int i15, p076m2.r rVar, int i16) {
        k(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
