package bh;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class n extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient i f19454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f19455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f19456e;

    n(i iVar, Object[] objArr, int i15, int i16) {
        this.f19454c = iVar;
        this.f19455d = objArr;
        this.f19456e = i16;
    }

    @Override // bh.c, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f19454c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // bh.c
    final int e(Object[] objArr, int i15) {
        return i().e(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // bh.j
    final f j() {
        return new m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19456e;
    }
}
