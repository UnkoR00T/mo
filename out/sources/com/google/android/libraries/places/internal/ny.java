package com.google.android.libraries.places.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class ny extends my {
    ny() {
    }

    @Override // com.google.android.libraries.places.internal.my
    final qy a(Object obj) {
        xy xyVar = (xy) obj;
        qy qyVar = xyVar.zzb;
        if (qyVar.f33464b) {
            xyVar.zzb = qyVar.clone();
        }
        return xyVar.zzb;
    }

    @Override // com.google.android.libraries.places.internal.my
    final void b(Object obj) {
        ((xy) obj).zzb.b();
    }

    @Override // com.google.android.libraries.places.internal.my
    final void c(w10 w10Var, Map.Entry entry) {
        yy yyVar = (yy) entry.getKey();
        u10 u10Var = u10.f33827c;
        switch (yyVar.f34446b.ordinal()) {
            case 0:
                w10Var.F(525004180, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                w10Var.h(525004180, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                w10Var.a(525004180, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                w10Var.n(525004180, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                w10Var.K(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                w10Var.z(525004180, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                w10Var.I(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                w10Var.A(525004180, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                w10Var.e(525004180, (String) entry.getValue());
                break;
            case 9:
                w10Var.l(525004180, entry.getValue(), r00.a().b(entry.getValue().getClass()));
                break;
            case 10:
                w10Var.j(525004180, entry.getValue(), r00.a().b(entry.getValue().getClass()));
                break;
            case 11:
                w10Var.d(525004180, (tx) entry.getValue());
                break;
            case 12:
                w10Var.r(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                w10Var.K(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                w10Var.i(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                w10Var.w(525004180, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                w10Var.u(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                w10Var.c(525004180, ((Long) entry.getValue()).longValue());
                break;
        }
    }

    @Override // com.google.android.libraries.places.internal.my
    final void d(u00 u00Var, Object obj, ly lyVar, qy qyVar) {
        zy zyVar = (zy) obj;
        qyVar.f(zyVar.f34576b, u00Var.g(zyVar.f34575a.getClass(), lyVar));
    }
}
