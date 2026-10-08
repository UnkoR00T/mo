package ch;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class z implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f26716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f26717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ a0 f26718c;

    z(a0 a0Var) {
        this.f26718c = a0Var;
        this.f26716a = a0Var.f25747c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26716a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f26716a.next();
        this.f26717b = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new e1(key, this.f26718c.f25748d.e(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        t.e(this.f26717b != null, "no calls to next() since the last call to remove()");
        this.f26716a.remove();
        this.f26718c.f25748d.f25945d -= this.f26717b.size();
        this.f26717b.clear();
        this.f26717b = null;
    }
}
