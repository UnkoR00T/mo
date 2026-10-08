package bt;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public class x extends AbstractList<String> implements RandomAccess, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f21497a;

    class a implements ListIterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ListIterator<String> f21498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21499b;

        a(int i15) {
            this.f21499b = i15;
            this.f21498a = x.this.f21497a.listIterator(i15);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f21498a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f21498a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f21498a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f21498a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f21498a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f21498a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator<String> f21501a;

        b() {
            this.f21501a = x.this.f21497a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f21501a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21501a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public x(o oVar) {
        this.f21497a = oVar;
    }

    @Override // bt.o
    public d P1(int i15) {
        return this.f21497a.P1(i15);
    }

    @Override // bt.o
    public void i1(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i15) {
        return new a(i15);
    }

    @Override // bt.o
    public o n0() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f21497a.size();
    }

    @Override // bt.o
    public List<?> y() {
        return this.f21497a.y();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i15) {
        return this.f21497a.get(i15);
    }
}
