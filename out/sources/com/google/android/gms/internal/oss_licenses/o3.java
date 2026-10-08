package com.google.android.gms.internal.oss_licenses;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f30857a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f30859c;

    o3(Class cls) {
        this.f30858b = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f30859c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f30857a) {
            try {
                Logger logger2 = this.f30859c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f30858b);
                this.f30859c = logger3;
                return logger3;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
