package com.google.android.libraries.places.internal;

import java.util.IdentityHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class cm0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ dm0 f31912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ em0 f31913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f31914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ fm0 f31915d;

    cm0(fm0 fm0Var, dm0 dm0Var, em0 em0Var, Object obj) {
        this.f31912a = dm0Var;
        this.f31913b = em0Var;
        this.f31914c = obj;
        Objects.requireNonNull(fm0Var);
        this.f31915d = fm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fm0 fm0Var = this.f31915d;
        synchronized (fm0Var) {
            try {
                if (this.f31912a.f32061b == 0) {
                    IdentityHashMap identityHashMapE = fm0Var.e();
                    em0 em0Var = this.f31913b;
                    identityHashMapE.remove(em0Var);
                    if (fm0Var.e().isEmpty()) {
                        fm0Var.f().shutdown();
                        fm0Var.g(null);
                    }
                    em0Var.b(this.f31914c);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
