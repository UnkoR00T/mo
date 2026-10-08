package q30;

import d1.r3;
import f3.m;
import mx.Label;
import oq.i0;
import oq.p;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lr30/b;", "type", "Loq/i0;", "b", "(Lr30/b;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final void b(final r30.b bVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1626821784);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1626821784, i16, -1, "pl.gov.coi.common.ui.ds.checkbox.common.CheckBoxBottomText (CheckBoxBottomText.kt:12)");
            }
            String str = null;
            if (bVar instanceof r30.b.Error) {
                rVarH.X(-236685928);
                r30.b.Error error = (r30.b.Error) bVar;
                Label errorText = error.getErrorText();
                if (errorText == null) {
                    rVarH.X(-236685929);
                    rVarH.R();
                } else {
                    rVarH.X(-236685928);
                    r3.a(androidx.compose.foundation.layout.d.i(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
                    String testTag = error.getTestTag();
                    if (testTag != null) {
                        str = testTag + "ErrorText";
                    }
                    l40.d.d(str, errorText, true, rVarH, MLKEMEngine.KyberPolyBytes, 0);
                    rVarH.R();
                    i0 i0Var = i0.f148189a;
                }
                rVarH.R();
            } else if (bVar instanceof r30.b.Helper) {
                rVarH.X(-7625723);
                r30.b.Helper helper = (r30.b.Helper) bVar;
                if (helper.getHelperText().l()) {
                    rVarH.X(-236364737);
                    r3.a(androidx.compose.foundation.layout.d.i(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
                    String testTag2 = helper.getTestTag();
                    if (testTag2 != null) {
                        str = testTag2 + "HelperText";
                    }
                    p40.b.b(str, helper.getHelperText(), true, rVarH, MLKEMEngine.KyberPolyBytes, 0);
                } else {
                    rVarH.X(-237248454);
                }
                rVarH.R();
                rVarH.R();
            } else {
                if (!(bVar instanceof r30.b.a)) {
                    rVarH.X(-7636501);
                    rVarH.R();
                    throw new p();
                }
                rVarH.X(-7615828);
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
            d5VarM.a(new er.p() { // from class: q30.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(bVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(r30.b bVar, int i15, r rVar, int i16) {
        b(bVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
