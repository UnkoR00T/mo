package js;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 {
    public static final List<zs.f> a(zs.f fVar) {
        String strE = fVar.e();
        if (i0.c(strE)) {
            return pq.v.r(b(fVar));
        }
        return i0.d(strE) ? f(fVar) : j.f104654a.b(fVar);
    }

    public static final zs.f b(zs.f fVar) {
        zs.f fVarE = e(fVar, "get", false, null, 12, null);
        return fVarE == null ? e(fVar, "is", false, null, 8, null) : fVarE;
    }

    public static final zs.f c(zs.f fVar, boolean z15) {
        return e(fVar, "set", false, z15 ? "is" : null, 4, null);
    }

    private static final zs.f d(zs.f fVar, String str, boolean z15, String str2) {
        if (fVar.n()) {
            return null;
        }
        String strJ = fVar.j();
        if (!fu.r.V(strJ, str, false, 2, null) || strJ.length() == str.length()) {
            return null;
        }
        char cCharAt = strJ.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return zs.f.l(str2 + fu.r.M0(strJ, str));
        }
        if (!z15) {
            return fVar;
        }
        String strC = au.a.c(fu.r.M0(strJ, str), true);
        if (zs.f.o(strC)) {
            return zs.f.l(strC);
        }
        return null;
    }

    static /* synthetic */ zs.f e(zs.f fVar, String str, boolean z15, String str2, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        if ((i15 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z15, str2);
    }

    public static final List<zs.f> f(zs.f fVar) {
        return pq.v.s(c(fVar, false), c(fVar, true));
    }
}
