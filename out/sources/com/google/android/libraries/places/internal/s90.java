package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class s90 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f33655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f33656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f33657c;

    s90(Runnable runnable) {
        this.f33655a = (Runnable) zj.p.r(runnable, "task");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f33656b) {
            return;
        }
        this.f33657c = true;
        this.f33655a.run();
    }
}
