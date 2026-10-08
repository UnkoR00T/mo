package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class s81 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ o81 f33653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f33654b;

    s81(o81 o81Var, Runnable runnable) {
        this.f33653a = o81Var;
        this.f33654b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n81 n81Var = (n81) this.f33653a;
        l81 l81VarD = y71.d();
        n81 n81VarC = y71.c(l81VarD, n81Var);
        try {
            this.f33654b.run();
            oq.i0 i0Var = oq.i0.f148189a;
            y71.c(l81VarD, n81VarC);
        } catch (Throwable th4) {
            try {
                u71.a(th4);
                throw th4;
            } catch (Throwable th5) {
                y71.c(l81VarD, n81VarC);
                throw th5;
            }
        }
    }

    public final String toString() {
        Runnable runnable = this.f33654b;
        StringBuilder sb5 = new StringBuilder(runnable.toString().length() + 14);
        sb5.append("propagating=[");
        sb5.append(runnable);
        sb5.append("]");
        return sb5.toString();
    }
}
