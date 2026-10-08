package dt;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import vr.f0;
import vr.l1;
import vr.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f44470a = new a();

    /* JADX INFO: renamed from: dt.a$a, reason: collision with other inner class name */
    public static final class C1008a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(ht.e.o((vr.e) t15).a(), ht.e.o((vr.e) t16).a());
        }
    }

    private a() {
    }

    private static final void b(vr.e eVar, LinkedHashSet<vr.e> linkedHashSet, lt.k kVar, boolean z15) {
        for (vr.m mVar : lt.n.a.a(kVar, lt.d.f120108t, null, 2, null)) {
            if (mVar instanceof vr.e) {
                vr.e eVarY = (vr.e) mVar;
                if (eVarY.o0()) {
                    vr.h hVarE = kVar.e(eVarY.getName(), ds.d.WHEN_GET_ALL_DESCRIPTORS);
                    eVarY = hVarE instanceof vr.e ? (vr.e) hVarE : hVarE instanceof l1 ? ((l1) hVarE).y() : null;
                }
                if (eVarY != null) {
                    if (i.z(eVarY, eVar)) {
                        linkedHashSet.add(eVarY);
                    }
                    if (z15) {
                        b(eVar, linkedHashSet, eVarY.X(), z15);
                    }
                }
            }
        }
    }

    public Collection<vr.e> a(vr.e eVar, boolean z15) {
        vr.m next;
        vr.m mVarB;
        if (eVar.w() != f0.SEALED) {
            return pq.v.n();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z15) {
            Iterator<vr.m> it = ht.e.u(eVar).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof o0));
            mVarB = next;
        } else {
            mVarB = eVar.b();
        }
        if (mVarB instanceof o0) {
            b(eVar, linkedHashSet, ((o0) mVarB).r(), z15);
        }
        b(eVar, linkedHashSet, eVar.X(), true);
        return pq.v.U0(linkedHashSet, new C1008a());
    }
}
