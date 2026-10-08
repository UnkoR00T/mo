package org.conscrypt;

/* JADX INFO: loaded from: classes5.dex */
final class AddressUtils {
    private static final int ASCII_CASE_DIFF = 32;
    private static final int IPV4_OCTET_COUNT = 4;
    private static final int IPV6_GROUPS_PER_IPV4 = 2;
    private static final int IPV6_TOTAL_GROUPS = 8;
    private static final int MAX_HEX_DIGITS_PER_GROUP = 4;
    private static final int MAX_IPV4_ADDRESS_LENGTH = 15;
    private static final int MAX_IPV4_DOTS = 3;
    private static final int MAX_IPV4_OCTET_DIGITS = 3;
    private static final int MAX_IPV4_OCTET_VALUE = 255;
    private static final int MIN_IPV4_ADDRESS_LENGTH = 7;

    private AddressUtils() {
    }

    private static boolean asciiEqualsIgnoreCase(String str, String str2) {
        int length = str.length();
        if (length != str2.length()) {
            return false;
        }
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            char cCharAt2 = str2.charAt(i15);
            if (cCharAt != cCharAt2 && toLowerCaseAscii(cCharAt) != toLowerCaseAscii(cCharAt2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDigit(char c15) {
        return c15 >= '0' && c15 <= '9';
    }

    private static boolean isHexDigit(char c15) {
        if (c15 >= '0' && c15 <= '9') {
            return true;
        }
        if (c15 < 'a' || c15 > 'f') {
            return c15 >= 'A' && c15 <= 'F';
        }
        return true;
    }

    static boolean isLiteralIpAddress(String str) {
        if (str.isEmpty()) {
            return false;
        }
        return isValidIPv4(str, 0, str.length(), true) || isValidIPv6(str);
    }

    private static boolean isValidIPv4(String str, int i15, int i16, boolean z15) {
        int i17 = i16 - i15;
        if (i17 >= 7 && i17 <= 15) {
            int i18 = 0;
            int i19 = 0;
            int i25 = 0;
            while (i15 < i16) {
                char cCharAt = str.charAt(i15);
                if (cCharAt == '.') {
                    i18++;
                    if (i19 == 0 || i18 > 3) {
                        return false;
                    }
                    i19 = 0;
                    i25 = 0;
                } else {
                    if (!isDigit(cCharAt) || (!z15 && i19 == 1 && i25 == 0)) {
                        return false;
                    }
                    i25 = (i25 * 10) + (cCharAt - '0');
                    i19++;
                    if (i19 > 3 || i25 > 255) {
                        return false;
                    }
                }
                i15++;
            }
            if (i18 + 1 == 4 && i19 > 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValidIPv6(String str) {
        if (str.indexOf(58) == -1) {
            return false;
        }
        int length = str.length();
        int i15 = 0;
        int i16 = 0;
        boolean z15 = false;
        int i17 = 0;
        int i18 = 0;
        while (i15 < length) {
            char cCharAt = str.charAt(i15);
            if (cCharAt != ':') {
                if (cCharAt == '.') {
                    while (i15 < length && str.charAt(i15) != '%') {
                        i15++;
                    }
                    if ((i15 < length && !isValidZoneId(str, i15 + 1)) || !isValidIPv4(str, i18, i15, false)) {
                        return false;
                    }
                    i17 += 2;
                } else if (cCharAt == '%') {
                    if (!isValidZoneId(str, i15 + 1)) {
                        return false;
                    }
                    if (i16 > 0) {
                        i17++;
                    }
                } else if (!isHexDigit(cCharAt) || (i16 = i16 + 1) > 4) {
                    return false;
                }
                i16 = 0;
                break;
            }
            i18 = i15 + 1;
            if (i18 >= length || str.charAt(i18) != ':') {
                if (i15 == length - 1 || str.charAt(i18) == '%' || i16 == 0 || (i17 = i17 + 1) > 8 || (z15 && i17 >= 8)) {
                    return false;
                }
            } else {
                if (z15) {
                    return false;
                }
                int i19 = i15 + 2;
                if (i19 < length && str.charAt(i19) == ':') {
                    return false;
                }
                if (i16 > 0 && (i17 = i17 + 1) >= 8) {
                    return false;
                }
                i18 = i19;
                i15 = i18;
                z15 = true;
            }
            i16 = 0;
            i15++;
        }
        if (i16 > 0) {
            i17++;
        }
        if (z15) {
            return i17 < 8;
        }
        return i17 == 8;
    }

    static boolean isValidSniHostname(String str) {
        if (str == null) {
            return false;
        }
        return (asciiEqualsIgnoreCase(str, "localhost") || str.indexOf(46) != -1) && !isLiteralIpAddress(str) && !str.endsWith(".") && str.indexOf(0) == -1;
    }

    private static boolean isValidZoneId(String str, int i15) {
        int length = str.length();
        if (i15 >= length) {
            return false;
        }
        while (i15 < length) {
            char cCharAt = str.charAt(i15);
            if (cCharAt == '\n' || cCharAt == '\r' || cCharAt == 133 || cCharAt == 8232 || cCharAt == 8233 || cCharAt == 11 || cCharAt == '\f') {
                return false;
            }
            i15++;
        }
        return true;
    }

    private static char toLowerCaseAscii(char c15) {
        return (c15 < 'A' || c15 > 'Z') ? c15 : (char) (c15 + ' ');
    }
}
