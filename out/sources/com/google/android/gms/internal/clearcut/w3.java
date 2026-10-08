package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class w3 extends u3<v3, v3> {
    w3() {
    }

    private static void m(Object obj, v3 v3Var) {
        ((f1) obj).zzjp = v3Var;
    }

    @Override // com.google.android.gms.internal.clearcut.u3
    final /* synthetic */ void a(v3 v3Var, int i15, long j15) {
        v3Var.e(i15 << 3, Long.valueOf(j15));
    }

    @Override // com.google.android.gms.internal.clearcut.u3
    final /* synthetic */ void b(v3 v3Var, int i15, a0 a0Var) {
        v3Var.e((i15 << 3) | 2, a0Var);
    }

    @Override // com.google.android.gms.internal.clearcut.u3
    final /* synthetic */ void c(v3 v3Var, p4 p4Var) {
        v3Var.g(p4Var);
    }

    @Override // com.google.android.gms.internal.clearcut.u3
    final void d(Object obj) {
        ((f1) obj).zzjp.k();
    }

    @Override // com.google.android.gms.internal.clearcut.u3
    final /* synthetic */ void e(v3 v3Var, p4 p4Var) {
        v3Var.b(p4Var);
    }

    @Override // com.google.android.gms.internal.clearcut.u3
    final /* synthetic */ v3 f() {
        return v3.i();
    }

    @Override // com.google.android.gms.internal.clearcut.u3
    final /* synthetic */ void g(Object obj, v3 v3Var) {
        m(obj, v3Var);
    }

    @Override // com.google.android.gms.internal.clearcut.u3
    final /* synthetic */ void h(Object obj, v3 v3Var) {
        m(obj, v3Var);
    }

    @Override // com.google.android.gms.internal.clearcut.u3
    final /* synthetic */ v3 i(v3 v3Var, v3 v3Var2) {
        v3 v3Var3 = v3Var;
        v3 v3Var4 = v3Var2;
        return v3Var4.equals(v3.h()) ? v3Var3 : v3.a(v3Var3, v3Var4);
    }

    @Override // com.google.android.gms.internal.clearcut.u3
    final /* synthetic */ int j(v3 v3Var) {
        return v3Var.d();
    }

    @Override // com.google.android.gms.internal.clearcut.u3
    final /* synthetic */ v3 k(Object obj) {
        return ((f1) obj).zzjp;
    }

    @Override // com.google.android.gms.internal.clearcut.u3
    final /* synthetic */ int l(v3 v3Var) {
        return v3Var.j();
    }
}
