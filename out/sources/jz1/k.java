package jz1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import d1.x;
import i50.BaseScaffoldData;
import j50.f0;
import k40.EmptyStateData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ljz1/f;", "viewModel", "Loq/i0;", "i", "(Ljz1/f;Lm2/r;I)V", "Ljz1/f$a;", "screenData", "e", "(Ljz1/f$a;Lm2/r;I)V", "electoralsupport_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    private static final void e(final f.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1920194867);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1920194867, i16, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.committeelist.CommitteeListContent (CommitteeListScreen.kt:34)");
            }
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, f3VarB, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(148949626, true, new er.q() { // from class: jz1.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.f(data, f3VarB, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: jz1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.h(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(final f.Data data, f3 f3Var, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        float spacing200;
        k70.a aVar;
        f3.m.Companion companion;
        int i17;
        int i18;
        int i19;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(148949626, i16, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.committeelist.CommitteeListContent.<anonymous> (CommitteeListScreen.kt:40)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), d3Var);
            if (data.getSearchBarData().getIsActive()) {
                rVar2.X(657283414);
                spacing200 = k70.a.f108864a.b(rVar2, k70.a.f108865b).getZero();
                rVar2.R();
            } else {
                rVar2.X(657339152);
                spacing200 = k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200();
                rVar2.R();
            }
            f3.m mVarP = a3.p(mVarL, spacing200, 0.0f, 2, null);
            k70.a aVar2 = k70.a.f108864a;
            int i25 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(a3.r(mVarP, 0.0f, aVar2.b(rVar2, i25).getSpacing100(), 0.0f, aVar2.b(rVar2, i25).getSpacing200(), 5, null), f3Var, rVar2, 0, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarS);
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
            if (data.getSearchBarData().getIsActive()) {
                aVar = aVar2;
                companion = companion2;
                i17 = i25;
                i18 = 1567024114;
                i19 = 0;
                rVar2.X(1567024114);
                rVar2.R();
            } else {
                rVar2.X(1569211226);
                j70.h.g(null, null, data.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i25).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i25).getSpacing100()), rVar, 0);
                j70.h.g(null, null, data.getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i25).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar2;
                i17 = i25;
                companion = companion2;
                i19 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
                rVar2.R();
                i18 = 1567024114;
            }
            f0.A(null, data.getSearchBarData(), y2.m.d(1016377678, true, new er.p() { // from class: jz1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.g(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 1);
            if (data.getSearchBarData().getIsActive()) {
                rVar2.X(i18);
            } else {
                rVar2.X(1570082822);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, i19);
                m30.i.d(data.getCommitteeList(), null, null, rVar2, 0, 6);
            }
            rVar2.R();
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
    public static final i0 g(f.Data data, p076m2.r rVar, int i15) {
        p076m2.r rVar2;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1016377678, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.committeelist.CommitteeListContent.<anonymous>.<anonymous>.<anonymous> (CommitteeListScreen.kt:67)");
            }
            i0 i0Var = null;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarP = a3.p(a3.r(mVarF, 0.0f, aVar.b(rVar, i16).getSpacing200(), 0.0f, 0.0f, 13, null), aVar.b(rVar, i16).getSpacing200(), 0.0f, 2, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            EmptyStateData emptyStateData = data.getEmptyStateData();
            if (emptyStateData == null) {
                rVar.X(287564668);
                rVar.R();
            } else {
                rVar.X(287564669);
                k40.d.c(null, emptyStateData, rVar, EmptyStateData.f108236d << 3, 1);
                rVar.R();
                i0Var = i0.f148189a;
            }
            if (i0Var == null) {
                rVar.X(1533298999);
                rVar2 = rVar;
                m30.i.d(data.getCommitteeList(), null, null, rVar2, 0, 6);
                rVar2.R();
            } else {
                rVar2 = rVar;
                rVar2.X(1533296147);
                rVar2.R();
            }
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
    public static final i0 h(f.Data data, int i15, p076m2.r rVar, int i16) {
        e(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1086696292);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1086696292, i16, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.committeelist.CommitteeListScreen (CommitteeListScreen.kt:28)");
            }
            e(j(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, BaseScaffoldData.f89350g | EmptyStateData.f108236d);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jz1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.k(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.Data j(f6<f.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(f fVar, int i15, p076m2.r rVar, int i16) {
        i(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
