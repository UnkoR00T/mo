package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes4.dex */
public final class y80 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f34353d = Logger.getLogger(y80.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static y80 f34354e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f34356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ak.p0 f34357c;

    public y80() {
        new v80(this, null);
        this.f34355a = "unknown";
        this.f34356b = new LinkedHashSet();
        this.f34357c = ak.p0.m();
    }

    public static synchronized y80 c() {
        try {
            if (f34354e == null) {
                u80.class.getClassLoader();
                List<u80> listA = h90.a(u80.class, Collections.singletonList(be0.class.getDeclaredConstructor(null).newInstance(null)).iterator(), x80.f34239a, new w80(null));
                if (listA.isEmpty()) {
                    f34353d.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f34354e = new y80();
                for (u80 u80Var : listA) {
                    f34353d.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(u80Var)));
                    f34354e.f(u80Var);
                }
                f34354e.g();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f34354e;
    }

    static List e() {
        ArrayList arrayList = new ArrayList();
        try {
            int i15 = be0.f31794b;
            arrayList.add(be0.class);
        } catch (ClassNotFoundException e15) {
            f34353d.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e15);
        }
        try {
            arrayList.add(Class.forName("io.grpc.binder.internal.IntentNameResolverProvider"));
        } catch (ClassNotFoundException e16) {
            f34353d.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find IntentNameResolverProvider", (Throwable) e16);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final synchronized void f(u80 u80Var) {
        u80Var.d();
        zj.p.e(true, "isAvailable() returned false");
        this.f34356b.add(u80Var);
    }

    private final synchronized void g() {
        try {
            HashMap map = new HashMap();
            String strC = "unknown";
            byte b15 = HPKE.mode_base;
            for (u80 u80Var : this.f34356b) {
                String strC2 = u80Var.c();
                if (((u80) map.get(strC2)) != null) {
                    u80Var.e();
                } else {
                    map.put(strC2, u80Var);
                }
                u80Var.e();
                if (b15 < 5) {
                    u80Var.e();
                    strC = u80Var.c();
                }
                b15 = 5;
            }
            this.f34357c = ak.p0.d(map);
            this.f34355a = strC;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized String a() {
        return this.f34355a;
    }

    public final u80 b(String str) {
        if (str == null) {
            return null;
        }
        return (u80) d().get(str.toLowerCase(Locale.US));
    }

    final synchronized Map d() {
        return this.f34357c;
    }
}
