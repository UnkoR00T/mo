package gg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import io.sentry.android.core.c2;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.r0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f72738a = 12451000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    static final AtomicBoolean f72739b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f72740c = new AtomicBoolean();

    @Deprecated
    public static void a(Context context, int i15) throws f, g {
        int iH = e.f().h(context, i15);
        if (iH != 0) {
            Intent intentB = e.f().b(context, iH, "e");
            StringBuilder sb5 = new StringBuilder(String.valueOf(iH).length() + 46);
            sb5.append("GooglePlayServices not available due to error ");
            sb5.append(iH);
            c2.e("GooglePlayServicesUtil", sb5.toString());
            if (intentB != null) {
                throw new g(iH, "Google Play Services not available", intentB);
            }
            throw new f(iH);
        }
    }

    @Deprecated
    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            c2.g("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static String c(int i15) {
        return a.C(i15);
    }

    public static Context d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x0152 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0154 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Deprecated
    public static int f(Context context, int i15) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(l.f72743a);
        } catch (Throwable unused) {
            c2.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f72740c.get()) {
            int iA = r0.a(context);
            if (iA == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (iA != f72738a) {
                throw new GooglePlayServicesIncorrectManifestValueException(iA);
            }
        }
        boolean z15 = (com.google.android.gms.common.util.g.c(context) || com.google.android.gms.common.util.g.f(context)) ? false : true;
        jg.s.a(i15 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z15) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                c2.g("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            k.a(context);
            if (!k.b(packageInfo2, true)) {
                c2.g("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (!z15) {
                    if (z15) {
                    }
                    if (com.google.android.gms.common.util.n.a(packageInfo2.versionCode) < com.google.android.gms.common.util.n.a(i15)) {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        return 3;
                    }
                    int i16 = packageInfo2.versionCode;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i15).length() + 11 + String.valueOf(i16).length());
                    sb5.append("Google Play services out of date for ");
                    sb5.append(packageName);
                    sb5.append(".  Requires ");
                    sb5.append(i15);
                    sb5.append(" but found ");
                    sb5.append(i16);
                    c2.g("GooglePlayServicesUtil", sb5.toString());
                    return 2;
                }
                jg.s.l(packageInfo);
                if (!k.b(packageInfo, true)) {
                    c2.g("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else {
                    if (z15 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        if (com.google.android.gms.common.util.n.a(packageInfo2.versionCode) < com.google.android.gms.common.util.n.a(i15)) {
                            applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e15) {
                                    c2.k("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e15);
                                    return 1;
                                }
                            }
                            if (applicationInfo.enabled) {
                                return 3;
                            }
                            return 0;
                        }
                        int i17 = packageInfo2.versionCode;
                        StringBuilder sb6 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i15).length() + 11 + String.valueOf(i17).length());
                        sb6.append("Google Play services out of date for ");
                        sb6.append(packageName);
                        sb6.append(".  Requires ");
                        sb6.append(i15);
                        sb6.append(" but found ");
                        sb6.append(i17);
                        c2.g("GooglePlayServicesUtil", sb6.toString());
                        return 2;
                    }
                    c2.g("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            c2.g("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    public static boolean g(Context context, int i15) {
        if (i15 == 18) {
            return true;
        }
        if (i15 == 1) {
            return j(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean h(Context context) {
        Object systemService = context.getSystemService("user");
        jg.s.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean i(int i15) {
        return i15 == 1 || i15 == 2 || i15 == 3 || i15 == 9;
    }

    static boolean j(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, PKIFailureInfo.certRevoked);
            if (zEquals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !h(context);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
    }
}
