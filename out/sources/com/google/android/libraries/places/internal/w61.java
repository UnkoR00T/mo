package com.google.android.libraries.places.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class w61 implements z61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f34120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k41 f34121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final u30 f34122c = y30.a(zu0.a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final u30 f34123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final u30 f34124e;

    w61(Context context, k41 k41Var) {
        this.f34120a = context;
        this.f34121b = k41Var;
        r30 r30VarA = s30.a(context);
        this.f34123d = r30VarA;
        this.f34124e = q30.a(g41.a(r30VarA, jv0.a()));
    }

    @Override // com.google.android.libraries.places.internal.z61
    public final ji.n a() {
        return gi.a.d(e41.c(this.f34120a), b());
    }

    final l41 b() {
        j41 j41VarD = l41.d(e41.c(this.f34120a));
        j41VarD.b(this.f34121b);
        return j41VarD.d();
    }

    @Override // com.google.android.libraries.places.internal.z61
    public final a71 c() {
        return new b71(new q41(f41.a(this.f34120a), (qv0) this.f34124e.zzb()), b());
    }

    @Override // com.google.android.libraries.places.internal.z61
    public final s61 d() {
        return new s61(e41.c(this.f34120a));
    }

    @Override // com.google.android.libraries.places.internal.z61
    public final xu0 zzb() {
        return (xu0) this.f34122c.zzb();
    }
}
