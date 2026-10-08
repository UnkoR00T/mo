package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class bp extends j40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j40 f31810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v81 f31811b = v81.a();

    public bp(j40 j40Var) {
        this.f31810a = j40Var;
    }

    private final void h(Runnable runnable) {
        zj.p.q(x81.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        if (y71.e()) {
            runnable.run();
        } else {
            v81.b(this.f31811b, runnable).run();
        }
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void a(final a80 a80Var) {
        h(new Runnable() { // from class: com.google.android.libraries.places.internal.ap
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f31702a.e(a80Var);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void b(final Object obj) {
        h(new Runnable() { // from class: com.google.android.libraries.places.internal.yo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f34421a.f(obj);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void c(final l90 l90Var, final a80 a80Var) {
        h(new Runnable() { // from class: com.google.android.libraries.places.internal.zo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f34524a.g(l90Var, a80Var);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void d() {
        final j40 j40Var = this.f31810a;
        Objects.requireNonNull(j40Var);
        h(new Runnable() { // from class: com.google.android.libraries.places.internal.xo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                j40Var.d();
            }
        });
    }

    final /* synthetic */ void e(a80 a80Var) {
        this.f31810a.a(a80Var);
    }

    final /* synthetic */ void f(Object obj) {
        this.f31810a.b(obj);
    }

    final /* synthetic */ void g(l90 l90Var, a80 a80Var) {
        this.f31810a.c(l90Var, a80Var);
    }
}
