package ch;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class c2 extends k1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f25806d;

    private c2(Object obj, Object[] objArr, int i15) {
        this.f25806d = objArr;
    }

    static c2 g(int i15, Object[] objArr, j1 j1Var) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        n0.b(obj, obj2);
        return new c2(null, objArr, 1);
    }

    @Override // ch.k1
    final d1 a() {
        return new b2(this.f25806d, 1, 1);
    }

    @Override // ch.k1
    final l1 d() {
        return new z1(this, this.f25806d, 0, 1);
    }

    @Override // ch.k1
    final l1 e() {
        return new a2(this, new b2(this.f25806d, 0, 1));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // ch.k1, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f25806d;
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
