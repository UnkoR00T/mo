package y;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f222445a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, WeakReference<Context>> f222446b = new HashMap();

    private static class a {
        static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        static String b(Context context) {
            return context.getAttributionTag();
        }
    }

    private static class b {
        static Context a(Context context, int i15) {
            return context.createDeviceContext(i15);
        }

        static int b(Context context) {
            return context.getDeviceId();
        }
    }

    public static Application a(Context context) {
        for (Context applicationContext = context.getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                return (Application) applicationContext;
            }
        }
        return null;
    }

    private static String b(Context context) {
        return String.format("%d-%d-%s", Integer.valueOf(context.getApplicationContext().hashCode()), Integer.valueOf(e(context)), Build.VERSION.SDK_INT >= 30 ? a.b(context) : null);
    }

    private static Context c(String str) {
        Map<String, WeakReference<Context>> map = f222446b;
        WeakReference<Context> weakReference = map.get(str);
        if (weakReference == null) {
            return null;
        }
        Context context = weakReference.get();
        if (context != null) {
            return context;
        }
        map.remove(str);
        return null;
    }

    public static int d() {
        return 0;
    }

    public static int e(Context context) {
        return Build.VERSION.SDK_INT >= 34 ? b.b(context) : d();
    }

    public static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        String strB = b(context);
        synchronized (f222445a) {
            try {
                Context contextC = c(strB);
                if (contextC != null) {
                    return contextC;
                }
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 34) {
                    applicationContext = b.a(applicationContext, b.b(context));
                }
                if (i15 >= 30) {
                    String strB2 = a.b(context);
                    if (!Objects.equals(strB2, a.b(applicationContext))) {
                        applicationContext = a.a(applicationContext, strB2);
                    }
                }
                f222446b.put(strB, new WeakReference<>(applicationContext));
                return applicationContext;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
