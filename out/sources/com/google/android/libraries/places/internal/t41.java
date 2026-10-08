package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class t41 {
    public static si a(l41 l41Var, k41 k41Var) {
        return b(l41Var, k41Var == k41.AUTOCOMPLETE_WIDGET ? 2 : 3, k41Var, hi.c.f84783a);
    }

    public static si b(l41 l41Var, int i15, k41 k41Var, hi.c cVar) {
        int i16;
        k41 k41Var2 = k41.PROGRAMMATIC_KOTLIN_API;
        int iOrdinal = l41Var.c().ordinal();
        if (iOrdinal != 0) {
            i16 = 4;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    i16 = 5;
                } else if (iOrdinal != 3) {
                    i16 = iOrdinal != 4 ? 1 : 8;
                } else {
                    i16 = 7;
                }
            }
        } else {
            i16 = 2;
        }
        int i17 = k41Var == k41Var2 ? 2 : 3;
        si siVarI = zi.I();
        e0 e0VarI = j0.I();
        e0VarI.A(l41Var.a());
        e0VarI.D(l41Var.b());
        siVarI.A((j0) e0VarI.H0());
        siVarI.J(i15 == 2);
        siVarI.W(i15);
        siVarI.U(i16);
        siVarI.X(i17);
        siVarI.N("5.2.0");
        siVarI.R(cVar.a());
        String strC = cVar.c();
        if (strC != null) {
            oe oeVarI = pe.I();
            oeVarI.A(strC);
            siVarI.Q(oeVarI);
        }
        return siVarI;
    }
}
