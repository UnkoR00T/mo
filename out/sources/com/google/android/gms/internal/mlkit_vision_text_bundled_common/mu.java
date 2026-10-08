package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes3.dex */
final class mu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f30507a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30508b = 0;

    static int a(byte[] bArr, int i15, lu luVar) throws mw {
        int iK = k(bArr, i15, luVar);
        int i16 = luVar.f30480a;
        if (i16 < 0) {
            throw new mw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i16 > bArr.length - iK) {
            throw new mw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i16 == 0) {
            luVar.f30482c = yu.f30716b;
            return iK;
        }
        luVar.f30482c = yu.o(bArr, iK, i16);
        return iK + i16;
    }

    static int b(int i15, byte[] bArr, int i16, int i17, yv yvVar, aw awVar, ky kyVar, lu luVar) throws mw {
        qv qvVar = yvVar.zbb;
        vy vyVar = awVar.f30359b.f30721b;
        Object objValueOf = null;
        if (vyVar == vy.f30670r) {
            k(bArr, i16, luVar);
            throw null;
        }
        switch (vyVar.ordinal()) {
            case 0:
                i16 += 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(r(bArr, i16)));
                break;
            case 1:
                i16 += 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(c(bArr, i16)));
                break;
            case 2:
            case 3:
                i16 = n(bArr, i16, luVar);
                objValueOf = Long.valueOf(luVar.f30481b);
                break;
            case 4:
            case 12:
                i16 = k(bArr, i16, luVar);
                objValueOf = Integer.valueOf(luVar.f30480a);
                break;
            case 5:
            case 15:
                i16 += 8;
                objValueOf = Long.valueOf(r(bArr, i16));
                break;
            case 6:
            case 14:
                i16 += 4;
                objValueOf = Integer.valueOf(c(bArr, i16));
                break;
            case 7:
                i16 = n(bArr, i16, luVar);
                objValueOf = Boolean.valueOf(luVar.f30481b != 0);
                break;
            case 8:
                i16 = h(bArr, i16, luVar);
                objValueOf = luVar.f30482c;
                break;
            case 9:
                int i18 = ((i15 >>> 3) << 3) | 4;
                ux uxVarB = rx.a().b(awVar.f30358a.getClass());
                Object objF = qvVar.f(awVar.f30359b);
                if (objF == null) {
                    objF = uxVarB.b0();
                    qvVar.j(awVar.f30359b, objF);
                }
                return o(objF, uxVarB, bArr, i16, i17, i18, luVar);
            case 10:
                ux uxVarB2 = rx.a().b(awVar.f30358a.getClass());
                Object objF2 = qvVar.f(awVar.f30359b);
                if (objF2 == null) {
                    objF2 = uxVarB2.b0();
                    qvVar.j(awVar.f30359b, objF2);
                }
                return p(objF2, uxVarB2, bArr, i16, i17, luVar);
            case 11:
                i16 = a(bArr, i16, luVar);
                objValueOf = luVar.f30482c;
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 16:
                i16 = k(bArr, i16, luVar);
                objValueOf = Integer.valueOf(cv.a(luVar.f30480a));
                break;
            case 17:
                i16 = n(bArr, i16, luVar);
                objValueOf = Long.valueOf(cv.b(luVar.f30481b));
                break;
        }
        qvVar.j(awVar.f30359b, objValueOf);
        return i16;
    }

    static int c(byte[] bArr, int i15) {
        int i16 = bArr[i15] & 255;
        int i17 = bArr[i15 + 1] & 255;
        int i18 = bArr[i15 + 2] & 255;
        return ((bArr[i15 + 3] & 255) << 24) | (i17 << 8) | i16 | (i18 << 16);
    }

    static int d(ux uxVar, byte[] bArr, int i15, int i16, int i17, lu luVar) throws mw {
        Object objB0 = uxVar.b0();
        int iO = o(objB0, uxVar, bArr, i15, i16, i17, luVar);
        uxVar.f(objB0);
        luVar.f30482c = objB0;
        return iO;
    }

    static int e(ux uxVar, byte[] bArr, int i15, int i16, lu luVar) throws mw {
        Object objB0 = uxVar.b0();
        int iP = p(objB0, uxVar, bArr, i15, i16, luVar);
        uxVar.f(objB0);
        luVar.f30482c = objB0;
        return iP;
    }

    static int f(ux uxVar, int i15, byte[] bArr, int i16, int i17, jw jwVar, lu luVar) throws mw {
        int iE = e(uxVar, bArr, i16, i17, luVar);
        jwVar.add(luVar.f30482c);
        while (iE < i17) {
            int iK = k(bArr, iE, luVar);
            if (i15 != luVar.f30480a) {
                break;
            }
            iE = e(uxVar, bArr, iK, i17, luVar);
            jwVar.add(luVar.f30482c);
        }
        return iE;
    }

    static int g(byte[] bArr, int i15, jw jwVar, lu luVar) throws mw {
        cw cwVar = (cw) jwVar;
        int iK = k(bArr, i15, luVar);
        int i16 = luVar.f30480a + iK;
        while (iK < i16) {
            iK = k(bArr, iK, luVar);
            cwVar.h(luVar.f30480a);
        }
        if (iK == i16) {
            return iK;
        }
        throw new mw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int h(byte[] bArr, int i15, lu luVar) throws mw {
        int iK = k(bArr, i15, luVar);
        int i16 = luVar.f30480a;
        if (i16 < 0) {
            throw new mw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i16 == 0) {
            luVar.f30482c = "";
            return iK;
        }
        luVar.f30482c = new String(bArr, iK, i16, kw.f30476a);
        return iK + i16;
    }

    static int i(byte[] bArr, int i15, lu luVar) throws mw {
        int i16;
        int iK = k(bArr, i15, luVar);
        int i17 = luVar.f30480a;
        if (i17 < 0) {
            throw new mw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i17 == 0) {
            luVar.f30482c = "";
            return iK;
        }
        int i18 = uy.f30651a;
        int length = bArr.length;
        if ((((length - iK) - i17) | iK | i17) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iK), Integer.valueOf(i17)));
        }
        int i19 = iK + i17;
        char[] cArr = new char[i17];
        int i25 = 0;
        while (iK < i19) {
            byte b15 = bArr[iK];
            if (!sy.d(b15)) {
                break;
            }
            iK++;
            cArr[i25] = (char) b15;
            i25++;
        }
        int i26 = i25;
        while (iK < i19) {
            int i27 = iK + 1;
            byte b16 = bArr[iK];
            if (sy.d(b16)) {
                cArr[i26] = (char) b16;
                i26++;
                iK = i27;
                while (iK < i19) {
                    byte b17 = bArr[iK];
                    if (!sy.d(b17)) {
                        break;
                    }
                    iK++;
                    cArr[i26] = (char) b17;
                    i26++;
                }
            } else {
                if (b16 < -32) {
                    if (i27 >= i19) {
                        throw new mw("Protocol message had invalid UTF-8.");
                    }
                    i16 = i26 + 1;
                    iK += 2;
                    sy.c(b16, bArr[i27], cArr, i26);
                } else if (b16 < -16) {
                    if (i27 >= i19 - 1) {
                        throw new mw("Protocol message had invalid UTF-8.");
                    }
                    i16 = i26 + 1;
                    int i28 = iK + 2;
                    iK += 3;
                    sy.b(b16, bArr[i27], bArr[i28], cArr, i26);
                } else {
                    if (i27 >= i19 - 2) {
                        throw new mw("Protocol message had invalid UTF-8.");
                    }
                    byte b18 = bArr[i27];
                    int i29 = iK + 3;
                    byte b19 = bArr[iK + 2];
                    iK += 4;
                    sy.a(b16, b18, b19, bArr[i29], cArr, i26);
                    i26 += 2;
                }
                i26 = i16;
            }
        }
        luVar.f30482c = new String(cArr, 0, i26);
        return i19;
    }

    static int j(int i15, byte[] bArr, int i16, int i17, ly lyVar, lu luVar) throws mw {
        if ((i15 >>> 3) == 0) {
            throw new mw("Protocol message contained an invalid tag (zero).");
        }
        int i18 = i15 & 7;
        if (i18 == 0) {
            int iN = n(bArr, i16, luVar);
            lyVar.j(i15, Long.valueOf(luVar.f30481b));
            return iN;
        }
        if (i18 == 1) {
            lyVar.j(i15, Long.valueOf(r(bArr, i16)));
            return i16 + 8;
        }
        if (i18 == 2) {
            int iK = k(bArr, i16, luVar);
            int i19 = luVar.f30480a;
            if (i19 < 0) {
                throw new mw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i19 > bArr.length - iK) {
                throw new mw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i19 == 0) {
                lyVar.j(i15, yu.f30716b);
            } else {
                lyVar.j(i15, yu.o(bArr, iK, i19));
            }
            return iK + i19;
        }
        if (i18 != 3) {
            if (i18 != 5) {
                throw new mw("Protocol message contained an invalid tag (zero).");
            }
            lyVar.j(i15, Integer.valueOf(c(bArr, i16)));
            return i16 + 4;
        }
        int i25 = (i15 & (-8)) | 4;
        ly lyVarF = ly.f();
        int i26 = luVar.f30484e + 1;
        luVar.f30484e = i26;
        s(i26);
        int i27 = 0;
        while (i16 < i17) {
            int iK2 = k(bArr, i16, luVar);
            int i28 = luVar.f30480a;
            if (i28 == i25) {
                i27 = i28;
                i16 = iK2;
                break;
            }
            i16 = j(i28, bArr, iK2, i17, lyVarF, luVar);
            i27 = i28;
        }
        luVar.f30484e--;
        if (i16 > i17 || i27 != i25) {
            throw new mw("Failed to parse the message.");
        }
        lyVar.j(i15, lyVarF);
        return i16;
    }

    static int k(byte[] bArr, int i15, lu luVar) {
        int i16 = i15 + 1;
        byte b15 = bArr[i15];
        if (b15 < 0) {
            return l(b15, bArr, i16, luVar);
        }
        luVar.f30480a = b15;
        return i16;
    }

    static int l(int i15, byte[] bArr, int i16, lu luVar) {
        byte b15 = bArr[i16];
        int i17 = i16 + 1;
        int i18 = i15 & CertificateBody.profileType;
        if (b15 >= 0) {
            luVar.f30480a = i18 | (b15 << 7);
            return i17;
        }
        int i19 = i18 | ((b15 & 127) << 7);
        int i25 = i16 + 2;
        byte b16 = bArr[i17];
        if (b16 >= 0) {
            luVar.f30480a = i19 | (b16 << 14);
            return i25;
        }
        int i26 = i19 | ((b16 & 127) << 14);
        int i27 = i16 + 3;
        byte b17 = bArr[i25];
        if (b17 >= 0) {
            luVar.f30480a = i26 | (b17 << 21);
            return i27;
        }
        int i28 = i26 | ((b17 & 127) << 21);
        int i29 = i16 + 4;
        byte b18 = bArr[i27];
        if (b18 >= 0) {
            luVar.f30480a = i28 | (b18 << 28);
            return i29;
        }
        int i35 = i28 | ((b18 & 127) << 28);
        while (true) {
            int i36 = i29 + 1;
            if (bArr[i29] >= 0) {
                luVar.f30480a = i35;
                return i36;
            }
            i29 = i36;
        }
    }

    static int m(int i15, byte[] bArr, int i16, int i17, jw jwVar, lu luVar) {
        cw cwVar = (cw) jwVar;
        int iK = k(bArr, i16, luVar);
        cwVar.h(luVar.f30480a);
        while (iK < i17) {
            int iK2 = k(bArr, iK, luVar);
            if (i15 != luVar.f30480a) {
                break;
            }
            iK = k(bArr, iK2, luVar);
            cwVar.h(luVar.f30480a);
        }
        return iK;
    }

    static int n(byte[] bArr, int i15, lu luVar) {
        long j15 = bArr[i15];
        int i16 = i15 + 1;
        if (j15 >= 0) {
            luVar.f30481b = j15;
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
        luVar.f30481b = j16;
        return i17;
    }

    static int o(Object obj, ux uxVar, byte[] bArr, int i15, int i16, int i17, lu luVar) throws mw {
        int i18 = luVar.f30484e + 1;
        luVar.f30484e = i18;
        s(i18);
        int iY = ((mx) uxVar).y(obj, bArr, i15, i16, i17, luVar);
        luVar.f30484e--;
        luVar.f30482c = obj;
        return iY;
    }

    static int p(Object obj, ux uxVar, byte[] bArr, int i15, int i16, lu luVar) throws mw {
        int iL = i15 + 1;
        int i17 = bArr[i15];
        if (i17 < 0) {
            iL = l(i17, bArr, iL, luVar);
            i17 = luVar.f30480a;
        }
        int i18 = iL;
        if (i17 < 0 || i17 > i16 - i18) {
            throw new mw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i19 = luVar.f30484e + 1;
        luVar.f30484e = i19;
        s(i19);
        int i25 = i18 + i17;
        uxVar.e(obj, bArr, i18, i25, luVar);
        luVar.f30484e--;
        luVar.f30482c = obj;
        return i25;
    }

    static int q(int i15, byte[] bArr, int i16, int i17, lu luVar) throws mw {
        if ((i15 >>> 3) == 0) {
            throw new mw("Protocol message contained an invalid tag (zero).");
        }
        int i18 = i15 & 7;
        if (i18 == 0) {
            return n(bArr, i16, luVar);
        }
        if (i18 == 1) {
            return i16 + 8;
        }
        if (i18 == 2) {
            return k(bArr, i16, luVar) + luVar.f30480a;
        }
        if (i18 != 3) {
            if (i18 == 5) {
                return i16 + 4;
            }
            throw new mw("Protocol message contained an invalid tag (zero).");
        }
        int i19 = (i15 & (-8)) | 4;
        int i25 = 0;
        while (i16 < i17) {
            i16 = k(bArr, i16, luVar);
            i25 = luVar.f30480a;
            if (i25 == i19) {
                break;
            }
            i16 = q(i25, bArr, i16, i17, luVar);
        }
        if (i16 > i17 || i25 != i19) {
            throw new mw("Failed to parse the message.");
        }
        return i16;
    }

    static long r(byte[] bArr, int i15) {
        return (((long) bArr[i15]) & 255) | ((((long) bArr[i15 + 1]) & 255) << 8) | ((((long) bArr[i15 + 2]) & 255) << 16) | ((((long) bArr[i15 + 3]) & 255) << 24) | ((((long) bArr[i15 + 4]) & 255) << 32) | ((((long) bArr[i15 + 5]) & 255) << 40) | ((((long) bArr[i15 + 6]) & 255) << 48) | ((((long) bArr[i15 + 7]) & 255) << 56);
    }

    private static void s(int i15) throws mw {
        if (i15 >= f30507a) {
            throw new mw("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
