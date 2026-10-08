package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class h1 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f31056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f31057g;

    h1(byte[] bArr, int i15, int i16) {
        super(bArr);
        e1.u(i15, i15 + i16, bArr.length);
        this.f31056f = i15;
        this.f31057g = i16;
    }

    @Override // com.google.android.gms.internal.vision.p1
    protected final int C() {
        return this.f31056f;
    }

    @Override // com.google.android.gms.internal.vision.p1, com.google.android.gms.internal.vision.e1
    public final byte e(int i15) {
        int iF = f();
        if (((iF - (i15 + 1)) | i15) >= 0) {
            return this.f31221e[this.f31056f + i15];
        }
        if (i15 < 0) {
            StringBuilder sb5 = new StringBuilder(22);
            sb5.append("Index < 0: ");
            sb5.append(i15);
            throw new ArrayIndexOutOfBoundsException(sb5.toString());
        }
        StringBuilder sb6 = new StringBuilder(40);
        sb6.append("Index > length: ");
        sb6.append(i15);
        sb6.append(", ");
        sb6.append(iF);
        throw new ArrayIndexOutOfBoundsException(sb6.toString());
    }

    @Override // com.google.android.gms.internal.vision.p1, com.google.android.gms.internal.vision.e1
    public final int f() {
        return this.f31057g;
    }

    @Override // com.google.android.gms.internal.vision.p1, com.google.android.gms.internal.vision.e1
    final byte s(int i15) {
        return this.f31221e[this.f31056f + i15];
    }
}
