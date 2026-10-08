package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class xv0 implements tv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r70 f34311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.common.util.concurrent.s f34312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qv0 f34313c;

    public xv0(r70 r70Var, qv0 qv0Var, com.google.common.util.concurrent.s sVar) {
        this.f34311a = r70Var;
        this.f34313c = qv0Var;
        this.f34312b = sVar;
    }

    static /* synthetic */ com.google.common.util.concurrent.q a(xv0 xv0Var, String str) {
        u20 u20VarB = v20.b(xv0Var.f34311a);
        p20 p20VarI = q20.I();
        p20VarI.A(str);
        return oq0.a(u20VarB.b().b(v20.a(), u20VarB.c()), (q20) p20VarI.H0());
    }

    @Override // com.google.android.libraries.places.internal.tv0
    public final void zza() {
        com.google.common.util.concurrent.q qVarA = this.f34313c.a();
        final er.l lVar = new er.l() { // from class: com.google.android.libraries.places.internal.vv0
            @Override // er.l
            public final /* synthetic */ Object b(Object obj) {
                return xv0.a(this.f34088a, (String) obj);
            }
        };
        com.google.common.util.concurrent.d dVar = new com.google.common.util.concurrent.d() { // from class: com.google.android.libraries.places.internal.uv0
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ com.google.common.util.concurrent.q apply(Object obj) {
                return (com.google.common.util.concurrent.q) lVar.b(obj);
            }
        };
        com.google.common.util.concurrent.s sVar = this.f34312b;
        com.google.common.util.concurrent.k.a(com.google.common.util.concurrent.k.e(qVarA, dVar, sVar), new wv0(this), sVar);
    }

    @Override // com.google.android.libraries.places.internal.tv0
    public final void zzb() {
        this.f34311a.i();
    }
}
