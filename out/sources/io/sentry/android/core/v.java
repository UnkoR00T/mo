package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.b7;
import io.sentry.q3;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements io.sentry.z0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.sentry.v0 f94185h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f94178a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f94179b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f94180c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f94181d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f94182e = 1000000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f94183f = 1.0E9d / 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f94184g = new File("/proc/self/stat");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f94186i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Pattern f94187j = Pattern.compile("[\n\t\r ]");

    public v(io.sentry.v0 v0Var) {
        this.f94185h = (io.sentry.v0) io.sentry.util.v.c(v0Var, "Logger is required.");
    }

    private long e() {
        String strC;
        try {
            strC = io.sentry.util.h.c(this.f94184g);
        } catch (IOException e15) {
            this.f94186i = false;
            this.f94185h.b(b7.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e15);
            strC = null;
        }
        if (strC != null) {
            String[] strArrSplit = this.f94187j.split(strC.trim());
            try {
                return (long) ((Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f94183f);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e16) {
                this.f94185h.b(b7.ERROR, "Error parsing /proc/self/stat file.", e16);
            }
        }
        return 0L;
    }

    @Override // io.sentry.z0
    public void c() {
        this.f94186i = true;
        this.f94180c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f94181d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f94183f = 1.0E9d / this.f94180c;
        this.f94179b = e();
    }

    @Override // io.sentry.z0
    public void d(q3 q3Var) {
        if (this.f94186i) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j15 = jElapsedRealtimeNanos - this.f94178a;
            this.f94178a = jElapsedRealtimeNanos;
            long jE = e();
            long j16 = jE - this.f94179b;
            this.f94179b = jE;
            q3Var.e(Double.valueOf(((j16 / j15) / this.f94181d) * 100.0d));
        }
    }
}
