package io.sentry;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public final class z6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile z6 f95994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final io.sentry.util.a f95995d = new io.sentry.util.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile Boolean f95996e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final io.sentry.util.a f95997f = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f95998a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<io.sentry.protocol.w> f95999b = new CopyOnWriteArraySet();

    private z6() {
    }

    public static z6 d() {
        if (f95994c == null) {
            g1 g1VarA = f95995d.a();
            try {
                if (f95994c == null) {
                    f95994c = new z6();
                }
                if (g1VarA != null) {
                    g1VarA.close();
                }
            } catch (Throwable th4) {
                if (g1VarA != null) {
                    try {
                        g1VarA.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
        return f95994c;
    }

    public void a(String str) {
        io.sentry.util.v.c(str, "integration is required.");
        this.f95998a.add(str);
    }

    public void b(String str, String str2) {
        io.sentry.util.v.c(str, "name is required.");
        io.sentry.util.v.c(str2, "version is required.");
        this.f95999b.add(new io.sentry.protocol.w(str, str2));
        g1 g1VarA = f95997f.a();
        try {
            f95996e = null;
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public boolean c(v0 v0Var) {
        Boolean bool = f95996e;
        if (bool != null) {
            return bool.booleanValue();
        }
        g1 g1VarA = f95997f.a();
        try {
            boolean z15 = false;
            for (io.sentry.protocol.w wVar : this.f95999b) {
                if (wVar.a().startsWith("maven:io.sentry:") && !"8.22.0".equalsIgnoreCase(wVar.b())) {
                    v0Var.c(b7.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", wVar.a(), "8.22.0", wVar.b());
                    z15 = true;
                }
            }
            if (z15) {
                b7 b7Var = b7.ERROR;
                v0Var.c(b7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                v0Var.c(b7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                v0Var.c(b7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                v0Var.c(b7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            f95996e = Boolean.valueOf(z15);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return z15;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public Set<String> e() {
        return this.f95998a;
    }

    public Set<io.sentry.protocol.w> f() {
        return this.f95999b;
    }
}
