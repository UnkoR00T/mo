package ch;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l1 extends d1 implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient i1 f26107b;

    l1() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return e2.b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return e2.a(this);
    }

    public final i1 j() {
        i1 i1Var = this.f26107b;
        if (i1Var != null) {
            return i1Var;
        }
        i1 i1VarK = k();
        this.f26107b = i1VarK;
        return i1VarK;
    }

    i1 k() {
        Object[] array = toArray();
        int i15 = i1.f25947c;
        return i1.k(array, array.length);
    }
}
