package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
final class w {
    static void a(Object obj, long j15) {
        LockSupport.parkNanos(obj, Math.min(j15, 2147483647999999999L));
    }
}
