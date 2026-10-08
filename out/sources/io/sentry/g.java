package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
final class g<E> extends AbstractCollection<E> implements Queue<E>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient E[] f94958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f94959b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f94960c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient boolean f94961d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f94962e;

    class a implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f94963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f94964b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f94965c;

        a() {
            this.f94963a = g.this.f94959b;
            this.f94965c = g.this.f94961d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94965c || this.f94963a != g.this.f94960c;
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f94965c = false;
            int i15 = this.f94963a;
            this.f94964b = i15;
            this.f94963a = g.this.t(i15);
            return (E) g.this.f94958a[this.f94964b];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i15 = this.f94964b;
            if (i15 == -1) {
                throw new IllegalStateException();
            }
            if (i15 == g.this.f94959b) {
                g.this.remove();
                this.f94964b = -1;
                return;
            }
            int iT = this.f94964b + 1;
            if (g.this.f94959b >= this.f94964b || iT >= g.this.f94960c) {
                while (iT != g.this.f94960c) {
                    if (iT >= g.this.f94962e) {
                        g.this.f94958a[iT - 1] = g.this.f94958a[0];
                        iT = 0;
                    } else {
                        g.this.f94958a[g.this.s(iT)] = g.this.f94958a[iT];
                        iT = g.this.t(iT);
                    }
                }
            } else {
                System.arraycopy(g.this.f94958a, iT, g.this.f94958a, this.f94964b, g.this.f94960c - iT);
            }
            this.f94964b = -1;
            g gVar = g.this;
            gVar.f94960c = gVar.s(gVar.f94960c);
            g.this.f94958a[g.this.f94960c] = null;
            g.this.f94961d = false;
            this.f94963a = g.this.s(this.f94963a);
        }
    }

    g(int i15) {
        if (i15 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        E[] eArr = (E[]) new Object[i15];
        this.f94958a = eArr;
        this.f94962e = eArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int s(int i15) {
        int i16 = i15 - 1;
        return i16 < 0 ? this.f94962e - 1 : i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int t(int i15) {
        int i16 = i15 + 1;
        if (i16 >= this.f94962e) {
            return 0;
        }
        return i16;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e15) {
        if (e15 == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if (u()) {
            remove();
        }
        E[] eArr = this.f94958a;
        int i15 = this.f94960c;
        int i16 = i15 + 1;
        this.f94960c = i16;
        eArr[i15] = e15;
        if (i16 >= this.f94962e) {
            this.f94960c = 0;
        }
        if (this.f94960c == this.f94959b) {
            this.f94961d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f94961d = false;
        this.f94959b = 0;
        this.f94960c = 0;
        Arrays.fill(this.f94958a, (Object) null);
    }

    @Override // java.util.Queue
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public boolean offer(E e15) {
        return add(e15);
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f94958a[this.f94959b];
    }

    @Override // java.util.Queue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        E[] eArr = this.f94958a;
        int i15 = this.f94959b;
        E e15 = eArr[i15];
        if (e15 != null) {
            int i16 = i15 + 1;
            this.f94959b = i16;
            eArr[i15] = null;
            if (i16 >= this.f94962e) {
                this.f94959b = 0;
            }
            this.f94961d = false;
        }
        return e15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i15 = this.f94960c;
        int i16 = this.f94959b;
        if (i15 < i16) {
            return (this.f94962e - i16) + i15;
        }
        if (i15 != i16) {
            return i15 - i16;
        }
        if (this.f94961d) {
            return this.f94962e;
        }
        return 0;
    }

    public boolean u() {
        return size() == this.f94962e;
    }
}
