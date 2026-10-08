package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
abstract class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e3 f31006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e3 f31007b;

    static {
        h3 h3Var = null;
        f31006a = new g3();
        f31007b = new j3();
    }

    private e3() {
    }

    static e3 a() {
        return f31006a;
    }

    static e3 c() {
        return f31007b;
    }

    abstract <L> void b(Object obj, Object obj2, long j15);

    abstract void d(Object obj, long j15);
}
