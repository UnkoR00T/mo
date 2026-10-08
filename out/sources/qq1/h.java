package qq1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import d1.x;
import er.p;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import k50.ServiceWidgetLargeData;
import l50.ServiceWidgetSmallData;
import m50.ServiceWidgetData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import pq.v;
import w0.u2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lqq1/d;", "viewModel", "Loq/i0;", "g", "(Lqq1/d;Lm2/r;I)V", "Lqq1/d$a;", "screenData", "d", "(Lqq1/d$a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void d(final d.Data data, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1552964276);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1552964276, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.servicewidget.DeveloperServiceWidgetContent (DeveloperServiceWidgetScreen.kt:39)");
            }
            rVar2 = rVarH;
            s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1699173397, true, new q() { // from class: qq1.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.e(data, data, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new p() { // from class: qq1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.f(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(d.Data data, d.Data data2, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1699173397, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.servicewidget.DeveloperServiceWidgetContent.<anonymous>.<anonymous> (DeveloperServiceWidgetScreen.kt:43)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(companion, d3Var), u2.b(0, rVar, 0, 1), rVar, 0, 0), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.f fVarR = iVar.r(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(fVarR, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            j70.h.g(null, null, mx.b.b("ServiceWidgetView - example", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            m50.c.b(data.c(), rVar, 0);
            j70.h.g(null, null, mx.b.b("ServiceWidgetSmall - example", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, companion);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var = q3.f39261a;
            f3.m mVarC = p3.c(q3Var, companion, 1.0f, false, 2, null);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB3);
            } else {
                rVar.u();
            }
            r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarI, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            x xVar = x.f39368a;
            rVar.X(1867462911);
            ServiceWidgetData serviceWidgetData = (ServiceWidgetData) v.k0(data2.c());
            l50.f.e(new ServiceWidgetSmallData(serviceWidgetData.getTestTag(), serviceWidgetData.getIconResId(), serviceWidgetData.getSmallLabel(), serviceWidgetData.i(), serviceWidgetData.e(), mx.b.b("contentDesc", ""), true), rVar, ServiceWidgetSmallData.f116068h);
            i0 i0Var2 = i0.f148189a;
            rVar.R();
            rVar.x();
            r3.a(p3.c(q3Var, companion, 1.0f, false, 2, null), rVar, 0);
            rVar.x();
            j70.h.g(null, null, mx.b.b("ServiceWidgetLarge - example", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            rVar.X(-1710868199);
            ServiceWidgetData serviceWidgetData2 = (ServiceWidgetData) v.k0(data2.c());
            k50.f.e(new ServiceWidgetLargeData(serviceWidgetData2.getTestTag(), serviceWidgetData2.getIconResId(), serviceWidgetData2.d(), serviceWidgetData2.e(), mx.b.b("contentDesc", ""), true), rVar, ServiceWidgetLargeData.f108577g);
            rVar.R();
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
    public static final i0 f(d.Data data, int i15, r rVar, int i16) {
        d(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final d dVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-507229987);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-507229987, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.servicewidget.DeveloperServiceWidgetScreen (DeveloperServiceWidgetScreen.kt:31)");
            }
            f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            d(h(f6VarC), rVarH, 0);
            q0.g(false, h(f6VarC).b(), rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: qq1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.i(dVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.Data h(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(d dVar, int i15, r rVar, int i16) {
        g(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
