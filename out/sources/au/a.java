package au;

import fu.r;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static final String a(String str) {
        char cCharAt;
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb5 = new StringBuilder(str.length());
        sb5.append(Character.toUpperCase(cCharAt));
        sb5.append((CharSequence) str, 1, str.length());
        return sb5.toString();
    }

    public static final String b(String str) {
        char cCharAt;
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        return Character.toLowerCase(cCharAt) + str.substring(1);
    }

    public static final String c(String str, boolean z15) {
        Integer next;
        if (str.length() == 0 || !d(str, 0, z15)) {
            return str;
        }
        if (str.length() == 1 || !d(str, 1, z15)) {
            if (z15) {
                return b(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            return Character.toLowerCase(str.charAt(0)) + str.substring(1);
        }
        Iterator<Integer> it = r.j0(str).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (d(str, next.intValue(), z15));
        Integer num = next;
        if (num == null) {
            return e(str, z15);
        }
        int iIntValue = num.intValue() - 1;
        return e(str.substring(0, iIntValue), z15) + str.substring(iIntValue);
    }

    private static final boolean d(String str, int i15, boolean z15) {
        char cCharAt = str.charAt(i15);
        if (z15) {
            return 'A' <= cCharAt && cCharAt < '[';
        }
        return Character.isUpperCase(cCharAt);
    }

    private static final String e(String str, boolean z15) {
        return z15 ? f(str) : str.toLowerCase(Locale.ROOT);
    }

    public static final String f(String str) {
        StringBuilder sb5 = new StringBuilder(str.length());
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb5.append(cCharAt);
        }
        return sb5.toString();
    }
}
