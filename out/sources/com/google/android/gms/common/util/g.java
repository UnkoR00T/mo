package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.common.proguard.SideEffectFree;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f29054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f29055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f29056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Boolean f29057d;

    @SideEffectFree
    public static boolean a(Context context) {
        return g(context.getPackageManager());
    }

    @SideEffectFree
    public static boolean b(Context context) {
        return d(context.getPackageManager());
    }

    @TargetApi(26)
    public static boolean c(Context context) {
        if (b(context) && !j.c()) {
            return true;
        }
        if (e(context)) {
            return !j.d() || j.g();
        }
        return false;
    }

    @SideEffectFree
    public static boolean d(PackageManager packageManager) {
        if (f29054a == null) {
            f29054a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f29054a.booleanValue();
    }

    public static boolean e(Context context) {
        if (f29055b == null) {
            f29055b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f29055b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f29056c == null) {
            f29056c = Boolean.valueOf(j.d() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return f29056c.booleanValue();
    }

    @SideEffectFree
    public static boolean g(PackageManager packageManager) {
        if (f29057d == null) {
            boolean z15 = false;
            if (j.d() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z15 = true;
            }
            f29057d = Boolean.valueOf(z15);
        }
        return f29057d.booleanValue();
    }
}
