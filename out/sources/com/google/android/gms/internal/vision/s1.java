package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class s1 extends r1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f31250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f31253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f31255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f31256j;

    private s1(byte[] bArr, int i15, int i16, boolean z15) {
        super();
        this.f31256j = Integer.MAX_VALUE;
        this.f31250d = bArr;
        this.f31252f = i16 + i15;
        this.f31254h = i15;
        this.f31255i = i15;
        this.f31251e = z15;
    }

    private final void f() {
        int i15 = this.f31252f + this.f31253g;
        this.f31252f = i15;
        int i16 = i15 - this.f31255i;
        int i17 = this.f31256j;
        if (i16 <= i17) {
            this.f31253g = 0;
            return;
        }
        int i18 = i16 - i17;
        this.f31253g = i18;
        this.f31252f = i15 - i18;
    }

    @Override // com.google.android.gms.internal.vision.r1
    public final int c(int i15) throws u2 {
        if (i15 < 0) {
            throw u2.b();
        }
        int iE = i15 + e();
        int i16 = this.f31256j;
        if (iE > i16) {
            throw u2.a();
        }
        this.f31256j = iE;
        f();
        return i16;
    }

    @Override // com.google.android.gms.internal.vision.r1
    public final int e() {
        return this.f31254h - this.f31255i;
    }
}
