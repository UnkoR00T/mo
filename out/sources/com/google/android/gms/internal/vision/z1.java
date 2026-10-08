package com.google.android.gms.internal.vision;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class z1 extends a2<l2.e> {
    z1() {
    }

    @Override // com.google.android.gms.internal.vision.a2
    final int a(Map.Entry<?, ?> entry) {
        return ((l2.e) entry.getKey()).f31131a;
    }

    @Override // com.google.android.gms.internal.vision.a2
    final e2<l2.e> b(Object obj) {
        return ((l2.c) obj).zzc;
    }

    @Override // com.google.android.gms.internal.vision.a2
    final Object c(y1 y1Var, u3 u3Var, int i15) {
        return y1Var.a(u3Var, i15);
    }

    @Override // com.google.android.gms.internal.vision.a2
    final void d(z5 z5Var, Map.Entry<?, ?> entry) {
        l2.e eVar = (l2.e) entry.getKey();
        if (!eVar.f31133c) {
            switch (c2.f30978a[eVar.f31132b.ordinal()]) {
                case 1:
                    z5Var.q(eVar.f31131a, ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    z5Var.r(eVar.f31131a, ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    z5Var.o(eVar.f31131a, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    z5Var.a(eVar.f31131a, ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    z5Var.l(eVar.f31131a, ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    z5Var.w(eVar.f31131a, ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    z5Var.v(eVar.f31131a, ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    z5Var.z(eVar.f31131a, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    z5Var.x(eVar.f31131a, ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    z5Var.k(eVar.f31131a, ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    z5Var.h(eVar.f31131a, ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    z5Var.s(eVar.f31131a, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    z5Var.H(eVar.f31131a, ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    z5Var.l(eVar.f31131a, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    z5Var.I(eVar.f31131a, (e1) entry.getValue());
                    break;
                case 16:
                    z5Var.C(eVar.f31131a, (String) entry.getValue());
                    break;
                case 17:
                    z5Var.M(eVar.f31131a, entry.getValue(), h4.a().b(entry.getValue().getClass()));
                    break;
                case 18:
                    z5Var.L(eVar.f31131a, entry.getValue(), h4.a().b(entry.getValue().getClass()));
                    break;
            }
        }
        switch (c2.f30978a[eVar.f31132b.ordinal()]) {
            case 1:
                m4.l(eVar.f31131a, (List) entry.getValue(), z5Var, false);
                break;
            case 2:
                m4.y(eVar.f31131a, (List) entry.getValue(), z5Var, false);
                break;
            case 3:
                m4.C(eVar.f31131a, (List) entry.getValue(), z5Var, false);
                break;
            case 4:
                m4.G(eVar.f31131a, (List) entry.getValue(), z5Var, false);
                break;
            case 5:
                m4.T(eVar.f31131a, (List) entry.getValue(), z5Var, false);
                break;
            case 6:
                m4.N(eVar.f31131a, (List) entry.getValue(), z5Var, false);
                break;
            case 7:
                m4.a0(eVar.f31131a, (List) entry.getValue(), z5Var, false);
                break;
            case 8:
                m4.d0(eVar.f31131a, (List) entry.getValue(), z5Var, false);
                break;
            case 9:
                m4.W(eVar.f31131a, (List) entry.getValue(), z5Var, false);
                break;
            case 10:
                m4.b0(eVar.f31131a, (List) entry.getValue(), z5Var, false);
                break;
            case 11:
                m4.Q(eVar.f31131a, (List) entry.getValue(), z5Var, false);
                break;
            case 12:
                m4.Z(eVar.f31131a, (List) entry.getValue(), z5Var, false);
                break;
            case 13:
                m4.K(eVar.f31131a, (List) entry.getValue(), z5Var, false);
                break;
            case 14:
                m4.T(eVar.f31131a, (List) entry.getValue(), z5Var, false);
                break;
            case 15:
                m4.w(eVar.f31131a, (List) entry.getValue(), z5Var);
                break;
            case 16:
                m4.j(eVar.f31131a, (List) entry.getValue(), z5Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    m4.x(eVar.f31131a, (List) entry.getValue(), z5Var, h4.a().b(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    m4.k(eVar.f31131a, (List) entry.getValue(), z5Var, h4.a().b(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.vision.a2
    final boolean e(u3 u3Var) {
        return u3Var instanceof l2.c;
    }

    @Override // com.google.android.gms.internal.vision.a2
    final e2<l2.e> f(Object obj) {
        return ((l2.c) obj).x();
    }

    @Override // com.google.android.gms.internal.vision.a2
    final void g(Object obj) {
        b(obj).i();
    }
}
