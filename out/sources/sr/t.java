package sr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import oq.y;
import pq.v;
import pq.v0;
import st.l2;
import st.t0;
import vr.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f183699a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<zs.f> f183700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<zs.f> f183701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap<zs.b, zs.b> f183702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HashMap<zs.b, zs.b> f183703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap<r, zs.f> f183704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set<zs.f> f183705g;

    static {
        s[] sVarArrValues = s.values();
        ArrayList arrayList = new ArrayList(sVarArrValues.length);
        for (s sVar : sVarArrValues) {
            arrayList.add(sVar.j());
        }
        f183700b = v.k1(arrayList);
        r[] rVarArrValues = r.values();
        ArrayList arrayList2 = new ArrayList(rVarArrValues.length);
        for (r rVar : rVarArrValues) {
            arrayList2.add(rVar.e());
        }
        f183701c = v.k1(arrayList2);
        f183702d = new HashMap<>();
        f183703e = new HashMap<>();
        f183704f = v0.k(y.a(r.f183682c, zs.f.l("ubyteArrayOf")), y.a(r.f183683d, zs.f.l("ushortArrayOf")), y.a(r.f183684e, zs.f.l("uintArrayOf")), y.a(r.f183685f, zs.f.l("ulongArrayOf")));
        s[] sVarArrValues2 = s.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (s sVar2 : sVarArrValues2) {
            linkedHashSet.add(sVar2.e().h());
        }
        f183705g = linkedHashSet;
        for (s sVar3 : s.values()) {
            f183702d.put(sVar3.e(), sVar3.g());
            f183703e.put(sVar3.g(), sVar3.e());
        }
    }

    private t() {
    }

    public static final boolean d(t0 t0Var) {
        vr.h hVarC;
        if (l2.w(t0Var) || (hVarC = t0Var.T0().c()) == null) {
            return false;
        }
        return f183699a.c(hVarC);
    }

    public final zs.b a(zs.b bVar) {
        return f183702d.get(bVar);
    }

    public final boolean b(zs.f fVar) {
        return f183705g.contains(fVar);
    }

    public final boolean c(vr.m mVar) {
        vr.m mVarB = mVar.b();
        return (mVarB instanceof o0) && fr.t.c(((o0) mVarB).g(), p.B) && f183700b.contains(mVar.getName());
    }
}
