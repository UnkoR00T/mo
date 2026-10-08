package io.sentry.android.core;

import android.util.Log;
import io.sentry.b7;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements io.sentry.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94192a;

    public x() {
        this("Sentry");
    }

    private int e(b7 b7Var) {
        return 7;
    }

    @Override // io.sentry.v0
    public void a(b7 b7Var, Throwable th4, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            b(b7Var, str, th4);
        } else {
            b(b7Var, String.format(str, objArr), th4);
        }
    }

    @Override // io.sentry.v0
    public void b(b7 b7Var, String str, Throwable th4) {
        Log.wtf(this.f94192a, str, th4);
    }

    @Override // io.sentry.v0
    public void c(b7 b7Var, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(e(b7Var), this.f94192a, str);
        } else {
            Log.println(e(b7Var), this.f94192a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.v0
    public boolean d(b7 b7Var) {
        return true;
    }

    public x(String str) {
        this.f94192a = str;
    }
}
