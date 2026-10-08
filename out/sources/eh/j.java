package eh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class j implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map.Entry f50678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f50679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f50680c;

    j(k kVar, Iterator it) {
        this.f50680c = kVar;
        this.f50679b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f50679b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f50679b.next();
        this.f50678a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        c.d(this.f50678a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f50678a.getValue();
        this.f50679b.remove();
        q.m(this.f50680c.f50721b, collection.size());
        collection.clear();
        this.f50678a = null;
    }
}
