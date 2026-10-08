package fh;

/* JADX INFO: loaded from: classes3.dex */
final class d0 {
    static int a(int i15) {
        return (i15 < 32 ? 4 : 2) * (i15 + 1);
    }

    static int b(Object obj, Object obj2, int i15, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iA = e0.a(obj);
        int i16 = iA & i15;
        int iC = c(obj3, i16);
        if (iC != 0) {
            int i17 = ~i15;
            int i18 = iA & i17;
            int i19 = -1;
            while (true) {
                int i25 = iC - 1;
                int i26 = iArr[i25];
                int i27 = i26 & i15;
                if ((i26 & i17) != i18 || !gl.a(obj, objArr[i25]) || (objArr2 != null && !gl.a(obj2, objArr2[i25]))) {
                    if (i27 == 0) {
                        break;
                    }
                    i19 = i25;
                    iC = i27;
                } else {
                    if (i19 == -1) {
                        e(obj3, i16, i27);
                        return i25;
                    }
                    iArr[i19] = (iArr[i19] & i17) | (i27 & i15);
                    return i25;
                }
            }
        }
        return -1;
    }

    static int c(Object obj, int i15) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i15] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i15] : ((int[]) obj)[i15];
    }

    static Object d(int i15) {
        if (i15 >= 2 && i15 <= 1073741824 && Integer.highestOneBit(i15) == i15) {
            if (i15 <= 256) {
                return new byte[i15];
            }
            return i15 <= 65536 ? new short[i15] : new int[i15];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i15);
    }

    static void e(Object obj, int i15, int i16) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i15] = (byte) i16;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i15] = (short) i16;
        } else {
            ((int[]) obj)[i15] = i16;
        }
    }
}
