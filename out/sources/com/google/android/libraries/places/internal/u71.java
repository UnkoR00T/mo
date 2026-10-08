package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class u71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final WeakHashMap f33861a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f33862b = new WeakHashMap();

    public static void a(Throwable th4) {
        Throwable cause;
        w81 w81Var;
        n81 n81Var;
        WeakHashMap weakHashMap = f33862b;
        synchronized (weakHashMap) {
            cause = th4;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            weakHashMap.put(th4, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        zj.p.x(true, "Trace uncaught exception is disabled.");
        WeakHashMap weakHashMap2 = f33861a;
        synchronized (weakHashMap2) {
            Throwable cause2 = th4;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            if (cause2 == null) {
                w81Var = null;
            } else {
                r81 r81Var = (r81) weakHashMap2.get(cause2);
                weakHashMap2.put(th4, r81Var);
                w81Var = new w81(cause2, r81Var);
            }
        }
        if (w81Var != null || (n81Var = y71.d().f32805b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (n81Var = y71.d().f32805b; n81Var != null; n81Var = null) {
            arrayList.add(n81Var);
        }
        p71 p71Var = new p71();
        p71Var.c(((n81) arrayList.get(0)).a());
        ((n81) arrayList.get(0)).o();
        p71Var.d(-1L);
        ak.n0.a aVarT = ak.n0.t(arrayList.size());
        ak.n0.a aVarT2 = ak.n0.t(arrayList.size());
        for (n81 n81Var2 : ak.a1.j(arrayList)) {
            aVarT2.a(n81Var2.d());
            aVarT.a(n81Var2.i());
        }
        WeakHashMap weakHashMap3 = f33861a;
        synchronized (weakHashMap3) {
            p71Var.a(aVarT2.k());
            p71Var.b(aVarT.k());
            weakHashMap3.put(th4, p71Var.e());
        }
    }
}
