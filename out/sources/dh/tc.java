package dh;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class tc extends pc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient oc f42299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f42300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f42301e;

    tc(oc ocVar, Object[] objArr, int i15, int i16) {
        this.f42299c = ocVar;
        this.f42300d = objArr;
        this.f42301e = i16;
    }

    @Override // dh.la, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f42299c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // dh.la
    final int e(Object[] objArr, int i15) {
        return i().e(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // dh.pc
    final mc j() {
        return new sc(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f42301e;
    }
}
