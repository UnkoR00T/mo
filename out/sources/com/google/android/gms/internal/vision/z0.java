package com.google.android.gms.internal.vision;

import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes3.dex */
final class z0 {
    static int a(int i15, byte[] bArr, int i16, int i17, a1 a1Var) {
        if ((i15 >>> 3) == 0) {
            throw u2.c();
        }
        int i18 = i15 & 7;
        if (i18 == 0) {
            return k(bArr, i16, a1Var);
        }
        if (i18 == 1) {
            return i16 + 8;
        }
        if (i18 == 2) {
            return i(bArr, i16, a1Var) + a1Var.f30955a;
        }
        if (i18 != 3) {
            if (i18 == 5) {
                return i16 + 4;
            }
            throw u2.c();
        }
        int i19 = (i15 & (-8)) | 4;
        int i25 = 0;
        while (i16 < i17) {
            i16 = i(bArr, i16, a1Var);
            i25 = a1Var.f30955a;
            if (i25 == i19) {
                break;
            }
            i16 = a(i25, bArr, i16, i17, a1Var);
        }
        if (i16 > i17 || i25 != i19) {
            throw u2.e();
        }
        return i16;
    }

    static int b(int i15, byte[] bArr, int i16, int i17, v2<?> v2Var, a1 a1Var) {
        n2 n2Var = (n2) v2Var;
        int i18 = i(bArr, i16, a1Var);
        n2Var.g(a1Var.f30955a);
        while (i18 < i17) {
            int i19 = i(bArr, i18, a1Var);
            if (i15 != a1Var.f30955a) {
                break;
            }
            i18 = i(bArr, i19, a1Var);
            n2Var.g(a1Var.f30955a);
        }
        return i18;
    }

    static int c(int i15, byte[] bArr, int i16, int i17, f5 f5Var, a1 a1Var) {
        if ((i15 >>> 3) == 0) {
            throw u2.c();
        }
        int i18 = i15 & 7;
        if (i18 == 0) {
            int iK = k(bArr, i16, a1Var);
            f5Var.c(i15, Long.valueOf(a1Var.f30956b));
            return iK;
        }
        if (i18 == 1) {
            f5Var.c(i15, Long.valueOf(l(bArr, i16)));
            return i16 + 8;
        }
        if (i18 == 2) {
            int i19 = i(bArr, i16, a1Var);
            int i25 = a1Var.f30955a;
            if (i25 < 0) {
                throw u2.b();
            }
            if (i25 > bArr.length - i19) {
                throw u2.a();
            }
            if (i25 == 0) {
                f5Var.c(i15, e1.f30998b);
            } else {
                f5Var.c(i15, e1.k(bArr, i19, i25));
            }
            return i19 + i25;
        }
        if (i18 != 3) {
            if (i18 != 5) {
                throw u2.c();
            }
            f5Var.c(i15, Integer.valueOf(h(bArr, i16)));
            return i16 + 4;
        }
        f5 f5VarG = f5.g();
        int i26 = (i15 & (-8)) | 4;
        int i27 = 0;
        while (i16 < i17) {
            int i28 = i(bArr, i16, a1Var);
            i27 = a1Var.f30955a;
            if (i27 == i26) {
                i16 = i28;
                break;
            }
            i16 = c(i27, bArr, i28, i17, f5VarG, a1Var);
        }
        if (i16 > i17 || i27 != i26) {
            throw u2.e();
        }
        f5Var.c(i15, f5VarG);
        return i16;
    }

    static int d(int i15, byte[] bArr, int i16, a1 a1Var) {
        int i17 = i15 & CertificateBody.profileType;
        int i18 = i16 + 1;
        byte b15 = bArr[i16];
        if (b15 >= 0) {
            a1Var.f30955a = i17 | (b15 << 7);
            return i18;
        }
        int i19 = i17 | ((b15 & 127) << 7);
        int i25 = i16 + 2;
        byte b16 = bArr[i18];
        if (b16 >= 0) {
            a1Var.f30955a = i19 | (b16 << 14);
            return i25;
        }
        int i26 = i19 | ((b16 & 127) << 14);
        int i27 = i16 + 3;
        byte b17 = bArr[i25];
        if (b17 >= 0) {
            a1Var.f30955a = i26 | (b17 << 21);
            return i27;
        }
        int i28 = i26 | ((b17 & 127) << 21);
        int i29 = i16 + 4;
        byte b18 = bArr[i27];
        if (b18 >= 0) {
            a1Var.f30955a = i28 | (b18 << 28);
            return i29;
        }
        int i35 = i28 | ((b18 & 127) << 28);
        while (true) {
            int i36 = i29 + 1;
            if (bArr[i29] >= 0) {
                a1Var.f30955a = i35;
                return i36;
            }
            i29 = i36;
        }
    }

