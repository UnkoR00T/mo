package fh;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class v extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c0 f63577a;

    v(c0 c0Var) {
        this.f63577a = c0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f63577a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapR = this.f63577a.r();
        if (mapR != null) {
            return mapR.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iE = this.f63577a.E(entry.getKey());
            if (iE != -1 && gl.a(c0.o(this.f63577a, iE), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        c0 c0Var = this.f63577a;
        Map mapR = c0Var.r();
        return mapR != null ? mapR.entrySet().iterator() : new t(c0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapR = this.f63577a.r();
        if (mapR != null) {
            return mapR.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        c0 c0Var = this.f63577a;
        if (c0Var.y()) {
            return false;
        }
        int iD = c0Var.D();
        Object key = entry.getKey();
        Object value = entry.getValue();
        c0 c0Var2 = this.f63577a;
        int iB = d0.b(key, value, iD, c0.n(c0Var2), c0Var2.a(), c0Var2.b(), c0Var2.c());
        if (iB == -1) {
            return false;
        }
        this.f63577a.w(iB, iD);
        this.f63577a.f62964f--;
        this.f63577a.u();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f63577a.size();
    }
}
