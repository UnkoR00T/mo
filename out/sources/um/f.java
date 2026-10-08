package um;

import ch.zk;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f199020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pm.d f199021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pm.i f199022c;

    f(h hVar, pm.d dVar, pm.i iVar) {
        this.f199020a = hVar;
        this.f199021b = dVar;
        this.f199022c = iVar;
    }

    public final g a(rm.b bVar) {
        return new g(bVar, (k) this.f199020a.b(bVar), this.f199021b.a(bVar.c()), zk.b(b.d()), this.f199022c);
    }
}
