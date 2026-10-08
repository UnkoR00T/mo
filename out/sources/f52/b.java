package f52;

import androidx.compose.foundation.layout.d;
import d1.a3;
import d1.e0;
import d1.i;
import d1.i0;
import d1.r3;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import g52.StampDutyEmptySectionData;
import j70.h;
import mx.Label;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lg52/a;", "stampDutyEmptySectionData", "Loq/i0;", "b", "(Lg52/a;Lm2/r;I)V", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final void b(final StampDutyEmptySectionData stampDutyEmptySectionData, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(679925499);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(stampDutyEmptySectionData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(679925499, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.common.StampDutyEmptySection (StampDutyEmptySection.kt:19)");
            }
            m.Companion companion = m.INSTANCE;
            m mVarF = d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarP = a3.p(mVarF, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 1, null);
            w0 w0VarA = e0.a(i.f39152a.e(), c.INSTANCE.g(), rVarH, 54);
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            i0 i0Var = i0.f39176a;
            Label title = stampDutyEmptySectionData.getTitle();
            b5.j.Companion companion3 = b5.j.INSTANCE;
            rVar2 = rVarH;
            h.g(null, null, title, null, null, aVar.a(rVarH, i17).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33026011);
            r3.a(d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            h.g(null, null, stampDutyEmptySectionData.getSubtitle(), null, null, aVar.a(rVar2, i17).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar2, 0, 0, 0, 33550299);
            r3.a(d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            h.g(null, null, stampDutyEmptySectionData.getDescription(), null, null, aVar.a(rVar2, i17).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar2, 0, 0, 0, 33550299);
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
            d5VarM.a(new p() { // from class: f52.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(stampDutyEmptySectionData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(StampDutyEmptySectionData stampDutyEmptySectionData, int i15, r rVar, int i16) {
        b(stampDutyEmptySectionData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
