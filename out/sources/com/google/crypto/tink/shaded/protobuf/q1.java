package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public class q1 extends AbstractList<String> implements g0, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f36168a;

    class a implements ListIterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ListIterator<String> f36169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36170b;

        a(int i15) {
            this.f36170b = i15;
            this.f36169a = q1.this.f36168a.listIterator(i15);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f36169a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f36169a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f36169a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f36169a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f36169a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f36169a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator<String> f36172a;

        b() {
            this.f36172a = q1.this.f36168a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f36172a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36172a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public q1(g0 g0Var) {
        this.f36168a = g0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public void F3(h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public Object K(int i15) {
        return this.f36168a.K(i15);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i15) {
        return new a(i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public g0 n0() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f36168a.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public List<?> y() {
        return this.f36168a.y();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i15) {
        return (String) this.f36168a.get(i15);
    }
}
