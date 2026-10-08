package ou;

import java.util.List;
import ju.n2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lou/s;", "", "factories", "Lju/n2;", "e", "(Lou/s;Ljava/util/List;)Lju/n2;", "", "c", "(Lju/n2;)Z", "", "cause", "", "errorHint", "Lou/v;", "a", "(Ljava/lang/Throwable;Ljava/lang/String;)Lou/v;", "", "d", "()Ljava/lang/Void;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {
    private static final v a(Throwable th4, String str) throws Throwable {
        if (th4 != null) {
            throw th4;
        }
        d();
        throw new oq.g();
    }

    static /* synthetic */ v b(Throwable th4, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            th4 = null;
        }
        if ((i15 & 2) != 0) {
            str = null;
        }
        return a(th4, str);
    }

    public static final boolean c(n2 n2Var) {
        return n2Var.d2() instanceof v;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final n2 e(s sVar, List<? extends s> list) {
        try {
            return sVar.b(list);
        } catch (Throwable th4) {
            return a(th4, sVar.a());
        }
    }
}
