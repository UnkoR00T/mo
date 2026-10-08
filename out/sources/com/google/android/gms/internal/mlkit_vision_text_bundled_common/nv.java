package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class nv extends mv {
    nv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.mv
    final void a(Object obj) {
        ((yv) obj).zbb.h();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.mv
    final void b(xy xyVar, Map.Entry entry) {
        zv zvVar = (zv) entry.getKey();
        vy vyVar = vy.f30657c;
        switch (zvVar.f30721b.ordinal()) {
            case 0:
                xyVar.I(32149011, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                xyVar.n(32149011, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                xyVar.C(32149011, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                xyVar.m(32149011, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                xyVar.l(32149011, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                xyVar.c(32149011, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                xyVar.f(32149011, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                xyVar.y(32149011, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                xyVar.t(32149011, (String) entry.getValue());
                break;
            case 9:
                xyVar.d(32149011, entry.getValue(), rx.a().b(entry.getValue().getClass()));
                break;
            case 10:
                xyVar.r(32149011, entry.getValue(), rx.a().b(entry.getValue().getClass()));
                break;
            case 11:
                xyVar.G(32149011, (yu) entry.getValue());
                break;
            case 12:
                xyVar.a(32149011, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                xyVar.l(32149011, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                xyVar.D(32149011, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                xyVar.B(32149011, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                xyVar.x(32149011, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                xyVar.L(32149011, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
