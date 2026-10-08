package com.google.android.libraries.places.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class oq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f33233a = Logger.getLogger(oq0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final e40 f33234b;

    static {
        if (!zj.v.b(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        f33234b = e40.a("internal-stub-type");
    }

    private oq0() {
    }

    public static com.google.common.util.concurrent.q a(l40 l40Var, Object obj) {
        kq0 kq0Var = new kq0(l40Var);
        c(l40Var, obj, new nq0(kq0Var));
        return kq0Var;
    }

    private static RuntimeException b(l40 l40Var, Throwable th4) {
        try {
            l40Var.e(null, th4);
        } catch (Error | RuntimeException e15) {
            f33233a.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e15);
        }
        if (th4 instanceof RuntimeException) {
            throw ((RuntimeException) th4);
        }
        if (th4 instanceof Error) {
            throw ((Error) th4);
        }
        throw new AssertionError(th4);
    }

    private static void c(l40 l40Var, Object obj, lq0 lq0Var) {
        l40Var.a(lq0Var, new a80());
        lq0Var.e();
        try {
            l40Var.b(obj);
            l40Var.d();
        } catch (Error | RuntimeException e15) {
            throw b(l40Var, e15);
        }
    }
}
