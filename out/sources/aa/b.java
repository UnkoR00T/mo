package aa;

import CON.BackEventCompat;
import er.p;
import java.util.UUID;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p088nul.e1;
import tq.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aG\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002,\u0010\t\u001a(\b\u0001\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e*\f\b\u0000\u0010\u000f\"\u00020\u00042\u00020\u0004¨\u0006\u0010"}, d2 = {"", "enabled", "Lkotlin/Function2;", "Lmu/g;", "LCON/b;", "Landroidx/navigation/compose/internal/BackEventCompat;", "Ltq/e;", "Loq/i0;", "", "onBack", "b", "(ZLer/p;Lm2/r;II)V", "", "d", "()Ljava/lang/String;", "BackEventCompat", "navigation-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final void b(final boolean z15, final p<? super g<BackEventCompat>, ? super e<? super i0>, ? extends Object> pVar, r rVar, final int i15, final int i16) {
        int i17;
        r rVarH = rVar.h(1818896922);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i16 & 2) != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i17 & 19) == 18 && rVarH.i()) {
            rVarH.O();
        } else {
            if (i18 != 0) {
                z15 = true;
            }
            if (t.k()) {
                t.o(1818896922, i17, -1, "androidx.navigation.compose.internal.PredictiveBackHandler (NavComposeUtils.android.kt:30)");
            }
            e1.g(z15, pVar, rVarH, i17 & 126, 0);
            if (t.k()) {
                t.n();
            }
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: aa.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(z15, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(boolean z15, p pVar, int i15, int i16, r rVar, int i17) {
        b(z15, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final String d() {
        return UUID.randomUUID().toString();
    }
}
