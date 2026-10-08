package p143z0;

import er.l;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.r;
import p076m2.t;
import p076m2.x5;

/* JADX INFO: renamed from: z0.x2, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "", "consumeScrollDelta", "Lz0/v2;", "b", "(Ler/l;)Lz0/v2;", "c", "(Ler/l;Lm2/r;I)Lz0/v2;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C6466x2 {
    public static final v2 b(l<? super Float, Float> lVar) {
        return new j0(lVar);
    }

    public static final v2 c(l<? super Float, Float> lVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-180460798, i15, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:169)");
        }
        final f6 f6VarP = x5.p(lVar, rVar, i15 & 14);
        Object objE = rVar.E();
        if (objE == r.INSTANCE.a()) {
            objE = b(new l() { // from class: z0.w2
                @Override // er.l
                public final Object b(Object obj) {
                    return Float.valueOf(C6466x2.d(f6VarP, ((Float) obj).floatValue()));
                }
            });
            rVar.v(objE);
        }
        v2 v2Var = (v2) objE;
        if (t.k()) {
            t.n();
        }
        return v2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(f6 f6Var, float f15) {
        return ((Number) ((l) f6Var.getValue()).b(Float.valueOf(f15))).floatValue();
    }
}
