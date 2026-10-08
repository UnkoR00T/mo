package yh;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class a {
    static {
        TimeUnit.MINUTES.toMillis(10L);
        SystemClock.elapsedRealtime();
    }

    public static Status a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void b(Status status, Object obj, vh.m mVar) {
        if (status.C()) {
            mVar.c(obj);
        } else {
            mVar.b(jg.b.a(status));
        }
    }
}
