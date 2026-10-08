package gg;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f72733a = i.f72738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f72734b = new e();

    e() {
    }

    public static e f() {
        return f72734b;
    }

    public int a(Context context) {
        return i.b(context);
    }

    public Intent b(Context context, int i15, String str) {
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && com.google.android.gms.common.util.g.c(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("gcore_");
        sb5.append(f72733a);
        sb5.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb5.append(str);
        }
        sb5.append("-");
        if (context != null) {
            sb5.append(context.getPackageName());
        }
        sb5.append("-");
        if (context != null) {
            try {
                sb5.append(qg.d.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb5.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(PKIFailureInfo.signerNotTrusted);
        return intent3;
    }

    public PendingIntent c(Context context, int i15, int i16) {
        return d(context, i15, i16, null);
    }

    public PendingIntent d(Context context, int i15, int i16, String str) {
        Intent intentB = b(context, i15, str);
        if (intentB == null) {
            return null;
        }
        return s5.r.b(context, i16, intentB, 134217728, false);
    }

    public String e(int i15) {
        return i.c(i15);
    }

    public int g(Context context) {
        return h(context, f72733a);
    }

    public int h(Context context, int i15) {
        int iF = i.f(context, i15);
        if (i.g(context, iF)) {
            return 18;
        }
        return iF;
    }

    public boolean i(Context context, String str) {
        return i.j(context, str);
    }

    public boolean j(int i15) {
        return i.i(i15);
    }

    public void k(Context context, int i15) throws f, g {
        i.a(context, i15);
    }
}
