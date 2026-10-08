package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class j3 extends e3 {
    private j3() {
        super();
    }

    private static <E> v2<E> e(Object obj, long j15) {
        return (v2) i5.F(obj, j15);
    }

    @Override // com.google.android.gms.internal.vision.e3
    final <E> void b(Object obj, Object obj2, long j15) {
        v2 v2VarE = e(obj, j15);
        v2 v2VarE2 = e(obj2, j15);
        int size = v2VarE.size();
        int size2 = v2VarE2.size();
        if (size > 0 && size2 > 0) {
            if (!v2VarE.zza()) {
                v2VarE = v2VarE.b(size2 + size);
            }
            v2VarE.addAll(v2VarE2);
        }
        if (size > 0) {
            v2VarE2 = v2VarE;
        }
        i5.j(obj, j15, v2VarE2);
    }

    @Override // com.google.android.gms.internal.vision.e3
    final void d(Object obj, long j15) {
        e(obj, j15).zzb();
    }
}
