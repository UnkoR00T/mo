package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v1 f29557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v1 f29558b;

    static {
        w1 w1Var = null;
        f29557a = new x1();
        f29558b = new y1();
    }

    private v1() {
    }

    static v1 c() {
        return f29557a;
    }

    static v1 d() {
        return f29558b;
    }

    abstract void a(Object obj, long j15);

    abstract <L> void b(Object obj, Object obj2, long j15);
}
