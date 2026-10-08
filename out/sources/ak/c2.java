package ak;

/* JADX INFO: loaded from: classes4.dex */
final class c2<E> extends u0<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient E f6833c;

    c2(E e15) {
        this.f6833c = (E) zj.p.q(e15);
    }

    @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f6833c.equals(obj);
    }

    @Override // ak.u0, ak.l0
    public n0<E> e() {
        return n0.E(this.f6833c);
    }

    @Override // ak.l0
    int f(Object[] objArr, int i15) {
        objArr[i15] = this.f6833c;
        return i15 + 1;
    }

    @Override // ak.u0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f6833c.hashCode();
    }

    @Override // ak.l0
    boolean j() {
        return false;
    }

    @Override // ak.u0, ak.l0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: k */
    public h2<E> iterator() {
        return y0.x(this.f6833c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f6833c.toString() + ']';
    }
}
