package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class y2 extends x2 {
    y2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.x2
    final void a(Object obj) {
        ((i3) obj).zzb.g();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.x2
    final void b(o6 o6Var, Map.Entry entry) {
        j3 j3Var = (j3) entry.getKey();
        m6 m6Var = m6.f29766b;
        switch (j3Var.f29741b.ordinal()) {
            case 0:
                o6Var.F(j3Var.f29740a, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                o6Var.c0(j3Var.f29740a, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                o6Var.Q(j3Var.f29740a, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                o6Var.h0(j3Var.f29740a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                o6Var.S(j3Var.f29740a, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                o6Var.f0(j3Var.f29740a, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                o6Var.I(j3Var.f29740a, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                o6Var.k(j3Var.f29740a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                o6Var.O(j3Var.f29740a, (String) entry.getValue());
                break;
            case 9:
                o6Var.b0(j3Var.f29740a, entry.getValue(), z4.a().b(entry.getValue().getClass()));
                break;
            case 10:
                o6Var.P(j3Var.f29740a, entry.getValue(), z4.a().b(entry.getValue().getClass()));
                break;
            case 11:
                o6Var.T(j3Var.f29740a, (j2) entry.getValue());
                break;
            case 12:
                o6Var.Z(j3Var.f29740a, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                o6Var.S(j3Var.f29740a, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                o6Var.V(j3Var.f29740a, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                o6Var.a0(j3Var.f29740a, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                o6Var.X(j3Var.f29740a, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                o6Var.U(j3Var.f29740a, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
