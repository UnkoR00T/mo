package s5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    static int a(boolean z15, int i15) {
        int i16;
        if (!z15) {
            i16 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i15;
            }
            i16 = 33554432;
        }
        return i16 | i15;
    }

    public static PendingIntent b(Context context, int i15, Intent intent, int i16, boolean z15) {
        return PendingIntent.getActivity(context, i15, intent, a(z15, i16));
    }
}
