package com.google.android.gms.common.util;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes3.dex */
public final class p {
    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (j.h()) {
            StrictMode.setVmPolicy(o.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
