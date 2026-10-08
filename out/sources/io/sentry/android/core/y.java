package io.sentry.android.core;

import android.util.Log;
import io.sentry.b7;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements io.sentry.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94196a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94197a;

        static {
            int[] iArr = new int[b7.values().length];
            f94197a = iArr;
            try {
                iArr[b7.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94197a[b7.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94197a[b7.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94197a[b7.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94197a[b7.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public y() {
        this("Sentry");
    }

    private int e(b7 b7Var) {
        int i15 = a.f94197a[b7Var.ordinal()];
        if (i15 == 1) {
            return 4;
        }
        if (i15 != 2) {
            return i15 != 4 ? 3 : 7;
        }
        return 5;
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
        if (a.f94197a[b7Var.ordinal()] != 4) {
            return;
        }
        Log.wtf(this.f94196a, str, th4);
    }

    @Override // io.sentry.v0
    public void c(b7 b7Var, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(e(b7Var), this.f94196a, str);
        } else {
            Log.println(e(b7Var), this.f94196a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.v0
    public boolean d(b7 b7Var) {
        return true;
    }

    public y(String str) {
        this.f94196a = str;
    }
}
