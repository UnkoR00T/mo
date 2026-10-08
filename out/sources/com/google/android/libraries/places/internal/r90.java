package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class r90 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s90 f33500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f33501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ u90 f33502c;

    r90(u90 u90Var, s90 s90Var, Runnable runnable) {
        this.f33500a = s90Var;
        this.f33501b = runnable;
        Objects.requireNonNull(u90Var);
        this.f33502c = u90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u90 u90Var = this.f33502c;
        u90Var.c(this.f33500a);
        u90Var.a();
    }

    public final String toString() {
        return String.valueOf(this.f33501b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
