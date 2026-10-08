package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.y1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
abstract class j2<T extends y1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f31102a = Logger.getLogger(t1.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f31103b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    j2() {
    }

    static <T extends y1> T b(Class<T> cls) {
        String str;
        ClassLoader classLoader = j2.class.getClassLoader();
        if (cls.equals(y1.class)) {
            str = f31103b;
        } else {
            if (!cls.getPackage().equals(j2.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return cls.cast(((j2) Class.forName(str, true, classLoader).getConstructor(null).newInstance(null)).a());
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(e16);
                }
            } catch (InstantiationException e17) {
                throw new IllegalStateException(e17);
            } catch (NoSuchMethodException e18) {
                throw new IllegalStateException(e18);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(j2.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((j2) it.next()).a()));
                } catch (ServiceConfigurationError e19) {
                    Logger logger = f31102a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e19);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e25) {
                throw new IllegalStateException(e25);
            } catch (NoSuchMethodException e26) {
                throw new IllegalStateException(e26);
            } catch (InvocationTargetException e27) {
                throw new IllegalStateException(e27);
            }
        }
    }

    protected abstract T a();
}
