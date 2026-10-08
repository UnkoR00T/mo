package com.google.android.gms.internal.clearcut;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f29491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f29494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f29495f;

    public p(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    public final <T> f<T> a(String str, T t15, o<T> oVar) {
        return f.c(this, str, t15, oVar);
    }

    public final f<String> b(String str, String str2) {
        return f.d(this, str, null);
    }

    public final f<Boolean> e(String str, boolean z15) {
        return f.e(this, str, false);
    }

    public final p f(String str) {
        boolean z15 = this.f29494e;
        if (z15) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new p(this.f29490a, this.f29491b, str, this.f29493d, z15, this.f29495f);
    }

    public final p h(String str) {
        return new p(this.f29490a, this.f29491b, this.f29492c, str, this.f29494e, this.f29495f);
    }

    private p(String str, Uri uri, String str2, String str3, boolean z15, boolean z16) {
        this.f29490a = str;
        this.f29491b = uri;
        this.f29492c = str2;
        this.f29493d = str3;
        this.f29494e = z15;
        this.f29495f = z16;
    }
}
