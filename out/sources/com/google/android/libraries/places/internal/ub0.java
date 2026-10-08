package com.google.android.libraries.places.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class ub0 implements nm0 {
    ub0() {
    }

    @Override // com.google.android.libraries.places.internal.nm0
    public final long zza() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }
}
