package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class sd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sd f30625b = new sd("VisionKit", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30626a = "VisionKit";

    public sd(String str, int i15) {
    }

    private final boolean d(int i15) {
        return Log.isLoggable(this.f30626a, i15);
    }

    private static final String e(Object obj, String str, Object... objArr) {
        String str2;
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            String name = obj.getClass().getName();
            if (obj instanceof Class) {
                name = ((Class) obj).getName();
            }
            String[] strArrSplit = name.split("\\.");
            int length = strArrSplit.length;
            str2 = length == 0 ? "" : strArrSplit[length - 1];
        }
        return "[" + str2 + "] " + str;
    }

    public final void a(Throwable th4, String str, Object... objArr) {
        if (d(6)) {
            io.sentry.android.core.c2.f(this.f30626a, "Error in result from JNI layer", th4);
        }
    }

    public final void b(Object obj, String str, Object... objArr) {
        if (d(4)) {
            e(obj, str, objArr);
        }
    }

    public final void c(Object obj, String str, Object... objArr) {
        if (d(5)) {
            io.sentry.android.core.c2.g(this.f30626a, e(obj, str, objArr));
        }
    }
}
