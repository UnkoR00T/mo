package if1;

import d1.a3;
import d1.d3;
import d1.e0;
import i50.BaseScaffoldData;
import i50.s;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lif1/k;", "viewModel", "Loq/i0;", "d", "(Lif1/k;Lm2/r;I)V", "Lif1/k$a$a;", "data", "f", "(Lif1/k$a$a;Lm2/r;I)V", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void d(final k kVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-750106389);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-750106389, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.summarystatus.SummaryStatusScreen (SummaryStatusScreen.kt:25)");
            }
            k.a aVar = (k.a) m7.b.c(kVar.getState(), null, null, null, rVarH, 0, 7).getValue();
            if (!(aVar instanceof k.a.Summary)) {
                rVarH.X(702270212);
                rVarH.R();
                throw new oq.p();
            }
            rVarH.X(702272874);
            f((k.a.Summary) aVar, rVarH, 0);
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: if1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.e(kVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(k kVar, int i15, r rVar, int i16) {
        d(kVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void f(final k.a.Summary summary, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(74199302);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(summary) : rVarH.G(summary) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(74199302, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.summarystatus.SummaryThird (SummaryStatusScreen.kt:36)");
            }
            rVar2 = rVarH;
            s.r(summary.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-207750343, true, new er.q() { // from class: if1.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.g(summary, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: if1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.h(summary, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(k.a.Summary summary, d3 d3Var, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-207750343, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.summarystatus.SummaryThird.<anonymous> (SummaryStatusScreen.kt:40)");
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            IconPageData<InfoRowListData, IconPageBottomContentData> iconPageDataA = summary.a();
            d dVar = d.f92080a;
            q40.i.b(iconPageDataA, dVar.d(), dVar.e(), rVar, IconPageData.f164667h | InfoRowListData.f187643b | IconPageBottomContentData.f164663d | 432, 0);
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
    public static final i0 h(k.a.Summary summary, int i15, r rVar, int i16) {
        f(summary, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
