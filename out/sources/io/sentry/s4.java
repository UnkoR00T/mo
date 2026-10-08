package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class s4 {
    public static d1 a(io.sentry.util.s sVar, v0 v0Var) {
        d1 d1VarB = b(sVar, v0Var);
        d1VarB.init();
        return d1VarB;
    }

    private static d1 b(io.sentry.util.s sVar, v0 v0Var) {
        Class<?> clsC;
        if (io.sentry.util.x.c() && sVar.a("io.sentry.opentelemetry.OtelContextScopesStorage", v0Var) && (clsC = sVar.c("io.sentry.opentelemetry.OtelContextScopesStorage", v0Var)) != null) {
            try {
                Object objNewInstance = clsC.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof d1)) {
                    return (d1) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new q();
    }
}
