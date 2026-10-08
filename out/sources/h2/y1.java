package h2;

import androidx.compose.ui.graphics.Color;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.h4;
import p046f2.oo;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import q4.TextStyle;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "contentColor", "Lq4/b4;", "textStyle", "Lkotlin/Function0;", "Loq/i0;", "content", "b", "(JLq4/b4;Ler/p;Lm2/r;I)V", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y1 {
    public static final void b(final long j15, final TextStyle textStyle, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-684938728);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.d(j15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(textStyle) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(pVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-684938728, i16, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:38)");
            }
            p076m2.d0.d(new c4[]{h4.a().d(Color.m0boximpl(j15)), oo.q().d(((TextStyle) rVarH.N(oo.q())).L(textStyle))}, pVar, rVarH, ((i16 >> 3) & 112) | c4.f122821i);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h2.x1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y1.c(j15, textStyle, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(long j15, TextStyle textStyle, er.p pVar, int i15, p076m2.r rVar, int i16) {
        b(j15, textStyle, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
