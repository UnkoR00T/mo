package com.google.android.libraries.places.internal;

import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Locale;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public final class zp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f34532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f34533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f34534c = -1;

    private static InetAddress f(String str, int i15, int i16) {
        InetAddress inetAddress;
        InetAddress inetAddress2;
        byte[] bArr = new byte[16];
        int i17 = 1;
        int i18 = -1;
        int i19 = -1;
        int i25 = 0;
        while (true) {
            InetAddress inetAddress3 = null;
            if (i17 < i16) {
                if (i25 == 16) {
                    return null;
                }
                int i26 = i17 + 2;
                if (i26 > i16 || !str.regionMatches(i17, "::", 0, 2)) {
                    if (i25 == 0) {
                        i19 = i17;
                    } else {
                        if (!str.regionMatches(i17, ":", 0, 1)) {
                            if (!str.regionMatches(i17, ".", 0, 1)) {
                                return null;
                            }
                            int i27 = i25 - 2;
                            int i28 = i27;
                            while (i19 < i16) {
                                if (i28 != 16) {
                                    if (i28 != i27) {
                                        if (str.charAt(i19) == '.') {
                                            i19++;
                                        }
                                    }
                                    int i29 = 0;
                                    int i35 = i19;
                                    while (true) {
                                        if (i35 >= i16) {
                                            inetAddress2 = inetAddress3;
                                            break;
                                        }
                                        char cCharAt = str.charAt(i35);
                                        inetAddress2 = inetAddress3;
                                        if (cCharAt < '0' || cCharAt > '9') {
                                            break;
                                        }
                                        if (i29 == 0) {
                                            if (i19 != i35) {
                                                return inetAddress2;
                                            }
                                            i29 = 0;
                                        }
                                        i29 = ((i29 * 10) + cCharAt) - 48;
                                        if (i29 > 255) {
                                            return inetAddress2;
                                        }
                                        i35++;
                                        inetAddress3 = inetAddress2;
                                    }
                                    if (i35 - i19 == 0) {
                                        return inetAddress2;
                                    }
                                    bArr[i28] = (byte) i29;
                                    inetAddress3 = inetAddress2;
                                    i28++;
                                    i19 = i35;
                                }
                                return inetAddress3;
                            }
                            inetAddress = inetAddress3;
                            if (i28 != i25 + 2) {
                                return inetAddress;
                            }
                            i25 += 2;
                            break;
                        }
                        i19 = i17 + 1;
                    }
                } else {
                    if (i18 != -1) {
                        return null;
                    }
                    i25 += 2;
                    if (i26 == i16) {
                        i18 = i25;
                    } else {
                        i18 = i25;
                        i19 = i26;
                    }
                }
                int i36 = 0;
                i17 = i19;
                while (i17 < i16) {
                    int iD = aq0.d(str.charAt(i17));
                    if (iD == -1) {
                        break;
                    }
                    i17++;
                    i36 = (i36 << 4) + iD;
                }
                int i37 = i17 - i19;
                if (i37 == 0 || i37 > 4) {
                    return 0;
                }
                int i38 = i25 + 1;
                bArr[i25] = (byte) (255 & (i36 >>> 8));
                i25 += 2;
                bArr[i38] = (byte) (i36 & GF2Field.MASK);
            }
            inetAddress = null;
            break;
        }
        if (i25 != 16) {
            if (i18 == -1) {
                return inetAddress;
            }
            int i39 = i25 - i18;
            System.arraycopy(bArr, i18, bArr, 16 - i39, i39);
            Arrays.fill(bArr, i18, (16 - i25) + i18, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public final zp0 a(String str) {
        this.f34532a = "https";
        return this;
    }

    public final zp0 b(String str) {
        int i15;
        String strSubstring;
        if (str == null) {
            throw new IllegalArgumentException("host == null");
        }
        int i16 = 0;
        int iCharCount = 0;
        while (true) {
            int length = str.length();
            i15 = -1;
            if (iCharCount >= length) {
                strSubstring = str.substring(0, length);
                break;
            }
            if (str.charAt(iCharCount) == '%') {
                nr0 nr0Var = new nr0();
                nr0Var.T0(str, 0, iCharCount);
                while (iCharCount < length) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt != 37) {
                        nr0Var.i1(iCodePointAt);
                    } else {
                        int i17 = iCharCount + 2;
                        if (i17 < length) {
                            int iD = aq0.d(str.charAt(iCharCount + 1));
                            int iD2 = aq0.d(str.charAt(i17));
                            if (iD != -1 && iD2 != -1) {
                                nr0Var.b((iD << 4) + iD2);
                                iCharCount = i17;
                                iCodePointAt = 37;
                            }
                        }
                        iCodePointAt = 37;
                        nr0Var.i1(iCodePointAt);
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                strSubstring = nr0Var.c0();
                break;
            }
            iCharCount++;
        }
        String strC0 = null;
        if (strSubstring.startsWith("[") && strSubstring.endsWith("]")) {
            InetAddress inetAddressF = f(strSubstring, 1, strSubstring.length() - 1);
            if (inetAddressF != null) {
                byte[] address = inetAddressF.getAddress();
                if (address.length != 16) {
                    throw new AssertionError();
                }
                int i18 = 0;
                int i19 = 0;
                while (i18 < address.length) {
                    int i25 = i18;
                    while (i25 < 16 && address[i25] == 0 && address[i25 + 1] == 0) {
                        i25 += 2;
                    }
                    int i26 = i25 - i18;
                    int i27 = i26 > i19 ? i26 : i19;
                    if (i26 > i19) {
                        i15 = i18;
                    }
                    i18 = i25 + 2;
                    i19 = i27;
                }
                nr0 nr0Var2 = new nr0();
                while (i16 < address.length) {
                    if (i16 == i15) {
                        nr0Var2.b(58);
                        i16 += i19;
                        if (i16 == 16) {
                            nr0Var2.b(58);
                        }
                    } else {
                        if (i16 > 0) {
                            nr0Var2.b(58);
                        }
                        nr0Var2.y(((address[i16] & 255) << 8) | (address[i16 + 1] & 255));
                        i16 += 2;
                    }
                }
                strC0 = nr0Var2.c0();
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(strSubstring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (true) {
                        if (i16 >= lowerCase.length()) {
                            strC0 = lowerCase;
                            break;
                        }
                        char cCharAt = lowerCase.charAt(i16);
                        if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                            break;
                            break;
                            break;
                        }
                        i16++;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (strC0 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        this.f34533b = strC0;
        return this;
    }

    public final zp0 c(int i15) {
        if (i15 > 0 && i15 <= 65535) {
            this.f34534c = i15;
            return this;
        }
        StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 17);
        sb5.append("unexpected port: ");
        sb5.append(i15);
        throw new IllegalArgumentException(sb5.toString());
    }

    final int d() {
        int i15 = this.f34534c;
        return i15 != -1 ? i15 : aq0.c(this.f34532a);
    }

    public final aq0 e() {
        if (this.f34532a == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.f34533b != null) {
            return new aq0(this, null);
        }
        throw new IllegalStateException("host == null");
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f34532a);
        sb5.append("://");
        if (this.f34533b.indexOf(58) != -1) {
            sb5.append('[');
            sb5.append(this.f34533b);
            sb5.append(']');
        } else {
            sb5.append(this.f34533b);
        }
        int iD = d();
        if (iD != aq0.c(this.f34532a)) {
            sb5.append(':');
            sb5.append(iD);
        }
        return sb5.toString();
    }
}
