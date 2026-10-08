package ak;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n1<T> implements Comparator<T> {
    protected n1() {
    }

    public static <T> n1<T> b(Comparator<T> comparator) {
        return comparator instanceof n1 ? (n1) comparator : new c0(comparator);
    }

    public static <C extends Comparable> n1<C> d() {
        return j1.f6898a;
    }

    public <U extends T> n1<U> a(Comparator<? super U> comparator) {
        return new e0(this, (Comparator) zj.p.q(comparator));
    }

    public <E extends T> n0<E> c(Iterable<E> iterable) {
        return n0.T(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t15, T t16);

    <T2 extends T> n1<Map.Entry<T2, ?>> e() {
        return (n1<Map.Entry<T2, ?>>) f(b1.i());
    }

    public <F> n1<F> f(zj.g<F, ? extends T> gVar) {
        return new k(gVar, this);
    }

    public <S extends T> n1<S> g() {
        return new z1(this);
    }
}
