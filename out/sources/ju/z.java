package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "Lju/x;", "Loq/t;", "result", "", "d", "(Lju/x;Ljava/lang/Object;)Z", "Lju/d2;", "parent", "b", "(Lju/d2;)Lju/x;", "value", "a", "(Ljava/lang/Object;)Lju/x;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z {
    public static final <T> x<T> a(T t15) {
        y yVar = new y(null);
        yVar.d0(t15);
        return yVar;
    }

    public static final <T> x<T> b(d2 d2Var) {
        return new y(d2Var);
    }

    public static /* synthetic */ x c(d2 d2Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            d2Var = null;
        }
        return b(d2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean d(x<T> xVar, Object obj) {
        Throwable thD = oq.t.d(obj);
        return thD == null ? xVar.d0(obj) : xVar.p(thD);
    }
}
