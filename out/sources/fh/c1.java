package fh;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
abstract class c1 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f62968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Collection f62969b;

    c1() {
    }

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f62968a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f62968a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f62969b;
        if (collection != null) {
            return collection;
        }
        a1 a1Var = new a1(this);
        this.f62969b = a1Var;
        return a1Var;
    }
}
