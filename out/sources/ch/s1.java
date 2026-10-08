package ch;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
abstract class s1 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f26323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Collection f26324b;

    s1() {
    }

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f26323a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f26323a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f26324b;
        if (collection != null) {
            return collection;
        }
        r1 r1Var = new r1(this);
        this.f26324b = r1Var;
        return r1Var;
    }
}
