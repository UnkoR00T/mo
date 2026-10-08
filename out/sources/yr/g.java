package yr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import st.e1;
import st.l2;
import st.o2;
import st.x1;
import vr.h1;
import vr.l1;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends n implements l1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f228766k = {fr.q0.j(new fr.h0(g.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rt.n f228767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vr.u f228768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final rt.i f228769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<? extends m1> f228770h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f228771j;

    public static final class a implements x1 {
        a() {
        }

        @Override // st.x1
        public x1 a(tt.g gVar) {
            return this;
        }

        @Override // st.x1
        public boolean d() {
            return true;
        }

        @Override // st.x1
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public l1 c() {
            return g.this;
        }

        @Override // st.x1
        public List<m1> getParameters() {
            return g.this.X0();
        }

        @Override // st.x1
        public sr.j i() {
            return ht.e.m(c());
        }

        @Override // st.x1
        public Collection<st.t0> q() {
            return c().x0().T0().q();
        }

        public String toString() {
            return "[typealias " + c().getName().e() + ']';
        }
    }

    public g(rt.n nVar, vr.m mVar, wr.h hVar, zs.f fVar, h1 h1Var, vr.u uVar) {
        super(mVar, hVar, fVar, h1Var);
        this.f228767e = nVar;
        this.f228768f = uVar;
        this.f228769g = nVar.d(new d(this));
        this.f228771j = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e1 T0(g gVar, tt.g gVar2) {
        vr.h hVarF = gVar2.f(gVar);
        if (hVarF != null) {
            return hVarF.t();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection U0(g gVar) {
        return gVar.W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public static final Boolean Z0(g gVar, o2 o2Var) {
        boolean z15;
        if (st.x0.a(o2Var)) {
            z15 = false;
        } else {
            vr.h hVarC = o2Var.T0().c();
            if (!(hVarC instanceof m1) || fr.t.c(((m1) hVarC).b(), gVar)) {
                z15 = false;
            } else {
                z15 = true;
            }
        }
        return Boolean.valueOf(z15);
    }

    @Override // vr.i
    public boolean E() {
        return l2.c(x0(), new e(this));
    }

    protected final rt.n P() {
        return this.f228767e;
    }

    protected final e1 S0() {
        lt.k kVarA0;
        vr.e eVarY = y();
        if (eVarY == null || (kVarA0 = eVarY.a0()) == null) {
            kVarA0 = lt.k.b.f120132b;
        }
        return l2.v(this, kVarA0, new f(this));
    }

    @Override // yr.n, yr.m, vr.m
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public l1 a() {
        return (l1) super.a();
    }

    public final Collection<q0> W0() {
        vr.e eVarY = y();
        if (eVarY == null) {
            return pq.v.n();
        }
        Collection<vr.d> collectionP = eVarY.p();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionP.iterator();
        while (it.hasNext()) {
            q0 q0VarB = s0.O.b(this.f228767e, this, (vr.d) it.next());
            if (q0VarB != null) {
                arrayList.add(q0VarB);
            }
        }
        return arrayList;
    }

    protected abstract List<m1> X0();

    public final void Y0(List<? extends m1> list) {
        this.f228770h = list;
    }

    @Override // vr.e0
    public boolean b0() {
        return false;
    }

    @Override // vr.e0
    public boolean d0() {
        return false;
    }

    @Override // vr.e0, vr.q
    public vr.u h() {
        return this.f228768f;
    }

    @Override // vr.h
    public x1 o() {
        return this.f228771j;
    }

    @Override // vr.e0
    public boolean o0() {
        return false;
    }

    @Override // yr.m
    public String toString() {
        return "typealias " + getName().e();
    }

    @Override // vr.i
    public List<m1> v() {
        List list = this.f228770h;
        if (list == null) {
            return null;
        }
        return list;
    }

    @Override // vr.m
    public <R, D> R z0(vr.o<R, D> oVar, D d15) {
        return oVar.j(this, d15);
    }
}
