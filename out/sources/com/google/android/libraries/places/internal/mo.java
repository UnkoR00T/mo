package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class mo implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Executor f32970a;

    public mo(Executor executor) {
        this.f32970a = executor;
    }

    public final void a() {
        this.f32970a = com.google.common.util.concurrent.u.a();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f32970a.execute(runnable);
    }
}
