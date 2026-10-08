package ak;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h0<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zj.m<Iterable<E>> f6895a = zj.m.a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends h0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable[] f6896b;

        /* JADX INFO: renamed from: ak.h0$a$a, reason: collision with other inner class name */
        class C0147a extends ak.a<Iterator<? extends T>> {
            C0147a(int i15) {
                super(i15);
            }

            @Override // ak.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Iterator<? extends T> a(int i15) {
                return a.this.f6896b[i15].iterator();
            }
        }

        a(Iterable[] iterableArr) {
            this.f6896b = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return y0.f(new C0147a(this.f6896b.length));
        }
    }

    protected h0() {
    }

    public static <T> h0<T> e(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return f(iterable, iterable2);
    }

    private static <T> h0<T> f(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            zj.p.q(iterable);
        }
        return new a(iterableArr);
    }

    private Iterable<E> g() {
        return this.f6895a.d(this);
    }

    public String toString() {
        return x0.o(g());
    }
}
