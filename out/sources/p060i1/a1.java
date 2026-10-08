package p060i1;

import p056h1.t1;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li1/i1;", "state", "", "isVertical", "Lh1/t1;", "a", "(Li1/i1;ZLm2/r;I)Lh1/t1;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a1 {
    public static final t1 a(i1 i1Var, boolean z15, r rVar, int i15) {
        if (t.k()) {
            t.o(-786344289, i15, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:26)");
        }
        boolean z16 = ((((i15 & 14) ^ 6) > 4 && rVar.W(i1Var)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && rVar.a(z15)) || (i15 & 48) == 32);
        Object objE = rVar.E();
        if (z16 || objE == r.INSTANCE.a()) {
            objE = l.a(i1Var, z15);
            rVar.v(objE);
        }
        t1 t1Var = (t1) objE;
        if (t.k()) {
            t.n();
        }
        return t1Var;
    }
}
