package ec;

import java.util.concurrent.Executor;
import ju.l0;
import ju.v1;

/* JADX INFO: loaded from: classes3.dex */
public interface b {
    Executor a();

    default l0 b() {
        return v1.b(c());
    }

    a c();

    default void d(Runnable runnable) {
        c().execute(runnable);
    }
}
