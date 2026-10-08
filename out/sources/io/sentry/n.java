package io.sentry;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f95208a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q7 f95209b;

    public n(q7 q7Var) {
        this.f95209b = q7Var;
    }

    @Override // io.sentry.e0
    public r6 m(r6 r6Var, j0 j0Var) {
        io.sentry.protocol.q qVarX0;
        String strK;
        Long lJ;
        if (!io.sentry.util.m.h(j0Var, UncaughtExceptionHandlerIntegration.a.class) || (qVarX0 = r6Var.x0()) == null || (strK = qVarX0.k()) == null || (lJ = qVarX0.j()) == null) {
            return r6Var;
        }
        Long l15 = this.f95208a.get(strK);
        if (l15 == null || l15.equals(lJ)) {
            this.f95208a.put(strK, lJ);
            return r6Var;
        }
        this.f95209b.getLogger().c(b7.INFO, "Event %s has been dropped due to multi-threaded deduplication", r6Var.G());
        io.sentry.util.m.n(j0Var, io.sentry.hints.h.MULTITHREADED_DEDUPLICATION);
        return null;
    }
}
