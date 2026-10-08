package p056h1;

import er.a;
import f3.m;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001aA\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lf3/m;", "Lkotlin/Function0;", "Lh1/o0;", "itemProviderLambda", "Lh1/t1;", "state", "Lz0/a2;", "orientation", "", "userScrollEnabled", "reverseScrolling", "c", "(Lf3/m;Ler/a;Lh1/t1;Lz0/a2;ZZLm2/r;I)Lf3/m;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "b", "(II)F", "canScrollForward", "a", "(IIZ)F", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u1 {
    public static final float a(int i15, int i16, boolean z15) {
        return z15 ? b(i15, i16) + 100 : b(i15, i16);
    }

    public static final float b(int i15, int i16) {
        return i16 + (i15 * 500);
    }

    public static final m c(m mVar, a<? extends o0> aVar, t1 t1Var, a2 a2Var, boolean z15, boolean z16, r rVar, int i15) {
        if (t.k()) {
            t.o(1070136913, i15, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:48)");
        }
        m mVarU = mVar.u(new v1(aVar, t1Var, a2Var, z15, z16));
        if (t.k()) {
            t.n();
        }
        return mVarU;
    }
}
