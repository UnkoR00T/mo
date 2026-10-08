package jg;

import android.util.Log;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f102516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f102517b;

    public k(String str, String str2) {
        s.m(str, "log tag cannot be null");
        s.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f102516a = str;
        this.f102517b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    private final String g(String str) {
        String str2 = this.f102517b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i15) {
        return Log.isLoggable(this.f102516a, i15);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            g(str2);
        }
    }

    public void c(String str, String str2) {
        if (a(6)) {
            c2.e(str, g(str2));
        }
    }

    public void d(String str, String str2, Throwable th4) {
        if (a(6)) {
            c2.f(str, g(str2), th4);
        }
    }

    public void e(String str, String str2) {
        if (a(2)) {
            g(str2);
        }
    }

    public void f(String str, String str2) {
        if (a(5)) {
            c2.g(str, g(str2));
        }
    }
}
