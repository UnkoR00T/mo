package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class q40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f40 f33380a = f40.f32247h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33383d;

    q40() {
    }

    public final q40 a(f40 f40Var) {
        this.f33380a = (f40) zj.p.r(f40Var, "callOptions cannot be null");
        return this;
    }

    public final q40 b(int i15) {
        this.f33381b = i15;
        return this;
    }

    public final q40 c(boolean z15) {
        this.f33382c = z15;
        return this;
    }

    public final q40 d(boolean z15) {
        this.f33383d = z15;
        return this;
    }

    public final r40 e() {
        return new r40(this.f33380a, this.f33381b, this.f33382c, this.f33383d);
    }
}
