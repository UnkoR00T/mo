package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
final class ta0 extends le0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vb0 f33768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f33769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile l90 f33770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l90 f33771d;

    ta0(ua0 ua0Var, vb0 vb0Var, String str) {
        Objects.requireNonNull(ua0Var);
        this.f33769b = new AtomicInteger(-2147483647);
        this.f33768a = (vb0) zj.p.r(vb0Var, "delegate");
    }

    @Override // com.google.android.libraries.places.internal.le0
    protected final vb0 b() {
        return this.f33768a;
    }

    @Override // com.google.android.libraries.places.internal.le0, com.google.android.libraries.places.internal.hi0
    public final void c(l90 l90Var) {
        zj.p.r(l90Var, "status");
        synchronized (this) {
            try {
                AtomicInteger atomicInteger = this.f33769b;
                if (atomicInteger.get() < 0) {
                    this.f33770c = l90Var;
                    atomicInteger.addAndGet(Integer.MAX_VALUE);
                } else if (this.f33771d != null) {
                    return;
                }
                if (atomicInteger.get() != 0) {
                    this.f33771d = l90Var;
                } else {
                    super.c(l90Var);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.le0, com.google.android.libraries.places.internal.hi0
    public final void d(l90 l90Var) {
        zj.p.r(l90Var, "status");
        synchronized (this) {
            try {
                AtomicInteger atomicInteger = this.f33769b;
                if (atomicInteger.get() < 0) {
                    this.f33770c = l90Var;
                    atomicInteger.addAndGet(Integer.MAX_VALUE);
                    if (atomicInteger.get() != 0) {
                        return;
                    }
                    super.d(l90Var);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.le0, com.google.android.libraries.places.internal.jb0
    public final gb0 g(f80 f80Var, a80 a80Var, f40 f40Var, s40[] s40VarArr) {
        return this.f33769b.get() >= 0 ? new ee0(this.f33770c, hb0.PROCESSED, s40VarArr) : this.f33768a.g(f80Var, a80Var, f40Var, s40VarArr);
    }
}
