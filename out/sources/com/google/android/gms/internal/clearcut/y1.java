package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class y1 extends v1 {
    private y1() {
        super();
    }

    private static <E> k1<E> e(Object obj, long j15) {
        return (k1) b4.M(obj, j15);
    }

    @Override // com.google.android.gms.internal.clearcut.v1
    final void a(Object obj, long j15) {
        e(obj, j15).J();
    }

    @Override // com.google.android.gms.internal.clearcut.v1
    final <E> void b(Object obj, Object obj2, long j15) {
        k1 k1VarE = e(obj, j15);
        k1 k1VarE2 = e(obj2, j15);
        int size = k1VarE.size();
        int size2 = k1VarE2.size();
        if (size > 0 && size2 > 0) {
            if (!k1VarE.I()) {
                k1VarE = k1VarE.C1(size2 + size);
            }
            k1VarE.addAll(k1VarE2);
        }
        if (size > 0) {
            k1VarE2 = k1VarE;
        }
        b4.i(obj, j15, k1VarE2);
    }
}
