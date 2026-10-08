package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f31244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31246c;

    private r1() {
        this.f31244a = 100;
        this.f31245b = Integer.MAX_VALUE;
        this.f31246c = false;
    }

    public static long a(long j15) {
        return (-(j15 & 1)) ^ (j15 >>> 1);
    }

    static r1 b(byte[] bArr, int i15, int i16, boolean z15) {
        s1 s1Var = new s1(bArr, i16);
        try {
            s1Var.c(i16);
            return s1Var;
        } catch (u2 e15) {
            throw new IllegalArgumentException(e15);
        }
    }

    public static int d(int i15) {
        return (-(i15 & 1)) ^ (i15 >>> 1);
    }

    public abstract int c(int i15);

    public abstract int e();
}
