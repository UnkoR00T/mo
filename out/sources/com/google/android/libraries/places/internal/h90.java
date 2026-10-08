package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes4.dex */
final class h90 {
    public static List a(Class cls, Iterator it, zj.w wVar, g90 g90Var) {
        if (!(it instanceof ListIterator)) {
            if (b(cls.getClassLoader())) {
                Iterable<Class> iterable = (Iterable) wVar.get();
                ArrayList arrayList = new ArrayList();
                for (Class cls2 : iterable) {
                    Object objNewInstance = null;
                    try {
                        objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                    } catch (ClassCastException unused) {
                    } catch (Throwable th4) {
                        throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th4), th4);
                    }
                    if (objNewInstance != null) {
                        arrayList.add(objNewInstance);
                    }
                }
                it = arrayList.iterator();
            } else if (!it.hasNext()) {
                it = ServiceLoader.load(cls).iterator();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (it.hasNext()) {
            Object next = it.next();
            g90Var.c(next);
            arrayList2.add(next);
        }
        Collections.sort(arrayList2, Collections.reverseOrder(new f90(g90Var)));
        return Collections.unmodifiableList(arrayList2);
    }

    static boolean b(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
