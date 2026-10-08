package p143z0;

import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import p114t0.b1;
import p114t0.d1;
import u0.c0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz0/j2;", "a", "()Lz0/j2;", "Lz0/e1;", "b", "(Lm2/r;I)Lz0/e1;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final j2 a() {
        return new i0(b1.c(n2.i()), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final e1 b(r rVar, int i15) {
        if (t.k()) {
            t.o(162564459, i15, -1, "androidx.compose.foundation.gestures.rememberPlatformDefaultFlingBehavior (Scrollable.android.kt:28)");
        }
        c0 c0VarB = d1.b(rVar, 0);
        boolean zW = rVar.W(c0VarB);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new i0(c0VarB, null, 2, 0 == true ? 1 : 0);
            rVar.v(objE);
        }
        i0 i0Var = (i0) objE;
        if (t.k()) {
            t.n();
        }
        return i0Var;
    }
}
