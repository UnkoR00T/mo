package com.google.android.libraries.places.internal;

import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
public final class aw0 implements r30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u30 f31717a;

    private aw0(u30 u30Var) {
        this.f31717a = u30Var;
    }

    public static aw0 a(u30 u30Var) {
        return new aw0(u30Var);
    }

    @Override // com.google.android.libraries.places.internal.hr0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Optional optional = (Optional) this.f31717a.zzb();
        on0 on0VarE = on0.e("mapsmobilesdks-pa.googleapis.com", 443);
        on0VarE.f();
        a80 a80Var = new a80();
        a80Var.c(w70.c("X-Goog-Api-Key", a80.f31574d), (String) optional.orElse("AIzaSyDgmW4ZMvNblSXqMOgsbY8uRrTnfR3E7pY"));
        on0VarE.c(rq0.a(a80Var));
        return on0VarE.a();
    }
}
