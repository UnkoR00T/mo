package rd;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    private static <T> List<ud.a<T>> a(sd.c cVar, float f15, fd.f fVar, n0<T> n0Var) {
        return u.a(cVar, fVar, f15, n0Var, false);
    }

    private static <T> List<ud.a<T>> b(sd.c cVar, fd.f fVar, n0<T> n0Var) {
        return u.a(cVar, fVar, 1.0f, n0Var, false);
    }

    static nd.a c(sd.c cVar, fd.f fVar) {
        return new nd.a(b(cVar, fVar, g.f173184a));
    }

    static nd.j d(sd.c cVar, fd.f fVar) {
        return new nd.j(a(cVar, td.m.e(), fVar, i.f173189a));
    }

    public static nd.b e(sd.c cVar, fd.f fVar) {
        return f(cVar, fVar, true);
    }

    public static nd.b f(sd.c cVar, fd.f fVar, boolean z15) {
        return new nd.b(a(cVar, z15 ? td.m.e() : 1.0f, fVar, l.f173206a));
    }

    static nd.c g(sd.c cVar, fd.f fVar, int i15) {
        return new nd.c(b(cVar, fVar, new o(i15)));
    }

    static nd.d h(sd.c cVar, fd.f fVar) {
        return new nd.d(b(cVar, fVar, r.f173219a));
    }

    static nd.f i(sd.c cVar, fd.f fVar) {
        return new nd.f(u.a(cVar, fVar, td.m.e(), b0.f173174a, true));
    }

    static nd.g j(sd.c cVar, fd.f fVar) {
        return new nd.g(b(cVar, fVar, g0.f173185a));
    }

    static nd.h k(sd.c cVar, fd.f fVar) {
        return new nd.h(a(cVar, td.m.e(), fVar, h0.f173187a));
    }
}
