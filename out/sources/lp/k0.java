package lp;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class k0 {
    static String a(int i15) {
        String upperCase = Integer.toString(i15, 16).toUpperCase(Locale.US);
        int length = upperCase.length();
        if (length == 1) {
            return "uni000" + upperCase;
        }
        if (length == 2) {
            return "uni00" + upperCase;
        }
        if (length != 3) {
            return "uni" + upperCase;
        }
        return "uni0" + upperCase;
    }
}
