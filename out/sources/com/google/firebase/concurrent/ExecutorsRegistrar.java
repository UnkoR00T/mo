package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import yk.d0;
import yk.w;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final w<ScheduledExecutorService> f36344a = new w<>(new kl.b() { // from class: zk.a
        @Override // kl.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final w<ScheduledExecutorService> f36345b = new w<>(new kl.b() { // from class: zk.b
        @Override // kl.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final w<ScheduledExecutorService> f36346c = new w<>(new kl.b() { // from class: zk.c
        @Override // kl.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final w<ScheduledExecutorService> f36347d = new w<>(new kl.b() { // from class: zk.d
        @Override // kl.b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i15) {
        return new b(str, i15, null);
    }

    private static ThreadFactory k(String str, int i15, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i15, threadPolicy);
    }

    private static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, f36347d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<yk.c<?>> getComponents() {
        return Arrays.asList(yk.c.f(d0.a(xk.a.class, ScheduledExecutorService.class), d0.a(xk.a.class, ExecutorService.class), d0.a(xk.a.class, Executor.class)).e(new yk.g() { // from class: zk.e
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return ExecutorsRegistrar.f36344a.get();
            }
        }).d(), yk.c.f(d0.a(xk.b.class, ScheduledExecutorService.class), d0.a(xk.b.class, ExecutorService.class), d0.a(xk.b.class, Executor.class)).e(new yk.g() { // from class: zk.f
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return ExecutorsRegistrar.f36346c.get();
            }
        }).d(), yk.c.f(d0.a(xk.c.class, ScheduledExecutorService.class), d0.a(xk.c.class, ExecutorService.class), d0.a(xk.c.class, Executor.class)).e(new yk.g() { // from class: zk.g
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return ExecutorsRegistrar.f36345b.get();
            }
        }).d(), yk.c.e(d0.a(xk.d.class, Executor.class)).e(new yk.g() { // from class: zk.h
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return k.INSTANCE;
            }
        }).d());
    }
}
