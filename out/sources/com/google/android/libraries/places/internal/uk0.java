package com.google.android.libraries.places.internal;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
final class uk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f33944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Future f33945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f33946c;

    uk0(Object obj) {
        this.f33944a = obj;
    }

    final void a(Future future) {
        boolean z15;
        synchronized (this.f33944a) {
            try {
                z15 = this.f33946c;
                if (!z15) {
                    this.f33945b = future;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z15) {
            future.cancel(false);
        }
    }

    final Future b() {
        this.f33946c = true;
        return this.f33945b;
    }
}
