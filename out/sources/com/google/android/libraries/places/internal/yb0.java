package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
abstract class yb0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g50 f34387a;

    protected yb0(g50 g50Var) {
        this.f34387a = g50Var;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        g50 g50VarB = this.f34387a.b();
        try {
            a();
        } finally {
            this.f34387a.c(g50VarB);
        }
    }
}
