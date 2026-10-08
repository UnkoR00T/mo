package w5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import x5.p;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f210252a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<d, SparseArray<c>> f210253b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f210254c = new Object();

    static class a {
        static Drawable a(Resources resources, int i15, Resources.Theme theme) {
            return resources.getDrawable(i15, theme);
        }

        static Drawable b(Resources resources, int i15, int i16, Resources.Theme theme) {
            return resources.getDrawableForDensity(i15, i16, theme);
        }
    }

    static class b {
        static ColorStateList a(Resources resources, int i15, Resources.Theme theme) {
            return resources.getColorStateList(i15, theme);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ColorStateList f210255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Configuration f210256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f210257c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f210255a = colorStateList;
            this.f210256b = configuration;
            this.f210257c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Resources f210258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Resources.Theme f210259b;

        d(Resources resources, Resources.Theme theme) {
            this.f210258a = resources;
            this.f210259b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f210258a.equals(dVar.f210258a) && i6.c.a(this.f210259b, dVar.f210259b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return i6.c.b(this.f210258a, this.f210259b);
        }
    }

    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i15, Handler handler) {
            e(handler).post(new Runnable() { // from class: w5.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f210265a.f(i15);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: w5.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f210263a.g(typeface);
                }
            });
        }

        public abstract void f(int i15);

        public abstract void g(Typeface typeface);
    }

    public static final class f {

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Object f210260a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static Method f210261b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static boolean f210262c;

            @SuppressLint({"BanUncheckedReflection"})
            static void a(Resources.Theme theme) {
                synchronized (f210260a) {
                    if (!f210262c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f210261b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        f210262c = true;
                    }
                    Method method = f210261b;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            f210261b = null;
                        }
                    }
                }
            }
        }

        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i15, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f210254c) {
            try {
                WeakHashMap<d, SparseArray<c>> weakHashMap = f210253b;
                SparseArray<c> sparseArray = weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i15, new c(colorStateList, dVar.f210258a.getConfiguration(), theme));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f210257c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList b(w5.h.d r5, int r6) {
        /*
            java.lang.Object r0 = w5.h.f210254c
            monitor-enter(r0)
            java.util.WeakHashMap<w5.h$d, android.util.SparseArray<w5.h$c>> r1 = w5.h.f210253b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            w5.h$c r2 = (w5.h.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f210256b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f210258a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f210259b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f210257c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f210257c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f210255a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.h.b(w5.h$d, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i15) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i15, new TypedValue(), 0, null, null, false, true);
    }

    public static ColorStateList d(Resources resources, int i15, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList colorStateListB = b(dVar, i15);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListK = k(resources, i15, theme);
        if (colorStateListK == null) {
            return b.a(resources, i15, theme);
        }
        a(dVar, i15, colorStateListK, theme);
        return colorStateListK;
    }

    public static Drawable e(Resources resources, int i15, Resources.Theme theme) {
        return a.a(resources, i15, theme);
    }

    public static Drawable f(Resources resources, int i15, int i16, Resources.Theme theme) {
        return a.b(resources, i15, i16, theme);
    }

    public static Typeface g(Context context, int i15) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i15, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface h(Context context, int i15, TypedValue typedValue, int i16, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i15, typedValue, i16, eVar, null, true, false);
    }

    public static void i(Context context, int i15, e eVar, Handler handler) {
        i6.i.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            m(context, i15, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    private static TypedValue j() {
        ThreadLocal<TypedValue> threadLocal = f210252a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList k(Resources resources, int i15, Resources.Theme theme) {
        if (l(resources, i15)) {
            return null;
        }
        try {
            return w5.c.a(resources, resources.getXml(i15), theme);
        } catch (Exception e15) {
            c2.h("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e15);
            return null;
        }
    }

    private static boolean l(Resources resources, int i15) {
        TypedValue typedValueJ = j();
        resources.getValue(i15, typedValueJ, true);
        int i16 = typedValueJ.type;
        return i16 >= 28 && i16 <= 31;
    }

    private static Typeface m(Context context, int i15, TypedValue typedValue, int i16, e eVar, Handler handler, boolean z15, boolean z16) {
        Resources resources = context.getResources();
        resources.getValue(i15, typedValue, true);
        Typeface typefaceN = n(context, resources, typedValue, i15, i16, eVar, handler, z15, z16);
        if (typefaceN != null || eVar != null || z16) {
            return typefaceN;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i15) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    private static Typeface n(Context context, Resources resources, TypedValue typedValue, int i15, int i16, e eVar, Handler handler, boolean z15, boolean z16) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i15) + "\" (" + Integer.toHexString(i15) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (eVar != null) {
                eVar.c(-3, handler);
            }
            return null;
        }
        Typeface typefaceG = p.g(resources, i15, string, typedValue.assetCookie, i16);
        if (typefaceG != null) {
            if (eVar != null) {
                eVar.d(typefaceG, handler);
            }
            return typefaceG;
        }
        if (z16) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceE = p.e(context, resources, i15, string, typedValue.assetCookie, i16);
                if (eVar != null) {
                    if (typefaceE != null) {
                        eVar.d(typefaceE, handler);
                        return typefaceE;
                    }
                    eVar.c(-3, handler);
                }
                return typefaceE;
            }
            w5.e.b bVarB = w5.e.b(resources.getXml(i15), resources);
            if (bVarB == null) {
                c2.e("ResourcesCompat", "Failed to find font-family tag");
                if (eVar != null) {
                    eVar.c(-3, handler);
                }
                return null;
            }
            try {
                return p.d(context, bVarB, resources, i15, string, typedValue.assetCookie, i16, eVar, handler, z15);
            } catch (IOException e15) {
                e = e15;
                string = string;
                c2.f("ResourcesCompat", "Failed to read xml resource " + string, e);
                if (eVar != null) {
                    eVar.c(-3, handler);
                }
                return null;
            } catch (XmlPullParserException e16) {
                e = e16;
                string = string;
                c2.f("ResourcesCompat", "Failed to parse xml resource " + string, e);
                if (eVar != null) {
                    eVar.c(-3, handler);
                }
                return null;
            }
        } catch (IOException e17) {
            e = e17;
        } catch (XmlPullParserException e18) {
            e = e18;
        }
    }
}
