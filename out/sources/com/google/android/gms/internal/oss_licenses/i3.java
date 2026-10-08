package com.google.android.gms.internal.oss_licenses;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i3 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j15, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j15, obj2, obj3)) {
            if (unsafe.getObject(obj, j15) != obj2) {
                return false;
            }
        }
        return true;
    }
}
