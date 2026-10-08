package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ee0 extends ri0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l90 f32195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final hb0 f32196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s40[] f32197e;

    public ee0(l90 l90Var, hb0 hb0Var, s40[] s40VarArr) {
        zj.p.e(!l90Var.j(), "error must not be OK");
        this.f32195c = l90Var;
        this.f32196d = hb0Var;
        this.f32197e = s40VarArr;
    }

    @Override // com.google.android.libraries.places.internal.ri0, com.google.android.libraries.places.internal.gb0
    public final void r(ff0 ff0Var) {
        ff0Var.b("error", this.f32195c);
        ff0Var.b("progress", this.f32196d);
    }

    @Override // com.google.android.libraries.places.internal.ri0, com.google.android.libraries.places.internal.gb0
    public final void u(ib0 ib0Var) {
        zj.p.x(!this.f32194b, "already started");
        this.f32194b = true;
        int i15 = 0;
        while (true) {
            s40[] s40VarArr = this.f32197e;
            if (i15 >= s40VarArr.length) {
                ib0Var.b(this.f32195c, this.f32196d, new a80());
                return;
            } else {
                s40 s40Var = s40VarArr[i15];
                i15++;
            }
        }
    }
}
