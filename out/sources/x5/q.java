package x5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import io.sentry.android.core.c2;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class q extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Class<?> f216826b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Constructor<?> f216827c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f216828d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f216829e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f216830f = false;

    q() {
    }

    private static boolean h(Object obj, String str, int i15, boolean z15) throws NoSuchMethodException {
        j();
        try {
            return ((Boolean) f216828d.invoke(obj, str, Integer.valueOf(i15), Boolean.valueOf(z15))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e15) {
            throw new RuntimeException(e15);
        }
    }

    private static Typeface i(Object obj) throws NoSuchMethodException {
        j();
        try {
            Object objNewInstance = Array.newInstance(f216826b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f216829e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e15) {
            throw new RuntimeException(e15);
        }
    }

    private static void j() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f216830f) {
            return;
        }
        f216830f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e15) {
            c2.f("TypefaceCompatApi21Impl", e15.getClass().getName(), e15);
            method = null;
            cls = null;
            method2 = null;
        }
        f216827c = constructor;
        f216826b = cls;
        f216828d = method2;
        f216829e = method;
    }

    private static Object k() throws NoSuchMethodException {
        j();
        try {
            return f216827c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e15) {
            throw new RuntimeException(e15);
        }
    }

    @Override // x5.v
    public Typeface a(Context context, w5.e.c cVar, Resources resources, int i15) throws NoSuchMethodException {
        Object objK = k();
        for (w5.e.d dVar : cVar.a()) {
            File fileD = w.d(context);
            if (fileD == null) {
                return null;
            }
            try {
                if (!w.b(fileD, resources, dVar.b())) {
                    return null;
                }
                if (!h(objK, fileD.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                fileD.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileD.delete();
            }
        }
        return i(objK);
    }
}
