package d50;

import androidx.compose.foundation.layout.d;
import d1.r3;
import er.p;
import f3.m;
import j70.h;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmx/a;", "description", "Loq/i0;", "b", "(Lmx/a;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final void b(final Label label, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1077949306);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1077949306, i16, -1, "pl.gov.coi.common.ui.ds.radiobutton.common.radiobuttondescription.RadioButtonDescription (RadioButtonDescription.kt:13)");
            }
            if (label == null) {
                rVarH.X(282774523);
                rVarH.R();
                rVar2 = rVarH;
            } else {
                rVarH.X(282774524);
                m.Companion companion = m.INSTANCE;
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                r3.a(d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
                rVar2 = rVarH;
                h.g(null, null, label, null, null, aVar.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
                rVar2.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: d50.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(label, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(Label label, int i15, r rVar, int i16) {
        b(label, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
