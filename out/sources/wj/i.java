package wj;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.c2;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f213723a;

    public i(String str) {
        this.f213723a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    private static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e15) {
                c2.f("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e15);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return c2.e("PlayCore", e(this.f213723a, "Play Store app is either not installed or not the official version", objArr));
        }
        return 0;
    }

    public final int b(Throwable th4, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return c2.f("PlayCore", e(this.f213723a, str, objArr), th4);
        }
        return 0;
    }

    public final int c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", e(this.f213723a, str, objArr));
        }
        return 0;
    }

    public final int d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return c2.g("PlayCore", e(this.f213723a, str, objArr));
        }
        return 0;
    }
}
