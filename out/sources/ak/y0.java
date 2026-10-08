package ak;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends ak.b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f7016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zj.q f7017d;

        a(Iterator it, zj.q qVar) {
            this.f7016c = it;
            this.f7017d = qVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // ak.b
        protected T a() {
            while (this.f7016c.hasNext()) {
                T t15 = (T) this.f7016c.next();
                if (this.f7017d.apply(t15)) {
                    return t15;
                }
            }
            return c();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    class b<F, T> extends f2<F, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zj.g f7018b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Iterator it, zj.g gVar) {
            super(it);
            this.f7018b = gVar;
        }

        @Override // ak.f2
        T a(F f15) {
            return (T) this.f7018b.apply(f15);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f7021c;

        c(int i15, Iterator it) {
            this.f7020b = i15;
            this.f7021c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7019a < this.f7020b && this.f7021c.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f7019a++;
            return (T) this.f7021c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f7021c.remove();
        }
    }

    private static final class d<T> extends ak.a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final i2<Object> f7022d = new d(new Object[0], 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T[] f7023c;

        d(T[] tArr, int i15) {
            super(tArr.length, i15);
            this.f7023c = tArr;
        }

        @Override // ak.a
        protected T a(int i15) {
            return this.f7023c[i15];
        }
    }

    private static class e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterator<? extends T> f7024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator<? extends T> f7025b = y0.i();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator<? extends Iterator<? extends T>> f7026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Deque<Iterator<? extends Iterator<? extends T>>> f7027d;

        e(Iterator<? extends Iterator<? extends T>> it) {
            this.f7026c = (Iterator) zj.p.q(it);
        }

        private Iterator<? extends Iterator<? extends T>> a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f7026c;
                if (it != null && it.hasNext()) {
                    return this.f7026c;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f7027d;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f7026c = this.f7027d.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) zj.p.q(this.f7025b)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> itA = a();
                this.f7026c = itA;
                if (itA == null) {
                    return false;
                }
                Iterator<? extends T> next = itA.next();
                this.f7025b = next;
                if (next instanceof e) {
                    e eVar = (e) next;
                    this.f7025b = eVar.f7025b;
                    if (this.f7027d == null) {
                        this.f7027d = new ArrayDeque();
                    }
                    this.f7027d.addFirst(this.f7026c);
                    if (eVar.f7027d != null) {
                        while (!eVar.f7027d.isEmpty()) {
                            this.f7027d.addFirst(eVar.f7027d.removeLast());
                        }
                    }
                    this.f7026c = eVar.f7026c;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.f7025b;
            this.f7024a = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.f7024a;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f7024a = null;
        }
    }

    private enum f implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            y.d(false);
        }
    }

    private static class g<E> implements o1<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<? extends E> f7030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f7031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private E f7032c;

        public g(Iterator<? extends E> it) {
            this.f7030a = (Iterator) zj.p.q(it);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7031b || this.f7030a.hasNext();
        }

        @Override // ak.o1, java.util.Iterator
        public E next() {
            if (!this.f7031b) {
                return this.f7030a.next();
            }
            E e15 = (E) k1.a(this.f7032c);
            this.f7031b = false;
            this.f7032c = null;
            return e15;
        }

        @Override // ak.o1
        public E peek() {
            if (!this.f7031b) {
                this.f7032c = this.f7030a.next();
                this.f7031b = true;
            }
            return (E) k1.a(this.f7032c);
        }

        @Override // java.util.Iterator
        public void remove() {
            zj.p.x(!this.f7031b, "Can't remove after you've peeked at next");
            this.f7030a.remove();
        }
    }

    private static final class h<T> extends h2<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f7033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f7034b;

        h(T t15) {
            this.f7033a = t15;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f7034b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f7034b) {
                throw new NoSuchElementException();
            }
            this.f7034b = true;
            return this.f7033a;
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        zj.p.q(collection);
        zj.p.q(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static int b(Iterator<?> it, int i15) {
        zj.p.q(it);
        int i16 = 0;
        zj.p.e(i15 >= 0, "numberToAdvance must be nonnegative");
        while (i16 < i15 && it.hasNext()) {
            it.next();
            i16++;
        }
        return i16;
    }

    public static <T> boolean c(Iterator<T> it, zj.q<? super T> qVar) {
        return r(it, qVar) != -1;
    }

    static void d(int i15) {
        if (i15 >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("position (" + i15 + ") must not be negative");
    }

    static void e(Iterator<?> it) {
        zj.p.q(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> Iterator<T> f(Iterator<? extends Iterator<? extends T>> it) {
        return new e(it);
    }

    public static boolean g(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(Iterator<?> it, Iterator<?> it4) {
        while (it.hasNext()) {
            if (!it4.hasNext() || !zj.l.a(it.next(), it4.next())) {
                return false;
            }
        }
        return !it4.hasNext();
    }

    static <T> h2<T> i() {
        return j();
    }

    static <T> i2<T> j() {
        return (i2<T>) d.f7022d;
    }

    static <T> Iterator<T> k() {
        return f.INSTANCE;
    }

    public static <T> h2<T> l(Iterator<T> it, zj.q<? super T> qVar) {
        zj.p.q(it);
        zj.p.q(qVar);
        return new a(it, qVar);
    }

    public static <T> T m(Iterator<T> it, zj.q<? super T> qVar) {
        zj.p.q(it);
        zj.p.q(qVar);
        while (it.hasNext()) {
            T next = it.next();
            if (qVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T n(Iterator<T> it, int i15) {
        d(i15);
        int iB = b(it, i15);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException("position (" + i15 + ") must be less than the number of elements that remained (" + iB + ")");
    }

    public static <T> T o(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T p(Iterator<? extends T> it, T t15) {
        return it.hasNext() ? it.next() : t15;
    }

    public static <T> T q(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("expected one element but was: <");
        sb5.append(next);
        for (int i15 = 0; i15 < 4 && it.hasNext(); i15++) {
            sb5.append(", ");
            sb5.append(it.next());
        }
        if (it.hasNext()) {
            sb5.append(", ...");
        }
        sb5.append('>');
        throw new IllegalArgumentException(sb5.toString());
    }

    public static <T> int r(Iterator<T> it, zj.q<? super T> qVar) {
        zj.p.r(qVar, "predicate");
        int i15 = 0;
        while (it.hasNext()) {
            if (qVar.apply(it.next())) {
                return i15;
            }
            i15++;
        }
        return -1;
    }

    public static <T> Iterator<T> s(Iterator<T> it, int i15) {
        zj.p.q(it);
        zj.p.e(i15 >= 0, "limit is negative");
        return new c(i15, it);
    }

    public static <T> o1<T> t(Iterator<? extends T> it) {
        return it instanceof g ? (g) it : new g(it);
    }

    static <T> T u(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static boolean v(Iterator<?> it, Collection<?> collection) {
        zj.p.q(collection);
        boolean z15 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z15 = true;
            }
        }
        return z15;
    }

    public static <T> boolean w(Iterator<T> it, zj.q<? super T> qVar) {
        zj.p.q(qVar);
        boolean z15 = false;
        while (it.hasNext()) {
            if (qVar.apply(it.next())) {
                it.remove();
                z15 = true;
            }
        }
        return z15;
    }

    public static <T> h2<T> x(T t15) {
        return new h(t15);
    }

    public static String y(Iterator<?> it) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append('[');
        boolean z15 = true;
        while (it.hasNext()) {
            if (!z15) {
                sb5.append(", ");
            }
            sb5.append(it.next());
            z15 = false;
        }
        sb5.append(']');
        return sb5.toString();
    }

    public static <F, T> Iterator<T> z(Iterator<F> it, zj.g<? super F, ? extends T> gVar) {
        zj.p.q(gVar);
        return new b(it, gVar);
    }
}
