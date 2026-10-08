package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ks0 {
    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    public static final int a(bs0 bs0Var, int i15) {
        int i16;
        int[] iArrF = bs0Var.F();
        int length = bs0Var.D().length - 1;
        int i17 = 0;
        while (i17 <= length) {
            int i18 = i15 + 1;
            i16 = (i17 + length) >>> 1;
            int i19 = iArrF[i16];
            if (i19 < i18) {
                i17 = i16 + 1;
            } else {
                if (i19 <= i18) {
                    if (i16 >= 0) {
                        return i16;
                    }
                    return ~i16;
                }
                length = i16 - 1;
            }
        }
        i16 = (-i17) - 1;
        if (i16 >= 0) {
            return i16;
        }
        return ~i16;
    }
}
