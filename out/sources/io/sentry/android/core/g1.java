package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.b7;
import io.sentry.q7;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile g1 f93842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final io.sentry.util.a f93843j = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f93844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f93845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f93846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f93847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a1.a f93848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a1.b f93849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.protocol.l f93850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f93851h;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f93852a;

        static {
            int[] iArr = new int[io.sentry.p0.a.values().length];
            f93852a = iArr;
            try {
                iArr[io.sentry.p0.a.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93852a[io.sentry.p0.a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g1(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.f93844a = context;
        this.f93845b = sentryAndroidOptions;
        t0 t0Var = new t0(sentryAndroidOptions.getLogger());
        this.f93846c = t0Var;
        io.sentry.android.core.internal.util.k.a().c();
        this.f93850g = u();
        this.f93847d = t0Var.f();
        this.f93848e = a1.v(context, sentryAndroidOptions.getLogger(), t0Var);
        this.f93849f = a1.w(context, t0Var);
        ActivityManager.MemoryInfo memoryInfoN = a1.n(context, sentryAndroidOptions.getLogger());
        if (memoryInfoN != null) {
            this.f93851h = Long.valueOf(memoryInfoN.totalMem);
        } else {
            this.f93851h = null;
        }
    }

    private Intent b() {
        return a1.u(this.f93844a, this.f93846c, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null);
    }

    public static Float c(Intent intent, q7 q7Var) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th4) {
            q7Var.getLogger().b(b7.ERROR, "Error getting device battery level.", th4);
            return null;
        }
    }

    private Float d(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th4) {
            this.f93845b.getLogger().b(b7.ERROR, "Error getting battery temperature.", th4);
            return null;
        }
    }

    private Date e() {
        try {
            return io.sentry.m.e(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e15) {
            this.f93845b.getLogger().a(b7.ERROR, e15, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    private String f() {
        try {
            return l1.a(this.f93844a);
        } catch (Throwable th4) {
            this.f93845b.getLogger().b(b7.ERROR, "Error getting installationId.", th4);
            return null;
        }
    }

    private File g(File file) {
        File[] externalFilesDirs = this.f93844a.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : externalFilesDirs) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.f93845b.getLogger().c(b7.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    private StatFs h(File file) {
        try {
            File fileG = g(file);
            if (fileG != null) {
                return new StatFs(fileG.getPath());
            }
            return null;
        } catch (Throwable unused) {
            this.f93845b.getLogger().c(b7.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
    }

    public static g1 i(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f93842i == null) {
            io.sentry.g1 g1VarA = f93843j.a();
            try {
                if (f93842i == null) {
                    f93842i = new g1(a1.g(context), sentryAndroidOptions);
                }
                if (g1VarA != null) {
                    g1VarA.close();
                }
            } catch (Throwable th4) {
                if (g1VarA != null) {
                    try {
                        g1VarA.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
        return f93842i;
    }

    private io.sentry.protocol.e.b k() {
        io.sentry.protocol.e.b bVarA;
        Throwable th4;
        try {
            bVarA = io.sentry.android.core.internal.util.m.a(this.f93844a.getResources().getConfiguration().orientation);
            if (bVarA != null) {
                return bVarA;
            }
            try {
                this.f93845b.getLogger().c(b7.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                return null;
            } catch (Throwable th5) {
                th4 = th5;
                this.f93845b.getLogger().b(b7.ERROR, "Error getting device orientation.", th4);
                return bVarA;
            }
        } catch (Throwable th6) {
            bVarA = null;
            th4 = th6;
        }
    }

    private TimeZone n() {
        if (this.f93846c.d() >= 24) {
            LocaleList locales = this.f93844a.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    private Long o(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th4) {
            this.f93845b.getLogger().b(b7.ERROR, "Error getting total external storage amount.", th4);
            return null;
        }
    }

    private Long p(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th4) {
            this.f93845b.getLogger().b(b7.ERROR, "Error getting total internal storage amount.", th4);
            return null;
        }
    }

    private Long r(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th4) {
            this.f93845b.getLogger().b(b7.ERROR, "Error getting unused external storage amount.", th4);
            return null;
        }
    }

    private Long s(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th4) {
            this.f93845b.getLogger().b(b7.ERROR, "Error getting unused internal storage amount.", th4);
            return null;
        }
    }

    public static Boolean t(Intent intent, q7 q7Var) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z15 = true;
            if (intExtra != 1 && intExtra != 2) {
                z15 = false;
            }
            return Boolean.valueOf(z15);
        } catch (Throwable th4) {
            q7Var.getLogger().b(b7.ERROR, "Error getting device charging state.", th4);
            return null;
        }
    }

    private io.sentry.protocol.l u() {
        io.sentry.protocol.l lVar = new io.sentry.protocol.l();
        lVar.j("Android");
        lVar.m(Build.VERSION.RELEASE);
        lVar.h(Build.DISPLAY);
        String strM = a1.m(this.f93845b.getLogger());
        if (strM != null) {
            lVar.i(strM);
        }
        if (this.f93845b.isEnableRootCheck()) {
            lVar.k(Boolean.valueOf(new io.sentry.android.core.internal.util.r(this.f93844a, this.f93846c, this.f93845b.getLogger()).e()));
        }
        return lVar;
    }

    private void v(io.sentry.protocol.e eVar, boolean z15) {
        Boolean bool;
        Intent intentB = b();
        if (intentB != null) {
            eVar.M(c(intentB, this.f93845b));
            eVar.Q(t(intentB, this.f93845b));
            eVar.N(d(intentB));
        }
        int i15 = a.f93852a[this.f93845b.getConnectionStatusProvider().w1().ordinal()];
        if (i15 != 1) {
            bool = i15 != 2 ? null : Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        eVar.f0(bool);
        ActivityManager.MemoryInfo memoryInfoN = a1.n(this.f93844a, this.f93845b.getLogger());
        if (memoryInfoN != null && z15) {
            eVar.W(Long.valueOf(memoryInfoN.availMem));
            eVar.a0(Boolean.valueOf(memoryInfoN.lowMemory));
        }
        File externalFilesDir = this.f93844a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            eVar.o0(p(statFs));
            eVar.X(s(statFs));
        }
        StatFs statFsH = h(externalFilesDir);
        if (statFsH != null) {
            eVar.U(o(statFsH));
            eVar.T(r(statFsH));
        }
        if (eVar.I() == null) {
            eVar.S(this.f93845b.getConnectionStatusProvider().J0());
        }
    }

    @SuppressLint({"NewApi"})
    public io.sentry.protocol.e a(boolean z15, boolean z16) {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        eVar.b0(Build.MANUFACTURER);
        eVar.P(Build.BRAND);
        eVar.V(a1.l(this.f93845b.getLogger()));
        eVar.d0(Build.MODEL);
        eVar.e0(Build.ID);
        eVar.L(a1.j());
        if (this.f93846c.d() >= 31) {
            eVar.R(Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL);
        }
        eVar.g0(k());
        Boolean bool = this.f93847d;
        if (bool != null) {
            eVar.n0(bool);
        }
        DisplayMetrics displayMetricsK = a1.k(this.f93844a, this.f93845b.getLogger());
        if (displayMetricsK != null) {
            eVar.m0(Integer.valueOf(displayMetricsK.widthPixels));
            eVar.l0(Integer.valueOf(displayMetricsK.heightPixels));
            eVar.j0(Float.valueOf(displayMetricsK.density));
            eVar.k0(Integer.valueOf(displayMetricsK.densityDpi));
        }
        eVar.O(e());
        eVar.p0(n());
        if (eVar.J() == null) {
            eVar.Y(f());
        }
        Locale locale = Locale.getDefault();
        if (eVar.K() == null) {
            eVar.Z(locale.toString());
        }
        List<Integer> listC = io.sentry.android.core.internal.util.k.a().c();
        if (!listC.isEmpty()) {
            eVar.i0(Double.valueOf(((Integer) Collections.max(listC)).doubleValue()));
            eVar.h0(Integer.valueOf(listC.size()));
        }
        eVar.c0(this.f93851h);
        if (z15 && this.f93845b.isCollectAdditionalContext()) {
            v(eVar, z16);
        }
        return eVar;
    }

    public io.sentry.protocol.l j() {
        return this.f93850g;
    }

    public a1.a l() {
        return this.f93848e;
    }

    public a1.b m() {
        return this.f93849f;
    }

    public Long q() {
        return this.f93851h;
    }
}
