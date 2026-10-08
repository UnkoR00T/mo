package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35988a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f35989b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f35990c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f35991d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ThreadFactory f35992e = null;

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ThreadFactory f35993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicLong f35995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f35996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f35997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f35998f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f35993a = threadFactory;
            this.f35994b = str;
            this.f35995c = atomicLong;
            this.f35996d = bool;
            this.f35997e = num;
            this.f35998f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f35993a.newThread(runnable);
            Objects.requireNonNull(threadNewThread);
            String str = this.f35994b;
            if (str != null) {
                AtomicLong atomicLong = this.f35995c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(z.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f35996d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f35997e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f35998f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    private static ThreadFactory c(z zVar) {
        String str = zVar.f35988a;
        Boolean bool = zVar.f35989b;
        Integer num = zVar.f35990c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = zVar.f35991d;
        ThreadFactory threadFactoryDefaultThreadFactory = zVar.f35992e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public z e(boolean z15) {
        this.f35989b = Boolean.valueOf(z15);
        return this;
    }

    public z f(String str) {
        d(str, 0);
        this.f35988a = str;
        return this;
    }

    public z g(int i15) {
        zj.p.i(i15 >= 1, "Thread priority (%s) must be >= %s", i15, 1);
        zj.p.i(i15 <= 10, "Thread priority (%s) must be <= %s", i15, 10);
        this.f35990c = Integer.valueOf(i15);
        return this;
    }
}
