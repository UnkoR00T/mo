package com.google.android.libraries.places.internal;

import android.os.Trace;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes4.dex */
final class m81 {
    static void a(n81 n81Var) {
        c(n81Var);
        Trace.beginSection(n81Var.c());
        String strD = n81Var.d();
        f71 f71Var = y71.f34350b;
        if (strD.length() > 127) {
            strD = strD.substring(0, CertificateBody.profileType);
        }
        Trace.beginSection(strD);
    }

    static void b(n81 n81Var) {
        c(n81Var);
        Trace.endSection();
        Trace.endSection();
    }

    private static boolean c(n81 n81Var) {
        return n81Var.zza() != Thread.currentThread();
    }
}
