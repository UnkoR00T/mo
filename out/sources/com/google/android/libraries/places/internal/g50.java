package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class g50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Logger f32363a = Logger.getLogger(g50.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g50 f32364b = new g50();

    private g50() {
    }

    public static g50 a() {
        g50 g50VarC = e50.f32158a.c();
        return g50VarC == null ? f32364b : g50VarC;
    }

    static Object e(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public final g50 b() {
        g50 g50VarA = e50.f32158a.a(this);
        return g50VarA == null ? f32364b : g50VarA;
    }

    public final void c(g50 g50Var) {
        e(g50Var, "toAttach");
        e50.f32158a.b(this, g50Var);
    }

    public final void d(d50 d50Var, Executor executor) {
        e(executor, "executor");
    }
}