    static int e(l4<?> l4Var, int i15, byte[] bArr, int i16, int i17, v2<?> v2Var, a1 a1Var) {
        int iG = g(l4Var, bArr, i16, i17, a1Var);
        v2Var.add(a1Var.f30957c);
        while (iG < i17) {
            int i18 = i(bArr, iG, a1Var);
            if (i15 != a1Var.f30955a) {
                break;
            }
            iG = g(l4Var, bArr, i18, i17, a1Var);
            v2Var.add(a1Var.f30957c);
        }
        return iG;
    }

    static int f(l4 l4Var, byte[] bArr, int i15, int i16, int i17, a1 a1Var) {
        y3 y3Var = (y3) l4Var;
        Object objZza = y3Var.zza();
        int iN = y3Var.n(objZza, bArr, i15, i16, i17, a1Var);
        y3Var.a(objZza);
        a1Var.f30957c = objZza;
        return iN;
    }

    static int g(l4 l4Var, byte[] bArr, int i15, int i16, a1 a1Var) {
        int iD = i15 + 1;
        int i17 = bArr[i15];
        if (i17 < 0) {
            iD = d(i17, bArr, iD, a1Var);
            i17 = a1Var.f30955a;
        }
        int i18 = iD;
        if (i17 < 0 || i17 > i16 - i18) {
            throw u2.a();
        }
        Object objZza = l4Var.zza();
        int i19 = i18 + i17;
        l4Var.h(objZza, bArr, i18, i19, a1Var);
        l4Var.a(objZza);
        a1Var.f30957c = objZza;
        return i19;
    }

    static int h(byte[] bArr, int i15) {
        return ((bArr[i15 + 3] & 255) << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
    }

    static int i(byte[] bArr, int i15, a1 a1Var) {
        int i16 = i15 + 1;
        byte b15 = bArr[i15];
        if (b15 < 0) {
            return d(b15, bArr, i16, a1Var);
        }
        a1Var.f30955a = b15;
        return i16;
    }

    static int j(byte[] bArr, int i15, v2<?> v2Var, a1 a1Var) {
        n2 n2Var = (n2) v2Var;
        int i16 = i(bArr, i15, a1Var);
        int i17 = a1Var.f30955a + i16;
        while (i16 < i17) {
            i16 = i(bArr, i16, a1Var);
            n2Var.g(a1Var.f30955a);
        }
        if (i16 == i17) {
            return i16;
        }
        throw u2.a();
    }

    static int k(byte[] bArr, int i15, a1 a1Var) {
        int i16 = i15 + 1;
        long j15 = bArr[i15];
        if (j15 >= 0) {
            a1Var.f30956b = j15;
            return i16;
        }
        int i17 = i15 + 2;
        byte b15 = bArr[i16];
        long j16 = (j15 & 127) | (((long) (b15 & 127)) << 7);
        int i18 = 7;
        while (b15 < 0) {
            int i19 = i17 + 1;
            byte b16 = bArr[i17];
            i18 += 7;
            j16 |= ((long) (b16 & 127)) << i18;
            b15 = b16;
            i17 = i19;
        }
        a1Var.f30956b = j16;
        return i17;
    }

    static long l(byte[] bArr, int i15) {
        return ((((long) bArr[i15 + 7]) & 255) << 56) | (((long) bArr[i15]) & 255) | ((((long) bArr[i15 + 1]) & 255) << 8) | ((((long) bArr[i15 + 2]) & 255) << 16) | ((((long) bArr[i15 + 3]) & 255) << 24) | ((((long) bArr[i15 + 4]) & 255) << 32) | ((((long) bArr[i15 + 5]) & 255) << 40) | ((((long) bArr[i15 + 6]) & 255) << 48);
    }

    static double m(byte[] bArr, int i15) {
        return Double.longBitsToDouble(l(bArr, i15));
    }

    static int n(byte[] bArr, int i15, a1 a1Var) {
        int i16 = i(bArr, i15, a1Var);
        int i17 = a1Var.f30955a;
        if (i17 < 0) {
            throw u2.b();
        }
        if (i17 == 0) {
            a1Var.f30957c = "";
            return i16;
        }
        a1Var.f30957c = new String(bArr, i16, i17, p2.f31222a);
        return i16 + i17;
    }

    static float o(byte[] bArr, int i15) {
        return Float.intBitsToFloat(h(bArr, i15));
    }

    static int p(byte[] bArr, int i15, a1 a1Var) {
        int i16 = i(bArr, i15, a1Var);
        int i17 = a1Var.f30955a;
        if (i17 < 0) {
            throw u2.b();
        }
        if (i17 == 0) {
            a1Var.f30957c = "";
            return i16;
        }
        a1Var.f30957c = l5.k(bArr, i16, i17);
        return i16 + i17;
    }

    static int q(byte[] bArr, int i15, a1 a1Var) {
        int i16 = i(bArr, i15, a1Var);
        int i17 = a1Var.f30955a;
        if (i17 < 0) {
            throw u2.b();
        }
        if (i17 > bArr.length - i16) {
            throw u2.a();
        }
        if (i17 == 0) {
            a1Var.f30957c = e1.f30998b;
            return i16;
        }
        a1Var.f30957c = e1.k(bArr, i16, i17);
        return i16 + i17;
    }
}
