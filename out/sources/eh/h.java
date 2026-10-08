package eh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class h implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f50600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f50601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f50602c;

    h(i iVar) {
        this.f50602c = iVar;
        this.f50600a = iVar.f50647c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f50600a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f50600a.next();
        this.f50601b = (Collection) entry.getValue();
        i iVar = this.f50602c;
        Object key = entry.getKey();
        return new l0(key, iVar.f50648d.h(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        c.d(this.f50601b != null, "no calls to next() since the last call to remove()");
        this.f50600a.remove();
        q.m(this.f50602c.f50648d, this.f50601b.size());
        this.f50601b.clear();
        this.f50601b = null;
    }
}
