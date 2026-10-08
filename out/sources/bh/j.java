package bh;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends c implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient f f19437b;

    j() {
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
        return r.a(this);
    }

    public final f i() {
        f fVar = this.f19437b;
        if (fVar != null) {
            return fVar;
        }
        f fVarJ = j();
        this.f19437b = fVarJ;
        return fVarJ;
    }

    f j() {
        Object[] array = toArray();
        int i15 = f.f19427c;
        return f.j(array, array.length);
    }
}
