package fh;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class i implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f63087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Collection f63088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f63089c;

    i(j jVar, Iterator it) {
        this.f63089c = jVar;
        this.f63088b = jVar.f63142b;
        this.f63087a = it;
    }

    final void a() {
        this.f63089c.zzb();
        if (this.f63089c.f63142b != this.f63088b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f63087a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f63087a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f63087a.remove();
        this.f63089c.f63145e.f63379d--;
        this.f63089c.f();
    }

    i(j jVar) {
        this.f63089c = jVar;
        Collection collection = jVar.f63142b;
        this.f63088b = collection;
        this.f63087a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
