package ym;

import android.content.Context;
import eh.be;
import eh.qd;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends pm.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pm.i f227889b;

    public f(pm.i iVar) {
        this.f227889b = iVar;
    }

    @Override // pm.e
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        xm.e eVar = (xm.e) obj;
        Context contextB = this.f227889b.b();
        qd qdVarB = be.b(k.b());
        return new i(be.b(k.b()), eVar, (b.a(contextB) || gg.e.f().a(contextB) >= 204500000) ? new b(contextB, eVar, qdVarB) : new n(contextB, eVar, qdVarB));
    }
}
