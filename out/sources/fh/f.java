package fh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map.Entry f63028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f63029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f63030c;

    f(g gVar, Iterator it) {
        this.f63029b = it;
        this.f63030c = gVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63029b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f63029b.next();
        this.f63028a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        hl.d(this.f63028a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f63028a.getValue();
        this.f63029b.remove();
        this.f63030c.f63047b.f63379d -= collection.size();
        collection.clear();
        this.f63028a = null;
    }
}
