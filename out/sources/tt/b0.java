package tt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import st.e1;
import st.i1;
import st.n0;
import st.n1;
import st.o2;
import st.s0;
import st.t0;
import st.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f192109a = new b0();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f192110a = new c("START", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f192111b = new C5018a("ACCEPT_NULL", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f192112c = new d("UNKNOWN", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f192113d = new b("NOT_NULL", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f192114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f192115f;

        /* JADX INFO: renamed from: tt.b0$a$a, reason: collision with other inner class name */
        static final class C5018a extends a {
            C5018a(String str, int i15) {
                super(str, i15, null);
            }

            @Override // tt.b0.a
            public a e(o2 o2Var) {
                return g(o2Var);
            }
        }

        static final class b extends a {
            b(String str, int i15) {
                super(str, i15, null);
            }

            @Override // tt.b0.a
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b e(o2 o2Var) {
                return this;
            }
        }

        static final class c extends a {
            c(String str, int i15) {
                super(str, i15, null);
            }

            @Override // tt.b0.a
            public a e(o2 o2Var) {
                return g(o2Var);
            }
        }

        static final class d extends a {
            d(String str, int i15) {
                super(str, i15, null);
            }

            @Override // tt.b0.a
            public a e(o2 o2Var) {
                a aVarG = g(o2Var);
                return aVarG == a.f192111b ? this : aVarG;
            }
        }

        static {
            a[] aVarArrB = b();
            f192114e = aVarArrB;
            f192115f = wq.b.a(aVarArrB);
        }

        public /* synthetic */ a(String str, int i15, fr.k kVar) {
            this(str, i15);
        }

        private static final /* synthetic */ a[] b() {
            return new a[]{f192110a, f192111b, f192112c, f192113d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f192114e.clone();
        }

        public abstract a e(o2 o2Var);

        protected final a g(o2 o2Var) {
            if (o2Var.U0()) {
                return f192111b;
            }
            if ((o2Var instanceof st.z) && (((st.z) o2Var).f1() instanceof n1)) {
                return f192113d;
            }
            if (!(o2Var instanceof n1) && s.f192143a.a(o2Var)) {
                return f192113d;
            }
            return f192112c;
        }

        private a(String str, int i15) {
            super(str, i15);
        }
    }

    static final /* synthetic */ class b extends fr.q implements er.p<t0, t0, Boolean> {
        b(Object obj) {
            super(2, obj, b0.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        }

        @Override // er.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Boolean B(t0 t0Var, t0 t0Var2) {
            return Boolean.valueOf(((b0) this.f66391b).g(t0Var, t0Var2));
        }
    }

    static final /* synthetic */ class c extends fr.q implements er.p<t0, t0, Boolean> {
        c(Object obj) {
            super(2, obj, q.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        }

        @Override // er.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Boolean B(t0 t0Var, t0 t0Var2) {
            return Boolean.valueOf(((q) this.f66391b).c(t0Var, t0Var2));
        }
    }

    private b0() {
    }

    private final Collection<e1> c(Collection<? extends e1> collection, er.p<? super e1, ? super e1, Boolean> pVar) {
        ArrayList<e1> arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e1 e1Var = (e1) it.next();
            if (!arrayList.isEmpty()) {
                for (e1 e1Var2 : arrayList) {
                    if (e1Var2 != e1Var && pVar.B(e1Var2, e1Var).booleanValue()) {
                        it.remove();
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private final e1 e(Set<? extends e1> set) {
        if (set.size() == 1) {
            return (e1) pq.v.O0(set);
        }
        new a0(set);
        Set<? extends e1> set2 = set;
        Collection<e1> collectionC = c(set2, new b(this));
        collectionC.isEmpty();
        e1 e1VarB = ft.q.f66963f.b(collectionC);
        if (e1VarB != null) {
            return e1VarB;
        }
        Collection<e1> collectionC2 = c(collectionC, new c(p.f192137b.a()));
        collectionC2.isEmpty();
        return collectionC2.size() < 2 ? (e1) pq.v.O0(collectionC2) : new s0(set2).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(Set set) {
        return "This collections cannot be empty! input types: " + pq.v.v0(set, null, null, null, 0, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(t0 t0Var, t0 t0Var2) {
        q qVarA = p.f192137b.a();
        return qVarA.b(t0Var, t0Var2) && !qVarA.b(t0Var2, t0Var);
    }

    public final e1 d(List<? extends e1> list) {
        list.size();
        ArrayList<e1> arrayList = new ArrayList();
        for (e1 e1Var : list) {
            if (e1Var.T0() instanceof s0) {
                Collection<t0> collectionQ = e1Var.T0().q();
                ArrayList arrayList2 = new ArrayList(pq.v.y(collectionQ, 10));
                Iterator<T> it = collectionQ.iterator();
                while (it.hasNext()) {
                    e1 e1VarD = n0.d((t0) it.next());
                    if (e1Var.U0()) {
                        e1VarD = e1VarD.X0(true);
                    }
                    arrayList2.add(e1VarD);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(e1Var);
            }
        }
        a aVarE = a.f192110a;
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            aVarE = aVarE.e((o2) it4.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (e1 e1VarI : arrayList) {
            if (aVarE == a.f192113d) {
                if (e1VarI instanceof i) {
                    e1VarI = i1.k((i) e1VarI);
                }
                e1VarI = i1.i(e1VarI, false, 1, null);
            }
            linkedHashSet.add(e1VarI);
        }
        List<? extends e1> list2 = list;
        ArrayList arrayList3 = new ArrayList(pq.v.y(list2, 10));
        Iterator<T> it5 = list2.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((e1) it5.next()).S0());
        }
        Iterator it6 = arrayList3.iterator();
        if (!it6.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it6.next();
        while (it6.hasNext()) {
            next = ((t1) next).o((t1) it6.next());
        }
        return e(linkedHashSet).Z0((t1) next);
    }
}
