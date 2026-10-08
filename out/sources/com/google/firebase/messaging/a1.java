package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference<a1> f36480d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f36481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w0 f36482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f36483c;

    private a1(SharedPreferences sharedPreferences, Executor executor) {
        this.f36483c = executor;
        this.f36481a = sharedPreferences;
    }

    public static synchronized a1 a(Context context, Executor executor) {
        a1 a1Var;
        try {
            WeakReference<a1> weakReference = f36480d;
            a1Var = weakReference != null ? weakReference.get() : null;
            if (a1Var == null) {
                a1Var = new a1(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                a1Var.c();
                f36480d = new WeakReference<>(a1Var);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return a1Var;
    }

    private synchronized void c() {
        this.f36482b = w0.c(this.f36481a, "topic_operation_queue", ",", this.f36483c);
    }

    synchronized z0 b() {
        return z0.a(this.f36482b.e());
    }

    synchronized boolean d(z0 z0Var) {
        return this.f36482b.f(z0Var.e());
    }
}
