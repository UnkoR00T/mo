package zt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f237225a = new i();

    public static final class a implements Iterator, gr.a {
        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private i() {
        super(null);
    }

    @Override // zt.c
    public int e() {
        return 0;
    }

    @Override // zt.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Void get(int i15) {
        return null;
    }

    @Override // zt.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void f(int i15, Void r15) {
        throw new IllegalStateException();
    }

    @Override // zt.c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }
}
