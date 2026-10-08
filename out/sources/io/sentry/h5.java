package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class h5 implements o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o5 f95009a;

    public h5() {
        if (b()) {
            this.f95009a = new y6();
        } else {
            this.f95009a = new j7();
        }
    }

    private static boolean b() {
        return io.sentry.util.x.c() && io.sentry.util.x.b();
    }

    @Override // io.sentry.o5
    public n5 a() {
        return this.f95009a.a();
    }
}
