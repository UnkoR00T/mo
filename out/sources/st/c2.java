package st;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f184005f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f184006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z1 f184007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rt.f f184008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final oq.k f184009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rt.g<b, t0> f184010e;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final t0 a(t0 t0Var, i2 i2Var, Set<? extends vr.m1> set, boolean z15) {
            o2 o2VarF;
            t0 type;
            t0 type2;
            t0 type3;
            o2 o2VarW0 = t0Var.W0();
            if (o2VarW0 instanceof k0) {
                k0 k0Var = (k0) o2VarW0;
                e1 e1VarB1 = k0Var.b1();
                if (!e1VarB1.T0().getParameters().isEmpty() && e1VarB1.T0().c() != null) {
                    List<vr.m1> parameters = e1VarB1.T0().getParameters();
                    ArrayList arrayList = new ArrayList(pq.v.y(parameters, 10));
                    for (vr.m1 m1Var : parameters) {
                        d2 l1Var = (d2) pq.v.o0(t0Var.R0(), m1Var.getIndex());
                        if (!z15 || l1Var == null || (type3 = l1Var.getType()) == null || xt.d.i(type3)) {
                            boolean z16 = set != null && set.contains(m1Var);
                            if (l1Var == null || z16 || i2Var.k().e(l1Var.getType()) == null) {
                                l1Var = new l1(m1Var);
                            }
                        }
                        arrayList.add(l1Var);
                    }
                    e1VarB1 = h2.f(e1VarB1, arrayList, null, 2, null);
                }
                e1 e1VarC1 = k0Var.c1();
                if (!e1VarC1.T0().getParameters().isEmpty() && e1VarC1.T0().c() != null) {
                    List<vr.m1> parameters2 = e1VarC1.T0().getParameters();
                    ArrayList arrayList2 = new ArrayList(pq.v.y(parameters2, 10));
                    for (vr.m1 m1Var2 : parameters2) {
                        d2 l1Var2 = (d2) pq.v.o0(t0Var.R0(), m1Var2.getIndex());
                        if (!z15 || l1Var2 == null || (type2 = l1Var2.getType()) == null || xt.d.i(type2)) {
                            boolean z17 = set != null && set.contains(m1Var2);
                            if (l1Var2 == null || z17 || i2Var.k().e(l1Var2.getType()) == null) {
                                l1Var2 = new l1(m1Var2);
                            }
                        }
                        arrayList2.add(l1Var2);
                    }
                    e1VarC1 = h2.f(e1VarC1, arrayList2, null, 2, null);
                }
                o2VarF = w0.e(e1VarB1, e1VarC1);
            } else {
                if (!(o2VarW0 instanceof e1)) {
                    throw new oq.p();
                }
                e1 e1Var = (e1) o2VarW0;
                if (e1Var.T0().getParameters().isEmpty() || e1Var.T0().c() == null) {
                    o2VarF = e1Var;
                } else {
                    List<vr.m1> parameters3 = e1Var.T0().getParameters();
                    ArrayList arrayList3 = new ArrayList(pq.v.y(parameters3, 10));
                    for (vr.m1 m1Var3 : parameters3) {
                        d2 l1Var3 = (d2) pq.v.o0(t0Var.R0(), m1Var3.getIndex());
                        if (!z15 || l1Var3 == null || (type = l1Var3.getType()) == null || xt.d.i(type)) {
                            boolean z18 = set != null && set.contains(m1Var3);
                            if (l1Var3 == null || z18 || i2Var.k().e(l1Var3.getType()) == null) {
                                l1Var3 = new l1(m1Var3);
                            }
                        }
                        arrayList3.add(l1Var3);
                    }
                    o2VarF = h2.f(e1Var, arrayList3, null, 2, null);
                }
            }
            return i2Var.o(n2.b(o2VarF, o2VarW0), p2.OUT_VARIANCE);
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final vr.m1 f184011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i0 f184012b;

        public b(vr.m1 m1Var, i0 i0Var) {
            this.f184011a = m1Var;
            this.f184012b = i0Var;
        }

        public final i0 a() {
            return this.f184012b;
        }

        public final vr.m1 b() {
            return this.f184011a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return fr.t.c(bVar.f184011a, this.f184011a) && fr.t.c(bVar.f184012b, this.f184012b);
        }

        public int hashCode() {
            int iHashCode = this.f184011a.hashCode();
            return iHashCode + (iHashCode * 31) + this.f184012b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f184011a + ", typeAttr=" + this.f184012b + ')';
        }
    }

    public c2(h0 h0Var, z1 z1Var) {
        this.f184006a = h0Var;
        this.f184007b = z1Var;
        rt.f fVar = new rt.f("Type parameter upper bound erasure results");
        this.f184008c = fVar;
        this.f184009d = oq.l.a(new a2(this));
        this.f184010e = fVar.i(new b2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.i c(c2 c2Var) {
        return ut.l.d(ut.k.V0, c2Var.toString());
    }

    private final t0 d(i0 i0Var) {
        t0 t0VarD;
        e1 e1VarA = i0Var.a();
        return (e1VarA == null || (t0VarD = xt.d.D(e1VarA)) == null) ? h() : t0VarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 f(c2 c2Var, b bVar) {
        return c2Var.g(bVar.b(), bVar.a());
    }

    private final t0 g(vr.m1 m1Var, i0 i0Var) {
        Set<vr.m1> setC = i0Var.c();
        if (setC != null && setC.contains(m1Var.a())) {
            return d(i0Var);
        }
        Set<vr.m1> setL = xt.d.l(m1Var.t(), setC);
        LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(setL, 10)), 16));
        for (vr.m1 m1Var2 : setL) {
            oq.r rVarA = oq.y.a(m1Var2.o(), (setC == null || !setC.contains(m1Var2)) ? this.f184006a.a(m1Var2, i0Var, this, e(m1Var2, i0Var.d(m1Var))) : l2.t(m1Var2, i0Var));
            linkedHashMap.put(rVarA.c(), rVarA.d());
        }
        Set<t0> setI = i(i2.h(y1.a.e(y1.f184171c, linkedHashMap, false, 2, null)), m1Var.getUpperBounds(), i0Var);
        if (setI.isEmpty()) {
            return d(i0Var);
        }
        if (!this.f184007b.a()) {
            if (setI.size() == 1) {
                return (t0) pq.v.O0(setI);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
        List listF1 = pq.v.f1(setI);
        ArrayList arrayList = new ArrayList(pq.v.y(listF1, 10));
        Iterator it = listF1.iterator();
        while (it.hasNext()) {
            arrayList.add(((t0) it.next()).W0());
        }
        return tt.d.a(arrayList);
    }

    private final ut.i h() {
        return (ut.i) this.f184009d.getValue();
    }

    private final Set<t0> i(i2 i2Var, List<? extends t0> list, i0 i0Var) {
        Set setB = pq.e1.b();
        for (t0 t0Var : list) {
            vr.h hVarC = t0Var.T0().c();
            if (hVarC instanceof vr.e) {
                setB.add(f184005f.a(t0Var, i2Var, i0Var.c(), this.f184007b.b()));
            } else if (hVarC instanceof vr.m1) {
                Set<vr.m1> setC = i0Var.c();
                if (setC == null || !setC.contains(hVarC)) {
                    setB.addAll(i(i2Var, ((vr.m1) hVarC).getUpperBounds(), i0Var));
                } else {
                    setB.add(d(i0Var));
                }
            }
            if (!this.f184007b.a()) {
                break;
            }
        }
        return pq.e1.a(setB);
    }

    public final t0 e(vr.m1 m1Var, i0 i0Var) {
        return this.f184010e.b(new b(m1Var, i0Var));
    }

    public /* synthetic */ c2(h0 h0Var, z1 z1Var, int i15, fr.k kVar) {
        this(h0Var, (i15 & 2) != 0 ? new z1(false, false) : z1Var);
    }
}
