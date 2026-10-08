package wr;

import java.util.Map;
import st.e1;
import st.t0;
import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sr.j f214547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zs.c f214548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<zs.f, ft.g<?>> f214549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f214550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final oq.k f214551e;

    /* JADX WARN: Multi-variable type inference failed */
    public l(sr.j jVar, zs.c cVar, Map<zs.f, ? extends ft.g<?>> map, boolean z15) {
        this.f214547a = jVar;
        this.f214548b = cVar;
        this.f214549c = map;
        this.f214550d = z15;
        this.f214551e = oq.l.b(oq.o.PUBLICATION, new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e1 c(l lVar) {
        return lVar.f214547a.p(lVar.g()).t();
    }

    @Override // wr.c
    public Map<zs.f, ft.g<?>> a() {
        return this.f214549c;
    }

    @Override // wr.c
    public zs.c g() {
        return this.f214548b;
    }

    @Override // wr.c
    public t0 getType() {
        return (t0) this.f214551e.getValue();
    }

    @Override // wr.c
    public h1 m() {
        return h1.f208052a;
    }

    public /* synthetic */ l(sr.j jVar, zs.c cVar, Map map, boolean z15, int i15, fr.k kVar) {
        this(jVar, cVar, map, (i15 & 8) != 0 ? false : z15);
    }
}
