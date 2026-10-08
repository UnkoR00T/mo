package eh;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class i extends z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Map f50647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ q f50648d;

    i(q qVar, Map map) {
        this.f50648d = qVar;
        this.f50647c = map;
    }

    @Override // eh.z0
    protected final Set a() {
        return new g(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f50647c;
        q qVar = this.f50648d;
        if (map == qVar.f50946c) {
            qVar.s();
        } else {
            t0.a(new h(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return a1.b(this.f50647c, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f50647c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) a1.a(this.f50647c, obj);
        if (collection == null) {
            return null;
        }
        return this.f50648d.h(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f50647c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f50648d.c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f50647c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionG = this.f50648d.g();
        collectionG.addAll(collection);
        q.m(this.f50648d, collection.size());
        collection.clear();
        return collectionG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f50647c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f50647c.toString();
    }
}
