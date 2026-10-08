package com.google.android.gms.common.util;

import android.content.Context;
import io.sentry.android.core.c2;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f29052a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th4) {
        try {
            s.l(context);
            s.l(th4);
            return false;
        } catch (Exception e15) {
            c2.f("CrashUtils", "Error adding exception to DropBox!", e15);
            return false;
        }
    }
}
