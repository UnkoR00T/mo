package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class g0 implements f0 {
    g0() {
    }

    static <E> z.f<E> d(Object obj, long j15) {
        return (z.f) q1.z(obj, j15);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void a(Object obj, long j15) {
        d(obj, j15).O();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public <E> void b(Object obj, Object obj2, long j15) {
        z.f fVarD = d(obj, j15);
        z.f fVarD2 = d(obj2, j15);
        int size = fVarD.size();
        int size2 = fVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!fVarD.c0()) {
                fVarD = fVarD.d0(size2 + size);
            }
            fVarD.addAll(fVarD2);
        }
        if (size > 0) {
            fVarD2 = fVarD;
        }
        q1.O(obj, j15, fVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public <L> List<L> c(Object obj, long j15) {
        z.f fVarD = d(obj, j15);
        if (fVarD.c0()) {
            return fVarD;
        }
        int size = fVarD.size();
        z.f fVarD0 = fVarD.d0(size == 0 ? 10 : size * 2);
        q1.O(obj, j15, fVarD0);
        return fVarD0;
    }
}
