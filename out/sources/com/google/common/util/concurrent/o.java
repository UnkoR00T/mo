package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
abstract class o<T> extends AtomicReference<Runnable> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Runnable f35961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f35962b;

    static final class b extends AbstractOwnableSynchronizer implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o<?> f35963a;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return this.f35963a.toString();
        }

        private b(o<?> oVar) {
            this.f35963a = oVar;
        }
    }

    private static final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f35961a = new c();
        f35962b = new c();
    }

    o() {
    }

    private void g(Thread thread) {
        Runnable runnable = get();
        b bVar = null;
        boolean z15 = false;
        int i15 = 0;
        while (true) {
            boolean z16 = runnable instanceof b;
            if (!z16 && runnable != f35962b) {
                break;
            }
            if (z16) {
                bVar = (b) runnable;
            }
            i15++;
            if (i15 > 1000) {
                Runnable runnable2 = f35962b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z15 = Thread.interrupted() || z15;
                    LockSupport.park(bVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z15) {
            thread.interrupt();
        }
    }

    abstract void a(Throwable th4);

    abstract void b(T t15);

    final void c() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            bVar.b(Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f35961a) == f35962b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    abstract boolean d();

    abstract T e();

    abstract String f();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th4) {
                    try {
                        x.a(th4);
                        if (!compareAndSet(threadCurrentThread, f35961a)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th4);
                        return;
                    } catch (Throwable th5) {
                        if (!compareAndSet(threadCurrentThread, f35961a)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(v.a(null));
                        }
                        throw th5;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f35961a)) {
                g(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            b(v.a(objE));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f35961a) {
            str = "running=[DONE]";
        } else if (runnable instanceof b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + f();
    }
}
