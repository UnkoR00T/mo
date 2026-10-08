package dh;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pc extends la implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient mc f42147b;

    pc() {
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
        return b.a(this);
    }

    public final mc i() {
        mc mcVar = this.f42147b;
        if (mcVar != null) {
            return mcVar;
        }
        mc mcVarJ = j();
        this.f42147b = mcVarJ;
        return mcVarJ;
    }

    mc j() {
        return mc.j(toArray());
    }
}
