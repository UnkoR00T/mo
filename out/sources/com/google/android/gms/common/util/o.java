package com.google.android.gms.common.util;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes3.dex */
final class o {
    static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
