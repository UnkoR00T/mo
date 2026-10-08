package ft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import st.t0;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f66956a = new i();

    private i() {
    }

    private final b c(List<?> list, i0 i0Var, sr.m mVar) {
        List listF1 = pq.v.f1(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listF1.iterator();
        while (it.hasNext()) {
            g gVarF = f(this, it.next(), null, 2, null);
            if (gVarF != null) {
                arrayList.add(gVarF);
            }
        }
        return i0Var != null ? new a0(arrayList, i0Var.i().P(mVar)) : new b(arrayList, new h(mVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 d(sr.m mVar, i0 i0Var) {
        return i0Var.i().P(mVar);
    }

    public static /* synthetic */ g f(i iVar, Object obj, i0 i0Var, int i15, Object obj2) {
        if ((i15 & 2) != 0) {
            i0Var = null;
        }
        return iVar.e(obj, i0Var);
    }

    public final b b(List<? extends g<?>> list, t0 t0Var) {
        return new a0(list, t0Var);
    }

    public final g<?> e(Object obj, i0 i0Var) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new x(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new u(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new y((String) obj);
        }
        if (obj instanceof byte[]) {
            return c(pq.n.h1((byte[]) obj), i0Var, sr.m.BYTE);
        }
        if (obj instanceof short[]) {
            return c(pq.n.o1((short[]) obj), i0Var, sr.m.SHORT);
        }
        if (obj instanceof int[]) {
            return c(pq.n.l1((int[]) obj), i0Var, sr.m.INT);
        }
        if (obj instanceof long[]) {
            return c(pq.n.m1((long[]) obj), i0Var, sr.m.LONG);
        }
        if (obj instanceof char[]) {
            return c(pq.n.i1((char[]) obj), i0Var, sr.m.CHAR);
        }
        if (obj instanceof float[]) {
            return c(pq.n.k1((float[]) obj), i0Var, sr.m.FLOAT);
        }
        if (obj instanceof double[]) {
            return c(pq.n.j1((double[]) obj), i0Var, sr.m.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return c(pq.n.p1((boolean[]) obj), i0Var, sr.m.BOOLEAN);
        }
        if (obj == null) {
            return new v();
        }
        return null;
    }
}
