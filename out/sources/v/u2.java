package v;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends z2 implements t2 {
    private static final p1.c U = p1.c.OPTIONAL;

    private u2(TreeMap<p1.a<?>, Map<p1.c, Object>> treeMap) {
        super(treeMap);
    }

    public static u2 l0() {
        return new u2(new TreeMap(z2.S));
    }

    public static u2 m0(p1 p1Var) {
        TreeMap treeMap = new TreeMap(z2.S);
        for (p1.a<?> aVar : p1Var.b()) {
            Set<p1.c> setE = p1Var.e(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (p1.c cVar : setE) {
                arrayMap.put(cVar, p1Var.i(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new u2(treeMap);
    }

    @Override // v.t2
    public <ValueT> void e0(p1.a<ValueT> aVar, p1.c cVar, ValueT valuet) {
        Map<p1.c, Object> map = this.R.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.R.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        p1.c cVar2 = (p1.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !p1.T(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }

    @Override // v.t2
    public <ValueT> void m(p1.a<ValueT> aVar, ValueT valuet) {
        e0(aVar, U, valuet);
    }

    public <ValueT> ValueT n0(p1.a<ValueT> aVar) {
        return (ValueT) this.R.remove(aVar);
    }
}
