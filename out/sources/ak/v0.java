package ak;

import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v0<E> extends u0<E> implements NavigableSet<E>, d2<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Comparator<? super E> f6989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient v0<E> f6990d;

    v0(Comparator<? super E> comparator) {
        this.f6989c = comparator;
    }

    static <E> x1<E> V(Comparator<? super E> comparator) {
        return n1.d().equals(comparator) ? (x1<E>) x1.f7014f : new x1<>(n0.C(), comparator);
    }

    static int j0(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    abstract v0<E> T();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public v0<E> descendingSet() {
        v0<E> v0Var = this.f6990d;
        if (v0Var != null) {
            return v0Var;
        }
        v0<E> v0VarT = T();
        this.f6990d = v0VarT;
        v0VarT.f6990d = this;
        return v0VarT;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public v0<E> headSet(E e15) {
        return headSet(e15, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public v0<E> headSet(E e15, boolean z15) {
        return Y(zj.p.q(e15), z15);
    }

    abstract v0<E> Y(E e15, boolean z15);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public v0<E> subSet(E e15, E e16) {
        return subSet(e15, true, e16, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public v0<E> subSet(E e15, boolean z15, E e16, boolean z16) {
        zj.p.q(e15);
        zj.p.q(e16);
        zj.p.d(this.f6989c.compare(e15, e16) <= 0);
        return e0(e15, z15, e16, z16);
    }

    @Override // java.util.SortedSet, ak.d2
    public Comparator<? super E> comparator() {
        return this.f6989c;
    }

    abstract v0<E> e0(E e15, boolean z15, E e16, boolean z16);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public v0<E> tailSet(E e15) {
        return tailSet(e15, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public v0<E> tailSet(E e15, boolean z15) {
        return h0(zj.p.q(e15), z15);
    }

    abstract v0<E> h0(E e15, boolean z15);

    int i0(Object obj, Object obj2) {
        return j0(this.f6989c, obj, obj2);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }
}
