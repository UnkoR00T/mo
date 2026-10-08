package ak;

import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes4.dex */
final class b0 {
    static Object a(int i15) {
        if (i15 >= 2 && i15 <= 1073741824 && Integer.highestOneBit(i15) == i15) {
            if (i15 <= 256) {
                return new byte[i15];
            }
            return i15 <= 65536 ? new short[i15] : new int[i15];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i15);
    }

    static int b(int i15, int i16) {
        return i15 & (~i16);
    }

    static int c(int i15, int i16) {
        return i15 & i16;
    }

    static int d(int i15, int i16, int i17) {
        return (i15 & (~i17)) | (i16 & i17);
    }

    static int e(int i15) {
        return (i15 < 32 ? 4 : 2) * (i15 + 1);
    }

    static int f(Object obj, Object obj2, int i15, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iC = k0.c(obj);
        int i16 = iC & i15;
        int iH = h(obj3, i16);
        if (iH == 0) {
            return -1;
        }
        int iB = b(iC, i15);
        int i17 = -1;
        while (true) {
            int i18 = iH - 1;
            int i19 = iArr[i18];
            if (b(i19, i15) == iB && zj.l.a(obj, objArr[i18]) && (objArr2 == null || zj.l.a(obj2, objArr2[i18]))) {
                int iC2 = c(i19, i15);
                if (i17 == -1) {
                    i(obj3, i16, iC2);
                    return i18;
                }
                iArr[i17] = d(iArr[i17], iC2, i15);
                return i18;
            }
            int iC3 = c(i19, i15);
            if (iC3 == 0) {
                return -1;
            }
            i17 = i18;
            iH = iC3;
        }
    }

    static void g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    static int h(Object obj, int i15) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i15] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i15] & HPKE.aead_EXPORT_ONLY : ((int[]) obj)[i15];
    }

    static void i(Object obj, int i15, int i16) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i15] = (byte) i16;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i15] = (short) i16;
        } else {
            ((int[]) obj)[i15] = i16;
        }
    }

    static int j(int i15) {
        return Math.max(4, k0.a(i15 + 1, 1.0d));
    }
}
