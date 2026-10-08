package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class oh0 extends g40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f33181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g40 f33183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ uh0 f33184d;

    /* synthetic */ oh0(uh0 uh0Var, String str, byte[] bArr) {
        Objects.requireNonNull(uh0Var);
        this.f33184d = uh0Var;
        this.f33181a = new AtomicReference(uh0.f33906i0);
        this.f33183c = new fh0(this);
        this.f33182b = (String) zj.p.r(str, "authority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final l40 k(f80 f80Var, f40 f40Var) {
        g60 g60Var = (g60) this.f33181a.get();
        if (g60Var == null) {
            return this.f33183c.b(f80Var, f40Var);
        }
        if (!(g60Var instanceof ei0)) {
            return new wg0(g60Var, this.f33183c, this.f33184d.s0(), f80Var, f40Var);
        }
        di0 di0VarE = ((ei0) g60Var).f32211b.e(f80Var);
        if (di0VarE != null) {
            f40Var = f40Var.h(di0.f32039g, di0VarE);
        }
        return this.f33183c.b(f80Var, f40Var);
    }

    @Override // com.google.android.libraries.places.internal.g40
    public final l40 b(f80 f80Var, f40 f40Var) {
        AtomicReference atomicReference = this.f33181a;
        if (atomicReference.get() != uh0.f33906i0) {
            return k(f80Var, f40Var);
        }
        uh0 uh0Var = this.f33184d;
        ih0 ih0Var = new ih0(this);
        u90 u90Var = uh0Var.f33925n;
        u90Var.c(ih0Var);
        u90Var.a();
        if (atomicReference.get() != uh0.f33906i0) {
            return k(f80Var, f40Var);
        }
        if (uh0Var.w().get()) {
            return new jh0(this);
        }
        nh0 nh0Var = new nh0(this, g50.a(), f80Var, f40Var);
        u90Var.c(new kh0(this, nh0Var));
        u90Var.a();
        return nh0Var;
    }

    @Override // com.google.android.libraries.places.internal.g40
    public final String h() {
        return this.f33182b;
    }

    final void i(g60 g60Var) {
        AtomicReference atomicReference = this.f33181a;
        g60 g60Var2 = (g60) atomicReference.get();
        atomicReference.set(g60Var);
        if (g60Var2 == uh0.f33906i0) {
            uh0 uh0Var = this.f33184d;
            if (uh0Var.r() != null) {
                Iterator it = uh0Var.r().iterator();
                while (it.hasNext()) {
                    ((nh0) it.next()).r();
                }
            }
        }
    }

    final void j() {
        if (this.f33181a.get() == uh0.f33906i0) {
            i(null);
        }
    }

    final /* synthetic */ AtomicReference l() {
        return this.f33181a;
    }

    final /* synthetic */ String m() {
        return this.f33182b;
    }
}
