package com.google.android.gms.internal.clearcut;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile UserManager f29184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f29185b = !b();

    private b() {
    }

    public static boolean a(Context context) {
        return b() && !c(context);
    }

    private static boolean b() {
        return true;
    }

    @TargetApi(24)
    private static boolean c(Context context) {
        boolean z15 = f29185b;
        if (z15) {
            return z15;
        }
        UserManager userManager = f29184a;
        if (userManager == null) {
            synchronized (b.class) {
                try {
                    userManager = f29184a;
                    if (userManager == null) {
                        UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                        f29184a = userManager2;
                        if (userManager2 == null) {
                            f29185b = true;
                            return true;
                        }
                        userManager = userManager2;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        boolean zIsUserUnlocked = userManager.isUserUnlocked();
        f29185b = zIsUserUnlocked;
        if (zIsUserUnlocked) {
            f29184a = null;
        }
        return zIsUserUnlocked;
    }
}
