package ie;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import io.sentry.android.core.c2;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f91939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f91940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final File f91941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile t f91942h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f91944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f91945c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f91946d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f91943a = 20000;

    static {
        int i15 = Build.VERSION.SDK_INT;
        f91939e = i15 < 29;
        f91940f = i15 >= 28;
        f91941g = new File("/proc/self/fd");
    }

    t() {
    }

    private boolean a() {
        return f91939e && !this.f91946d.get();
    }

    public static t b() {
        if (f91942h == null) {
            synchronized (t.class) {
                try {
                    if (f91942h == null) {
                        f91942h = new t();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return f91942h;
    }

    private int c() {
        if (e()) {
            return 500;
        }
        return this.f91943a;
    }

    private synchronized boolean d() {
        try {
            boolean z15 = true;
            int i15 = this.f91944b + 1;
            this.f91944b = i15;
            if (i15 >= 50) {
                this.f91944b = 0;
                int length = f91941g.list().length;
                long jC = c();
                if (length >= jC) {
                    z15 = false;
                }
                this.f91945c = z15;
                if (!z15 && Log.isLoggable("Downsampler", 5)) {
                    c2.g("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jC);
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f91945c;
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i15, int i16, boolean z15, boolean z16) {
        return z15 && f91940f && !a() && !z16 && i15 >= 0 && i16 >= 0 && d();
    }

    @TargetApi(26)
    boolean g(int i15, int i16, BitmapFactory.Options options, boolean z15, boolean z16) {
        boolean zF = f(i15, i16, z15, z16);
        if (zF) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zF;
    }

    public void h() {
        ve.l.a();
        this.f91946d.set(true);
    }
}
