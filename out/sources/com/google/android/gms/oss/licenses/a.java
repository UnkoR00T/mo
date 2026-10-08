package com.google.android.gms.oss.licenses;

import CON.x;
import android.os.Build;
import j6.z0;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f31431a;

    static {
        f31431a = Build.VERSION.SDK_INT >= 27;
    }

    public static void a(androidx.appcompat.app.c cVar) {
        if (f31431a) {
            x.a(cVar);
            z0.b(cVar.getWindow(), true);
        }
    }
}
