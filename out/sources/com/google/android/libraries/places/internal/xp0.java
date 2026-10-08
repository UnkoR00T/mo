package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class xp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f34306b = new int[10];

    public final xp0 a(int i15, int i16, int i17) {
        if (i15 >= 10) {
            return this;
        }
        this.f34305a = (1 << i15) | this.f34305a;
        this.f34306b[i15] = i17;
        return this;
    }

    public final boolean b(int i15) {
        return ((1 << i15) & this.f34305a) != 0;
    }

    public final int c(int i15) {
        return this.f34306b[i15];
    }

    final int d() {
        return Integer.bitCount(this.f34305a);
    }

    final int e() {
        if ((this.f34305a & 2) != 0) {
            return this.f34306b[1];
        }
        return -1;
    }

    final int f(int i15) {
        return (this.f34305a & 32) != 0 ? this.f34306b[5] : i15;
    }
}
