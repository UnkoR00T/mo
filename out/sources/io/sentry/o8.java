package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class o8 {
    public static k1 a(io.sentry.util.s sVar, v0 v0Var) {
        Class<?> clsC;
        if (io.sentry.util.x.c() && sVar.a("io.sentry.opentelemetry.OtelSpanFactory", v0Var) && (clsC = sVar.c("io.sentry.opentelemetry.OtelSpanFactory", v0Var)) != null) {
            try {
                Object objNewInstance = clsC.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof k1)) {
                    return (k1) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new r();
    }
}
