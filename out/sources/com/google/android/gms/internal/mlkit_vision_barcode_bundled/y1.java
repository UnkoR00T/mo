package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes3.dex */
final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f30314a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30315b = 0;

    static int a(byte[] bArr, int i15, x1 x1Var) throws v3 {
        int iJ = j(bArr, i15, x1Var);
        int i16 = x1Var.f30305a;
        if (i16 < 0) {
            throw new v3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i16 > bArr.length - iJ) {
            throw new v3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i16 == 0) {
            x1Var.f30307c = j2.f29738b;
            return iJ;
        }
        x1Var.f30307c = j2.C(bArr, iJ, i16);
        return iJ + i16;
    }

    static int b(int i15, byte[] bArr, int i16, int i17, i3 i3Var, k3 k3Var, y5 y5Var, x1 x1Var) throws v3 {
        b3 b3Var = i3Var.zzb;
        m6 m6Var = k3Var.f29751b.f29741b;
        Object objValueOf = null;
        if (m6Var == m6.f29779q) {
            j(bArr, i16, x1Var);
            throw null;
        }
        switch (m6Var.ordinal()) {
            case 0:
                i16 += 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(q(bArr, i16)));
                break;
            case 1:
                i16 += 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(c(bArr, i16)));
                break;
            case 2:
            case 3:
                i16 = m(bArr, i16, x1Var);
                objValueOf = Long.valueOf(x1Var.f30306b);
                break;
            case 4:
            case 12:
                i16 = j(bArr, i16, x1Var);
                objValueOf = Integer.valueOf(x1Var.f30305a);
                break;
            case 5:
            case 15:
                i16 += 8;
                objValueOf = Long.valueOf(q(bArr, i16));
                break;
            case 6:
            case 14:
                i16 += 4;
                objValueOf = Integer.valueOf(c(bArr, i16));
                break;
            case 7:
                i16 = m(bArr, i16, x1Var);
                objValueOf = Boolean.valueOf(x1Var.f30306b != 0);
                break;
            case 8:
                i16 = h(bArr, i16, x1Var);
                objValueOf = x1Var.f30307c;
                break;
            case 9:
                int i18 = ((i15 >>> 3) << 3) | 4;
                k5 k5VarB = z4.a().b(k3Var.f29750a.getClass());
                Object objE = b3Var.e(k3Var.f29751b);
                if (objE == null) {
                    objE = k5VarB.d();
                    b3Var.i(k3Var.f29751b, objE);
                }
                return n(objE, k5VarB, bArr, i16, i17, i18, x1Var);
            case 10:
                k5 k5VarB2 = z4.a().b(k3Var.f29750a.getClass());
                Object objE2 = b3Var.e(k3Var.f29751b);
                if (objE2 == null) {
                    objE2 = k5VarB2.d();
                    b3Var.i(k3Var.f29751b, objE2);
                }
                return o(objE2, k5VarB2, bArr, i16, i17, x1Var);
            case 11:
                i16 = a(bArr, i16, x1Var);
                objValueOf = x1Var.f30307c;
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 16:
                i16 = j(bArr, i16, x1Var);
                objValueOf = Integer.valueOf(n2.a(x1Var.f30305a));
                break;
            case 17:
                i16 = m(bArr, i16, x1Var);
                objValueOf = Long.valueOf(n2.b(x1Var.f30306b));
                break;
        }
        b3Var.i(k3Var.f29751b, objValueOf);
        return i16;
    }

    static int c(byte[] bArr, int i15) {
        int i16 = bArr[i15] & 255;
        int i17 = bArr[i15 + 1] & 255;
        int i18 = bArr[i15 + 2] & 255;
        return ((bArr[i15 + 3] & 255) << 24) | (i17 << 8) | i16 | (i18 << 16);
    }

    static int d(k5 k5Var, byte[] bArr, int i15, int i16, int i17, x1 x1Var) throws v3 {
        Object objD = k5Var.d();
        int iN = n(objD, k5Var, bArr, i15, i16, i17, x1Var);
        k5Var.u(objD);
        x1Var.f30307c = objD;
        return iN;
    }

    static int e(k5 k5Var, byte[] bArr, int i15, int i16, x1 x1Var) throws v3 {
        Object objD = k5Var.d();
        int iO = o(objD, k5Var, bArr, i15, i16, x1Var);
        k5Var.u(objD);
        x1Var.f30307c = objD;
        return iO;
    }

    static int f(k5 k5Var, int i15, byte[] bArr, int i16, int i17, s3 s3Var, x1 x1Var) throws v3 {
        int iE = e(k5Var, bArr, i16, i17, x1Var);
        s3Var.add(x1Var.f30307c);
        while (iE < i17) {
            int iJ = j(bArr, iE, x1Var);
            if (i15 != x1Var.f30305a) {
                break;
            }
            iE = e(k5Var, bArr, iJ, i17, x1Var);
            s3Var.add(x1Var.f30307c);
        }
        return iE;
    }

    static int g(byte[] bArr, int i15, s3 s3Var, x1 x1Var) throws v3 {
        m3 m3Var = (m3) s3Var;
        int iJ = j(bArr, i15, x1Var);
        int i16 = x1Var.f30305a + iJ;
        while (iJ < i16) {
            iJ = j(bArr, iJ, x1Var);
            m3Var.h(x1Var.f30305a);
        }
        if (iJ == i16) {
            return iJ;
        }
        throw new v3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int h(byte[] bArr, int i15, x1 x1Var) throws v3 {
        int iJ = j(bArr, i15, x1Var);
        int i16 = x1Var.f30305a;
        if (i16 < 0) {
            throw new v3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i16 == 0) {
            x1Var.f30307c = "";
            return iJ;
        }
        x1Var.f30307c = new String(bArr, iJ, i16, t3.f30241a);
        return iJ + i16;
    }

    static int i(int i15, byte[] bArr, int i16, int i17, z5 z5Var, x1 x1Var) throws v3 {
        if ((i15 >>> 3) == 0) {
            throw new v3("Protocol message contained an invalid tag (zero).");
        }
        int i18 = i15 & 7;
        if (i18 == 0) {
            int iM = m(bArr, i16, x1Var);
            z5Var.j(i15, Long.valueOf(x1Var.f30306b));
            return iM;
        }
        if (i18 == 1) {
            z5Var.j(i15, Long.valueOf(q(bArr, i16)));
            return i16 + 8;
        }
        if (i18 == 2) {
            int iJ = j(bArr, i16, x1Var);
            int i19 = x1Var.f30305a;
            if (i19 < 0) {
                throw new v3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i19 > bArr.length - iJ) {
                throw new v3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i19 == 0) {
                z5Var.j(i15, j2.f29738b);
            } else {
                z5Var.j(i15, j2.C(bArr, iJ, i19));
            }
            return iJ + i19;
        }
        if (i18 != 3) {
            if (i18 != 5) {
                throw new v3("Protocol message contained an invalid tag (zero).");
            }
            z5Var.j(i15, Integer.valueOf(c(bArr, i16)));
            return i16 + 4;
        }
        int i25 = (i15 & (-8)) | 4;
        z5 z5VarF = z5.f();
        int i26 = x1Var.f30309e + 1;
        x1Var.f30309e = i26;
        r(i26);
        int i27 = 0;
        while (i16 < i17) {
            int iJ2 = j(bArr, i16, x1Var);
            int i28 = x1Var.f30305a;
            if (i28 == i25) {
                i27 = i28;
                i16 = iJ2;
                break;
            }
            i16 = i(i28, bArr, iJ2, i17, z5VarF, x1Var);
            i27 = i28;
        }
        x1Var.f30309e--;
        if (i16 > i17 || i27 != i25) {
            throw new v3("Failed to parse the message.");
        }
        z5Var.j(i15, z5VarF);
        return i16;
    }

    static int j(byte[] bArr, int i15, x1 x1Var) {
        int i16 = i15 + 1;
        byte b15 = bArr[i15];
        if (b15 < 0) {
            return k(b15, bArr, i16, x1Var);
        }
        x1Var.f30305a = b15;
        return i16;
    }

    static int k(int i15, byte[] bArr, int i16, x1 x1Var) {
        byte b15 = bArr[i16];
        int i17 = i16 + 1;
        int i18 = i15 & CertificateBody.profileType;
        if (b15 >= 0) {
            x1Var.f30305a = i18 | (b15 << 7);
            return i17;
        }
        int i19 = i18 | ((b15 & 127) << 7);
        int i25 = i16 + 2;
        byte b16 = bArr[i17];
        if (b16 >= 0) {
            x1Var.f30305a = i19 | (b16 << 14);
            return i25;
        }
        int i26 = i19 | ((b16 & 127) << 14);
        int i27 = i16 + 3;
        byte b17 = bArr[i25];
        if (b17 >= 0) {
            x1Var.f30305a = i26 | (b17 << 21);
            return i27;
        }
        int i28 = i26 | ((b17 & 127) << 21);
        int i29 = i16 + 4;
        byte b18 = bArr[i27];
        if (b18 >= 0) {
            x1Var.f30305a = i28 | (b18 << 28);
            return i29;
        }
        int i35 = i28 | ((b18 & 127) << 28);
        while (true) {
            int i36 = i29 + 1;
            if (bArr[i29] >= 0) {
                x1Var.f30305a = i35;
                return i36;
            }
            i29 = i36;
        }
    }

    static int l(int i15, byte[] bArr, int i16, int i17, s3 s3Var, x1 x1Var) {
        m3 m3Var = (m3) s3Var;
        int iJ = j(bArr, i16, x1Var);
        m3Var.h(x1Var.f30305a);
        while (iJ < i17) {
            int iJ2 = j(bArr, iJ, x1Var);
            if (i15 != x1Var.f30305a) {
                break;
            }
            iJ = j(bArr, iJ2, x1Var);
            m3Var.h(x1Var.f30305a);
        }
        return iJ;
    }

    static int m(byte[] bArr, int i15, x1 x1Var) {
        long j15 = bArr[i15];
        int i16 = i15 + 1;
        if (j15 >= 0) {
            x1Var.f30306b = j15;
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
        x1Var.f30306b = j16;
        return i17;
    }

    static int n(Object obj, k5 k5Var, byte[] bArr, int i15, int i16, int i17, x1 x1Var) throws v3 {
        int i18 = x1Var.f30309e + 1;
        x1Var.f30309e = i18;
        r(i18);
        int iT = ((u4) k5Var).t(obj, bArr, i15, i16, i17, x1Var);
        x1Var.f30309e--;
        x1Var.f30307c = obj;
        return iT;
    }

    static int o(Object obj, k5 k5Var, byte[] bArr, int i15, int i16, x1 x1Var) throws v3 {
        int iK = i15 + 1;
        int i17 = bArr[i15];
        if (i17 < 0) {
            iK = k(i17, bArr, iK, x1Var);
            i17 = x1Var.f30305a;
        }
        int i18 = iK;
        if (i17 < 0 || i17 > i16 - i18) {
            throw new v3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i19 = x1Var.f30309e + 1;
        x1Var.f30309e = i19;
        r(i19);
        int i25 = i18 + i17;
        k5Var.Y(obj, bArr, i18, i25, x1Var);
        x1Var.f30309e--;
        x1Var.f30307c = obj;
        return i25;
    }

    static int p(int i15, byte[] bArr, int i16, int i17, x1 x1Var) throws v3 {
        if ((i15 >>> 3) == 0) {
            throw new v3("Protocol message contained an invalid tag (zero).");
        }
        int i18 = i15 & 7;
        if (i18 == 0) {
            return m(bArr, i16, x1Var);
        }
        if (i18 == 1) {
            return i16 + 8;
        }
        if (i18 == 2) {
            return j(bArr, i16, x1Var) + x1Var.f30305a;
        }
        if (i18 != 3) {
            if (i18 == 5) {
                return i16 + 4;
            }
            throw new v3("Protocol message contained an invalid tag (zero).");
        }
        int i19 = (i15 & (-8)) | 4;
        int i25 = 0;
        while (i16 < i17) {
            i16 = j(bArr, i16, x1Var);
            i25 = x1Var.f30305a;
            if (i25 == i19) {
                break;
            }
            i16 = p(i25, bArr, i16, i17, x1Var);
        }
        if (i16 > i17 || i25 != i19) {
            throw new v3("Failed to parse the message.");
        }
        return i16;
    }

    static long q(byte[] bArr, int i15) {
        return (((long) bArr[i15]) & 255) | ((((long) bArr[i15 + 1]) & 255) << 8) | ((((long) bArr[i15 + 2]) & 255) << 16) | ((((long) bArr[i15 + 3]) & 255) << 24) | ((((long) bArr[i15 + 4]) & 255) << 32) | ((((long) bArr[i15 + 5]) & 255) << 40) | ((((long) bArr[i15 + 6]) & 255) << 48) | ((((long) bArr[i15 + 7]) & 255) << 56);
    }

    private static void r(int i15) throws v3 {
        if (i15 >= f30314a) {
            throw new v3("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
