package yr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import st.e1;
import st.i1;
import st.i2;
import st.p2;
import vr.c1;
import vr.h1;
import vr.l1;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends s implements q0 {
    private final rt.n H;
    private final l1 I;
    private final rt.j K;
    private vr.d L;
    static final /* synthetic */ mr.l<Object>[] P = {fr.q0.j(new fr.h0(s0.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0))};
    public static final a O = new a(null);

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final i2 c(l1 l1Var) {
            if (l1Var.y() == null) {
                return null;
            }
            return i2.g(l1Var.K());
        }

        public final q0 b(rt.n nVar, l1 l1Var, vr.d dVar) {
            vr.d dVarC;
            List<c1> listN;
            i2 i2VarC = c(l1Var);
            if (i2VarC == null || (dVarC = dVar.c(i2VarC)) == null) {
                return null;
            }
            s0 s0Var = new s0(nVar, l1Var, dVarC, null, dVar.getAnnotations(), dVar.k(), l1Var.m(), null);
            List<t1> listU0 = s.U0(s0Var, dVar.l(), i2VarC);
            if (listU0 == null) {
                return null;
            }
            e1 e1VarJ = i1.j(st.n0.c(dVarC.f().W0()), l1Var.t());
            c1 c1VarN = dVar.N();
            c1 c1VarI = c1VarN != null ? dt.h.i(s0Var, i2VarC.o(c1VarN.getType(), p2.INVARIANT), wr.h.f214542p0.b()) : null;
            vr.e eVarY = l1Var.y();
            if (eVarY != null) {
                List<c1> listB0 = dVar.B0();
                listN = new ArrayList<>(pq.v.y(listB0, 10));
                int i15 = 0;
                for (Object obj : listB0) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        pq.v.x();
                    }
                    c1 c1Var = (c1) obj;
                    listN.add(dt.h.c(eVarY, i2VarC.o(c1Var.getType(), p2.INVARIANT), ((mt.f) c1Var.getValue()).a(), wr.h.f214542p0.b(), i15));
                    i15 = i16;
                }
            } else {
                listN = pq.v.n();
            }
            s0Var.X0(c1VarI, null, listN, l1Var.v(), listU0, e1VarJ, vr.f0.FINAL, l1Var.h());
            return s0Var;
        }

        private a() {
        }
    }

    public /* synthetic */ s0(rt.n nVar, l1 l1Var, vr.d dVar, q0 q0Var, wr.h hVar, vr.b.a aVar, h1 h1Var, fr.k kVar) {
        this(nVar, l1Var, dVar, q0Var, hVar, aVar, h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s0 x1(s0 s0Var, vr.d dVar) {
        s0 s0Var2 = new s0(s0Var.H, s0Var.v1(), dVar, s0Var, dVar.getAnnotations(), dVar.k(), s0Var.v1().m());
        i2 i2VarC = O.c(s0Var.v1());
        if (i2VarC == null) {
            return null;
        }
        c1 c1VarN = dVar.N();
        c1 c1VarC = c1VarN != null ? c1VarN.c(i2VarC) : null;
        List<c1> listB0 = dVar.B0();
        ArrayList arrayList = new ArrayList(pq.v.y(listB0, 10));
        Iterator<T> it = listB0.iterator();
        while (it.hasNext()) {
            arrayList.add(((c1) it.next()).c(i2VarC));
        }
        s0Var2.X0(null, c1VarC, arrayList, s0Var.v1().v(), s0Var.l(), s0Var.f(), vr.f0.FINAL, s0Var.v1().h());
        return s0Var2;
    }

    @Override // yr.q0
    public vr.d U() {
        return this.L;
    }

    @Override // yr.s, vr.a
    public st.t0 f() {
        return super.f();
    }

    @Override // vr.l
    public boolean h0() {
        return U().h0();
    }

    @Override // vr.l
    public vr.e i0() {
        return U().i0();
    }

    @Override // yr.s, vr.b
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public q0 g0(vr.m mVar, vr.f0 f0Var, vr.u uVar, vr.b.a aVar, boolean z15) {
        return (q0) z().f(mVar).m(f0Var).j(uVar).r(aVar).l(z15).build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yr.s
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public s0 R0(vr.m mVar, vr.z zVar, vr.b.a aVar, zs.f fVar, wr.h hVar, h1 h1Var) {
        vr.b.a aVar2 = vr.b.a.DECLARATION;
        if (aVar != aVar2) {
            vr.b.a aVar3 = vr.b.a.SYNTHESIZED;
        }
        return new s0(this.H, v1(), U(), this, hVar, aVar2, h1Var);
    }

    @Override // yr.n, vr.m
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public l1 b() {
        return v1();
    }

    @Override // yr.s, yr.n, yr.m, vr.m
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public q0 a() {
        return (q0) super.a();
    }

    public l1 v1() {
        return this.I;
    }

    @Override // yr.s, vr.z, vr.j1
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public q0 c(i2 i2Var) {
        s0 s0Var = (s0) super.c(i2Var);
        vr.d dVarC = U().a().c(i2.g(s0Var.f()));
        if (dVarC == null) {
            return null;
        }
        s0Var.L = dVarC;
        return s0Var;
    }

    private s0(rt.n nVar, l1 l1Var, vr.d dVar, q0 q0Var, wr.h hVar, vr.b.a aVar, h1 h1Var) {
        super(l1Var, q0Var, hVar, zs.h.f236664j, aVar, h1Var);
        this.H = nVar;
        this.I = l1Var;
        b1(v1().b0());
        this.K = nVar.c(new r0(this, dVar));
        this.L = dVar;
    }
}
