package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f35964a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f35966c;

    p(Class<?> cls) {
        this.f35965b = cls.getName();
    }

    Logger a() {
        Logger logger = this.f35966c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f35964a) {
            try {
                Logger logger2 = this.f35966c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f35965b);
                this.f35966c = logger3;
                return logger3;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
