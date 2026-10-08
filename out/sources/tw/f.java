package tw;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltw/g;", "state", "Loq/i0;", "b", "(Ltw/g;Lm2/r;I)V", "dialog_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void b(final g gVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1020430187);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1020430187, i16, -1, "pl.gov.coi.common.dialog.NavigationDialogScreen (NavigationDialogScreen.kt:8)");
            }
            if (fr.t.c(gVar, g.b.f192482a)) {
                rVarH.X(-142691147);
                rVarH.R();
            } else {
                if (!(gVar instanceof g.DataSet)) {
                    rVarH.X(1380868683);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1380871996);
                i40.e.d(((g.DataSet) gVar).getDialogComponentData(), rVarH, i40.a.f89015k);
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
            d5VarM.a(new er.p() { // from class: tw.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.c(gVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(g gVar, int i15, r rVar, int i16) {
        b(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
