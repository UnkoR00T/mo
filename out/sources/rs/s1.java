package rs;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wr.h f175717a = new g(js.j0.f104681v);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f175718b = new g(js.j0.f104682w);

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175719a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f175719a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wr.h e(List<? extends wr.h> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new wr.o((List<? extends wr.h>) pq.v.f1(list)) : (wr.h) pq.v.P0(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.h f(vr.h hVar, i iVar, p1 p1Var) {
        ur.d dVar = ur.d.f200051a;
        if (!q1.a(p1Var) || !(hVar instanceof vr.e)) {
            return null;
        }
        if (iVar.e() == j.READ_ONLY && p1Var == p1.FLEXIBLE_LOWER) {
            vr.e eVar = (vr.e) hVar;
            if (dVar.c(eVar)) {
                return dVar.a(eVar);
            }
        }
        if (iVar.e() == j.MUTABLE && p1Var == p1.FLEXIBLE_UPPER) {
            vr.e eVar2 = (vr.e) hVar;
            if (dVar.d(eVar2)) {
                return dVar.b(eVar2);
            }
        }
        return null;
    }

    public static final wr.h g() {
        return f175717a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean h(i iVar, p1 p1Var) {
        if (!q1.a(p1Var)) {
            return null;
        }
        l lVarF = iVar.f();
        int i15 = lVarF == null ? -1 : a.f175719a[lVarF.ordinal()];
        if (i15 == 1) {
            return Boolean.TRUE;
        }
        if (i15 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(st.t0 t0Var) {
        return t1.c(tt.u.f192145a, t0Var);
    }
}
