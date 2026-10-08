package k50;

import androidx.compose.ui.graphics.Color;
import b1.k;
import b1.l;
import d1.a3;
import d1.m3;
import d1.q3;
import d1.r3;
import d1.x;
import d40.h;
import er.p;
import f3.j;
import f3.m;
import n4.f0;
import n4.g0;
import n4.i0;
import n4.v;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.s;
import w0.i;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lk50/a;", "data", "Loq/i0;", "e", "(Lk50/a;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f108590a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1548666954);
            if (t.k()) {
                t.o(-1548666954, i15, -1, "pl.gov.coi.common.ui.ds.servicewidget.large.ServiceWidgetLarge.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServiceWidgetLarge.kt:89)");
            }
            long jH = Color.INSTANCE.h();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jH;
        }
    }

    public static final void e(final ServiceWidgetLargeData serviceWidgetLargeData, r rVar, final int i15) {
        int i16;
        float f15;
        m mVarL;
        r rVarH = rVar.h(-199884935);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(serviceWidgetLargeData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-199884935, i16, -1, "pl.gov.coi.common.ui.ds.servicewidget.large.ServiceWidgetLarge (ServiceWidgetLarge.kt:46)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = s.I();
                rVarH.v(objE);
            }
            final cx.a aVar = (cx.a) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = k.a();
                rVarH.v(objE2);
            }
            l lVar = (l) objE2;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            if (serviceWidgetLargeData.getEnabled()) {
                rVarH.X(-1460754787);
                m.Companion companion2 = m.INSTANCE;
                int iA = n4.l.INSTANCE.a();
                r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
                n4.l lVarJ = n4.l.j(iA);
                boolean zG = rVarH.G(aVar) | rVarH.W(serviceWidgetLargeData);
                Object objE3 = rVarH.E();
                if (zG || objE3 == companion.a()) {
                    objE3 = new er.a() { // from class: k50.b
                        @Override // er.a
                        public final Object a() {
                            return f.f(aVar, serviceWidgetLargeData);
                        }
                    };
                    rVarH.v(objE3);
                }
                f15 = 0.0f;
                mVarL = androidx.compose.foundation.b.l(companion2, lVar, r1VarE, false, null, lVarJ, (er.a) objE3, 12, null);
                rVarH.R();
            } else {
                f15 = 0.0f;
                rVarH.X(-1460530967);
                rVarH.R();
                mVarL = m.INSTANCE;
            }
            m.Companion companion3 = m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarU = i.d(k3.f.a(androidx.compose.foundation.layout.d.h(s.w(companion3, f6VarA, aVar2.b(rVarH, i17).getSpacing200(), 0.0f, 4, null), f15, 1, null), aVar2.e(rVarH, i17).getRadius200()), aVar2.a(rVarH, i17).getSurface().a(), null, 2, null).u(mVarL);
            boolean z15 = (i16 & 14) == 4;
            Object objE4 = rVarH.E();
            if (z15 || objE4 == companion.a()) {
                objE4 = new er.l() { // from class: k50.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.h(serviceWidgetLargeData, (i0) obj);
                    }
                };
                rVarH.v(objE4);
            }
            m mVarN = a3.n(v.a(mVarU, (er.l) objE4), aVar2.b(rVarH, i17).getSpacing200());
            f3.c.Companion companion4 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion4.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarN);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion5.b();
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
            n6.i(rVarC, w0VarI, companion5.d());
            n6.i(rVarC, e0VarT, companion5.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion5.c());
            n6.g(rVarC, companion5.a());
            n6.i(rVarC, mVarE, companion5.e());
            x xVar = x.f39368a;
            w0 w0VarB = m3.b(d1.i.f39152a.j(), companion4.l(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, companion3);
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
            h.f(null, new d40.b.C0864b(serviceWidgetLargeData.getTestTag() + "Icon", serviceWidgetLargeData.getIconResId(), d40.i.f.f39709e, a.f108590a, null, null, 32, null), false, rVarH, 0, 5);
            r3.a(androidx.compose.foundation.layout.d.y(companion3, aVar2.b(rVarH, i17).getSpacing150()), rVarH, 0);
            serviceWidgetLargeData.e().B(rVarH, 0);
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: k50.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.i(serviceWidgetLargeData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(cx.a aVar, final ServiceWidgetLargeData serviceWidgetLargeData) {
        cx.a.a(aVar, 0L, new er.a() { // from class: k50.e
            @Override // er.a
            public final Object a() {
                return f.g(serviceWidgetLargeData);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(ServiceWidgetLargeData serviceWidgetLargeData) {
        serviceWidgetLargeData.d().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(ServiceWidgetLargeData serviceWidgetLargeData, i0 i0Var) {
        f0.c0(i0Var, serviceWidgetLargeData.getContentDescription().getText());
        g0.a(i0Var, true);
        f0.y0(i0Var, serviceWidgetLargeData.getTestTag());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(ServiceWidgetLargeData serviceWidgetLargeData, int i15, r rVar, int i16) {
        e(serviceWidgetLargeData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
