package e50;

import b50.RadioButtonItemData;
import er.p;
import oq.i0;
import p046f2.kh;
import p046f2.lh;
import p046f2.oh;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import t70.x;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lb50/b;", "data", "Loq/i0;", "b", "(Lb50/b;Lm2/r;I)V", "Landroidx/compose/ui/graphics/Color;", "", "isError", "d", "(JZLm2/r;I)J", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final void b(final RadioButtonItemData radioButtonItemData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1524549133);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(radioButtonItemData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1524549133, i16, -1, "pl.gov.coi.common.ui.ds.radiobutton.common.radiobuttonitem.RadioButtonItem (RadioButtonItem.kt:22)");
            }
            boolean isSelected = radioButtonItemData.getIsSelected();
            boolean enabled = radioButtonItemData.getEnabled();
            x xVar = new x();
            lh lhVar = lh.f56740a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            kh khVarB = lhVar.b(d(aVar.a(rVarH, i17).getBase().c(), radioButtonItemData.getIsError(), rVarH, 0), d(aVar.a(rVarH, i17).getNeutral().a(), radioButtonItemData.getIsError(), rVarH, 0), aVar.a(rVarH, i17).getNeutral().a(), aVar.a(rVarH, i17).getNeutral().f(), rVarH, lh.f56741b << 12, 0);
            rVarH = rVarH;
            oh.c(isSelected, null, null, enabled, khVarB, xVar, rVarH, 48, 4);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: e50.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(radioButtonItemData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(RadioButtonItemData radioButtonItemData, int i15, r rVar, int i16) {
        b(radioButtonItemData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final long d(long j15, boolean z15, r rVar, int i15) {
        if (t.k()) {
            t.o(200165628, i15, -1, "pl.gov.coi.common.ui.ds.radiobutton.common.radiobuttonitem.orRedIfError (RadioButtonItem.kt:43)");
        }
        if (z15) {
            rVar.X(1719675864);
            j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            rVar.R();
        } else {
            rVar.X(1719726456);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return j15;
    }
}
