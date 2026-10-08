package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f33710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f33711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33712c;

    public so0(boolean z15) {
    }

    public final so0 a(ro0... ro0VarArr) {
        String[] strArr = new String[ro0VarArr.length];
        for (int i15 = 0; i15 < ro0VarArr.length; i15++) {
            strArr[i15] = ro0VarArr[i15].f33588a;
        }
        this.f33710a = strArr;
        return this;
    }

    public final so0 b(String... strArr) {
        this.f33710a = strArr == null ? null : (String[]) strArr.clone();
        return this;
    }

    public final so0 c(gp0... gp0VarArr) {
        String[] strArr = new String[gp0VarArr.length];
        for (int i15 = 0; i15 < gp0VarArr.length; i15++) {
            strArr[i15] = gp0VarArr[i15].f32417a;
        }
        this.f33711b = strArr;
        return this;
    }

    public final so0 d(String... strArr) {
        this.f33711b = strArr == null ? null : (String[]) strArr.clone();
        return this;
    }

    public final so0 e(boolean z15) {
        this.f33712c = true;
        return this;
    }

    public final to0 f() {
        return new to0(this, null);
    }

    final /* synthetic */ String[] g() {
        return this.f33710a;
    }

    final /* synthetic */ String[] h() {
        return this.f33711b;
    }

    final /* synthetic */ boolean i() {
        return this.f33712c;
    }

    public so0(to0 to0Var) {
        boolean z15 = to0Var.f33804a;
        this.f33710a = to0Var.c();
        this.f33711b = to0Var.d();
        this.f33712c = to0Var.f33807d;
    }
}
