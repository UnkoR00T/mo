package ki1;

import d1.a2;
import d1.c2;
import d1.e0;
import d1.l1;
import d1.r3;
import d1.z0;
import er.q;
import mx.Label;
import oq.i0;
import oq.p;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lli1/a$a;", "data", "Loq/i0;", "f", "(Lli1/a$a;Lm2/r;I)V", "Lli1/a$a$c;", "l", "(Lli1/a$a$c;Lm2/r;I)V", "Lli1/a$a$b;", "j", "(Lli1/a$a$b;Lm2/r;I)V", "Lli1/a$a$a;", "h", "(Lli1/a$a$a;Lm2/r;I)V", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void f(final li1.a.InterfaceC2872a interfaceC2872a, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(299691936);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(interfaceC2872a) : rVarH.G(interfaceC2872a) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(299691936, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.airquality.AirQualityWidgetLargeSlot (AirQualityWidgetLargeSlot.kt:18)");
            }
            if (interfaceC2872a instanceof li1.a.InterfaceC2872a.WidgetPoint) {
                rVarH.X(241146138);
                l((li1.a.InterfaceC2872a.WidgetPoint) interfaceC2872a, rVarH, i16 & 14);
                rVarH.R();
            } else if (interfaceC2872a instanceof li1.a.InterfaceC2872a.Placeholder) {
                rVarH.X(241148698);
                j((li1.a.InterfaceC2872a.Placeholder) interfaceC2872a, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(interfaceC2872a instanceof li1.a.InterfaceC2872a.Loader)) {
                    rVarH.X(241144215);
                    rVarH.R();
                    throw new p();
                }
                rVarH.X(241151093);
                h((li1.a.InterfaceC2872a.Loader) interfaceC2872a, rVarH, i16 & 14);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ki1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.g(interfaceC2872a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(li1.a.InterfaceC2872a interfaceC2872a, int i15, r rVar, int i16) {
        f(interfaceC2872a, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final li1.a.InterfaceC2872a.Loader loader, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(634122878);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(loader) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(634122878, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.airquality.LoaderLargeSlot (AirQualityWidgetLargeSlot.kt:82)");
            }
            f3.m mVarA = a2.a(f3.m.INSTANCE, c2.Max);
            w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.k(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarA);
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
            d1.i0 i0Var = d1.i0.f39176a;
            rVar2 = rVarH;
            j70.h.g(null, null, loader.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k70.a.f108864a.f(rVarH, k70.a.f108865b).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ki1.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.i(loader, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(li1.a.InterfaceC2872a.Loader loader, int i15, r rVar, int i16) {
        h(loader, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final li1.a.InterfaceC2872a.Placeholder placeholder, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1811049018);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(placeholder) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1811049018, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.airquality.PlaceholderLargeSlot (AirQualityWidgetLargeSlot.kt:63)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarA = a2.a(companion, c2.Max);
            w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.k(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarA);
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
            d1.i0 i0Var = d1.i0.f39176a;
            Label title = placeholder.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            j70.h.g(null, null, placeholder.getDescription(), null, null, aVar.a(rVar2, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).f(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ki1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.k(placeholder, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(li1.a.InterfaceC2872a.Placeholder placeholder, int i15, r rVar, int i16) {
        j(placeholder, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final li1.a.InterfaceC2872a.WidgetPoint widgetPoint, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-700182566);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(widgetPoint) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-700182566, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.airquality.WidgetPointLargeSlot (AirQualityWidgetLargeSlot.kt:27)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            z0.h(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), iVar.h(), null, companion2.i(), 0, 0, y2.m.d(-1540681505, true, new q() { // from class: ki1.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.m(widgetPoint, (l1) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 1575990, 52);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, companion);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            i.e(widgetPoint.d(), widgetPoint.getProgressValue(), rVarH, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(null, null, widgetPoint.getAddressLabel(), null, null, aVar.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).f(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            rVar2.x();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ki1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.n(widgetPoint, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(li1.a.InterfaceC2872a.WidgetPoint widgetPoint, l1 l1Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-1540681505, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.airquality.WidgetPointLargeSlot.<anonymous>.<anonymous> (AirQualityWidgetLargeSlot.kt:34)");
            }
            Label qualityLabel = widgetPoint.getQualityLabel();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, qualityLabel, null, null, widgetPoint.d().B(rVar, 0).m20unboximpl(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).c(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.y(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            j70.h.g(null, null, widgetPoint.getLastUpdateLabel(), null, null, aVar.a(rVar, i16).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).f(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(li1.a.InterfaceC2872a.WidgetPoint widgetPoint, int i15, r rVar, int i16) {
        l(widgetPoint, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
