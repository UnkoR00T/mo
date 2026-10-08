package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ir0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f32606a;

    static {
        rr0 rr0Var = rr0.f33593d;
        f32606a = qr0.a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").b();
        qr0.a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }

    public static /* synthetic */ String a(byte[] bArr, byte[] bArr2, int i15, Object obj) {
        byte[] bArr3 = f32606a;
        int length = bArr.length;
        int i16 = length + 2;
        int i17 = length - (length % 3);
        byte[] bArr4 = new byte[(i16 / 3) * 4];
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17) {
            int i25 = i19 + 3;
            byte b15 = bArr[i18];
            int i26 = i18 + 2;
            byte b16 = bArr[i18 + 1];
            i18 += 3;
            byte b17 = bArr[i26];
            bArr4[i19] = bArr3[(b15 & 255) >> 2];
            bArr4[i19 + 1] = bArr3[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr4[i19 + 2] = bArr3[((b16 & 15) << 2) | ((b17 & 255) >> 6)];
            i19 += 4;
            bArr4[i25] = bArr3[b17 & 63];
        }
        int length2 = bArr.length - i17;
        if (length2 == 1) {
            byte b18 = bArr[i18];
            bArr4[i19] = bArr3[(b18 & 255) >> 2];
            bArr4[i19 + 1] = bArr3[(b18 & 3) << 4];
            bArr4[i19 + 2] = 61;
            bArr4[i19 + 3] = 61;
        } else if (length2 == 2) {
            int i27 = i18 + 1;
            byte b19 = bArr[i18];
            byte b25 = bArr[i27];
            bArr4[i19] = bArr3[(b19 & 255) >> 2];
            bArr4[i19 + 1] = bArr3[((b19 & 3) << 4) | ((b25 & 255) >> 4)];
            bArr4[i19 + 2] = bArr3[(b25 & 15) << 2];
            bArr4[i19 + 3] = 61;
        }
        return hs0.a(bArr4);
    }
}
