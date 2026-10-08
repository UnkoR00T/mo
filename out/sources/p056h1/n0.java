package p056h1;

import b3.i;
import er.p;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lh1/o0;", "itemProvider", "Lh1/d3;", "Lb3/i;", "saveableStateHolder", "", "index", "", "key", "Loq/i0;", "c", "(Lh1/o0;Ljava/lang/Object;ILjava/lang/Object;Lm2/r;I)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final o0 o0Var, final Object obj, final int i15, final Object obj2, r rVar, final int i16) {
        int i17;
        r rVarH = rVar.h(1439843069);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.W(o0Var) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.W(obj) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.c(i15) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= rVarH.W(obj2) ? 2048 : 1024;
        }
        if (rVarH.r((i17 & 1171) != 1170, i17 & 1)) {
            if (t.k()) {
                t.o(1439843069, i17, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:124)");
            }
            ((i) obj).d(obj2, m.d(980966366, true, new p() { // from class: h1.l0
                @Override // er.p
                public final Object B(Object obj3, Object obj4) {
                    return n0.d(o0Var, i15, obj2, (r) obj3, ((Integer) obj4).intValue());
                }
            }, rVarH, 54), rVarH, 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: h1.m0
                @Override // er.p
                public final Object B(Object obj3, Object obj4) {
                    return n0.e(o0Var, obj, i15, obj2, i16, (r) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(o0 o0Var, int i15, Object obj, r rVar, int i16) {
        if (rVar.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(980966366, i16, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:126)");
            }
            o0Var.h(i15, obj, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(o0 o0Var, Object obj, int i15, Object obj2, int i16, r rVar, int i17) {
        c(o0Var, obj, i15, obj2, rVar, g4.a(i16 | 1));
        return i0.f148189a;
    }
}
