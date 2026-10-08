package ak;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class t1<E> extends n0<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final n0<Object> f6969e = new t1(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f6970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f6971d;

    t1(Object[] objArr, int i15) {
        this.f6970c = objArr;
        this.f6971d = i15;
    }

    @Override // ak.n0, ak.l0
    int f(Object[] objArr, int i15) {
        System.arraycopy(this.f6970c, 0, objArr, i15, this.f6971d);
        return i15 + this.f6971d;
    }

    @Override // ak.l0
    Object[] g() {
        return this.f6970c;
    }

    @Override // java.util.List
    public E get(int i15) {
        zj.p.o(i15, this.f6971d);
        E e15 = (E) this.f6970c[i15];
        Objects.requireNonNull(e15);
        return e15;
    }

    @Override // ak.l0
    int h() {
        return this.f6971d;
    }

    @Override // ak.l0
    int i() {
        return 0;
    }

    @Override // ak.l0
    boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6971d;
    }
}
