package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
final class ul0 extends tl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicIntegerFieldUpdater f33947a;

    /* synthetic */ ul0(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, byte[] bArr) {
        super(null);
        this.f33947a = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.libraries.places.internal.tl0
    public final boolean a(wl0 wl0Var, int i15, int i16) {
        return this.f33947a.compareAndSet(wl0Var, 0, -1);
    }

    @Override // com.google.android.libraries.places.internal.tl0
    public final void b(wl0 wl0Var, int i15) {
        this.f33947a.set(wl0Var, 0);
    }
}
