package jg;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import io.sentry.android.core.c2;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r0.l1 f102439a = new r0.l1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Locale f102440b;

    public static String a(Context context, int i15) {
        Resources resources = context.getResources();
        switch (i15) {
            case 1:
                return resources.getString(dg.b.f41429f);
            case 2:
                return resources.getString(dg.b.f41435l);
            case 3:
                return resources.getString(dg.b.f41426c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                c2.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                c2.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                c2.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                c2.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                c2.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                c2.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 22);
                sb5.append("Unexpected error code ");
                sb5.append(i15);
                c2.e("GoogleApiAvailability", sb5.toString());
                return null;
            case 16:
                c2.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                c2.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                c2.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String b(Context context, int i15) {
        String strH = i15 == 6 ? h(context, "common_google_play_services_resolution_required_title") : a(context, i15);
        return strH == null ? context.getResources().getString(dg.b.f41431h) : strH;
    }

    public static String c(Context context, int i15) {
        Resources resources = context.getResources();
        String strF = f(context);
        if (i15 == 1) {
            return resources.getString(dg.b.f41428e, strF);
        }
        if (i15 == 2) {
            return com.google.android.gms.common.util.g.c(context) ? resources.getString(dg.b.f41437n) : resources.getString(dg.b.f41434k, strF);
        }
        if (i15 == 3) {
            return resources.getString(dg.b.f41425b, strF);
        }
        if (i15 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strF);
        }
        if (i15 == 7) {
            return g(context, "common_google_play_services_network_error_text", strF);
        }
        if (i15 == 9) {
            return resources.getString(dg.b.f41432i, strF);
        }
        if (i15 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strF);
        }
        switch (i15) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strF);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", strF);
            case 18:
                return resources.getString(dg.b.f41436m, strF);
            default:
                return resources.getString(gg.l.f72743a, strF);
        }
    }

    public static String d(Context context, int i15) {
        return (i15 == 6 || i15 == 19) ? g(context, "common_google_play_services_resolution_required_text", f(context)) : c(context, i15);
    }

    public static String e(Context context, int i15) {
        Resources resources = context.getResources();
        if (i15 == 1) {
            return resources.getString(dg.b.f41427d);
        }
        if (i15 != 2) {
            return i15 != 3 ? resources.getString(R.string.ok) : resources.getString(dg.b.f41424a);
        }
        return resources.getString(dg.b.f41433j);
    }

    public static String f(Context context) {
        String packageName = context.getPackageName();
        try {
            return qg.d.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    private static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(gg.l.f72743a);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }

    private static String h(Context context, String str) {
        r0.l1 l1Var = f102439a;
        synchronized (l1Var) {
            try {
                Locale localeC = e6.e.a(context.getResources().getConfiguration()).c(0);
                if (!localeC.equals(f102440b)) {
                    l1Var.clear();
                    f102440b = localeC;
                }
                String str2 = (String) l1Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesE = gg.h.e(context);
                if (resourcesE == null) {
                    return null;
                }
                int identifier = resourcesE.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    StringBuilder sb5 = new StringBuilder(str.length() + 18);
                    sb5.append("Missing resource: ");
                    sb5.append(str);
                    c2.g("GoogleApiAvailability", sb5.toString());
                    return null;
                }
                String string = resourcesE.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    l1Var.put(str, string);
                    return string;
                }
                StringBuilder sb6 = new StringBuilder(str.length() + 20);
                sb6.append("Got empty resource: ");
                sb6.append(str);
                c2.g("GoogleApiAvailability", sb6.toString());
                return null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
