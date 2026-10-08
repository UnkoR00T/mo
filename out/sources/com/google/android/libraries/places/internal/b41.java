package com.google.android.libraries.places.internal;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class b41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f31736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Locale f31737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f31738c;

    public final synchronized void a(String str, Locale locale, boolean z15) {
        zj.p.r(str, "API Key must not be null.");
        zj.p.e(!str.isEmpty(), "API Key must not be empty.");
        this.f31736a = str;
        this.f31737b = locale;
        this.f31738c = z15;
    }

    public final synchronized boolean b() {
        return this.f31736a != null;
    }

    public final synchronized String c() {
        zj.p.x(b(), "ApiConfig must be initialized.");
        zj.p.q(this.f31736a);
        return this.f31736a;
    }

    public final synchronized Locale d() {
        try {
            zj.p.x(b(), "ApiConfig must be initialized.");
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f31737b == null ? Locale.getDefault() : this.f31737b;
    }

    public final boolean e() {
        return this.f31738c;
    }

    public final hi.a f() {
        zj.p.x(b(), "ApiConfig must be initialized.");
        return null;
    }
}
