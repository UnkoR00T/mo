package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public interface w4 {
    static /* synthetic */ void b(v0 v0Var, String str, v vVar, File file) {
        b7 b7Var = b7.DEBUG;
        v0Var.c(b7Var, "Started processing cached files from %s", str);
        vVar.d(file);
        v0Var.c(b7Var, "Finished processing cached files from %s", str);
    }

    default t4 a(final v vVar, final String str, final v0 v0Var) {
        final File file = new File(str);
        return new t4() { // from class: io.sentry.v4
            @Override // io.sentry.t4
            public final void a() {
                w4.b(v0Var, str, vVar, file);
            }
        };
    }

    t4 c(c1 c1Var, q7 q7Var);

    default boolean d(String str, v0 v0Var) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        v0Var.c(b7.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }
}
