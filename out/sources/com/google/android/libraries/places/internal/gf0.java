package com.google.android.libraries.places.internal;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class gf0 implements nm0 {
    gf0() {
    }

    @Override // com.google.android.libraries.places.internal.nm0
    public final long zza() {
        Instant instantNow = Instant.now();
        return ck.d.d(TimeUnit.SECONDS.toNanos(instantNow.getEpochSecond()), instantNow.getNano());
    }
}
