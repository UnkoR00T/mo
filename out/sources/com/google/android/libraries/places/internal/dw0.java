package com.google.android.libraries.places.internal;

import android.os.SystemClock;
import java.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
public final class dw0 {
    static {
        new dw0();
    }

    private dw0() {
        SystemClock.elapsedRealtime();
        Duration.ofMillis(SystemClock.uptimeMillis()).toMillis();
    }

    public static dw0 a() {
        return new dw0();
    }
}
