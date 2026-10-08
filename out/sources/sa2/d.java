package sa2;

import d1.a3;
import d1.d3;
import d1.e0;
import i50.BaseScaffoldData;
import i50.s;
import java.util.List;
import n30.CardListData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lsa2/j;", "viewModel", "Loq/i0;", "d", "(Lsa2/j;Lm2/r;I)V", "Li50/a;", "scaffoldData", "", "Ln50/k;", "itemList", "g", "(Li50/a;Ljava/util/List;Lm2/r;I)V", "Lsa2/j$a;", "state", "history_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void d(final j jVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1587200165);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1587200165, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.historyMain.HistoryScreen (HistoryScreen.kt:24)");
            }
            j.a aVarE = e(m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7));
            if (!(aVarE instanceof j.a.Initialized)) {
                rVarH.X(585972227);
                rVarH.R();
                throw new oq.p();
            }
            rVarH.X(585974424);
            j.a.Initialized initialized = (j.a.Initialized) aVarE;
            g(initialized.getScaffoldData(), initialized.a(), rVarH, BaseScaffoldData.f89350g);
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sa2.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.f(jVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final j.a e(f6<? extends j.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(j jVar, int i15, r rVar, int i16) {
        d(jVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final BaseScaffoldData baseScaffoldData, final List<? extends n50.k> list, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-923683813);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(baseScaffoldData) : rVarH.G(baseScaffoldData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(list) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-923683813, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.historyMain.HistoryScreenContent (HistoryScreen.kt:39)");
            }
            rVar2 = rVarH;
            s.r(baseScaffoldData, null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1966234312, true, new er.q() { // from class: sa2.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d.h(list, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | (i16 & 14), 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sa2.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.i(baseScaffoldData, list, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(List list, d3 d3Var, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1966234312, i15, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.historyMain.HistoryScreenContent.<anonymous> (HistoryScreen.kt:43)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(f3.m.INSTANCE, d3Var), null, rVar, 0, 1), rVar, 0);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            m30.i.d(new CardListData(list, null, false, null, null, 30, null), null, null, rVar, 0, 6);
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
    public static final i0 i(BaseScaffoldData baseScaffoldData, List list, int i15, r rVar, int i16) {
        g(baseScaffoldData, list, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
