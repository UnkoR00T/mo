package ch;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class a0 extends s1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Map f25747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ i0 f25748d;

    a0(i0 i0Var, Map map) {
        this.f25748d = i0Var;
        this.f25747c = map;
    }

    @Override // ch.s1
    protected final Set a() {
        return new y(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Collection get(Object obj) {
        Collection collection = (Collection) t1.a(this.f25747c, obj);
        if (collection == null) {
            return null;
        }
        return this.f25748d.e(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        i0 i0Var = this.f25748d;
        if (this.f25747c == i0Var.f25944c) {
            i0Var.m();
        } else {
            m1.a(new z(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return t1.b(this.f25747c, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f25747c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f25747c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f25748d.K();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f25747c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionC = this.f25748d.c();
        collectionC.addAll(collection);
        this.f25748d.f25945d -= collection.size();
        collection.clear();
        return collectionC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f25747c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f25747c.toString();
    }
}
