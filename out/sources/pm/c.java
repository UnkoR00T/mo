package pm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final jg.k f160818a = new jg.k("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e15) {
            f160818a.c("CommonUtils", "Exception thrown when trying to get app version ".concat(e15.toString()));
            return "";
        }
    }

    public static String b(Locale locale) {
        if (com.google.android.gms.common.util.j.b()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb5 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb5.append("-");
            sb5.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb5.append("-");
            sb5.append(locale.getVariant());
        }
        return sb5.toString();
    }
}
