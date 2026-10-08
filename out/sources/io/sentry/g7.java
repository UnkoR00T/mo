package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public enum g7 implements d2 {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    public static final class a implements t1<g7> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g7 a(k3 k3Var, v0 v0Var) {
            return g7.valueOf(k3Var.q2().toUpperCase(Locale.ROOT));
        }
    }

    g7(int i15) {
        this.severityNumber = i15;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.h(name().toLowerCase(Locale.ROOT));
    }
}
