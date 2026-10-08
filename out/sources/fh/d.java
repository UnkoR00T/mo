package fh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f62992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f62993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f62994c;

    d(e eVar) {
        this.f62994c = eVar;
        this.f62992a = eVar.f63004c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f62992a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f62992a.next();
        this.f62993b = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new i0(key, this.f62994c.f63005d.g(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        hl.d(this.f62993b != null, "no calls to next() since the last call to remove()");
        this.f62992a.remove();
        this.f62994c.f63005d.f63379d -= this.f62993b.size();
        this.f62993b.clear();
        this.f62993b = null;
    }
}
