package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tv {
    static lv b(Class cls) {
        String str;
        ClassLoader classLoader = tv.class.getClassLoader();
        if (cls.equals(lv.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(tv.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return (lv) cls.cast(((tv) Class.forName(str, true, classLoader).getConstructor(null).newInstance(null)).a());
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
            Iterator it = ServiceLoader.load(tv.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((lv) cls.cast(((tv) it.next()).a()));
                } catch (ServiceConfigurationError e19) {
                    Logger.getLogger(gv.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e19);
                }
            }
            if (arrayList.size() == 1) {
                return (lv) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (lv) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e25) {
                throw new IllegalStateException(e25);
            } catch (NoSuchMethodException e26) {
                throw new IllegalStateException(e26);
            } catch (InvocationTargetException e27) {
                throw new IllegalStateException(e27);
            }
        }
    }

    protected abstract lv a();
}
