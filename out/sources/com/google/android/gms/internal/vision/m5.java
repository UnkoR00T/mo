package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
abstract class m5 {
    m5() {
    }

    abstract int a(int i15, byte[] bArr, int i16, int i17);

    abstract int b(CharSequence charSequence, byte[] bArr, int i15, int i16);

    final boolean c(byte[] bArr, int i15, int i16) {
        return a(0, bArr, i15, i16) == 0;
    }

    abstract String d(byte[] bArr, int i15, int i16);
}
