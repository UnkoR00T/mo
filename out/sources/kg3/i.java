package kg3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.Iterator;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lkg3/c;", "viewModel", "Loq/i0;", "m", "(Lkg3/c;Lm2/r;I)V", "Lkg3/c$a;", "data", "f", "(Lkg3/c$a;Lm2/r;I)V", "Lkg3/c$a$b;", "h", "(Lkg3/c$a$b;Lm2/r;I)V", "Lmx/a;", "title", "Lng3/a$b;", "insuranceListModel", "k", "(Lmx/a;Lng3/a$b;Lm2/r;I)V", "state", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void f(final c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1002110716);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1002110716, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.insurancelist.InsuranceListContent (InsuranceListScreen.kt:47)");
            }
            if (aVar instanceof c.a.C2666a) {
                rVarH.X(955727853);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.Initialized)) {
                    rVarH.X(955726122);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(955730026);
                h((c.a.Initialized) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: kg3.e
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

    public static final void h(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1640233129);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1640233129, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.insurancelist.InsuranceListInitialized (InsuranceListScreen.kt:57)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-191453098, true, new er.q() { // from class: kg3.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.i(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: kg3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-191453098, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.insurancelist.InsuranceListInitialized.<anonymous> (InsuranceListScreen.kt:61)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = t70.s.n(w0.i.d(mVarF, aVar.a(rVar2, i17).getBase().a(), null, 2, null), rVar2, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            ng3.a insuranceListModel = initialized.getInsuranceListModel();
            if (insuranceListModel instanceof ng3.a.Empty) {
                rVar2.X(222704973);
                f3.m mVarB = h0.b(i0Var, companion, 1.0f, false, 2, null);
                w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar2, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT2 = rVar2.t();
                f3.m mVarE2 = f3.j.e(rVar2, mVarB);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB2);
                } else {
                    rVar2.u();
                }
                p076m2.r rVarC2 = n6.c(rVar2);
                n6.i(rVarC2, w0VarA2, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                j70.h.g(null, null, initialized.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing50()), rVar, 0);
                j70.h.g(null, null, initialized.getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                n50.h0.v(((ng3.a.Empty) initialized.getInsuranceListModel()).getSingleCardData(), null, rVar2, 0, 2);
                rVar2.x();
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                h30.q.p(((ng3.a.Empty) initialized.getInsuranceListModel()).getGoToNextStepButton(), false, null, rVar2, 0, 6);
                rVar2.R();
            } else {
                if (!(insuranceListModel instanceof ng3.a.InsuranceList)) {
                    rVar2.X(1808297295);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(1808325125);
                k(initialized.getTitle(), (ng3.a.InsuranceList) initialized.getInsuranceListModel(), rVar2, 0);
                rVar2.R();
            }
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        h(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final Label label, final ng3.a.InsuranceList insuranceList, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2134347062);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(insuranceList) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2134347062, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.insurancelist.InsuranceListListContent (InsuranceListScreen.kt:105)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarF);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarC = androidx.compose.foundation.layout.d.C(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, false, 3, null);
            w0 w0VarB = m3.b(iVar.j(), companion2.i(), rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            f3.m mVarC2 = p3.c(q3.f39261a, companion, 1.0f, false, 2, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarC2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, (i16 << 6) & 896, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, insuranceList.getAddInsuranceDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            h30.q.p(insuranceList.getAddInsuranceButtonData(), false, null, rVarH, 0, 6);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing250()), rVarH, 0);
            f3.m mVarR = a3.r(t70.i.S(h0.b(i0Var, companion, 1.0f, false, 2, null), null, rVarH, 0, 1), 0.0f, 0.0f, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 7, null);
            w0 w0VarA3 = e0.a(iVar.r(aVar.b(rVarH, i17).getSpacing200()), companion2.k(), rVarH, 0);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB4);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarA3, companion3.d());
            n6.i(rVarC4, e0VarT4, companion3.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion3.c());
            n6.g(rVarC4, companion3.a());
            n6.i(rVarC4, mVarE4, companion3.e());
            rVarH.X(1286490022);
            Iterator<T> it = insuranceList.d().iterator();
            while (it.hasNext()) {
                n50.h0.v((n50.k) it.next(), null, rVarH, 0, 2);
            }
            rVarH.R();
            rVarH.x();
            f3.m mVarR2 = a3.r(f3.m.INSTANCE, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200(), 0.0f, 0.0f, 13, null);
            w0 w0VarA4 = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT5 = rVarH.t();
            f3.m mVarE5 = f3.j.e(rVarH, mVarR2);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB5 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB5);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC5 = n6.c(rVarH);
            n6.i(rVarC5, w0VarA4, companion4.d());
            n6.i(rVarC5, e0VarT5, companion4.f());
            n6.i(rVarC5, Integer.valueOf(iHashCode5), companion4.c());
            n6.g(rVarC5, companion4.a());
            n6.i(rVarC5, mVarE5, companion4.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            h30.q.p(insuranceList.getGoToNextStepButton(), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: kg3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.l(label, insuranceList, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Label label, ng3.a.InsuranceList insuranceList, int i15, p076m2.r rVar, int i16) {
        k(label, insuranceList, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(658136845);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(658136845, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.insurancelist.InsuranceListScreen (InsuranceListScreen.kt:36)");
            }
            f(n(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: kg3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.o(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a n(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(c cVar, int i15, p076m2.r rVar, int i16) {
        m(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
