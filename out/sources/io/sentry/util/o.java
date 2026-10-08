package io.sentry.util;

import io.sentry.b7;
import io.sentry.g2;
import io.sentry.j3;
import io.sentry.q7;

/* JADX INFO: loaded from: classes4.dex */
public final class o {
    public static boolean a(q7 q7Var, q7 q7Var2, boolean z15) {
        if (x.c() && (q7Var2.getVersionDetector() instanceof j3)) {
            q7Var2.setVersionDetector(new g2(q7Var2));
        }
        if (!q7Var2.getVersionDetector().a()) {
            return !z15 || q7Var == null || q7Var2.isForceInit() || q7Var.getInitPriority().ordinal() <= q7Var2.getInitPriority().ordinal();
        }
        q7Var2.getLogger().c(b7.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See " + (x.a() ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions") + " for more details.");
    }
}
