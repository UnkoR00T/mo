package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public interface f1 {
    void a(long j15);

    void b();

    Future<?> c(Runnable runnable, long j15);

    boolean isClosed();

    Future<?> submit(Runnable runnable);
}
