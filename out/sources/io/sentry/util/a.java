package io.sentry.util;

import io.sentry.g1;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends ReentrantLock {

    /* JADX INFO: renamed from: io.sentry.util.a$a, reason: collision with other inner class name */
    static final class C2243a implements g1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReentrantLock f95793a;

        C2243a(ReentrantLock reentrantLock) {
            this.f95793a = reentrantLock;
        }

        @Override // io.sentry.g1, java.lang.AutoCloseable
        public void close() {
            this.f95793a.unlock();
        }
    }

    public g1 a() {
        lock();
        return new C2243a(this);
    }
}
