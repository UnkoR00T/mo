package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
final class te0 implements em0 {
    te0() {
    }

    @Override // com.google.android.libraries.places.internal.em0
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    public final String toString() {
        return "grpc-default-executor";
    }

    @Override // com.google.android.libraries.places.internal.em0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Executors.newCachedThreadPool(ze0.d("grpc-default-executor-%d", true));
    }
}
