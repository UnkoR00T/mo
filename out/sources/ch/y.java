package ch;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class y extends p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a0 f26527a;

    y(a0 a0Var) {
        this.f26527a = a0Var;
    }

    @Override // ch.p1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f26527a.f25747c.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // ch.p1
    final Map e() {
        return this.f26527a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new z(this.f26527a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        a0 a0Var = this.f26527a;
        i0.k(a0Var.f25748d, entry.getKey());
        return true;
    }
}
