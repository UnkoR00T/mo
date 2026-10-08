package eh;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s0 extends k0 implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient p0 f51029b;

    s0() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return l1.a(this);
    }

    public final p0 i() {
        p0 p0Var = this.f51029b;
        if (p0Var != null) {
            return p0Var;
        }
        p0 p0VarJ = j();
        this.f51029b = p0VarJ;
        return p0VarJ;
    }

    p0 j() {
        return p0.j(toArray());
    }
}
