package yk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
class p {

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final yk.c<?> f227506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<b> f227507b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<b> f227508c = new HashSet();

        b(yk.c<?> cVar) {
            this.f227506a = cVar;
        }

        void a(b bVar) {
            this.f227507b.add(bVar);
        }

        void b(b bVar) {
            this.f227508c.add(bVar);
        }

        yk.c<?> c() {
            return this.f227506a;
        }

        Set<b> d() {
            return this.f227507b;
        }

        boolean e() {
            return this.f227507b.isEmpty();
        }

        boolean f() {
            return this.f227508c.isEmpty();
        }

        void g(b bVar) {
            this.f227508c.remove(bVar);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0<?> f227509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f227510b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f227509a.equals(this.f227509a) && cVar.f227510b == this.f227510b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f227509a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f227510b).hashCode();
        }

        private c(d0<?> d0Var, boolean z15) {
            this.f227509a = d0Var;
            this.f227510b = z15;
        }
    }

    static void a(List<yk.c<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i15 = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i15++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i15 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new r(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<yk.c<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<yk.c<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it4 = map.values().iterator();
                while (it4.hasNext()) {
                    for (b bVar : (Set) it4.next()) {
                        for (q qVar : bVar.c().g()) {
                            if (qVar.d() && (set = (Set) map.get(new c(qVar.b(), qVar.f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it5 = map.values().iterator();
                while (it5.hasNext()) {
                    hashSet.addAll((Set) it5.next());
                }
                return hashSet;
            }
            yk.c<?> next = it.next();
            b bVar3 = new b(next);
            for (d0<? super Object> d0Var : next.j()) {
                c cVar = new c(d0Var, !next.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f227510b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", d0Var));
                }
                set2.add(bVar3);
            }
        }
    }
}
