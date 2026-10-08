package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
final class av extends cv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30357d;

    /* synthetic */ av(byte[] bArr, int i15, int i16, boolean z15, zu zuVar) {
        super(null);
        this.f30357d = Integer.MAX_VALUE;
        this.f30355b = 0;
    }

    public final int c(int i15) {
        int i16 = this.f30357d;
        this.f30357d = 0;
        int i17 = this.f30355b + this.f30356c;
        this.f30355b = i17;
        if (i17 <= 0) {
            this.f30356c = 0;
            return i16;
        }
        this.f30356c = i17;
        this.f30355b = 0;
        return i16;
    }
}
