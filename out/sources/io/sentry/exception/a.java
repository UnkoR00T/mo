package io.sentry.exception;

import io.sentry.protocol.j;
import io.sentry.util.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f94886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f94887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread f94888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f94889d;

    public a(j jVar, Throwable th4, Thread thread, boolean z15) {
        this.f94886a = (j) v.c(jVar, "Mechanism is required.");
        this.f94887b = (Throwable) v.c(th4, "Throwable is required.");
        this.f94888c = (Thread) v.c(thread, "Thread is required.");
        this.f94889d = z15;
    }

    public j a() {
        return this.f94886a;
    }

    public Thread b() {
        return this.f94888c;
    }

    public Throwable c() {
        return this.f94887b;
    }

    public boolean d() {
        return this.f94889d;
    }

    public a(j jVar, Throwable th4, Thread thread) {
        this(jVar, th4, thread, false);
    }
}
