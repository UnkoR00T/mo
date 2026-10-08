package ch;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class z1 extends l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient k1 f26719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f26720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f26721e = 1;

    z1(k1 k1Var, Object[] objArr, int i15, int i16) {
        this.f26719c = k1Var;
        this.f26720d = objArr;
    }

    @Override // ch.d1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f26719c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // ch.d1
    final int e(Object[] objArr, int i15) {
        return j().e(objArr, i15);
    }

    @Override // ch.d1
    /* JADX INFO: renamed from: h */
    public final g2 iterator() {
        return j().listIterator(0);
    }

    @Override // ch.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return j().listIterator(0);
    }

    @Override // ch.l1
    final i1 k() {
        return new y1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26721e;
    }
}
