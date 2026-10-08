package io.sentry.android.core.util;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile T f94176a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2213a<T> f94177b;

    /* JADX INFO: renamed from: io.sentry.android.core.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC2213a<T> {
        T a(Context context);
    }

    public a(InterfaceC2213a<T> interfaceC2213a) {
        this.f94177b = interfaceC2213a;
    }

    public T a(Context context) {
        if (this.f94176a == null) {
            synchronized (this) {
                try {
                    if (this.f94176a == null) {
                        this.f94176a = this.f94177b.a(context);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return this.f94176a;
    }
}
