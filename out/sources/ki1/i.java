package ki1;

import androidx.compose.ui.graphics.Color;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lli1/a;", "data", "Loq/i0;", "c", "(Lli1/a;Lm2/r;I)V", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "color", "", "progressValue", "e", "(Ler/p;ILm2/r;I)V", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void c(final li1.a aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1235212712);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1235212712, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.airquality.AirQualityWidgetSlot (AirQualityWidgetSlot.kt:14)");
            }
            if (aVar instanceof li1.a.InterfaceC2872a) {
                rVarH.X(-1628438793);
                f.f((li1.a.InterfaceC2872a) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof li1.a.b)) {
                    rVarH.X(-1628440421);
                    rVarH.R();
                    throw new p();
                }
                rVarH.X(-1628436457);
                n.e((li1.a.b) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: ki1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.d(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(li1.a aVar, int i15, r rVar, int i16) {
        c(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void e(er.p<? super r, ? super Integer, Color> pVar, int i15, r rVar, final int i16) {
        int i17;
        final er.p<? super r, ? super Integer, Color> pVar2;
        final int i18;
        r rVarH = rVar.h(2130960290);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.G(pVar) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.c(i15) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (t.k()) {
                t.o(2130960290, i17, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.airquality.WidgetProgressBar (AirQualityWidgetSlot.kt:25)");
            }
            pVar2 = pVar;
            i18 = i15;
            z40.e.d(new z40.a.Bar(null, i18, pVar2, 1, null), rVarH, z40.a.Bar.f232821d);
            if (t.k()) {
                t.n();
            }
        } else {
            pVar2 = pVar;
            i18 = i15;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ki1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.f(pVar2, i18, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(er.p pVar, int i15, int i16, r rVar, int i17) {
        e(pVar, i15, rVar, g4.a(i16 | 1));
        return i0.f148189a;
    }
}
