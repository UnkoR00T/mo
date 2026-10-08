package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class fj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f70 f32306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b50 f32307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32308c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c50 f32309d = c50.a(b50.IDLE);

    public fj0(f70 f70Var, b50 b50Var) {
        this.f32306a = f70Var;
        this.f32307b = b50Var;
    }

    public final f70 a() {
        return this.f32306a;
    }

    public final b50 b() {
        return this.f32307b;
    }

    public final boolean c() {
        return this.f32308c;
    }

    final /* synthetic */ void d(b50 b50Var) {
        boolean z15;
        this.f32307b = b50Var;
        if (b50Var == b50.READY || b50Var == b50.TRANSIENT_FAILURE) {
            z15 = true;
        } else if (b50Var != b50.IDLE) {
            return;
        } else {
            z15 = false;
        }
        this.f32308c = z15;
    }

    final /* synthetic */ b50 e() {
        return this.f32309d.c();
    }

    final /* synthetic */ f70 f() {
        return this.f32306a;
    }

    final /* synthetic */ b50 g() {
        return this.f32307b;
    }

    final /* synthetic */ c50 h() {
        return this.f32309d;
    }

    final /* synthetic */ void i(c50 c50Var) {
        this.f32309d = c50Var;
    }
}
