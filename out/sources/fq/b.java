package fq;

import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Thread f66142a;

    public static void a() {
        if (!b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    public static boolean b() {
        if (f66142a == null) {
            f66142a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f66142a;
    }
}
