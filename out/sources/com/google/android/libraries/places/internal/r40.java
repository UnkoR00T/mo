package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class r40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f40 f33484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f33487d;

    r40(f40 f40Var, int i15, boolean z15, boolean z16) {
        this.f33484a = (f40) zj.p.r(f40Var, "callOptions");
        this.f33485b = i15;
        this.f33486c = z15;
        this.f33487d = z16;
    }

    public static q40 a() {
        return new q40();
    }

    public final String toString() {
        return zj.j.c(this).d("callOptions", this.f33484a).b("previousAttempts", this.f33485b).e("isTransparentRetry", this.f33486c).e("isHedging", this.f33487d).toString();
    }
}
