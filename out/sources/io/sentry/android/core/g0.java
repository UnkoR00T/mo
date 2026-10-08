package io.sentry.android.core;

import android.net.TrafficStats;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements io.sentry.i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g0 f93841a = new g0();

    private g0() {
    }

    public static g0 c() {
        return f93841a;
    }

    @Override // io.sentry.i1
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.i1
    public void b() {
        TrafficStats.setThreadStatsTag(61441);
    }
}
