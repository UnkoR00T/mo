package io.sentry.util;

import io.sentry.b7;
import io.sentry.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class t {
    public static void a(Class<?> cls, Object obj, v0 v0Var) {
        v0Var.c(b7.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }
}
