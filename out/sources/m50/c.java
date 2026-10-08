package m50;

import d1.e0;
import d1.i;
import d1.i0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.x;
import er.p;
import f3.j;
import f3.m;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import k50.ServiceWidgetLargeData;
import k50.f;
import l50.ServiceWidgetSmallData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "Lm50/a;", "serviceWidgetsData", "Loq/i0;", "b", "(Ljava/util/Set;Lm2/r;I)V", "Ll50/a;", "e", "(Lm50/a;)Ll50/a;", "Lk50/a;", "d", "(Lm50/a;)Lk50/a;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Integer.valueOf(((ServiceWidgetData) t15).getPosition()), Integer.valueOf(((ServiceWidgetData) t16).getPosition()));
        }
    }

    public static final void b(final Set<ServiceWidgetData> set, r rVar, final int i15) {
        r rVarH = rVar.h(760910503);
        int i16 = 2;
        int i17 = (i15 & 6) == 0 ? (rVarH.G(set) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i17 & 3) != 2, i17 & 1)) {
            if (t.k()) {
                t.o(760910503, i17, -1, "pl.gov.coi.common.ui.ds.servicewidget.view.ServiceWidgetView (ServiceWidgetView.kt:20)");
            }
            i.f fVarR = i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100());
            m.Companion companion = m.INSTANCE;
            w0 w0VarA = e0.a(fVarR, f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion);
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            i0 i0Var = i0.f39176a;
            rVarH.X(604532831);
            for (List list : v.b0(v.U0(set, new a()), 2)) {
                int size = list.size();
                if (size == 1) {
                    rVarH.X(1639450918);
                    f.e(d((ServiceWidgetData) list.get(0)), rVarH, 0);
                    rVarH.R();
                    oq.i0 i0Var2 = oq.i0.f148189a;
                } else if (size != i16) {
                    rVarH.X(1639463742);
                    rVarH.R();
                    oq.i0 i0Var3 = oq.i0.f148189a;
                } else {
                    rVarH.X(1639453057);
                    i.f fVarR2 = i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100());
                    m.Companion companion3 = m.INSTANCE;
                    f3.c.Companion companion4 = f3.c.INSTANCE;
                    w0 w0VarB = m3.b(fVarR2, companion4.l(), rVarH, 0);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT2 = rVarH.t();
                    m mVarE2 = j.e(rVarH, companion3);
                    androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
                    er.a<androidx.compose.ui.node.c> aVarB2 = companion5.b();
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
                    n6.i(rVarC2, w0VarB, companion5.d());
                    n6.i(rVarC2, e0VarT2, companion5.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion5.c());
                    n6.g(rVarC2, companion5.a());
                    n6.i(rVarC2, mVarE2, companion5.e());
                    q3 q3Var = q3.f39261a;
                    m mVarC = p3.c(q3Var, companion3, 1.0f, false, 2, null);
                    w0 w0VarI = d1.r.i(companion4.o(), false);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT3 = rVarH.t();
                    m mVarE3 = j.e(rVarH, mVarC);
                    er.a<androidx.compose.ui.node.c> aVarB3 = companion5.b();
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
                    n6.i(rVarC3, w0VarI, companion5.d());
                    n6.i(rVarC3, e0VarT3, companion5.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
                    n6.g(rVarC3, companion5.a());
                    n6.i(rVarC3, mVarE3, companion5.e());
                    x xVar = x.f39368a;
                    l50.f.e(e((ServiceWidgetData) list.get(0)), rVarH, 0);
                    rVarH.x();
                    m mVarC2 = p3.c(q3Var, companion3, 1.0f, false, 2, null);
                    w0 w0VarI2 = d1.r.i(companion4.o(), false);
                    int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT4 = rVarH.t();
                    m mVarE4 = j.e(rVarH, mVarC2);
                    er.a<androidx.compose.ui.node.c> aVarB4 = companion5.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB4);
                    } else {
                        rVarH.u();
                    }
                    r rVarC4 = n6.c(rVarH);
                    n6.i(rVarC4, w0VarI2, companion5.d());
                    n6.i(rVarC4, e0VarT4, companion5.f());
                    n6.i(rVarC4, Integer.valueOf(iHashCode4), companion5.c());
                    n6.g(rVarC4, companion5.a());
                    n6.i(rVarC4, mVarE4, companion5.e());
                    l50.f.e(e((ServiceWidgetData) list.get(1)), rVarH, 0);
                    rVarH.x();
                    rVarH.x();
                    rVarH.R();
                    oq.i0 i0Var4 = oq.i0.f148189a;
                }
                i16 = 2;
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
            d5VarM.a(new p() { // from class: m50.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.c(set, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(Set set, int i15, r rVar, int i16) {
        b(set, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final ServiceWidgetLargeData d(ServiceWidgetData serviceWidgetData) {
        return new ServiceWidgetLargeData(serviceWidgetData.getTestTag(), serviceWidgetData.getIconResId(), serviceWidgetData.d(), serviceWidgetData.e(), serviceWidgetData.getLargeContentDescription(), serviceWidgetData.getEnabled());
    }

    private static final ServiceWidgetSmallData e(ServiceWidgetData serviceWidgetData) {
        return new ServiceWidgetSmallData(serviceWidgetData.getTestTag(), serviceWidgetData.getIconResId(), serviceWidgetData.getSmallLabel(), serviceWidgetData.i(), serviceWidgetData.e(), serviceWidgetData.getSmallContentDescription(), serviceWidgetData.getEnabled());
    }
}
