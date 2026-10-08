package p060i1;

import p056h1.w;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li1/i1;", "state", "", "beyondViewportPageCount", "Lh1/w;", "a", "(Li1/i1;ILm2/r;I)Lh1/w;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {
    public static final w a(i1 i1Var, int i15, r rVar, int i16) {
        if (t.k()) {
            t.o(373558254, i16, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z15 = ((((i16 & 14) ^ 6) > 4 && rVar.W(i1Var)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) > 32 && rVar.c(i15)) || (i16 & 48) == 32);
        Object objE = rVar.E();
        if (z15 || objE == r.INSTANCE.a()) {
            objE = new r(i1Var, i15);
            rVar.v(objE);
        }
        r rVar2 = (r) objE;
        if (t.k()) {
            t.n();
        }
        return rVar2;
    }
}
