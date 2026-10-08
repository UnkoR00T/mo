package com.google.android.libraries.places.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class v90 extends f50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f34053a = Logger.getLogger(v90.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final ThreadLocal f34054b = new ThreadLocal();

    v90() {
    }

    @Override // com.google.android.libraries.places.internal.f50
    public final g50 a(g50 g50Var) {
        g50 g50VarC = c();
        f34054b.set(g50Var);
        return g50VarC;
    }

    @Override // com.google.android.libraries.places.internal.f50
    public final void b(g50 g50Var, g50 g50Var2) {
        if (c() != g50Var) {
            f34053a.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (g50Var2 != g50.f32364b) {
            f34054b.set(g50Var2);
        } else {
            f34054b.set(null);
        }
    }

    @Override // com.google.android.libraries.places.internal.f50
    public final g50 c() {
        g50 g50Var = (g50) f34054b.get();
        return g50Var == null ? g50.f32364b : g50Var;
    }
}
