package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class yg0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final si0 f34400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Executor f34401b;

    yg0(si0 si0Var) {
        this.f34400a = (si0) zj.p.r(si0Var, "executorPool");
    }

    final synchronized Executor a() {
        try {
            if (this.f34401b == null) {
                this.f34401b = (Executor) zj.p.s((Executor) this.f34400a.zza(), "%s.getObject()", this.f34401b);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f34401b;
    }

    final synchronized void c() {
        Executor executor = this.f34401b;
        if (executor != null) {
            this.f34400a.c(executor);
            this.f34401b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a().execute(runnable);
    }
}
