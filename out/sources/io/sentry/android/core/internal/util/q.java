package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
public final class q {
    public static boolean a(Context context, String str) {
        io.sentry.util.v.c(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
