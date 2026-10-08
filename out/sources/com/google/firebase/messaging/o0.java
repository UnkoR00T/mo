package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
final class o0 {
    private static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    static boolean c(Context context) {
        return b(context).getBoolean("proxy_notification_initialized", false);
    }

    static boolean d(SharedPreferences sharedPreferences, boolean z15) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z15;
    }

    static void e(Context context, boolean z15) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z15);
        editorEdit.apply();
    }

    static void f(final Context context, d0 d0Var, final boolean z15) {
        if (com.google.android.gms.common.util.j.f() && !d(b(context), z15)) {
            d0Var.k(z15).f(new ma.b(), new vh.h() { // from class: com.google.firebase.messaging.n0
                @Override // vh.h
                public final void a(Object obj) {
                    o0.g(context, z15);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Context context, boolean z15) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_retention", z15);
        editorEdit.apply();
    }
}
