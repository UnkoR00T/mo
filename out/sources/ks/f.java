package ks;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oq.y;
import pq.e1;
import pq.v;
import pq.v0;
import sr.p;
import st.t0;
import vr.i0;
import vr.t1;
import wr.q;
import wr.r;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f112317a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, EnumSet<r>> f112318b = v0.l(y.a("PACKAGE", EnumSet.noneOf(r.class)), y.a("TYPE", EnumSet.of(r.CLASS, r.FILE)), y.a("ANNOTATION_TYPE", EnumSet.of(r.ANNOTATION_CLASS)), y.a("TYPE_PARAMETER", EnumSet.of(r.TYPE_PARAMETER)), y.a("FIELD", EnumSet.of(r.FIELD)), y.a("LOCAL_VARIABLE", EnumSet.of(r.LOCAL_VARIABLE)), y.a("PARAMETER", EnumSet.of(r.VALUE_PARAMETER)), y.a("CONSTRUCTOR", EnumSet.of(r.CONSTRUCTOR)), y.a("METHOD", EnumSet.of(r.FUNCTION, r.PROPERTY_GETTER, r.PROPERTY_SETTER)), y.a("TYPE_USE", EnumSet.of(r.TYPE)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, q> f112319c = v0.l(y.a("RUNTIME", q.RUNTIME), y.a("CLASS", q.BINARY), y.a("SOURCE", q.SOURCE));

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 e(i0 i0Var) {
        t0 type;
        t1 t1VarB = a.b(d.f112311a.d(), i0Var.i().p(p.a.H));
        return (t1VarB == null || (type = t1VarB.getType()) == null) ? ut.l.d(ut.k.f201291c1, new String[0]) : type;
    }

    public final ft.g<?> b(qs.b bVar) {
        qs.m mVar = bVar instanceof qs.m ? (qs.m) bVar : null;
        if (mVar != null) {
            Map<String, q> map = f112319c;
            zs.f fVarE = mVar.e();
            q qVar = map.get(fVarE != null ? fVarE.e() : null);
            if (qVar != null) {
                return new ft.k(zs.b.f236634d.c(p.a.K), zs.f.l(qVar.name()));
            }
        }
        return null;
    }

    public final Set<r> c(String str) {
        EnumSet<r> enumSet = f112318b.get(str);
        return enumSet != null ? enumSet : e1.e();
    }

    public final ft.g<?> d(List<? extends qs.b> list) {
        ArrayList<qs.m> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof qs.m) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (qs.m mVar : arrayList) {
            f fVar = f112317a;
            zs.f fVarE = mVar.e();
            v.D(arrayList2, fVar.c(fVarE != null ? fVarE.e() : null));
        }
        ArrayList arrayList3 = new ArrayList(v.y(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new ft.k(zs.b.f236634d.c(p.a.J), zs.f.l(((r) it.next()).name())));
        }
        return new ft.b(arrayList3, e.f112316a);
    }
}
