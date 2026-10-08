package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class v81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n81 f34052a;

    private v81(n81 n81Var) {
        this.f34052a = n81Var;
    }

    public static v81 a() {
        return new v81(y71.b(false));
    }

    public static Runnable b(v81 v81Var, Runnable runnable) {
        n81 n81Var = v81Var.f34052a;
        zj.p.r(n81Var, "Trying to propagate null trace");
        int i15 = u81.f33863a;
        return new s81(n81Var, runnable);
    }

    public final String toString() {
        return this.f34052a.toString();
    }
}
