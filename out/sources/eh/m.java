package eh;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class m implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f50784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Collection f50785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f50786c;

    m(n nVar, Iterator it) {
        this.f50786c = nVar;
        this.f50785b = nVar.f50826b;
        this.f50784a = it;
    }

    final void a() {
        this.f50786c.zzb();
        if (this.f50786c.f50826b != this.f50785b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f50784a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f50784a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f50784a.remove();
        q.j(this.f50786c.f50829e);
        this.f50786c.f();
    }

    m(n nVar) {
        this.f50786c = nVar;
        Collection collection = nVar.f50826b;
        this.f50785b = collection;
        this.f50784a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
