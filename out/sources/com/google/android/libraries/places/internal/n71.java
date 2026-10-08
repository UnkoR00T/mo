package com.google.android.libraries.places.internal;

import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class n71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Thread f33046a;

    public static boolean a(Thread thread) {
        if (f33046a == null) {
            f33046a = Looper.getMainLooper().getThread();
        }
        return thread == f33046a;
    }
}
