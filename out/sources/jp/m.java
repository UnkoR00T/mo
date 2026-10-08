package jp;

import java.nio.CharBuffer;
import java.text.Normalizer;

/* JADX INFO: loaded from: classes4.dex */
class m {
    private static boolean a(char c15) {
        return (c15 >= 0 && c15 <= 31) || c15 == 127;
    }

    private static boolean b(int i15) {
        return i15 == 832 || i15 == 833 || i15 == 8206 || i15 == 8207 || i15 == 8234 || i15 == 8235 || i15 == 8236 || i15 == 8237 || i15 == 8238 || i15 == 8298 || i15 == 8299 || i15 == 8300 || i15 == 8301 || i15 == 8302 || i15 == 8303;
    }

    private static boolean c(int i15) {
        return 12272 <= i15 && i15 <= 12283;
    }

    private static boolean d(int i15) {
        return i15 == 65529 || i15 == 65530 || i15 == 65531 || i15 == 65532 || i15 == 65533;
    }

    private static boolean e(char c15) {
        if (c15 == 173 || c15 == 847 || c15 == 6150 || c15 == 6155 || c15 == 6156 || c15 == 6157 || c15 == 8203 || c15 == 8204 || c15 == 8205 || c15 == 8288) {
            return true;
        }
        return (65024 <= c15 && c15 <= 65039) || c15 == 65279;
    }

    private static boolean f(int i15) {
        if ((128 <= i15 && i15 <= 159) || i15 == 1757 || i15 == 1807 || i15 == 6158 || i15 == 8204 || i15 == 8205 || i15 == 8232 || i15 == 8233 || i15 == 8288 || i15 == 8289 || i15 == 8290 || i15 == 8291) {
            return true;
        }
        if ((8298 <= i15 && i15 <= 8303) || i15 == 65279) {
            return true;
        }
        if (65529 > i15 || i15 > 65532) {
            return 119155 <= i15 && i15 <= 119162;
        }
        return true;
    }

    private static boolean g(char c15) {
        if (c15 == 160 || c15 == 5760) {
            return true;
        }
        return (8192 <= c15 && c15 <= 8203) || c15 == 8239 || c15 == 8287 || c15 == 12288;
    }

    private static boolean h(int i15) {
        if (64976 <= i15 && i15 <= 65007) {
            return true;
        }
        if (65534 <= i15 && i15 <= 65535) {
            return true;
        }
        if (131070 <= i15 && i15 <= 131071) {
            return true;
        }
        if (196606 <= i15 && i15 <= 196607) {
            return true;
        }
        if (262142 <= i15 && i15 <= 262143) {
            return true;
        }
        if (327678 <= i15 && i15 <= 327679) {
            return true;
        }
        if (393214 <= i15 && i15 <= 393215) {
            return true;
        }
        if (458750 <= i15 && i15 <= 458751) {
            return true;
        }
        if (524286 <= i15 && i15 <= 524287) {
            return true;
        }
        if (589822 <= i15 && i15 <= 589823) {
            return true;
        }
        if (655358 <= i15 && i15 <= 655359) {
            return true;
        }
        if (720894 <= i15 && i15 <= 720895) {
            return true;
        }
        if (786430 <= i15 && i15 <= 786431) {
            return true;
        }
        if (851966 <= i15 && i15 <= 851967) {
            return true;
        }
        if (917502 <= i15 && i15 <= 917503) {
            return true;
        }
        if (983038 <= i15 && i15 <= 983039) {
            return true;
        }
        if (1048574 > i15 || i15 > 1048575) {
            return 1114110 <= i15 && i15 <= 1114111;
        }
        return true;
    }

    private static boolean i(int i15) {
        if (57344 <= i15 && i15 <= 63743) {
            return true;
        }
        if (983040 > i15 || i15 > 1048573) {
            return 1048576 <= i15 && i15 <= 1114109;
        }
        return true;
    }

    static boolean j(int i15) {
        char c15 = (char) i15;
        return g(c15) || a(c15) || f(i15) || i(i15) || h(i15) || n(i15) || d(i15) || c(i15) || b(i15) || o(i15);
    }

    private static String k(String str, boolean z15) {
        char[] charArray = str.toCharArray();
        for (int i15 = 0; i15 < str.length(); i15++) {
            if (g(str.charAt(i15))) {
                charArray[i15] = ' ';
            }
        }
        int i16 = 0;
        for (int i17 = 0; i17 < str.length(); i17++) {
            char c15 = charArray[i17];
            if (!e(c15)) {
                charArray[i16] = c15;
                i16++;
            }
        }
        String strNormalize = Normalizer.normalize(CharBuffer.wrap(charArray, 0, i16), Normalizer.Form.NFKC);
        int iCharCount = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (iCharCount < strNormalize.length()) {
            int iCodePointAt = strNormalize.codePointAt(iCharCount);
            if (j(iCodePointAt)) {
                throw new IllegalArgumentException("Prohibited character " + iCodePointAt + " at position " + iCharCount);
            }
            byte directionality = Character.getDirectionality(iCodePointAt);
            boolean z19 = directionality == 1 || directionality == 2;
            z16 |= z19;
            z17 |= directionality == 0;
            z18 |= iCharCount == 0 && z19;
            if (!z15 && !Character.isDefined(iCodePointAt)) {
                throw new IllegalArgumentException("Character at position " + iCharCount + " is unassigned");
            }
            iCharCount += Character.charCount(iCodePointAt);
            if (z18 && iCharCount >= strNormalize.length() && !z19) {
                throw new IllegalArgumentException("First character is RandALCat, but last character is not");
            }
        }
        if (z16 && z17) {
            throw new IllegalArgumentException("Contains both RandALCat characters and LCat characters");
        }
        return strNormalize;
    }

    static String l(String str) {
        return k(str, true);
    }

    static String m(String str) {
        return k(str, false);
    }

    private static boolean n(int i15) {
        return 55296 <= i15 && i15 <= 57343;
    }

    private static boolean o(int i15) {
        if (i15 != 917505) {
            return 917536 <= i15 && i15 <= 917631;
        }
        return true;
    }
}
