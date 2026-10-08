package an;

import android.content.Context;
import fh.ik;
import fh.xj;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends pm.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pm.i f7930b;

    public t(pm.i iVar) {
        this.f7930b = iVar;
    }

    @Override // pm.e
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        zm.d dVar = (zm.d) obj;
        xj xjVarB = ik.b(dVar.a());
        Context contextB = this.f7930b.b();
        return new d(xjVarB, (gg.e.f().a(contextB) >= 204700000 || dVar.c()) ? new h(contextB, dVar, xjVarB) : new i(contextB), dVar);
    }
}
