package io.sentry.cache.tape;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class a<T> extends c<T> {

    private static final class b<T> implements Iterator<T> {
        private b() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException("No elements in EmptyIterator!");
        }
    }

    a() {
    }

    @Override // io.sentry.cache.tape.c
    public void M(int i15) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.sentry.cache.tape.c
    public void h(T t15) {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new b();
    }

    @Override // io.sentry.cache.tape.c
    public int size() {
        return 0;
    }
}
