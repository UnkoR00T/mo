package com.google.android.gms.internal.oss_licenses;

import android.os.Trace;

/* JADX INFO: loaded from: classes3.dex */
final class w {
    static void a(y yVar) {
        c(yVar);
        Trace.beginSection(yVar.a());
        Trace.beginSection(j.b(yVar.c()));
    }

    static void b(y yVar) {
        c(yVar);
        Trace.endSection();
        Trace.endSection();
    }

    private static boolean c(y yVar) {
        return yVar.zza() != Thread.currentThread();
    }
}
