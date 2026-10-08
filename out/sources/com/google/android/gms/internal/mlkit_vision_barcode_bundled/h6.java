package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
final class h6 {
    static /* bridge */ /* synthetic */ void a(byte b15, byte b16, byte b17, byte b18, char[] cArr, int i15) throws v3 {
        if (e(b16) || (((b15 << 28) + (b16 + 112)) >> 30) != 0 || e(b17) || e(b18)) {
            throw new v3("Protocol message had invalid UTF-8.");
        }
        int i16 = ((b15 & 7) << 18) | ((b16 & 63) << 12) | ((b17 & 63) << 6) | (b18 & 63);
        cArr[i15] = (char) ((i16 >>> 10) + 55232);
        cArr[i15 + 1] = (char) ((i16 & 1023) + 56320);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    static /* bridge */ /* synthetic */ void b(byte b15, byte b16, byte b17, char[] cArr, int i15) throws v3 {
        if (!e(b16)) {
            if (b15 != -32) {
                if (b15 != -19) {
                    if (!e(b17)) {
                        cArr[i15] = (char) (((b15 & 15) << 12) | ((b16 & 63) << 6) | (b17 & 63));
                        return;
                    }
                } else if (b16 < -96) {
                    b15 = -19;
                    if (!e(b17)) {
                        cArr[i15] = (char) (((b15 & 15) << 12) | ((b16 & 63) << 6) | (b17 & 63));
                        return;
                    }
                }
            } else if (b16 >= -96) {
                b15 = -32;
                if (b15 != -19) {
                    if (!e(b17)) {
                        cArr[i15] = (char) (((b15 & 15) << 12) | ((b16 & 63) << 6) | (b17 & 63));
                        return;
                    }
                } else if (b16 < -96) {
                    b15 = -19;
                    if (!e(b17)) {
                        cArr[i15] = (char) (((b15 & 15) << 12) | ((b16 & 63) << 6) | (b17 & 63));
                        return;
                    }
                }
            }
        }
        throw new v3("Protocol message had invalid UTF-8.");
    }

    static /* bridge */ /* synthetic */ void c(byte b15, byte b16, char[] cArr, int i15) throws v3 {
        if (b15 < -62 || e(b16)) {
            throw new v3("Protocol message had invalid UTF-8.");
        }
        cArr[i15] = (char) (((b15 & 31) << 6) | (b16 & 63));
    }

    static /* bridge */ /* synthetic */ boolean d(byte b15) {
        return b15 >= 0;
    }

    private static boolean e(byte b15) {
        return b15 > -65;
    }
}
