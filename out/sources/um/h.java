package um;

import android.content.Context;
import ch.nk;
import ch.zk;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends pm.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pm.i f199029b;

    public h(pm.i iVar) {
        this.f199029b = iVar;
    }

    @Override // pm.e
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        rm.b bVar = (rm.b) obj;
        Context contextB = this.f199029b.b();
        nk nkVarB = zk.b(b.d());
        return new k(this.f199029b, bVar, (n.c(contextB) || gg.e.f().a(contextB) >= 204500000) ? new n(contextB, bVar, nkVarB) : new p(contextB, bVar, nkVarB), nkVarB);
    }
}
