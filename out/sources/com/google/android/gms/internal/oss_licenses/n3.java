package com.google.android.gms.internal.oss_licenses;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
enum n3 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
