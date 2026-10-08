package f1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf1/y0;", "state", "", "beyondBoundsItemCount", "Lh1/w;", "a", "(Lf1/y0;ILm2/r;I)Lh1/w;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    public static final p056h1.w a(y0 y0Var, int i15, p076m2.r rVar, int i16) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1877443446, i16, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:27)");
        }
        boolean z15 = ((((i16 & 14) ^ 6) > 4 && rVar.W(y0Var)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) > 32 && rVar.c(i15)) || (i16 & 48) == 32);
        Object objE = rVar.E();
        if (z15 || objE == p076m2.r.INSTANCE.a()) {
            objE = new j(y0Var, i15);
            rVar.v(objE);
        }
        j jVar = (j) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return jVar;
    }
}
