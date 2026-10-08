package com.google.android.gms.internal.oss_licenses;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class j3 extends f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Unsafe f30800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f30801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f30802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long f30803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final long f30804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f30805f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(m3.f30836a);
            }
            try {
                f30802c = unsafe.objectFieldOffset(l3.class.getDeclaredField("c"));
                f30801b = unsafe.objectFieldOffset(l3.class.getDeclaredField("b"));
                f30803d = unsafe.objectFieldOffset(l3.class.getDeclaredField("a"));
                f30804e = unsafe.objectFieldOffset(k3.class.getDeclaredField("a"));
                f30805f = unsafe.objectFieldOffset(k3.class.getDeclaredField("b"));
                f30800a = unsafe;
            } catch (NoSuchFieldException e15) {
                throw new RuntimeException(e15);
            }
        } catch (PrivilegedActionException e16) {
            throw new RuntimeException("Could not initialize intrinsics", e16.getCause());
        }
    }

    /* synthetic */ j3(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final void a(k3 k3Var, Thread thread) {
        f30800a.putObject(k3Var, f30804e, thread);
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final void b(k3 k3Var, k3 k3Var2) {
        f30800a.putObject(k3Var, f30805f, k3Var2);
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final boolean c(l3 l3Var, k3 k3Var, k3 k3Var2) {
        return i3.a(f30800a, l3Var, f30802c, k3Var, k3Var2);
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final k3 d(l3 l3Var, k3 k3Var) {
        k3 k3Var2;
        do {
            k3Var2 = l3Var.f30823c;
            if (k3Var == k3Var2) {
                break;
            }
        } while (!c(l3Var, k3Var2, k3Var));
        return k3Var2;
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final d3 e(l3 l3Var, d3 d3Var) {
        d3 d3Var2;
        while (true) {
            d3Var2 = l3Var.f30822b;
            if (d3Var == d3Var2) {
                break;
            }
            l3 l3Var2 = l3Var;
            d3 d3Var3 = d3Var;
            if (i3.a(f30800a, l3Var2, f30801b, d3Var2, d3Var3)) {
                break;
            }
            l3Var = l3Var2;
            d3Var = d3Var3;
        }
        return d3Var2;
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final boolean f(l3 l3Var, Object obj, Object obj2) {
        return i3.a(f30800a, l3Var, f30803d, obj, obj2);
    }
}
