package ft;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import st.e1;
import st.f2;
import st.h2;
import st.p2;
import st.t0;
import st.t1;
import st.w0;
import st.x1;
import vr.i0;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements x1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f66963f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f66964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f66965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<t0> f66966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e1 f66967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final oq.k f66968e;

    public static final class a {

        /* JADX INFO: renamed from: ft.q$a$a, reason: collision with other inner class name */
        private enum EnumC1498a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE;


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ wq.a f66972d = wq.b.a(b());
        }

        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f66973a;

            static {
                int[] iArr = new int[EnumC1498a.values().length];
                try {
                    iArr[EnumC1498a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1498a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f66973a = iArr;
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private final e1 a(Collection<? extends e1> collection, EnumC1498a enumC1498a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                e1 e1Var = (e1) it.next();
                next = q.f66963f.e((e1) next, e1Var, enumC1498a);
            }
            return (e1) next;
        }

        private final e1 c(q qVar, q qVar2, EnumC1498a enumC1498a) {
            Set setR0;
            int i15 = b.f66973a[enumC1498a.ordinal()];
            if (i15 == 1) {
                setR0 = pq.v.r0(qVar.j(), qVar2.j());
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                setR0 = pq.v.l1(qVar.j(), qVar2.j());
            }
            return w0.f(t1.f184126b.k(), new q(qVar.f66964a, qVar.f66965b, setR0, null), false);
        }

        private final e1 d(q qVar, e1 e1Var) {
            if (qVar.j().contains(e1Var)) {
                return e1Var;
            }
            return null;
        }

        private final e1 e(e1 e1Var, e1 e1Var2, EnumC1498a enumC1498a) {
            if (e1Var != null && e1Var2 != null) {
                x1 x1VarT0 = e1Var.T0();
                x1 x1VarT1 = e1Var2.T0();
                boolean z15 = x1VarT0 instanceof q;
                if (z15 && (x1VarT1 instanceof q)) {
                    return c((q) x1VarT0, (q) x1VarT1, enumC1498a);
                }
                if (z15) {
                    return d((q) x1VarT0, e1Var2);
                }
                if (x1VarT1 instanceof q) {
                    return d((q) x1VarT1, e1Var);
                }
            }
            return null;
        }

        public final e1 b(Collection<? extends e1> collection) {
            return a(collection, EnumC1498a.INTERSECTION_TYPE);
        }

        private a() {
        }
    }

    public /* synthetic */ q(long j15, i0 i0Var, Set set, fr.k kVar) {
        this(j15, i0Var, set);
    }

    private final List<t0> k() {
        return (List) this.f66968e.getValue();
    }

    private final boolean l() {
        Collection<t0> collectionA = w.a(this.f66965b);
        if ((collectionA instanceof Collection) && collectionA.isEmpty()) {
            return true;
        }
        Iterator<T> it = collectionA.iterator();
        while (it.hasNext()) {
            if (this.f66966c.contains((t0) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List m(q qVar) {
        List listT = pq.v.t(h2.f(qVar.i().y().t(), pq.v.e(new f2(p2.IN_VARIANCE, qVar.f66967d)), null, 2, null));
        if (!qVar.l()) {
            listT.add(qVar.i().M());
        }
        return listT;
    }

    private final String n() {
        return '[' + pq.v.v0(this.f66966c, ",", null, null, 0, null, p.f66962a, 30, null) + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o(t0 t0Var) {
        return t0Var.toString();
    }

    @Override // st.x1
    public x1 a(tt.g gVar) {
        return this;
    }

    @Override // st.x1
    public vr.h c() {
        return null;
    }

    @Override // st.x1
    public boolean d() {
        return false;
    }

    @Override // st.x1
    public List<m1> getParameters() {
        return pq.v.n();
    }

    @Override // st.x1
    public sr.j i() {
        return this.f66965b.i();
    }

    public final Set<t0> j() {
        return this.f66966c;
    }

    @Override // st.x1
    public Collection<t0> q() {
        return k();
    }

    public String toString() {
        return "IntegerLiteralType" + n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private q(long j15, i0 i0Var, Set<? extends t0> set) {
        this.f66967d = w0.f(t1.f184126b.k(), this, false);
        this.f66968e = oq.l.a(new o(this));
        this.f66964a = j15;
        this.f66965b = i0Var;
        this.f66966c = set;
    }
}
