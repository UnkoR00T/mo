package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class so {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l90 f33708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33709b;

    private so(int i15, l90 l90Var) {
        this.f33709b = i15;
        this.f33708a = l90Var;
    }

    static so b(int i15) {
        zj.p.w(true);
        return new so(i15, null);
    }

    static so c(int i15, l90 l90Var) {
        if (i15 != 4) {
            i15 = 5;
        }
        zj.p.w(true);
        return new so(i15, (l90) zj.p.q(l90Var));
    }

    final /* synthetic */ l90 a() {
        return this.f33708a;
    }

    final /* synthetic */ int d() {
        return this.f33709b;
    }
}
