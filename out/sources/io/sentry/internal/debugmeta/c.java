package io.sentry.internal.debugmeta;

import io.sentry.b7;
import io.sentry.util.d;
import io.sentry.v0;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f95107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f95108b;

    public c(v0 v0Var) {
        this(v0Var, c.class.getClassLoader());
    }

    @Override // io.sentry.internal.debugmeta.a
    public List<Properties> a() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f95108b.getResources(d.f95796a);
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    InputStream inputStreamOpenStream = urlNextElement.openStream();
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        this.f95107a.c(b7.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (Throwable th4) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (RuntimeException e15) {
                    this.f95107a.a(b7.ERROR, e15, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (IOException e16) {
            this.f95107a.a(b7.ERROR, e16, "Failed to load %s", d.f95796a);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        this.f95107a.c(b7.INFO, "No %s file was found.", d.f95796a);
        return null;
    }

    c(v0 v0Var, ClassLoader classLoader) {
        this.f95107a = v0Var;
        this.f95108b = io.sentry.util.b.a(classLoader);
    }
}
