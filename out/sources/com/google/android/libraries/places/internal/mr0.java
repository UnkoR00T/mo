package com.google.android.libraries.places.internal;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public class mr0 extends gs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ReentrantLock f32990a;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f32990a = reentrantLock;
        reentrantLock.newCondition();
        TimeUnit.MILLISECONDS.toNanos(TimeUnit.SECONDS.toMillis(60L));
    }

    public static final boolean b() {
        ReentrantLock reentrantLock = f32990a;
        reentrantLock.lock();
        reentrantLock.unlock();
        return false;
    }
}
