package com.google.android.gms.internal.oss_licenses;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
final class g3 extends f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<k3, Thread> f30783a = AtomicReferenceFieldUpdater.newUpdater(k3.class, Thread.class, "a");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<k3, k3> f30784b = AtomicReferenceFieldUpdater.newUpdater(k3.class, k3.class, "b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<? super l3<?>, k3> f30785c = AtomicReferenceFieldUpdater.newUpdater(l3.class, k3.class, "c");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<? super l3<?>, d3> f30786d = AtomicReferenceFieldUpdater.newUpdater(l3.class, d3.class, "b");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<? super l3<?>, Object> f30787e = AtomicReferenceFieldUpdater.newUpdater(l3.class, Object.class, "a");

    /* synthetic */ g3(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final void a(k3 k3Var, Thread thread) {
        f30783a.lazySet(k3Var, thread);
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final void b(k3 k3Var, k3 k3Var2) {
        f30784b.lazySet(k3Var, k3Var2);
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final boolean c(l3 l3Var, k3 k3Var, k3 k3Var2) {
        return androidx.concurrent.futures.b.a(f30785c, l3Var, k3Var, k3Var2);
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final k3 d(l3 l3Var, k3 k3Var) {
        return f30785c.getAndSet(l3Var, k3Var);
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final d3 e(l3 l3Var, d3 d3Var) {
        return f30786d.getAndSet(l3Var, d3Var);
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final boolean f(l3 l3Var, Object obj, Object obj2) {
        return androidx.concurrent.futures.b.a(f30787e, l3Var, obj, obj2);
    }
}
