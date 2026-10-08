package u5;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.Executor;
import s5.o;
import w5.h;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f195355a = new Object();

    /* JADX INFO: renamed from: u5.a$a, reason: collision with other inner class name */
    static class C5086a {
        static Drawable a(Context context, int i15) {
            return context.getDrawable(i15);
        }

        static File b(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    static class b {
        static int a(Context context, int i15) {
            return context.getColor(i15);
        }

        static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }
    }

    static class c {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    static class d {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i15) {
            return ((i15 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i15 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, a.l(context), handler);
        }

        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    static class e {
        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    static class f {
        static String a(Context context) {
            return context.getAttributionTag();
        }
    }

    static class g {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i15) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i15);
        }
    }

    public static int a(Context context, String str) {
        i6.c.d(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return o.e(context).a() ? 0 : -1;
    }

    public static Context b(Context context) {
        return c.a(context);
    }

    public static String c(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.a(context);
        }
        return null;
    }

    public static int d(Context context, int i15) {
        return b.a(context, i15);
    }

    public static ColorStateList e(Context context, int i15) {
        return h.d(context.getResources(), i15, context.getTheme());
    }

    public static Drawable f(Context context, int i15) {
        return C5086a.a(context, i15);
    }

    @Deprecated
    public static File[] g(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] h(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor i(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.a(context) : e6.f.a(new Handler(context.getMainLooper()));
    }

    public static File j(Context context) {
        return C5086a.b(context);
    }

    public static <T> T k(Context context, Class<T> cls) {
        return (T) b.b(context, cls);
    }

    static String l(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (u5.d.c(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (u5.d.c(context, str) == 0) {
                return str;
            }
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent m(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i15) {
        return n(context, broadcastReceiver, intentFilter, null, null, i15);
    }

    public static Intent n(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i15) {
        int i16 = i15 & 1;
        if (i16 != 0 && (i15 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i16 != 0) {
            i15 |= 2;
        }
        int i17 = i15;
        int i18 = i17 & 2;
        if (i18 == 0 && (i17 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i18 == 0 || (i17 & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? g.a(context, broadcastReceiver, intentFilter, str, handler, i17) : d.a(context, broadcastReceiver, intentFilter, str, handler, i17);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static boolean o(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    @Deprecated
    public static void p(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void q(Context context, Intent intent) {
        d.b(context, intent);
    }
}
