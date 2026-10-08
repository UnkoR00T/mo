package ak;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class o0<K, V> extends q0<K, V> implements z0<K, V> {

    public static final class a<K, V> extends q0.c<K, V> {
        public o0<K, V> e() {
            return (o0) super.a();
        }

        public a<K, V> f(K k15, V v15) {
            super.d(k15, v15);
            return this;
        }
    }

    o0(p0<K, n0<V>> p0Var, int i15) {
        super(p0Var, i15);
    }

    public static <K, V> o0<K, V> A() {
        return g0.f6893g;
    }

    public static <K, V> o0<K, V> B(K k15, V v15) {
        a aVarV = v();
        aVarV.f(k15, v15);
        return aVarV.e();
    }

    public static <K, V> a<K, V> v() {
        return new a<>();
    }

    static <K, V> o0<K, V> w(Collection<? extends Map.Entry<K, l0.b<V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return A();
        }
        p0.a aVar = new p0.a(collection.size());
        int size = 0;
        for (Map.Entry<K, l0.b<V>> entry : collection) {
            K key = entry.getKey();
            n0.a aVar2 = (n0.a) entry.getValue();
            n0 n0VarK = comparator == null ? aVar2.k() : aVar2.l(comparator);
            aVar.g(key, n0VarK);
            size += n0VarK.size();
        }
        return new o0<>(aVar.d(), size);
    }

    @Override // ak.d1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public n0<V> get(K k15) {
        n0<V> n0Var = (n0) this.f6936e.get(k15);
        return n0Var == null ? n0.C() : n0Var;
    }
}
