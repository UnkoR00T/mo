package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c91 extends d91 {
    protected c91() {
    }

    private static char[] d(char[] cArr, int i15, int i16) {
        if (i16 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i16];
        if (i15 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i15);
        }
        return cArr2;
    }

    @Override // com.google.android.libraries.places.internal.d91
    public String a(String str) {
        throw null;
    }

    protected abstract char[] b(char c15);

    protected final String c(String str, int i15) {
        int length = str.length();
        char[] cArrA = j91.a();
        int length2 = cArrA.length;
        int i16 = 0;
        int i17 = 0;
        while (i15 < length) {
            int i18 = i15 + 1;
            char[] cArrB = b(str.charAt(i15));
            if (cArrB != null) {
                int i19 = i15 - i16;
                int i25 = i17 + i19;
                int length3 = cArrB.length;
                int i26 = i25 + length3;
                if (length2 < i26) {
                    int i27 = length - i15;
                    length2 = i27 + i27 + i26;
                    cArrA = d(cArrA, i17, length2);
                }
                if (i19 > 0) {
                    str.getChars(i16, i15, cArrA, i17);
                    i17 = i25;
                }
                if (length3 > 0) {
                    System.arraycopy(cArrB, 0, cArrA, i17, length3);
                    i17 += length3;
                }
                i16 = i18;
            }
            i15 = i18;
        }
        int i28 = length - i16;
        if (i28 > 0) {
            int i29 = i28 + i17;
            if (length2 < i29) {
                cArrA = d(cArrA, i17, i29);
            }
            str.getChars(i16, length, cArrA, i17);
            i17 = i29;
        }
        return new String(cArrA, 0, i17);
    }
}
