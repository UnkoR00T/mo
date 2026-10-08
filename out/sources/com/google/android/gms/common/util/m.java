package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import io.sentry.android.core.c2;
import java.lang.reflect.Method;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f29064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f29065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f29066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f29067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f29068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Method f29069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Method f29070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Method f29071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Method f29072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Boolean f29073j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Class cls = Integer.TYPE;
        f29064a = Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f29065b = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f29066c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f29067d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
            method4 = null;
        }
        f29068e = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
            method5 = null;
        }
        f29069f = method5;
        if (j.e()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e15) {
                c2.h("WorkSourceUtil", "Missing WorkChain API createWorkChain", e15);
                method6 = null;
            }
        } else {
            method6 = null;
        }
        f29070g = method6;
        if (j.e()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e16) {
                c2.h("WorkSourceUtil", "Missing WorkChain class", e16);
                method7 = null;
            }
        } else {
            method7 = null;
        }
        f29071h = method7;
        if (j.e()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
                method8 = null;
            }
        } else {
            method8 = null;
        }
        f29072i = method8;
        f29073j = null;
    }

    public static void a(WorkSource workSource, int i15, String str) {
        Method method = f29066c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i15), str);
                return;
            } catch (Exception e15) {
                c2.k("WorkSourceUtil", "Unable to assign blame through WorkSource", e15);
                return;
            }
        }
        Method method2 = f29065b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i15));
            } catch (Exception e16) {
                c2.k("WorkSourceUtil", "Unable to assign blame through WorkSource", e16);
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoC = qg.d.a(context).c(str, 0);
                if (applicationInfoC == null) {
                    c2.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i15 = applicationInfoC.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i15, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                c2.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static synchronized boolean c(Context context) {
        Boolean bool = f29073j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z15 = u5.a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f29073j = Boolean.valueOf(z15);
        return z15;
    }

    public static boolean d(WorkSource workSource) {
        Method method = f29072i;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                s.l(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e15) {
                c2.f("WorkSourceUtil", "Unable to check WorkSource emptiness", e15);
            }
        }
        return e(workSource) == 0;
    }

    public static int e(WorkSource workSource) {
        Method method = f29067d;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, null);
            s.l(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e15) {
            c2.k("WorkSourceUtil", "Unable to assign blame through WorkSource", e15);
            return 0;
        }
    }
}
