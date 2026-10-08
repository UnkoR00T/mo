package eh;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class g1 extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient r0 f50565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f50566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f50567e;

    g1(r0 r0Var, Object[] objArr, int i15, int i16) {
        this.f50565c = r0Var;
        this.f50566d = objArr;
        this.f50567e = i16;
    }

    @Override // eh.k0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f50565c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // eh.k0
    final int e(Object[] objArr, int i15) {
        return i().e(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // eh.s0
    final p0 j() {
        return new f1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f50567e;
    }
}
