package ak;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class b1 {

    /* JADX INFO: Add missing generic type declarations: [V1, V2] */
    class a<V1, V2> implements zj.g<V1, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f6811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f6812b;

        a(i iVar, Object obj) {
            this.f6811a = iVar;
            this.f6812b = obj;
        }

        @Override // zj.g
        public V2 apply(V1 v15) {
            return (V2) this.f6811a.a(this.f6812b, v15);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    class b<K, V1, V2> implements zj.g<Map.Entry<K, V1>, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f6813a;

        b(i iVar) {
            this.f6813a = iVar;
        }

        @Override // zj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public V2 apply(Map.Entry<K, V1> entry) {
            return (V2) this.f6813a.a(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V2] */
    class c<K, V2> extends ak.f<K, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map.Entry f6814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f6815b;

        c(Map.Entry entry, i iVar) {
            this.f6814a = entry;
            this.f6815b = iVar;
        }

        @Override // ak.f, java.util.Map.Entry
        public K getKey() {
            return (K) this.f6814a.getKey();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ak.f, java.util.Map.Entry
        public V2 getValue() {
            return (V2) this.f6815b.a(this.f6814a.getKey(), this.f6814a.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    class d<K, V1, V2> implements zj.g<Map.Entry<K, V1>, Map.Entry<K, V2>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f6816a;

        d(i iVar) {
            this.f6816a = iVar;
        }

        @Override // zj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
            return b1.r(this.f6816a, entry);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    class e<K, V> extends f2<Map.Entry<K, V>, V> {
        e(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ak.f2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    class f<K, V1, V2> implements i<K, V1, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zj.g f6817a;

        f(zj.g gVar) {
            this.f6817a = gVar;
        }

        @Override // ak.b1.i
        public V2 a(K k15, V1 v15) {
            return (V2) this.f6817a.apply(v15);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class g implements zj.g<Map.Entry<?, ?>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f6818a = new a("KEY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f6819b = new b("VALUE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ g[] f6820c = b();

        final enum a extends g {
            a(String str, int i15) {
                super(str, i15, null);
            }

            @Override // zj.g
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        final enum b extends g {
            b(String str, int i15) {
                super(str, i15, null);
            }

            @Override // zj.g
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private g(String str, int i15) {
            super(str, i15);
        }

        private static /* synthetic */ g[] b() {
            return new g[]{f6818a, f6819b};
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f6820c.clone();
        }

        /* synthetic */ g(String str, int i15, c1 c1Var) {
            this(str, i15);
        }
    }

    static abstract class h<K, V> extends b2.d<Map.Entry<K, V>> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object objN = b1.n(e(), key);
                if (zj.l.a(objN, entry.getValue()) && (objN != null || e().containsKey(key))) {
                    return true;
                }
            }
            return false;
        }

        abstract Map<K, V> e();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return e().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // ak.b2.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) zj.p.q(collection));
            } catch (UnsupportedOperationException unused) {
                return b2.j(this, collection.iterator());
            }
        }

        @Override // ak.b2.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) zj.p.q(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetG = b2.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetG.add(((Map.Entry) obj).getKey());
                    }
                }
                return e().keySet().retainAll(hashSetG);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e().size();
        }
    }

    public interface i<K, V1, V2> {
        V2 a(K k15, V1 v15);
    }

    static abstract class j<K, V> extends AbstractMap<K, V> {

        class a extends h<K, V> {
            a() {
            }

            @Override // ak.b1.h
            Map<K, V> e() {
                return j.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return j.this.a();
            }
        }

        j() {
        }

        abstract Iterator<Map.Entry<K, V>> a();

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }
    }

    static class k<K, V> extends b2.d<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, V> f6822a;

        k(Map<K, V> map) {
            this.f6822a = (Map) zj.p.q(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return e().containsKey(obj);
        }

        Map<K, V> e() {
            return this.f6822a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e().size();
        }
    }

    static class l<K, V1, V2> extends j<K, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, V1> f6823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final i<? super K, ? super V1, V2> f6824b;

        l(Map<K, V1> map, i<? super K, ? super V1, V2> iVar) {
            this.f6823a = (Map) zj.p.q(map);
            this.f6824b = (i) zj.p.q(iVar);
        }

        @Override // ak.b1.j
        Iterator<Map.Entry<K, V2>> a() {
            return y0.z(this.f6823a.entrySet().iterator(), b1.a(this.f6824b));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f6823a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f6823a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(Object obj) {
            V1 v15 = this.f6823a.get(obj);
            if (v15 != null || this.f6823a.containsKey(obj)) {
                return this.f6824b.a(obj, (Object) k1.a(v15));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f6823a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(Object obj) {
            if (this.f6823a.containsKey(obj)) {
                return this.f6824b.a(obj, (Object) k1.a(this.f6823a.remove(obj)));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f6823a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new m(this);
        }
    }

    static class m<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, V> f6825a;

        m(Map<K, V> map) {
            this.f6825a = (Map) zj.p.q(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return e().containsValue(obj);
        }

        final Map<K, V> e() {
            return this.f6825a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return b1.u(e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (zj.l.a(obj, entry.getValue())) {
                        e().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) zj.p.q(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = b2.f();
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return e().keySet().removeAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) zj.p.q(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = b2.f();
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return e().keySet().retainAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return e().size();
        }
    }

    static abstract class n<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f6826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient Collection<V> f6827b;

        n() {
        }

        abstract Set<Map.Entry<K, V>> a();

        Collection<V> b() {
            return new m(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f6826a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setA = a();
            this.f6826a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f6827b;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionB = b();
            this.f6827b = collectionB;
            return collectionB;
        }
    }

    static <K, V1, V2> zj.g<Map.Entry<K, V1>, Map.Entry<K, V2>> a(i<? super K, ? super V1, V2> iVar) {
        zj.p.q(iVar);
        return new d(iVar);
    }

    static <K, V1, V2> zj.g<Map.Entry<K, V1>, V2> b(i<? super K, ? super V1, V2> iVar) {
        zj.p.q(iVar);
        return new b(iVar);
    }

    static <K, V1, V2> i<K, V1, V2> c(zj.g<? super V1, V2> gVar) {
        zj.p.q(gVar);
        return new f(gVar);
    }

    static <K, V1, V2> zj.g<V1, V2> d(i<? super K, V1, V2> iVar, K k15) {
        zj.p.q(iVar);
        return new a(iVar, k15);
    }

    static int e(int i15) {
        if (i15 < 3) {
            y.b(i15, "expectedSize");
            return i15 + 1;
        }
        if (i15 < 1073741824) {
            return (int) Math.ceil(((double) i15) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    static boolean f(Map<?, ?> map, Object obj) {
        return y0.g(u(map.entrySet().iterator()), obj);
    }

    static boolean g(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> h(K k15, V v15) {
        return new m0(k15, v15);
    }

    static <K> zj.g<Map.Entry<K, ?>, K> i() {
        return g.f6818a;
    }

    public static <K, V> HashMap<K, V> j() {
        return new HashMap<>();
    }

    public static <K, V> IdentityHashMap<K, V> k() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> l(int i15) {
        return new LinkedHashMap<>(e(i15));
    }

    static boolean m(Map<?, ?> map, Object obj) {
        zj.p.q(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V n(Map<?, V> map, Object obj) {
        zj.p.q(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V o(Map<?, V> map, Object obj) {
        zj.p.q(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String p(Map<?, ?> map) {
        StringBuilder sbB = z.b(map.size());
        sbB.append('{');
        boolean z15 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z15) {
                sbB.append(", ");
            }
            sbB.append(entry.getKey());
            sbB.append('=');
            sbB.append(entry.getValue());
            z15 = false;
        }
        sbB.append('}');
        return sbB.toString();
    }

    public static <K, V1, V2> Map<K, V2> q(Map<K, V1> map, i<? super K, ? super V1, V2> iVar) {
        return new l(map, iVar);
    }

    static <V2, K, V1> Map.Entry<K, V2> r(i<? super K, ? super V1, V2> iVar, Map.Entry<K, V1> entry) {
        zj.p.q(iVar);
        zj.p.q(entry);
        return new c(entry, iVar);
    }

    public static <K, V1, V2> Map<K, V2> s(Map<K, V1> map, zj.g<? super V1, V2> gVar) {
        return q(map, c(gVar));
    }

    static <V> zj.g<Map.Entry<?, V>, V> t() {
        return g.f6819b;
    }

    static <K, V> Iterator<V> u(Iterator<Map.Entry<K, V>> it) {
        return new e(it);
    }
}
