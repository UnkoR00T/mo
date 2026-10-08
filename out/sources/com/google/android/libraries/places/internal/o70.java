package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class o70 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f33159c = Logger.getLogger(o70.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static o70 f33160d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f33161a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f33162b = new LinkedHashMap();

    public static synchronized o70 a() {
        try {
            if (f33160d == null) {
                k70.class.getClassLoader();
                List<k70> listA = h90.a(k70.class, Collections.singletonList(nj0.class.getDeclaredConstructor(null).newInstance(null)).iterator(), m70.f32924a, new l70());
                f33160d = new o70();
                for (k70 k70Var : listA) {
                    f33159c.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(k70Var)));
                    f33160d.d(k70Var);
                }
                f33160d.e();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f33160d;
    }

    static List c() {
        ArrayList arrayList = new ArrayList();
        try {
            boolean z15 = nj0.f33066b;
            arrayList.add(nj0.class);
        } catch (ClassNotFoundException e15) {
            f33159c.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e15);
        }
        try {
            int i15 = cr0.f31926b;
            arrayList.add(cr0.class);
        } catch (ClassNotFoundException e16) {
            f33159c.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e16);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final synchronized void d(k70 k70Var) {
        k70Var.b();
        zj.p.e(true, "isAvailable() returned false");
        this.f33161a.add(k70Var);
    }

    private final synchronized void e() {
        try {
            LinkedHashMap linkedHashMap = this.f33162b;
            linkedHashMap.clear();
            for (k70 k70Var : this.f33161a) {
                String strD = k70Var.d();
                if (((k70) linkedHashMap.get(strD)) != null) {
                    k70Var.c();
                } else {
                    linkedHashMap.put(strD, k70Var);
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized k70 b(String str) {
        return (k70) this.f33162b.get(zj.p.r(str, "policy"));
    }
}
