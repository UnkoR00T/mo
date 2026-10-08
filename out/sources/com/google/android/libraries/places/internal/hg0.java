package com.google.android.libraries.places.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class hg0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f32475b = Logger.getLogger(hg0.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f32476a;

    public hg0(Runnable runnable) {
        this.f32476a = (Runnable) zj.p.r(runnable, "task");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f32476a.run();
        } catch (Throwable th4) {
            f32475b.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(String.valueOf(this.f32476a)), th4);
            zj.z.f(th4);
            throw new AssertionError(th4);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f32476a);
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 22);
        sb5.append("LogExceptionRunnable(");
        sb5.append(strValueOf);
        sb5.append(")");
        return sb5.toString();
    }
}
