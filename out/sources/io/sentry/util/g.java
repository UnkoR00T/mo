package io.sentry.util;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public static Throwable a(Throwable th4) {
        v.c(th4, "throwable cannot be null");
        while (th4.getCause() != null && th4.getCause() != th4) {
            th4 = th4.getCause();
        }
        return th4;
    }

    public static boolean b(Set<Class<? extends Throwable>> set, Throwable th4) {
        return set.contains(th4.getClass());
    }
}
