package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ko extends j40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j40 f32752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f32753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ oo f32754c;

    ko(oo ooVar, j40 j40Var) {
        Objects.requireNonNull(ooVar);
        this.f32754c = ooVar;
        this.f32753b = false;
        this.f32752a = j40Var;
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void a(final a80 a80Var) {
        this.f32754c.t().execute(new Runnable() { // from class: com.google.android.libraries.places.internal.io
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f32583a.e(a80Var);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void b(final Object obj) {
        this.f32754c.t().execute(new Runnable() { // from class: com.google.android.libraries.places.internal.fo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f32317a.f(obj);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void c(final l90 l90Var, final a80 a80Var) {
        this.f32754c.t().execute(new Runnable() { // from class: com.google.android.libraries.places.internal.go
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f32404a.g(l90Var, a80Var);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void d() {
        this.f32754c.t().execute(new Runnable() { // from class: com.google.android.libraries.places.internal.ho
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f32504a.h();
            }
        });
    }

    final /* synthetic */ void e(a80 a80Var) {
        if (this.f32753b) {
            return;
        }
        this.f32752a.a(a80Var);
    }

    final /* synthetic */ void f(Object obj) {
        if (this.f32753b) {
            return;
        }
        this.f32752a.b(obj);
    }

    final /* synthetic */ void g(l90 l90Var, a80 a80Var) {
        if (this.f32753b) {
            return;
        }
        try {
            this.f32752a.c(l90Var, a80Var);
        } finally {
            this.f32753b = true;
            this.f32754c.v().a();
        }
    }

    final /* synthetic */ void h() {
        if (this.f32753b) {
            return;
        }
        this.f32752a.d();
    }
}
