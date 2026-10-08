package s40;

import d1.a3;
import d1.e0;
import d1.i;
import d1.i0;
import d1.r3;
import d1.x;
import f3.j;
import f3.m;
import oq.p;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt40/b;", "data", "Lc5/h;", "spaceBetween", "Loq/i0;", "c", "(Lt40/b;FLm2/r;II)V", "d", "(Lt40/b;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final void c(final InfoRowListData infoRowListData, final float f15, r rVar, final int i15, final int i16) {
        r rVarH = rVar.h(1576590627);
        int i17 = (i15 & 6) == 0 ? (rVarH.G(infoRowListData) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i17 |= ((i16 & 2) == 0 && rVarH.b(f15)) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
                if ((i16 & 2) != 0) {
                    i17 &= -113;
                }
            } else if ((i16 & 2) != 0) {
                f15 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                i17 &= -113;
            }
            rVarH.y();
            if (t.k()) {
                t.o(1576590627, i17, -1, "pl.gov.coi.common.ui.ds.inforow.InfoRowList (InfoRowList.kt:23)");
            }
            m mVarC = androidx.compose.foundation.layout.d.C(m.INSTANCE, null, false, 3, null);
            w0 w0VarA = e0.a(i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarC);
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
            rVarH.X(-1005201561);
            int i18 = 0;
            for (Object obj : infoRowListData.a()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    v.x();
                }
                t40.a aVar = (t40.a) obj;
                if (aVar instanceof t40.a.b) {
                    rVarH.X(-1279922871);
                    d.f((t40.a.b) aVar, rVarH, 0);
                    rVarH.R();
                } else {
                    if (!(aVar instanceof t40.a.C4874a)) {
                        rVarH.X(-1279924411);
                        rVarH.R();
                        throw new p();
                    }
                    rVarH.X(-1279920792);
                    d.d((t40.a.C4874a) aVar, rVarH, 0);
                    rVarH.R();
                }
                if (i18 != v.p(infoRowListData.a())) {
                    rVarH.X(-1022756705);
                    r3.a(androidx.compose.foundation.layout.d.i(m.INSTANCE, f15), rVarH, 0);
                } else {
                    rVarH.X(-1024020296);
                }
                rVarH.R();
                i18 = i19;
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
            d5VarM.a(new er.p() { // from class: s40.f
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return g.f(infoRowListData, f15, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final void d(final InfoRowListData infoRowListData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1142185541);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(infoRowListData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1142185541, i16, -1, "pl.gov.coi.common.ui.ds.inforow.InfoRowListPreview (InfoRowList.kt:46)");
            }
            m.Companion companion = m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarP = a3.p(w0.i.d(companion, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarP);
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            c(infoRowListData, 0.0f, rVarH, i16 & 14, 2);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s40.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.e(infoRowListData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(InfoRowListData infoRowListData, int i15, r rVar, int i16) {
        d(infoRowListData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(InfoRowListData infoRowListData, float f15, int i15, int i16, r rVar, int i17) {
        c(infoRowListData, f15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
