package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public enum b7 implements d2 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    public static final class a implements t1<b7> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b7 a(k3 k3Var, v0 v0Var) {
            return b7.valueOf(k3Var.q2().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.h(name().toLowerCase(Locale.ROOT));
    }
}
