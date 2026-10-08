package ss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ot.o0;
import ss.e.a;
import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e<A, S extends a<? extends A>> implements ot.h<A> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f183838b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f183839a;

    public static abstract class a<A> {
        public abstract Map<a0, List<A>> a();
    }

    public static final class b {
        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        public final x a(o0 o0Var, boolean z15, boolean z16, Boolean bool, boolean z17, v vVar, ws.c cVar) {
            o0.a aVarH;
            if (z15) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + o0Var + ')').toString());
                }
                if (o0Var instanceof o0.a) {
                    o0.a aVar = (o0.a) o0Var;
                    if (aVar.g() == us.c.EnumC5226c.INTERFACE) {
                        return w.b(vVar, aVar.e().d(zs.f.l("DefaultImpls")), cVar);
                    }
                }
                if (bool.booleanValue() && (o0Var instanceof o0.b)) {
                    h1 h1VarC = o0Var.c();
                    r rVar = h1VarC instanceof r ? (r) h1VarC : null;
                    jt.d dVarF = rVar != null ? rVar.f() : null;
                    if (dVarF != null) {
                        return w.b(vVar, zs.b.f236634d.c(new zs.c(fu.r.O(dVarF.f(), '/', '.', false, 4, null))), cVar);
                    }
                }
            }
            if (z16 && (o0Var instanceof o0.a)) {
                o0.a aVar2 = (o0.a) o0Var;
                if (aVar2.g() == us.c.EnumC5226c.COMPANION_OBJECT && (aVarH = aVar2.h()) != null && (aVarH.g() == us.c.EnumC5226c.CLASS || aVarH.g() == us.c.EnumC5226c.ENUM_CLASS || (z17 && (aVarH.g() == us.c.EnumC5226c.INTERFACE || aVarH.g() == us.c.EnumC5226c.ANNOTATION_CLASS)))) {
                    h1 h1VarC2 = aVarH.c();
                    z zVar = h1VarC2 instanceof z ? (z) h1VarC2 : null;
                    if (zVar != null) {
                        return zVar.d();
                    }
                    return null;
                }
            }
            if (!(o0Var instanceof o0.b) || !(o0Var.c() instanceof r)) {
                return null;
            }
            r rVar2 = (r) o0Var.c();
            x xVarG = rVar2.g();
            return xVarG == null ? w.b(vVar, rVar2.d(), cVar) : xVarG;
        }

        private b() {
        }
    }

    private enum c {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f183844e = wq.b.a(b());
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f183845a;

        static {
            int[] iArr = new int[ot.d.values().length];
            try {
                iArr[ot.d.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ot.d.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ot.d.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f183845a = iArr;
        }
    }

    /* JADX INFO: renamed from: ss.e$e, reason: collision with other inner class name */
    public static final class C4736e implements x.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e<A, S> f183846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<A> f183847b;

        C4736e(e<A, S> eVar, ArrayList<A> arrayList) {
            this.f183846a = eVar;
            this.f183847b = arrayList;
        }

        @Override // ss.x.c
        public void a() {
        }

        @Override // ss.x.c
        public x.a b(zs.b bVar, h1 h1Var) {
            return this.f183846a.A(bVar, h1Var, this.f183847b);
        }
    }

    public e(v vVar) {
        this.f183839a = vVar;
    }

    private final List<A> B(o0 o0Var, bt.q qVar, ot.d dVar, int i15) {
        a0 a0VarU = u(this, qVar, o0Var.b(), o0Var.d(), dVar, false, 16, null);
        return a0VarU == null ? pq.v.n() : p(this, o0Var, a0.f183823b.e(a0VarU, i15), false, false, null, false, 60, null);
    }

    private final List<A> C(o0 o0Var, us.o oVar, c cVar) {
        Boolean boolD = ws.b.D.d(oVar.O0());
        boolD.booleanValue();
        boolean zF = ys.h.f(oVar);
        if (cVar == c.PROPERTY) {
            a0 a0VarB = f.b(oVar, o0Var.b(), o0Var.d(), false, true, false, 40, null);
            return a0VarB == null ? pq.v.n() : p(this, o0Var, a0VarB, true, false, boolD, zF, 8, null);
        }
        a0 a0VarB2 = f.b(oVar, o0Var.b(), o0Var.d(), true, false, false, 48, null);
        if (a0VarB2 == null) {
            return pq.v.n();
        }
        return fu.r.d0(a0VarB2.a(), "$delegate", false, 2, null) != (cVar == c.DELEGATE_FIELD) ? pq.v.n() : o(o0Var, a0VarB2, true, true, boolD, zF);
    }

    private final x D(o0.a aVar) {
        h1 h1VarC = aVar.c();
        z zVar = h1VarC instanceof z ? (z) h1VarC : null;
        if (zVar != null) {
            return zVar.d();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    private final int n(o0 o0Var, bt.q qVar) {
        int iV = v(qVar);
        int i15 = 0;
        if (qVar instanceof us.j) {
            if (ws.g.g((us.j) qVar)) {
                i15 = 1;
            }
        } else if (qVar instanceof us.o) {
            if (ws.g.h((us.o) qVar)) {
                i15 = 1;
            }
        } else {
            if (!(qVar instanceof us.e)) {
                throw new UnsupportedOperationException("Unsupported message: " + qVar.getClass());
            }
            o0.a aVar = (o0.a) o0Var;
            if (aVar.g() == us.c.EnumC5226c.ENUM_CLASS) {
                i15 = 2;
            } else if (aVar.i()) {
                i15 = 1;
            }
        }
        return iV + i15;
    }

    private final List<A> o(o0 o0Var, a0 a0Var, boolean z15, boolean z16, Boolean bool, boolean z17) {
        List<A> list;
        x xVarQ = q(o0Var, f183838b.a(o0Var, z15, z16, bool, z17, this.f183839a, x()));
        return (xVarQ == null || (list = r(xVarQ).a().get(a0Var)) == null) ? pq.v.n() : list;
    }

    static /* synthetic */ List p(e eVar, o0 o0Var, a0 a0Var, boolean z15, boolean z16, Boolean bool, boolean z17, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
        }
        if ((i15 & 4) != 0) {
            z15 = false;
        }
        if ((i15 & 8) != 0) {
            z16 = false;
        }
        if ((i15 & 16) != 0) {
            bool = null;
        }
        if ((i15 & 32) != 0) {
            z17 = false;
        }
        return eVar.o(o0Var, a0Var, z15, z16, bool, z17);
    }

    public static /* synthetic */ a0 u(e eVar, bt.q qVar, ws.d dVar, ws.h hVar, ot.d dVar2, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i15 & 16) != 0) {
            z15 = false;
        }
        return eVar.t(qVar, dVar, hVar, dVar2, z15);
    }

    private final int v(bt.q qVar) {
        if (qVar instanceof us.j) {
            return ((us.j) qVar).q0();
        }
        if (qVar instanceof us.o) {
            return ((us.o) qVar).A0();
        }
        return 0;
    }

    protected final x.a A(zs.b bVar, h1 h1Var, List<A> list) {
        if (rr.a.f175535a.b().contains(bVar)) {
            return null;
        }
        return z(bVar, h1Var, list);
    }

    @Override // ot.h
    public List<A> a(o0 o0Var, us.o oVar) {
        return C(o0Var, oVar, c.BACKING_FIELD);
    }

    @Override // ot.h
    public abstract A b(us.b bVar, ws.d dVar);

    @Override // ot.h
    public List<A> c(us.r rVar, ws.d dVar) {
        Iterable iterable = (Iterable) rVar.w(xs.a.f220668f);
        ArrayList arrayList = new ArrayList(pq.v.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(b((us.b) it.next(), dVar));
        }
        return arrayList;
    }

    @Override // ot.h
    public List<A> e(o0 o0Var, us.h hVar) {
        return p(this, o0Var, a0.f183823b.a(o0Var.b().getString(hVar.O()), ys.b.b(((o0.a) o0Var).e().b())), false, false, null, false, 60, null);
    }

    @Override // ot.h
    public List<A> f(us.t tVar, ws.d dVar) {
        Iterable iterable = (Iterable) tVar.w(xs.a.f220670h);
        ArrayList arrayList = new ArrayList(pq.v.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(b((us.b) it.next(), dVar));
        }
        return arrayList;
    }

    @Override // ot.h
    public List<A> g(o0 o0Var, bt.q qVar, ot.d dVar, int i15, us.v vVar) {
        return B(o0Var, qVar, dVar, i15);
    }

    @Override // ot.h
    public List<A> h(o0.a aVar) {
        x xVarD = D(aVar);
        if (xVarD != null) {
            ArrayList arrayList = new ArrayList(1);
            xVarD.c(new C4736e(this, arrayList), s(xVarD));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.a()).toString());
    }

    @Override // ot.h
    public List<A> i(o0 o0Var, bt.q qVar, ot.d dVar, int i15, us.v vVar) {
        return B(o0Var, qVar, dVar, i15 + n(o0Var, qVar));
    }

    @Override // ot.h
    public List<A> j(o0 o0Var, bt.q qVar, ot.d dVar) {
        return B(o0Var, qVar, dVar, v(qVar));
    }

    @Override // ot.h
    public List<A> l(o0 o0Var, bt.q qVar, ot.d dVar) {
        if (dVar == ot.d.PROPERTY) {
            return C(o0Var, (us.o) qVar, c.PROPERTY);
        }
        a0 a0VarU = u(this, qVar, o0Var.b(), o0Var.d(), dVar, false, 16, null);
        return a0VarU == null ? pq.v.n() : p(this, o0Var, a0VarU, false, false, null, false, 60, null);
    }

    @Override // ot.h
    public List<A> m(o0 o0Var, us.o oVar) {
        return C(o0Var, oVar, c.DELEGATE_FIELD);
    }

    protected final x q(o0 o0Var, x xVar) {
        if (xVar != null) {
            return xVar;
        }
        if (o0Var instanceof o0.a) {
            return D((o0.a) o0Var);
        }
        return null;
    }

    protected abstract S r(x xVar);

    protected byte[] s(x xVar) {
        return null;
    }

    protected final a0 t(bt.q qVar, ws.d dVar, ws.h hVar, ot.d dVar2, boolean z15) {
        xs.a.d dVar3;
        if (qVar instanceof us.e) {
            a0.a aVar = a0.f183823b;
            ys.d.b bVarB = ys.h.f229107a.b((us.e) qVar, dVar, hVar);
            if (bVarB == null) {
                return null;
            }
            return aVar.b(bVarB);
        }
        if (qVar instanceof us.j) {
            a0.a aVar2 = a0.f183823b;
            ys.d.b bVarE = ys.h.f229107a.e((us.j) qVar, dVar, hVar);
            if (bVarE == null) {
                return null;
            }
            return aVar2.b(bVarE);
        }
        if (!(qVar instanceof us.o) || (dVar3 = (xs.a.d) ws.f.a((bt.i.d) qVar, xs.a.f220666d)) == null) {
            return null;
        }
        int i15 = d.f183845a[dVar2.ordinal()];
        if (i15 == 1) {
            if (dVar3.K()) {
                return a0.f183823b.c(dVar, dVar3.F());
            }
            return null;
        }
        if (i15 != 2) {
            if (i15 != 3) {
                return null;
            }
            return f.a((us.o) qVar, dVar, hVar, true, true, z15);
        }
        if (dVar3.L()) {
            return a0.f183823b.c(dVar, dVar3.G());
        }
        return null;
    }

    protected final v w() {
        return this.f183839a;
    }

    public abstract ws.c x();

    protected final boolean y(zs.b bVar) {
        x xVarB;
        return bVar.e() != null && fr.t.c(bVar.h().e(), "Container") && (xVarB = w.b(this.f183839a, bVar, x())) != null && rr.a.f175535a.c(xVarB);
    }

    protected abstract x.a z(zs.b bVar, h1 h1Var, List<A> list);
}
