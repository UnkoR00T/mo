package q50;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.g1;
import d1.a2;
import d1.c2;
import d1.e0;
import d1.i0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import d1.x;
import f3.m;
import java.util.List;
import oq.p;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "Lq50/a;", "data", "Loq/i0;", "b", "(Ljava/util/List;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void b(final List<StatisticCardData> list, r rVar, final int i15) {
        r rVarH = rVar.h(694581181);
        int i16 = 2;
        int i17 = (i15 & 6) == 0 ? (rVarH.G(list) ? 4 : 2) | i15 : i15;
        int i18 = 1;
        if (rVarH.r((i17 & 3) != 2, i17 & 1)) {
            if (t.k()) {
                t.o(694581181, i17, -1, "pl.gov.coi.common.ui.ds.statisticcard.StatisticCardList (StatisticCardList.kt:23)");
            }
            boolean z15 = (((Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b())).orientation == 1) && ((c5.d) rVarH.N(g1.f())).getFontScale() > 1.5f;
            if (z15) {
                i16 = 1;
            } else if (z15) {
                throw new p();
            }
            float f15 = 0.0f;
            Object obj = null;
            m mVarH = androidx.compose.foundation.layout.d.h(m.INSTANCE, 0.0f, 1, null);
            w0 w0VarA = e0.a(d1.i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarH);
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
            rVarH.X(-1007383563);
            for (List<StatisticCardData> list2 : v.b0(list, i16)) {
                m mVarA = a2.a(androidx.compose.foundation.layout.d.h(m.INSTANCE, f15, i18, obj), c2.Min);
                w0 w0VarB = m3.b(d1.i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), f3.c.INSTANCE.l(), rVarH, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                m mVarE2 = f3.j.e(rVarH, mVarA);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarB, companion2.d());
                n6.i(rVarC2, e0VarT2, companion2.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
                n6.g(rVarC2, companion2.a());
                n6.i(rVarC2, mVarE2, companion2.e());
                q3 q3Var = q3.f39261a;
                rVarH.X(1881671849);
                for (StatisticCardData statisticCardData : list2) {
                    m mVarC = p3.c(q3Var, m.INSTANCE, 1.0f, false, 2, null);
                    w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT3 = rVarH.t();
                    m mVarE3 = f3.j.e(rVarH, mVarC);
                    androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
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
                    r rVarC3 = n6.c(rVarH);
                    n6.i(rVarC3, w0VarI, companion3.d());
                    n6.i(rVarC3, e0VarT3, companion3.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
                    n6.g(rVarC3, companion3.a());
                    n6.i(rVarC3, mVarE3, companion3.e());
                    x xVar = x.f39368a;
                    f.e(statisticCardData, rVarH, 0);
                    rVarH.x();
                }
                rVarH.R();
                rVarH.X(1881679115);
                int size = i16 - list2.size();
                for (int i19 = 0; i19 < size; i19++) {
                    r3.a(p3.c(q3Var, m.INSTANCE, 1.0f, false, 2, null), rVarH, 0);
                }
                rVarH.R();
                rVarH.x();
                f15 = 0.0f;
                obj = null;
                i18 = 1;
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: q50.g
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return h.c(list, i15, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(List list, int i15, r rVar, int i16) {
        b(list, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
