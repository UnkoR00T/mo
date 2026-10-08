package ki1;

import d1.e0;
import d1.i0;
import d1.r3;
import mx.Label;
import oq.p;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lli1/a$b;", "data", "Loq/i0;", "e", "(Lli1/a$b;Lm2/r;I)V", "Lli1/a$b$c;", "k", "(Lli1/a$b$c;Lm2/r;I)V", "Lli1/a$b$b;", "i", "(Lli1/a$b$b;Lm2/r;I)V", "Lli1/a$b$a;", "g", "(Lli1/a$b$a;Lm2/r;I)V", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static final void e(final li1.a.b bVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-466004244);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-466004244, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.airquality.AirQualityWidgetSmallSlot (AirQualityWidgetSmallSlot.kt:14)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            w0 w0VarA = e0.a(d1.i.f39152a.d(), f3.c.INSTANCE.k(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarF);
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
            if (bVar instanceof li1.a.b.WidgetPoint) {
                rVarH.X(626616412);
                k((li1.a.b.WidgetPoint) bVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (bVar instanceof li1.a.b.Placeholder) {
                rVarH.X(626619036);
                i((li1.a.b.Placeholder) bVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(bVar instanceof li1.a.b.Loader)) {
                    rVarH.X(626614433);
                    rVarH.R();
                    throw new p();
                }
                rVarH.X(626621495);
                g((li1.a.b.Loader) bVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: ki1.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.f(bVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(li1.a.b bVar, int i15, r rVar, int i16) {
        e(bVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void g(final li1.a.b.Loader loader, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1882460954);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(loader) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1882460954, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.airquality.LoaderSmallSlot (AirQualityWidgetSmallSlot.kt:49)");
            }
            rVar2 = rVarH;
            j70.h.g(null, null, loader.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k70.a.f108864a.f(rVarH, k70.a.f108865b).c(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ki1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.h(loader, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(li1.a.b.Loader loader, int i15, r rVar, int i16) {
        g(loader, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void i(final li1.a.b.Placeholder placeholder, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1414204998);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(placeholder) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1414204998, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.airquality.PlaceholderSmallSlot (AirQualityWidgetSmallSlot.kt:41)");
            }
            rVar2 = rVarH;
            j70.h.g(null, null, placeholder.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k70.a.f108864a.f(rVarH, k70.a.f108865b).c(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ki1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.j(placeholder, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(li1.a.b.Placeholder placeholder, int i15, r rVar, int i16) {
        i(placeholder, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void k(final li1.a.b.WidgetPoint widgetPoint, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(369530714);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(widgetPoint) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(369530714, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.airquality.WidgetPointSmallSlot (AirQualityWidgetSmallSlot.kt:25)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            Label qualityLabel = widgetPoint.getQualityLabel();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, qualityLabel, null, null, widgetPoint.b().B(rVarH, 0).m20unboximpl(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).e(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            i.e(widgetPoint.b(), widgetPoint.getProgressValue(), rVarH, 0);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ki1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.l(widgetPoint, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(li1.a.b.WidgetPoint widgetPoint, int i15, r rVar, int i16) {
        k(widgetPoint, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
