package zj;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int iB;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = charSequence.charAt(i15);
            char cCharAt2 = charSequence2.charAt(i15);
            if (cCharAt != cCharAt2 && ((iB = b(cCharAt)) >= 26 || iB != b(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int b(char c15) {
        return (char) ((c15 | ' ') - 97);
    }

    public static boolean c(char c15) {
        return c15 >= 'a' && c15 <= 'z';
    }

    public static boolean d(char c15) {
        return c15 >= 'A' && c15 <= 'Z';
    }

    public static char e(char c15) {
        return d(c15) ? (char) (c15 ^ ' ') : c15;
    }

    public static String f(String str) {
        int length = str.length();
        int i15 = 0;
        while (i15 < length) {
            if (d(str.charAt(i15))) {
                char[] charArray = str.toCharArray();
                while (i15 < length) {
                    char c15 = charArray[i15];
                    if (d(c15)) {
                        charArray[i15] = (char) (c15 ^ ' ');
                    }
                    i15++;
                }
                return String.valueOf(charArray);
            }
            i15++;
        }
        return str;
    }

    public static String g(String str) {
        int length = str.length();
        int i15 = 0;
        while (i15 < length) {
            if (c(str.charAt(i15))) {
                char[] charArray = str.toCharArray();
                while (i15 < length) {
                    char c15 = charArray[i15];
                    if (c(c15)) {
                        charArray[i15] = (char) (c15 ^ ' ');
                    }
                    i15++;
                }
                return String.valueOf(charArray);
            }
            i15++;
        }
        return str;
    }
}
