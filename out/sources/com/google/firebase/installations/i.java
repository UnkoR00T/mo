package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f36431b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f36432c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static i f36433d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pl.a f36434a;

    private i(pl.a aVar) {
        this.f36434a = aVar;
    }

    public static i c() {
        return d(pl.b.b());
    }

    public static i d(pl.a aVar) {
        if (f36433d == null) {
            f36433d = new i(aVar);
        }
        return f36433d;
    }

    static boolean g(String str) {
        return f36432c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f36434a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(nl.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f36431b;
    }
}
