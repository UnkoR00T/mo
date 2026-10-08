package ju;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\t*\f\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001¨\u0006\u000b"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lju/t1;", "c", "(Ljava/util/concurrent/ExecutorService;)Lju/t1;", "Ljava/util/concurrent/Executor;", "Lju/l0;", "b", "(Ljava/util/concurrent/Executor;)Lju/l0;", "a", "(Lju/l0;)Ljava/util/concurrent/Executor;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v1 {
    public static final Executor a(l0 l0Var) {
        Executor executorD2;
        t1 t1Var = l0Var instanceof t1 ? (t1) l0Var : null;
        return (t1Var == null || (executorD2 = t1Var.getExecutor()) == null) ? new f1(l0Var) : executorD2;
    }

    public static final l0 b(Executor executor) {
        l0 l0Var;
        f1 f1Var = executor instanceof f1 ? (f1) executor : null;
        return (f1Var == null || (l0Var = f1Var.dispatcher) == null) ? new u1(executor) : l0Var;
    }

    public static final t1 c(ExecutorService executorService) {
        return new u1(executorService);
    }
}
