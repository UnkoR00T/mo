package fh;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 extends h0 implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient m0 f63434b;

    p0() {
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
        return n1.a(this);
    }

    public final m0 i() {
        m0 m0Var = this.f63434b;
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0VarJ = j();
        this.f63434b = m0VarJ;
        return m0VarJ;
    }

    m0 j() {
        Object[] array = toArray();
        int i15 = m0.f63381c;
        return m0.j(array, array.length);
    }
}
