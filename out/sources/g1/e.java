package g1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lg1/e1;", "state", "Lh1/w;", "a", "(Lg1/e1;Lm2/r;I)Lh1/w;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final p056h1.w a(e1 e1Var, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2004349821, i15, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:24)");
        }
        boolean z15 = (((i15 & 14) ^ 6) > 4 && rVar.W(e1Var)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z15 || objE == p076m2.r.INSTANCE.a()) {
            objE = new f(e1Var);
            rVar.v(objE);
        }
        f fVar = (f) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return fVar;
    }
}
