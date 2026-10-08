package com.google.android.gms.internal.oss_licenses;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class q2 implements Comparator {
    q2() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        x2 x2VarB = x2.b(obj);
        x2 x2VarB2 = x2.b(obj2);
        if (x2VarB != x2VarB2) {
            return x2VarB.compareTo(x2VarB2);
        }
        int iOrdinal = x2VarB.ordinal();
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
