package i33;

import d1.r3;
import er.p;
import f3.m;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import u50.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li33/d;", "data", "Loq/i0;", "b", "(Li33/d;Lm2/r;I)V", "sanitary_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final void b(final PhoneAndEmailInputsCustomContentData phoneAndEmailInputsCustomContentData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1023020391);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(phoneAndEmailInputsCustomContentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1023020391, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.methodofcontact.component.PhoneAndEmailInputsCustomContent (MethodOfContactScreenContent.kt:34)");
            }
            v50.c phoneInput = phoneAndEmailInputsCustomContentData.getPhoneInput();
            int i17 = v50.c.f203957t;
            v0.g(phoneInput, null, rVarH, i17, 2);
            r3.a(androidx.compose.foundation.layout.d.i(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
            v0.g(phoneAndEmailInputsCustomContentData.getEmailInput(), null, rVarH, i17, 2);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: i33.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.c(phoneAndEmailInputsCustomContentData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(PhoneAndEmailInputsCustomContentData phoneAndEmailInputsCustomContentData, int i15, r rVar, int i16) {
        b(phoneAndEmailInputsCustomContentData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
