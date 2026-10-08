package w0;

import d1.r3;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf3/m;", "modifier", "Lkotlin/Function1;", "Lp3/f;", "Loq/i0;", "onDraw", "b", "(Lf3/m;Ler/l;Lm2/r;I)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z {
    public static final void b(final f3.m mVar, final er.l<? super p3.f, oq.i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-932836462);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-932836462, i16, -1, "androidx.compose.foundation.Canvas (Canvas.kt:41)");
            }
            r3.a(k3.k.b(mVar, lVar), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: w0.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.c(mVar, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(f3.m mVar, er.l lVar, int i15, p076m2.r rVar, int i16) {
        b(mVar, lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
