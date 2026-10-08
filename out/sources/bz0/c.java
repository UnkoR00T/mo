package bz0;

import androidx.compose.foundation.layout.d;
import d1.r3;
import d40.h;
import er.p;
import f3.m;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbz0/a;", "data", "Loq/i0;", "b", "(Lbz0/a;Lm2/r;I)V", "airquality_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final void b(final PointInfoData pointInfoData, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1685442964);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(pointInfoData) : rVarH.G(pointInfoData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1685442964, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.pointdetails.component.pointinfo.PointInfo (PointInfo.kt:16)");
            }
            h.f(null, pointInfoData.getIconData(), false, rVarH, d40.b.f39676g << 3, 5);
            m.Companion companion = m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(null, null, pointInfoData.getTitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).k(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            j70.h.g(null, null, pointInfoData.getDescriptionLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            j70.h.g(null, null, pointInfoData.getSecondaryDescriptionLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: bz0.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.c(pointInfoData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(PointInfoData pointInfoData, int i15, r rVar, int i16) {
        b(pointInfoData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
