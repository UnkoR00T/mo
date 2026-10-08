package y2;

import p071kotlin.Metadata;
import p076m2.d4;
import p076m2.f4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0018"}, d2 = {"", "bits", "slot", "a", "(II)I", "f", "(I)I", "c", "Lm2/d4;", "other", "", "e", "(Lm2/d4;Lm2/d4;)Z", "key", "tracked", "", "block", "Ly2/f;", "b", "(IZLjava/lang/Object;)Ly2/f;", "d", "(IZLjava/lang/Object;Lm2/r;I)Ly2/f;", "Ljava/lang/Object;", "lambdaKey", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f223400a = new Object();

    public static final int a(int i15, int i16) {
        return i15 << (((i16 % 10) * 3) + 1);
    }

    public static final f b(int i15, boolean z15, Object obj) {
        return new l(i15, z15, obj);
    }

    public static final int c(int i15) {
        return a(2, i15);
    }

    public static final f d(int i15, boolean z15, Object obj, p076m2.r rVar, int i16) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1573003438, i16, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1372)");
        }
        Object objE = rVar.E();
        if (objE == p076m2.r.INSTANCE.a()) {
            objE = new l(i15, z15, obj);
            rVar.v(objE);
        }
        l lVar = (l) objE;
        lVar.I(obj);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return lVar;
    }

    public static final boolean e(d4 d4Var, d4 d4Var2) {
        if (d4Var == null) {
            return true;
        }
        if (!(d4Var instanceof f4) || !(d4Var2 instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) d4Var;
        return !f4Var.u() || fr.t.c(d4Var, d4Var2) || fr.t.c(f4Var.getAnchor(), ((f4) d4Var2).getAnchor());
    }

    public static final int f(int i15) {
        return a(1, i15);
    }
}
