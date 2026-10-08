package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import j6.z0;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static void a(Window window, boolean z15, Integer num, Integer num2) {
        boolean z16 = num == null || num.intValue() == 0;
        boolean z17 = num2 == null || num2.intValue() == 0;
        if (z16 || z17) {
            int iB = bj.a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z16) {
                num = Integer.valueOf(iB);
            }
            if (z17) {
                num2 = Integer.valueOf(iB);
            }
        }
        z0.b(window, !z15);
        int iC = c(window.getContext(), z15);
        int iB2 = b(window.getContext(), z15);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        f(window, d(iC, bj.a.h(num.intValue())));
        e(window, d(iB2, bj.a.h(num2.intValue())));
    }

    private static int b(Context context, boolean z15) {
        if (z15 && Build.VERSION.SDK_INT < 27) {
            return x5.c.k(bj.a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z15) {
            return 0;
        }
        return bj.a.b(context, R.attr.navigationBarColor, -16777216);
    }

    private static int c(Context context, boolean z15) {
        if (z15) {
            return 0;
        }
        return bj.a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i15, boolean z15) {
        if (bj.a.h(i15)) {
            return true;
        }
        return i15 == 0 && z15;
    }

    public static void e(Window window, boolean z15) {
        z0.a(window, window.getDecorView()).a(z15);
    }

    public static void f(Window window, boolean z15) {
        z0.a(window, window.getDecorView()).b(z15);
    }
}
