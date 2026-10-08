package io.sentry.util;

import io.sentry.b7;
import io.sentry.q7;
import io.sentry.v0;

/* JADX INFO: loaded from: classes4.dex */
public class s {
    public boolean a(String str, v0 v0Var) {
        return c(str, v0Var) != null;
    }

    public boolean b(String str, q7 q7Var) {
        return a(str, q7Var != null ? q7Var.getLogger() : null);
    }

    public Class<?> c(String str, v0 v0Var) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (v0Var == null) {
                return null;
            }
            v0Var.c(b7.INFO, "Class not available: " + str, new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e15) {
            if (v0Var == null) {
                return null;
            }
            v0Var.b(b7.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e15);
            return null;
        } catch (Throwable th4) {
            if (v0Var == null) {
                return null;
            }
            v0Var.b(b7.ERROR, "Failed to initialize " + str, th4);
            return null;
        }
    }
}
