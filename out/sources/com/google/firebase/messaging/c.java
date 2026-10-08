package com.google.firebase.messaging;

import android.R;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import io.sentry.android.core.c2;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f36492a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s5.l.e f36493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f36494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36495c;

        a(s5.l.e eVar, String str, int i15) {
            this.f36493a = eVar;
            this.f36494b = str;
            this.f36495c = i15;
        }
    }

    private static PendingIntent a(Context context, j0 j0Var, String str, PackageManager packageManager) {
        Intent intentF = f(str, j0Var, packageManager);
        if (intentF == null) {
            return null;
        }
        intentF.addFlags(67108864);
        intentF.putExtras(j0Var.y());
        if (q(j0Var)) {
            intentF.putExtra("gcm.n.analytics_data", j0Var.x());
        }
        return PendingIntent.getActivity(context, g(), intentF, l(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, j0 j0Var) {
        if (q(j0Var)) {
            return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(j0Var.x()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, j0 j0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        s5.l.e eVar = new s5.l.e(context2, str);
        String strN = j0Var.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strN)) {
            eVar.j(strN);
        }
        String strN2 = j0Var.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strN2)) {
            eVar.i(strN2);
            eVar.v(new s5.l.c().h(strN2));
        }
        eVar.t(m(packageManager, resources, packageName, j0Var.p("gcm.n.icon"), bundle));
        Uri uriN = n(packageName, j0Var, resources);
        if (uriN != null) {
            eVar.u(uriN);
        }
        eVar.h(a(context, j0Var, packageName, packageManager));
        PendingIntent pendingIntentB = b(context, context2, j0Var);
        if (pendingIntentB != null) {
            eVar.l(pendingIntentB);
        }
        Integer numH = h(context2, j0Var.p("gcm.n.color"), bundle);
        if (numH != null) {
            eVar.g(numH.intValue());
        }
        eVar.e(!j0Var.a("gcm.n.sticky"));
        eVar.p(j0Var.a("gcm.n.local_only"));
        String strP = j0Var.p("gcm.n.ticker");
        if (strP != null) {
            eVar.w(strP);
        }
        Integer numM = j0Var.m();
        if (numM != null) {
            eVar.r(numM.intValue());
        }
        Integer numR = j0Var.r();
        if (numR != null) {
            eVar.y(numR.intValue());
        }
        Integer numL = j0Var.l();
        if (numL != null) {
            eVar.q(numL.intValue());
        }
        Long lJ = j0Var.j("gcm.n.event_time");
        if (lJ != null) {
            eVar.s(true);
            eVar.z(lJ.longValue());
        }
        long[] jArrQ = j0Var.q();
        if (jArrQ != null) {
            eVar.x(jArrQ);
        }
        int[] iArrE = j0Var.e();
        if (iArrE != null) {
            eVar.o(iArrE[0], iArrE[1], iArrE[2]);
        }
        eVar.k(i(j0Var));
        return new a(eVar, o(j0Var), 0);
    }

    static a e(Context context, j0 j0Var) {
        Bundle bundleJ = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, j0Var, k(context, j0Var.k(), bundleJ), bundleJ);
    }

    private static Intent f(String str, j0 j0Var, PackageManager packageManager) {
        String strP = j0Var.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(strP)) {
            Intent intent = new Intent(strP);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriF = j0Var.f();
        if (uriF != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriF);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            c2.g("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int g() {
        return f36492a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                c2.g("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i15 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i15 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(u5.a.d(context, i15));
        } catch (Resources.NotFoundException unused2) {
            c2.g("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int i(j0 j0Var) {
        boolean zA = j0Var.a("gcm.n.default_sound");
        ?? r15 = zA;
        if (j0Var.a("gcm.n.default_vibrate_timings")) {
            r15 = (zA ? 1 : 0) | 2;
        }
        return j0Var.a("gcm.n.default_light_settings") ? r15 | 4 : r15;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e15) {
            c2.g("FirebaseMessaging", "Couldn't get own application info: " + e15);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public static String k(Context context, String str, Bundle bundle) {
        String string;
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                c2.g("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                c2.g("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                c2.g("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    c2.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i15) {
        return i15 | 67108864;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            c2.g("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i15 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i15 == 0 || !p(resources, i15)) {
            try {
                i15 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e15) {
                c2.g("FirebaseMessaging", "Couldn't get own application info: " + e15);
            }
        }
        return (i15 == 0 || !p(resources, i15)) ? R.drawable.sym_def_app_icon : i15;
    }

    private static Uri n(String str, j0 j0Var, Resources resources) {
        String strO = j0Var.o();
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        if ("default".equals(strO) || resources.getIdentifier(strO, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + strO);
    }

    private static String o(j0 j0Var) {
        String strP = j0Var.p("gcm.n.tag");
        if (!TextUtils.isEmpty(strP)) {
            return strP;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    private static boolean p(Resources resources, int i15) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i15, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            c2.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i15);
            return false;
        } catch (Resources.NotFoundException unused) {
            c2.e("FirebaseMessaging", "Couldn't find resource " + i15 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(j0 j0Var) {
        return j0Var.a("google.c.a.e");
    }
}
