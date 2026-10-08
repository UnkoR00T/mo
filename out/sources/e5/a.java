package e5;

import android.os.Build;
import android.os.Trace;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "tag", "", "value", "Loq/i0;", "a", "(Ljava/lang/String;J)V", "ui-util"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final void a(String str, long j15) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j15);
        }
    }
}
