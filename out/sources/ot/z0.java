package ot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vr.r1;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 {
    public static final <T extends wt.j> r1<T> a(us.c cVar, boolean z15, ws.d dVar, ws.h hVar, er.l<? super us.r, ? extends T> lVar, er.l<? super zs.f, ? extends T> lVar2) {
        T tB;
        if (cVar.q1()) {
            zs.f fVarB = m0.b(dVar, cVar.S0());
            us.r rVarI = ws.g.i(cVar, hVar);
            if ((rVarI != null && (tB = lVar.b(rVarI)) != null) || (tB = lVar2.b(fVarB)) != null) {
                return new vr.a0(fVarB, tB);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + m0.b(dVar, cVar.O0()) + " with property " + fVarB).toString());
        }
        if (!z15 || !ws.b.f214729k.d(cVar.N0()).booleanValue()) {
            return null;
        }
        Iterator<T> it = cVar.D0().iterator();
        boolean z16 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z16) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (!ws.b.f214732n.d(((us.e) next).Y()).booleanValue()) {
                if (!z16) {
                    z16 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        us.e eVar = (us.e) obj;
        if (eVar == null) {
            return null;
        }
        List<us.v> listC0 = eVar.c0();
        ArrayList arrayList = new ArrayList(pq.v.y(listC0, 10));
        for (us.v vVar : listC0) {
            arrayList.add(oq.y.a(m0.b(dVar, vVar.Y()), lVar.b(ws.g.r(vVar, hVar))));
        }
        return new vr.j0(arrayList);
    }
}
