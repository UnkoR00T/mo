package l32;

import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Loq/i0;", "b", "(Lm2/r;I)V", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final void b(r rVar, final int i15) {
        r rVarH = rVar.h(-317734166);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (t.k()) {
                t.o(-317734166, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.start.StartScreen (StartScreen.kt:5)");
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: l32.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.c(i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(int i15, r rVar, int i16) {
        b(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
