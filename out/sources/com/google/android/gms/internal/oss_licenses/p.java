package com.google.android.gms.internal.oss_licenses;

/* JADX INFO: loaded from: classes3.dex */
final class p extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final q f30860e;

    static {
        q qVarA = new p(null, new r0.l1(0)).a();
        f30860e = qVarA;
        p pVar = new p(qVarA, new r0.l1(), null);
        boolean z15 = !pVar.f();
        Boolean bool = Boolean.TRUE;
        g0.b(z15, "Can't mutate after handing to trace");
        o oVar = q.f30868d;
        g0.b(!pVar.b(oVar), "Key already present");
        pVar.e().put(oVar, bool);
        pVar.a();
    }

    private p(q qVar, r0.l1 l1Var) {
        super(null, l1Var, null);
    }

    /* synthetic */ p(q qVar, r0.l1 l1Var, byte[] bArr) {
        super(qVar, l1Var, null);
    }
}
