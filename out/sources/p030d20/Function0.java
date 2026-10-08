package p030d20;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.v2;
import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: renamed from: d20.h, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "content", "c", "(Ler/p;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void c(final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-811476201);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-811476201, i16, -1, "pl.gov.coi.common.ui.accessibility.TextToolbarWithAccessibilityProvider (TextToolbarWithAccessibilityProvider.kt:9)");
            }
            v2 v2Var = (v2) rVarH.N(g1.s());
            Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new e(v2Var, context);
                rVarH.v(objE);
            }
            d0.c(g1.s().d((e) objE), m.d(1720201175, true, new p() { // from class: d20.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.d(pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: d20.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.e(pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1720201175, i15, -1, "pl.gov.coi.common.ui.accessibility.TextToolbarWithAccessibilityProvider.<anonymous> (TextToolbarWithAccessibilityProvider.kt:20)");
            }
            pVar.B(rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(p pVar, int i15, r rVar, int i16) {
        c(pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
