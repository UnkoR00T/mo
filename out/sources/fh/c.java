package fh;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class c extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f62957a;

    c(e eVar) {
        this.f62957a = eVar;
    }

    @Override // fh.y0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f62957a.f63004c.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // fh.y0
    final Map e() {
        return this.f62957a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d(this.f62957a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        e eVar = this.f62957a;
        m.n(eVar.f63005d, entry.getKey());
        return true;
    }
}
