package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class t81 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ fr.p0 f33762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ n81 f33763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Runnable f33764c;

    t81(fr.p0 p0Var, n81 n81Var, Runnable runnable) {
        this.f33762a = p0Var;
        this.f33763b = n81Var;
        this.f33764c = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        if (((y81) this.f33762a.f66410a) != null) {
            throw null;
        }
        n81 n81Var = this.f33763b;
        Runnable runnable = this.f33764c;
        l81 l81VarD = y71.d();
        n81 n81VarC = y71.c(l81VarD, n81Var);
        try {
            runnable.run();
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
        Runnable runnable = this.f33764c;
        StringBuilder sb5 = new StringBuilder(runnable.toString().length() + 14);
        sb5.append("propagating=[");
        sb5.append(runnable);
        sb5.append("]");
        return sb5.toString();
    }
}
