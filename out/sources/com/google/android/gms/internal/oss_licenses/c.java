package com.google.android.gms.internal.oss_licenses;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Thread f30759a;

    public static boolean a(Thread thread) {
        if (f30759a == null) {
            f30759a = Looper.getMainLooper().getThread();
        }
        return thread == f30759a;
    }
}
