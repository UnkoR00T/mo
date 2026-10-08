package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public interface s extends ExecutorService, AutoCloseable {
    <T> q<T> submit(Callable<T> callable);
}
