package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class qn implements m40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hr0 f33423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f33424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f33425c;

    qn(hr0 hr0Var, int i15, Class cls, Class cls2) {
        this.f33423a = hr0Var;
        this.f33424b = cls;
        this.f33425c = cls2;
    }

    @Override // com.google.android.libraries.places.internal.m40
    public final l40 a(f80 f80Var, f40 f40Var, g40 g40Var) {
        try {
            ak.n0 n0Var = (ak.n0) this.f33423a.zzb();
            rn.b(f80Var, this.f33424b, true);
            rn.b(f80Var, this.f33425c, false);
            return new to(new oo(g40Var, f80Var, f40Var, 2, n0Var));
        } catch (m90 e15) {
            return new dp(l90.b(e15));
        }
    }
}
