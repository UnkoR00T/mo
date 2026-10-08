package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class k10 extends h10 {
    k10() {
    }

    @Override // com.google.android.libraries.places.internal.h10
    final /* bridge */ /* synthetic */ void a(Object obj, int i15, long j15) {
        ((j10) obj).k(i15 << 3, Long.valueOf(j15));
    }

    @Override // com.google.android.libraries.places.internal.h10
    final /* bridge */ /* synthetic */ void b(Object obj, int i15, int i16) {
        ((j10) obj).k((i15 << 3) | 5, Integer.valueOf(i16));
    }

    @Override // com.google.android.libraries.places.internal.h10
    final /* bridge */ /* synthetic */ void c(Object obj, int i15, long j15) {
        ((j10) obj).k((i15 << 3) | 1, Long.valueOf(j15));
    }

    @Override // com.google.android.libraries.places.internal.h10
    final /* bridge */ /* synthetic */ void d(Object obj, int i15, tx txVar) {
        ((j10) obj).k((i15 << 3) | 2, txVar);
    }

    @Override // com.google.android.libraries.places.internal.h10
    final /* bridge */ /* synthetic */ void e(Object obj, int i15, Object obj2) {
        ((j10) obj).k((i15 << 3) | 3, (j10) obj2);
    }

    @Override // com.google.android.libraries.places.internal.h10
    final /* synthetic */ Object f() {
        return j10.b();
    }

    @Override // com.google.android.libraries.places.internal.h10
    final /* synthetic */ Object g(Object obj) {
        j10 j10Var = (j10) obj;
        j10Var.d();
        return j10Var;
    }

    @Override // com.google.android.libraries.places.internal.h10
    final /* bridge */ /* synthetic */ Object h(Object obj) {
        az azVar = (az) obj;
        j10 j10Var = azVar.zzc;
        if (j10Var != j10.a()) {
            return j10Var;
        }
        j10 j10VarB = j10.b();
        azVar.zzc = j10VarB;
        return j10VarB;
    }

    @Override // com.google.android.libraries.places.internal.h10
    final /* synthetic */ void i(Object obj, Object obj2) {
        ((az) obj).zzc = (j10) obj2;
    }

    @Override // com.google.android.libraries.places.internal.h10
    final void j(Object obj) {
        ((az) obj).zzc.d();
    }
}
