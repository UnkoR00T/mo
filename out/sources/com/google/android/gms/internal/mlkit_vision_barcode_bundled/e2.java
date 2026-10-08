package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
final class e2 extends i2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f29706e;

    e2(byte[] bArr, int i15, int i16) {
        super(bArr);
        j2.w(i15, i15 + i16, bArr.length);
        this.f29705d = i15;
        this.f29706e = i16;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2
    protected final int R() {
        return this.f29705d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2, com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    public final byte e(int i15) {
        j2.G(i15, this.f29706e);
        return this.f29735c[this.f29705d + i15];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2, com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    final byte f(int i15) {
        return this.f29735c[this.f29705d + i15];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2, com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    public final int h() {
        return this.f29706e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2, com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    protected final void i(byte[] bArr, int i15, int i16, int i17) {
        System.arraycopy(this.f29735c, this.f29705d + i15, bArr, i16, i17);
    }
}
