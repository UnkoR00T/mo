package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class o41 implements com.google.common.util.concurrent.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ si f33150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ q41 f33151b;

    o41(q41 q41Var, si siVar) {
        this.f33150a = siVar;
        Objects.requireNonNull(q41Var);
        this.f33151b = q41Var;
    }

    @Override // com.google.common.util.concurrent.j
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str = (String) obj;
        if (!str.isEmpty()) {
            si siVar = this.f33150a;
            w20 w20VarI = x20.I();
            w20VarI.A(str);
            siVar.P(w20VarI);
        }
        this.f33151b.c(this.f33150a);
    }

    @Override // com.google.common.util.concurrent.j
    public final void b(Throwable th4) {
        this.f33151b.c(this.f33150a);
    }
}
