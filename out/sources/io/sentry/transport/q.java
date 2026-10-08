package io.sentry.transport;

import io.sentry.j0;
import io.sentry.p5;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public interface q extends Closeable {
    default void E3(p5 p5Var) {
        R0(p5Var, new j0());
    }

    a0 F();

    void R0(p5 p5Var, j0 j0Var);

    void n(boolean z15);

    void t(long j15);

    default boolean w() {
        return true;
    }
}
