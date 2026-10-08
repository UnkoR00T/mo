package rs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import pq.IndexedValue;

/* JADX INFO: loaded from: classes4.dex */
final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, g1> f175688a = new LinkedHashMap();

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f175689a;

        /* JADX INFO: renamed from: rs.n1$a$a, reason: collision with other inner class name */
        public final class C4484a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f175691a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f175692b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List<oq.r<String, r1>> f175693c = new ArrayList();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private oq.r<String, r1> f175694d = oq.y.a("V", null);

            public C4484a(String str, String str2) {
                this.f175691a = str;
                this.f175692b = str2;
            }

            public final oq.r<String, g1> a() {
                ss.f0 f0Var = ss.f0.f183849a;
                String strC = a.this.c();
                String str = this.f175691a;
                List<oq.r<String, r1>> list = this.f175693c;
                ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((oq.r) it.next()).c());
                }
                String strM = f0Var.m(strC, f0Var.k(str, arrayList, this.f175694d.c()));
                r1 r1VarD = this.f175694d.d();
                List<oq.r<String, r1>> list2 = this.f175693c;
                ArrayList arrayList2 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add((r1) ((oq.r) it4.next()).d());
                }
                return oq.y.a(strM, new g1(r1VarD, arrayList2, this.f175692b));
            }

            public final void b(String str, i... iVarArr) {
                r1 r1Var;
                List<oq.r<String, r1>> list = this.f175693c;
                if (iVarArr.length == 0) {
                    r1Var = null;
                } else {
                    Iterable<IndexedValue> iterableC1 = pq.n.C1(iVarArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(iterableC1, 10)), 16));
                    for (IndexedValue indexedValue : iterableC1) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.c()), (i) indexedValue.d());
                    }
                    r1Var = new r1(linkedHashMap);
                }
                list.add(oq.y.a(str, r1Var));
            }

            public final void c(String str, i... iVarArr) {
                Iterable<IndexedValue> iterableC1 = pq.n.C1(iVarArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(iterableC1, 10)), 16));
                for (IndexedValue indexedValue : iterableC1) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.c()), (i) indexedValue.d());
                }
                this.f175694d = oq.y.a(str, new r1(linkedHashMap));
            }

            public final void d(jt.e eVar) {
                this.f175694d = oq.y.a(eVar.j(), null);
            }
        }

        public a(String str) {
            this.f175689a = str;
        }

        public static /* synthetic */ void b(a aVar, String str, String str2, er.l lVar, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                str2 = null;
            }
            aVar.a(str, str2, lVar);
        }

        public final void a(String str, String str2, er.l<? super C4484a, oq.i0> lVar) {
            Map map = n1.this.f175688a;
            C4484a c4484a = new C4484a(str, str2);
            lVar.b(c4484a);
            oq.r<String, g1> rVarA = c4484a.a();
            map.put(rVarA.c(), rVarA.d());
        }

        public final String c() {
            return this.f175689a;
        }
    }

    public final Map<String, g1> b() {
        return this.f175688a;
    }
}
