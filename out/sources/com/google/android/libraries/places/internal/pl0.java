package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class pl0 extends p80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p80 f33337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ql0 f33338b;

    pl0(ql0 ql0Var, p80 p80Var) {
        Objects.requireNonNull(ql0Var);
        this.f33338b = ql0Var;
        this.f33337a = p80Var;
    }

    @Override // com.google.android.libraries.places.internal.p80
    public final l90 a(r80 r80Var) {
        l90 l90VarA = this.f33337a.a(r80Var);
        if (l90VarA.j()) {
            this.f33338b.e().zzb();
            return l90VarA;
        }
        ql0 ql0Var = this.f33338b;
        ql0Var.e().a(new ol0(ql0Var));
        return l90VarA;
    }
}
