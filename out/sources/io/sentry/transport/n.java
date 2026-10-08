package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p f95767a = new n();

    private n() {
    }

    public static p b() {
        return f95767a;
    }

    @Override // io.sentry.transport.p
    public final long a() {
        return System.currentTimeMillis();
    }
}
