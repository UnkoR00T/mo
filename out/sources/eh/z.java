package eh;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class z extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f0 f51312a;

    z(f0 f0Var) {
        this.f51312a = f0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f51312a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapP = this.f51312a.p();
        if (mapP != null) {
            return mapP.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iC = this.f51312a.C(entry.getKey());
            if (iC != -1 && ze.a(f0.n(this.f51312a, iC), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f0 f0Var = this.f51312a;
        Map mapP = f0Var.p();
        return mapP != null ? mapP.entrySet().iterator() : new x(f0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iB;
        int iB2;
        Map mapP = this.f51312a.p();
        if (mapP != null) {
            return mapP.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        f0 f0Var = this.f51312a;
        if (f0Var.v() || (iB2 = g0.b(entry.getKey(), entry.getValue(), (iB = f0Var.B()), f0.o(this.f51312a), this.f51312a.H(), this.f51312a.a(), this.f51312a.b())) == -1) {
            return false;
        }
        this.f51312a.u(iB2, iB);
        f0.d(this.f51312a);
        this.f51312a.s();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f51312a.size();
    }
}
