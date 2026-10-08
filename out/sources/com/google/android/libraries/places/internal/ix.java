package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ix implements p00 {
    static {
        ly lyVar = ly.f32886b;
        int i15 = kx.f32765a;
    }

    @Override // com.google.android.libraries.places.internal.p00
    public final /* bridge */ /* synthetic */ Object b(xx xxVar, ly lyVar) throws lz {
        g10 g10Var;
        g00 g00Var = (g00) a(xxVar, lyVar);
        if (g00Var == null || g00Var.m()) {
            return g00Var;
        }
        if (g00Var instanceof fx) {
            g10Var = new g10((fx) g00Var);
        } else {
            if (g00Var instanceof hx) {
                throw null;
            }
            g10Var = new g10(g00Var);
        }
        throw g10Var.a();
    }
}
