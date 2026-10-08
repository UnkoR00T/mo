package st;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class t1 extends zt.e<r1<?>, r1<?>> implements Iterable<r1<?>>, gr.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f184126b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t1 f184127c = new t1((List<? extends r1<?>>) pq.v.n());

    public static final class a extends zt.z<r1<?>, r1<?>> {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        @Override // zt.z
        public int c(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, er.l<? super String, Integer> lVar) {
            int iIntValue;
            Integer num = concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(str);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Integer numB = lVar.b(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(numB.intValue()));
                        iIntValue = numB.intValue();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return iIntValue;
        }

        public final t1 j(List<? extends r1<?>> list) {
            return list.isEmpty() ? k() : new t1(list, null);
        }

        public final t1 k() {
            return t1.f184127c;
        }

        private a() {
        }
    }

    public /* synthetic */ t1(List list, fr.k kVar) {
        this((List<? extends r1<?>>) list);
    }

    @Override // zt.a
    protected zt.z<r1<?>, r1<?>> f() {
        return f184126b;
    }

    public final t1 l(t1 t1Var) {
        r1 r1VarA;
        if (isEmpty() && t1Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f184126b.h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            r1<?> r1Var = e().get(iIntValue);
            r1<?> r1Var2 = t1Var.e().get(iIntValue);
            if (r1Var == null) {
                r1VarA = r1Var2 != null ? r1Var2.a(r1Var) : null;
            } else {
                r1VarA = r1Var.a(r1Var2);
            }
            cu.a.a(arrayList, r1VarA);
        }
        return f184126b.j(arrayList);
    }

    public final boolean n(r1<?> r1Var) {
        return e().get(f184126b.f(r1Var.b())) != null;
    }

    public final t1 o(t1 t1Var) {
        r1 r1VarC;
        if (isEmpty() && t1Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f184126b.h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            r1<?> r1Var = e().get(iIntValue);
            r1<?> r1Var2 = t1Var.e().get(iIntValue);
            if (r1Var == null) {
                r1VarC = r1Var2 != null ? r1Var2.c(r1Var) : null;
            } else {
                r1VarC = r1Var.c(r1Var2);
            }
            cu.a.a(arrayList, r1VarC);
        }
        return f184126b.j(arrayList);
    }

    public final t1 q(r1<?> r1Var) {
        if (n(r1Var)) {
            return this;
        }
        if (isEmpty()) {
            return new t1(r1Var);
        }
        return f184126b.j(pq.v.M0(pq.v.f1(this), r1Var));
    }

    public final t1 s(r1<?> r1Var) {
        if (!isEmpty()) {
            zt.c<r1<?>> cVarE = e();
            ArrayList arrayList = new ArrayList();
            for (r1<?> r1Var2 : cVarE) {
                if (!fr.t.c(r1Var2, r1Var)) {
                    arrayList.add(r1Var2);
                }
            }
            if (arrayList.size() != e().e()) {
                return f184126b.j(arrayList);
            }
        }
        return this;
    }

    private t1(List<? extends r1<?>> list) {
        for (r1<?> r1Var : list) {
            h(r1Var.b(), r1Var);
        }
    }

    private t1(r1<?> r1Var) {
        this((List<? extends r1<?>>) pq.v.e(r1Var));
    }
}
