package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class sz {
    sz() {
    }

    public static final List a(Object obj, long j15) {
        iz izVar = (iz) p10.q(obj, j15);
        if (izVar.zza()) {
            return izVar;
        }
        int size = izVar.size();
        iz izVarA0 = izVar.a0(size == 0 ? 10 : size + size);
        p10.r(obj, j15, izVarA0);
        return izVarA0;
    }
}
