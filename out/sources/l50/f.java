package l50;

import androidx.compose.ui.graphics.Color;
import b1.k;
import b1.l;
import c5.h;
import d1.a2;
import d1.a3;
import d1.c2;
import d1.m3;
import d1.q3;
import d1.r3;
import d1.x;
import er.p;
import f3.j;
import f3.m;
import mx.Label;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ll50/a;", "data", "Loq/i0;", "e", "(Ll50/a;Lm2/r;I)V", "Lc5/h;", "a", "F", "MIN_WIDGET_HEIGHT", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f116082a = h.n(104);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f116083a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-780458828);
            if (t.k()) {
                t.o(-780458828, i15, -1, "pl.gov.coi.common.ui.ds.servicewidget.small.ServiceWidgetSmall.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServiceWidgetSmall.kt:103)");
            }
            long jH = Color.INSTANCE.h();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jH;
        }
    }

    public static final void e(final ServiceWidgetSmallData serviceWidgetSmallData, r rVar, final int i15) {
        int i16;
        float f15;
        m mVarL;
        m.Companion companion;
        k70.a aVar;
        r rVarH = rVar.h(-1809998495);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(serviceWidgetSmallData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1809998495, i16, -1, "pl.gov.coi.common.ui.ds.servicewidget.small.ServiceWidgetSmall (ServiceWidgetSmall.kt:52)");
            }
            Object objE = rVarH.E();
            r.Companion companion2 = r.INSTANCE;
            if (objE == companion2.a()) {
                objE = s.I();
                rVarH.v(objE);
            }
            final cx.a aVar2 = (cx.a) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion2.a()) {
                objE2 = k.a();
                rVarH.v(objE2);
            }
            l lVar = (l) objE2;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            if (serviceWidgetSmallData.getEnabled()) {
                rVarH.X(1087518135);
                m.Companion companion3 = m.INSTANCE;
                int iA = n4.l.INSTANCE.a();
                r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
                n4.l lVarJ = n4.l.j(iA);
                boolean zG = rVarH.G(aVar2) | rVarH.W(serviceWidgetSmallData);
                Object objE3 = rVarH.E();
                if (zG || objE3 == companion2.a()) {
                    objE3 = new er.a() { // from class: l50.b
                        @Override // er.a
                        public final Object a() {
                            return f.f(aVar2, serviceWidgetSmallData);
                        }
                    };
                    rVarH.v(objE3);
                }
                f15 = 0.0f;
                mVarL = androidx.compose.foundation.b.l(companion3, lVar, r1VarE, false, null, lVarJ, (er.a) objE3, 12, null);
                rVarH.R();
            } else {
                f15 = 0.0f;
                rVarH.X(1087759253);
                rVarH.R();
                mVarL = m.INSTANCE;
            }
            m.Companion companion4 = m.INSTANCE;
            k70.a aVar3 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarU = i.d(k3.f.a(a2.a(androidx.compose.foundation.layout.d.k(androidx.compose.foundation.layout.d.h(s.w(companion4, f6VarA, aVar3.b(rVarH, i17).getSpacing200(), 0.0f, 4, null), f15, 1, null), f116082a, f15, 2, null), c2.Max), aVar3.e(rVarH, i17).getRadius200()), aVar3.a(rVarH, i17).getSurface().a(), null, 2, null).u(mVarL);
            boolean z15 = (i16 & 14) == 4;
            Object objE4 = rVarH.E();
            if (z15 || objE4 == companion2.a()) {
                objE4 = new er.l() { // from class: l50.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.h(serviceWidgetSmallData, (i0) obj);
                    }
                };
                rVarH.v(objE4);
            }
            m mVarN = a3.n(v.a(mVarU, (er.l) objE4), aVar3.b(rVarH, i17).getSpacing200());
            f3.c.Companion companion5 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion5.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarN);
            androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion6.b();
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
            n6.i(rVarC, w0VarI, companion6.d());
            n6.i(rVarC, e0VarT, companion6.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion6.c());
            n6.g(rVarC, companion6.a());
            n6.i(rVarC, mVarE, companion6.e());
            x xVar = x.f39368a;
            m mVarF = androidx.compose.foundation.layout.d.f(companion4, 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = d1.e0.a(iVar.h(), companion5.k(), rVarH, 6);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarF);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion6.b();
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
            n6.i(rVarC2, w0VarA, companion6.d());
            n6.i(rVarC2, e0VarT2, companion6.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion6.c());
            n6.g(rVarC2, companion6.a());
            n6.i(rVarC2, mVarE2, companion6.e());
            d1.i0 i0Var = d1.i0.f39176a;
            m mVarH = androidx.compose.foundation.layout.d.h(companion4, 0.0f, 1, null);
            w0 w0VarB = m3.b(iVar.h(), companion5.i(), rVarH, 54);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT3 = rVarH.t();
            m mVarE3 = j.e(rVarH, mVarH);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion6.b();
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
            n6.i(rVarC3, w0VarB, companion6.d());
            n6.i(rVarC3, e0VarT3, companion6.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion6.c());
            n6.g(rVarC3, companion6.a());
            n6.i(rVarC3, mVarE3, companion6.e());
            q3 q3Var = q3.f39261a;
            d40.h.f(null, new d40.b.C0864b(serviceWidgetSmallData.getTestTag() + "Icon", serviceWidgetSmallData.getIconResId(), d40.i.f.f39709e, a.f116083a, null, null, 32, null), false, rVarH, 0, 5);
            Label label = serviceWidgetSmallData.getLabel();
            if (label == null) {
                rVarH.X(-1422948621);
                rVarH.R();
                aVar = aVar3;
                companion = companion4;
            } else {
                rVarH.X(-1422948620);
                r3.a(androidx.compose.foundation.layout.d.y(companion4, aVar3.b(rVarH, i17).getSpacing100()), rVarH, 0);
                companion = companion4;
                aVar = aVar3;
                j70.h.g(null, null, label, null, null, aVar3.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).f(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
                oq.i0 i0Var2 = oq.i0.f148189a;
                rVarH.R();
            }
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            serviceWidgetSmallData.f().B(rVarH, 0);
            rVarH.x();
            rVarH.x();
            oq.i0 i0Var3 = oq.i0.f148189a;
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: l50.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.i(serviceWidgetSmallData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(cx.a aVar, final ServiceWidgetSmallData serviceWidgetSmallData) {
        cx.a.a(aVar, 0L, new er.a() { // from class: l50.e
            @Override // er.a
            public final Object a() {
                return f.g(serviceWidgetSmallData);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(ServiceWidgetSmallData serviceWidgetSmallData) {
        serviceWidgetSmallData.e().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(ServiceWidgetSmallData serviceWidgetSmallData, i0 i0Var) {
        f0.c0(i0Var, serviceWidgetSmallData.getContentDescription().getText());
        g0.a(i0Var, true);
        f0.y0(i0Var, serviceWidgetSmallData.getTestTag());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(ServiceWidgetSmallData serviceWidgetSmallData, int i15, r rVar, int i16) {
        e(serviceWidgetSmallData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
