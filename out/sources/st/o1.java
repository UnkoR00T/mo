package st;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f184089c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o1 f184090d = new o1(q1.a.f184118a, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q1 f184091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f184092b;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(int i15, vr.l1 l1Var) {
            if (i15 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + l1Var.getName());
        }

        private a() {
        }
    }

    public o1(q1 q1Var, boolean z15) {
        this.f184091a = q1Var;
        this.f184092b = z15;
    }

    private final void a(wr.h hVar, wr.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator<wr.c> it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().g());
        }
        for (wr.c cVar : hVar2) {
            if (hashSet.contains(cVar.g())) {
                this.f184091a.d(cVar);
            }
        }
    }

    private final void b(t0 t0Var, t0 t0Var2) {
        i2 i2VarG = i2.g(t0Var2);
        int i15 = 0;
        for (Object obj : t0Var2.R0()) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            d2 d2Var = (d2) obj;
            if (!d2Var.b() && !xt.d.g(d2Var.getType())) {
                d2 d2Var2 = t0Var.R0().get(i15);
                vr.m1 m1Var = t0Var.T0().getParameters().get(i15);
                if (this.f184092b) {
                    this.f184091a.c(i2VarG, d2Var2.getType(), d2Var.getType(), m1Var);
                }
            }
            i15 = i16;
        }
    }

    private final f0 c(f0 f0Var, t1 t1Var) {
        return f0Var.Z0(h(f0Var, t1Var));
    }

    private final e1 d(e1 e1Var, t1 t1Var) {
        return x0.a(e1Var) ? e1Var : h2.f(e1Var, null, h(e1Var, t1Var), 1, null);
    }

    private final e1 e(e1 e1Var, t0 t0Var) {
        return l2.r(e1Var, t0Var.U0());
    }

    private final e1 f(e1 e1Var, t0 t0Var) {
        return d(e(e1Var, t0Var), t0Var.S0());
    }

    private final e1 g(p1 p1Var, t1 t1Var, boolean z15) {
        return w0.m(t1Var, p1Var.b().o(), p1Var.a(), z15, lt.k.b.f120132b);
    }

    private final t1 h(t0 t0Var, t1 t1Var) {
        return x0.a(t0Var) ? t0Var.S0() : t1Var.l(t0Var.S0());
    }

    private final d2 j(d2 d2Var, p1 p1Var, int i15) {
        o2 o2VarW0 = d2Var.getType().W0();
        if (!g0.a(o2VarW0)) {
            e1 e1VarA = h2.a(o2VarW0);
            if (!x0.a(e1VarA) && xt.d.E(e1VarA)) {
                x1 x1VarT0 = e1VarA.T0();
                vr.h hVarC = x1VarT0.c();
                x1VarT0.getParameters().size();
                e1VarA.R0().size();
                if (!(hVarC instanceof vr.m1)) {
                    if (!(hVarC instanceof vr.l1)) {
                        e1 e1VarM = m(e1VarA, p1Var, i15);
                        b(e1VarA, e1VarM);
                        return new f2(d2Var.c(), e1VarM);
                    }
                    vr.l1 l1Var = (vr.l1) hVarC;
                    if (p1Var.d(l1Var)) {
                        this.f184091a.b(l1Var);
                        return new f2(p2.INVARIANT, ut.l.d(ut.k.f201319v, l1Var.getName().toString()));
                    }
                    List<d2> listR0 = e1VarA.R0();
                    ArrayList arrayList = new ArrayList(pq.v.y(listR0, 10));
                    int i16 = 0;
                    for (Object obj : listR0) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            pq.v.x();
                        }
                        arrayList.add(l((d2) obj, p1Var, x1VarT0.getParameters().get(i16), i15 + 1));
                        i16 = i17;
                    }
                    e1 e1VarK = k(p1.f184096e.a(p1Var, l1Var, arrayList), e1VarA.S0(), e1VarA.U0(), i15 + 1, false);
                    e1 e1VarM2 = m(e1VarA, p1Var, i15);
                    if (!g0.a(e1VarK)) {
                        e1VarK = i1.j(e1VarK, e1VarM2);
                    }
                    return new f2(d2Var.c(), e1VarK);
                }
            }
        }
        return d2Var;
    }

    private final e1 k(p1 p1Var, t1 t1Var, boolean z15, int i15, boolean z16) {
        d2 d2VarL = l(new f2(p2.INVARIANT, p1Var.b().x0()), p1Var, null, i15);
        e1 e1VarA = h2.a(d2VarL.getType());
        if (x0.a(e1VarA)) {
            return e1VarA;
        }
        d2VarL.c();
        a(e1VarA.getAnnotations(), u.a(t1Var));
        e1 e1VarR = l2.r(d(e1VarA, t1Var), z15);
        return z16 ? i1.j(e1VarR, g(p1Var, t1Var, z15)) : e1VarR;
    }

    private final d2 l(d2 d2Var, p1 p1Var, vr.m1 m1Var, int i15) {
        p2 p2VarQ;
        p2 p2Var;
        p2 p2Var2;
        f184089c.b(i15, p1Var.b());
        if (d2Var.b()) {
            return l2.s(m1Var);
        }
        t0 type = d2Var.getType();
        d2 d2VarC = p1Var.c(type.T0());
        if (d2VarC == null) {
            return j(d2Var, p1Var, i15);
        }
        if (d2VarC.b()) {
            return l2.s(m1Var);
        }
        o2 o2VarW0 = d2VarC.getType().W0();
        p2 p2VarC = d2VarC.c();
        p2 p2VarC2 = d2Var.c();
        if (p2VarC2 != p2VarC && p2VarC2 != (p2Var2 = p2.INVARIANT)) {
            if (p2VarC == p2Var2) {
                p2VarC = p2VarC2;
            } else {
                this.f184091a.a(p1Var.b(), m1Var, o2VarW0);
            }
        }
        if (m1Var == null || (p2VarQ = m1Var.q()) == null) {
            p2VarQ = p2.INVARIANT;
        }
        if (p2VarQ != p2VarC && p2VarQ != (p2Var = p2.INVARIANT)) {
            if (p2VarC == p2Var) {
                p2VarC = p2Var;
            } else {
                this.f184091a.a(p1Var.b(), m1Var, o2VarW0);
            }
        }
        a(type.getAnnotations(), o2VarW0.getAnnotations());
        return new f2(p2VarC, o2VarW0 instanceof f0 ? c((f0) o2VarW0, type.S0()) : f(h2.a(o2VarW0), type));
    }

    private final e1 m(e1 e1Var, p1 p1Var, int i15) {
        x1 x1VarT0 = e1Var.T0();
        List<d2> listR0 = e1Var.R0();
        ArrayList arrayList = new ArrayList(pq.v.y(listR0, 10));
        int i16 = 0;
        for (Object obj : listR0) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                pq.v.x();
            }
            d2 d2Var = (d2) obj;
            d2 d2VarL = l(d2Var, p1Var, x1VarT0.getParameters().get(i16), i15 + 1);
            if (!d2VarL.b()) {
                d2VarL = new f2(d2VarL.c(), l2.q(d2VarL.getType(), d2Var.getType().U0()));
            }
            arrayList.add(d2VarL);
            i16 = i17;
        }
        return h2.f(e1Var, arrayList, null, 2, null);
    }

    public final e1 i(p1 p1Var, t1 t1Var) {
        return k(p1Var, t1Var, false, 0, true);
    }
}
