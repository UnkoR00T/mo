package ak;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends h0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f7007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7008c;

        /* JADX INFO: renamed from: ak.x0$a$a, reason: collision with other inner class name */
        class C0150a implements Iterator<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            boolean f7009a = true;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f7010b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f7011c;

            C0150a(a aVar, Iterator it) {
                this.f7010b = it;
                this.f7011c = aVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f7010b.hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                T t15 = (T) this.f7010b.next();
                this.f7009a = false;
                return t15;
            }

            @Override // java.util.Iterator
            public void remove() {
                y.d(!this.f7009a);
                this.f7010b.remove();
            }
        }

        a(Iterable iterable, int i15) {
            this.f7007b = iterable;
            this.f7008c = i15;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f7007b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f7008c), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            y0.b(it, this.f7008c);
            return new C0150a(this, it);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> extends h0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f7012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7013c;

        b(Iterable iterable, int i15) {
            this.f7012b = iterable;
            this.f7013c = i15;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return y0.s(this.f7012b.iterator(), this.f7013c);
        }
    }

    public static <T> boolean a(Iterable<T> iterable, zj.q<? super T> qVar) {
        return y0.c(iterable.iterator(), qVar);
    }

    private static <E> Collection<E> b(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : a1.h(iterable.iterator());
    }

    public static <T> Iterable<T> c(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return h0.e(iterable, iterable2);
    }

    public static <T> T d(Iterable<T> iterable, int i15) {
        zj.p.q(iterable);
        return iterable instanceof List ? (T) ((List) iterable).get(i15) : (T) y0.n(iterable.iterator(), i15);
    }

    public static <T> T e(Iterable<? extends T> iterable, T t15) {
        return (T) y0.p(iterable.iterator(), t15);
    }

    public static <T> T f(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) y0.o(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) g(list);
    }

    private static <T> T g(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> T h(Iterable<T> iterable) {
        return (T) y0.q(iterable.iterator());
    }

    public static <T> Iterable<T> i(Iterable<T> iterable, int i15) {
        zj.p.q(iterable);
        zj.p.e(i15 >= 0, "limit is negative");
        return new b(iterable, i15);
    }

    public static <T> boolean j(Iterable<T> iterable, zj.q<? super T> qVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? k((List) iterable, (zj.q) zj.p.q(qVar)) : y0.w(iterable.iterator(), qVar);
    }

    private static <T> boolean k(List<T> list, zj.q<? super T> qVar) {
        int i15 = 0;
        int i16 = 0;
        while (i15 < list.size()) {
            T t15 = list.get(i15);
            if (!qVar.apply(t15)) {
                if (i15 > i16) {
                    try {
                        list.set(i16, t15);
                    } catch (IllegalArgumentException unused) {
                        m(list, qVar, i16, i15);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m(list, qVar, i16, i15);
                        return true;
                    }
                }
                i16++;
            }
            i15++;
        }
        list.subList(i16, list.size()).clear();
        return i15 != i16;
    }

    public static <T> Iterable<T> l(Iterable<T> iterable, int i15) {
        zj.p.q(iterable);
        zj.p.e(i15 >= 0, "number to skip cannot be negative");
        return new a(iterable, i15);
    }

    private static <T> void m(List<T> list, zj.q<? super T> qVar, int i15, int i16) {
        for (int size = list.size() - 1; size > i16; size--) {
            if (qVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i17 = i16 - 1; i17 >= i15; i17--) {
            list.remove(i17);
        }
    }

    static Object[] n(Iterable<?> iterable) {
        return b(iterable).toArray();
    }

    public static String o(Iterable<?> iterable) {
        return y0.y(iterable.iterator());
    }
}
