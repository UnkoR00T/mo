package g50;

import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import b50.d;
import d1.r3;
import er.p;
import f3.m;
import f50.e;
import java.util.List;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a1\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\f*\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "Lb50/c;", "items", "Lb50/d;", "state", "Lmx/a;", "additionalContentDescription", "Loq/i0;", "b", "(Ljava/util/List;Lb50/d;Lmx/a;Lm2/r;II)V", "e", "(Lb50/c;Lb50/d;)Lb50/c;", "", "d", "(Lb50/c;Lmx/a;)Ljava/lang/String;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final void b(final List<RadioButtonRow> list, final d dVar, Label label, r rVar, final int i15, final int i16) {
        r rVarH = rVar.h(-726715264);
        int i17 = (i15 & 6) == 0 ? (rVarH.G(list) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 32 : 16;
        }
        int i18 = i16 & 4;
        if (i18 != 0) {
            i17 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(label) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (i18 != 0) {
                label = null;
            }
            if (t.k()) {
                t.o(-726715264, i17, -1, "pl.gov.coi.common.ui.ds.radiobutton.common.radiobuttons.RadioButtons (RadioButtons.kt:17)");
            }
            int i19 = 0;
            for (Object obj : list) {
                int i25 = i19 + 1;
                if (i19 < 0) {
                    v.x();
                }
                RadioButtonRow radioButtonRow = (RadioButtonRow) obj;
                e.e(e(radioButtonRow, dVar), d(radioButtonRow, label), rVarH, 0);
                if (v.p(list) != i19) {
                    rVarH.X(-722254660);
                    r3.a(androidx.compose.foundation.layout.d.i(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing250()), rVarH, 0);
                } else {
                    rVarH.X(-723301716);
                }
                rVarH.R();
                i19 = i25;
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        final Label label2 = label;
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: g50.a
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return b.c(list, dVar, label2, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(List list, d dVar, Label label, int i15, int i16, r rVar, int i17) {
        b(list, dVar, label, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final String d(RadioButtonRow radioButtonRow, Label label) {
        StringBuilder sb5 = new StringBuilder();
        if (label != null) {
            sb5.append(label.getText());
            sb5.append(", ");
        }
        sb5.append(radioButtonRow.getLabel().getText());
        return sb5.toString();
    }

    private static final RadioButtonRow e(RadioButtonRow radioButtonRow, d dVar) {
        return RadioButtonRow.b(radioButtonRow, RadioButtonItemData.b(radioButtonRow.getItem(), false, false, dVar instanceof d.Error, 3, null), null, null, null, null, 30, null);
    }
}
