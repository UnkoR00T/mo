package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.c2;
import java.util.concurrent.ExecutionException;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: loaded from: classes4.dex */
public class h0 {
    static void A(String str, Bundle bundle) {
        try {
            vk.e.k();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String strD = d(bundle);
            if (strD != null) {
                bundle2.putString("_nmid", strD);
            }
            String strE = e(bundle);
            if (strE != null) {
                bundle2.putString("_nmn", strE);
            }
            String strI = i(bundle);
            if (!TextUtils.isEmpty(strI)) {
                bundle2.putString(AnnotatedPrivateKey.LABEL, strI);
            }
            String strG = g(bundle);
            if (!TextUtils.isEmpty(strG)) {
                bundle2.putString("message_channel", strG);
            }
            String strR = r(bundle);
            if (strR != null) {
                bundle2.putString("_nt", strR);
            }
            String strL = l(bundle);
            if (strL != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(strL));
                } catch (NumberFormatException e15) {
                    c2.h("FirebaseMessaging", "Error while parsing timestamp in GCM event", e15);
                }
            }
            String strT = t(bundle);
            if (strT != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(strT));
                } catch (NumberFormatException e16) {
                    c2.h("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e16);
                }
            }
            String strN = n(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", strN);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            wk.a aVar = (wk.a) vk.e.k().i(wk.a.class);
            if (aVar != null) {
                aVar.a("fcm", str, bundle2);
            } else {
                c2.g("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            c2.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    private static void B(Bundle bundle) {
        if (bundle != null && "1".equals(bundle.getString("google.c.a.tc"))) {
            wk.a aVar = (wk.a) vk.e.k().i(wk.a.class);
            if (aVar == null) {
                c2.g("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                return;
            }
            String string = bundle.getString("google.c.a.c_id");
            aVar.b("fcm", "_ln", string);
            Bundle bundle2 = new Bundle();
            bundle2.putString("source", "Firebase");
            bundle2.putString("medium", "notification");
            bundle2.putString("campaign", string);
            aVar.a("fcm", "_cmp", bundle2);
        }
    }

    public static boolean C(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return a();
    }

    public static boolean D(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return E(intent.getExtras());
    }

    public static boolean E(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            vk.e.k();
            Context contextJ = vk.e.k().j();
            SharedPreferences sharedPreferences = contextJ.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            PackageManager packageManager = contextJ.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextJ.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
            }
            return false;
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
    }

    static rl.a b(rl.a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        rl.a.C4462a c4462aJ = rl.a.p().n(s(extras)).e(bVar).f(f(extras)).i(o()).l(rl.a.d.ANDROID).h(m(extras)).j(k(extras));
        String strH = h(extras);
        if (strH != null) {
            c4462aJ.g(strH);
        }
        String strR = r(extras);
        if (strR != null) {
            c4462aJ.m(strR);
        }
        String strC = c(extras);
        if (strC != null) {
            c4462aJ.c(strC);
        }
        String strI = i(extras);
        if (strI != null) {
            c4462aJ.b(strI);
        }
        String strE = e(extras);
        if (strE != null) {
            c4462aJ.d(strE);
        }
        long jQ = q(extras);
        if (jQ > 0) {
            c4462aJ.k(jQ);
        }
        return c4462aJ.a();
    }

    static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) vh.o.a(com.google.firebase.installations.c.p(vk.e.k()).getId());
        } catch (InterruptedException | ExecutionException e15) {
            throw new RuntimeException(e15);
        }
    }

    static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    private static int j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    static int k(Bundle bundle) {
        int iP = p(bundle);
        if (iP == 2) {
            return 5;
        }
        return iP == 1 ? 10 : 0;
    }

    static String l(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    static rl.a.c m(Bundle bundle) {
        return (bundle == null || !j0.t(bundle)) ? rl.a.c.DATA_MESSAGE : rl.a.c.DISPLAY_NOTIFICATION;
    }

    static String n(Bundle bundle) {
        return (bundle == null || !j0.t(bundle)) ? "data" : "display";
    }

    static String o() {
        return vk.e.k().j().getPackageName();
    }

    static int p(Bundle bundle) {
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        return j(string);
    }

    static long q(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e15) {
                c2.h("FirebaseMessaging", "error parsing project number", e15);
            }
        }
        vk.e eVarK = vk.e.k();
        String strD = eVarK.m().d();
        if (strD != null) {
            try {
                return Long.parseLong(strD);
            } catch (NumberFormatException e16) {
                c2.h("FirebaseMessaging", "error parsing sender ID", e16);
            }
        }
        String strC = eVarK.m().c();
        if (strC.startsWith("1:")) {
            String[] strArrSplit = strC.split(":");
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e17) {
                c2.h("FirebaseMessaging", "error parsing app ID", e17);
            }
        } else {
            try {
                return Long.parseLong(strC);
            } catch (NumberFormatException e18) {
                c2.h("FirebaseMessaging", "error parsing app ID", e18);
            }
        }
        return 0L;
    }

    static String r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static int s(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            c2.g("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    static String t(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    private static boolean u(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void v(Intent intent) {
        A("_nd", intent.getExtras());
    }

    public static void w(Intent intent) {
        A("_nf", intent.getExtras());
    }

    public static void x(Bundle bundle) {
        B(bundle);
        A("_no", bundle);
    }

    public static void y(Intent intent) {
        if (D(intent)) {
            A("_nr", intent.getExtras());
        }
        if (C(intent)) {
            z(rl.a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.v());
        }
    }

    private static void z(rl.a.b bVar, Intent intent, ye.i iVar) {
        if (iVar == null) {
            c2.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        rl.a aVarB = b(bVar, intent);
        if (aVarB == null) {
            return;
        }
        try {
            iVar.a("FCM_CLIENT_EVENT_LOGGING", rl.b.class, ye.c.b("proto"), new ye.g() { // from class: com.google.firebase.messaging.g0
                @Override // ye.g
                public final Object apply(Object obj) {
                    return ((rl.b) obj).c();
                }
            }).a(ye.d.f(rl.b.b().b(aVarB).a(), ye.f.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e15) {
            c2.h("FirebaseMessaging", "Failed to send big query analytics payload.", e15);
        }
    }
}
