package com.google.common.util.concurrent;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {
    public static <V> V a(Future<V> future) {
        V v15;
        boolean z15 = false;
        while (true) {
            try {
                v15 = future.get();
                break;
            } catch (InterruptedException unused) {
                z15 = true;
            } catch (Throwable th4) {
                if (z15) {
                    Thread.currentThread().interrupt();
                }
                throw th4;
            }
        }
        if (z15) {
            Thread.currentThread().interrupt();
        }
        return v15;
    }
}
