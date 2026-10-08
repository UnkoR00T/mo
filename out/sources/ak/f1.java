package ak;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 {

    private static class a<K, V> extends ak.c<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        transient zj.w<? extends List<V>> f6883g;

        a(Map<K, Collection<V>> map, zj.w<? extends List<V>> wVar) {
            super(map);
            this.f6883g = (zj.w) zj.p.q(wVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ak.d
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public List<V> u() {
            return this.f6883g.get();
        }

        @Override // ak.g
        Map<K, Collection<V>> e() {
            return w();
        }

        @Override // ak.g
        Set<K> g() {
            return y();
        }
    }

    static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e().c(entry.getKey(), entry.getValue());
        }

        abstract d1<K, V> e();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return e().size();
        }
    }

    private static final class c<K, V1, V2> extends d<K, V1, V2> implements z0<K, V2> {
        c(z0<K, V1> z0Var, b1.i<? super K, ? super V1, V2> iVar) {
            super(z0Var, iVar);
        }

        @Override // ak.f1.d, ak.d1
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public List<V2> get(K k15) {
            return n(k15, this.f6884e.get(k15));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ak.f1.d
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<V2> n(K k15, Collection<V1> collection) {
            return a1.k((List) collection, b1.d(this.f6885f, k15));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d<K, V1, V2> extends g<K, V2> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final d1<K, V1> f6884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final b1.i<? super K, ? super V1, V2> f6885f;

        d(d1<K, V1> d1Var, b1.i<? super K, ? super V1, V2> iVar) {
            this.f6884e = (d1) zj.p.q(d1Var);
            this.f6885f = (b1.i) zj.p.q(iVar);
        }

        @Override // ak.d1
        public void clear() {
            this.f6884e.clear();
        }

        @Override // ak.g
        Map<K, Collection<V2>> e() {
            return b1.q(this.f6884e.b(), new b1.i() { // from class: ak.g1
                @Override // ak.b1.i
                public final Object a(Object obj, Object obj2) {
                    return this.f6894a.n(obj, (Collection) obj2);
                }
            });
        }

        @Override // ak.g
        Collection<Map.Entry<K, V2>> f() {
            return new g.a();
        }

        @Override // ak.g
        Set<K> g() {
            return this.f6884e.keySet();
        }

        @Override // ak.d1
        public Collection<V2> get(K k15) {
            throw null;
        }

        @Override // ak.g
        Collection<V2> h() {
            return z.d(this.f6884e.a(), b1.b(this.f6885f));
        }

        @Override // ak.g
        Iterator<Map.Entry<K, V2>> i() {
            return y0.z(this.f6884e.a().iterator(), b1.a(this.f6885f));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Collection<V2> n(K k15, Collection<V1> collection) {
            throw null;
        }

        @Override // ak.d1
        public boolean put(K k15, V2 v15) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ak.g, ak.d1
        public boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        @Override // ak.d1
        public int size() {
            return this.f6884e.size();
        }
    }

    static boolean a(d1<?, ?> d1Var, Object obj) {
        if (obj == d1Var) {
            return true;
        }
        if (obj instanceof d1) {
            return d1Var.b().equals(((d1) obj).b());
        }
        return false;
    }

    public static <K, V> z0<K, V> b(Map<K, Collection<V>> map, zj.w<? extends List<V>> wVar) {
        return new a(map, wVar);
    }

    public static <K, V1, V2> z0<K, V2> c(z0<K, V1> z0Var, b1.i<? super K, ? super V1, V2> iVar) {
        return new c(z0Var, iVar);
    }

    public static <K, V1, V2> z0<K, V2> d(z0<K, V1> z0Var, zj.g<? super V1, V2> gVar) {
        zj.p.q(gVar);
        return c(z0Var, b1.c(gVar));
    }
}
