package io.sentry.internal;

import io.sentry.g1;
import io.sentry.z6;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f95099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final io.sentry.util.a f95100e = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f95101a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2236a f95102b = new C2236a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.util.a f95103c = new io.sentry.util.a();

    /* JADX INFO: renamed from: io.sentry.internal.a$a, reason: collision with other inner class name */
    public static final class C2236a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile String f95104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile String f95105b;
    }

    private a() {
    }

    public static a a() {
        if (f95099d == null) {
            g1 g1VarA = f95100e.a();
            try {
                if (f95099d == null) {
                    f95099d = new a();
                }
                if (g1VarA != null) {
                    g1VarA.close();
                }
            } catch (Throwable th4) {
                if (g1VarA != null) {
                    try {
                        g1VarA.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
        return f95099d;
    }

    public void b() {
        if (this.f95101a) {
            return;
        }
        try {
            g1 g1VarA = this.f95103c.a();
            try {
                if (this.f95101a) {
                    if (g1VarA != null) {
                        g1VarA.close();
                    }
                    this.f95101a = true;
                    return;
                }
                Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                while (resources.hasMoreElements()) {
                    try {
                        Attributes mainAttributes = new Manifest(resources.nextElement().openStream()).getMainAttributes();
                        if (mainAttributes != null) {
                            String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                            String value2 = mainAttributes.getValue("Implementation-Version");
                            String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                            String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                            if (value != null && value2 != null) {
                                this.f95102b.f95104a = value;
                                this.f95102b.f95105b = value2;
                                String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                if (value5 != null) {
                                    z6.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                    z6.d().a("OpenTelemetry");
                                }
                                String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                if (value6 != null) {
                                    z6.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                    z6.d().a("OpenTelemetry-Agent");
                                }
                                if (value.equals("sentry.java.opentelemetry.agentless")) {
                                    z6.d().a("OpenTelemetry-Agentless");
                                }
                                if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                    z6.d().a("OpenTelemetry-Agentless-Spring");
                                }
                            }
                            if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                                z6.d().b(value4, value2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (g1VarA != null) {
                    g1VarA.close();
                }
                this.f95101a = true;
            } catch (Throwable th4) {
                if (g1VarA != null) {
                    try {
                        g1VarA.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (IOException unused2) {
        } catch (Throwable th6) {
            this.f95101a = true;
            throw th6;
        }
        this.f95101a = true;
    }
}
