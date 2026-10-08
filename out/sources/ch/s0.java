package ch;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class s0 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ y0 f26322a;

    s0(y0 y0Var) {
        this.f26322a = y0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f26322a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapR = this.f26322a.r();
        if (mapR != null) {
            return mapR.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iE = this.f26322a.E(entry.getKey());
            if (iE != -1 && r.a(y0.o(this.f26322a, iE), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        y0 y0Var = this.f26322a;
        Map mapR = y0Var.r();
        return mapR != null ? mapR.entrySet().iterator() : new q0(y0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapR = this.f26322a.r();
        if (mapR != null) {
            return mapR.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        y0 y0Var = this.f26322a;
        if (y0Var.y()) {
            return false;
        }
        int iD = y0Var.D();
        Object key = entry.getKey();
        Object value = entry.getValue();
        y0 y0Var2 = this.f26322a;
        int iB = z0.b(key, value, iD, y0.n(y0Var2), y0Var2.a(), y0Var2.b(), y0Var2.c());
        if (iB == -1) {
            return false;
        }
        this.f26322a.w(iB, iD);
        this.f26322a.f26534f--;
        this.f26322a.u();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26322a.size();
    }
}
