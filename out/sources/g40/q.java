package g40;

import d1.a3;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmx/a;", AnnotatedPrivateKey.LABEL, "Loq/i0;", "b", "(Lmx/a;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {
    public static final void b(final Label label, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1393245051);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1393245051, i16, -1, "pl.gov.coi.common.ui.ds.datepicker.DatePickerTitle (DatePickerTitle.kt:12)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(a3.q(f3.m.INSTANCE, aVar.b(rVarH, i17).getSpacing300(), aVar.b(rVarH, i17).getSpacing250(), aVar.b(rVarH, i17).getSpacing150(), aVar.b(rVarH, i17).getSpacing200()), null, label, null, null, aVar.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).e(), null, null, false, false, null, rVar2, (i16 << 6) & 896, 0, 0, 33030106);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g40.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.c(label, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(Label label, int i15, p076m2.r rVar, int i16) {
        b(label, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
