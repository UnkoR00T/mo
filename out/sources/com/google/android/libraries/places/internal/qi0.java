package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class qi0 implements i80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h80 f33416b;

    qi0(List list, h80 h80Var) {
        this.f33415a = list;
        this.f33416b = h80Var;
    }

    @Override // com.google.android.libraries.places.internal.i80
    public final void a(q70 q70Var, long j15, List list, List list2) {
        super.a(q70Var, j15, list, list2);
        for (j80 j80Var : this.f33415a) {
            if (j80Var.zza() <= q70Var.a()) {
                this.f33416b.b();
                j80Var.zzb();
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.i80
    public final void b(p70 p70Var, long j15, List list, List list2) {
        super.b(p70Var, 1L, list, list2);
        for (j80 j80Var : this.f33415a) {
            if (j80Var.zza() <= p70Var.a()) {
                this.f33416b.b();
                j80Var.zzb();
            }
        }
    }
}
