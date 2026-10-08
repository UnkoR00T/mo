package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class to extends s50 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f33801b;

    public to(l40 l40Var) {
        super(l40Var);
        this.f33801b = new AtomicReference(so.b(1));
    }

    @Override // com.google.android.libraries.places.internal.t50, com.google.android.libraries.places.internal.l40
    public final void a(j40 j40Var, a80 a80Var) {
        AtomicReference atomicReference;
        so soVar;
        do {
            atomicReference = this.f33801b;
            soVar = (so) atomicReference.get();
        } while (!androidx.camera.view.i.a(atomicReference, soVar, soVar.d() == 1 ? so.b(2) : soVar));
        if (soVar.d() == 1) {
            f().a(j40Var, a80Var);
        } else if (soVar.d() == 4) {
            j40Var.c(soVar.a(), new a80());
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already started");
            f().e("start() called more than once", illegalStateException);
            throw illegalStateException;
        }
    }

    @Override // com.google.android.libraries.places.internal.t50, com.google.android.libraries.places.internal.l40
    public final void b(Object obj) {
        zj.p.r(obj, "Message must be non-null");
        int iD = ((so) this.f33801b.get()).d();
        if (iD == 2) {
            f().b(obj);
        } else if (iD != 5) {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }

    @Override // com.google.android.libraries.places.internal.z80, com.google.android.libraries.places.internal.l40
    public final void c(int i15) {
        so soVar = (so) this.f33801b.get();
        if (soVar.d() == 1 || soVar.d() == 4) {
            throw new IllegalStateException("Not started");
        }
        zj.p.e(true, "Number requested must be non-negative");
        f().c(i15);
    }

    @Override // com.google.android.libraries.places.internal.z80, com.google.android.libraries.places.internal.l40
    public final void d() {
        AtomicReference atomicReference;
        so soVar;
        do {
            atomicReference = this.f33801b;
            soVar = (so) atomicReference.get();
            if (soVar.d() != 2) {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!androidx.camera.view.i.a(atomicReference, soVar, so.b(3)));
        f().d();
    }

    @Override // com.google.android.libraries.places.internal.z80, com.google.android.libraries.places.internal.l40
    public final void e(String str, Throwable th4) {
        AtomicReference atomicReference;
        so soVar;
        so soVarC;
        l90 l90VarD = l90.f32808f;
        if (str != null) {
            l90VarD = l90VarD.e(str);
        }
        if (th4 != null) {
            l90VarD = l90VarD.d(th4);
        }
        do {
            atomicReference = this.f33801b;
            soVar = (so) atomicReference.get();
            if (soVar.d() == 4) {
                soVarC = soVar;
            } else {
                soVarC = soVar.d() == 1 ? so.c(4, l90VarD) : so.c(5, l90VarD);
            }
        } while (!androidx.camera.view.i.a(atomicReference, soVar, soVarC));
        f().e(str, th4);
    }
}
