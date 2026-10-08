package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
final class kl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f32747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f32748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f32749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicInteger f32750d;

    kl0(float f15, float f16) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f32750d = atomicInteger;
        this.f32749c = (int) (f16 * 1000.0f);
        int i15 = (int) (f15 * 1000.0f);
        this.f32747a = i15;
        this.f32748b = i15 / 2;
        atomicInteger.set(i15);
    }

    final boolean a() {
        return this.f32750d.get() > this.f32748b;
    }

    final boolean b() {
        AtomicInteger atomicInteger;
        int i15;
        int i16;
        do {
            atomicInteger = this.f32750d;
            i15 = atomicInteger.get();
            if (i15 == 0) {
                return false;
            }
            i16 = i15 - 1000;
        } while (!atomicInteger.compareAndSet(i15, Math.max(i16, 0)));
        return i16 > this.f32748b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl0)) {
            return false;
        }
        kl0 kl0Var = (kl0) obj;
        return this.f32747a == kl0Var.f32747a && this.f32749c == kl0Var.f32749c;
    }

    public final int hashCode() {
        return zj.l.b(Integer.valueOf(this.f32747a), Integer.valueOf(this.f32749c));
    }
}
