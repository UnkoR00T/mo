package com.google.android.gms.common.util;

import java.util.ArrayList;
import jg.r;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static boolean a(int[] iArr, int i15) {
        if (iArr != null) {
            for (int i16 : iArr) {
                if (i16 == i15) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> boolean b(T[] tArr, T t15) {
        int length = tArr != null ? tArr.length : 0;
        for (int i15 = 0; i15 < length; i15++) {
            if (r.a(tArr[i15], t15)) {
                if (i15 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> ArrayList<T> c() {
        return new ArrayList<>();
    }
}
