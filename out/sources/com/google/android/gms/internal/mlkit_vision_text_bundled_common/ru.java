package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
final class ru extends xu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30577d;

    ru(byte[] bArr, int i15, int i16) {
        super(bArr);
        yu.k(0, i16, bArr.length);
        this.f30577d = i16;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xu, com.google.android.gms.internal.mlkit_vision_text_bundled_common.yu
    public final byte e(int i15) {
        int i16 = this.f30577d;
        if (((i16 - (i15 + 1)) | i15) >= 0) {
            return this.f30702c[i15];
        }
        if (i15 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i15);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i15 + ", " + i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xu, com.google.android.gms.internal.mlkit_vision_text_bundled_common.yu
    final byte f(int i15) {
        return this.f30702c[i15];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xu, com.google.android.gms.internal.mlkit_vision_text_bundled_common.yu
    public final int g() {
        return this.f30577d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xu
    protected final int s() {
        return 0;
    }
}
