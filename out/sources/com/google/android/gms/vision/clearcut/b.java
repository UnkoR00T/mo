package com.google.android.gms.vision.clearcut;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f31459b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f31460c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f31458a = Math.round(30000.0d);

    public b(double d15) {
    }

    public final boolean a() {
        synchronized (this.f31459b) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f31460c + this.f31458a > jCurrentTimeMillis) {
                    return false;
                }
                this.f31460c = jCurrentTimeMillis;
                return true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
