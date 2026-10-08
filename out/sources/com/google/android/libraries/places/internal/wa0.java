package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class wa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nm0 f34142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ig0 f34143b = jg0.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ig0 f34144c = jg0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ig0 f34145d = jg0.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f34146e;

    wa0(nm0 nm0Var) {
        this.f34142a = nm0Var;
    }

    public final void a() {
        this.f34143b.a(1L);
        this.f34146e = this.f34142a.zza();
    }

    public final void b(boolean z15) {
        if (z15) {
            this.f34144c.a(1L);
        } else {
            this.f34145d.a(1L);
        }
    }
}
