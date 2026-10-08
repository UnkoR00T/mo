package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class z2 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2 f29611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a3 f29613c;

    z2(l2 l2Var, String str, Object[] objArr) {
        this.f29611a = l2Var;
        this.f29612b = str;
        this.f29613c = new a3(l2Var.getClass(), str, objArr);
    }

    @Override // com.google.android.gms.internal.clearcut.j2
    public final int a() {
        return (this.f29613c.f29159d & 1) == 1 ? f1.e.f29328i : f1.e.f29329j;
    }

    @Override // com.google.android.gms.internal.clearcut.j2
    public final boolean b() {
        return (this.f29613c.f29159d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.clearcut.j2
    public final l2 c() {
        return this.f29611a;
    }

    public final int d() {
        return this.f29613c.f29160e;
    }

    final a3 e() {
        return this.f29613c;
    }

    public final int f() {
        return this.f29613c.f29163h;
    }

    public final int g() {
        return this.f29613c.f29164i;
    }

    public final int h() {
        return this.f29613c.f29165j;
    }

    public final int i() {
        return this.f29613c.f29168m;
    }

    final int[] j() {
        return this.f29613c.f29169n;
    }

    public final int k() {
        return this.f29613c.f29167l;
    }

    public final int l() {
        return this.f29613c.f29166k;
    }
}
