package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class rf0 extends je0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ gb0 f33508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ sf0 f33509b;

    rf0(sf0 sf0Var, gb0 gb0Var) {
        this.f33508a = gb0Var;
        Objects.requireNonNull(sf0Var);
        this.f33509b = sf0Var;
    }

    @Override // com.google.android.libraries.places.internal.je0
    protected final gb0 c() {
        return this.f33508a;
    }

    @Override // com.google.android.libraries.places.internal.je0, com.google.android.libraries.places.internal.gb0
    public final void u(ib0 ib0Var) {
        this.f33509b.h().a();
        this.f33508a.u(new qf0(this, ib0Var));
    }
}
