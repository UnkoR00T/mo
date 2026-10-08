package org.bouncycastle.util;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class IPAddress {
    private static boolean isParseable(String str, int i15, int i16, int i17, int i18, boolean z15, int i19, int i25) {
        int i26 = i16 - i15;
        if ((i26 > i18) || (i26 < 1)) {
            return false;
        }
        if (((i26 > 1) && (!z15)) && Character.digit(str.charAt(i15), i17) <= 0) {
            return false;
        }
        int i27 = 0;
        while (i15 < i16) {
            int i28 = i15 + 1;
            int iDigit = Character.digit(str.charAt(i15), i17);
            if (iDigit < 0) {
                return false;
            }
            i27 = (i27 * i17) + iDigit;
            i15 = i28;
        }
        return (i27 >= i19) & (i27 <= i25);
    }

    private static boolean isParseableIPv4Mask(String str) {
        return isParseable(str, 0, str.length(), 10, 2, false, 0, 32);
    }

    private static boolean isParseableIPv4Octet(String str, int i15, int i16) {
        return isParseable(str, i15, i16, 10, 3, true, 0, GF2Field.MASK);
    }

    private static boolean isParseableIPv6Mask(String str) {
        return isParseable(str, 0, str.length(), 10, 3, false, 1, 128);
    }

    private static boolean isParseableIPv6Segment(String str, int i15, int i16) {
        return isParseable(str, i15, i16, 16, 4, true, 0, 65535);
    }

    public static boolean isValid(String str) {
        return isValidIPv4(str) || isValidIPv6(str);
    }

    public static boolean isValidIPv4(String str) {
        int length = str.length();
        if (length < 7 || length > 15) {
            return false;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < 3; i16++) {
            int iIndexOf = str.indexOf(46, i15);
            if (!isParseableIPv4Octet(str, i15, iIndexOf)) {
                return false;
            }
            i15 = iIndexOf + 1;
        }
        return isParseableIPv4Octet(str, i15, length);
    }

    public static boolean isValidIPv4WithNetmask(String str) {
        int iIndexOf = str.indexOf("/");
        if (iIndexOf < 1) {
            return false;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        return isValidIPv4(strSubstring) && (isValidIPv4(strSubstring2) || isParseableIPv4Mask(strSubstring2));
    }

    public static boolean isValidIPv6(String str) {
        int iIndexOf;
        if (str.length() == 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != ':' && Character.digit(cCharAt, 16) < 0) {
            return false;
        }
        String str2 = str + ":";
        int i15 = 0;
        int i16 = 0;
        boolean z15 = false;
        while (i15 < str2.length() && (iIndexOf = str2.indexOf(58, i15)) >= i15) {
            if (i16 == 8) {
                return false;
            }
            if (i15 != iIndexOf) {
                String strSubstring = str2.substring(i15, iIndexOf);
                if (iIndexOf == str2.length() - 1 && strSubstring.indexOf(46) > 0) {
                    i16++;
                    if (i16 == 8 || !isValidIPv4(strSubstring)) {
                        return false;
                    }
                } else if (!isParseableIPv6Segment(str2, i15, iIndexOf)) {
                    return false;
                }
            } else {
                if (iIndexOf != 1 && iIndexOf != str2.length() - 1 && z15) {
                    return false;
                }
                z15 = true;
            }
            i15 = iIndexOf + 1;
            i16++;
        }
        return i16 == 8 || z15;
    }

    public static boolean isValidIPv6WithNetmask(String str) {
        int iIndexOf = str.indexOf("/");
        if (iIndexOf < 1) {
            return false;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        return isValidIPv6(strSubstring) && (isValidIPv6(strSubstring2) || isParseableIPv6Mask(strSubstring2));
    }

    public static boolean isValidWithNetMask(String str) {
        return isValidIPv4WithNetmask(str) || isValidIPv6WithNetmask(str);
    }
}
