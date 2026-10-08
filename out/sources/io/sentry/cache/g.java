package io.sentry.cache;

import io.sentry.j0;
import io.sentry.p5;

/* JADX INFO: loaded from: classes4.dex */
public interface g extends Iterable<p5> {
    @Deprecated
    void Q2(p5 p5Var, j0 j0Var);

    default boolean e3(p5 p5Var, j0 j0Var) {
        Q2(p5Var, j0Var);
        return true;
    }

    void t0(p5 p5Var);
}
