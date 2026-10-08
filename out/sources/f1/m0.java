package f1;

import p056h1.l1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lf1/m0;", "", "", "index", "Lkotlin/Function1;", "Loq/i0;", "onPrefetchFinished", "Lh1/l1$b;", "a", "(ILer/l;)Lh1/l1$b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface m0 {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ l1.b b(m0 m0Var, int i15, er.l lVar, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: schedulePrefetch");
        }
        if ((i16 & 2) != 0) {
            lVar = null;
        }
        return m0Var.a(i15, lVar);
    }

    l1.b a(int index, er.l<Object, oq.i0> onPrefetchFinished);
}
