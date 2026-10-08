package h2;

import CON.BackEventCompat;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aG\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002,\u0010\t\u001a(\b\u0001\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b*\f\b\u0000\u0010\f\"\u00020\u00042\u00020\u0004¨\u0006\r"}, d2 = {"", "enabled", "Lkotlin/Function2;", "Lmu/g;", "LCON/b;", "Landroidx/compose/material3/internal/BackEventCompat;", "Ltq/e;", "Loq/i0;", "", "onBack", "b", "(ZLer/p;Lm2/r;II)V", "BackEventCompat", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {
    public static final void b(final boolean z15, final er.p<? super mu.g<BackEventCompat>, ? super tq.e<? super oq.i0>, ? extends Object> pVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(-1437916225);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                z15 = true;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1437916225, i17, -1, "androidx.compose.material3.internal.PredictiveBackHandler (BackHandler.android.kt:32)");
            }
            p088nul.e1.g(z15, pVar, rVarH, i17 & 126, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h2.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.c(z15, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(boolean z15, er.p pVar, int i15, int i16, p076m2.r rVar, int i17) {
        b(z15, pVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
