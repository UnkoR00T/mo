package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class gp {
    public static boolean a(int i15) {
        if (i15 <= 126) {
            return i15 >= 32 || i15 == 10 || i15 == 13 || i15 == 9 || i15 == 12;
        }
        if (i15 < 55296) {
            return i15 >= 160;
        }
        if (i15 < 64976) {
            return i15 > 57343;
        }
        return i15 > 65007 && (i15 & 65534) != 65534 && i15 <= 1114111;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0035  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:54:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x003d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x006e A[SYNTHETIC] */
    public static String b(String str, int i15) {
        int length;
        StringBuilder sb5;
        char cCharAt;
        int iCodePointAt;
        int i16;
        int iCodePointAt2;
        int length2 = str.length();
        int iCharCount = 0;
        int i17 = 0;
        while (i17 != length2) {
            int i18 = i17 + 1;
            char cCharAt2 = str.charAt(i17);
            if (cCharAt2 <= '~') {
                if (cCharAt2 < ' ') {
                    if (cCharAt2 < 55296) {
                        if (cCharAt2 > 57343) {
                            iCodePointAt2 = Character.codePointAt(str, i17);
                            if (iCodePointAt2 < 65536 && (iCodePointAt2 & 65534) != 65534) {
                                i17 += 2;
                            }
                        } else if (cCharAt2 >= 64976 && (cCharAt2 <= 65007 || cCharAt2 >= 65534)) {
                        }
                        length = str.length();
                        sb5 = new StringBuilder(length);
                        while (iCharCount < length) {
                            cCharAt = str.charAt(iCharCount);
                            if (a(cCharAt)) {
                                sb5.append(cCharAt);
                                iCharCount++;
                            } else {
                                iCodePointAt = Character.codePointAt(str, iCharCount);
                                if (true != a(iCodePointAt)) {
                                    i16 = 65533;
                                } else {
                                    i16 = iCodePointAt;
                                }
                                sb5.appendCodePoint(i16);
                                iCharCount += Character.charCount(iCodePointAt);
                            }
                        }
                        return sb5.toString();
                    }
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != '\t' && cCharAt2 != '\f') {
                        length = str.length();
                        sb5 = new StringBuilder(length);
                        while (iCharCount < length) {
                            cCharAt = str.charAt(iCharCount);
                            if (a(cCharAt)) {
                                sb5.append(cCharAt);
                                iCharCount++;
                            } else {
                                iCodePointAt = Character.codePointAt(str, iCharCount);
                                if (true != a(iCodePointAt)) {
                                    i16 = 65533;
                                } else {
                                    i16 = iCodePointAt;
                                }
                                sb5.appendCodePoint(i16);
                                iCharCount += Character.charCount(iCodePointAt);
                            }
                        }
                        return sb5.toString();
                    }
                }
            } else if (cCharAt2 >= 55296 || cCharAt2 < 160) {
                if (cCharAt2 < 55296) {
                    if (cCharAt2 > 57343) {
                        iCodePointAt2 = Character.codePointAt(str, i17);
                        if (iCodePointAt2 < 65536) {
                        }
                    } else if (cCharAt2 >= 64976) {
                    }
                    length = str.length();
                    sb5 = new StringBuilder(length);
                    while (iCharCount < length) {
                        cCharAt = str.charAt(iCharCount);
                        if (a(cCharAt)) {
                            sb5.append(cCharAt);
                            iCharCount++;
                        } else {
                            iCodePointAt = Character.codePointAt(str, iCharCount);
                            if (true != a(iCodePointAt)) {
                                i16 = 65533;
                            } else {
                                i16 = iCodePointAt;
                            }
                            sb5.appendCodePoint(i16);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return sb5.toString();
                }
                if (cCharAt2 != '\n') {
                    length = str.length();
                    sb5 = new StringBuilder(length);
                    while (iCharCount < length) {
                        cCharAt = str.charAt(iCharCount);
                        if (a(cCharAt)) {
                            sb5.append(cCharAt);
                            iCharCount++;
                        } else {
                            iCodePointAt = Character.codePointAt(str, iCharCount);
                            if (true != a(iCodePointAt)) {
                                i16 = 65533;
                            } else {
                                i16 = iCodePointAt;
                            }
                            sb5.appendCodePoint(i16);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return sb5.toString();
                }
            }
            i17 = i18;
        }
        return str;
    }
}
