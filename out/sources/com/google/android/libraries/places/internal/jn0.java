package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
final class jn0 implements em0 {
    jn0() {
    }

    @Override // com.google.android.libraries.places.internal.em0
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    @Override // com.google.android.libraries.places.internal.em0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Executors.newCachedThreadPool(ze0.d("grpc-okhttp-%d", true));
    }
}
