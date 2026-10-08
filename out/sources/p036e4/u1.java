package p036e4;

import er.l;
import f3.m;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf3/m;", "", "minDurationMs", "", "minFractionVisible", "Le4/a0;", "viewportBounds", "Lkotlin/Function1;", "", "Loq/i0;", "callback", "a", "(Lf3/m;JFLe4/a0;Ler/l;)Lf3/m;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u1 {
    public static final m a(m mVar, long j15, float f15, a0 a0Var, l<? super Boolean, i0> lVar) {
        return mVar.u(new t1(j15, f15, a0Var, lVar));
    }

    public static /* synthetic */ m b(m mVar, long j15, float f15, a0 a0Var, l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j15 = 0;
        }
        long j16 = j15;
        if ((i15 & 2) != 0) {
            f15 = 1.0f;
        }
        float f16 = f15;
        if ((i15 & 4) != 0) {
            a0Var = null;
        }
        return a(mVar, j16, f16, a0Var, lVar);
    }
}
