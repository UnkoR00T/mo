package cu;

import fr.t;
import fr.w0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import pq.e1;
import pq.n;

/* JADX INFO: loaded from: classes4.dex */
public final class k<T> extends pq.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f37890c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f37891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37892b;

    private static final class a<T> implements Iterator<T>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f37893a;

        public a(T[] tArr) {
            this.f37893a = fr.c.a(tArr);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37893a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f37893a.next();
        }
    }

    public static final class b {
        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        public final <T> k<T> a() {
            return new k<>(null);
        }

        public final <T> k<T> b(Collection<? extends T> collection) {
            k<T> kVar = new k<>(null);
            kVar.addAll(collection);
            return kVar;
        }

        private b() {
        }
    }

    private static final class c<T> implements Iterator<T>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f37894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f37895b = true;

        public c(T t15) {
            this.f37894a = t15;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37895b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f37895b) {
                throw new NoSuchElementException();
            }
            this.f37895b = false;
            return this.f37894a;
        }
    }

    public /* synthetic */ k(fr.k kVar) {
        this();
    }

    public static final <T> k<T> f() {
        return f37890c.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t15) {
        Object obj;
        if (size() == 0) {
            this.f37891a = t15;
        } else if (size() == 1) {
            if (t.c(this.f37891a, t15)) {
                return false;
            }
            this.f37891a = new Object[]{this.f37891a, t15};
        } else if (size() < 5) {
            Object[] objArr = (Object[]) this.f37891a;
            if (n.f0(objArr, t15)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetF = e1.f(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetF.add(t15);
                obj = linkedHashSetF;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                objArrCopyOf[objArrCopyOf.length - 1] = t15;
                obj = objArrCopyOf;
            }
            this.f37891a = obj;
        } else if (!w0.f(this.f37891a).add(t15)) {
            return false;
        }
        g(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f37891a = null;
        g(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return t.c(this.f37891a, obj);
        }
        return size() < 5 ? n.f0((Object[]) this.f37891a, obj) : ((Set) this.f37891a).contains(obj);
    }

    @Override // pq.j
    public int e() {
        return this.f37892b;
    }

    public void g(int i15) {
        this.f37892b = i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new c(this.f37891a);
        }
        return size() < 5 ? new a((Object[]) this.f37891a) : w0.f(this.f37891a).iterator();
    }

    private k() {
    }
}
