package com.google.android.gms.internal.clearcut;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class t0 extends s0<f1.d> {
    t0() {
    }

    @Override // com.google.android.gms.internal.clearcut.s0
    final int a(Map.Entry<?, ?> entry) {
        return ((f1.d) entry.getKey()).f29318a;
    }

    @Override // com.google.android.gms.internal.clearcut.s0
    final w0<f1.d> b(Object obj) {
        return ((f1.c) obj).zzjv;
    }

    @Override // com.google.android.gms.internal.clearcut.s0
    final void c(p4 p4Var, Map.Entry<?, ?> entry) {
        f1.d dVar = (f1.d) entry.getKey();
        switch (u0.f29550a[dVar.f29319b.ordinal()]) {
            case 1:
                p4Var.q(dVar.f29318a, ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                p4Var.r(dVar.f29318a, ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                p4Var.O(dVar.f29318a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                p4Var.o(dVar.f29318a, ((Long) entry.getValue()).longValue());
                break;
            case 5:
                p4Var.l(dVar.f29318a, ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                p4Var.a(dVar.f29318a, ((Long) entry.getValue()).longValue());
                break;
            case 7:
                p4Var.s(dVar.f29318a, ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                p4Var.k(dVar.f29318a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                p4Var.v(dVar.f29318a, ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                p4Var.S(dVar.f29318a, ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                p4Var.z(dVar.f29318a, ((Long) entry.getValue()).longValue());
                break;
            case 12:
                p4Var.x(dVar.f29318a, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                p4Var.h(dVar.f29318a, ((Long) entry.getValue()).longValue());
                break;
            case 14:
                p4Var.l(dVar.f29318a, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                p4Var.K(dVar.f29318a, (a0) entry.getValue());
                break;
            case 16:
                p4Var.C(dVar.f29318a, (String) entry.getValue());
                break;
            case 17:
                p4Var.M(dVar.f29318a, entry.getValue(), x2.a().b(entry.getValue().getClass()));
                break;
            case 18:
                p4Var.L(dVar.f29318a, entry.getValue(), x2.a().b(entry.getValue().getClass()));
                break;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.s0
    final void d(Object obj, w0<f1.d> w0Var) {
        ((f1.c) obj).zzjv = w0Var;
    }

    @Override // com.google.android.gms.internal.clearcut.s0
    final w0<f1.d> e(Object obj) {
        w0<f1.d> w0VarB = b(obj);
        if (!w0VarB.c()) {
            return w0VarB;
        }
        w0<f1.d> w0Var = (w0) w0VarB.clone();
        d(obj, w0Var);
        return w0Var;
    }

    @Override // com.google.android.gms.internal.clearcut.s0
    final void f(Object obj) {
        b(obj).t();
    }

    @Override // com.google.android.gms.internal.clearcut.s0
    final boolean g(l2 l2Var) {
        return l2Var instanceof f1.c;
    }
}
