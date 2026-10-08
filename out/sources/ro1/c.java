package ro1;

import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import x60.BasicPinInputScreenData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lx60/c;", "screenData", "Loq/i0;", "b", "(Lx60/c;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final void b(final BasicPinInputScreenData basicPinInputScreenData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(660116973);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(basicPinInputScreenData) : rVarH.G(basicPinInputScreenData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(660116973, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.biometric.biometricpin.BiometricPinDeveloperScreen (BiometricPinDeveloperScreen.kt:10)");
            }
            w60.d.d(basicPinInputScreenData, rVarH, BasicPinInputScreenData.f216979g);
            q0.g(false, basicPinInputScreenData.m(), rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: ro1.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.c(basicPinInputScreenData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(BasicPinInputScreenData basicPinInputScreenData, int i15, r rVar, int i16) {
        b(basicPinInputScreenData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
