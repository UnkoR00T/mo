package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class rn0 extends ea0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final nr0 f33520q = new nr0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f80 f33521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f33522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final im0 f33523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f33524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final qn0 f33525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final pn0 f33526n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b40 f33527o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f33528p;

    rn0(f80 f80Var, a80 a80Var, gn0 gn0Var, ao0 ao0Var, po0 po0Var, Object obj, int i15, int i16, String str, String str2, im0 im0Var, sm0 sm0Var, f40 f40Var, boolean z15) {
        super(new ko0(), im0Var, sm0Var, a80Var, f40Var, false);
        this.f33526n = new pn0(this);
        this.f33528p = false;
        this.f33523k = (im0) zj.p.r(im0Var, "statsTraceCtx");
        this.f33521i = f80Var;
        this.f33524l = str;
        this.f33522j = str2;
        this.f33527o = ao0Var.f();
        this.f33525m = new qn0(this, i15, im0Var, obj, gn0Var, po0Var, ao0Var, i16, f80Var.b(), f40Var);
    }

    final /* synthetic */ f80 D() {
        return this.f33521i;
    }

    final /* synthetic */ String E() {
        return this.f33522j;
    }

    final /* synthetic */ im0 F() {
        return this.f33523k;
    }

    final /* synthetic */ String G() {
        return this.f33524l;
    }

    final /* synthetic */ qn0 H() {
        return this.f33525m;
    }

    protected final qn0 J() {
        return this.f33525m;
    }

    public final d80 K() {
        return this.f33521i.a();
    }

    @Override // com.google.android.libraries.places.internal.ea0, com.google.android.libraries.places.internal.ia0
    protected final /* synthetic */ ha0 g() {
        return this.f33525m;
    }

    @Override // com.google.android.libraries.places.internal.ea0
    protected final /* synthetic */ da0 k() {
        return this.f33525m;
    }

    @Override // com.google.android.libraries.places.internal.ea0
    protected final /* synthetic */ ba0 l() {
        return this.f33526n;
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final b40 o() {
        return this.f33527o;
    }

    final boolean y() {
        return false;
    }
}
