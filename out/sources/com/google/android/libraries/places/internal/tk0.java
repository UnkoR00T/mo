package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
final class tk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f33797a = new AtomicLong();

    tk0() {
    }

    final long a(long j15) {
        return this.f33797a.addAndGet(j15);
    }
}
