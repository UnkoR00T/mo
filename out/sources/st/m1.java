package st;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 {

    public static final class a extends y1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<x1> f184083d;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends x1> list) {
            this.f184083d = list;
        }

        @Override // st.y1
        public d2 k(x1 x1Var) {
            if (this.f184083d.contains(x1Var)) {
                return l2.s((vr.m1) x1Var.c());
            }
            return null;
        }
    }

    private static final t0 a(List<? extends x1> list, List<? extends t0> list2, sr.j jVar) {
        t0 t0VarQ = i2.h(new a(list)).q((t0) pq.v.l0(list2), p2.OUT_VARIANCE);
        return t0VarQ == null ? jVar.z() : t0VarQ;
    }

    public static final t0 b(vr.m1 m1Var) {
        vr.m mVarB = m1Var.b();
        if (mVarB instanceof vr.i) {
            List<vr.m1> parameters = ((vr.i) mVarB).o().getParameters();
            ArrayList arrayList = new ArrayList(pq.v.y(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((vr.m1) it.next()).o());
            }
            return a(arrayList, m1Var.getUpperBounds(), ht.e.m(m1Var));
        }
        if (!(mVarB instanceof vr.z)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List<vr.m1> typeParameters = ((vr.z) mVarB).getTypeParameters();
        ArrayList arrayList2 = new ArrayList(pq.v.y(typeParameters, 10));
        Iterator<T> it4 = typeParameters.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((vr.m1) it4.next()).o());
        }
        return a(arrayList2, m1Var.getUpperBounds(), ht.e.m(m1Var));
    }
}
