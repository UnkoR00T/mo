package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
final class l2 extends n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29754d;

    /* synthetic */ l2(byte[] bArr, int i15, int i16, boolean z15, k2 k2Var) {
        super(null);
        this.f29754d = Integer.MAX_VALUE;
        this.f29752b = 0;
    }

    public final int c(int i15) {
        int i16 = this.f29754d;
        this.f29754d = 0;
        int i17 = this.f29752b + this.f29753c;
        this.f29752b = i17;
        if (i17 <= 0) {
            this.f29753c = 0;
            return i16;
        }
        this.f29753c = i17;
        this.f29752b = 0;
        return i16;
    }
}
