package b0;

import java.util.concurrent.Executor;
import v.h3;
import v.p1;

/* JADX INFO: loaded from: classes.dex */
public interface s extends h3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p1.a<Executor> f15617d = p1.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    default Executor f0(Executor executor) {
        return (Executor) f(f15617d, executor);
    }
}
