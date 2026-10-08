package pt;

import er.l;
import fr.q;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import ot.b0;
import ot.f;
import ot.m;
import ot.o;
import ot.w;
import ot.x;
import pq.v;
import rt.n;
import sr.p;
import vr.i0;
import vr.n0;
import vr.p0;
import vr.s0;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements sr.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f162503b = new d();

    static final /* synthetic */ class a extends q implements l<String, InputStream> {
        a(Object obj) {
            super(1, obj, d.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final InputStream b(String str) {
            return ((d) this.f66391b).a(str);
        }
    }

    @Override // sr.b
    public p0 a(n nVar, i0 i0Var, Iterable<? extends xr.b> iterable, xr.c cVar, xr.a aVar, boolean z15) {
        return b(nVar, i0Var, p.K, iterable, cVar, aVar, z15, new a(this.f162503b));
    }

    public final p0 b(n nVar, i0 i0Var, Set<zs.c> set, Iterable<? extends xr.b> iterable, xr.c cVar, xr.a aVar, boolean z15, l<? super String, ? extends InputStream> lVar) {
        ArrayList arrayList = new ArrayList();
        for (zs.c cVar2 : set) {
            InputStream inputStreamB = lVar.b(pt.a.f162502r.r(cVar2));
            c cVarA = inputStreamB != null ? c.f162504q.a(cVar2, nVar, i0Var, inputStreamB, z15) : null;
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        s0 s0Var = new s0(arrayList);
        n0 n0Var = new n0(nVar, i0Var);
        o.a aVar2 = o.a.f149818a;
        ot.q qVar = new ot.q(s0Var);
        pt.a aVar3 = pt.a.f162502r;
        ot.n nVar2 = new ot.n(nVar, i0Var, aVar2, qVar, new f(i0Var, n0Var, aVar3), s0Var, b0.a.f149729a, w.f149868a, ds.c.a.f44264a, x.a.f149870a, iterable, n0Var, m.f149790a.a(), aVar, cVar, aVar3.e(), null, new kt.b(nVar, v.n()), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).R0(nVar2);
        }
        return s0Var;
    }
}
