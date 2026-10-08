package ch;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class b0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map.Entry f25771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f25772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c0 f25773c;

    b0(c0 c0Var, Iterator it) {
        this.f25772b = it;
        this.f25773c = c0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25772b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f25772b.next();
        this.f25771a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        t.e(this.f25771a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f25771a.getValue();
        this.f25772b.remove();
        this.f25773c.f25805b.f25945d -= collection.size();
        collection.clear();
        this.f25771a = null;
    }
}
