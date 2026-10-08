package com.google.android.libraries.places.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
abstract class je0 implements gb0 {
    je0() {
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void I() {
        c().I();
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void a(int i15) {
        c().a(i15);
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void b(x40 x40Var) {
        c().b(x40Var);
    }

    protected abstract gb0 c();

    @Override // com.google.android.libraries.places.internal.jm0
    public final void d(InputStream inputStream) {
        c().d(inputStream);
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void e() {
        c().e();
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void h() {
        c().h();
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void m(int i15) {
        c().m(i15);
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void n(n50 n50Var) {
        c().n(n50Var);
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void p(int i15) {
        c().p(i15);
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final boolean q() {
        return c().q();
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void r(ff0 ff0Var) {
        c().r(ff0Var);
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void s(j50 j50Var) {
        c().s(j50Var);
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void t(l90 l90Var) {
        c().t(l90Var);
    }

    public final String toString() {
        return zj.j.c(this).d("delegate", c()).toString();
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public void u(ib0 ib0Var) {
        throw null;
    }
}
