package io.sentry.internal.modules;

import io.sentry.b7;
import io.sentry.v0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ClassLoader f95127e;

    public f(v0 v0Var) {
        this(v0Var, f.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.d
    protected Map<String, String> b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream resourceAsStream = this.f95127e.getResourceAsStream("sentry-external-modules.txt");
            try {
                if (resourceAsStream != null) {
                    Map<String, String> mapC = c(resourceAsStream);
                    resourceAsStream.close();
                    return mapC;
                }
                this.f95123a.c(b7.INFO, "%s file was not found.", "sentry-external-modules.txt");
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                    return treeMap;
                }
                return treeMap;
            } catch (Throwable th4) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (IOException e15) {
            this.f95123a.b(b7.INFO, "Access to resources failed.", e15);
        } catch (SecurityException e16) {
            this.f95123a.b(b7.INFO, "Access to resources denied.", e16);
        }
    }

    f(v0 v0Var, ClassLoader classLoader) {
        super(v0Var);
        this.f95127e = io.sentry.util.b.a(classLoader);
    }
}
