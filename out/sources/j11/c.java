package j11;

import androidx.compose.foundation.layout.d;
import d1.a3;
import d1.e0;
import d1.i;
import d1.i0;
import er.p;
import f3.j;
import f3.m;
import k40.EmptyStateData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import x70.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lj11/a;", "data", "Loq/i0;", "b", "(Lj11/a;Lm2/r;I)V", "cases_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final void b(final PageIndicatorData pageIndicatorData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-771215976);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(pageIndicatorData) : rVarH.G(pageIndicatorData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-771215976, i16, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.caseslist.custom.pageindicator.PageIndicator (PageIndicator.kt:20)");
            }
            m mVarP = a3.p(d.C(d.h(m.INSTANCE, 0.0f, 1, null), null, false, 3, null), 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300(), 1, null);
            w0 w0VarA = e0.a(i.f39152a.e(), f3.c.INSTANCE.g(), rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarP);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            i0 i0Var = i0.f39176a;
            if (pageIndicatorData.getIsLoading()) {
                rVarH.X(-1271215265);
                f.g(x70.a.C5796a.f217280c, rVarH, x70.a.C5796a.f217281d);
                rVarH.R();
            } else {
                rVarH.X(-1271126295);
                EmptyStateData emptyStateMData = pageIndicatorData.getEmptyStateMData();
                if (emptyStateMData == null) {
                    rVarH.X(-1271126296);
                    rVarH.R();
                } else {
                    rVarH.X(-1271126295);
                    k40.d.c(null, emptyStateMData, rVarH, EmptyStateData.f108236d << 3, 1);
                    rVarH.R();
                    oq.i0 i0Var2 = oq.i0.f148189a;
                }
                rVarH.R();
            }
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: j11.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.c(pageIndicatorData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(PageIndicatorData pageIndicatorData, int i15, r rVar, int i16) {
        b(pageIndicatorData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
