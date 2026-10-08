package com.google.android.libraries.places.internal;

import android.net.Uri;
import java.time.Duration;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class g01 {
    g01() {
    }

    public static final ii.u0 a(jw jwVar) {
        ArrayList arrayList = new ArrayList();
        for (iw iwVar : jwVar.I()) {
            hy hyVarI = iwVar.I();
            arrayList.add(ii.z.c(Duration.ofSeconds(hyVarI.I(), hyVarI.J()), iwVar.J()));
        }
        ii.u0.a aVarA = ii.u0.a(arrayList);
        String strJ = jwVar.J();
        if (!strJ.isEmpty()) {
            aVarA.d(Uri.parse(strJ));
        }
        return aVarA.b();
    }
}
