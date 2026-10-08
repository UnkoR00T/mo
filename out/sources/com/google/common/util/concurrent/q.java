package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public interface q<V> extends Future<V> {
    void b(Runnable runnable, Executor executor);
}
