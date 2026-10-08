package com.google.android.libraries.places.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class q41 implements r41 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Integer f33384c = 79508299;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ye.h f33385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qv0 f33386b;

    public q41(ye.h hVar, qv0 qv0Var) {
        this.f33385a = hVar;
        this.f33386b = qv0Var;
    }

    public static ye.h b(Context context) {
        af.t.f(context.getApplicationContext());
        return af.t.c().h("cct").a("LE", u.class, ye.c.b("proto"), p41.f33264a);
    }

    @Override // com.google.android.libraries.places.internal.r41
    public final void a(si siVar) {
        com.google.common.util.concurrent.k.a(this.f33386b.a(), new o41(this, siVar), com.google.common.util.concurrent.u.a());
    }

    final /* synthetic */ void c(si siVar) {
        zi ziVar = (zi) siVar.H0();
        s sVarI = u.I();
        sVarI.D(1);
        sVarI.A(ziVar);
        this.f33385a.a(ye.d.f((u) sVarI.H0(), ye.f.b(f33384c)));
    }
}
