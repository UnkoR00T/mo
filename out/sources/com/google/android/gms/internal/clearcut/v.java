package com.google.android.gms.internal.clearcut;

import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes3.dex */
final class v {
    static int a(int i15, byte[] bArr, int i16, int i17, w wVar) {
        if ((i15 >>> 3) == 0) {
            throw l1.b();
        }
        int i18 = i15 & 7;
        if (i18 == 0) {
            return g(bArr, i16, wVar);
        }
        if (i18 == 1) {
            return i16 + 8;
        }
        if (i18 == 2) {
            return e(bArr, i16, wVar) + wVar.f29577a;
        }
        if (i18 != 3) {
            if (i18 == 5) {
                return i16 + 4;
            }
            throw l1.b();
        }
        int i19 = (i15 & (-8)) | 4;
        int i25 = 0;
        while (i16 < i17) {
            i16 = e(bArr, i16, wVar);
            i25 = wVar.f29577a;
            if (i25 == i19) {
                break;
            }
            i16 = a(i25, bArr, i16, i17, wVar);
        }
        if (i16 > i17 || i25 != i19) {
            throw l1.d();
        }
        return i16;
    }

    static int b(int i15, byte[] bArr, int i16, int i17, k1<?> k1Var, w wVar) {
        g1 g1Var = (g1) k1Var;
        int iE = e(bArr, i16, wVar);
        while (true) {
            g1Var.g(wVar.f29577a);
            if (iE >= i17) {
                break;
            }
            int iE2 = e(bArr, iE, wVar);
            if (i15 != wVar.f29577a) {
                break;
            }
            iE = e(bArr, iE2, wVar);
        }
        return iE;
    }

    static int c(int i15, byte[] bArr, int i16, int i17, v3 v3Var, w wVar) throws l1 {
        if ((i15 >>> 3) == 0) {
            throw l1.b();
        }
        int i18 = i15 & 7;
        if (i18 == 0) {
            int iG = g(bArr, i16, wVar);
            v3Var.e(i15, Long.valueOf(wVar.f29578b));
            return iG;
        }
        if (i18 == 1) {
            v3Var.e(i15, Long.valueOf(k(bArr, i16)));
            return i16 + 8;
        }
        if (i18 == 2) {
            int iE = e(bArr, i16, wVar);
            int i19 = wVar.f29577a;
            v3Var.e(i15, i19 == 0 ? a0.f29117b : a0.n(bArr, iE, i19));
            return iE + i19;
        }
        if (i18 != 3) {
            if (i18 != 5) {
                throw l1.b();
            }
            v3Var.e(i15, Integer.valueOf(h(bArr, i16)));
            return i16 + 4;
        }
        v3 v3VarI = v3.i();
        int i25 = (i15 & (-8)) | 4;
        int i26 = 0;
        while (i16 < i17) {
            int iE2 = e(bArr, i16, wVar);
            i26 = wVar.f29577a;
            if (i26 == i25) {
                i16 = iE2;
                break;
            }
            i16 = c(i26, bArr, iE2, i17, v3VarI, wVar);
        }
        if (i16 > i17 || i26 != i25) {
            throw l1.d();
        }
        v3Var.e(i15, v3VarI);
        return i16;
    }

    static int d(int i15, byte[] bArr, int i16, w wVar) {
        int i17;
        int i18 = i15 & CertificateBody.profileType;
        int i19 = i16 + 1;
        byte b15 = bArr[i16];
        if (b15 >= 0) {
            i17 = b15 << 7;
        } else {
            int i25 = i18 | ((b15 & 127) << 7);
            int i26 = i16 + 2;
            byte b16 = bArr[i19];
            if (b16 >= 0) {
                wVar.f29577a = i25 | (b16 << 14);
                return i26;
            }
            i18 = i25 | ((b16 & 127) << 14);
            i19 = i16 + 3;
            byte b17 = bArr[i26];
            if (b17 >= 0) {
                i17 = b17 << 21;
            } else {
                int i27 = i18 | ((b17 & 127) << 21);
                int i28 = i16 + 4;
                byte b18 = bArr[i19];
                if (b18 >= 0) {
                    wVar.f29577a = i27 | (b18 << 28);
                    return i28;
                }
                int i29 = i27 | ((b18 & 127) << 28);
                while (true) {
                    int i35 = i28 + 1;
                    if (bArr[i28] >= 0) {
                        wVar.f29577a = i29;
                        return i35;
                    }
                    i28 = i35;
                }
            }
        }
        wVar.f29577a = i18 | i17;
        return i19;
    }

    static int e(byte[] bArr, int i15, w wVar) {
        int i16 = i15 + 1;
        byte b15 = bArr[i15];
        if (b15 < 0) {
            return d(b15, bArr, i16, wVar);
        }
        wVar.f29577a = b15;
        return i16;
    }

    static int f(byte[] bArr, int i15, k1<?> k1Var, w wVar) {
        g1 g1Var = (g1) k1Var;
        int iE = e(bArr, i15, wVar);
        int i16 = wVar.f29577a + iE;
        while (iE < i16) {
            iE = e(bArr, iE, wVar);
            g1Var.g(wVar.f29577a);
        }
        if (iE == i16) {
            return iE;
        }
        throw l1.a();
    }

    static int g(byte[] bArr, int i15, w wVar) {
        int i16 = i15 + 1;
        long j15 = bArr[i15];
        if (j15 >= 0) {
            wVar.f29578b = j15;
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
        wVar.f29578b = j16;
        return i17;
    }

    static int h(byte[] bArr, int i15) {
        return ((bArr[i15 + 3] & 255) << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
    }

    static int i(byte[] bArr, int i15, w wVar) {
        int iE = e(bArr, i15, wVar);
        int i16 = wVar.f29577a;
        if (i16 == 0) {
            wVar.f29579c = "";
            return iE;
        }
        wVar.f29579c = new String(bArr, iE, i16, h1.f29350a);
        return iE + i16;
    }

    static int j(byte[] bArr, int i15, w wVar) {
        int iE = e(bArr, i15, wVar);
        int i16 = wVar.f29577a;
        if (i16 == 0) {
            wVar.f29579c = "";
            return iE;
        }
        int i17 = iE + i16;
        if (!d4.i(bArr, iE, i17)) {
            throw l1.e();
        }
        wVar.f29579c = new String(bArr, iE, i16, h1.f29350a);
        return i17;
    }

    static long k(byte[] bArr, int i15) {
        return ((((long) bArr[i15 + 7]) & 255) << 56) | (((long) bArr[i15]) & 255) | ((((long) bArr[i15 + 1]) & 255) << 8) | ((((long) bArr[i15 + 2]) & 255) << 16) | ((((long) bArr[i15 + 3]) & 255) << 24) | ((((long) bArr[i15 + 4]) & 255) << 32) | ((((long) bArr[i15 + 5]) & 255) << 40) | ((((long) bArr[i15 + 6]) & 255) << 48);
    }

    static double l(byte[] bArr, int i15) {
        return Double.longBitsToDouble(k(bArr, i15));
    }

    static int m(byte[] bArr, int i15, w wVar) {
        int iE = e(bArr, i15, wVar);
        int i16 = wVar.f29577a;
        if (i16 == 0) {
            wVar.f29579c = a0.f29117b;
            return iE;
        }
        wVar.f29579c = a0.n(bArr, iE, i16);
        return iE + i16;
    }

    static float n(byte[] bArr, int i15) {
        return Float.intBitsToFloat(h(bArr, i15));
    }
}
