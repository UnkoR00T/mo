package fh;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class i1 extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient o0 f63092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f63093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f63094e = 1;

    i1(o0 o0Var, Object[] objArr, int i15, int i16) {
        this.f63092c = o0Var;
        this.f63093d = objArr;
    }

    @Override // fh.h0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f63092c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // fh.h0
    final int e(Object[] objArr, int i15) {
        return i().e(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // fh.p0
    final m0 j() {
        return new h1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f63094e;
    }
}
