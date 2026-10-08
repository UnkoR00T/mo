package io.sentry.config;

import io.sentry.b7;
import io.sentry.v0;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f94813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0 f94814c;

    public b(String str, ClassLoader classLoader, v0 v0Var) {
        this.f94812a = str;
        this.f94813b = io.sentry.util.b.a(classLoader);
        this.f94814c = v0Var;
    }

    public Properties a() {
        try {
            InputStream resourceAsStream = this.f94813b.getResourceAsStream(this.f94812a);
            if (resourceAsStream == null) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } catch (Throwable th4) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } catch (IOException e15) {
            this.f94814c.a(b7.ERROR, e15, "Failed to load Sentry configuration from classpath resource: %s", this.f94812a);
            return null;
        }
    }

    public b(v0 v0Var) {
        this("sentry.properties", b.class.getClassLoader(), v0Var);
    }
}
