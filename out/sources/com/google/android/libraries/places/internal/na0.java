package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
final class na0 implements ig0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f33050a = new AtomicLong();

    na0() {
    }

    @Override // com.google.android.libraries.places.internal.ig0
    public final void a(long j15) {
        this.f33050a.getAndAdd(1L);
    }
}
