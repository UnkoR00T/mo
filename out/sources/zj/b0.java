package zj;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {
    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i15 = 0;
        while (i15 < length && charSequence.charAt(i15) < 128) {
            i15++;
        }
        int iB = length;
        while (i15 < length) {
            char cCharAt = charSequence.charAt(i15);
            if (cCharAt >= 2048) {
                iB += b(charSequence, i15);
                break;
            }
            iB += (127 - cCharAt) >>> 31;
            i15++;
        }
        if (iB >= length) {
            return iB;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iB) + 4294967296L));
    }

    private static int b(CharSequence charSequence, int i15) {
        int length = charSequence.length();
        int i16 = 0;
        while (i15 < length) {
            char cCharAt = charSequence.charAt(i15);
            if (cCharAt < 2048) {
                i16 += (127 - cCharAt) >>> 31;
            } else {
                i16 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i15) == cCharAt) {
                        throw new IllegalArgumentException(c(i15));
                    }
                    i15++;
                }
            }
            i15++;
        }
        return i16;
    }

    private static String c(int i15) {
        return "Unpaired surrogate at index " + i15;
    }
}
