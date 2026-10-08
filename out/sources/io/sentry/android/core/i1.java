package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.b7;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class i1 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f93888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.t0 f93889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.v0 f93890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f93891d;

    private static final class a implements io.sentry.hints.e, io.sentry.hints.k, io.sentry.hints.p, io.sentry.hints.i, io.sentry.hints.b, io.sentry.hints.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f93892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f93893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CountDownLatch f93894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f93895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final io.sentry.v0 f93896e;

        public a(long j15, io.sentry.v0 v0Var) {
            reset();
            this.f93895d = j15;
            this.f93896e = (io.sentry.v0) io.sentry.util.v.c(v0Var, "ILogger is required.");
        }

        @Override // io.sentry.hints.k
        public boolean a() {
            return this.f93892a;
        }

        @Override // io.sentry.hints.p
        public void c(boolean z15) {
            this.f93893b = z15;
            this.f93894c.countDown();
        }

        @Override // io.sentry.hints.k
        public void d(boolean z15) {
            this.f93892a = z15;
        }

        @Override // io.sentry.hints.p
        public boolean e() {
            return this.f93893b;
        }

        @Override // io.sentry.hints.i
        public boolean g() {
            try {
                return this.f93894c.await(this.f93895d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e15) {
                Thread.currentThread().interrupt();
                this.f93896e.b(b7.ERROR, "Exception while awaiting on lock.", e15);
                return false;
            }
        }

        @Override // io.sentry.hints.j
        public void reset() {
            this.f93894c = new CountDownLatch(1);
            this.f93892a = false;
            this.f93893b = false;
        }
    }

    i1(String str, io.sentry.t0 t0Var, io.sentry.v0 v0Var, long j15) {
        super(str);
        this.f93888a = str;
        this.f93889b = (io.sentry.t0) io.sentry.util.v.c(t0Var, "Envelope sender is required.");
        this.f93890c = (io.sentry.v0) io.sentry.util.v.c(v0Var, "Logger is required.");
        this.f93891d = j15;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i15, String str) {
        if (str == null || i15 != 8) {
            return;
        }
        this.f93890c.c(b7.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i15), this.f93888a, str);
        io.sentry.j0 j0VarE = io.sentry.util.m.e(new a(this.f93891d, this.f93890c));
        this.f93889b.a(this.f93888a + File.separator + str, j0VarE);
    }
}
