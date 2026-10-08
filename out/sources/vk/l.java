package vk;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    public static l a(long j15, long j16, long j17) {
        return new a(j15, j16, j17);
    }

    public static l e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
