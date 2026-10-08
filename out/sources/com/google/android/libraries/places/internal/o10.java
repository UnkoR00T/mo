package com.google.android.libraries.places.internal;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
abstract class o10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Unsafe f33119a;

    o10(Unsafe unsafe) {
        this.f33119a = unsafe;
    }

    public abstract void a(Object obj, long j15, byte b15);

    public abstract boolean b(Object obj, long j15);

    public abstract void c(Object obj, long j15, boolean z15);

    public abstract float d(Object obj, long j15);

    public abstract void e(Object obj, long j15, float f15);

    public abstract double f(Object obj, long j15);

    public abstract void g(Object obj, long j15, double d15);
}
