package as;

import java.io.InputStream;
import sr.p;
import ss.v;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f14283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pt.d f14284b = new pt.d();

    public g(ClassLoader classLoader) {
        this.f14283a = classLoader;
    }

    private final v.a d(String str) {
        f fVarA;
        Class<?> clsA = e.a(this.f14283a, str);
        if (clsA == null || (fVarA = f.f14280c.a(clsA)) == null) {
            return null;
        }
        return new v.a.b(fVarA, null, 2, null);
    }

    @Override // ot.a0
    public InputStream a(zs.c cVar) {
        if (cVar.h(p.A)) {
            return this.f14284b.a(pt.a.f162502r.r(cVar));
        }
        return null;
    }

    @Override // ss.v
    public v.a b(zs.b bVar, ws.c cVar) {
        return d(h.b(bVar));
    }

    @Override // ss.v
    public v.a c(qs.g gVar, ws.c cVar) {
        String strA;
        zs.c cVarG = gVar.g();
        if (cVarG == null || (strA = cVarG.a()) == null) {
            return null;
        }
        return d(strA);
    }
}
