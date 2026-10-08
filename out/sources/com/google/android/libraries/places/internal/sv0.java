package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class sv0 implements on {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final w70 f33721c = w70.c("Cookie", a80.f31574d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.common.util.concurrent.q f33722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qv0 f33723b;

    public sv0(qv0 qv0Var) {
        this.f33723b = qv0Var;
    }

    @Override // com.google.android.libraries.places.internal.on
    public final wo a(mn mnVar) {
        com.google.common.util.concurrent.q qVarA = this.f33723b.a();
        this.f33722a = qVarA;
        return wo.b(qVarA);
    }

    @Override // com.google.android.libraries.places.internal.on
    public final wo b(mn mnVar) {
        com.google.common.util.concurrent.q qVar = this.f33722a;
        if (qVar == null) {
            return wo.a();
        }
        try {
            String str = (String) com.google.common.util.concurrent.k.b(qVar);
            if (!fr.t.c(str, "")) {
                a80 a80VarB = mnVar.b();
                w70 w70Var = f33721c;
                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 4);
                sb5.append("NID=");
                sb5.append(str);
                a80VarB.c(w70Var, sb5.toString());
            }
        } catch (Exception unused) {
        }
        return wo.a();
    }
}
