package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29366c;

    private j0() {
        this.f29364a = 100;
        this.f29365b = Integer.MAX_VALUE;
        this.f29366c = false;
    }

    public static long a(long j15) {
        return (-(j15 & 1)) ^ (j15 >>> 1);
    }

    static j0 b(byte[] bArr, int i15, int i16, boolean z15) {
        l0 l0Var = new l0(bArr, 0, i16, false);
        try {
            l0Var.d(i16);
            return l0Var;
        } catch (l1 e15) {
            throw new IllegalArgumentException(e15);
        }
    }

    public static int e(int i15) {
        return (-(i15 & 1)) ^ (i15 >>> 1);
    }

    public abstract int c();

    public abstract int d(int i15);
}
