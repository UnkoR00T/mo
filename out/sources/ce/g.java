package ce;

import ce.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class g<K extends l, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<K, V> f25499a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<K, a<K, V>> f25500b = new HashMap();

    private static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f25501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<V> f25502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a<K, V> f25503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a<K, V> f25504d;

        a() {
            this(null);
        }

        public void a(V v15) {
            if (this.f25502b == null) {
                this.f25502b = new ArrayList();
            }
            this.f25502b.add(v15);
        }

        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.f25502b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f25502b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k15) {
            this.f25504d = this;
            this.f25503c = this;
            this.f25501a = k15;
        }
    }

    g() {
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f25499a;
        aVar.f25504d = aVar2;
        aVar.f25503c = aVar2.f25503c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f25499a;
        aVar.f25504d = aVar2.f25504d;
        aVar.f25503c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f25504d;
        aVar2.f25503c = aVar.f25503c;
        aVar.f25503c.f25504d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f25503c.f25504d = aVar;
        aVar.f25504d.f25503c = aVar;
    }

    public V a(K k15) {
        a<K, V> aVar = this.f25500b.get(k15);
        if (aVar == null) {
            aVar = new a<>(k15);
            this.f25500b.put(k15, aVar);
        } else {
            k15.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k15, V v15) {
        a<K, V> aVar = this.f25500b.get(k15);
        if (aVar == null) {
            aVar = new a<>(k15);
            c(aVar);
            this.f25500b.put(k15, aVar);
        } else {
            k15.a();
        }
        aVar.a(v15);
    }

    public V f() {
        for (a aVar = this.f25499a.f25504d; !aVar.equals(this.f25499a); aVar = aVar.f25504d) {
            V v15 = (V) aVar.b();
            if (v15 != null) {
                return v15;
            }
            e(aVar);
            this.f25500b.remove(aVar.f25501a);
            ((l) aVar.f25501a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f25499a.f25503c;
        boolean z15 = false;
        while (!aVar.equals(this.f25499a)) {
            sb5.append('{');
            sb5.append(aVar.f25501a);
            sb5.append(':');
            sb5.append(aVar.c());
            sb5.append("}, ");
            aVar = aVar.f25503c;
            z15 = true;
        }
        if (z15) {
            sb5.delete(sb5.length() - 2, sb5.length());
        }
        sb5.append(" )");
        return sb5.toString();
    }
}
