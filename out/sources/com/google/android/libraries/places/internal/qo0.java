package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class qo0 {
    static {
        Logger.getLogger(qo0.class.getName());
    }

    private qo0() {
    }

    public static a80 a(List list) {
        return p60.b(c(list));
    }

    public static a80 b(List list) {
        return p60.b(c(list));
    }

    private static byte[][] c(List list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size][];
        Iterator it = list.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            mp0 mp0Var = (mp0) it.next();
            bArr[i15] = mp0Var.f32983a.t();
            bArr[i15 + 1] = mp0Var.f32984b.t();
            i15 += 2;
        }
        return om0.b(bArr);
    }
}
