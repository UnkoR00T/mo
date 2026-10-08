package com.google.android.gms.common.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f29053a = new f();

    private f() {
    }

    public static d c() {
        return f29053a;
    }

    @Override // com.google.android.gms.common.util.d
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.d
    public final long b() {
        return SystemClock.elapsedRealtime();
    }
}
