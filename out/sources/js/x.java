package js;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<c> f104774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<c> f104775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<zs.c, w> f104776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<zs.c, w> f104777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<zs.c, w> f104778e;

    static {
        c cVar = c.FIELD;
        c cVar2 = c.METHOD_RETURN_TYPE;
        c cVar3 = c.VALUE_PARAMETER;
        List<c> listQ = pq.v.q(cVar, cVar2, cVar3, c.TYPE_PARAMETER_BOUNDS, c.TYPE_USE);
        f104774a = listQ;
        List<c> listE = pq.v.e(cVar3);
        f104775b = listE;
        zs.c cVarK = k0.k();
        rs.l lVar = rs.l.NOT_NULL;
        Map<zs.c, w> mapL = pq.v0.l(oq.y.a(cVarK, new w(new rs.m(lVar, false, 2, null), listQ, false, true)), oq.y.a(k0.i(), new w(new rs.m(lVar, false, 2, null), listQ, false, true)), oq.y.a(k0.j(), new w(new rs.m(rs.l.FORCE_FLEXIBILITY, false, 2, null), listQ, false, true, 4, null)));
        f104776c = mapL;
        Map<zs.c, w> mapL2 = pq.v0.l(oq.y.a(k0.d(), new w(new rs.m(lVar, false, 2, null), listE, false, false, 12, null)), oq.y.a(k0.e(), new w(new rs.m(rs.l.NULLABLE, false, 2, null), listE, false, false, 12, null)));
        f104777d = mapL2;
        f104778e = pq.v0.o(mapL, mapL2);
    }

    public static final Map<zs.c, w> a() {
        return f104778e;
    }

    public static final Map<zs.c, w> b() {
        return f104776c;
    }
}
