package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.android.core.t0;
import io.sentry.b7;
import io.sentry.v0;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Charset f94011g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f94012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0 f94013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0 f94014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f94015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f94016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runtime f94017f;

    public r(Context context, t0 t0Var, v0 v0Var) {
        this(context, t0Var, v0Var, new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    private boolean a() {
        String strA = this.f94013b.a();
        return strA != null && strA.contains("test-keys");
    }

    private boolean b() {
        for (String str : this.f94015d) {
            try {
                if (new File(str).exists()) {
                    return true;
                }
            } catch (RuntimeException e15) {
                this.f94014c.a(b7.ERROR, e15, "Error when trying to check if root file %s exists.", str);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047 A[PHI: r2
      0x0047: PHI (r2v3 java.lang.Process) = (r2v1 java.lang.Process), (r2v4 java.lang.Process) binds: [B:20:0x0045, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    private boolean c() {
        Process processExec = null;
        try {
            try {
                processExec = this.f94017f.exec(new String[]{"/system/xbin/which", "su"});
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), f94011g));
                try {
                    boolean z15 = bufferedReader.readLine() != null;
                    bufferedReader.close();
                    processExec.destroy();
                    return z15;
                } catch (Throwable th4) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                if (processExec != null) {
                    processExec.destroy();
                }
                throw th6;
            }
        } catch (IOException unused) {
            this.f94014c.c(b7.DEBUG, "SU isn't found on this Device.", new Object[0]);
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        } catch (Throwable th7) {
            this.f94014c.b(b7.DEBUG, "Error when trying to check if SU exists.", th7);
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    private boolean d(v0 v0Var) {
        t0 t0Var = new t0(v0Var);
        PackageManager packageManager = this.f94012a.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f94016e) {
                try {
                    if (t0Var.d() >= 33) {
                        packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                        return true;
                    }
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    public boolean e() {
        return a() || b() || c() || d(this.f94014c);
    }

    r(Context context, t0 t0Var, v0 v0Var, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f94012a = (Context) io.sentry.util.v.c(context, "The application context is required.");
        this.f94013b = (t0) io.sentry.util.v.c(t0Var, "The BuildInfoProvider is required.");
        this.f94014c = (v0) io.sentry.util.v.c(v0Var, "The Logger is required.");
        this.f94015d = (String[]) io.sentry.util.v.c(strArr, "The root Files are required.");
        this.f94016e = (String[]) io.sentry.util.v.c(strArr2, "The root packages are required.");
        this.f94017f = (Runtime) io.sentry.util.v.c(runtime, "The Runtime is required.");
    }
}
