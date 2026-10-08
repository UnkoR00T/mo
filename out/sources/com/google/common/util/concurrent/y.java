package com.google.common.util.concurrent;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes4.dex */
final class y implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p f35973f = new p(y.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f35974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque<Runnable> f35975b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f35976c = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f35977d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f35978e = new b(this, null);

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f35979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f35980b;

        a(y yVar, Runnable runnable) {
            this.f35979a = runnable;
            this.f35980b = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35979a.run();
        }

        public String toString() {
            return this.f35979a.toString();
        }
    }

    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Runnable f35981a;

        private b() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x003d A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.f35981a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            com.google.common.util.concurrent.y.f35973f.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f35981a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
        
            r8.f35981a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.common.util.concurrent.y r2 = com.google.common.util.concurrent.y.this     // Catch: java.lang.Throwable -> L58
                java.util.Deque r2 = com.google.common.util.concurrent.y.a(r2)     // Catch: java.lang.Throwable -> L58
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L2d
                com.google.common.util.concurrent.y r0 = com.google.common.util.concurrent.y.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.y$c r0 = com.google.common.util.concurrent.y.c(r0)     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.y$c r3 = com.google.common.util.concurrent.y.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
            L18:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L48
            L20:
                r0 = move-exception
                goto L81
            L22:
                com.google.common.util.concurrent.y r0 = com.google.common.util.concurrent.y.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.y.e(r0)     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.y r0 = com.google.common.util.concurrent.y.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.y.d(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                com.google.common.util.concurrent.y r3 = com.google.common.util.concurrent.y.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = com.google.common.util.concurrent.y.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f35981a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L49
                com.google.common.util.concurrent.y r0 = com.google.common.util.concurrent.y.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.y$c r3 = com.google.common.util.concurrent.y.c.IDLE     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.y.d(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
                goto L18
            L48:
                return
            L49:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f35981a     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
                r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            L55:
                r8.f35981a = r2     // Catch: java.lang.Throwable -> L58
                goto L2
            L58:
                r0 = move-exception
                goto L83
            L5a:
                r0 = move-exception
                goto L7e
            L5c:
                r3 = move-exception
                com.google.common.util.concurrent.p r4 = com.google.common.util.concurrent.y.f()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r6.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.Runnable r7 = r8.f35981a     // Catch: java.lang.Throwable -> L5a
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
                goto L55
            L7e:
                r8.f35981a = r2     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L81:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L58
            L83:
                if (r1 == 0) goto L8c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.y.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e15) {
                synchronized (y.this.f35975b) {
                    y.this.f35976c = c.IDLE;
                    throw e15;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f35981a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + y.this.f35976c + "}";
        }

        /* synthetic */ b(y yVar, a aVar) {
            this();
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    y(Executor executor) {
        this.f35974a = (Executor) zj.p.q(executor);
    }

    static /* synthetic */ long e(y yVar) {
        long j15 = yVar.f35977d;
        yVar.f35977d = 1 + j15;
        return j15;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x005f  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        boolean z15;
        zj.p.q(runnable);
        synchronized (this.f35975b) {
            c cVar2 = this.f35976c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j15 = this.f35977d;
                a aVar = new a(this, runnable);
                this.f35975b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f35976c = cVar3;
                try {
                    this.f35974a.execute(this.f35978e);
                    if (this.f35976c != cVar3) {
                        return;
                    }
                    synchronized (this.f35975b) {
                        try {
                            if (this.f35977d == j15 && this.f35976c == cVar3) {
                                this.f35976c = cVar;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    return;
                } catch (Throwable th5) {
                    synchronized (this.f35975b) {
                        try {
                            c cVar4 = this.f35976c;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z15 = false;
                            } else if (this.f35975b.removeLastOccurrence(aVar)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (!(th5 instanceof RejectedExecutionException) || z15) {
                                throw th5;
                            }
                            return;
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
            }
            this.f35975b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f35974a + "}";
    }
}
