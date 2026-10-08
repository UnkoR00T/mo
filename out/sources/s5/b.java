package s5;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class b extends u5.a {

    static class a {
        static void a(Activity activity, String[] strArr, int i15) {
            activity.requestPermissions(strArr, i15);
        }
    }

    /* JADX INFO: renamed from: s5.b$b, reason: collision with other inner class name */
    public interface InterfaceC4546b {
        void n(int i15);
    }

    public static /* synthetic */ void r(Activity activity) {
        if (activity.isFinishing() || d.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void s(Activity activity) {
        activity.finishAffinity();
    }

    public static void t(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: s5.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.r(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(Activity activity, String[] strArr, int i15) {
        HashSet hashSet = new HashSet();
        for (int i16 = 0; i16 < strArr.length; i16++) {
            if (TextUtils.isEmpty(strArr[i16])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i16], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i16));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i17 = 0;
            for (int i18 = 0; i18 < strArr.length; i18++) {
                if (!hashSet.contains(Integer.valueOf(i18))) {
                    strArr2[i17] = strArr[i18];
                    i17++;
                }
            }
        }
        if (activity instanceof InterfaceC4546b) {
            ((InterfaceC4546b) activity).n(i15);
        }
        a.a(activity, strArr, i15);
    }

    public static void v(Activity activity, Intent intent, int i15, Bundle bundle) {
        activity.startActivityForResult(intent, i15, bundle);
    }

    public static void w(Activity activity, IntentSender intentSender, int i15, Intent intent, int i16, int i17, int i18, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i15, intent, i16, i17, i18, bundle);
    }
}
