package com.google.android.libraries.places.internal;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class ue0 implements em0 {
    ue0() {
    }

    @Override // com.google.android.libraries.places.internal.em0
    public final /* synthetic */ void b(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }

    @Override // com.google.android.libraries.places.internal.em0
    public final /* bridge */ /* synthetic */ Object zzb() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, ze0.d("grpc-timer-%d", true));
        try {
            scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
        } catch (RuntimeException e15) {
            throw e15;
        } catch (Exception e16) {
            throw new RuntimeException(e16);
        }
        return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
    }
}
