package zt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class o<T> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f237234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f237235b;

    public static final class a implements Iterator<T>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f237236a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o<T> f237237b;

        a(o<T> oVar) {
            this.f237237b = oVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f237236a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f237236a) {
                throw new NoSuchElementException();
            }
            this.f237236a = false;
            return this.f237237b.h();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o(T t15, int i15) {
        super(null);
        this.f237234a = t15;
        this.f237235b = i15;
    }

    @Override // zt.c
    public int e() {
        return 1;
    }

    @Override // zt.c
    public void f(int i15, T t15) {
        throw new IllegalStateException();
    }

    public final int g() {
        return this.f237235b;
    }

    @Override // zt.c
    public T get(int i15) {
        if (i15 == this.f237235b) {
            return this.f237234a;
        }
        return null;
    }

    public final T h() {
        return this.f237234a;
    }

    @Override // zt.c, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this);
    }
}
