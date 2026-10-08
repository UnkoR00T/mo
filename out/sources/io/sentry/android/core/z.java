package io.sentry.android.core;

import android.os.Debug;
import io.sentry.q3;

/* JADX INFO: loaded from: classes4.dex */
public class z implements io.sentry.z0 {
    @Override // io.sentry.z0
    public void c() {
    }

    @Override // io.sentry.z0
    public void d(q3 q3Var) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        q3Var.f(Long.valueOf(jFreeMemory));
        q3Var.g(Long.valueOf(nativeHeapSize));
    }
}
