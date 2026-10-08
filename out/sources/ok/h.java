package ok;

import fk.v;
import fk.w;
import fk.x;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class h implements w<g, g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f146414a = new h();

    private static class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v<g> f146415a;

        private b(v<g> vVar) {
            this.f146415a = vVar;
        }
    }

    private h() {
    }

    static void d() {
        x.n(f146414a);
    }

    @Override // fk.w
    public Class<g> b() {
        return g.class;
    }

    @Override // fk.w
    public Class<g> c() {
        return g.class;
    }

    @Override // fk.w
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g a(v<g> vVar) throws GeneralSecurityException {
        if (vVar == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (vVar.e() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator<List<v.c<g>>> it = vVar.c().iterator();
        while (it.hasNext()) {
            Iterator<v.c<g>> it4 = it.next().iterator();
            while (it4.hasNext()) {
                it4.next().a();
            }
        }
        return new b(vVar);
    }
}
