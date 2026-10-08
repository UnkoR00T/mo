package v;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class z2 implements p1 {
    protected static final Comparator<p1.a<?>> S;
    private static final z2 T;
    protected final TreeMap<p1.a<?>, Map<p1.c, Object>> R;

    static {
        Comparator<p1.a<?>> comparator = new Comparator() { // from class: v.y2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((p1.a) obj).c().compareTo(((p1.a) obj2).c());
            }
        };
        S = comparator;
        T = new z2(new TreeMap(comparator));
    }

    z2(TreeMap<p1.a<?>, Map<p1.c, Object>> treeMap) {
        this.R = treeMap;
    }

    public static z2 j0() {
        return T;
    }

    public static z2 k0(p1 p1Var) {
        if (z2.class.equals(p1Var.getClass())) {
            return (z2) p1Var;
        }
        TreeMap treeMap = new TreeMap(S);
        for (p1.a<?> aVar : p1Var.b()) {
            Set<p1.c> setE = p1Var.e(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (p1.c cVar : setE) {
                arrayMap.put(cVar, p1Var.i(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new z2(treeMap);
    }

    @Override // v.p1
    public Set<p1.a<?>> b() {
        return Collections.unmodifiableSet(this.R.keySet());
    }

    @Override // v.p1
    public p1.c c(p1.a<?> aVar) {
        Map<p1.c, Object> map = this.R.get(aVar);
        if (map != null) {
            return (p1.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // v.p1
    public <ValueT> ValueT d(p1.a<ValueT> aVar) {
        Map<p1.c, Object> map = this.R.get(aVar);
        if (map != null) {
            return (ValueT) map.get((p1.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // v.p1
    public Set<p1.c> e(p1.a<?> aVar) {
        Map<p1.c, Object> map = this.R.get(aVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // v.p1
    public <ValueT> ValueT f(p1.a<ValueT> aVar, ValueT valuet) {
        Map<p1.c, Object> map = this.R.get(aVar);
        return map == null ? valuet : (ValueT) map.get((p1.c) Collections.min(map.keySet()));
    }

    @Override // v.p1
    public void g(String str, p1.b bVar) {
        for (Map.Entry<p1.a<?>, Map<p1.c, Object>> entry : this.R.tailMap(p1.a.a(str, Void.class)).entrySet()) {
            if (!entry.getKey().c().startsWith(str) || !bVar.a(entry.getKey())) {
                return;
            }
        }
    }

    @Override // v.p1
    public boolean h(p1.a<?> aVar) {
        return this.R.containsKey(aVar);
    }

    @Override // v.p1
    public <ValueT> ValueT i(p1.a<ValueT> aVar, p1.c cVar) {
        Map<p1.c, Object> map = this.R.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return (ValueT) map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }
}
