package fa;

import p071kotlin.Metadata;
import p114t0.t0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lt0/t0;", "sharedTransitionScope", "Lfa/v;", "a", "(Lt0/t0;Lm2/r;I)Lfa/v;", "navigation3-ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class w {
    public static final <T> v<T> a(t0 t0Var, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1818575683, i15, -1, "androidx.navigation3.scene.rememberSharedEntryInSceneNavEntryDecorator (SharedEntryInSceneNavEntryDecorator.kt:31)");
        }
        boolean z15 = (((i15 & 14) ^ 6) > 4 && rVar.W(t0Var)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z15 || objE == p076m2.r.INSTANCE.a()) {
            objE = new v(t0Var);
            rVar.v(objE);
        }
        v<T> vVar = (v) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return vVar;
    }
}
