package ak;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t0<C extends Comparable> extends i<C> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t0<Comparable<?>> f6965b = new t0<>(n0.C());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t0<Comparable<?>> f6966c = new t0<>(n0.E(q1.a()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient n0<q1<C>> f6967a;

    public static class a<C extends Comparable<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<q1<C>> f6968a = a1.g();

        public a<C> a(q1<C> q1Var) {
            zj.p.l(!q1Var.k(), "range must not be empty, but was %s", q1Var);
            this.f6968a.add(q1Var);
            return this;
        }

        public a<C> b(Iterable<q1<C>> iterable) {
            Iterator<q1<C>> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public t0<C> c() {
            n0.a aVar = new n0.a(this.f6968a.size());
            Collections.sort(this.f6968a, q1.m());
            o1 o1VarT = y0.t(this.f6968a.iterator());
            while (o1VarT.hasNext()) {
                q1 q1VarN = (q1) o1VarT.next();
                while (o1VarT.hasNext()) {
                    q1<C> q1Var = (q1) o1VarT.peek();
                    if (!q1VarN.j(q1Var)) {
                        break;
                    }
                    zj.p.m(q1VarN.i(q1Var).k(), "Overlapping ranges not permitted but found %s overlapping %s", q1VarN, q1Var);
                    q1VarN = q1VarN.n((q1) o1VarT.next());
                }
                aVar.a(q1VarN);
            }
            n0 n0VarK = aVar.k();
            if (n0VarK.isEmpty()) {
                return t0.e();
            }
            return (n0VarK.size() == 1 && ((q1) x0.h(n0VarK)).equals(q1.a())) ? t0.b() : new t0<>(n0VarK);
        }

        a<C> d(a<C> aVar) {
            b(aVar.f6968a);
            return this;
        }
    }

    t0(n0<q1<C>> n0Var) {
        this.f6967a = n0Var;
    }

    static <C extends Comparable> t0<C> b() {
        return f6966c;
    }

    public static <C extends Comparable<?>> a<C> d() {
        return new a<>();
    }

    public static <C extends Comparable> t0<C> e() {
        return f6965b;
    }

    @Override // ak.s1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u0<q1<C>> a() {
        return this.f6967a.isEmpty() ? u0.C() : new x1(this.f6967a, q1.m());
    }

    @Override // ak.i
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }
}
