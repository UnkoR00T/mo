package io.sentry.android.core;

import io.sentry.q7;

/* JADX INFO: loaded from: classes4.dex */
final class j0 implements io.sentry.transport.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f94036a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94037a;

        static {
            int[] iArr = new int[io.sentry.p0.a.values().length];
            f94037a = iArr;
            try {
                iArr[io.sentry.p0.a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94037a[io.sentry.p0.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94037a[io.sentry.p0.a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    j0(q7 q7Var) {
        this.f94036a = q7Var;
    }

    boolean a(io.sentry.p0.a aVar) {
        int i15 = a.f94037a[aVar.ordinal()];
        return i15 == 1 || i15 == 2 || i15 == 3;
    }

    @Override // io.sentry.transport.r
    public boolean isConnected() {
        return a(this.f94036a.getConnectionStatusProvider().w1());
    }
}
