package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class qg0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ uh0 f33412a;

    qg0(uh0 uh0Var) {
        Objects.requireNonNull(uh0Var);
        this.f33412a = uh0Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th4) {
        uh0 uh0Var = this.f33412a;
        Logger logger = uh0.f33901d0;
        Level level = Level.SEVERE;
        String strValueOf = String.valueOf(uh0Var.a());
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 59);
        sb5.append("[");
        sb5.append(strValueOf);
        sb5.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", sb5.toString(), th4);
        try {
            uh0Var.c0(th4);
        } catch (Throwable th5) {
            uh0 uh0Var2 = this.f33412a;
            Logger logger2 = uh0.f33901d0;
            Level level2 = Level.SEVERE;
            String strValueOf2 = String.valueOf(uh0Var2.a());
            StringBuilder sb6 = new StringBuilder(strValueOf2.length() + 37);
            sb6.append("[");
            sb6.append(strValueOf2);
            sb6.append("] Uncaught exception while panicking");
            logger2.logp(level2, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", sb6.toString(), th5);
        }
    }
}
