package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
final class i2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f95025a;

    i2(q7 q7Var) {
        this.f95025a = q7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f95025a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f95025a.getLogger().c(b7.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
            return;
        }
        if (!this.f95025a.isEnableAutoSessionTracking()) {
            this.f95025a.getLogger().c(b7.DEBUG, "Session tracking is disabled, bailing from previous session mover.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = this.f95025a.getEnvelopeDiskCache();
        if (envelopeDiskCache instanceof io.sentry.cache.f) {
            io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
            fVar.E(io.sentry.cache.f.A(cacheDirPath), io.sentry.cache.f.C(cacheDirPath));
            fVar.z();
        }
    }
}
