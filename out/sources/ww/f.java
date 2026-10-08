package ww;

import n70.BaseTimePickerData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lww/i;", "viewModel", "Loq/i0;", "b", "(Lww/i;Lm2/r;I)V", "Lww/h;", "screenState", "dialog_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void b(final i iVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1605863446);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(iVar) : rVarH.G(iVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1605863446, i16, -1, "pl.gov.coi.common.dialog.timepickerdialog.NavigationTimePickerDialog (NavigationTimePickerDialog.kt:10)");
            }
            h hVarC = c(m7.b.c(iVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(hVarC, h.b.f215494a)) {
                rVarH.X(1341519450);
                rVarH.R();
            } else {
                if (!(hVarC instanceof h.DataSet)) {
                    rVarH.X(1341517190);
                    rVarH.R();
                    throw new p();
                }
                rVarH.X(1341521123);
                n70.f.e(((h.DataSet) hVarC).getDialogData(), rVarH, BaseTimePickerData.f133374h);
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
            d5VarM.a(new er.p() { // from class: ww.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.d(iVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final h c(f6<? extends h> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(i iVar, int i15, r rVar, int i16) {
        b(iVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
