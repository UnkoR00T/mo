package eh;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
abstract class z0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f51313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Collection f51314b;

    z0() {
    }

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f51313a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f51313a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f51314b;
        if (collection != null) {
            return collection;
        }
        y0 y0Var = new y0(this);
        this.f51314b = y0Var;
        return y0Var;
    }
}
