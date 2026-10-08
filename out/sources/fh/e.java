package fh;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class e extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Map f63004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ m f63005d;

    e(m mVar, Map map) {
        this.f63005d = mVar;
        this.f63004c = map;
    }

    @Override // fh.c1
    protected final Set a() {
        return new c(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m mVar = this.f63005d;
        if (this.f63004c == mVar.f63378c) {
            mVar.o();
        } else {
            q0.a(new d(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return d1.b(this.f63004c, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f63004c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) d1.a(this.f63004c, obj);
        if (collection == null) {
            return null;
        }
        return this.f63005d.g(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f63004c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f63005d.B();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f63004c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionF = this.f63005d.f();
        collectionF.addAll(collection);
        this.f63005d.f63379d -= collection.size();
        collection.clear();
        return collectionF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f63004c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f63004c.toString();
    }
}
