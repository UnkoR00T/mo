package fu;

import java.util.Locale;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "", "c", "(C)Z", "Ljava/util/Locale;", "locale", "", "e", "(CLjava/util/Locale;)Ljava/lang/String;", "d", "char", "", "radix", "b", "(CI)I", "a", "(I)I", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/CharsKt")
public class b {
    public static int a(int i15) {
        if (2 <= i15 && i15 < 37) {
            return i15;
        }
        throw new IllegalArgumentException("radix " + i15 + " was not in valid range " + new lr.i(2, 36));
    }

    public static final int b(char c15, int i15) {
        return Character.digit((int) c15, i15);
    }

    public static boolean c(char c15) {
        return Character.isWhitespace(c15) || Character.isSpaceChar(c15);
    }

    public static String d(char c15, Locale locale) {
        String strE = e(c15, locale);
        if (strE.length() > 1) {
            if (c15 != 329) {
                return strE.charAt(0) + strE.substring(1).toLowerCase(Locale.ROOT);
            }
        } else if (fr.t.c(strE, String.valueOf(c15).toUpperCase(Locale.ROOT))) {
            return String.valueOf(Character.toTitleCase(c15));
        }
        return strE;
    }

    public static final String e(char c15, Locale locale) {
        return String.valueOf(c15).toUpperCase(locale);
    }
}
