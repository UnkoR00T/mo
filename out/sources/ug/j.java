package ug;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SharedPreferences f198082a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f198082a == null) {
                    f198082a = (SharedPreferences) yg.d.a(new k(context));
                }
                sharedPreferences = f198082a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return sharedPreferences;
    }
}
