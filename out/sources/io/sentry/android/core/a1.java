package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import io.sentry.b7;
import io.sentry.q7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"NewApi"})
    private static final io.sentry.android.core.util.a<PackageInfo> f93748a = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC2213a() { // from class: io.sentry.android.core.v0
        @Override // io.sentry.android.core.util.a.InterfaceC2213a
        public final Object a(Context context) {
            return a1.d(context);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final io.sentry.android.core.util.a<PackageInfo> f93749b = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC2213a() { // from class: io.sentry.android.core.w0
        @Override // io.sentry.android.core.util.a.InterfaceC2213a
        public final Object a(Context context) {
            return a1.b(context);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final io.sentry.android.core.util.a<String> f93750c = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC2213a() { // from class: io.sentry.android.core.x0
        @Override // io.sentry.android.core.util.a.InterfaceC2213a
        public final Object a(Context context) {
            return a1.a(context);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"NewApi"})
    private static final io.sentry.android.core.util.a<ApplicationInfo> f93751d = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC2213a() { // from class: io.sentry.android.core.y0
        @Override // io.sentry.android.core.util.a.InterfaceC2213a
        public final Object a(Context context) {
            return a1.c(context);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final io.sentry.android.core.util.a<ApplicationInfo> f93752e = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC2213a() { // from class: io.sentry.android.core.z0
        @Override // io.sentry.android.core.util.a.InterfaceC2213a
        public final Object a(Context context) {
            return a1.e(context);
        }
    });

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f93753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f93754b;

        public a(boolean z15, String str) {
            this.f93753a = z15;
            this.f93754b = str;
        }

        public Map<String, String> a() {
            HashMap map = new HashMap();
            map.put("isSideLoaded", String.valueOf(this.f93753a));
            String str = this.f93754b;
            if (str != null) {
                map.put("installerStore", str);
            }
            return map;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f93755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f93756b;

        public b(boolean z15, String[] strArr) {
            this.f93755a = z15;
            this.f93756b = strArr;
        }

        public String[] a() {
            return this.f93756b;
        }

        public boolean b() {
            return this.f93755a;
        }
    }

    public static /* synthetic */ String a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i15 = applicationInfo.labelRes;
            if (i15 != 0) {
                return context.getString(i15);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo c(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo e(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean f(Context context) {
        if (!context.getPackageName().endsWith(".test")) {
            return false;
        }
        try {
            Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
            while (it.hasNext()) {
                ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
                if (component != null && component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Context g(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @SuppressLint({"NewApi"})
    static ApplicationInfo h(Context context, t0 t0Var) {
        return t0Var.d() >= 33 ? f93751d.a(context) : f93752e.a(context);
    }

    static String i(Context context) {
        return f93750c.a(context);
    }

    static String[] j() {
        return Build.SUPPORTED_ABIS;
    }

    static DisplayMetrics k(Context context, io.sentry.v0 v0Var) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Throwable th4) {
            v0Var.b(b7.ERROR, "Error getting DisplayMetrics.", th4);
            return null;
        }
    }

    static String l(io.sentry.v0 v0Var) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th4) {
            v0Var.b(b7.ERROR, "Error getting device family.", th4);
            return null;
        }
    }

    static String m(io.sentry.v0 v0Var) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } catch (Throwable th4) {
                try {
                    bufferedReader.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e15) {
            v0Var.b(b7.ERROR, "Exception while attempting to read kernel information", e15);
            return property;
        }
    }

    static ActivityManager.MemoryInfo n(Context context, io.sentry.v0 v0Var) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            v0Var.c(b7.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th4) {
            v0Var.b(b7.ERROR, "Error getting MemoryInfo.", th4);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    static PackageInfo o(Context context, int i15, io.sentry.v0 v0Var, t0 t0Var) {
        try {
            return t0Var.d() >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i15)) : context.getPackageManager().getPackageInfo(context.getPackageName(), i15);
        } catch (Throwable th4) {
            v0Var.b(b7.ERROR, "Error getting package info.", th4);
            return null;
        }
    }

    static PackageInfo p(Context context, t0 t0Var) {
        return t0Var.d() >= 33 ? f93748a.a(context) : f93749b.a(context);
    }

    @SuppressLint({"NewApi"})
    static String q(PackageInfo packageInfo, t0 t0Var) {
        return t0Var.d() >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : r(packageInfo);
    }

    private static String r(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    public static boolean s() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    static Intent t(Context context, q7 q7Var, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return u(context, new t0(q7Var.getLogger()), broadcastReceiver, intentFilter, handler);
    }

    @SuppressLint({"NewApi", "UnspecifiedRegisterReceiverFlag"})
    static Intent u(Context context, t0 t0Var, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return t0Var.d() >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 4) : context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }

    static a v(Context context, io.sentry.v0 v0Var, t0 t0Var) {
        String str;
        try {
            PackageInfo packageInfoP = p(context, t0Var);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoP != null && packageManager != null) {
                str = packageInfoP.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new a(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    v0Var.c(b7.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    static b w(Context context, t0 t0Var) {
        Bundle bundle;
        ApplicationInfo applicationInfoH = h(context, t0Var);
        PackageInfo packageInfoP = p(context, t0Var);
        if (packageInfoP == null) {
            return null;
        }
        return new b((applicationInfoH == null || (bundle = applicationInfoH.metaData) == null) ? false : bundle.getBoolean("com.android.vending.splits.required"), packageInfoP.splitNames);
    }

    static void x(PackageInfo packageInfo, t0 t0Var, g1 g1Var, io.sentry.protocol.a aVar) {
        aVar.n(packageInfo.packageName);
        aVar.q(packageInfo.versionName);
        aVar.m(q(packageInfo, t0Var));
        HashMap map = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i15 = 0; i15 < strArr.length; i15++) {
                String str = strArr[i15];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i15] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        aVar.s(map);
        if (g1Var != null) {
            try {
                b bVarM = g1Var.m();
                if (bVarM != null) {
                    aVar.t(Boolean.valueOf(bVarM.b()));
                    if (bVarM.a() != null) {
                        aVar.u(Arrays.asList(bVarM.a()));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
