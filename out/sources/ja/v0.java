package ja;

import android.os.Build;
import android.util.Log;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lja/v0;", "", "<init>", "()V", "", "level", "", "a", "(I)Z", "", "message", "", "tr", "Loq/i0;", "b", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f101202a = new v0();

    private v0() {
    }

    public final boolean a(int level) {
        return Build.ID != null && Log.isLoggable("Paging", level);
    }

    public final void b(int level, String message, Throwable tr4) {
        if (level == 2 || level == 3) {
            return;
        }
        throw new IllegalArgumentException("debug level " + level + " is requested but Paging only supports default logging for level 2 (VERBOSE) or level 3 (DEBUG)");
    }
}
