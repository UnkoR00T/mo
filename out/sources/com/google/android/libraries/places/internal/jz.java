package com.google.android.libraries.places.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class jz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f32680a;

    static {
        byte[] bArr = new byte[0];
        f32680a = bArr;
        ByteBuffer.wrap(bArr);
        xx.g(bArr, 0, 0, false);
    }

    public static int a() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(boolean z15) {
        return z15 ? 1231 : 1237;
    }

    static int c(int i15, byte[] bArr, int i16, int i17) {
        for (int i18 = i16; i18 < i16 + i17; i18++) {
            i15 = (i15 * 31) + bArr[i18];
        }
        return i15;
    }
}
