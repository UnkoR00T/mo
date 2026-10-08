package com.google.android.libraries.places.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final class b implements Comparator {
    b() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        h hVarB = h.b(obj);
        h hVarB2 = h.b(obj2);
        if (hVarB != hVarB2) {
            return hVarB.compareTo(hVarB2);
        }
        int iOrdinal = hVarB.ordinal();
        if (iOrdinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (iOrdinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (iOrdinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (iOrdinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
