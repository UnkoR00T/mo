package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;
import r0.l1;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l1<ClassLoader, l1<String, Class<?>>> f12662a = new l1<>();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return o.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        l1<ClassLoader, l1<String, Class<?>>> l1Var = f12662a;
        l1<String, Class<?>> l1Var2 = l1Var.get(classLoader);
        if (l1Var2 == null) {
            l1Var2 = new l1<>();
            l1Var.put(classLoader, l1Var2);
        }
        Class<?> cls = l1Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        l1Var2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends o> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e15) {
            throw new o.h("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e15);
        } catch (ClassNotFoundException e16) {
            throw new o.h("Unable to instantiate fragment " + str + ": make sure class name exists", e16);
        }
    }

    public o a(ClassLoader classLoader, String str) {
        try {
            return d(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e15) {
            throw new o.h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e15);
        } catch (InstantiationException e16) {
            throw new o.h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e16);
        } catch (NoSuchMethodException e17) {
            throw new o.h("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e17);
        } catch (InvocationTargetException e18) {
            throw new o.h("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e18);
        }
    }
}
