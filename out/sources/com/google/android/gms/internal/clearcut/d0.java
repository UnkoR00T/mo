package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class d0 extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f29288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f29289f;

    d0(byte[] bArr, int i15, int i16) {
        super(bArr);
        a0.k(i15, i15 + i16, bArr.length);
        this.f29288e = i15;
        this.f29289f = i16;
    }

    @Override // com.google.android.gms.internal.clearcut.h0, com.google.android.gms.internal.clearcut.a0
    public final byte s(int i15) {
        int size = size();
        if (((size - (i15 + 1)) | i15) >= 0) {
            return this.f29349d[this.f29288e + i15];
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
        sb6.append(size);
        throw new ArrayIndexOutOfBoundsException(sb6.toString());
    }

    @Override // com.google.android.gms.internal.clearcut.h0, com.google.android.gms.internal.clearcut.a0
    public final int size() {
        return this.f29289f;
    }

    @Override // com.google.android.gms.internal.clearcut.h0
    protected final int w() {
        return this.f29288e;
    }
}
