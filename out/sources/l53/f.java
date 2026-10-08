package l53;

import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import x60.BasicPinInputScreenData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ll53/c;", "viewModel", "Loq/i0;", "e", "(Ll53/c;Lm2/r;I)V", "Lx60/c;", "screenData", "c", "(Lx60/c;Lm2/r;I)V", "settings_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void c(final BasicPinInputScreenData basicPinInputScreenData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1227375401);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(basicPinInputScreenData) : rVarH.G(basicPinInputScreenData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1227375401, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.changepin.newpin.NewPinContent (NewPinScreen.kt:24)");
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
            d5VarM.a(new p() { // from class: l53.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.d(basicPinInputScreenData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(BasicPinInputScreenData basicPinInputScreenData, int i15, r rVar, int i16) {
        c(basicPinInputScreenData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void e(final c cVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1761049509);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1761049509, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.changepin.newpin.NewPinScreen (NewPinScreen.kt:16)");
            }
            c(f(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, BasicPinInputScreenData.f216979g);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: l53.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.g(cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final BasicPinInputScreenData f(f6<BasicPinInputScreenData> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c cVar, int i15, r rVar, int i16) {
        e(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
