package fu;

import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "", "t", "(Ljava/lang/String;)Ljava/lang/Float;", "", "s", "(Ljava/lang/String;)Ljava/lang/Double;", "", "r", "(Ljava/lang/String;)Z", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class b0 extends a0 {
    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    private static final boolean r(String str) {
        char c15;
        boolean z15;
        boolean z16;
        int i15;
        boolean z17;
        String str2;
        boolean z18;
        boolean z19 = true;
        int length = str.length() - 1;
        int i16 = 0;
        while (true) {
            c15 = ' ';
            if (i16 > length || str.charAt(i16) > ' ') {
                break;
            }
            i16++;
        }
        if (i16 > length) {
            return false;
        }
        while (length > i16 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i16) == '+' || str.charAt(i16) == '-') {
            i16++;
        }
        if (i16 > length) {
            return false;
        }
        if (str.charAt(i16) != '0') {
            z15 = true;
            z16 = false;
        } else {
            int i17 = i16 + 1;
            if (i17 > length) {
                return true;
            }
            if ((str.charAt(i17) | ' ') == 120) {
                int i18 = i16 + 2;
                int i19 = i18;
                while (true) {
                    if (i19 > length) {
                        z15 = z19;
                        break;
                    }
                    char cCharAt = str.charAt(i19);
                    z15 = z19;
                    if (((cCharAt - '0') & 65535) >= 10 && (((cCharAt | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i19++;
                    z19 = z15;
                }
                boolean z25 = i18 != i19 ? z15 : false;
                if (i19 <= length) {
                    if (str.charAt(i19) == '.') {
                        int i25 = i19 + 1;
                        int i26 = i25;
                        while (i26 <= length) {
                            char cCharAt2 = str.charAt(i26);
                            char c16 = c15;
                            if (((cCharAt2 - '0') & 65535) >= 10 && (((cCharAt2 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i26++;
                            c15 = c16;
                        }
                        z18 = i25 != i26 ? z15 : false;
                        i19 = i26;
                    } else {
                        z18 = false;
                    }
                    if (z25 || z18) {
                        i16 = i19;
                    }
                    if (i16 != -1 || i16 > length) {
                        return false;
                    }
                    z16 = z15;
                }
                i16 = -1;
                if (i16 != -1) {
                }
                return false;
            }
            z15 = true;
            z16 = false;
        }
        if (!z16) {
            int i27 = i16;
            while (i27 <= length && ((str.charAt(i27) - '0') & 65535) < 10) {
                i27++;
            }
            boolean z26 = i16 != i27 ? z15 : false;
            if (i27 > length) {
                i16 = i27;
            } else {
                if (str.charAt(i27) == '.') {
                    int i28 = i27 + 1;
                    i15 = i28;
                    while (i15 <= length && ((str.charAt(i15) - '0') & 65535) < 10) {
                        i15++;
                    }
                    if (i28 != i15) {
                        z17 = z15;
                    }
                    if (!z26 || z17) {
                        i16 = i15;
                    } else {
                        if (length == i15 + 2) {
                            str2 = "NaN";
                        } else {
                            str2 = length == i15 + 7 ? "Infinity" : null;
                        }
                        i16 = (str2 != null && g0.n0(str, str2, i15, false) == i15) ? length + 1 : -1;
                    }
                } else {
                    i15 = i27;
                }
                z17 = false;
                if (z26) {
                    i16 = i15;
                } else {
                    i16 = i15;
                }
            }
            if (i16 == -1) {
                return false;
            }
            if (i16 > length) {
                return z15;
            }
        }
        int i29 = i16 + 1;
        int iCharAt = str.charAt(i16) | ' ';
        if (iCharAt != (z16 ? 112 : 101)) {
            if (z16 || (!(iCharAt == 102 || iCharAt == 100) || i29 <= length)) {
                return false;
            }
            return z15;
        }
        if (i29 > length) {
            return false;
        }
        if ((str.charAt(i29) == '+' || str.charAt(i29) == '-') && (i29 = i16 + 2) > length) {
            return false;
        }
        while (i29 <= length && ((str.charAt(i29) - '0') & 65535) < 10) {
            i29++;
        }
        if (i29 > length) {
            return z15;
        }
        if (i29 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i29) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z15;
        }
        return false;
    }

    public static Double s(String str) {
        try {
            if (r(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Float t(String str) {
        try {
            if (r(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
