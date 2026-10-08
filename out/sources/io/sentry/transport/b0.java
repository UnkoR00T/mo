package io.sentry.transport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f95739a;

    private static final class a extends AbstractQueuedSynchronizer {
        a(int i15) {
            setState(i15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            releaseShared(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int e() {
            return getState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i15) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i15) {
            int state;
            int i16;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i16 = state - 1;
            } while (!compareAndSetState(state, i16));
            return i16 == 0;
        }
    }

    public b0(int i15) {
        if (i15 >= 0) {
            this.f95739a = new a(i15);
            return;
        }
        throw new IllegalArgumentException("negative initial count '" + i15 + "' is not allowed");
    }

    public void a() {
        this.f95739a.d();
    }

    public int b() {
        return this.f95739a.e();
    }

    public void c() {
        this.f95739a.f();
    }

    public boolean d(long j15, TimeUnit timeUnit) {
        return this.f95739a.tryAcquireSharedNanos(1, timeUnit.toNanos(j15));
    }

    public b0() {
        this(0);
    }
}
