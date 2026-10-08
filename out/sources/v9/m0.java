package v9;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {
    public static int a(byte[] bArr, int i15, int i16) {
        while (i15 < i16 && bArr[i15] != 71) {
            i15++;
        }
        return i15;
    }

    public static boolean b(byte[] bArr, int i15, int i16, int i17) {
        int i18 = 0;
        for (int i19 = -4; i19 <= 4; i19++) {
            int i25 = (i19 * 188) + i17;
            if (i25 < i15 || i25 >= i16 || bArr[i25] != 71) {
                i18 = 0;
            } else {
                i18++;
                if (i18 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long c(w7.c0 c0Var, int i15, int i16) {
        c0Var.f0(i15);
        if (c0Var.a() < 5) {
            return -9223372036854775807L;
        }
        int iZ = c0Var.z();
        if ((8388608 & iZ) != 0 || ((2096896 & iZ) >> 8) != i16 || (iZ & 32) == 0 || c0Var.Q() < 7 || c0Var.a() < 7 || (c0Var.Q() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c0Var.u(bArr, 0, 6);
        return d(bArr);
    }

    private static long d(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
