package fh;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class l1 extends o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f63360d;

    private l1(Object obj, Object[] objArr, int i15) {
        this.f63360d = objArr;
    }

    static l1 g(int i15, Object[] objArr, n0 n0Var) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        r.b(obj, obj2);
        return new l1(null, objArr, 1);
    }

    @Override // fh.o0
    final h0 a() {
        return new k1(this.f63360d, 1, 1);
    }

    @Override // fh.o0
    final p0 d() {
        return new i1(this, this.f63360d, 0, 1);
    }

    @Override // fh.o0
    final p0 e() {
        return new j1(this, new k1(this.f63360d, 0, 1));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // fh.o0, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f63360d;
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
            } else {
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }
}
