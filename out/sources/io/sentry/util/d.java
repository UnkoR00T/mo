package io.sentry.util;

import io.sentry.b7;
import io.sentry.q7;
import io.sentry.z6;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f95796a = "sentry-debug-meta.properties";

    public static void a(q7 q7Var, List<Properties> list) {
        if (list != null) {
            e(q7Var, list);
            b(q7Var, list);
        }
    }

    private static void b(q7 q7Var, List<Properties> list) {
        for (Properties properties : list) {
            String strF = f(properties);
            if (strF != null) {
                String strG = g(properties);
                if (strG == null) {
                    strG = "unknown";
                }
                q7Var.getLogger().c(b7.DEBUG, "Build tool found: %s, version %s", strF, strG);
                z6.d().b(strF, strG);
                return;
            }
        }
    }

    private static void c(q7 q7Var, List<Properties> list) {
        if (q7Var.getBundleIds().isEmpty()) {
            Iterator<Properties> it = list.iterator();
            while (it.hasNext()) {
                String property = it.next().getProperty("io.sentry.bundle-ids");
                q7Var.getLogger().c(b7.DEBUG, "Bundle IDs found: %s", property);
                if (property != null) {
                    for (String str : property.split(",", -1)) {
                        q7Var.addBundleId(str);
                    }
                }
            }
        }
    }

    private static void d(q7 q7Var, List<Properties> list) {
        if (q7Var.getProguardUuid() == null) {
            Iterator<Properties> it = list.iterator();
            while (it.hasNext()) {
                String strH = h(it.next());
                if (strH != null) {
                    q7Var.getLogger().c(b7.DEBUG, "Proguard UUID found: %s", strH);
                    q7Var.setProguardUuid(strH);
                    return;
                }
            }
        }
    }

    public static void e(q7 q7Var, List<Properties> list) {
        if (list != null) {
            c(q7Var, list);
            d(q7Var, list);
        }
    }

    public static String f(Properties properties) {
        return properties.getProperty("io.sentry.build-tool");
    }

    public static String g(Properties properties) {
        return properties.getProperty("io.sentry.build-tool-version");
    }

    public static String h(Properties properties) {
        return properties.getProperty("io.sentry.ProguardUuids");
    }
}
