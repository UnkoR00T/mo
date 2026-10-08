package js;

import st.c2;
import vr.c1;
import vr.g1;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements dt.j {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104726a;

        static {
            int[] iArr = new int[dt.o.i.a.values().length];
            try {
                iArr[dt.o.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f104726a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final st.t0 b(t1 t1Var) {
        return t1Var.getType();
    }

    @Override // dt.j
    public dt.j.a v() {
        return dt.j.a.SUCCESS_ONLY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt.j
    public dt.j.b w(vr.a aVar, vr.a aVar2, vr.e eVar) {
        if (aVar2 instanceof ls.e) {
            ls.e eVar2 = (ls.e) aVar2;
            if (eVar2.getTypeParameters().isEmpty()) {
                dt.o.i iVarW = dt.o.w(aVar, aVar2);
                c2 c2Var = null;
                Object[] objArr = 0;
                if ((iVarW != null ? iVarW.c() : null) != null) {
                    return dt.j.b.UNKNOWN;
                }
                eu.h hVarM = eu.k.M(eu.k.H(pq.v.a0(eVar2.l()), p.f104718a), eVar2.f());
                c1 c1VarR = eVar2.R();
                for (st.t0 t0Var : eu.k.L(hVarM, pq.v.r(c1VarR != null ? c1VarR.getType() : null))) {
                    if (!t0Var.R0().isEmpty() && !(t0Var.W0() instanceof os.k)) {
                        return dt.j.b.UNKNOWN;
                    }
                }
                vr.a aVarC = aVar.c(new os.i(c2Var, 1, objArr == true ? 1 : 0).c());
                if (aVarC == null) {
                    return dt.j.b.UNKNOWN;
                }
                if (aVarC instanceof g1) {
                    g1 g1Var = (g1) aVarC;
                    if (!g1Var.getTypeParameters().isEmpty()) {
                        aVarC = g1Var.z().o(pq.v.n()).build();
                    }
                }
                return a.f104726a[dt.o.f44494f.F(aVarC, aVar2, false).c().ordinal()] == 1 ? dt.j.b.OVERRIDABLE : dt.j.b.UNKNOWN;
            }
        }
        return dt.j.b.UNKNOWN;
    }
}
