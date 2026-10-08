package io.sentry.cache.tape;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class b<T> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f94749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f94750b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final c.a<T> f94751c;

    private static final class a extends ByteArrayOutputStream {
        a() {
        }

        byte[] b() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* JADX INFO: renamed from: io.sentry.cache.tape.b$b, reason: collision with other inner class name */
    private final class C2232b implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator<byte[]> f94752a;

        C2232b(Iterator<byte[]> it) {
            this.f94752a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94752a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            try {
                return b.this.f94751c.b(this.f94752a.next());
            } catch (IOException e15) {
                throw ((Error) d.L(e15));
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f94752a.remove();
        }
    }

    b(d dVar, c.a<T> aVar) {
        this.f94749a = dVar;
        this.f94751c = aVar;
    }

    @Override // io.sentry.cache.tape.c
    public void M(int i15) throws IOException {
        this.f94749a.s1(i15);
    }

    @Override // io.sentry.cache.tape.c
    public void clear() throws IOException {
        this.f94749a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f94749a.close();
    }

    @Override // io.sentry.cache.tape.c
    public void h(T t15) throws IOException {
        this.f94750b.reset();
        this.f94751c.a(t15, this.f94750b);
        this.f94749a.C(this.f94750b.b(), 0, this.f94750b.size());
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C2232b(this.f94749a.iterator());
    }

    @Override // io.sentry.cache.tape.c
    public int size() {
        return this.f94749a.size();
    }

    public String toString() {
        return "FileObjectQueue{queueFile=" + this.f94749a + '}';
    }
}
