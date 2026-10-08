package p009PRn;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class g1<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c<K, V> f847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c<K, V> f848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f849c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f850d = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // PRn.g1.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f854d;
        }

        @Override // PRn.g1.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f853c;
        }
    }

    private static class b<K, V> extends e<K, V> {
        b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // PRn.g1.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f853c;
        }

        @Override // PRn.g1.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f854d;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final V f852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c<K, V> f853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c<K, V> f854d;

        c(K k15, V v15) {
            this.f851a = k15;
            this.f852b = v15;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f851a.equals(cVar.f851a) && this.f852b.equals(cVar.f852b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f851a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f852b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f851a.hashCode() ^ this.f852b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v15) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f851a + "=" + this.f852b;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c<K, V> f855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f856b = true;

        d() {
        }

        @Override // PRn.g1.f
        void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f855a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f854d;
                this.f855a = cVar3;
                this.f856b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f856b) {
                this.f856b = false;
                this.f855a = g1.this.f847a;
            } else {
                c<K, V> cVar = this.f855a;
                this.f855a = cVar != null ? cVar.f853c : null;
            }
            return this.f855a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f856b) {
                return g1.this.f847a != null;
            }
            c<K, V> cVar = this.f855a;
            return (cVar == null || cVar.f853c == null) ? false : true;
        }
    }

    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c<K, V> f858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c<K, V> f859b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f858a = cVar2;
            this.f859b = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f859b;
            c<K, V> cVar2 = this.f858a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // PRn.g1.f
        public void a(c<K, V> cVar) {
            if (this.f858a == cVar && cVar == this.f859b) {
                this.f859b = null;
                this.f858a = null;
            }
            c<K, V> cVar2 = this.f858a;
            if (cVar2 == cVar) {
                this.f858a = c(cVar2);
            }
            if (this.f859b == cVar) {
                this.f859b = f();
            }
        }

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f859b;
            this.f859b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f859b != null;
        }
    }

    public static abstract class f<K, V> {
        abstract void a(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.f848b, this.f847a);
        this.f849c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Map.Entry<K, V> e() {
        return this.f847a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (size() != g1Var.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it4 = g1Var.iterator();
        while (it.hasNext() && it4.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it4.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it4.hasNext()) ? false : true;
    }

    protected c<K, V> f(K k15) {
        c<K, V> cVar = this.f847a;
        while (cVar != null && !cVar.f851a.equals(k15)) {
            cVar = cVar.f853c;
        }
        return cVar;
    }

    public g1<K, V>.d g() {
        g1<K, V>.d dVar = new d();
        this.f849c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> h() {
        return this.f848b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    c<K, V> i(K k15, V v15) {
        c<K, V> cVar = new c<>(k15, v15);
        this.f850d++;
        c<K, V> cVar2 = this.f848b;
        if (cVar2 == null) {
            this.f847a = cVar;
            this.f848b = cVar;
            return cVar;
        }
        cVar2.f853c = cVar;
        cVar.f854d = cVar2;
        this.f848b = cVar;
        return cVar;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f847a, this.f848b);
        this.f849c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(K k15, V v15) {
        c<K, V> cVarF = f(k15);
        if (cVarF != null) {
            return cVarF.f852b;
        }
        i(k15, v15);
        return null;
    }

    public V k(K k15) {
        c<K, V> cVarF = f(k15);
        if (cVarF == null) {
            return null;
        }
        this.f850d--;
        if (!this.f849c.isEmpty()) {
            Iterator<f<K, V>> it = this.f849c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarF);
            }
        }
        c<K, V> cVar = cVarF.f854d;
        if (cVar != null) {
            cVar.f853c = cVarF.f853c;
        } else {
            this.f847a = cVarF.f853c;
        }
        c<K, V> cVar2 = cVarF.f853c;
        if (cVar2 != null) {
            cVar2.f854d = cVar;
        } else {
            this.f848b = cVar;
        }
        cVarF.f853c = null;
        cVarF.f854d = null;
        return cVarF.f852b;
    }

    public int size() {
        return this.f850d;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb5.append(it.next().toString());
            if (it.hasNext()) {
                sb5.append(", ");
            }
        }
        sb5.append("]");
        return sb5.toString();
    }
}
