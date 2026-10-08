package com.google.android.gms.internal.oss_licenses;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
final class z3 implements y3 {
    /* synthetic */ z3(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.oss_licenses.y3
    public final ScheduledExecutorService a(int i15, b4 b4Var) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(Integer.MAX_VALUE));
    }
}
