package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class bk0 implements Thread.UncaughtExceptionHandler {
    bk0(ll0 ll0Var) {
        Objects.requireNonNull(ll0Var);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th4) {
        throw new p90(l90.b(th4).e("Uncaught exception in the SynchronizationContext. Re-thrown."), null);
    }
}
