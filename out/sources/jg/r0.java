package jg;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f102548a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f102549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f102550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f102551d;

    public static int a(Context context) {
        b(context);
        return f102551d;
    }

    private static void b(Context context) {
        synchronized (f102548a) {
            try {
                if (f102549b) {
                    return;
                }
                f102549b = true;
                try {
                    Bundle bundle = qg.d.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f102550c = bundle.getString("com.google.app.id");
                    f102551d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e15) {
                    c2.k("MetadataValueReader", "This should never happen.", e15);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
