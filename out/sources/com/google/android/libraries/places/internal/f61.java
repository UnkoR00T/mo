package com.google.android.libraries.places.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class f61 {
    public static final rj a(Context context, int i15) {
        qj qjVarN = rj.N();
        qjVarN.A(g61.b(context, i15));
        qjVarN.D(g61.f(context, i15));
        boolean z15 = true;
        if (!g61.c(context, i15) && !g61.e(context, i15)) {
            z15 = false;
        }
        qjVarN.F(z15);
        qjVarN.G(g61.d(context, i15));
        qjVarN.H(g61.a(context, i15));
        return (rj) qjVarN.H0();
    }
}
