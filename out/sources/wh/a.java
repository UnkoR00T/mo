package wh;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static int a(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            return c2.e("Vision", String.format(str, objArr));
        }
        return 0;
    }

    @SuppressLint({"LogTagMismatch"})
    public static int b(@RecentlyNonNull Throwable th4, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!Log.isLoggable("Vision", 6)) {
            return 0;
        }
        if (Log.isLoggable("Vision", 3)) {
            return c2.f("Vision", String.format(str, objArr), th4);
        }
        String str2 = String.format(str, objArr);
        String strValueOf = String.valueOf(th4);
        StringBuilder sb5 = new StringBuilder(str2.length() + 2 + strValueOf.length());
        sb5.append(str2);
        sb5.append(": ");
        sb5.append(strValueOf);
        return c2.e("Vision", sb5.toString());
    }

    public static int c(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 4)) {
            return Log.i("Vision", String.format(str, objArr));
        }
        return 0;
    }

    public static int d(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 2)) {
            return Log.v("Vision", String.format(str, objArr));
        }
        return 0;
    }
}
